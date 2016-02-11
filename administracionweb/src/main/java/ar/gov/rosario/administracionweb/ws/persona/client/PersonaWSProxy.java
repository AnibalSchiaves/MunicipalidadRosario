package ar.gov.rosario.administracionweb.ws.persona.client;

import ar.gov.rosario.administracionweb.ws.persona.model.SociedadIntegrante;

public class PersonaWSProxy implements ar.gov.rosario.administracionweb.ws.persona.client.PersonaWS {
  private String _endpoint = null;
  private ar.gov.rosario.administracionweb.ws.persona.client.PersonaWS personaWS = null;
  
  public PersonaWSProxy() {
    _initPersonaWSProxy();
  }
  
  public PersonaWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initPersonaWSProxy();
  }
  
  private void _initPersonaWSProxy() {
    try {
      personaWS = (new ar.gov.rosario.administracionweb.ws.persona.client.PersonaWSServiceLocator()).getpersona();
      if (personaWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)personaWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)personaWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (personaWS != null)
      ((javax.xml.rpc.Stub)personaWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ar.gov.rosario.administracionweb.ws.persona.client.PersonaWS getPersonaWS() {
    if (personaWS == null)
      _initPersonaWSProxy();
    return personaWS;
  }
  
  public ar.gov.rosario.administracionweb.ws.persona.model.ResBusPersonaFisica getPersonaFisica(int in0, int in1, java.lang.String in2, int in3, int in4, java.lang.String in5) throws java.rmi.RemoteException{
    if (personaWS == null)
      _initPersonaWSProxy();
    return personaWS.getPersonaFisica(in0, in1, in2, in3, in4, in5);
  }
  
  public ar.gov.rosario.administracionweb.ws.persona.model.ResBusPersonaFisica getPersonaFisica(java.lang.String in0, java.lang.String in1, java.lang.String in2, int in3, int in4, java.lang.String in5) throws java.rmi.RemoteException{
    if (personaWS == null)
      _initPersonaWSProxy();
    return personaWS.getPersonaFisica(in0, in1, in2, in3, in4, in5);
  }
  
  public ar.gov.rosario.administracionweb.ws.persona.model.PersonaFisica[] getPersonaFisica(java.lang.String in0, int in1, int in2, int in3, java.lang.String in4) throws java.rmi.RemoteException{
    if (personaWS == null)
      _initPersonaWSProxy();
    return personaWS.getPersonaFisica(in0, in1, in2, in3, in4);
  }
  
  public ar.gov.rosario.administracionweb.ws.persona.model.PersonaJuridica[] getPersonaJuridica(java.lang.String in0, int in1, int in2, int in3, java.lang.String in4) throws java.rmi.RemoteException{
    if (personaWS == null)
      _initPersonaWSProxy();
    return personaWS.getPersonaJuridica(in0, in1, in2, in3, in4);
  }
  
  public ar.gov.rosario.administracionweb.ws.persona.model.ResBusPersonaJuridica getPersonaJuridica(java.lang.String in0, int in1, int in2, java.lang.String in3) throws java.rmi.RemoteException{
    if (personaWS == null)
      _initPersonaWSProxy();
    return personaWS.getPersonaJuridica(in0, in1, in2, in3);
  }
  
  public ar.gov.rosario.administracionweb.ws.persona.model.Persona[] getPersona(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException{
    if (personaWS == null)
      _initPersonaWSProxy();
    return personaWS.getPersona(in0, in1);
  }
  
  public ar.gov.rosario.administracionweb.ws.persona.model.Persona[] getPersona(java.lang.String in0, int in1, int in2, int in3, java.lang.String in4) throws java.rmi.RemoteException{
    if (personaWS == null)
      _initPersonaWSProxy();
    return personaWS.getPersona(in0, in1, in2, in3, in4);
  }
  
  public ar.gov.rosario.administracionweb.ws.persona.model.Persona getPersona(int in0, java.lang.String in1) throws java.rmi.RemoteException{
    if (personaWS == null)
      _initPersonaWSProxy();
    return personaWS.getPersona(in0, in1);
  }
  
  public ar.gov.rosario.administracionweb.ws.persona.model.Contacto[] getContactos(int in0, java.lang.String in1) throws java.rmi.RemoteException{
    if (personaWS == null)
      _initPersonaWSProxy();
    return personaWS.getContactos(in0, in1);
  }
  
  public ar.gov.rosario.administracionweb.ws.persona.model.PersonaExtendida getPersonaExtendida(int in0, java.lang.String in1) throws java.rmi.RemoteException{
    if (personaWS == null)
      _initPersonaWSProxy();
    return personaWS.getPersonaExtendida(in0, in1);
  }
  
  public boolean setContactos(ar.gov.rosario.administracionweb.ws.persona.model.Contacto[] in0, int in1, java.lang.String in2) throws java.rmi.RemoteException{
    if (personaWS == null)
      _initPersonaWSProxy();
    return personaWS.setContactos(in0, in1, in2);
  }
  
  public boolean setPersonaExtendida(ar.gov.rosario.administracionweb.ws.persona.model.PersonaExtendida in0, int in1, java.lang.String in2) throws java.rmi.RemoteException{
    if (personaWS == null)
      _initPersonaWSProxy();
    return personaWS.setPersonaExtendida(in0, in1, in2);
  }
  
  public ar.gov.rosario.administracionweb.ws.persona.model.Operacion setPersona(ar.gov.rosario.administracionweb.ws.persona.model.Persona in0, java.lang.String in1) throws java.rmi.RemoteException{
    if (personaWS == null)
      _initPersonaWSProxy();
    return personaWS.setPersona(in0, in1);
  }
  
  public ar.gov.rosario.administracionweb.ws.persona.model.DocumentoTipo[] getAllDocumentoTipo(java.lang.String in0) throws java.rmi.RemoteException{
    if (personaWS == null)
      _initPersonaWSProxy();
    return personaWS.getAllDocumentoTipo(in0);
  }
  
  public ar.gov.rosario.administracionweb.ws.persona.model.SociedadTipo[] getAllSociedadTipo(java.lang.String in0) throws java.rmi.RemoteException{
    if (personaWS == null)
      _initPersonaWSProxy();
    return personaWS.getAllSociedadTipo(in0);
  }
  
  public ar.gov.rosario.administracionweb.ws.persona.model.EstadoCivil[] getAllEstadoCivil(java.lang.String in0) throws java.rmi.RemoteException{
    if (personaWS == null)
      _initPersonaWSProxy();
    return personaWS.getAllEstadoCivil(in0);
  }
  
  public ar.gov.rosario.administracionweb.ws.persona.model.Pais[] getAllPais(java.lang.String in0) throws java.rmi.RemoteException{
    if (personaWS == null)
      _initPersonaWSProxy();
    return personaWS.getAllPais(in0);
  }
  
  public ar.gov.rosario.administracionweb.ws.persona.model.Localidad[] getLocalidades(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException{
    if (personaWS == null)
      _initPersonaWSProxy();
    return personaWS.getLocalidades(in0, in1);
  }
  
  public ar.gov.rosario.administracionweb.ws.persona.model.Localidad getLocalidad(int in0, int in1, java.lang.String in2) throws java.rmi.RemoteException{
    if (personaWS == null)
      _initPersonaWSProxy();
    return personaWS.getLocalidad(in0, in1, in2);
  }


  public ar.gov.rosario.administracionweb.ws.persona.model.SociedadIntegrante[] getSociedadIntegrantes(String in0, int in1, int in2, int in3, String in4) throws java.rmi.RemoteException{
		
	  return personaWS.getSociedadIntegrantes(in0, in1, in2, in3, in4);
  }


  public boolean setSociedadIntegrantes(String in0, int in1, int in2, int in3, SociedadIntegrante[] in4, String in5)  throws java.rmi.RemoteException{
	
	  return personaWS.setSociedadIntegrantes(in0, in1, in2, in3, in4, in5);
	
  }
  
  
}