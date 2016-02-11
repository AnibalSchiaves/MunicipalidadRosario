package ar.gov.rosario.administracionweb.core;

import java.io.Serializable;
import java.util.List;

import ar.gov.rosario.administracionweb.dao.GenericDAO;





public abstract class AbmManager<T, ID extends Serializable> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7282928141444971281L;

	private T instancia; 
	
	private GenericDAO<T, ID> dao;

	public List<T> selectAll() {
		return dao.findAll();
	}
	
	public void setDao(GenericDAO<T, ID> dao) {
		this.dao = dao;
	}

	public GenericDAO<T, ID> getDao() {
		return dao;
	}
	
	public void delete(T e) {
		dao.makeTransient(e);
	}
	
	public void save(T e) {
		dao.makePersistent(e);
	}

	public void setInstancia(T instancia) {
		this.instancia = instancia;
	}

	public T getInstancia() {
		return instancia;
	}
	
	public T selectById(ID id) {
		return getDao().findById(id, false);
	}
}
