/**
 * Direccion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.gov.rosario.administracionweb.ws.persona.model;

public class Direccion  implements java.io.Serializable {
    private java.lang.String nombreCalle;

    private boolean bis;

    private java.lang.String letraCalle;

    private java.lang.String nombreLocalidad;

    private java.lang.Integer piso;

    private java.lang.String depto;

    private java.lang.String observaciones;

    private java.lang.Long numero;

    private java.lang.String letraNumero;

    private java.util.Calendar fechaHora;

    private ar.gov.rosario.administracionweb.ws.persona.model.Pais pais;

    private ar.gov.rosario.administracionweb.ws.persona.model.Localidad localidad;

    private java.lang.String monoblock;

    private ar.gov.rosario.administracionweb.ws.persona.model.Calle calle;

    public Direccion() {
    }

    public Direccion(
           java.lang.String nombreCalle,
           boolean bis,
           java.lang.String letraCalle,
           java.lang.String nombreLocalidad,
           java.lang.Integer piso,
           java.lang.String depto,
           java.lang.String observaciones,
           java.lang.Long numero,
           java.lang.String letraNumero,
           java.util.Calendar fechaHora,
           ar.gov.rosario.administracionweb.ws.persona.model.Pais pais,
           ar.gov.rosario.administracionweb.ws.persona.model.Localidad localidad,
           java.lang.String monoblock,
           ar.gov.rosario.administracionweb.ws.persona.model.Calle calle) {
           this.nombreCalle = nombreCalle;
           this.bis = bis;
           this.letraCalle = letraCalle;
           this.nombreLocalidad = nombreLocalidad;
           this.piso = piso;
           this.depto = depto;
           this.observaciones = observaciones;
           this.numero = numero;
           this.letraNumero = letraNumero;
           this.fechaHora = fechaHora;
           this.pais = pais;
           this.localidad = localidad;
           this.monoblock = monoblock;
           this.calle = calle;
    }


    /**
     * Gets the nombreCalle value for this Direccion.
     * 
     * @return nombreCalle
     */
    public java.lang.String getNombreCalle() {
        return nombreCalle;
    }


    /**
     * Sets the nombreCalle value for this Direccion.
     * 
     * @param nombreCalle
     */
    public void setNombreCalle(java.lang.String nombreCalle) {
        this.nombreCalle = nombreCalle;
    }


    /**
     * Gets the bis value for this Direccion.
     * 
     * @return bis
     */
    public boolean isBis() {
        return bis;
    }


    /**
     * Sets the bis value for this Direccion.
     * 
     * @param bis
     */
    public void setBis(boolean bis) {
        this.bis = bis;
    }


    /**
     * Gets the letraCalle value for this Direccion.
     * 
     * @return letraCalle
     */
    public java.lang.String getLetraCalle() {
        return letraCalle;
    }


    /**
     * Sets the letraCalle value for this Direccion.
     * 
     * @param letraCalle
     */
    public void setLetraCalle(java.lang.String letraCalle) {
        this.letraCalle = letraCalle;
    }


    /**
     * Gets the nombreLocalidad value for this Direccion.
     * 
     * @return nombreLocalidad
     */
    public java.lang.String getNombreLocalidad() {
        return nombreLocalidad;
    }


    /**
     * Sets the nombreLocalidad value for this Direccion.
     * 
     * @param nombreLocalidad
     */
    public void setNombreLocalidad(java.lang.String nombreLocalidad) {
        this.nombreLocalidad = nombreLocalidad;
    }


    /**
     * Gets the piso value for this Direccion.
     * 
     * @return piso
     */
    public java.lang.Integer getPiso() {
        return piso;
    }


    /**
     * Sets the piso value for this Direccion.
     * 
     * @param piso
     */
    public void setPiso(java.lang.Integer piso) {
        this.piso = piso;
    }


    /**
     * Gets the depto value for this Direccion.
     * 
     * @return depto
     */
    public java.lang.String getDepto() {
        return depto;
    }


    /**
     * Sets the depto value for this Direccion.
     * 
     * @param depto
     */
    public void setDepto(java.lang.String depto) {
        this.depto = depto;
    }


    /**
     * Gets the observaciones value for this Direccion.
     * 
     * @return observaciones
     */
    public java.lang.String getObservaciones() {
        return observaciones;
    }


    /**
     * Sets the observaciones value for this Direccion.
     * 
     * @param observaciones
     */
    public void setObservaciones(java.lang.String observaciones) {
        this.observaciones = observaciones;
    }


    /**
     * Gets the numero value for this Direccion.
     * 
     * @return numero
     */
    public java.lang.Long getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this Direccion.
     * 
     * @param numero
     */
    public void setNumero(java.lang.Long numero) {
        this.numero = numero;
    }


    /**
     * Gets the letraNumero value for this Direccion.
     * 
     * @return letraNumero
     */
    public java.lang.String getLetraNumero() {
        return letraNumero;
    }


    /**
     * Sets the letraNumero value for this Direccion.
     * 
     * @param letraNumero
     */
    public void setLetraNumero(java.lang.String letraNumero) {
        this.letraNumero = letraNumero;
    }


    /**
     * Gets the fechaHora value for this Direccion.
     * 
     * @return fechaHora
     */
    public java.util.Calendar getFechaHora() {
        return fechaHora;
    }


    /**
     * Sets the fechaHora value for this Direccion.
     * 
     * @param fechaHora
     */
    public void setFechaHora(java.util.Calendar fechaHora) {
        this.fechaHora = fechaHora;
    }


    /**
     * Gets the pais value for this Direccion.
     * 
     * @return pais
     */
    public ar.gov.rosario.administracionweb.ws.persona.model.Pais getPais() {
        return pais;
    }


    /**
     * Sets the pais value for this Direccion.
     * 
     * @param pais
     */
    public void setPais(ar.gov.rosario.administracionweb.ws.persona.model.Pais pais) {
        this.pais = pais;
    }


    /**
     * Gets the localidad value for this Direccion.
     * 
     * @return localidad
     */
    public ar.gov.rosario.administracionweb.ws.persona.model.Localidad getLocalidad() {
        return localidad;
    }


    /**
     * Sets the localidad value for this Direccion.
     * 
     * @param localidad
     */
    public void setLocalidad(ar.gov.rosario.administracionweb.ws.persona.model.Localidad localidad) {
        this.localidad = localidad;
    }


    /**
     * Gets the monoblock value for this Direccion.
     * 
     * @return monoblock
     */
    public java.lang.String getMonoblock() {
        return monoblock;
    }


    /**
     * Sets the monoblock value for this Direccion.
     * 
     * @param monoblock
     */
    public void setMonoblock(java.lang.String monoblock) {
        this.monoblock = monoblock;
    }


    /**
     * Gets the calle value for this Direccion.
     * 
     * @return calle
     */
    public ar.gov.rosario.administracionweb.ws.persona.model.Calle getCalle() {
        return calle;
    }


    /**
     * Sets the calle value for this Direccion.
     * 
     * @param calle
     */
    public void setCalle(ar.gov.rosario.administracionweb.ws.persona.model.Calle calle) {
        this.calle = calle;
    }
    
    /*public String getDescripcionCalle() {
    	if (calle != null || calle.getId() == 0) {
    		return calle.getNombre();
    	} else {
    		return nombreCalle;
    	}
    }
    public void setDescripcionCalle(String descripcionCalle) {
    	nombreCalle = descripcionCalle;
    	
    }*/

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
            ((this.nombreCalle==null && other.getNombreCalle()==null) || 
             (this.nombreCalle!=null &&
              this.nombreCalle.equals(other.getNombreCalle()))) &&
            this.bis == other.isBis() &&
            ((this.letraCalle==null && other.getLetraCalle()==null) || 
             (this.letraCalle!=null &&
              this.letraCalle.equals(other.getLetraCalle()))) &&
            ((this.nombreLocalidad==null && other.getNombreLocalidad()==null) || 
             (this.nombreLocalidad!=null &&
              this.nombreLocalidad.equals(other.getNombreLocalidad()))) &&
            ((this.piso==null && other.getPiso()==null) || 
             (this.piso!=null &&
              this.piso.equals(other.getPiso()))) &&
            ((this.depto==null && other.getDepto()==null) || 
             (this.depto!=null &&
              this.depto.equals(other.getDepto()))) &&
            ((this.observaciones==null && other.getObservaciones()==null) || 
             (this.observaciones!=null &&
              this.observaciones.equals(other.getObservaciones()))) &&
            ((this.numero==null && other.getNumero()==null) || 
             (this.numero!=null &&
              this.numero.equals(other.getNumero()))) &&
            ((this.letraNumero==null && other.getLetraNumero()==null) || 
             (this.letraNumero!=null &&
              this.letraNumero.equals(other.getLetraNumero()))) &&
            ((this.fechaHora==null && other.getFechaHora()==null) || 
             (this.fechaHora!=null &&
              this.fechaHora.equals(other.getFechaHora()))) &&
            ((this.pais==null && other.getPais()==null) || 
             (this.pais!=null &&
              this.pais.equals(other.getPais()))) &&
            ((this.localidad==null && other.getLocalidad()==null) || 
             (this.localidad!=null &&
              this.localidad.equals(other.getLocalidad()))) &&
            ((this.monoblock==null && other.getMonoblock()==null) || 
             (this.monoblock!=null &&
              this.monoblock.equals(other.getMonoblock()))) &&
            ((this.calle==null && other.getCalle()==null) || 
             (this.calle!=null &&
              this.calle.equals(other.getCalle())));
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
        if (getNombreCalle() != null) {
            _hashCode += getNombreCalle().hashCode();
        }
        _hashCode += (isBis() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLetraCalle() != null) {
            _hashCode += getLetraCalle().hashCode();
        }
        if (getNombreLocalidad() != null) {
            _hashCode += getNombreLocalidad().hashCode();
        }
        if (getPiso() != null) {
            _hashCode += getPiso().hashCode();
        }
        if (getDepto() != null) {
            _hashCode += getDepto().hashCode();
        }
        if (getObservaciones() != null) {
            _hashCode += getObservaciones().hashCode();
        }
        if (getNumero() != null) {
            _hashCode += getNumero().hashCode();
        }
        if (getLetraNumero() != null) {
            _hashCode += getLetraNumero().hashCode();
        }
        if (getFechaHora() != null) {
            _hashCode += getFechaHora().hashCode();
        }
        if (getPais() != null) {
            _hashCode += getPais().hashCode();
        }
        if (getLocalidad() != null) {
            _hashCode += getLocalidad().hashCode();
        }
        if (getMonoblock() != null) {
            _hashCode += getMonoblock().hashCode();
        }
        if (getCalle() != null) {
            _hashCode += getCalle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Direccion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "Direccion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreCalle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombreCalle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bis");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("letraCalle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "letraCalle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreLocalidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombreLocalidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("piso");
        elemField.setXmlName(new javax.xml.namespace.QName("", "piso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("observaciones");
        elemField.setXmlName(new javax.xml.namespace.QName("", "observaciones"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("letraNumero");
        elemField.setXmlName(new javax.xml.namespace.QName("", "letraNumero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaHora");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaHora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pais");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pais"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "Pais"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "Localidad"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monoblock");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monoblock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "Calle"));
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
