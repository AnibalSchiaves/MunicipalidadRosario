/**
 * Contacto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.gov.rosario.administracionweb.ws.persona.model;

public class Contacto  implements java.io.Serializable {
    private java.lang.String usuario;

    private java.lang.String descripcion;

    private ar.gov.rosario.administracionweb.ws.persona.model.TipoContacto tipoContacto;

    private int idPersona;

    private java.util.Calendar fechaHora;

    private int id;

    private java.lang.String observaciones;

    public Contacto() {
    }

    public Contacto(
           java.lang.String usuario,
           java.lang.String descripcion,
           ar.gov.rosario.administracionweb.ws.persona.model.TipoContacto tipoContacto,
           int idPersona,
           java.util.Calendar fechaHora,
           int id,
           java.lang.String observaciones) {
           this.usuario = usuario;
           this.descripcion = descripcion;
           this.tipoContacto = tipoContacto;
           this.idPersona = idPersona;
           this.fechaHora = fechaHora;
           this.id = id;
           this.observaciones = observaciones;
    }


    /**
     * Gets the usuario value for this Contacto.
     * 
     * @return usuario
     */
    public java.lang.String getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this Contacto.
     * 
     * @param usuario
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }


    /**
     * Gets the descripcion value for this Contacto.
     * 
     * @return descripcion
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this Contacto.
     * 
     * @param descripcion
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * Gets the tipoContacto value for this Contacto.
     * 
     * @return tipoContacto
     */
    public ar.gov.rosario.administracionweb.ws.persona.model.TipoContacto getTipoContacto() {
        return tipoContacto;
    }


    /**
     * Sets the tipoContacto value for this Contacto.
     * 
     * @param tipoContacto
     */
    public void setTipoContacto(ar.gov.rosario.administracionweb.ws.persona.model.TipoContacto tipoContacto) {
        this.tipoContacto = tipoContacto;
    }


    /**
     * Gets the idPersona value for this Contacto.
     * 
     * @return idPersona
     */
    public int getIdPersona() {
        return idPersona;
    }


    /**
     * Sets the idPersona value for this Contacto.
     * 
     * @param idPersona
     */
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }


    /**
     * Gets the fechaHora value for this Contacto.
     * 
     * @return fechaHora
     */
    public java.util.Calendar getFechaHora() {
        return fechaHora;
    }


    /**
     * Sets the fechaHora value for this Contacto.
     * 
     * @param fechaHora
     */
    public void setFechaHora(java.util.Calendar fechaHora) {
        this.fechaHora = fechaHora;
    }


    /**
     * Gets the id value for this Contacto.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Contacto.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the observaciones value for this Contacto.
     * 
     * @return observaciones
     */
    public java.lang.String getObservaciones() {
        return observaciones;
    }


    /**
     * Sets the observaciones value for this Contacto.
     * 
     * @param observaciones
     */
    public void setObservaciones(java.lang.String observaciones) {
        this.observaciones = observaciones;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Contacto)) return false;
        Contacto other = (Contacto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.usuario==null && other.getUsuario()==null) || 
             (this.usuario!=null &&
              this.usuario.equals(other.getUsuario()))) &&
            ((this.descripcion==null && other.getDescripcion()==null) || 
             (this.descripcion!=null &&
              this.descripcion.equals(other.getDescripcion()))) &&
            ((this.tipoContacto==null && other.getTipoContacto()==null) || 
             (this.tipoContacto!=null &&
              this.tipoContacto.equals(other.getTipoContacto()))) &&
            this.idPersona == other.getIdPersona() &&
            ((this.fechaHora==null && other.getFechaHora()==null) || 
             (this.fechaHora!=null &&
              this.fechaHora.equals(other.getFechaHora()))) &&
            this.id == other.getId() &&
            ((this.observaciones==null && other.getObservaciones()==null) || 
             (this.observaciones!=null &&
              this.observaciones.equals(other.getObservaciones())));
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
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        if (getDescripcion() != null) {
            _hashCode += getDescripcion().hashCode();
        }
        if (getTipoContacto() != null) {
            _hashCode += getTipoContacto().hashCode();
        }
        _hashCode += getIdPersona();
        if (getFechaHora() != null) {
            _hashCode += getFechaHora().hashCode();
        }
        _hashCode += getId();
        if (getObservaciones() != null) {
            _hashCode += getObservaciones().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Contacto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "Contacto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoContacto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoContacto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "TipoContacto"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPersona");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idPersona"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaHora");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaHora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("observaciones");
        elemField.setXmlName(new javax.xml.namespace.QName("", "observaciones"));
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
