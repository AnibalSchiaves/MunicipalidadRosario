package ar.gov.rosario.administracionweb.model;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-02-01T12:49:06.046-0300")
@StaticMetamodel(EstructuraTipo.class)
public class EstructuraTipo_ extends Entidad_ {
	public static volatile SingularAttribute<EstructuraTipo, Integer> id;
	public static volatile SingularAttribute<EstructuraTipo, String> descripcion;
	public static volatile SingularAttribute<EstructuraTipo, String> descCorta;
	public static volatile SingularAttribute<EstructuraTipo, Timestamp> fechaHora;
}
