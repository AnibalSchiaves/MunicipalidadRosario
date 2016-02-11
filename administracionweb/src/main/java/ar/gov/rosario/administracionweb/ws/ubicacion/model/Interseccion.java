/**
 * Interseccion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package ar.gov.rosario.administracionweb.ws.ubicacion.model;

public class Interseccion  implements java.io.Serializable {
    private Calle calle1;
    private Calle calle2;
    private DivisionAdministrativa[] divsAdmins;
    private double puntoX;
    private double puntoY;

    public Interseccion() {
    }

    public Calle getCalle1() {
        return calle1;
    }

    public void setCalle1(Calle calle1) {
        this.calle1 = calle1;
    }

    public Calle getCalle2() {
        return calle2;
    }

    public void setCalle2(Calle calle2) {
        this.calle2 = calle2;
    }

    public DivisionAdministrativa[] getDivsAdmins() {
        return divsAdmins;
    }

    public void setDivsAdmins(DivisionAdministrativa[] divsAdmins) {
        this.divsAdmins = divsAdmins;
    }

    public double getPuntoX() {
        return puntoX;
    }

    public void setPuntoX(double puntoX) {
        this.puntoX = puntoX;
    }

    public double getPuntoY() {
        return puntoY;
    }

    public void setPuntoY(double puntoY) {
        this.puntoY = puntoY;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Interseccion)) return false;
        Interseccion other = (Interseccion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.calle1==null && other.getCalle1()==null) || 
             (this.calle1!=null &&
              this.calle1.equals(other.getCalle1()))) &&
            ((this.calle2==null && other.getCalle2()==null) || 
             (this.calle2!=null &&
              this.calle2.equals(other.getCalle2()))) &&
            ((this.divsAdmins==null && other.getDivsAdmins()==null) || 
             (this.divsAdmins!=null &&
              java.util.Arrays.equals(this.divsAdmins, other.getDivsAdmins()))) &&
            this.puntoX == other.getPuntoX() &&
            this.puntoY == other.getPuntoY();
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
        if (getCalle1() != null) {
            _hashCode += getCalle1().hashCode();
        }
        if (getCalle2() != null) {
            _hashCode += getCalle2().hashCode();
        }
        if (getDivsAdmins() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDivsAdmins());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDivsAdmins(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Double(getPuntoX()).hashCode();
        _hashCode += new Double(getPuntoY()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Interseccion.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ubicacion.model.ws.rosario.gov.ar", "Interseccion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calle1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calle1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ubicacion.model.ws.rosario.gov.ar", "Calle"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calle2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calle2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ubicacion.model.ws.rosario.gov.ar", "Calle"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("divsAdmins");
        elemField.setXmlName(new javax.xml.namespace.QName("", "divsAdmins"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ubicacion.model.ws.rosario.gov.ar", "DivisionAdministrativa"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("puntoX");
        elemField.setXmlName(new javax.xml.namespace.QName("", "puntoX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("puntoY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "puntoY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
