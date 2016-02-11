/**
 * PersonaSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.gov.rosario.administracionweb.ws.persona.client;

public class PersonaSoapBindingStub extends org.apache.axis.client.Stub implements ar.gov.rosario.administracionweb.ws.persona.client.PersonaWS {

	
	 private java.util.Vector cachedSerClasses = new java.util.Vector();
	    private java.util.Vector cachedSerQNames = new java.util.Vector();
	    private java.util.Vector cachedSerFactories = new java.util.Vector();
	    private java.util.Vector cachedDeserFactories = new java.util.Vector();

	    static org.apache.axis.description.OperationDesc [] _operations;

	    static {
	        _operations = new org.apache.axis.description.OperationDesc[21];
	        _initOperationDesc1();
	        _initOperationDesc2();
	        _initOperationDesc3();
	    }

	    private static void _initOperationDesc1(){
	        org.apache.axis.description.OperationDesc oper;
	        org.apache.axis.description.ParameterDesc param;
	        oper = new org.apache.axis.description.OperationDesc();
	        oper.setName("getPersonaFisica");
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in5"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
	        oper.addParameter(param);
	        oper.setReturnType(new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "ResBusPersonaFisica"));
	        oper.setReturnClass(ar.gov.rosario.administracionweb.ws.persona.model.ResBusPersonaFisica.class);
	        oper.setReturnQName(new javax.xml.namespace.QName("", "getPersonaFisicaReturn"));
	        oper.setStyle(org.apache.axis.constants.Style.RPC);
	        oper.setUse(org.apache.axis.constants.Use.ENCODED);
	        _operations[0] = oper;

	        oper = new org.apache.axis.description.OperationDesc();
	        oper.setName("getPersonaFisica");
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
	        oper.addParameter(param);
	        oper.setReturnType(new javax.xml.namespace.QName("urn:wsSOAP.persona", "ArrayOf_tns2_PersonaFisica"));
	        oper.setReturnClass(ar.gov.rosario.administracionweb.ws.persona.model.PersonaFisica[].class);
	        oper.setReturnQName(new javax.xml.namespace.QName("", "getPersonaFisicaReturn"));
	        oper.setStyle(org.apache.axis.constants.Style.RPC);
	        oper.setUse(org.apache.axis.constants.Use.ENCODED);
	        _operations[1] = oper;

	        oper = new org.apache.axis.description.OperationDesc();
	        oper.setName("getPersonaFisica");
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in5"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
	        oper.addParameter(param);
	        oper.setReturnType(new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "ResBusPersonaFisica"));
	        oper.setReturnClass(ar.gov.rosario.administracionweb.ws.persona.model.ResBusPersonaFisica.class);
	        oper.setReturnQName(new javax.xml.namespace.QName("", "getPersonaFisicaReturn"));
	        oper.setStyle(org.apache.axis.constants.Style.RPC);
	        oper.setUse(org.apache.axis.constants.Use.ENCODED);
	        _operations[2] = oper;

	        oper = new org.apache.axis.description.OperationDesc();
	        oper.setName("getPersonaJuridica");
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
	        oper.addParameter(param);
	        oper.setReturnType(new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "ResBusPersonaJuridica"));
	        oper.setReturnClass(ar.gov.rosario.administracionweb.ws.persona.model.ResBusPersonaJuridica.class);
	        oper.setReturnQName(new javax.xml.namespace.QName("", "getPersonaJuridicaReturn"));
	        oper.setStyle(org.apache.axis.constants.Style.RPC);
	        oper.setUse(org.apache.axis.constants.Use.ENCODED);
	        _operations[3] = oper;

	        oper = new org.apache.axis.description.OperationDesc();
	        oper.setName("getPersonaJuridica");
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
	        oper.addParameter(param);
	        oper.setReturnType(new javax.xml.namespace.QName("urn:wsSOAP.persona", "ArrayOf_tns2_PersonaJuridica"));
	        oper.setReturnClass(ar.gov.rosario.administracionweb.ws.persona.model.PersonaJuridica[].class);
	        oper.setReturnQName(new javax.xml.namespace.QName("", "getPersonaJuridicaReturn"));
	        oper.setStyle(org.apache.axis.constants.Style.RPC);
	        oper.setUse(org.apache.axis.constants.Use.ENCODED);
	        _operations[4] = oper;

	        oper = new org.apache.axis.description.OperationDesc();
	        oper.setName("getPersona");
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
	        oper.addParameter(param);
	        oper.setReturnType(new javax.xml.namespace.QName("urn:wsSOAP.persona", "ArrayOf_tns2_Persona"));
	        oper.setReturnClass(ar.gov.rosario.administracionweb.ws.persona.model.Persona[].class);
	        oper.setReturnQName(new javax.xml.namespace.QName("", "getPersonaReturn"));
	        oper.setStyle(org.apache.axis.constants.Style.RPC);
	        oper.setUse(org.apache.axis.constants.Use.ENCODED);
	        _operations[5] = oper;

	        oper = new org.apache.axis.description.OperationDesc();
	        oper.setName("getPersona");
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
	        oper.addParameter(param);
	        oper.setReturnType(new javax.xml.namespace.QName("urn:wsSOAP.persona", "ArrayOf_tns2_Persona"));
	        oper.setReturnClass(ar.gov.rosario.administracionweb.ws.persona.model.Persona[].class);
	        oper.setReturnQName(new javax.xml.namespace.QName("", "getPersonaReturn"));
	        oper.setStyle(org.apache.axis.constants.Style.RPC);
	        oper.setUse(org.apache.axis.constants.Use.ENCODED);
	        _operations[6] = oper;

	        oper = new org.apache.axis.description.OperationDesc();
	        oper.setName("getPersona");
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
	        oper.addParameter(param);
	        oper.setReturnType(new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "Persona"));
	        oper.setReturnClass(ar.gov.rosario.administracionweb.ws.persona.model.Persona.class);
	        oper.setReturnQName(new javax.xml.namespace.QName("", "getPersonaReturn"));
	        oper.setStyle(org.apache.axis.constants.Style.RPC);
	        oper.setUse(org.apache.axis.constants.Use.ENCODED);
	        _operations[7] = oper;

	        oper = new org.apache.axis.description.OperationDesc();
	        oper.setName("getContactos");
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
	        oper.addParameter(param);
	        oper.setReturnType(new javax.xml.namespace.QName("urn:wsSOAP.persona", "ArrayOf_tns2_Contacto"));
	        oper.setReturnClass(ar.gov.rosario.administracionweb.ws.persona.model.Contacto[].class);
	        oper.setReturnQName(new javax.xml.namespace.QName("", "getContactosReturn"));
	        oper.setStyle(org.apache.axis.constants.Style.RPC);
	        oper.setUse(org.apache.axis.constants.Use.ENCODED);
	        _operations[8] = oper;

	        oper = new org.apache.axis.description.OperationDesc();
	        oper.setName("getSociedadIntegrantes");
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
	        oper.addParameter(param);
	        oper.setReturnType(new javax.xml.namespace.QName("urn:wsSOAP.persona", "ArrayOf_tns2_SociedadIntegrante"));
	        oper.setReturnClass(ar.gov.rosario.administracionweb.ws.persona.model.SociedadIntegrante[].class);
	        oper.setReturnQName(new javax.xml.namespace.QName("", "getSociedadIntegrantesReturn"));
	        oper.setStyle(org.apache.axis.constants.Style.RPC);
	        oper.setUse(org.apache.axis.constants.Use.ENCODED);
	        _operations[9] = oper;

	    }

	    private static void _initOperationDesc2(){
	        org.apache.axis.description.OperationDesc oper;
	        org.apache.axis.description.ParameterDesc param;
	        oper = new org.apache.axis.description.OperationDesc();
	        oper.setName("getPersonaExtendida");
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
	        oper.addParameter(param);
	        oper.setReturnType(new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "PersonaExtendida"));
	        oper.setReturnClass(ar.gov.rosario.administracionweb.ws.persona.model.PersonaExtendida.class);
	        oper.setReturnQName(new javax.xml.namespace.QName("", "getPersonaExtendidaReturn"));
	        oper.setStyle(org.apache.axis.constants.Style.RPC);
	        oper.setUse(org.apache.axis.constants.Use.ENCODED);
	        _operations[10] = oper;

	        oper = new org.apache.axis.description.OperationDesc();
	        oper.setName("setContactos");
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:wsSOAP.persona", "ArrayOf_tns2_Contacto"), ar.gov.rosario.administracionweb.ws.persona.model.Contacto[].class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
	        oper.addParameter(param);
	        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
	        oper.setReturnClass(boolean.class);
	        oper.setReturnQName(new javax.xml.namespace.QName("", "setContactosReturn"));
	        oper.setStyle(org.apache.axis.constants.Style.RPC);
	        oper.setUse(org.apache.axis.constants.Use.ENCODED);
	        _operations[11] = oper;

	        oper = new org.apache.axis.description.OperationDesc();
	        oper.setName("setSociedadIntegrantes");
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:wsSOAP.persona", "ArrayOf_tns2_SociedadIntegrante"), ar.gov.rosario.administracionweb.ws.persona.model.SociedadIntegrante[].class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in5"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
	        oper.addParameter(param);
	        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
	        oper.setReturnClass(boolean.class);
	        oper.setReturnQName(new javax.xml.namespace.QName("", "setSociedadIntegrantesReturn"));
	        oper.setStyle(org.apache.axis.constants.Style.RPC);
	        oper.setUse(org.apache.axis.constants.Use.ENCODED);
	        _operations[12] = oper;

	        oper = new org.apache.axis.description.OperationDesc();
	        oper.setName("setPersonaExtendida");
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "PersonaExtendida"), ar.gov.rosario.administracionweb.ws.persona.model.PersonaExtendida.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
	        oper.addParameter(param);
	        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
	        oper.setReturnClass(boolean.class);
	        oper.setReturnQName(new javax.xml.namespace.QName("", "setPersonaExtendidaReturn"));
	        oper.setStyle(org.apache.axis.constants.Style.RPC);
	        oper.setUse(org.apache.axis.constants.Use.ENCODED);
	        _operations[13] = oper;

	        oper = new org.apache.axis.description.OperationDesc();
	        oper.setName("setPersona");
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "Persona"), ar.gov.rosario.administracionweb.ws.persona.model.Persona.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
	        oper.addParameter(param);
	        oper.setReturnType(new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "Operacion"));
	        oper.setReturnClass(ar.gov.rosario.administracionweb.ws.persona.model.Operacion.class);
	        oper.setReturnQName(new javax.xml.namespace.QName("", "setPersonaReturn"));
	        oper.setStyle(org.apache.axis.constants.Style.RPC);
	        oper.setUse(org.apache.axis.constants.Use.ENCODED);
	        _operations[14] = oper;

	        oper = new org.apache.axis.description.OperationDesc();
	        oper.setName("getAllDocumentoTipo");
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
	        oper.addParameter(param);
	        oper.setReturnType(new javax.xml.namespace.QName("urn:wsSOAP.persona", "ArrayOf_tns2_DocumentoTipo"));
	        oper.setReturnClass(ar.gov.rosario.administracionweb.ws.persona.model.DocumentoTipo[].class);
	        oper.setReturnQName(new javax.xml.namespace.QName("", "getAllDocumentoTipoReturn"));
	        oper.setStyle(org.apache.axis.constants.Style.RPC);
	        oper.setUse(org.apache.axis.constants.Use.ENCODED);
	        _operations[15] = oper;

	        oper = new org.apache.axis.description.OperationDesc();
	        oper.setName("getAllSociedadTipo");
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
	        oper.addParameter(param);
	        oper.setReturnType(new javax.xml.namespace.QName("urn:wsSOAP.persona", "ArrayOf_tns2_SociedadTipo"));
	        oper.setReturnClass(ar.gov.rosario.administracionweb.ws.persona.model.SociedadTipo[].class);
	        oper.setReturnQName(new javax.xml.namespace.QName("", "getAllSociedadTipoReturn"));
	        oper.setStyle(org.apache.axis.constants.Style.RPC);
	        oper.setUse(org.apache.axis.constants.Use.ENCODED);
	        _operations[16] = oper;

	        oper = new org.apache.axis.description.OperationDesc();
	        oper.setName("getAllEstadoCivil");
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
	        oper.addParameter(param);
	        oper.setReturnType(new javax.xml.namespace.QName("urn:wsSOAP.persona", "ArrayOf_tns2_EstadoCivil"));
	        oper.setReturnClass(ar.gov.rosario.administracionweb.ws.persona.model.EstadoCivil[].class);
	        oper.setReturnQName(new javax.xml.namespace.QName("", "getAllEstadoCivilReturn"));
	        oper.setStyle(org.apache.axis.constants.Style.RPC);
	        oper.setUse(org.apache.axis.constants.Use.ENCODED);
	        _operations[17] = oper;

	        oper = new org.apache.axis.description.OperationDesc();
	        oper.setName("getAllPais");
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
	        oper.addParameter(param);
	        oper.setReturnType(new javax.xml.namespace.QName("urn:wsSOAP.persona", "ArrayOf_tns2_Pais"));
	        oper.setReturnClass(ar.gov.rosario.administracionweb.ws.persona.model.Pais[].class);
	        oper.setReturnQName(new javax.xml.namespace.QName("", "getAllPaisReturn"));
	        oper.setStyle(org.apache.axis.constants.Style.RPC);
	        oper.setUse(org.apache.axis.constants.Use.ENCODED);
	        _operations[18] = oper;

	        oper = new org.apache.axis.description.OperationDesc();
	        oper.setName("getLocalidades");
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
	        oper.addParameter(param);
	        oper.setReturnType(new javax.xml.namespace.QName("urn:wsSOAP.persona", "ArrayOf_tns2_Localidad"));
	        oper.setReturnClass(ar.gov.rosario.administracionweb.ws.persona.model.Localidad[].class);
	        oper.setReturnQName(new javax.xml.namespace.QName("", "getLocalidadesReturn"));
	        oper.setStyle(org.apache.axis.constants.Style.RPC);
	        oper.setUse(org.apache.axis.constants.Use.ENCODED);
	        _operations[19] = oper;

	    }

	    private static void _initOperationDesc3(){
	        org.apache.axis.description.OperationDesc oper;
	        org.apache.axis.description.ParameterDesc param;
	        oper = new org.apache.axis.description.OperationDesc();
	        oper.setName("getLocalidad");
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
	        oper.addParameter(param);
	        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
	        oper.addParameter(param);
	        oper.setReturnType(new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "Localidad"));
	        oper.setReturnClass(ar.gov.rosario.administracionweb.ws.persona.model.Localidad.class);
	        oper.setReturnQName(new javax.xml.namespace.QName("", "getLocalidadReturn"));
	        oper.setStyle(org.apache.axis.constants.Style.RPC);
	        oper.setUse(org.apache.axis.constants.Use.ENCODED);
	        _operations[20] = oper;

	    }

	    public PersonaSoapBindingStub() throws org.apache.axis.AxisFault {
	         this(null);
	    }

	    public PersonaSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
	         this(service);
	         super.cachedEndpoint = endpointURL;
	    }

	    public PersonaSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
	        if (service == null) {
	            super.service = new org.apache.axis.client.Service();
	        } else {
	            super.service = service;
	        }
	        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
	            java.lang.Class cls;
	            javax.xml.namespace.QName qName;
	            javax.xml.namespace.QName qName2;
	            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
	            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
	            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
	            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
	            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
	            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
	            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
	            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
	            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
	            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
	            qName = new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "Calle");
	            cachedSerQNames.add(qName);
	            cls = ar.gov.rosario.administracionweb.ws.persona.model.Calle.class;
	            cachedSerClasses.add(cls);
	            cachedSerFactories.add(beansf);
	            cachedDeserFactories.add(beandf);

	            qName = new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "Contacto");
	            cachedSerQNames.add(qName);
	            cls = ar.gov.rosario.administracionweb.ws.persona.model.Contacto.class;
	            cachedSerClasses.add(cls);
	            cachedSerFactories.add(beansf);
	            cachedDeserFactories.add(beandf);

	            qName = new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "Direccion");
	            cachedSerQNames.add(qName);
	            cls = ar.gov.rosario.administracionweb.ws.persona.model.Direccion.class;
	            cachedSerClasses.add(cls);
	            cachedSerFactories.add(beansf);
	            cachedDeserFactories.add(beandf);

	            qName = new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "Documento");
	            cachedSerQNames.add(qName);
	            cls = ar.gov.rosario.administracionweb.ws.persona.model.Documento.class;
	            cachedSerClasses.add(cls);
	            cachedSerFactories.add(beansf);
	            cachedDeserFactories.add(beandf);

	            qName = new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "DocumentoTipo");
	            cachedSerQNames.add(qName);
	            cls = ar.gov.rosario.administracionweb.ws.persona.model.DocumentoTipo.class;
	            cachedSerClasses.add(cls);
	            cachedSerFactories.add(beansf);
	            cachedDeserFactories.add(beandf);

	            qName = new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "EstadoCivil");
	            cachedSerQNames.add(qName);
	            cls = ar.gov.rosario.administracionweb.ws.persona.model.EstadoCivil.class;
	            cachedSerClasses.add(cls);
	            cachedSerFactories.add(beansf);
	            cachedDeserFactories.add(beandf);

	            qName = new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "IdLocalidad");
	            cachedSerQNames.add(qName);
	            cls = ar.gov.rosario.administracionweb.ws.persona.model.IdLocalidad.class;
	            cachedSerClasses.add(cls);
	            cachedSerFactories.add(beansf);
	            cachedDeserFactories.add(beandf);

	            qName = new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "IdPersona");
	            cachedSerQNames.add(qName);
	            cls = ar.gov.rosario.administracionweb.ws.persona.model.IdPersona.class;
	            cachedSerClasses.add(cls);
	            cachedSerFactories.add(beansf);
	            cachedDeserFactories.add(beandf);

	            qName = new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "Localidad");
	            cachedSerQNames.add(qName);
	            cls = ar.gov.rosario.administracionweb.ws.persona.model.Localidad.class;
	            cachedSerClasses.add(cls);
	            cachedSerFactories.add(beansf);
	            cachedDeserFactories.add(beandf);

	            qName = new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "Operacion");
	            cachedSerQNames.add(qName);
	            cls = ar.gov.rosario.administracionweb.ws.persona.model.Operacion.class;
	            cachedSerClasses.add(cls);
	            cachedSerFactories.add(beansf);
	            cachedDeserFactories.add(beandf);

	            qName = new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "Pais");
	            cachedSerQNames.add(qName);
	            cls = ar.gov.rosario.administracionweb.ws.persona.model.Pais.class;
	            cachedSerClasses.add(cls);
	            cachedSerFactories.add(beansf);
	            cachedDeserFactories.add(beandf);

	            qName = new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "Persona");
	            cachedSerQNames.add(qName);
	            cls = ar.gov.rosario.administracionweb.ws.persona.model.Persona.class;
	            cachedSerClasses.add(cls);
	            cachedSerFactories.add(beansf);
	            cachedDeserFactories.add(beandf);

	            qName = new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "PersonaExtendida");
	            cachedSerQNames.add(qName);
	            cls = ar.gov.rosario.administracionweb.ws.persona.model.PersonaExtendida.class;
	            cachedSerClasses.add(cls);
	            cachedSerFactories.add(beansf);
	            cachedDeserFactories.add(beandf);

	            qName = new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "PersonaFisica");
	            cachedSerQNames.add(qName);
	            cls = ar.gov.rosario.administracionweb.ws.persona.model.PersonaFisica.class;
	            cachedSerClasses.add(cls);
	            cachedSerFactories.add(beansf);
	            cachedDeserFactories.add(beandf);

	            qName = new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "PersonaJuridica");
	            cachedSerQNames.add(qName);
	            cls = ar.gov.rosario.administracionweb.ws.persona.model.PersonaJuridica.class;
	            cachedSerClasses.add(cls);
	            cachedSerFactories.add(beansf);
	            cachedDeserFactories.add(beandf);

	            qName = new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "Profesion");
	            cachedSerQNames.add(qName);
	            cls = ar.gov.rosario.administracionweb.ws.persona.model.Profesion.class;
	            cachedSerClasses.add(cls);
	            cachedSerFactories.add(beansf);
	            cachedDeserFactories.add(beandf);

	            qName = new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "Provincia");
	            cachedSerQNames.add(qName);
	            cls = ar.gov.rosario.administracionweb.ws.persona.model.Provincia.class;
	            cachedSerClasses.add(cls);
	            cachedSerFactories.add(beansf);
	            cachedDeserFactories.add(beandf);

	            qName = new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "ResBusPersonaFisica");
	            cachedSerQNames.add(qName);
	            cls = ar.gov.rosario.administracionweb.ws.persona.model.ResBusPersonaFisica.class;
	            cachedSerClasses.add(cls);
	            cachedSerFactories.add(beansf);
	            cachedDeserFactories.add(beandf);

	            qName = new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "ResBusPersonaJuridica");
	            cachedSerQNames.add(qName);
	            cls = ar.gov.rosario.administracionweb.ws.persona.model.ResBusPersonaJuridica.class;
	            cachedSerClasses.add(cls);
	            cachedSerFactories.add(beansf);
	            cachedDeserFactories.add(beandf);

	            qName = new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "SociedadIntegrante");
	            cachedSerQNames.add(qName);
	            cls = ar.gov.rosario.administracionweb.ws.persona.model.SociedadIntegrante.class;
	            cachedSerClasses.add(cls);
	            cachedSerFactories.add(beansf);
	            cachedDeserFactories.add(beandf);

	            qName = new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "SociedadTipo");
	            cachedSerQNames.add(qName);
	            cls = ar.gov.rosario.administracionweb.ws.persona.model.SociedadTipo.class;
	            cachedSerClasses.add(cls);
	            cachedSerFactories.add(beansf);
	            cachedDeserFactories.add(beandf);

	            qName = new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "Telefono");
	            cachedSerQNames.add(qName);
	            cls = ar.gov.rosario.administracionweb.ws.persona.model.Telefono.class;
	            cachedSerClasses.add(cls);
	            cachedSerFactories.add(beansf);
	            cachedDeserFactories.add(beandf);

	            qName = new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "TipoContacto");
	            cachedSerQNames.add(qName);
	            cls = ar.gov.rosario.administracionweb.ws.persona.model.TipoContacto.class;
	            cachedSerClasses.add(cls);
	            cachedSerFactories.add(beansf);
	            cachedDeserFactories.add(beandf);

	            qName = new javax.xml.namespace.QName("urn:wsSOAP.persona", "ArrayOf_tns2_Contacto");
	            cachedSerQNames.add(qName);
	            cls = ar.gov.rosario.administracionweb.ws.persona.model.Contacto[].class;
	            cachedSerClasses.add(cls);
	            qName = new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "Contacto");
	            qName2 = null;
	            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
	            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

	            qName = new javax.xml.namespace.QName("urn:wsSOAP.persona", "ArrayOf_tns2_DocumentoTipo");
	            cachedSerQNames.add(qName);
	            cls = ar.gov.rosario.administracionweb.ws.persona.model.DocumentoTipo[].class;
	            cachedSerClasses.add(cls);
	            qName = new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "DocumentoTipo");
	            qName2 = null;
	            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
	            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

	            qName = new javax.xml.namespace.QName("urn:wsSOAP.persona", "ArrayOf_tns2_EstadoCivil");
	            cachedSerQNames.add(qName);
	            cls = ar.gov.rosario.administracionweb.ws.persona.model.EstadoCivil[].class;
	            cachedSerClasses.add(cls);
	            qName = new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "EstadoCivil");
	            qName2 = null;
	            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
	            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

	            qName = new javax.xml.namespace.QName("urn:wsSOAP.persona", "ArrayOf_tns2_Localidad");
	            cachedSerQNames.add(qName);
	            cls = ar.gov.rosario.administracionweb.ws.persona.model.Localidad[].class;
	            cachedSerClasses.add(cls);
	            qName = new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "Localidad");
	            qName2 = null;
	            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
	            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

	            qName = new javax.xml.namespace.QName("urn:wsSOAP.persona", "ArrayOf_tns2_Pais");
	            cachedSerQNames.add(qName);
	            cls = ar.gov.rosario.administracionweb.ws.persona.model.Pais[].class;
	            cachedSerClasses.add(cls);
	            qName = new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "Pais");
	            qName2 = null;
	            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
	            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

	            qName = new javax.xml.namespace.QName("urn:wsSOAP.persona", "ArrayOf_tns2_Persona");
	            cachedSerQNames.add(qName);
	            cls = ar.gov.rosario.administracionweb.ws.persona.model.Persona[].class;
	            cachedSerClasses.add(cls);
	            qName = new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "Persona");
	            qName2 = null;
	            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
	            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

	            qName = new javax.xml.namespace.QName("urn:wsSOAP.persona", "ArrayOf_tns2_PersonaFisica");
	            cachedSerQNames.add(qName);
	            cls = ar.gov.rosario.administracionweb.ws.persona.model.PersonaFisica[].class;
	            cachedSerClasses.add(cls);
	            qName = new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "PersonaFisica");
	            qName2 = null;
	            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
	            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

	            qName = new javax.xml.namespace.QName("urn:wsSOAP.persona", "ArrayOf_tns2_PersonaJuridica");
	            cachedSerQNames.add(qName);
	            cls = ar.gov.rosario.administracionweb.ws.persona.model.PersonaJuridica[].class;
	            cachedSerClasses.add(cls);
	            qName = new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "PersonaJuridica");
	            qName2 = null;
	            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
	            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

	            qName = new javax.xml.namespace.QName("urn:wsSOAP.persona", "ArrayOf_tns2_SociedadIntegrante");
	            cachedSerQNames.add(qName);
	            cls = ar.gov.rosario.administracionweb.ws.persona.model.SociedadIntegrante[].class;
	            cachedSerClasses.add(cls);
	            qName = new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "SociedadIntegrante");
	            qName2 = null;
	            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
	            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

	            qName = new javax.xml.namespace.QName("urn:wsSOAP.persona", "ArrayOf_tns2_SociedadTipo");
	            cachedSerQNames.add(qName);
	            cls = ar.gov.rosario.administracionweb.ws.persona.model.SociedadTipo[].class;
	            cachedSerClasses.add(cls);
	            qName = new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "SociedadTipo");
	            qName2 = null;
	            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
	            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

	    }

	    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
	        try {
	            org.apache.axis.client.Call _call = super._createCall();
	            if (super.maintainSessionSet) {
	                _call.setMaintainSession(super.maintainSession);
	            }
	            if (super.cachedUsername != null) {
	                _call.setUsername(super.cachedUsername);
	            }
	            if (super.cachedPassword != null) {
	                _call.setPassword(super.cachedPassword);
	            }
	            if (super.cachedEndpoint != null) {
	                _call.setTargetEndpointAddress(super.cachedEndpoint);
	            }
	            if (super.cachedTimeout != null) {
	                _call.setTimeout(super.cachedTimeout);
	            }
	            if (super.cachedPortName != null) {
	                _call.setPortName(super.cachedPortName);
	            }
	            java.util.Enumeration keys = super.cachedProperties.keys();
	            while (keys.hasMoreElements()) {
	                java.lang.String key = (java.lang.String) keys.nextElement();
	                _call.setProperty(key, super.cachedProperties.get(key));
	            }
	            // All the type mapping information is registered
	            // when the first call is made.
	            // The type mapping information is actually registered in
	            // the TypeMappingRegistry of the service, which
	            // is the reason why registration is only needed for the first call.
	            synchronized (this) {
	                if (firstCall()) {
	                    // must set encoding style before registering serializers
	                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
	                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
	                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
	                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
	                        javax.xml.namespace.QName qName =
	                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
	                        java.lang.Object x = cachedSerFactories.get(i);
	                        if (x instanceof Class) {
	                            java.lang.Class sf = (java.lang.Class)
	                                 cachedSerFactories.get(i);
	                            java.lang.Class df = (java.lang.Class)
	                                 cachedDeserFactories.get(i);
	                            _call.registerTypeMapping(cls, qName, sf, df, false);
	                        }
	                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
	                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
	                                 cachedSerFactories.get(i);
	                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
	                                 cachedDeserFactories.get(i);
	                            _call.registerTypeMapping(cls, qName, sf, df, false);
	                        }
	                    }
	                }
	            }
	            return _call;
	        }
	        catch (java.lang.Throwable _t) {
	            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
	        }
	    }

	    public ar.gov.rosario.administracionweb.ws.persona.model.ResBusPersonaFisica getPersonaFisica(java.lang.String in0, java.lang.String in1, java.lang.String in2, int in3, int in4, java.lang.String in5) throws java.rmi.RemoteException {
	        if (super.cachedEndpoint == null) {
	            throw new org.apache.axis.NoEndPointException();
	        }
	        org.apache.axis.client.Call _call = createCall();
	        _call.setOperation(_operations[0]);
	        _call.setUseSOAPAction(true);
	        _call.setSOAPActionURI("");
	        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
	        _call.setOperationName(new javax.xml.namespace.QName("urn:wsSOAP.persona", "getPersonaFisica"));

	        setRequestHeaders(_call);
	        setAttachments(_call);
	 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2, new java.lang.Integer(in3), new java.lang.Integer(in4), in5});

	        if (_resp instanceof java.rmi.RemoteException) {
	            throw (java.rmi.RemoteException)_resp;
	        }
	        else {
	            extractAttachments(_call);
	            try {
	                return (ar.gov.rosario.administracionweb.ws.persona.model.ResBusPersonaFisica) _resp;
	            } catch (java.lang.Exception _exception) {
	                return (ar.gov.rosario.administracionweb.ws.persona.model.ResBusPersonaFisica) org.apache.axis.utils.JavaUtils.convert(_resp, ar.gov.rosario.administracionweb.ws.persona.model.ResBusPersonaFisica.class);
	            }
	        }
	  } catch (org.apache.axis.AxisFault axisFaultException) {
	  throw axisFaultException;
	}
	    }

	    public ar.gov.rosario.administracionweb.ws.persona.model.PersonaFisica[] getPersonaFisica(java.lang.String in0, int in1, int in2, int in3, java.lang.String in4) throws java.rmi.RemoteException {
	        if (super.cachedEndpoint == null) {
	            throw new org.apache.axis.NoEndPointException();
	        }
	        org.apache.axis.client.Call _call = createCall();
	        _call.setOperation(_operations[1]);
	        _call.setUseSOAPAction(true);
	        _call.setSOAPActionURI("");
	        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
	        _call.setOperationName(new javax.xml.namespace.QName("urn:wsSOAP.persona", "getPersonaFisica"));

	        setRequestHeaders(_call);
	        setAttachments(_call);
	 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Integer(in1), new java.lang.Integer(in2), new java.lang.Integer(in3), in4});

	        if (_resp instanceof java.rmi.RemoteException) {
	            throw (java.rmi.RemoteException)_resp;
	        }
	        else {
	            extractAttachments(_call);
	            try {
	                return (ar.gov.rosario.administracionweb.ws.persona.model.PersonaFisica[]) _resp;
	            } catch (java.lang.Exception _exception) {
	                return (ar.gov.rosario.administracionweb.ws.persona.model.PersonaFisica[]) org.apache.axis.utils.JavaUtils.convert(_resp, ar.gov.rosario.administracionweb.ws.persona.model.PersonaFisica[].class);
	            }
	        }
	  } catch (org.apache.axis.AxisFault axisFaultException) {
	  throw axisFaultException;
	}
	    }

	    public ar.gov.rosario.administracionweb.ws.persona.model.ResBusPersonaFisica getPersonaFisica(int in0, int in1, java.lang.String in2, int in3, int in4, java.lang.String in5) throws java.rmi.RemoteException {
	        if (super.cachedEndpoint == null) {
	            throw new org.apache.axis.NoEndPointException();
	        }
	        org.apache.axis.client.Call _call = createCall();
	        _call.setOperation(_operations[2]);
	        _call.setUseSOAPAction(true);
	        _call.setSOAPActionURI("");
	        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
	        _call.setOperationName(new javax.xml.namespace.QName("urn:wsSOAP.persona", "getPersonaFisica"));

	        setRequestHeaders(_call);
	        setAttachments(_call);
	 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(in0), new java.lang.Integer(in1), in2, new java.lang.Integer(in3), new java.lang.Integer(in4), in5});

	        if (_resp instanceof java.rmi.RemoteException) {
	            throw (java.rmi.RemoteException)_resp;
	        }
	        else {
	            extractAttachments(_call);
	            try {
	                return (ar.gov.rosario.administracionweb.ws.persona.model.ResBusPersonaFisica) _resp;
	            } catch (java.lang.Exception _exception) {
	                return (ar.gov.rosario.administracionweb.ws.persona.model.ResBusPersonaFisica) org.apache.axis.utils.JavaUtils.convert(_resp, ar.gov.rosario.administracionweb.ws.persona.model.ResBusPersonaFisica.class);
	            }
	        }
	  } catch (org.apache.axis.AxisFault axisFaultException) {
	  throw axisFaultException;
	}
	    }

	    public ar.gov.rosario.administracionweb.ws.persona.model.ResBusPersonaJuridica getPersonaJuridica(java.lang.String in0, int in1, int in2, java.lang.String in3) throws java.rmi.RemoteException {
	        if (super.cachedEndpoint == null) {
	            throw new org.apache.axis.NoEndPointException();
	        }
	        org.apache.axis.client.Call _call = createCall();
	        _call.setOperation(_operations[3]);
	        _call.setUseSOAPAction(true);
	        _call.setSOAPActionURI("");
	        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
	        _call.setOperationName(new javax.xml.namespace.QName("urn:wsSOAP.persona", "getPersonaJuridica"));

	        setRequestHeaders(_call);
	        setAttachments(_call);
	 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Integer(in1), new java.lang.Integer(in2), in3});

	        if (_resp instanceof java.rmi.RemoteException) {
	            throw (java.rmi.RemoteException)_resp;
	        }
	        else {
	            extractAttachments(_call);
	            try {
	                return (ar.gov.rosario.administracionweb.ws.persona.model.ResBusPersonaJuridica) _resp;
	            } catch (java.lang.Exception _exception) {
	                return (ar.gov.rosario.administracionweb.ws.persona.model.ResBusPersonaJuridica) org.apache.axis.utils.JavaUtils.convert(_resp, ar.gov.rosario.administracionweb.ws.persona.model.ResBusPersonaJuridica.class);
	            }
	        }
	  } catch (org.apache.axis.AxisFault axisFaultException) {
	  throw axisFaultException;
	}
	    }

	    public ar.gov.rosario.administracionweb.ws.persona.model.PersonaJuridica[] getPersonaJuridica(java.lang.String in0, int in1, int in2, int in3, java.lang.String in4) throws java.rmi.RemoteException {
	        if (super.cachedEndpoint == null) {
	            throw new org.apache.axis.NoEndPointException();
	        }
	        org.apache.axis.client.Call _call = createCall();
	        _call.setOperation(_operations[4]);
	        _call.setUseSOAPAction(true);
	        _call.setSOAPActionURI("");
	        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
	        _call.setOperationName(new javax.xml.namespace.QName("urn:wsSOAP.persona", "getPersonaJuridica"));

	        setRequestHeaders(_call);
	        setAttachments(_call);
	 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Integer(in1), new java.lang.Integer(in2), new java.lang.Integer(in3), in4});

	        if (_resp instanceof java.rmi.RemoteException) {
	            throw (java.rmi.RemoteException)_resp;
	        }
	        else {
	            extractAttachments(_call);
	            try {
	                return (ar.gov.rosario.administracionweb.ws.persona.model.PersonaJuridica[]) _resp;
	            } catch (java.lang.Exception _exception) {
	                return (ar.gov.rosario.administracionweb.ws.persona.model.PersonaJuridica[]) org.apache.axis.utils.JavaUtils.convert(_resp, ar.gov.rosario.administracionweb.ws.persona.model.PersonaJuridica[].class);
	            }
	        }
	  } catch (org.apache.axis.AxisFault axisFaultException) {
	  throw axisFaultException;
	}
	    }

	    public ar.gov.rosario.administracionweb.ws.persona.model.Persona[] getPersona(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException {
	        if (super.cachedEndpoint == null) {
	            throw new org.apache.axis.NoEndPointException();
	        }
	        org.apache.axis.client.Call _call = createCall();
	        _call.setOperation(_operations[5]);
	        _call.setUseSOAPAction(true);
	        _call.setSOAPActionURI("");
	        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
	        _call.setOperationName(new javax.xml.namespace.QName("urn:wsSOAP.persona", "getPersona"));

	        setRequestHeaders(_call);
	        setAttachments(_call);
	 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

	        if (_resp instanceof java.rmi.RemoteException) {
	            throw (java.rmi.RemoteException)_resp;
	        }
	        else {
	            extractAttachments(_call);
	            try {
	                return (ar.gov.rosario.administracionweb.ws.persona.model.Persona[]) _resp;
	            } catch (java.lang.Exception _exception) {
	                return (ar.gov.rosario.administracionweb.ws.persona.model.Persona[]) org.apache.axis.utils.JavaUtils.convert(_resp, ar.gov.rosario.administracionweb.ws.persona.model.Persona[].class);
	            }
	        }
	  } catch (org.apache.axis.AxisFault axisFaultException) {
	  throw axisFaultException;
	}
	    }

	    public ar.gov.rosario.administracionweb.ws.persona.model.Persona[] getPersona(java.lang.String in0, int in1, int in2, int in3, java.lang.String in4) throws java.rmi.RemoteException {
	        if (super.cachedEndpoint == null) {
	            throw new org.apache.axis.NoEndPointException();
	        }
	        org.apache.axis.client.Call _call = createCall();
	        _call.setOperation(_operations[6]);
	        _call.setUseSOAPAction(true);
	        _call.setSOAPActionURI("");
	        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
	        _call.setOperationName(new javax.xml.namespace.QName("urn:wsSOAP.persona", "getPersona"));

	        setRequestHeaders(_call);
	        setAttachments(_call);
	 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Integer(in1), new java.lang.Integer(in2), new java.lang.Integer(in3), in4});

	        if (_resp instanceof java.rmi.RemoteException) {
	            throw (java.rmi.RemoteException)_resp;
	        }
	        else {
	            extractAttachments(_call);
	            try {
	                return (ar.gov.rosario.administracionweb.ws.persona.model.Persona[]) _resp;
	            } catch (java.lang.Exception _exception) {
	                return (ar.gov.rosario.administracionweb.ws.persona.model.Persona[]) org.apache.axis.utils.JavaUtils.convert(_resp, ar.gov.rosario.administracionweb.ws.persona.model.Persona[].class);
	            }
	        }
	  } catch (org.apache.axis.AxisFault axisFaultException) {
	  throw axisFaultException;
	}
	    }

	    public ar.gov.rosario.administracionweb.ws.persona.model.Persona getPersona(int in0, java.lang.String in1) throws java.rmi.RemoteException {
	        if (super.cachedEndpoint == null) {
	            throw new org.apache.axis.NoEndPointException();
	        }
	        org.apache.axis.client.Call _call = createCall();
	        _call.setOperation(_operations[7]);
	        _call.setUseSOAPAction(true);
	        _call.setSOAPActionURI("");
	        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
	        _call.setOperationName(new javax.xml.namespace.QName("urn:wsSOAP.persona", "getPersona"));

	        setRequestHeaders(_call);
	        setAttachments(_call);
	 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(in0), in1});

	        if (_resp instanceof java.rmi.RemoteException) {
	            throw (java.rmi.RemoteException)_resp;
	        }
	        else {
	            extractAttachments(_call);
	            try {
	                return (ar.gov.rosario.administracionweb.ws.persona.model.Persona) _resp;
	            } catch (java.lang.Exception _exception) {
	                return (ar.gov.rosario.administracionweb.ws.persona.model.Persona) org.apache.axis.utils.JavaUtils.convert(_resp, ar.gov.rosario.administracionweb.ws.persona.model.Persona.class);
	            }
	        }
	  } catch (org.apache.axis.AxisFault axisFaultException) {
	  throw axisFaultException;
	}
	    }

	    public ar.gov.rosario.administracionweb.ws.persona.model.Contacto[] getContactos(int in0, java.lang.String in1) throws java.rmi.RemoteException {
	        if (super.cachedEndpoint == null) {
	            throw new org.apache.axis.NoEndPointException();
	        }
	        org.apache.axis.client.Call _call = createCall();
	        _call.setOperation(_operations[8]);
	        _call.setUseSOAPAction(true);
	        _call.setSOAPActionURI("");
	        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
	        _call.setOperationName(new javax.xml.namespace.QName("urn:wsSOAP.persona", "getContactos"));

	        setRequestHeaders(_call);
	        setAttachments(_call);
	 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(in0), in1});

	        if (_resp instanceof java.rmi.RemoteException) {
	            throw (java.rmi.RemoteException)_resp;
	        }
	        else {
	            extractAttachments(_call);
	            try {
	                return (ar.gov.rosario.administracionweb.ws.persona.model.Contacto[]) _resp;
	            } catch (java.lang.Exception _exception) {
	                return (ar.gov.rosario.administracionweb.ws.persona.model.Contacto[]) org.apache.axis.utils.JavaUtils.convert(_resp, ar.gov.rosario.administracionweb.ws.persona.model.Contacto[].class);
	            }
	        }
	  } catch (org.apache.axis.AxisFault axisFaultException) {
	  throw axisFaultException;
	}
	    }

	    public ar.gov.rosario.administracionweb.ws.persona.model.SociedadIntegrante[] getSociedadIntegrantes(java.lang.String in0, int in1, int in2, int in3, java.lang.String in4) throws java.rmi.RemoteException {
	        if (super.cachedEndpoint == null) {
	            throw new org.apache.axis.NoEndPointException();
	        }
	        org.apache.axis.client.Call _call = createCall();
	        _call.setOperation(_operations[9]);
	        _call.setUseSOAPAction(true);
	        _call.setSOAPActionURI("");
	        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
	        _call.setOperationName(new javax.xml.namespace.QName("urn:wsSOAP.persona", "getSociedadIntegrantes"));

	        setRequestHeaders(_call);
	        setAttachments(_call);
	 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Integer(in1), new java.lang.Integer(in2), new java.lang.Integer(in3), in4});

	        if (_resp instanceof java.rmi.RemoteException) {
	            throw (java.rmi.RemoteException)_resp;
	        }
	        else {
	            extractAttachments(_call);
	            try {
	                return (ar.gov.rosario.administracionweb.ws.persona.model.SociedadIntegrante[]) _resp;
	            } catch (java.lang.Exception _exception) {
	                return (ar.gov.rosario.administracionweb.ws.persona.model.SociedadIntegrante[]) org.apache.axis.utils.JavaUtils.convert(_resp, ar.gov.rosario.administracionweb.ws.persona.model.SociedadIntegrante[].class);
	            }
	        }
	  } catch (org.apache.axis.AxisFault axisFaultException) {
	  throw axisFaultException;
	}
	    }

	    public ar.gov.rosario.administracionweb.ws.persona.model.PersonaExtendida getPersonaExtendida(int in0, java.lang.String in1) throws java.rmi.RemoteException {
	        if (super.cachedEndpoint == null) {
	            throw new org.apache.axis.NoEndPointException();
	        }
	        org.apache.axis.client.Call _call = createCall();
	        _call.setOperation(_operations[10]);
	        _call.setUseSOAPAction(true);
	        _call.setSOAPActionURI("");
	        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
	        _call.setOperationName(new javax.xml.namespace.QName("urn:wsSOAP.persona", "getPersonaExtendida"));

	        setRequestHeaders(_call);
	        setAttachments(_call);
	 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(in0), in1});

	        if (_resp instanceof java.rmi.RemoteException) {
	            throw (java.rmi.RemoteException)_resp;
	        }
	        else {
	            extractAttachments(_call);
	            try {
	                return (ar.gov.rosario.administracionweb.ws.persona.model.PersonaExtendida) _resp;
	            } catch (java.lang.Exception _exception) {
	                return (ar.gov.rosario.administracionweb.ws.persona.model.PersonaExtendida) org.apache.axis.utils.JavaUtils.convert(_resp, ar.gov.rosario.administracionweb.ws.persona.model.PersonaExtendida.class);
	            }
	        }
	  } catch (org.apache.axis.AxisFault axisFaultException) {
	  throw axisFaultException;
	}
	    }

	    public boolean setContactos(ar.gov.rosario.administracionweb.ws.persona.model.Contacto[] in0, int in1, java.lang.String in2) throws java.rmi.RemoteException {
	        if (super.cachedEndpoint == null) {
	            throw new org.apache.axis.NoEndPointException();
	        }
	        org.apache.axis.client.Call _call = createCall();
	        _call.setOperation(_operations[11]);
	        _call.setUseSOAPAction(true);
	        _call.setSOAPActionURI("");
	        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
	        _call.setOperationName(new javax.xml.namespace.QName("urn:wsSOAP.persona", "setContactos"));

	        setRequestHeaders(_call);
	        setAttachments(_call);
	 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Integer(in1), in2});

	        if (_resp instanceof java.rmi.RemoteException) {
	            throw (java.rmi.RemoteException)_resp;
	        }
	        else {
	            extractAttachments(_call);
	            try {
	                return ((java.lang.Boolean) _resp).booleanValue();
	            } catch (java.lang.Exception _exception) {
	                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
	            }
	        }
	  } catch (org.apache.axis.AxisFault axisFaultException) {
	  throw axisFaultException;
	}
	    }

	    public boolean setSociedadIntegrantes(java.lang.String in0, int in1, int in2, int in3, ar.gov.rosario.administracionweb.ws.persona.model.SociedadIntegrante[] in4, java.lang.String in5) throws java.rmi.RemoteException {
	        if (super.cachedEndpoint == null) {
	            throw new org.apache.axis.NoEndPointException();
	        }
	        org.apache.axis.client.Call _call = createCall();
	        _call.setOperation(_operations[12]);
	        _call.setUseSOAPAction(true);
	        _call.setSOAPActionURI("");
	        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
	        _call.setOperationName(new javax.xml.namespace.QName("urn:wsSOAP.persona", "setSociedadIntegrantes"));

	        setRequestHeaders(_call);
	        setAttachments(_call);
	 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Integer(in1), new java.lang.Integer(in2), new java.lang.Integer(in3), in4, in5});

	        if (_resp instanceof java.rmi.RemoteException) {
	            throw (java.rmi.RemoteException)_resp;
	        }
	        else {
	            extractAttachments(_call);
	            try {
	                return ((java.lang.Boolean) _resp).booleanValue();
	            } catch (java.lang.Exception _exception) {
	                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
	            }
	        }
	  } catch (org.apache.axis.AxisFault axisFaultException) {
	  throw axisFaultException;
	}
	    }

	    public boolean setPersonaExtendida(ar.gov.rosario.administracionweb.ws.persona.model.PersonaExtendida in0, int in1, java.lang.String in2) throws java.rmi.RemoteException {
	        if (super.cachedEndpoint == null) {
	            throw new org.apache.axis.NoEndPointException();
	        }
	        org.apache.axis.client.Call _call = createCall();
	        _call.setOperation(_operations[13]);
	        _call.setUseSOAPAction(true);
	        _call.setSOAPActionURI("");
	        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
	        _call.setOperationName(new javax.xml.namespace.QName("urn:wsSOAP.persona", "setPersonaExtendida"));

	        setRequestHeaders(_call);
	        setAttachments(_call);
	 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Integer(in1), in2});

	        if (_resp instanceof java.rmi.RemoteException) {
	            throw (java.rmi.RemoteException)_resp;
	        }
	        else {
	            extractAttachments(_call);
	            try {
	                return ((java.lang.Boolean) _resp).booleanValue();
	            } catch (java.lang.Exception _exception) {
	                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
	            }
	        }
	  } catch (org.apache.axis.AxisFault axisFaultException) {
	  throw axisFaultException;
	}
	    }

	    public ar.gov.rosario.administracionweb.ws.persona.model.Operacion setPersona(ar.gov.rosario.administracionweb.ws.persona.model.Persona in0, java.lang.String in1) throws java.rmi.RemoteException {
	        if (super.cachedEndpoint == null) {
	            throw new org.apache.axis.NoEndPointException();
	        }
	        org.apache.axis.client.Call _call = createCall();
	        _call.setOperation(_operations[14]);
	        _call.setUseSOAPAction(true);
	        _call.setSOAPActionURI("");
	        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
	        _call.setOperationName(new javax.xml.namespace.QName("urn:wsSOAP.persona", "setPersona"));

	        setRequestHeaders(_call);
	        setAttachments(_call);
	 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

	        if (_resp instanceof java.rmi.RemoteException) {
	            throw (java.rmi.RemoteException)_resp;
	        }
	        else {
	            extractAttachments(_call);
	            try {
	                return (ar.gov.rosario.administracionweb.ws.persona.model.Operacion) _resp;
	            } catch (java.lang.Exception _exception) {
	                return (ar.gov.rosario.administracionweb.ws.persona.model.Operacion) org.apache.axis.utils.JavaUtils.convert(_resp, ar.gov.rosario.administracionweb.ws.persona.model.Operacion.class);
	            }
	        }
	  } catch (org.apache.axis.AxisFault axisFaultException) {
	  throw axisFaultException;
	}
	    }

	    public ar.gov.rosario.administracionweb.ws.persona.model.DocumentoTipo[] getAllDocumentoTipo(java.lang.String in0) throws java.rmi.RemoteException {
	        if (super.cachedEndpoint == null) {
	            throw new org.apache.axis.NoEndPointException();
	        }
	        org.apache.axis.client.Call _call = createCall();
	        _call.setOperation(_operations[15]);
	        _call.setUseSOAPAction(true);
	        _call.setSOAPActionURI("");
	        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
	        _call.setOperationName(new javax.xml.namespace.QName("urn:wsSOAP.persona", "getAllDocumentoTipo"));

	        setRequestHeaders(_call);
	        setAttachments(_call);
	 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

	        if (_resp instanceof java.rmi.RemoteException) {
	            throw (java.rmi.RemoteException)_resp;
	        }
	        else {
	            extractAttachments(_call);
	            try {
	                return (ar.gov.rosario.administracionweb.ws.persona.model.DocumentoTipo[]) _resp;
	            } catch (java.lang.Exception _exception) {
	                return (ar.gov.rosario.administracionweb.ws.persona.model.DocumentoTipo[]) org.apache.axis.utils.JavaUtils.convert(_resp, ar.gov.rosario.administracionweb.ws.persona.model.DocumentoTipo[].class);
	            }
	        }
	  } catch (org.apache.axis.AxisFault axisFaultException) {
	  throw axisFaultException;
	}
	    }

	    public ar.gov.rosario.administracionweb.ws.persona.model.SociedadTipo[] getAllSociedadTipo(java.lang.String in0) throws java.rmi.RemoteException {
	        if (super.cachedEndpoint == null) {
	            throw new org.apache.axis.NoEndPointException();
	        }
	        org.apache.axis.client.Call _call = createCall();
	        _call.setOperation(_operations[16]);
	        _call.setUseSOAPAction(true);
	        _call.setSOAPActionURI("");
	        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
	        _call.setOperationName(new javax.xml.namespace.QName("urn:wsSOAP.persona", "getAllSociedadTipo"));

	        setRequestHeaders(_call);
	        setAttachments(_call);
	 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

	        if (_resp instanceof java.rmi.RemoteException) {
	            throw (java.rmi.RemoteException)_resp;
	        }
	        else {
	            extractAttachments(_call);
	            try {
	                return (ar.gov.rosario.administracionweb.ws.persona.model.SociedadTipo[]) _resp;
	            } catch (java.lang.Exception _exception) {
	                return (ar.gov.rosario.administracionweb.ws.persona.model.SociedadTipo[]) org.apache.axis.utils.JavaUtils.convert(_resp, ar.gov.rosario.administracionweb.ws.persona.model.SociedadTipo[].class);
	            }
	        }
	  } catch (org.apache.axis.AxisFault axisFaultException) {
	  throw axisFaultException;
	}
	    }

	    public ar.gov.rosario.administracionweb.ws.persona.model.EstadoCivil[] getAllEstadoCivil(java.lang.String in0) throws java.rmi.RemoteException {
	        if (super.cachedEndpoint == null) {
	            throw new org.apache.axis.NoEndPointException();
	        }
	        org.apache.axis.client.Call _call = createCall();
	        _call.setOperation(_operations[17]);
	        _call.setUseSOAPAction(true);
	        _call.setSOAPActionURI("");
	        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
	        _call.setOperationName(new javax.xml.namespace.QName("urn:wsSOAP.persona", "getAllEstadoCivil"));

	        setRequestHeaders(_call);
	        setAttachments(_call);
	 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

	        if (_resp instanceof java.rmi.RemoteException) {
	            throw (java.rmi.RemoteException)_resp;
	        }
	        else {
	            extractAttachments(_call);
	            try {
	                return (ar.gov.rosario.administracionweb.ws.persona.model.EstadoCivil[]) _resp;
	            } catch (java.lang.Exception _exception) {
	                return (ar.gov.rosario.administracionweb.ws.persona.model.EstadoCivil[]) org.apache.axis.utils.JavaUtils.convert(_resp, ar.gov.rosario.administracionweb.ws.persona.model.EstadoCivil[].class);
	            }
	        }
	  } catch (org.apache.axis.AxisFault axisFaultException) {
	  throw axisFaultException;
	}
	    }

	    public ar.gov.rosario.administracionweb.ws.persona.model.Pais[] getAllPais(java.lang.String in0) throws java.rmi.RemoteException {
	        if (super.cachedEndpoint == null) {
	            throw new org.apache.axis.NoEndPointException();
	        }
	        org.apache.axis.client.Call _call = createCall();
	        _call.setOperation(_operations[18]);
	        _call.setUseSOAPAction(true);
	        _call.setSOAPActionURI("");
	        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
	        _call.setOperationName(new javax.xml.namespace.QName("urn:wsSOAP.persona", "getAllPais"));

	        setRequestHeaders(_call);
	        setAttachments(_call);
	 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

	        if (_resp instanceof java.rmi.RemoteException) {
	            throw (java.rmi.RemoteException)_resp;
	        }
	        else {
	            extractAttachments(_call);
	            try {
	                return (ar.gov.rosario.administracionweb.ws.persona.model.Pais[]) _resp;
	            } catch (java.lang.Exception _exception) {
	                return (ar.gov.rosario.administracionweb.ws.persona.model.Pais[]) org.apache.axis.utils.JavaUtils.convert(_resp, ar.gov.rosario.administracionweb.ws.persona.model.Pais[].class);
	            }
	        }
	  } catch (org.apache.axis.AxisFault axisFaultException) {
	  throw axisFaultException;
	}
	    }

	    public ar.gov.rosario.administracionweb.ws.persona.model.Localidad[] getLocalidades(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException {
	        if (super.cachedEndpoint == null) {
	            throw new org.apache.axis.NoEndPointException();
	        }
	        org.apache.axis.client.Call _call = createCall();
	        _call.setOperation(_operations[19]);
	        _call.setUseSOAPAction(true);
	        _call.setSOAPActionURI("");
	        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
	        _call.setOperationName(new javax.xml.namespace.QName("urn:wsSOAP.persona", "getLocalidades"));

	        setRequestHeaders(_call);
	        setAttachments(_call);
	 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

	        if (_resp instanceof java.rmi.RemoteException) {
	            throw (java.rmi.RemoteException)_resp;
	        }
	        else {
	            extractAttachments(_call);
	            try {
	                return (ar.gov.rosario.administracionweb.ws.persona.model.Localidad[]) _resp;
	            } catch (java.lang.Exception _exception) {
	                return (ar.gov.rosario.administracionweb.ws.persona.model.Localidad[]) org.apache.axis.utils.JavaUtils.convert(_resp, ar.gov.rosario.administracionweb.ws.persona.model.Localidad[].class);
	            }
	        }
	  } catch (org.apache.axis.AxisFault axisFaultException) {
	  throw axisFaultException;
	}
	    }

	    public ar.gov.rosario.administracionweb.ws.persona.model.Localidad getLocalidad(int in0, int in1, java.lang.String in2) throws java.rmi.RemoteException {
	        if (super.cachedEndpoint == null) {
	            throw new org.apache.axis.NoEndPointException();
	        }
	        org.apache.axis.client.Call _call = createCall();
	        _call.setOperation(_operations[20]);
	        _call.setUseSOAPAction(true);
	        _call.setSOAPActionURI("");
	        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
	        _call.setOperationName(new javax.xml.namespace.QName("urn:wsSOAP.persona", "getLocalidad"));

	        setRequestHeaders(_call);
	        setAttachments(_call);
	 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(in0), new java.lang.Integer(in1), in2});

	        if (_resp instanceof java.rmi.RemoteException) {
	            throw (java.rmi.RemoteException)_resp;
	        }
	        else {
	            extractAttachments(_call);
	            try {
	                return (ar.gov.rosario.administracionweb.ws.persona.model.Localidad) _resp;
	            } catch (java.lang.Exception _exception) {
	                return (ar.gov.rosario.administracionweb.ws.persona.model.Localidad) org.apache.axis.utils.JavaUtils.convert(_resp, ar.gov.rosario.administracionweb.ws.persona.model.Localidad.class);
	            }
	        }
	  } catch (org.apache.axis.AxisFault axisFaultException) {
	  throw axisFaultException;
	}
	    }

	}
