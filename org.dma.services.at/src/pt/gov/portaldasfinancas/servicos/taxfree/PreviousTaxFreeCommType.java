
package pt.gov.portaldasfinancas.servicos.taxfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreviousTaxFreeCommType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreviousTaxFreeCommType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxFreeCommCode" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}TaxFreeCommCodeType"/>
 *         &lt;element name="IdentityDocNumber" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}TextMandatoryMax20"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreviousTaxFreeCommType", propOrder = {
    "taxFreeCommCode",
    "identityDocNumber"
})
public class PreviousTaxFreeCommType {

    @XmlElement(name = "TaxFreeCommCode", required = true)
    protected String taxFreeCommCode;
    @XmlElement(name = "IdentityDocNumber", required = true)
    protected String identityDocNumber;

    /**
     * Gets the value of the taxFreeCommCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxFreeCommCode() {
        return taxFreeCommCode;
    }

    /**
     * Sets the value of the taxFreeCommCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxFreeCommCode(String value) {
        this.taxFreeCommCode = value;
    }

    /**
     * Gets the value of the identityDocNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityDocNumber() {
        return identityDocNumber;
    }

    /**
     * Sets the value of the identityDocNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityDocNumber(String value) {
        this.identityDocNumber = value;
    }

}
