/**
 * UbicacionWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package ar.gov.rosario.administracionweb.ws.ubicacion.client;

public class UbicacionWSServiceLocator extends org.apache.axis.client.Service implements UbicacionWSService {

    // Use to get a proxy class for ubicacion
    private final java.lang.String ubicacion_address = "http://isof5.pm.rosario.gov.ar:8080/axis/services/ubicacion";

    public java.lang.String getubicacionAddress() {
        return ubicacion_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ubicacionWSDDServiceName = "ubicacion";

    public java.lang.String getubicacionWSDDServiceName() {
        return ubicacionWSDDServiceName;
    }

    public void setubicacionWSDDServiceName(java.lang.String name) {
        ubicacionWSDDServiceName = name;
    }

    public UbicacionWS getubicacion() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ubicacion_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getubicacion(endpoint);
    }

    public UbicacionWS getubicacion(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            UbicacionSoapBindingStub _stub = new UbicacionSoapBindingStub(portAddress, this);
            _stub.setPortName(getubicacionWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (UbicacionWS.class.isAssignableFrom(serviceEndpointInterface)) {
                UbicacionSoapBindingStub _stub = new UbicacionSoapBindingStub(new java.net.URL(ubicacion_address), this);
                _stub.setPortName(getubicacionWSDDServiceName());
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
        String inputPortName = portName.getLocalPart();
        if ("ubicacion".equals(inputPortName)) {
            return getubicacion();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:wsSOAP.ubicacion", "UbicacionWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("ubicacion"));
        }
        return ports.iterator();
    }

}
