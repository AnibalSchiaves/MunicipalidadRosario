package ar.gov.rosario.administracionweb.form;

public class ABMForm {
	
	public static String ALTA = "alta";
	public static String EDICION = "edicion";
	public static String ELIMINACION = "eliminacion";
	public static String CONSULTA = "consulta";
	
	private String modo;

	public String getModo() {
		return modo;
	}

	public void setModo(String modo) {
		this.modo = modo;
	}
	
}
