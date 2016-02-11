/**
 * PersonaWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package ar.gov.rosario.administracionweb.ws.persona.client;

public interface PersonaWS extends java.rmi.Remote {
    public ar.gov.rosario.administracionweb.ws.persona.model.ResBusPersonaFisica getPersonaFisica(java.lang.String in0, java.lang.String in1, java.lang.String in2, int in3, int in4, java.lang.String in5) throws java.rmi.RemoteException;
    public ar.gov.rosario.administracionweb.ws.persona.model.PersonaFisica[] getPersonaFisica(java.lang.String in0, int in1, int in2, int in3, java.lang.String in4) throws java.rmi.RemoteException;
    public ar.gov.rosario.administracionweb.ws.persona.model.ResBusPersonaFisica getPersonaFisica(int in0, int in1, java.lang.String in2, int in3, int in4, java.lang.String in5) throws java.rmi.RemoteException;
    public ar.gov.rosario.administracionweb.ws.persona.model.ResBusPersonaJuridica getPersonaJuridica(java.lang.String in0, int in1, int in2, java.lang.String in3) throws java.rmi.RemoteException;
    public ar.gov.rosario.administracionweb.ws.persona.model.PersonaJuridica[] getPersonaJuridica(java.lang.String in0, int in1, int in2, int in3, java.lang.String in4) throws java.rmi.RemoteException;
    public ar.gov.rosario.administracionweb.ws.persona.model.Persona[] getPersona(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException;
    public ar.gov.rosario.administracionweb.ws.persona.model.Persona[] getPersona(java.lang.String in0, int in1, int in2, int in3, java.lang.String in4) throws java.rmi.RemoteException;
    public ar.gov.rosario.administracionweb.ws.persona.model.Persona getPersona(int in0, java.lang.String in1) throws java.rmi.RemoteException;
    public ar.gov.rosario.administracionweb.ws.persona.model.Contacto[] getContactos(int in0, java.lang.String in1) throws java.rmi.RemoteException;
    public ar.gov.rosario.administracionweb.ws.persona.model.SociedadIntegrante[] getSociedadIntegrantes(java.lang.String in0, int in1, int in2, int in3, java.lang.String in4) throws java.rmi.RemoteException;
    public ar.gov.rosario.administracionweb.ws.persona.model.PersonaExtendida getPersonaExtendida(int in0, java.lang.String in1) throws java.rmi.RemoteException;
    public boolean setContactos(ar.gov.rosario.administracionweb.ws.persona.model.Contacto[] in0, int in1, java.lang.String in2) throws java.rmi.RemoteException;
    public boolean setSociedadIntegrantes(java.lang.String in0, int in1, int in2, int in3, ar.gov.rosario.administracionweb.ws.persona.model.SociedadIntegrante[] in4, java.lang.String in5) throws java.rmi.RemoteException;
    public boolean setPersonaExtendida(ar.gov.rosario.administracionweb.ws.persona.model.PersonaExtendida in0, int in1, java.lang.String in2) throws java.rmi.RemoteException;
    public ar.gov.rosario.administracionweb.ws.persona.model.Operacion setPersona(ar.gov.rosario.administracionweb.ws.persona.model.Persona in0, java.lang.String in1) throws java.rmi.RemoteException;
    public ar.gov.rosario.administracionweb.ws.persona.model.DocumentoTipo[] getAllDocumentoTipo(java.lang.String in0) throws java.rmi.RemoteException;
    public ar.gov.rosario.administracionweb.ws.persona.model.SociedadTipo[] getAllSociedadTipo(java.lang.String in0) throws java.rmi.RemoteException;
    public ar.gov.rosario.administracionweb.ws.persona.model.EstadoCivil[] getAllEstadoCivil(java.lang.String in0) throws java.rmi.RemoteException;
    public ar.gov.rosario.administracionweb.ws.persona.model.Pais[] getAllPais(java.lang.String in0) throws java.rmi.RemoteException;
    public ar.gov.rosario.administracionweb.ws.persona.model.Localidad[] getLocalidades(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException;
    public ar.gov.rosario.administracionweb.ws.persona.model.Localidad getLocalidad(int in0, int in1, java.lang.String in2) throws java.rmi.RemoteException;
}
