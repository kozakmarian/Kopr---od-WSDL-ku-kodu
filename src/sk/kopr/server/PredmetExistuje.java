
package sk.kopr.server;

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
 *       &lt;all>
 *         &lt;element name="Chyba" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "PredmetExistuje")
public class PredmetExistuje {

    @XmlElement(name = "Chyba", required = true)
    protected String chyba;

    /**
     * Gets the value of the chyba property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChyba() {
        return chyba;
    }

    /**
     * Sets the value of the chyba property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChyba(String value) {
        this.chyba = value;
    }

}
