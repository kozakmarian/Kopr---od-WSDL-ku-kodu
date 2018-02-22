
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
 *         &lt;element name="PredmetUUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "predmetUUID"
})
@XmlRootElement(name = "PridajPredmetResponse")
public class PridajPredmetResponse {

    @XmlElement(name = "PredmetUUID", required = true)
    protected String predmetUUID;

    /**
     * Gets the value of the predmetUUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredmetUUID() {
        return predmetUUID;
    }

    /**
     * Sets the value of the predmetUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredmetUUID(String value) {
        this.predmetUUID = value;
    }

}
