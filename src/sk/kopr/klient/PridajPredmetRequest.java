
package sk.kopr.klient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NazovPredmetu" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "nazovPredmetu"
})
@XmlRootElement(name = "PridajPredmetRequest")
public class PridajPredmetRequest {

    @XmlElement(name = "NazovPredmetu", required = true)
    protected String nazovPredmetu;

    /**
     * Gets the value of the nazovPredmetu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazovPredmetu() {
        return nazovPredmetu;
    }

    /**
     * Sets the value of the nazovPredmetu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazovPredmetu(String value) {
        this.nazovPredmetu = value;
    }

}
