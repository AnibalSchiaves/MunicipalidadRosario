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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tramiteWeb" type="{http://www.rosario.gov.ar/Tramitesweb/schema}TramiteWebWS"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tramiteWeb"
})
@XmlRootElement(name = "auditarTramiteWebRequest")
public class AuditarTramiteWebRequest {

    @XmlElement(required = true)
    protected TramiteWebWS tramiteWeb;

    /**
     * Obtiene el valor de la propiedad tramiteWeb.
     * 
     * @return
     *     possible object is
     *     {@link TramiteWebWS }
     *     
     */
    public TramiteWebWS getTramiteWeb() {
        return tramiteWeb;
    }

    /**
     * Define el valor de la propiedad tramiteWeb.
     * 
     * @param value
     *     allowed object is
     *     {@link TramiteWebWS }
     *     
     */
    public void setTramiteWeb(TramiteWebWS value) {
        this.tramiteWeb = value;
    }

}
