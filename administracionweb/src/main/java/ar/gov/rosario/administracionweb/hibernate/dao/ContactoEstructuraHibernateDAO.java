package ar.gov.rosario.administracionweb.hibernate.dao;

import org.springframework.stereotype.Repository;

import ar.gov.rosario.administracionweb.dao.ContactoEstructuraDAO;
import ar.gov.rosario.administracionweb.model.ContactoEstructura;

@Repository("contactoEstructuraHibernateDAO")
public class ContactoEstructuraHibernateDAO extends
		GenericHibernateDAO<ContactoEstructura, Integer> implements ContactoEstructuraDAO{

	@Override
	public boolean registrosRelacionados(ContactoEstructura e) {
		return false;
	}

}
