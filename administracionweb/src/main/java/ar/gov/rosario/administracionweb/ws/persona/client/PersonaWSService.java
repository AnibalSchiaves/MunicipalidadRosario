/**
 * PersonaWSService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.gov.rosario.administracionweb.ws.persona.client;

public interface PersonaWSService extends javax.xml.rpc.Service {
    public java.lang.String getpersonaAddress();

    public ar.gov.rosario.administracionweb.ws.persona.client.PersonaWS getpersona() throws javax.xml.rpc.ServiceException;

    public ar.gov.rosario.administracionweb.ws.persona.client.PersonaWS getpersona(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
