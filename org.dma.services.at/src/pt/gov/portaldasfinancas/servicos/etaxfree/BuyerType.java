
package pt.gov.portaldasfinancas.servicos.etaxfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BuyerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuyerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}TextMandatoryMax100"/>
 *         &lt;element name="IdentityDoc" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}IdentityDocType"/>
 *         &lt;element name="ResidenceCountryCode" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}CountryCodeType"/>
 *         &lt;element name="TaxRegistrationNumber" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}PtVatNumberType" minOccurs="0"/>
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyerType", propOrder = {
    "name",
    "identityDoc",
    "residenceCountryCode",
    "taxRegistrationNumber",
    "birthDate"
})
public class BuyerType {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "IdentityDoc", required = true)
    protected IdentityDocType identityDoc;
    @XmlElement(name = "ResidenceCountryCode", required = true)
    protected String residenceCountryCode;
    @XmlElement(name = "TaxRegistrationNumber")
    protected Integer taxRegistrationNumber;
    @XmlElement(name = "BirthDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the identityDoc property.
     * 
     * @return
     *     possible object is
     *     {@link IdentityDocType }
     *     
     */
    public IdentityDocType getIdentityDoc() {
        return identityDoc;
    }

    /**
     * Sets the value of the identityDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityDocType }
     *     
     */
    public void setIdentityDoc(IdentityDocType value) {
        this.identityDoc = value;
    }

    /**
     * Gets the value of the residenceCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidenceCountryCode() {
        return residenceCountryCode;
    }

    /**
     * Sets the value of the residenceCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidenceCountryCode(String value) {
        this.residenceCountryCode = value;
    }

    /**
     * Gets the value of the taxRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaxRegistrationNumber() {
        return taxRegistrationNumber;
    }

    /**
     * Sets the value of the taxRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaxRegistrationNumber(Integer value) {
        this.taxRegistrationNumber = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

}
