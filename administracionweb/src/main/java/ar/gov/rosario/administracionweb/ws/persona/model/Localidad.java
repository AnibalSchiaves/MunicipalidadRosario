/**
 * Localidad.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.gov.rosario.administracionweb.ws.persona.model;

public class Localidad  implements java.io.Serializable {
    private ar.gov.rosario.administracionweb.ws.persona.model.Provincia provincia;

    private ar.gov.rosario.administracionweb.ws.persona.model.IdLocalidad idLocalidad;

    private java.lang.String descripcion;

    public Localidad() {
    }

    public Localidad(
           ar.gov.rosario.administracionweb.ws.persona.model.Provincia provincia,
           ar.gov.rosario.administracionweb.ws.persona.model.IdLocalidad idLocalidad,
           java.lang.String descripcion) {
           this.provincia = provincia;
           this.idLocalidad = idLocalidad;
           this.descripcion = descripcion;
    }


    /**
     * Gets the provincia value for this Localidad.
     * 
     * @return provincia
     */
    public ar.gov.rosario.administracionweb.ws.persona.model.Provincia getProvincia() {
        return provincia;
    }


    /**
     * Sets the provincia value for this Localidad.
     * 
     * @param provincia
     */
    public void setProvincia(ar.gov.rosario.administracionweb.ws.persona.model.Provincia provincia) {
        this.provincia = provincia;
    }


    /**
     * Gets the idLocalidad value for this Localidad.
     * 
     * @return idLocalidad
     */
    public ar.gov.rosario.administracionweb.ws.persona.model.IdLocalidad getIdLocalidad() {
        return idLocalidad;
    }


    /**
     * Sets the idLocalidad value for this Localidad.
     * 
     * @param idLocalidad
     */
    public void setIdLocalidad(ar.gov.rosario.administracionweb.ws.persona.model.IdLocalidad idLocalidad) {
        this.idLocalidad = idLocalidad;
    }


    /**
     * Gets the descripcion value for this Localidad.
     * 
     * @return descripcion
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this Localidad.
     * 
     * @param descripcion
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Localidad)) return false;
        Localidad other = (Localidad) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.provincia==null && other.getProvincia()==null) || 
             (this.provincia!=null &&
              this.provincia.equals(other.getProvincia()))) &&
            ((this.idLocalidad==null && other.getIdLocalidad()==null) || 
             (this.idLocalidad!=null &&
              this.idLocalidad.equals(other.getIdLocalidad()))) &&
            ((this.descripcion==null && other.getDescripcion()==null) || 
             (this.descripcion!=null &&
              this.descripcion.equals(other.getDescripcion())));
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
        if (getProvincia() != null) {
            _hashCode += getProvincia().hashCode();
        }
        if (getIdLocalidad() != null) {
            _hashCode += getIdLocalidad().hashCode();
        }
        if (getDescripcion() != null) {
            _hashCode += getDescripcion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Localidad.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "Localidad"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provincia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "provincia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "Provincia"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idLocalidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idLocalidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "IdLocalidad"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descripcion"));
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
