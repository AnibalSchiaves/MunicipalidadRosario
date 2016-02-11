package ar.gov.rosario.administracionweb.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Entidad {
	
	@Column(name="usuario")
    private String usuario; 

	public String getUsuario() {        
        return usuario;
    } // end getUsuario        

    public void setUsuario(String _usuario) {        
        usuario = _usuario;
    } // end setUsuario        

    

}
