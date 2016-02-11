/**
 * Documento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.gov.rosario.administracionweb.ws.persona.model;

public class Documento  implements java.io.Serializable {
    private ar.gov.rosario.administracionweb.ws.persona.model.DocumentoTipo documentoTipo;

    private java.lang.Long numero;

    private java.lang.String numeroAlfa;

    public Documento() {
    }

    public Documento(
           ar.gov.rosario.administracionweb.ws.persona.model.DocumentoTipo documentoTipo,
           java.lang.Long numero,
           java.lang.String numeroAlfa) {
           this.documentoTipo = documentoTipo;
           this.numero = numero;
           this.numeroAlfa = numeroAlfa;
    }


    /**
     * Gets the documentoTipo value for this Documento.
     * 
     * @return documentoTipo
     */
    public ar.gov.rosario.administracionweb.ws.persona.model.DocumentoTipo getDocumentoTipo() {
        return documentoTipo;
    }


    /**
     * Sets the documentoTipo value for this Documento.
     * 
     * @param documentoTipo
     */
    public void setDocumentoTipo(ar.gov.rosario.administracionweb.ws.persona.model.DocumentoTipo documentoTipo) {
        this.documentoTipo = documentoTipo;
    }


    /**
     * Gets the numero value for this Documento.
     * 
     * @return numero
     */
    public java.lang.Long getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this Documento.
     * 
     * @param numero
     */
    public void setNumero(java.lang.Long numero) {
        this.numero = numero;
    }


    /**
     * Gets the numeroAlfa value for this Documento.
     * 
     * @return numeroAlfa
     */
    public java.lang.String getNumeroAlfa() {
        return numeroAlfa;
    }


    /**
     * Sets the numeroAlfa value for this Documento.
     * 
     * @param numeroAlfa
     */
    public void setNumeroAlfa(java.lang.String numeroAlfa) {
        this.numeroAlfa = numeroAlfa;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Documento)) return false;
        Documento other = (Documento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.documentoTipo==null && other.getDocumentoTipo()==null) || 
             (this.documentoTipo!=null &&
              this.documentoTipo.equals(other.getDocumentoTipo()))) &&
            ((this.numero==null && other.getNumero()==null) || 
             (this.numero!=null &&
              this.numero.equals(other.getNumero()))) &&
            ((this.numeroAlfa==null && other.getNumeroAlfa()==null) || 
             (this.numeroAlfa!=null &&
              this.numeroAlfa.equals(other.getNumeroAlfa())));
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
        if (getDocumentoTipo() != null) {
            _hashCode += getDocumentoTipo().hashCode();
        }
        if (getNumero() != null) {
            _hashCode += getNumero().hashCode();
        }
        if (getNumeroAlfa() != null) {
            _hashCode += getNumeroAlfa().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Documento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "Documento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentoTipo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentoTipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "DocumentoTipo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroAlfa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroAlfa"));
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
