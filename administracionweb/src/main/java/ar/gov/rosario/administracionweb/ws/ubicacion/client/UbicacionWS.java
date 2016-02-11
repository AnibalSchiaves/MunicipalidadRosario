/**
 * UbicacionWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package ar.gov.rosario.administracionweb.ws.ubicacion.client;

import ar.gov.rosario.administracionweb.ws.ubicacion.model.*;

public interface UbicacionWS extends java.rmi.Remote {
    public Calle[] getCalles(java.lang.String in0) throws java.rmi.RemoteException;
    public Calle getCalle(long in0) throws java.rmi.RemoteException;
    public Direccion[] getDirecciones(java.lang.String in0, int in1, boolean in2, java.lang.String in3) throws java.rmi.RemoteException;
    public Direccion getDireccion(long in0, int in1, boolean in2, java.lang.String in3) throws java.rmi.RemoteException;
    public Interseccion[] getIntersecciones(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException;
}
