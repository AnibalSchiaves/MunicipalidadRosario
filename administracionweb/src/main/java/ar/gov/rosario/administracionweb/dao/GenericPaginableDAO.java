package ar.gov.rosario.administracionweb.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericPaginableDAO<T, ID extends Serializable> extends GenericDAO<T, ID> {
	 
	List<T> findAll(int page, int pageSize);
	
	
	 
}
