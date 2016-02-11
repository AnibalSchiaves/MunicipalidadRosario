package ar.gov.rosario.administracionweb.dao;


import java.util.List;

import ar.gov.rosario.administracionweb.model.EstructuraTipo;

public interface EstructuraTipoDAO extends GenericDAO<EstructuraTipo, Integer>{
	
	public List<EstructuraTipo> findAllOrderByDescripcion();
	
	public boolean registrosRelacionados(EstructuraTipo e);
	
}
