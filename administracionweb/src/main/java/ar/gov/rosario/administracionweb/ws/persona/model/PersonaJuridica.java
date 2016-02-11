/**
 * PersonaJuridica.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.gov.rosario.administracionweb.ws.persona.model;

public class PersonaJuridica  extends ar.gov.rosario.administracionweb.ws.persona.model.Persona  implements java.io.Serializable {
    private java.lang.Integer cantidadSocios;

    private ar.gov.rosario.administracionweb.ws.persona.model.Direccion domicilioLegal;

    private java.lang.Integer folio;

    private ar.gov.rosario.administracionweb.ws.persona.model.SociedadTipo tipo;

    private java.lang.Long tomo;

    private java.util.Calendar fechaInscripcion;

    private java.util.Calendar fechaCierreEjercicio;

    private java.lang.Long nroSociedad;

    public PersonaJuridica() {
    }

    public PersonaJuridica(
           java.lang.String nombre,
           java.lang.String usuario,
           ar.gov.rosario.administracionweb.ws.persona.model.IdPersona idPersona,
           java.util.Calendar fechaHora,
           int id,
           java.lang.Integer cantidadSocios,
           ar.gov.rosario.administracionweb.ws.persona.model.Direccion domicilioLegal,
           java.lang.Integer folio,
           ar.gov.rosario.administracionweb.ws.persona.model.SociedadTipo tipo,
           java.lang.Long tomo,
           java.util.Calendar fechaInscripcion,
           java.util.Calendar fechaCierreEjercicio,
           java.lang.Long nroSociedad) {
        super(
            nombre,
            usuario,
            idPersona,
            fechaHora,
            id);
        this.cantidadSocios = cantidadSocios;
        this.domicilioLegal = domicilioLegal;
        this.folio = folio;
        this.tipo = tipo;
        this.tomo = tomo;
        this.fechaInscripcion = fechaInscripcion;
        this.fechaCierreEjercicio = fechaCierreEjercicio;
        this.nroSociedad = nroSociedad;
    }


    /**
     * Gets the cantidadSocios value for this PersonaJuridica.
     * 
     * @return cantidadSocios
     */
    public java.lang.Integer getCantidadSocios() {
        return cantidadSocios;
    }


    /**
     * Sets the cantidadSocios value for this PersonaJuridica.
     * 
     * @param cantidadSocios
     */
    public void setCantidadSocios(java.lang.Integer cantidadSocios) {
        this.cantidadSocios = cantidadSocios;
    }


    /**
     * Gets the domicilioLegal value for this PersonaJuridica.
     * 
     * @return domicilioLegal
     */
    public ar.gov.rosario.administracionweb.ws.persona.model.Direccion getDomicilioLegal() {
        return domicilioLegal;
    }


    /**
     * Sets the domicilioLegal value for this PersonaJuridica.
     * 
     * @param domicilioLegal
     */
    public void setDomicilioLegal(ar.gov.rosario.administracionweb.ws.persona.model.Direccion domicilioLegal) {
        this.domicilioLegal = domicilioLegal;
    }


    /**
     * Gets the folio value for this PersonaJuridica.
     * 
     * @return folio
     */
    public java.lang.Integer getFolio() {
        return folio;
    }


    /**
     * Sets the folio value for this PersonaJuridica.
     * 
     * @param folio
     */
    public void setFolio(java.lang.Integer folio) {
        this.folio = folio;
    }


    /**
     * Gets the tipo value for this PersonaJuridica.
     * 
     * @return tipo
     */
    public ar.gov.rosario.administracionweb.ws.persona.model.SociedadTipo getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this PersonaJuridica.
     * 
     * @param tipo
     */
    public void setTipo(ar.gov.rosario.administracionweb.ws.persona.model.SociedadTipo tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the tomo value for this PersonaJuridica.
     * 
     * @return tomo
     */
    public java.lang.Long getTomo() {
        return tomo;
    }


    /**
     * Sets the tomo value for this PersonaJuridica.
     * 
     * @param tomo
     */
    public void setTomo(java.lang.Long tomo) {
        this.tomo = tomo;
    }


    /**
     * Gets the fechaInscripcion value for this PersonaJuridica.
     * 
     * @return fechaInscripcion
     */
    public java.util.Calendar getFechaInscripcion() {
        return fechaInscripcion;
    }


    /**
     * Sets the fechaInscripcion value for this PersonaJuridica.
     * 
     * @param fechaInscripcion
     */
    public void setFechaInscripcion(java.util.Calendar fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }


    /**
     * Gets the fechaCierreEjercicio value for this PersonaJuridica.
     * 
     * @return fechaCierreEjercicio
     */
    public java.util.Calendar getFechaCierreEjercicio() {
        return fechaCierreEjercicio;
    }


    /**
     * Sets the fechaCierreEjercicio value for this PersonaJuridica.
     * 
     * @param fechaCierreEjercicio
     */
    public void setFechaCierreEjercicio(java.util.Calendar fechaCierreEjercicio) {
        this.fechaCierreEjercicio = fechaCierreEjercicio;
    }


    /**
     * Gets the nroSociedad value for this PersonaJuridica.
     * 
     * @return nroSociedad
     */
    public java.lang.Long getNroSociedad() {
        return nroSociedad;
    }


    /**
     * Sets the nroSociedad value for this PersonaJuridica.
     * 
     * @param nroSociedad
     */
    public void setNroSociedad(java.lang.Long nroSociedad) {
        this.nroSociedad = nroSociedad;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersonaJuridica)) return false;
        PersonaJuridica other = (PersonaJuridica) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cantidadSocios==null && other.getCantidadSocios()==null) || 
             (this.cantidadSocios!=null &&
              this.cantidadSocios.equals(other.getCantidadSocios()))) &&
            ((this.domicilioLegal==null && other.getDomicilioLegal()==null) || 
             (this.domicilioLegal!=null &&
              this.domicilioLegal.equals(other.getDomicilioLegal()))) &&
            ((this.folio==null && other.getFolio()==null) || 
             (this.folio!=null &&
              this.folio.equals(other.getFolio()))) &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this.tomo==null && other.getTomo()==null) || 
             (this.tomo!=null &&
              this.tomo.equals(other.getTomo()))) &&
            ((this.fechaInscripcion==null && other.getFechaInscripcion()==null) || 
             (this.fechaInscripcion!=null &&
              this.fechaInscripcion.equals(other.getFechaInscripcion()))) &&
            ((this.fechaCierreEjercicio==null && other.getFechaCierreEjercicio()==null) || 
             (this.fechaCierreEjercicio!=null &&
              this.fechaCierreEjercicio.equals(other.getFechaCierreEjercicio()))) &&
            ((this.nroSociedad==null && other.getNroSociedad()==null) || 
             (this.nroSociedad!=null &&
              this.nroSociedad.equals(other.getNroSociedad())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCantidadSocios() != null) {
            _hashCode += getCantidadSocios().hashCode();
        }
        if (getDomicilioLegal() != null) {
            _hashCode += getDomicilioLegal().hashCode();
        }
        if (getFolio() != null) {
            _hashCode += getFolio().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getTomo() != null) {
            _hashCode += getTomo().hashCode();
        }
        if (getFechaInscripcion() != null) {
            _hashCode += getFechaInscripcion().hashCode();
        }
        if (getFechaCierreEjercicio() != null) {
            _hashCode += getFechaCierreEjercicio().hashCode();
        }
        if (getNroSociedad() != null) {
            _hashCode += getNroSociedad().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersonaJuridica.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "PersonaJuridica"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cantidadSocios");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cantidadSocios"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domicilioLegal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domicilioLegal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "Direccion"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "folio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "SociedadTipo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tomo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tomo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaInscripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaInscripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaCierreEjercicio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaCierreEjercicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroSociedad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nroSociedad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "long"));
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
