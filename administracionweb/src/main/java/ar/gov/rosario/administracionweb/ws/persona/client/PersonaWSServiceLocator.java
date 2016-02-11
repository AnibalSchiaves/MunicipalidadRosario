/**
 * PersonaWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.gov.rosario.administracionweb.ws.persona.client;

public class PersonaWSServiceLocator extends org.apache.axis.client.Service implements ar.gov.rosario.administracionweb.ws.persona.client.PersonaWSService {

    public PersonaWSServiceLocator() {
    }


    public PersonaWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PersonaWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for persona
    private java.lang.String persona_address = "http://websrv1-test.pm.rosario.gov.ar/axis/services/persona";

    public java.lang.String getpersonaAddress() {
        return persona_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String personaWSDDServiceName = "persona";

    public java.lang.String getpersonaWSDDServiceName() {
        return personaWSDDServiceName;
    }

    public void setpersonaWSDDServiceName(java.lang.String name) {
        personaWSDDServiceName = name;
    }

    public ar.gov.rosario.administracionweb.ws.persona.client.PersonaWS getpersona() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(persona_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getpersona(endpoint);
    }

    public ar.gov.rosario.administracionweb.ws.persona.client.PersonaWS getpersona(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ar.gov.rosario.administracionweb.ws.persona.client.PersonaSoapBindingStub _stub = new ar.gov.rosario.administracionweb.ws.persona.client.PersonaSoapBindingStub(portAddress, this);
            _stub.setPortName(getpersonaWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setpersonaEndpointAddress(java.lang.String address) {
        persona_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ar.gov.rosario.administracionweb.ws.persona.client.PersonaWS.class.isAssignableFrom(serviceEndpointInterface)) {
                ar.gov.rosario.administracionweb.ws.persona.client.PersonaSoapBindingStub _stub = new ar.gov.rosario.administracionweb.ws.persona.client.PersonaSoapBindingStub(new java.net.URL(persona_address), this);
                _stub.setPortName(getpersonaWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("persona".equals(inputPortName)) {
            return getpersona();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:wsSOAP.persona", "PersonaWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:wsSOAP.persona", "persona"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("persona".equals(portName)) {
            setpersonaEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
