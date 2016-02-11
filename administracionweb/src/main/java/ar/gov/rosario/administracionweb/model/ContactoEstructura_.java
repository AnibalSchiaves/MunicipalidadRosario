package ar.gov.rosario.administracionweb.model;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-02-02T13:59:04.532-0300")
@StaticMetamodel(ContactoEstructura.class)
public class ContactoEstructura_ extends Entidad_ {
	public static volatile SingularAttribute<ContactoEstructura, Integer> id;
	public static volatile SingularAttribute<ContactoEstructura, String> nombre;
	public static volatile SingularAttribute<ContactoEstructura, String> email;
	public static volatile SingularAttribute<ContactoEstructura, Timestamp> fechaHora;
}
