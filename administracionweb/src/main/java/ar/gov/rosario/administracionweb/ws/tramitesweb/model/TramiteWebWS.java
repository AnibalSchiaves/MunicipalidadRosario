//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2014.08.13 a las 10:21:32 AM ART 
//


package ar.gov.rosario.administracionweb.ws.tramitesweb.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TramiteWebWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TramiteWebWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idTipo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idObjeto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TramiteWebWS", propOrder = {
    "idTipo",
    "ip",
    "idObjeto",
    "usuario"
})
public class TramiteWebWS {

    protected int idTipo;
    @XmlElement(required = true)
    protected String ip;
    @XmlElement(required = true)
    protected String idObjeto;
    @XmlElement(required = true, nillable = true)
    protected String usuario;

    /**
     * Obtiene el valor de la propiedad idTipo.
     * 
     */
    public int getIdTipo() {
        return idTipo;
    }

    /**
     * Define el valor de la propiedad idTipo.
     * 
     */
    public void setIdTipo(int value) {
        this.idTipo = value;
    }

    /**
     * Obtiene el valor de la propiedad ip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIp() {
        return ip;
    }

    /**
     * Define el valor de la propiedad ip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIp(String value) {
        this.ip = value;
    }

    /**
     * Obtiene el valor de la propiedad idObjeto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdObjeto() {
        return idObjeto;
    }

    /**
     * Define el valor de la propiedad idObjeto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdObjeto(String value) {
        this.idObjeto = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

}
