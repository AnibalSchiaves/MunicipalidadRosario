/**
 * Operacion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.gov.rosario.administracionweb.ws.persona.model;

public class Operacion  implements java.io.Serializable {
    private boolean resultado;

    private java.lang.String mensaje;

    private int codigo;

    private ar.gov.rosario.administracionweb.ws.persona.model.IdPersona idPersona;

    private int idInt;

    public Operacion() {
    }

    public Operacion(
           boolean resultado,
           java.lang.String mensaje,
           int codigo,
           ar.gov.rosario.administracionweb.ws.persona.model.IdPersona idPersona,
           int idInt) {
           this.resultado = resultado;
           this.mensaje = mensaje;
           this.codigo = codigo;
           this.idPersona = idPersona;
           this.idInt = idInt;
    }


    /**
     * Gets the resultado value for this Operacion.
     * 
     * @return resultado
     */
    public boolean isResultado() {
        return resultado;
    }


    /**
     * Sets the resultado value for this Operacion.
     * 
     * @param resultado
     */
    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }


    /**
     * Gets the mensaje value for this Operacion.
     * 
     * @return mensaje
     */
    public java.lang.String getMensaje() {
        return mensaje;
    }


    /**
     * Sets the mensaje value for this Operacion.
     * 
     * @param mensaje
     */
    public void setMensaje(java.lang.String mensaje) {
        this.mensaje = mensaje;
    }


    /**
     * Gets the codigo value for this Operacion.
     * 
     * @return codigo
     */
    public int getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this Operacion.
     * 
     * @param codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets the idPersona value for this Operacion.
     * 
     * @return idPersona
     */
    public ar.gov.rosario.administracionweb.ws.persona.model.IdPersona getIdPersona() {
        return idPersona;
    }


    /**
     * Sets the idPersona value for this Operacion.
     * 
     * @param idPersona
     */
    public void setIdPersona(ar.gov.rosario.administracionweb.ws.persona.model.IdPersona idPersona) {
        this.idPersona = idPersona;
    }


    /**
     * Gets the idInt value for this Operacion.
     * 
     * @return idInt
     */
    public int getIdInt() {
        return idInt;
    }


    /**
     * Sets the idInt value for this Operacion.
     * 
     * @param idInt
     */
    public void setIdInt(int idInt) {
        this.idInt = idInt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Operacion)) return false;
        Operacion other = (Operacion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.resultado == other.isResultado() &&
            ((this.mensaje==null && other.getMensaje()==null) || 
             (this.mensaje!=null &&
              this.mensaje.equals(other.getMensaje()))) &&
            this.codigo == other.getCodigo() &&
            ((this.idPersona==null && other.getIdPersona()==null) || 
             (this.idPersona!=null &&
              this.idPersona.equals(other.getIdPersona()))) &&
            this.idInt == other.getIdInt();
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
        _hashCode += (isResultado() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMensaje() != null) {
            _hashCode += getMensaje().hashCode();
        }
        _hashCode += getCodigo();
        if (getIdPersona() != null) {
            _hashCode += getIdPersona().hashCode();
        }
        _hashCode += getIdInt();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Operacion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "Operacion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensaje");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mensaje"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPersona");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idPersona"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "IdPersona"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idInt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idInt"));
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
