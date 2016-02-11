package ar.gov.rosario.administracionweb.hibernate.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import ar.gov.rosario.administracionweb.dao.ExampleDAO;
import ar.gov.rosario.administracionweb.model.Example;


@Repository("exampleDAO")
public class ExampleHibernateDAO 
	extends GenericHibernateDAO<Example, Integer>
	implements ExampleDAO{

	
}
