package ar.gov.rosario.administracionweb.hibernate.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;

import ar.gov.rosario.administracionweb.dao.GenericPaginableDAO;



public class GenericPaginableHibernateDAO<T, ID extends Serializable> 
		extends GenericHibernateDAO<T, ID> 
		implements GenericPaginableDAO<T, ID>{
	
	public List<T> findAll(int page, int pageSize) {
		return findByCriteria(page, pageSize);
	}
	
	@SuppressWarnings("unchecked")
	protected List<T> findByCriteria(int page, int pageSize, Criterion... criterion) {
		Criteria crit = getSessionFactory().getCurrentSession().createCriteria(getPersistentClass());
		
		crit.setFirstResult(page * pageSize);
		crit.setMaxResults(pageSize);
		
		for (Criterion c : criterion) {
			crit.add(c);
		}
		return crit.list();
	}
	
	protected List<T> findByCriteria(int page, int pageSize, List<Order> orden, Criterion... criterion) {
		Criteria crit = getSessionFactory().getCurrentSession().createCriteria(getPersistentClass());
		
		crit.setFirstResult(page * pageSize);
		crit.setMaxResults(pageSize);
		
		for (Criterion c : criterion) {
			crit.add(c);
		}
		
		if (orden!=null)
			for (Order o : orden) {
				crit.addOrder(o);
			}
		return crit.list();
	}
}
