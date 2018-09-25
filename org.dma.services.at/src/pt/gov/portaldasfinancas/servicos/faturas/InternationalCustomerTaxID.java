
package pt.gov.portaldasfinancas.servicos.faturas;

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
 *         &lt;element name="TaxIDNumber" type="{http://servicos.portaldasfinancas.gov.pt/faturas/}SAFPTtextTypeMandatoryMax20Car"/>
 *         &lt;element name="TaxIDCountry" type="{http://servicos.portaldasfinancas.gov.pt/faturas/}ForeignCountry"/>
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
    "taxIDNumber",
    "taxIDCountry"
})
@XmlRootElement(name = "InternationalCustomerTaxID")
public class InternationalCustomerTaxID {

    @XmlElement(name = "TaxIDNumber", namespace = "", required = true)
    protected String taxIDNumber;
    @XmlElement(name = "TaxIDCountry", namespace = "", required = true)
    protected String taxIDCountry;

    /**
     * Gets the value of the taxIDNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxIDNumber() {
        return taxIDNumber;
    }

    /**
     * Sets the value of the taxIDNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxIDNumber(String value) {
        this.taxIDNumber = value;
    }

    /**
     * Gets the value of the taxIDCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxIDCountry() {
        return taxIDCountry;
    }

    /**
     * Sets the value of the taxIDCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxIDCountry(String value) {
        this.taxIDCountry = value;
    }

}
