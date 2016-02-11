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
 * <p>Clase Java para InfoConsultaWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InfoConsultaWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sistema" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="criterioSeleccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombreArchivo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cantRegistros" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "InfoConsultaWS", propOrder = {
    "sistema",
    "criterioSeleccion",
    "nombreArchivo",
    "cantRegistros",
    "usuario"
})
public class InfoConsultaWS {

    @XmlElement(required = true)
    protected String sistema;
    @XmlElement(required = true)
    protected String criterioSeleccion;
    @XmlElement(required = true)
    protected String nombreArchivo;
    protected int cantRegistros;
    @XmlElement(required = true)
    protected String usuario;

    /**
     * Obtiene el valor de la propiedad sistema.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSistema() {
        return sistema;
    }

    /**
     * Define el valor de la propiedad sistema.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSistema(String value) {
        this.sistema = value;
    }

    /**
     * Obtiene el valor de la propiedad criterioSeleccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriterioSeleccion() {
        return criterioSeleccion;
    }

    /**
     * Define el valor de la propiedad criterioSeleccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriterioSeleccion(String value) {
        this.criterioSeleccion = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreArchivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreArchivo() {
        return nombreArchivo;
    }

    /**
     * Define el valor de la propiedad nombreArchivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreArchivo(String value) {
        this.nombreArchivo = value;
    }

    /**
     * Obtiene el valor de la propiedad cantRegistros.
     * 
     */
    public int getCantRegistros() {
        return cantRegistros;
    }

    /**
     * Define el valor de la propiedad cantRegistros.
     * 
     */
    public void setCantRegistros(int value) {
        this.cantRegistros = value;
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
