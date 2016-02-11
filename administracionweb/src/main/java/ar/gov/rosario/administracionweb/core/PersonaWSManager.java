package ar.gov.rosario.administracionweb.core;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import ar.gov.rosario.administracionweb.model.Cuit;
import ar.gov.rosario.administracionweb.ws.persona.client.AccesoWS;
import ar.gov.rosario.administracionweb.ws.persona.model.Contacto;
import ar.gov.rosario.administracionweb.ws.persona.model.Direccion;
import ar.gov.rosario.administracionweb.ws.persona.model.DocumentoTipo;
import ar.gov.rosario.administracionweb.ws.persona.model.EstadoCivil;
import ar.gov.rosario.administracionweb.ws.persona.model.Localidad;
import ar.gov.rosario.administracionweb.ws.persona.model.Operacion;
import ar.gov.rosario.administracionweb.ws.persona.model.Pais;
import ar.gov.rosario.administracionweb.ws.persona.model.Persona;
import ar.gov.rosario.administracionweb.ws.persona.model.PersonaFisica;
import ar.gov.rosario.administracionweb.ws.persona.model.PersonaJuridica;
import ar.gov.rosario.administracionweb.ws.persona.model.SociedadIntegrante;
import ar.gov.rosario.administracionweb.ws.persona.model.SociedadTipo;
import ar.gov.rosario.administracionweb.ws.ubicacion.model.Calle;




@Service("personaWSManager")
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class PersonaWSManager {

	private static Logger log = Logger.getLogger(PersonaWSManager.class);

	
	private String wsHibernateServer = "sede1";
	
	private Map<Cuit, Persona> personaCache = new HashMap<Cuit, Persona>() {
		@Override
		public Persona get(Object obj) {
			Cuit cuit = (Cuit)obj;
			Persona persona = super.get(cuit);
			if (persona == null) {
				persona = getPersona(cuit.getCuit01(), cuit.getCuit02(),cuit.getCuit03());
				if (persona != null) {
					super.put(cuit, persona);
				}
			} 
			return persona;
		}
		
		
	};
	
	private Map<Integer, Calle> calleCache = new HashMap<Integer, Calle>() {
		@Override
		public Calle get(Object obj) {
			Integer cod = (Integer)obj;
			Calle calle = super.get(cod);
			if (calle == null) {
				calle = getCalle(cod);
				super.put(cod, calle);
			} 
			return calle;
		}
	};
	
	
	public List<DocumentoTipo> getAllDocumentoTipo() {
		ArrayList<DocumentoTipo> list = new ArrayList<DocumentoTipo>();

		try {
			DocumentoTipo[] tiposDoc;
			tiposDoc = AccesoWS.getAllDocumentoTipo(wsHibernateServer);

			if (tiposDoc != null)
				list = new ArrayList<DocumentoTipo>(Arrays.asList(tiposDoc));
		} catch (RemoteException e) {
			log.error(e.getMessage(), e);
		}
		return list;
	}

	public List<Pais> getAllPais() {
		ArrayList<Pais> list = new ArrayList<Pais>();
		
		try {
			Pais[] paisList;
			paisList = AccesoWS.getAllPais(wsHibernateServer);
			
			if (paisList != null)
				list = new ArrayList<Pais>(Arrays.asList(paisList));
		} catch (RemoteException e) {
			log.error(e.getMessage(), e);
		}
		return list;
	}

	public List<EstadoCivil> getAllEstadoCivil() {
		ArrayList<EstadoCivil> list = new ArrayList<EstadoCivil>();
		
		try {
			EstadoCivil[] estadoCivilList;
			estadoCivilList = AccesoWS.getAllEstadoCivil(wsHibernateServer);
			
			if (estadoCivilList != null)
				list = new ArrayList<EstadoCivil>(Arrays.asList(estadoCivilList));
		} catch (RemoteException e) {
			log.error(e.getMessage(), e);
		}
		return list;
	}

	public List<Localidad> getAllLocalidad(String nombre) {
		ArrayList<Localidad> list = new ArrayList<Localidad>();
		
		try {
			Localidad[] localidadList;
			localidadList = ar.gov.rosario.administracionweb.ws.persona.client.AccesoWS.getLocalidades(nombre, wsHibernateServer);
			
			if (localidadList != null)
				list = new ArrayList<Localidad>(Arrays.asList(localidadList));
		} catch (RemoteException e) {
			log.error(e.getMessage(), e);
		}
		return list;
	}

	public List<Contacto> getAllContacto(int idPersona) {
		ArrayList<Contacto> list = new ArrayList<Contacto>();

		try {
			Contacto[] contactoList;
			contactoList = AccesoWS.getContactos(idPersona, wsHibernateServer);
			
			if (contactoList != null)
				list = new ArrayList<Contacto>(Arrays.asList(contactoList));
		} catch (RemoteException e) {
			log.error(e.getMessage(), e);
		}
		return list;
	}

	public Localidad getLocalidad(int subPostal, int codPostal) {
		Localidad ret = null;
		try {
			ret = AccesoWS.getLocalidad(subPostal, codPostal, wsHibernateServer);
		} catch (RemoteException e) {
			log.error("Error en getLocalidad", e);
		}
		return ret;
	}
	
	public Calle getCalle(int codCalle) {
		Calle ret = null;
		try {
			ret = ar.gov.rosario.administracionweb.ws.ubicacion.client.AccesoWS.getCalle(codCalle);
		} catch (RemoteException e) {
			log.error("Error en getLocalidad", e);
		}
		return ret;
	}
	

	
	
	public DocumentoTipo getTipoDoc(Integer idTipoDoc) {
		
		for (DocumentoTipo dt : getAllDocumentoTipo()) {
			
			if (dt.getId().intValue() == idTipoDoc) {
				return dt;
			}
		}
		return null;
	}
	
	public SociedadTipo getTipoSociedad(Integer idTipoSoc) {
		
		for (SociedadTipo st : getAllSociedadTipo()) {
			
			if (st.getId() == idTipoSoc) {
				return st;
			}
		}
		return null;
	}

	public PersonaFisica getPersonaFisica(int cuit01, int cuit02, int cuit03) {
		PersonaFisica ret = null;
		try {
			PersonaFisica[] pfs = AccesoWS.getPersonaFisica("R", cuit01, cuit02, cuit03, wsHibernateServer);
			
			if ( ObjectUtils.isEmpty(pfs) )
				pfs = AccesoWS.getPersonaFisica("C", cuit01, cuit02, cuit03, wsHibernateServer);
			if (!ObjectUtils.isEmpty(pfs) )
				ret = pfs[0];
		} catch (RemoteException e) {
			log.error("Error en getPersonaWS", e);
		}
		if (ret != null) {
			switchBisGet(ret);
		}
		return ret;
	}
	
	
	

	public PersonaJuridica getPersonaJuridica(int cuit01, int cuit02, int cuit03) {
		PersonaJuridica ret = null;
		try {
			PersonaJuridica[] pjs = AccesoWS.getPersonaJuridica("R", cuit01, cuit02, cuit03, wsHibernateServer);

			if ( ObjectUtils.isEmpty(pjs) )
				pjs = AccesoWS.getPersonaJuridica("C", cuit01, cuit02, cuit03, wsHibernateServer);
			if ( !ObjectUtils.isEmpty(pjs) )
				ret = pjs[0];
		} catch (RemoteException e) {
			log.error("Error en getPersonaWS", e);
		}
		if (ret != null) {
			switchBisGet(ret);
		}
		return ret;
	}
	
	
	public Persona getPersona(int cuit01, int cuit02, int cuit03) {
		Persona ret = null;
		if (cuit01 <= 27) {
			ret = getPersonaFisica(cuit01, cuit02, cuit03);
		} else {
			ret = getPersonaJuridica(cuit01, cuit02, cuit03);
		}
	
		return ret;
		
	}
	
	
	

	/*
	 * public static ResBus buscar(CriteriosPersona criterioPers, int index, int
	 * cant) { ResBusPersonaFisica r=null; ResBus ret = new ResBus(); try { if
	 * (criterioPers.getApellido()!=null){ r =
	 * AccesoWS.getPersonaFisica(criterioPers.getApellido(),
	 * criterioPers.getNombre(), criterioPers.getSexo(), index, cant,
	 * hibernateServer) ;
	 * 
	 * }else if(criterioPers.getNroDoc()!=null){ r =
	 * AccesoWS.getPersonaFisica(criterioPers.getIdTipoDoc().intValue(),
	 * criterioPers.getNroDoc().intValue(), criterioPers.getSexo(), index, cant,
	 * hibernateServer) ; } ret.setRespuesta(Arrays.asList(r.getRespuesta()));
	 * ret.setTotal(r.getTotal()); }catch (RemoteException e) {
	 * log.error("Error en buscar", e); //throw new InfrastructureException(e);
	 * } return ret;
	 * 
	 * }
	 */

	public Persona getPersonaWS(int idPersona) {
		Persona ret = null;
		try {

			ret = AccesoWS.getPersona(idPersona, wsHibernateServer);

		} catch (RemoteException e) {
			log.error("Error en getPersonaWS", e);
		}
		if (ret != null) {
			switchBisGet(ret);
		}
		return ret;
	}
	
	public List<Persona> getSociedadIntegrantes(String cuit00, int cuit01, int cuit02, int cuit03) {
		
		ArrayList<Persona> list = new ArrayList<Persona>();
		try {
			SociedadIntegrante[] ret = null;
			ret = AccesoWS.getSociedadIntegrantes(cuit00, cuit01, cuit02, cuit03, wsHibernateServer);
			for (SociedadIntegrante i : ret) {
				Persona p = getPersonaFromCache(new Cuit(i.getCuit().getCuit00().charAt(0),i.getCuit().getCuit01(), i.getCuit().getCuit02().intValue(), i.getCuit().getCuit03()));
				if (p != null) { 
					list.add(p);
				}
				//list.add(getPersonaFisica(i.getCuit().getCuit01(), i.getCuit().getCuit02().intValue(), i.getCuit().getCuit03()));
			}
			

		} catch (RemoteException e) {
			log.error("Error en getSociedadIntegrantes", e);
		}
		return list;
	}




	public Operacion save(Persona persona) {
		try {
			persona.setUsuario("web");
			persona.setFechaHora(Calendar.getInstance());
			if (persona.getIdPersona().getCuit00() == null) { 
				persona.getIdPersona().setCuit00("R");
			}			
			switchBisSave(persona);
			checkCalle(persona);
			checkFechas(persona);
			Operacion res = AccesoWS.setPersona(persona, wsHibernateServer);
			if (!res.isResultado()) {
				log.error("Error en guardar: " + persona.toString() + " " + res.getMensaje());
			}
			switchBisSave(persona);
			if (persona.getId() == 0 && res.isResultado()){
				Persona[] personas = AccesoWS.getPersona(persona.getIdPersona().getCuit00(),
						(int)persona.getIdPersona().getCuit01(), persona.getIdPersona().getCuit02().intValue(), (int)persona.getIdPersona().getCuit03(), wsHibernateServer);
				if (persona != null) {
					persona.setId(personas[0].getId());
				}
			}
		} catch (RemoteException e) {
			log.error("Error en guardar: " + persona.toString(), e);
			throw new RuntimeException(e);
		}
		return null;

	}

	private void checkFechas(Persona persona) {
		
		if (persona instanceof PersonaFisica) {
			if (((PersonaFisica)persona).getNacimiento() != null) {
				((PersonaFisica)persona).getNacimiento().add(Calendar.HOUR, 12);
			}
		}
		if (persona instanceof PersonaJuridica) {
			if (((PersonaJuridica)persona).getFechaInscripcion() != null) {
				((PersonaJuridica)persona).getFechaInscripcion().add(Calendar.HOUR,12);
			}
		}
		
		
	}

	private void checkCalle(Persona persona) {
		Direccion d = null;
		if (persona instanceof PersonaFisica) {
			d = ((PersonaFisica)persona).getDomicilioDeclarado();
		}
		if (persona instanceof PersonaJuridica) {
			d = ((PersonaJuridica)persona).getDomicilioLegal();				
		}
		if (d.getLocalidad().getIdLocalidad().getCodPostal() != 2000) {
			d.setCalle(null);
		}
		
	}

	private void switchBisSave(Persona persona) {
		Direccion d = null;
		if (persona instanceof PersonaFisica) {
			d = ((PersonaFisica)persona).getDomicilioDeclarado();
		}
		if (persona instanceof PersonaJuridica) {
			d = ((PersonaJuridica)persona).getDomicilioLegal();		
			
		}
		if (d != null && d.isBis()){
			d.setNumero(d.getNumero() * -1);
		}
		
	}
	private void switchBisGet(Persona persona) {
		Direccion d = null;
		if (persona instanceof PersonaFisica) {
			d = ((PersonaFisica)persona).getDomicilioDeclarado();		
			
		}
		if (persona instanceof PersonaJuridica) {
			d = ((PersonaJuridica)persona).getDomicilioLegal();		
			
		}
		if (d != null && d.getNumero() != null && d.getNumero() < 0){
			d.setNumero(d.getNumero() * -1);
			d.setBis(true);
		}
		
	}
	

	public boolean saveContactos(Contacto[] contactos, int idPersona) {
		try {
			return AccesoWS.setContactos(contactos, idPersona, wsHibernateServer);
		} catch (RemoteException e) {
			log.error("Error en guardarContactos", e);
			// throw new InfrastructureException(e);
			return false;
		}

	}
	public boolean saveIntegrantesSociedad(String cuit00, int cuit01, int cuit02,  int cuit03, List<SociedadIntegrante> integrantes) {
		try {
			return AccesoWS.setSociedadIntegrantes(cuit00, cuit01, cuit02, cuit03, integrantes.toArray(new SociedadIntegrante[]{}) , wsHibernateServer);
		} catch (RemoteException e) {
			log.error("Error en guardarContactos", e);
			// throw new InfrastructureException(e);
			return false;
		}

	}


	public List<SociedadTipo> getAllSociedadTipo() {
//		return new ArrayList<SociedadTipo>();
		ArrayList<SociedadTipo> list = new ArrayList<SociedadTipo>();
		
		try {
			SociedadTipo[] sociedadTipoList;
			sociedadTipoList = AccesoWS.getAllSociedadTipo(wsHibernateServer);
			
			if (sociedadTipoList != null)
				list = new ArrayList<SociedadTipo>(Arrays.asList(sociedadTipoList));
		} catch (RemoteException e) {
			log.error(e.getMessage(), e);
		}
		return list;
	}

	public Persona getPersonaFromCache(Cuit cuit) {
		return personaCache.get(cuit);
	}
	
	public void addToPersonaCache(Cuit cuit, Persona p) {
		personaCache.put(cuit, p);
	}
	
	public Collection<Persona> getAllPersonasFromCache() {
		return personaCache.values();
	}
	public void clearCache() {
		personaCache.clear();
	}
	

	
	public Calle getCalleFromCache(Integer cod) {
		return calleCache.get(cod);
	}
	
	public String getNombreCalleFromCache(Integer cod) {
		Calle calle = calleCache.get(cod);
		
		return calle.getNombre();
	}


//	public Pais getPais(Collection paisesDisp, Integer idNacionalidad) {
//		Iterator i = paisesDisp.iterator();
//		while (i.hasNext()) {
//			Pais p = (Pais) i.next();
//			if (idNacionalidad.longValue() == p.getId())
//				return p;
//		}
//		return null;
//	}

//	public EstadoCivil getEstadoCivil(Collection<EstadoCivil> estadosDisp, Integer id) {
//		Iterator i = estadosDisp.iterator();
//		while (i.hasNext()) {
//			EstadoCivil p = (EstadoCivil) i.next();
//			if (id.longValue() == p.getId())
//				return p;
//		}
//		return null;
//	}

//	public DocumentoTipo getTipoDoc(Long idTipoDoc) {
//
//		return getTipoDoc(getTiposDoc(), idTipoDoc);
//	}

}
