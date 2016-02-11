/**
 * Direccion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package ar.gov.rosario.administracionweb.ws.ubicacion.model;

public class Direccion  implements java.io.Serializable {
    private int altura;
    private boolean bis;
    private Calle calle;
    private DivisionAdministrativa[] divsAdmins;
    private java.lang.String letra;
    private double puntoX;
    private double puntoY;

    public Direccion() {
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean isBis() {
        return bis;
    }

    public void setBis(boolean bis) {
        this.bis = bis;
    }

    public Calle getCalle() {
        return calle;
    }

    public void setCalle(Calle calle) {
        this.calle = calle;
    }

    public DivisionAdministrativa[] getDivsAdmins() {
        return divsAdmins;
    }

    public void setDivsAdmins(DivisionAdministrativa[] divsAdmins) {
        this.divsAdmins = divsAdmins;
    }

    public java.lang.String getLetra() {
        return letra;
    }

    public void setLetra(java.lang.String letra) {
        this.letra = letra;
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
        if (!(obj instanceof Direccion)) return false;
        Direccion other = (Direccion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.altura == other.getAltura() &&
            this.bis == other.isBis() &&
            ((this.calle==null && other.getCalle()==null) || 
             (this.calle!=null &&
              this.calle.equals(other.getCalle()))) &&
            ((this.divsAdmins==null && other.getDivsAdmins()==null) || 
             (this.divsAdmins!=null &&
              java.util.Arrays.equals(this.divsAdmins, other.getDivsAdmins()))) &&
            ((this.letra==null && other.getLetra()==null) || 
             (this.letra!=null &&
              this.letra.equals(other.getLetra()))) &&
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
        _hashCode += getAltura();
        _hashCode += new Boolean(isBis()).hashCode();
        if (getCalle() != null) {
            _hashCode += getCalle().hashCode();
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
        if (getLetra() != null) {
            _hashCode += getLetra().hashCode();
        }
        _hashCode += new Double(getPuntoX()).hashCode();
        _hashCode += new Double(getPuntoY()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Direccion.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ubicacion.model.ws.rosario.gov.ar", "Direccion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altura");
        elemField.setXmlName(new javax.xml.namespace.QName("", "altura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bis");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ubicacion.model.ws.rosario.gov.ar", "Calle"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("divsAdmins");
        elemField.setXmlName(new javax.xml.namespace.QName("", "divsAdmins"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ubicacion.model.ws.rosario.gov.ar", "DivisionAdministrativa"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("letra");
        elemField.setXmlName(new javax.xml.namespace.QName("", "letra"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
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
