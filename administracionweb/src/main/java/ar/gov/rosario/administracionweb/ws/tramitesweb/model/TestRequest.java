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
 *         &lt;element name="param" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "param"
})
@XmlRootElement(name = "testRequest")
public class TestRequest {

    @XmlElement(required = true)
    protected String param;

    /**
     * Obtiene el valor de la propiedad param.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParam() {
        return param;
    }

    /**
     * Define el valor de la propiedad param.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParam(String value) {
        this.param = value;
    }

}
