package ar.gov.rosario.administracionweb.ws.persona.client;


import java.net.MalformedURLException;
import java.net.URL;

import org.apache.axis.AxisFault;
import org.apache.log4j.Logger;

import ar.gov.rosario.administracionweb.utils.ContextProperties;
import ar.gov.rosario.administracionweb.ws.persona.model.Contacto;
import ar.gov.rosario.administracionweb.ws.persona.model.DocumentoTipo;
import ar.gov.rosario.administracionweb.ws.persona.model.EstadoCivil;
import ar.gov.rosario.administracionweb.ws.persona.model.Localidad;
import ar.gov.rosario.administracionweb.ws.persona.model.Operacion;
import ar.gov.rosario.administracionweb.ws.persona.model.Pais;
import ar.gov.rosario.administracionweb.ws.persona.model.Persona;
import ar.gov.rosario.administracionweb.ws.persona.model.PersonaExtendida;
import ar.gov.rosario.administracionweb.ws.persona.model.PersonaFisica;
import ar.gov.rosario.administracionweb.ws.persona.model.PersonaJuridica;
import ar.gov.rosario.administracionweb.ws.persona.model.ResBusPersonaFisica;
import ar.gov.rosario.administracionweb.ws.persona.model.ResBusPersonaJuridica;
import ar.gov.rosario.administracionweb.ws.persona.model.SociedadIntegrante;
import ar.gov.rosario.administracionweb.ws.persona.model.SociedadTipo;

public class AccesoWS {
	
	static private PersonaSoapBindingStub accesoWS=null;
	
	static private Logger log = Logger.getLogger(AccesoWS.class);
	
	static {
		try {
			if (accesoWS==null)
				accesoWS=new PersonaSoapBindingStub(new URL(ContextProperties.getProperty("wsPersona")), null); 
		} catch (AxisFault e) {
			log.error(e);
		} catch (MalformedURLException e) {
			log.error(e);
		}
	}
    static public ResBusPersonaFisica getPersonaFisica(String apellido, String nombre, String sexo, int first, int max, String dataSource) throws java.rmi.RemoteException{
    	return accesoWS.getPersonaFisica( apellido,  nombre,  sexo, first, max, dataSource);
    }
    static public PersonaFisica[] getPersonaFisica(String cuit00, int cuit01, int cuit02, int cuit03, String dataSource) throws java.rmi.RemoteException{
    	return accesoWS.getPersonaFisica( cuit00,  cuit01,  cuit02, cuit03, dataSource);
    }
    static public ResBusPersonaFisica getPersonaFisica(int tipoDoc, int nroDoc, String sexo, int first, int max, String dataSource) throws java.rmi.RemoteException{
    	return accesoWS.getPersonaFisica( tipoDoc,  nroDoc,  sexo, first, max,dataSource);
    }
    static public ResBusPersonaJuridica getPersonaJuridica(String razonSocial, int first, int max, String dataSource) throws java.rmi.RemoteException{
    	return accesoWS.getPersonaJuridica( razonSocial, first, max, dataSource);
    }
    static public PersonaJuridica[] getPersonaJuridica(String cuit00, int cuit01, int cuit02, int cuit03, String dataSource) throws java.rmi.RemoteException{
    	return accesoWS.getPersonaJuridica( cuit00,  cuit01,  cuit02, cuit03, dataSource);
    }
    static public Persona[] getPersona(String razonSocialApellido, String dataSource) throws java.rmi.RemoteException{
    	return accesoWS.getPersona( razonSocialApellido,  dataSource);
    }
    static public Persona[] getPersona(String cuit00, int cuit01, int cuit02, int cuit03, String dataSource) throws java.rmi.RemoteException{
    	return accesoWS.getPersona( cuit00,  cuit01,  cuit02, cuit03, dataSource);
    }
    static public Contacto[] getContactos(int idPersona, String dataSource) throws java.rmi.RemoteException{
    	return accesoWS.getContactos( idPersona,  dataSource);
    }
    static public PersonaExtendida getPersonaExtendida(int idPersona, String dataSource) throws java.rmi.RemoteException{
    	return accesoWS.getPersonaExtendida( idPersona,  dataSource);
    }
    static public boolean setContactos(Contacto[] c, int idPersona, String dataSource) throws java.rmi.RemoteException{
    	return accesoWS.setContactos( c,  idPersona,  dataSource);
    }
    static public boolean setPersonaExtendida(PersonaExtendida pe, int idPersona, String dataSource) throws java.rmi.RemoteException{
    	return accesoWS.setPersonaExtendida( pe,  idPersona,  dataSource);
    }
    static public Operacion setPersona(Persona pWS, String dataSource) throws java.rmi.RemoteException{
    	return accesoWS.setPersona( pWS,  dataSource);
    }
    static public DocumentoTipo[] getAllDocumentoTipo(String dataSource) throws java.rmi.RemoteException{
    	return accesoWS.getAllDocumentoTipo( dataSource);
    }
    static public SociedadTipo[] getAllSociedadTipo(String dataSource) throws java.rmi.RemoteException{
    	return accesoWS.getAllSociedadTipo( dataSource);
    }    
    static public EstadoCivil[] getAllEstadoCivil(String dataSource) throws java.rmi.RemoteException{
    	return accesoWS.getAllEstadoCivil( dataSource);
    }
    static public Pais[] getAllPais(String dataSource) throws java.rmi.RemoteException{
    	return accesoWS.getAllPais( dataSource);
    }
    static public Localidad[] getLocalidades(String localidad, String dataSource) throws java.rmi.RemoteException{
    	return accesoWS.getLocalidades( localidad,  dataSource);
    }
    static public Localidad getLocalidad(int subPostal, int codPostal, String dataSource) throws java.rmi.RemoteException{
    	return accesoWS.getLocalidad( subPostal,  codPostal, dataSource);
    }
    static public Persona getPersona(int idPersona, String dataSource) throws java.rmi.RemoteException{
    	return accesoWS.getPersona( idPersona,  dataSource);
    }
    static public boolean setSociedadIntegrantes(java.lang.String cuit00, int cuit01, int cuit02, int cuit03, ar.gov.rosario.administracionweb.ws.persona.model.SociedadIntegrante[] integrantes, java.lang.String dataSource) throws java.rmi.RemoteException{
    	return accesoWS.setSociedadIntegrantes(cuit00, cuit01, cuit02, cuit03,  integrantes, dataSource);
    }
    static public SociedadIntegrante[] getSociedadIntegrantes(java.lang.String cuit00, int cuit01, int cuit02, int cuit03, java.lang.String dataSource) throws java.rmi.RemoteException{
    	return accesoWS.getSociedadIntegrantes(cuit00, cuit01, cuit02, cuit03, dataSource);
    }


}
