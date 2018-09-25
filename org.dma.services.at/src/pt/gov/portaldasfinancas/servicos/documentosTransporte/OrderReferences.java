
package pt.gov.portaldasfinancas.servicos.documentosTransporte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderReferences complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderReferences">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginatingON" type="{https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/}SAFPTtextTypeMandatoryMax60Car" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderReferences", propOrder = {
    "originatingON"
})
public class OrderReferences {

    @XmlElement(name = "OriginatingON")
    protected String originatingON;

    /**
     * Gets the value of the originatingON property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingON() {
        return originatingON;
    }

    /**
     * Sets the value of the originatingON property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingON(String value) {
        this.originatingON = value;
    }

}
