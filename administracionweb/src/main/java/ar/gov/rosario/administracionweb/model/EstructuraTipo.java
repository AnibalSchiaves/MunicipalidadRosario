package ar.gov.rosario.administracionweb.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Estructura_tipo")
public class EstructuraTipo extends Entidad{

  ///////////////////////////////////////
  // attributes

	@Id
	@Column(name="cod_estructura_tipo")
    private int id; 
	
	@Column(name="descripcion")
    private String descripcion; 
	
	@Column(name="desc_corta")
    private String descCorta; 
	
	@Column(name="fecha_hora")
    private Timestamp fechaHora; 



  ///////////////////////////////////////
  // operations


    public int getId() {        
        return id;
    } // end getId        

    public void setId(int _id) {        
        id = _id;
    } // end setId        

    public String getDescripcion() {        
        return descripcion;
    } // end getDescripcion        

    public void setDescripcion(String _descripcion) {        
        descripcion = _descripcion;
    } // end setDescripcion        

    public String getDescCorta() {        
        return descCorta;
    } // end getDescCorta        

    public void setDescCorta(String _descCorta) {        
        descCorta = _descCorta;
    } // end setDescCorta        

    public Timestamp getFechaHora() {        
        return fechaHora;
    } // end getFechaHora        

    public void setFechaHora(Timestamp _fechaHora) {        
        fechaHora = _fechaHora;
    } // end setFechaHora        

} // end EstructuraTipo



