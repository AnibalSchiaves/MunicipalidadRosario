package ar.gov.rosario.administracionweb.dao;

import ar.gov.rosario.administracionweb.model.ContactoEstructura;

public interface ContactoEstructuraDAO extends GenericDAO<ContactoEstructura, Integer>{

	boolean registrosRelacionados(ContactoEstructura e);

}
