/**
 * ResBusPersonaFisica.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.gov.rosario.administracionweb.ws.persona.model;

public class ResBusPersonaFisica  implements java.io.Serializable {
    private int total;

    private ar.gov.rosario.administracionweb.ws.persona.model.PersonaFisica[] respuesta;

    public ResBusPersonaFisica() {
    }

    public ResBusPersonaFisica(
           int total,
           ar.gov.rosario.administracionweb.ws.persona.model.PersonaFisica[] respuesta) {
           this.total = total;
           this.respuesta = respuesta;
    }


    /**
     * Gets the total value for this ResBusPersonaFisica.
     * 
     * @return total
     */
    public int getTotal() {
        return total;
    }


    /**
     * Sets the total value for this ResBusPersonaFisica.
     * 
     * @param total
     */
    public void setTotal(int total) {
        this.total = total;
    }


    /**
     * Gets the respuesta value for this ResBusPersonaFisica.
     * 
     * @return respuesta
     */
    public ar.gov.rosario.administracionweb.ws.persona.model.PersonaFisica[] getRespuesta() {
        return respuesta;
    }


    /**
     * Sets the respuesta value for this ResBusPersonaFisica.
     * 
     * @param respuesta
     */
    public void setRespuesta(ar.gov.rosario.administracionweb.ws.persona.model.PersonaFisica[] respuesta) {
        this.respuesta = respuesta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResBusPersonaFisica)) return false;
        ResBusPersonaFisica other = (ResBusPersonaFisica) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.total == other.getTotal() &&
            ((this.respuesta==null && other.getRespuesta()==null) || 
             (this.respuesta!=null &&
              java.util.Arrays.equals(this.respuesta, other.getRespuesta())));
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
        _hashCode += getTotal();
        if (getRespuesta() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRespuesta());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRespuesta(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResBusPersonaFisica.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "ResBusPersonaFisica"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("", "total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respuesta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "respuesta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "PersonaFisica"));
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
