/**
 * SociedadIntegrante.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package ar.gov.rosario.administracionweb.ws.persona.model;

public class SociedadIntegrante  implements java.io.Serializable {
    private ar.gov.rosario.administracionweb.ws.persona.model.IdPersona cuit;
    private java.util.Calendar fechaHora;
    private java.lang.Integer nroOrden;
    private java.lang.String usuario;

    public SociedadIntegrante() {
    }

    public SociedadIntegrante(
           ar.gov.rosario.administracionweb.ws.persona.model.IdPersona cuit,
           java.util.Calendar fechaHora,
           java.lang.Integer nroOrden,
           java.lang.String usuario) {
           this.cuit = cuit;
           this.fechaHora = fechaHora;
           this.nroOrden = nroOrden;
           this.usuario = usuario;
    }


    /**
     * Gets the cuit value for this SociedadIntegrante.
     * 
     * @return cuit
     */
    public ar.gov.rosario.administracionweb.ws.persona.model.IdPersona getCuit() {
        return cuit;
    }


    /**
     * Sets the cuit value for this SociedadIntegrante.
     * 
     * @param cuit
     */
    public void setCuit(ar.gov.rosario.administracionweb.ws.persona.model.IdPersona cuit) {
        this.cuit = cuit;
    }


    /**
     * Gets the fechaHora value for this SociedadIntegrante.
     * 
     * @return fechaHora
     */
    public java.util.Calendar getFechaHora() {
        return fechaHora;
    }


    /**
     * Sets the fechaHora value for this SociedadIntegrante.
     * 
     * @param fechaHora
     */
    public void setFechaHora(java.util.Calendar fechaHora) {
        this.fechaHora = fechaHora;
    }


    /**
     * Gets the nroOrden value for this SociedadIntegrante.
     * 
     * @return nroOrden
     */
    public java.lang.Integer getNroOrden() {
        return nroOrden;
    }


    /**
     * Sets the nroOrden value for this SociedadIntegrante.
     * 
     * @param nroOrden
     */
    public void setNroOrden(java.lang.Integer nroOrden) {
        this.nroOrden = nroOrden;
    }


    /**
     * Gets the usuario value for this SociedadIntegrante.
     * 
     * @return usuario
     */
    public java.lang.String getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this SociedadIntegrante.
     * 
     * @param usuario
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SociedadIntegrante)) return false;
        SociedadIntegrante other = (SociedadIntegrante) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cuit==null && other.getCuit()==null) || 
             (this.cuit!=null &&
              this.cuit.equals(other.getCuit()))) &&
            ((this.fechaHora==null && other.getFechaHora()==null) || 
             (this.fechaHora!=null &&
              this.fechaHora.equals(other.getFechaHora()))) &&
            ((this.nroOrden==null && other.getNroOrden()==null) || 
             (this.nroOrden!=null &&
              this.nroOrden.equals(other.getNroOrden()))) &&
            ((this.usuario==null && other.getUsuario()==null) || 
             (this.usuario!=null &&
              this.usuario.equals(other.getUsuario())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCuit() != null) {
            _hashCode += getCuit().hashCode();
        }
        if (getFechaHora() != null) {
            _hashCode += getFechaHora().hashCode();
        }
        if (getNroOrden() != null) {
            _hashCode += getNroOrden().hashCode();
        }
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SociedadIntegrante.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "SociedadIntegrante"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cuit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "IdPersona"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaHora");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaHora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroOrden");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nroOrden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
