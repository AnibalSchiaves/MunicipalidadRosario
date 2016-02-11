package ar.gov.rosario.administracionweb.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.gov.rosario.administracionweb.dao.ContactoEstructuraDAO;
import ar.gov.rosario.administracionweb.model.ContactoEstructura;
import ar.gov.rosario.administracionweb.model.EstructuraTipo;

@Service("contactoEstructuraManager")
public class ContactoEstructuraManager extends AbmManager<ContactoEstructura, Integer> {
	
	public ContactoEstructuraDAO getDao() {
		return (ContactoEstructuraDAO)super.getDao();
	}
	
	@Autowired
	public void setDao(ContactoEstructuraDAO dao) {
		super.setDao(dao);
	}
	
	public boolean datosRelacionados(ContactoEstructura e) {
		return this.getDao().registrosRelacionados(e);
	}
	
}
