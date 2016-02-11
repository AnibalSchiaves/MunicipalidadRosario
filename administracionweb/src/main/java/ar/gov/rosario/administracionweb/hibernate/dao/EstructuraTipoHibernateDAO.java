package ar.gov.rosario.administracionweb.hibernate.dao;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import ar.gov.rosario.administracionweb.dao.EstructuraTipoDAO;
import ar.gov.rosario.administracionweb.model.EstructuraTipo;

@Repository("estructuraTipoHibernateDAO")
public class EstructuraTipoHibernateDAO extends GenericHibernateDAO<EstructuraTipo, Integer>
		implements EstructuraTipoDAO {

	@Override
	public List<EstructuraTipo> findAllOrderByDescripcion() {
		Criteria criteria = this.getCriteria();
		criteria.addOrder(Order.asc("descripcion"));
		return criteria.list();
	}

	@Override
	public boolean registrosRelacionados(EstructuraTipo e) {
		//IMPLMENTAR CUANDO SE ARME LA CLASE ESTRUCTURA
		return false;
	}

	
}
