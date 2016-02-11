package ar.gov.rosario.administracionweb.core;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import ar.gov.rosario.administracionweb.dao.ExampleDAO;
import ar.gov.rosario.administracionweb.model.Example;


@Service("exampleManager")
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ExampleManager  extends AbmManager<Example, Integer>{
	
	
	@Autowired
	private Mapper mapper;
	

	
	public ExampleDAO getDao() {
		return (ExampleDAO)super.getDao();
	}
	
	@Autowired
	public void setDao(ExampleDAO dao) {
		super.setDao(dao);
	}
}
