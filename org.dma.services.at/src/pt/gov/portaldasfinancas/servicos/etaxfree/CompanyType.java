
package pt.gov.portaldasfinancas.servicos.etaxfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxRegistrationNumber" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}PtVatNumberType"/>
 *         &lt;element name="BusinessName" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}TextMandatoryMax60" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}EmailType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyType", propOrder = {
    "taxRegistrationNumber",
    "businessName",
    "email"
})
public class CompanyType {

    @XmlElement(name = "TaxRegistrationNumber")
    protected int taxRegistrationNumber;
    @XmlElement(name = "BusinessName")
    protected String businessName;
    @XmlElement(name = "Email")
    protected String email;

    /**
     * Gets the value of the taxRegistrationNumber property.
     * 
     */
    public int getTaxRegistrationNumber() {
        return taxRegistrationNumber;
    }

    /**
     * Sets the value of the taxRegistrationNumber property.
     * 
     */
    public void setTaxRegistrationNumber(int value) {
        this.taxRegistrationNumber = value;
    }

    /**
     * Gets the value of the businessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the businessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessName(String value) {
        this.businessName = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

}
