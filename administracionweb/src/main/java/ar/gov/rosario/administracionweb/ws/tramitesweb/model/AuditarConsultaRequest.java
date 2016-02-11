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
 *         &lt;element name="infoConsulta" type="{http://www.rosario.gov.ar/Tramitesweb/schema}InfoConsultaWS"/>
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
    "infoConsulta"
})
@XmlRootElement(name = "auditarConsultaRequest")
public class AuditarConsultaRequest {

    @XmlElement(required = true)
    protected InfoConsultaWS infoConsulta;

    /**
     * Obtiene el valor de la propiedad infoConsulta.
     * 
     * @return
     *     possible object is
     *     {@link InfoConsultaWS }
     *     
     */
    public InfoConsultaWS getInfoConsulta() {
        return infoConsulta;
    }

    /**
     * Define el valor de la propiedad infoConsulta.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoConsultaWS }
     *     
     */
    public void setInfoConsulta(InfoConsultaWS value) {
        this.infoConsulta = value;
    }

}
