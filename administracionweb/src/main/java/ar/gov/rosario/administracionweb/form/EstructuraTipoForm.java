package ar.gov.rosario.administracionweb.form;


public class EstructuraTipoForm extends ABMForm {
	
	private Integer id; 
	
	private String descripcion; 
	
	private String descCorta;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescCorta() {
		return descCorta;
	}

	public void setDescCorta(String descCorta) {
		this.descCorta = descCorta;
	}

}
