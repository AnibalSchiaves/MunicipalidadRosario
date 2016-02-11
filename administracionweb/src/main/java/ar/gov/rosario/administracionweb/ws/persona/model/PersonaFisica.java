/**
 * PersonaFisica.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.gov.rosario.administracionweb.ws.persona.model;

public class PersonaFisica  extends ar.gov.rosario.administracionweb.ws.persona.model.Persona  implements java.io.Serializable {
    private java.util.Calendar nacimiento;

    private ar.gov.rosario.administracionweb.ws.persona.model.EstadoCivil estadoCivil;

    private ar.gov.rosario.administracionweb.ws.persona.model.Direccion domicilioLegal;

    private java.lang.String apellido;

    private ar.gov.rosario.administracionweb.ws.persona.model.Documento documento;

    private java.lang.String sexo;

    private ar.gov.rosario.administracionweb.ws.persona.model.Profesion profesion;

    private java.util.Calendar deceso;

    private java.lang.String apellidoMaterno;

    private ar.gov.rosario.administracionweb.ws.persona.model.Direccion domicilioDeclarado;

    private ar.gov.rosario.administracionweb.ws.persona.model.Pais nacionalidad;

    private ar.gov.rosario.administracionweb.ws.persona.model.Telefono telefono;

    public PersonaFisica() {
    }

    public PersonaFisica(
           java.lang.String nombre,
           java.lang.String usuario,
           ar.gov.rosario.administracionweb.ws.persona.model.IdPersona idPersona,
           java.util.Calendar fechaHora,
           int id,
           java.util.Calendar nacimiento,
           ar.gov.rosario.administracionweb.ws.persona.model.EstadoCivil estadoCivil,
           ar.gov.rosario.administracionweb.ws.persona.model.Direccion domicilioLegal,
           java.lang.String apellido,
           ar.gov.rosario.administracionweb.ws.persona.model.Documento documento,
           java.lang.String sexo,
           ar.gov.rosario.administracionweb.ws.persona.model.Profesion profesion,
           java.util.Calendar deceso,
           java.lang.String apellidoMaterno,
           ar.gov.rosario.administracionweb.ws.persona.model.Direccion domicilioDeclarado,
           ar.gov.rosario.administracionweb.ws.persona.model.Pais nacionalidad,
           ar.gov.rosario.administracionweb.ws.persona.model.Telefono telefono) {
        super(
            nombre,
            usuario,
            idPersona,
            fechaHora,
            id);
        this.nacimiento = nacimiento;
        this.estadoCivil = estadoCivil;
        this.domicilioLegal = domicilioLegal;
        this.apellido = apellido;
        this.documento = documento;
        this.sexo = sexo;
        this.profesion = profesion;
        this.deceso = deceso;
        this.apellidoMaterno = apellidoMaterno;
        this.domicilioDeclarado = domicilioDeclarado;
        this.nacionalidad = nacionalidad;
        this.telefono = telefono;
    }


    /**
     * Gets the nacimiento value for this PersonaFisica.
     * 
     * @return nacimiento
     */
    public java.util.Calendar getNacimiento() {
        return nacimiento;
    }


    /**
     * Sets the nacimiento value for this PersonaFisica.
     * 
     * @param nacimiento
     */
    public void setNacimiento(java.util.Calendar nacimiento) {
        this.nacimiento = nacimiento;
    }


    /**
     * Gets the estadoCivil value for this PersonaFisica.
     * 
     * @return estadoCivil
     */
    public ar.gov.rosario.administracionweb.ws.persona.model.EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }


    /**
     * Sets the estadoCivil value for this PersonaFisica.
     * 
     * @param estadoCivil
     */
    public void setEstadoCivil(ar.gov.rosario.administracionweb.ws.persona.model.EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }


    /**
     * Gets the domicilioLegal value for this PersonaFisica.
     * 
     * @return domicilioLegal
     */
    public ar.gov.rosario.administracionweb.ws.persona.model.Direccion getDomicilioLegal() {
        return domicilioLegal;
    }


    /**
     * Sets the domicilioLegal value for this PersonaFisica.
     * 
     * @param domicilioLegal
     */
    public void setDomicilioLegal(ar.gov.rosario.administracionweb.ws.persona.model.Direccion domicilioLegal) {
        this.domicilioLegal = domicilioLegal;
    }


    /**
     * Gets the apellido value for this PersonaFisica.
     * 
     * @return apellido
     */
    public java.lang.String getApellido() {
        return apellido;
    }


    /**
     * Sets the apellido value for this PersonaFisica.
     * 
     * @param apellido
     */
    public void setApellido(java.lang.String apellido) {
        this.apellido = apellido;
    }


    /**
     * Gets the documento value for this PersonaFisica.
     * 
     * @return documento
     */
    public ar.gov.rosario.administracionweb.ws.persona.model.Documento getDocumento() {
        return documento;
    }


    /**
     * Sets the documento value for this PersonaFisica.
     * 
     * @param documento
     */
    public void setDocumento(ar.gov.rosario.administracionweb.ws.persona.model.Documento documento) {
        this.documento = documento;
    }


    /**
     * Gets the sexo value for this PersonaFisica.
     * 
     * @return sexo
     */
    public java.lang.String getSexo() {
        return sexo;
    }


    /**
     * Sets the sexo value for this PersonaFisica.
     * 
     * @param sexo
     */
    public void setSexo(java.lang.String sexo) {
        this.sexo = sexo;
    }


    /**
     * Gets the profesion value for this PersonaFisica.
     * 
     * @return profesion
     */
    public ar.gov.rosario.administracionweb.ws.persona.model.Profesion getProfesion() {
        return profesion;
    }


    /**
     * Sets the profesion value for this PersonaFisica.
     * 
     * @param profesion
     */
    public void setProfesion(ar.gov.rosario.administracionweb.ws.persona.model.Profesion profesion) {
        this.profesion = profesion;
    }


    /**
     * Gets the deceso value for this PersonaFisica.
     * 
     * @return deceso
     */
    public java.util.Calendar getDeceso() {
        return deceso;
    }


    /**
     * Sets the deceso value for this PersonaFisica.
     * 
     * @param deceso
     */
    public void setDeceso(java.util.Calendar deceso) {
        this.deceso = deceso;
    }


    /**
     * Gets the apellidoMaterno value for this PersonaFisica.
     * 
     * @return apellidoMaterno
     */
    public java.lang.String getApellidoMaterno() {
        return apellidoMaterno;
    }


    /**
     * Sets the apellidoMaterno value for this PersonaFisica.
     * 
     * @param apellidoMaterno
     */
    public void setApellidoMaterno(java.lang.String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }


    /**
     * Gets the domicilioDeclarado value for this PersonaFisica.
     * 
     * @return domicilioDeclarado
     */
    public ar.gov.rosario.administracionweb.ws.persona.model.Direccion getDomicilioDeclarado() {
        return domicilioDeclarado;
    }


    /**
     * Sets the domicilioDeclarado value for this PersonaFisica.
     * 
     * @param domicilioDeclarado
     */
    public void setDomicilioDeclarado(ar.gov.rosario.administracionweb.ws.persona.model.Direccion domicilioDeclarado) {
        this.domicilioDeclarado = domicilioDeclarado;
    }


    /**
     * Gets the nacionalidad value for this PersonaFisica.
     * 
     * @return nacionalidad
     */
    public ar.gov.rosario.administracionweb.ws.persona.model.Pais getNacionalidad() {
        return nacionalidad;
    }


    /**
     * Sets the nacionalidad value for this PersonaFisica.
     * 
     * @param nacionalidad
     */
    public void setNacionalidad(ar.gov.rosario.administracionweb.ws.persona.model.Pais nacionalidad) {
        this.nacionalidad = nacionalidad;
    }


    /**
     * Gets the telefono value for this PersonaFisica.
     * 
     * @return telefono
     */
    public ar.gov.rosario.administracionweb.ws.persona.model.Telefono getTelefono() {
        return telefono;
    }


    /**
     * Sets the telefono value for this PersonaFisica.
     * 
     * @param telefono
     */
    public void setTelefono(ar.gov.rosario.administracionweb.ws.persona.model.Telefono telefono) {
        this.telefono = telefono;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersonaFisica)) return false;
        PersonaFisica other = (PersonaFisica) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.nacimiento==null && other.getNacimiento()==null) || 
             (this.nacimiento!=null &&
              this.nacimiento.equals(other.getNacimiento()))) &&
            ((this.estadoCivil==null && other.getEstadoCivil()==null) || 
             (this.estadoCivil!=null &&
              this.estadoCivil.equals(other.getEstadoCivil()))) &&
            ((this.domicilioLegal==null && other.getDomicilioLegal()==null) || 
             (this.domicilioLegal!=null &&
              this.domicilioLegal.equals(other.getDomicilioLegal()))) &&
            ((this.apellido==null && other.getApellido()==null) || 
             (this.apellido!=null &&
              this.apellido.equals(other.getApellido()))) &&
            ((this.documento==null && other.getDocumento()==null) || 
             (this.documento!=null &&
              this.documento.equals(other.getDocumento()))) &&
            ((this.sexo==null && other.getSexo()==null) || 
             (this.sexo!=null &&
              this.sexo.equals(other.getSexo()))) &&
            ((this.profesion==null && other.getProfesion()==null) || 
             (this.profesion!=null &&
              this.profesion.equals(other.getProfesion()))) &&
            ((this.deceso==null && other.getDeceso()==null) || 
             (this.deceso!=null &&
              this.deceso.equals(other.getDeceso()))) &&
            ((this.apellidoMaterno==null && other.getApellidoMaterno()==null) || 
             (this.apellidoMaterno!=null &&
              this.apellidoMaterno.equals(other.getApellidoMaterno()))) &&
            ((this.domicilioDeclarado==null && other.getDomicilioDeclarado()==null) || 
             (this.domicilioDeclarado!=null &&
              this.domicilioDeclarado.equals(other.getDomicilioDeclarado()))) &&
            ((this.nacionalidad==null && other.getNacionalidad()==null) || 
             (this.nacionalidad!=null &&
              this.nacionalidad.equals(other.getNacionalidad()))) &&
            ((this.telefono==null && other.getTelefono()==null) || 
             (this.telefono!=null &&
              this.telefono.equals(other.getTelefono())));
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
        if (getNacimiento() != null) {
            _hashCode += getNacimiento().hashCode();
        }
        if (getEstadoCivil() != null) {
            _hashCode += getEstadoCivil().hashCode();
        }
        if (getDomicilioLegal() != null) {
            _hashCode += getDomicilioLegal().hashCode();
        }
        if (getApellido() != null) {
            _hashCode += getApellido().hashCode();
        }
        if (getDocumento() != null) {
            _hashCode += getDocumento().hashCode();
        }
        if (getSexo() != null) {
            _hashCode += getSexo().hashCode();
        }
        if (getProfesion() != null) {
            _hashCode += getProfesion().hashCode();
        }
        if (getDeceso() != null) {
            _hashCode += getDeceso().hashCode();
        }
        if (getApellidoMaterno() != null) {
            _hashCode += getApellidoMaterno().hashCode();
        }
        if (getDomicilioDeclarado() != null) {
            _hashCode += getDomicilioDeclarado().hashCode();
        }
        if (getNacionalidad() != null) {
            _hashCode += getNacionalidad().hashCode();
        }
        if (getTelefono() != null) {
            _hashCode += getTelefono().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersonaFisica.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "PersonaFisica"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nacimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nacimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoCivil");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estadoCivil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "EstadoCivil"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domicilioLegal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domicilioLegal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "Direccion"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apellido");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apellido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "Documento"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sexo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sexo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profesion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "profesion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "Profesion"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deceso");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deceso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apellidoMaterno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apellidoMaterno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domicilioDeclarado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domicilioDeclarado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "Direccion"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nacionalidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nacionalidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "Pais"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefono");
        elemField.setXmlName(new javax.xml.namespace.QName("", "telefono"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://persona.model.ws.rosario.gov.ar", "Telefono"));
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
