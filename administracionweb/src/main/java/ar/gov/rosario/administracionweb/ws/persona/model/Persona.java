/**
 * Persona.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.gov.rosario.administracionweb.ws.persona.model;

public class Persona  implements java.io.Serializable {
    private java.lang.String nombre;

    private java.lang.String usuario;

    private ar.gov.rosario.administracionweb.ws.persona.model.IdPersona idPersona;

    private java.util.Calendar fechaHora;

    private int id;

    public Persona() {
    }

    public Persona(
           java.lang.String nombre,
           java.lang.String usuario,
           ar.gov.rosario.administracionweb.ws.persona.model.IdPersona idPersona,
           java.util.Calendar fechaHora,
           int id) {
           this.nombre = nombre;
           this.usuario = usuario;
           this.idPersona = idPersona;
           this.fechaHora = fechaHora;
           this.id = id;
    }


    /**
     * Gets the nombre value for this Persona.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this Persona.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the usuario value for this Persona.
     * 
     * @return usuario
     */
    public java.lang.String getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this Persona.
     * 
     * @param usuario
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }


    /**
     * Gets the idPersona value for this Persona.
     * 
     * @return idPersona
     */
    public ar.gov.rosario.administracionweb.ws.persona.model.IdPersona getIdPersona() {
        return idPersona;
    }


    /**
     * Sets the idPersona value for this Persona.
     * 
     * @param idPersona
     */
    public void setIdPersona(ar.gov.rosario.administracionweb.ws.persona.model.IdPersona idPersona) {
        this.idPersona = idPersona;
    }


    /**
     * Gets the fechaHora value for this Persona.
     * 
     * @return fechaHora
     */
    public java.util.Calendar getFechaHora() {
        return fechaHora;
    }


    /**
     * Sets the fechaHora value for this Persona.
     * 
     * @param fechaHora
     */
    public void setFechaHora(java.util.Calendar fechaHora) {
        this.fechaHora = fechaHora;
    }


    /**
     * Gets the id value for this Persona.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Persona.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Persona)) return false;
        Persona other = (Persona) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.usuario==null && other.getUsuario()==null) || 
             (this.usuario!=null &&
              this.usuario.equals(other.getUsuario()))) &&
            ((this.idPersona==null && other.getIdPersona()==null) || 
             (this.idPersona!=null &&
              this.idPersona.equals(other.getIdPersona()))) &&
            ((this.fechaHora==null && other.getFechaHora()==null) || 
             (this.fechaHora!=null &&
              this.fechaHora.equals(other.getFechaHora()))) &&
            this.id == other.getId();
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
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        if (getIdPersona() != null) {
            _hashCode += getIdPersona().hashCode();
        }
        if (getFechaHora() != null) {
            _hashCode += getFechaHora().hashCode();
        }
        _hashCode += getId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Persona.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "Persona"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPersona");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idPersona"));
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
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", usuario=" + usuario + ", idPersona=" + idPersona + ", fechaHora="
				+ fechaHora + ", id=" + id + "]";
	}
    
    
    

}
