package ar.gov.rosario.administracionweb.hibernate.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.LockOptions;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;

import ar.gov.rosario.administracionweb.dao.GenericDAO;




public abstract class GenericHibernateDAO<T, ID extends Serializable>
		implements GenericDAO<T, ID> {

	private Class<T> persistentClass;
	
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public GenericHibernateDAO() {
		this.persistentClass = 
			(Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected SessionFactory getSessionFactory() {
		return this.sessionFactory;
	}
    
	public Class<T> getPersistentClass() {
		return persistentClass;
	}

	@SuppressWarnings("unchecked")
	public T findById(ID id, boolean lock) {
		T entity;
		if (lock)
			entity = (T) this.sessionFactory.getCurrentSession().get(getPersistentClass(), id, LockOptions.UPGRADE);
		else
			entity = (T) this.sessionFactory.getCurrentSession().get(getPersistentClass(), id);

		return entity;
	}

	public List<T> findAll() {
		return findByCriteria();
	}
	
	

	@SuppressWarnings("unchecked")
    public List<T> findByExample(T exampleInstance, String... excludeProperty) {
        Criteria crit = this.sessionFactory.getCurrentSession().createCriteria(getPersistentClass());
        Example example =  Example.create(exampleInstance);
        for (String exclude : excludeProperty) {
            example.excludeProperty(exclude);
        }
        crit.add(example);
        return crit.list();
    }

	public T save(T entity) {
		this.sessionFactory.getCurrentSession().save(entity);
		return entity;
	}

	public T makePersistent(T entity) {
		this.sessionFactory.getCurrentSession().saveOrUpdate(entity);
		return entity;
	}

	public void makeTransient(T entity) {
		this.sessionFactory.getCurrentSession().delete(entity);
	}

	public void flush() {
		this.sessionFactory.getCurrentSession().flush();
	}

	public void clear() {
		this.sessionFactory.getCurrentSession().clear();
	}

	/**
	 * Use this inside subclasses as a convenience method.
	 */
	@SuppressWarnings("unchecked")
	protected List<T> findByCriteria(Criterion... criterion) {
		Criteria crit = this.sessionFactory.getCurrentSession().createCriteria(getPersistentClass());
		for (Criterion c : criterion) {
			crit.add(c);
		}
		return crit.list();
	}
	
		
	protected Criteria getCriteria() {
		return this.sessionFactory.getCurrentSession().createCriteria(getPersistentClass());
	}

}
