package ar.gov.rosario.administracionweb.ws.ubicacion.client;


import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import org.apache.axis.AxisFault;
import org.apache.log4j.Logger;

import ar.gov.rosario.administracionweb.utils.ContextProperties;



public class AccesoWS {
	
	static private UbicacionSoapBindingStub accesoWS=null;
	
	static private Logger log = Logger.getLogger(AccesoWS.class);
	
	static {
		try {
			if (accesoWS==null)
				accesoWS=new UbicacionSoapBindingStub(new URL(ContextProperties.getProperty("wsUbicacion")), null); 
		} catch (AxisFault e) {
			log.error(e);
		} catch (MalformedURLException e) {
			log.error(e);
		}
	}

	
	static public void main(String args[]) throws RemoteException, MalformedURLException{
		/*
		Calle c=accesoWS.getCalle(61150);
		System.out.println("--->"+c.getNombre());
		Calle c1=accesoWS.getCalle(61150);
		System.out.println("--->"+c1.getNombre());
		ar.gov.rosario.administracionweb.ws.ubicacion.model.Direccion d = accesoWS.getDireccion(61150, 714, false, null);
		System.out.println("--->"+d.getCalle().getNombre()+"-"+d.getPuntoX()+"-"+d.getPuntoY());
		*/
	} 
	
	static public ar.gov.rosario.administracionweb.ws.ubicacion.model.Calle[] getCalles(String calle) throws RemoteException {
		return accesoWS.getCalles(calle);
	}
	static public ar.gov.rosario.administracionweb.ws.ubicacion.model.Calle getCalle(long idCalle) throws RemoteException{
		return accesoWS.getCalle(idCalle);
	}
	static public ar.gov.rosario.administracionweb.ws.ubicacion.model.Direccion[] getDirecciones(String calle, int altura, boolean bis, String letra) throws RemoteException{
		return accesoWS.getDirecciones(calle, altura, bis, letra);
	}
	static public ar.gov.rosario.administracionweb.ws.ubicacion.model.Direccion getDireccion(long idCalle, int altura, boolean bis, String letra) throws RemoteException{
		return accesoWS.getDireccion(idCalle, altura, bis, letra);
	}
	static public ar.gov.rosario.administracionweb.ws.ubicacion.model.Interseccion[] getIntersecciones(String calle1, String calle2) throws RemoteException{
		return accesoWS.getIntersecciones(calle1, calle2);
	}

}
