/**
 * IdLocalidad.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.gov.rosario.administracionweb.ws.persona.model;

public class IdLocalidad  implements java.io.Serializable {
    private int subPostal;

    private long codPostal;

    public IdLocalidad() {
    }

    public IdLocalidad(
           int subPostal,
           long codPostal) {
           this.subPostal = subPostal;
           this.codPostal = codPostal;
    }


    /**
     * Gets the subPostal value for this IdLocalidad.
     * 
     * @return subPostal
     */
    public int getSubPostal() {
        return subPostal;
    }


    /**
     * Sets the subPostal value for this IdLocalidad.
     * 
     * @param subPostal
     */
    public void setSubPostal(int subPostal) {
        this.subPostal = subPostal;
    }


    /**
     * Gets the codPostal value for this IdLocalidad.
     * 
     * @return codPostal
     */
    public long getCodPostal() {
        return codPostal;
    }


    /**
     * Sets the codPostal value for this IdLocalidad.
     * 
     * @param codPostal
     */
    public void setCodPostal(long codPostal) {
        this.codPostal = codPostal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdLocalidad)) return false;
        IdLocalidad other = (IdLocalidad) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.subPostal == other.getSubPostal() &&
            this.codPostal == other.getCodPostal();
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
        _hashCode += getSubPostal();
        _hashCode += new Long(getCodPostal()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdLocalidad.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "IdLocalidad"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subPostal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subPostal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codPostal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codPostal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
