/**
 * IdPersona.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.gov.rosario.administracionweb.ws.persona.model;

public class IdPersona  implements java.io.Serializable {
    private java.lang.Integer cuit01;

    private java.lang.String cuit00;

    private java.lang.Long cuit02;

    private java.lang.Integer cuit03;

    public IdPersona() {
    }

    public IdPersona(
           java.lang.Integer cuit01,
           java.lang.String cuit00,
           java.lang.Long cuit02,
           java.lang.Integer cuit03) {
           this.cuit01 = cuit01;
           this.cuit00 = cuit00;
           this.cuit02 = cuit02;
           this.cuit03 = cuit03;
    }


    /**
     * Gets the cuit01 value for this IdPersona.
     * 
     * @return cuit01
     */
    public java.lang.Integer getCuit01() {
        return cuit01;
    }


    /**
     * Sets the cuit01 value for this IdPersona.
     * 
     * @param cuit01
     */
    public void setCuit01(java.lang.Integer cuit01) {
        this.cuit01 = cuit01;
    }


    /**
     * Gets the cuit00 value for this IdPersona.
     * 
     * @return cuit00
     */
    public java.lang.String getCuit00() {
        return cuit00;
    }


    /**
     * Sets the cuit00 value for this IdPersona.
     * 
     * @param cuit00
     */
    public void setCuit00(java.lang.String cuit00) {
        this.cuit00 = cuit00;
    }


    /**
     * Gets the cuit02 value for this IdPersona.
     * 
     * @return cuit02
     */
    public java.lang.Long getCuit02() {
        return cuit02;
    }


    /**
     * Sets the cuit02 value for this IdPersona.
     * 
     * @param cuit02
     */
    public void setCuit02(java.lang.Long cuit02) {
        this.cuit02 = cuit02;
    }


    /**
     * Gets the cuit03 value for this IdPersona.
     * 
     * @return cuit03
     */
    public java.lang.Integer getCuit03() {
        return cuit03;
    }


    /**
     * Sets the cuit03 value for this IdPersona.
     * 
     * @param cuit03
     */
    public void setCuit03(java.lang.Integer cuit03) {
        this.cuit03 = cuit03;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdPersona)) return false;
        IdPersona other = (IdPersona) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cuit01==null && other.getCuit01()==null) || 
             (this.cuit01!=null &&
              this.cuit01.equals(other.getCuit01()))) &&
            ((this.cuit00==null && other.getCuit00()==null) || 
             (this.cuit00!=null &&
              this.cuit00.equals(other.getCuit00()))) &&
            ((this.cuit02==null && other.getCuit02()==null) || 
             (this.cuit02!=null &&
              this.cuit02.equals(other.getCuit02()))) &&
            ((this.cuit03==null && other.getCuit03()==null) || 
             (this.cuit03!=null &&
              this.cuit03.equals(other.getCuit03())));
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
        if (getCuit01() != null) {
            _hashCode += getCuit01().hashCode();
        }
        if (getCuit00() != null) {
            _hashCode += getCuit00().hashCode();
        }
        if (getCuit02() != null) {
            _hashCode += getCuit02().hashCode();
        }
        if (getCuit03() != null) {
            _hashCode += getCuit03().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdPersona.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "IdPersona"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuit01");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cuit01"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuit00");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cuit00"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuit02");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cuit02"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuit03");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cuit03"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
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

	@Override
	public String toString() {
		return "IdPersona [cuit01=" + cuit01 + ", cuit00=" + cuit00 + ", cuit02=" + cuit02 + ", cuit03=" + cuit03 + "]";
	}
    
    

}
