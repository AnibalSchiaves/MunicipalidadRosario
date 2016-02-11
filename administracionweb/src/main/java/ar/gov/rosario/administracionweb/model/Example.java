package ar.gov.rosario.administracionweb.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * The persistent class for the examples database table.
 * 
 */
@Entity
@Table(name="examples")
public class Example implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}
	

}