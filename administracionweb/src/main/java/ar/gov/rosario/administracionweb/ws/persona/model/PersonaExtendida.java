/**
 * PersonaExtendida.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.gov.rosario.administracionweb.ws.persona.model;

public class PersonaExtendida  implements java.io.Serializable {
    private java.lang.Double coordYDec;

    private java.lang.String usuario;

    private java.lang.Double coordYLeg;

    private ar.gov.rosario.administracionweb.ws.persona.model.Calle calleIntDec;

    private java.lang.Double coordXLeg;

    private int idPersona;

    private java.lang.Double coordXDec;

    private java.util.Calendar fechaHora;

    private int id;

    public PersonaExtendida() {
    }

    public PersonaExtendida(
           java.lang.Double coordYDec,
           java.lang.String usuario,
           java.lang.Double coordYLeg,
           ar.gov.rosario.administracionweb.ws.persona.model.Calle calleIntDec,
           java.lang.Double coordXLeg,
           int idPersona,
           java.lang.Double coordXDec,
           java.util.Calendar fechaHora,
           int id) {
           this.coordYDec = coordYDec;
           this.usuario = usuario;
           this.coordYLeg = coordYLeg;
           this.calleIntDec = calleIntDec;
           this.coordXLeg = coordXLeg;
           this.idPersona = idPersona;
           this.coordXDec = coordXDec;
           this.fechaHora = fechaHora;
           this.id = id;
    }


    /**
     * Gets the coordYDec value for this PersonaExtendida.
     * 
     * @return coordYDec
     */
    public java.lang.Double getCoordYDec() {
        return coordYDec;
    }


    /**
     * Sets the coordYDec value for this PersonaExtendida.
     * 
     * @param coordYDec
     */
    public void setCoordYDec(java.lang.Double coordYDec) {
        this.coordYDec = coordYDec;
    }


    /**
     * Gets the usuario value for this PersonaExtendida.
     * 
     * @return usuario
     */
    public java.lang.String getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this PersonaExtendida.
     * 
     * @param usuario
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }


    /**
     * Gets the coordYLeg value for this PersonaExtendida.
     * 
     * @return coordYLeg
     */
    public java.lang.Double getCoordYLeg() {
        return coordYLeg;
    }


    /**
     * Sets the coordYLeg value for this PersonaExtendida.
     * 
     * @param coordYLeg
     */
    public void setCoordYLeg(java.lang.Double coordYLeg) {
        this.coordYLeg = coordYLeg;
    }


    /**
     * Gets the calleIntDec value for this PersonaExtendida.
     * 
     * @return calleIntDec
     */
    public ar.gov.rosario.administracionweb.ws.persona.model.Calle getCalleIntDec() {
        return calleIntDec;
    }


    /**
     * Sets the calleIntDec value for this PersonaExtendida.
     * 
     * @param calleIntDec
     */
    public void setCalleIntDec(ar.gov.rosario.administracionweb.ws.persona.model.Calle calleIntDec) {
        this.calleIntDec = calleIntDec;
    }


    /**
     * Gets the coordXLeg value for this PersonaExtendida.
     * 
     * @return coordXLeg
     */
    public java.lang.Double getCoordXLeg() {
        return coordXLeg;
    }


    /**
     * Sets the coordXLeg value for this PersonaExtendida.
     * 
     * @param coordXLeg
     */
    public void setCoordXLeg(java.lang.Double coordXLeg) {
        this.coordXLeg = coordXLeg;
    }


    /**
     * Gets the idPersona value for this PersonaExtendida.
     * 
     * @return idPersona
     */
    public int getIdPersona() {
        return idPersona;
    }


    /**
     * Sets the idPersona value for this PersonaExtendida.
     * 
     * @param idPersona
     */
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }


    /**
     * Gets the coordXDec value for this PersonaExtendida.
     * 
     * @return coordXDec
     */
    public java.lang.Double getCoordXDec() {
        return coordXDec;
    }


    /**
     * Sets the coordXDec value for this PersonaExtendida.
     * 
     * @param coordXDec
     */
    public void setCoordXDec(java.lang.Double coordXDec) {
        this.coordXDec = coordXDec;
    }


    /**
     * Gets the fechaHora value for this PersonaExtendida.
     * 
     * @return fechaHora
     */
    public java.util.Calendar getFechaHora() {
        return fechaHora;
    }


    /**
     * Sets the fechaHora value for this PersonaExtendida.
     * 
     * @param fechaHora
     */
    public void setFechaHora(java.util.Calendar fechaHora) {
        this.fechaHora = fechaHora;
    }


    /**
     * Gets the id value for this PersonaExtendida.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this PersonaExtendida.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersonaExtendida)) return false;
        PersonaExtendida other = (PersonaExtendida) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.coordYDec==null && other.getCoordYDec()==null) || 
             (this.coordYDec!=null &&
              this.coordYDec.equals(other.getCoordYDec()))) &&
            ((this.usuario==null && other.getUsuario()==null) || 
             (this.usuario!=null &&
              this.usuario.equals(other.getUsuario()))) &&
            ((this.coordYLeg==null && other.getCoordYLeg()==null) || 
             (this.coordYLeg!=null &&
              this.coordYLeg.equals(other.getCoordYLeg()))) &&
            ((this.calleIntDec==null && other.getCalleIntDec()==null) || 
             (this.calleIntDec!=null &&
              this.calleIntDec.equals(other.getCalleIntDec()))) &&
            ((this.coordXLeg==null && other.getCoordXLeg()==null) || 
             (this.coordXLeg!=null &&
              this.coordXLeg.equals(other.getCoordXLeg()))) &&
            this.idPersona == other.getIdPersona() &&
            ((this.coordXDec==null && other.getCoordXDec()==null) || 
             (this.coordXDec!=null &&
              this.coordXDec.equals(other.getCoordXDec()))) &&
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
        if (getCoordYDec() != null) {
            _hashCode += getCoordYDec().hashCode();
        }
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        if (getCoordYLeg() != null) {
            _hashCode += getCoordYLeg().hashCode();
        }
        if (getCalleIntDec() != null) {
            _hashCode += getCalleIntDec().hashCode();
        }
        if (getCoordXLeg() != null) {
            _hashCode += getCoordXLeg().hashCode();
        }
        _hashCode += getIdPersona();
        if (getCoordXDec() != null) {
            _hashCode += getCoordXDec().hashCode();
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
        new org.apache.axis.description.TypeDesc(PersonaExtendida.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "PersonaExtendida"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coordYDec");
        elemField.setXmlName(new javax.xml.namespace.QName("", "coordYDec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coordYLeg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "coordYLeg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calleIntDec");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calleIntDec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "Calle"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coordXLeg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "coordXLeg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPersona");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idPersona"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coordXDec");
        elemField.setXmlName(new javax.xml.namespace.QName("", "coordXDec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "double"));
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

}
