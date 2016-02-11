package ar.gov.rosario.administracionweb.core;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import ar.gov.rosario.administracionweb.ws.ubicacion.client.AccesoWS;
import ar.gov.rosario.administracionweb.ws.ubicacion.model.Calle;
import ar.gov.rosario.administracionweb.ws.ubicacion.model.Direccion;

@Service("domicilioManager")
public class DomicilioManager {

	private static Logger log = Logger.getLogger(DomicilioManager.class);

	

	
	public List<Calle> getAllCalle(String nombre) {
		List<Calle> list = new ArrayList<Calle>();
		try {
			Calle[] calleList;
			calleList = AccesoWS.getCalles(nombre);
			
			if (calleList != null) {

				list = Arrays.asList(calleList);
//				list = new ArrayList<Calle>(Arrays.asList(calleList));
			}
		} catch (RemoteException e) {
			log.error(e.getMessage(), e);
		}
		return list;
	}
	
	public Calle getCalle(int id) {
		Calle calle = null;
		
		try {
			calle = AccesoWS.getCalle(id);
		} catch (RemoteException e) {
			log.error(e.getMessage(), e);
		}
		return calle;
	}
	
	public List<Direccion> getDirecciones(String calle, int altura, boolean bis, String letra) {
		List<Direccion> list = new ArrayList<Direccion>();
		try {
			Direccion[] direccionList;
			direccionList = AccesoWS.getDirecciones(calle, altura, bis, letra);
			
			if (direccionList != null) {

				list = Arrays.asList(direccionList);
//				list = new ArrayList<Calle>(Arrays.asList(calleList));
			}
		} catch (RemoteException e) {
			log.error(e.getMessage(), e);
		}
		return list;
	}
	

	
}
