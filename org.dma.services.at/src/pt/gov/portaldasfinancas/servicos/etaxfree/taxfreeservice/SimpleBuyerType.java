
package pt.gov.portaldasfinancas.servicos.etaxfree.taxfreeservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SimpleBuyerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleBuyerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompanyName" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}TextMandatoryMax100"/>
 *         &lt;element name="VatNumberInfo" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}VatNumberInfoType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleBuyerType", propOrder = {
    "companyName",
    "vatNumberInfo"
})
public class SimpleBuyerType {

    @XmlElement(name = "CompanyName", required = true)
    protected String companyName;
    @XmlElement(name = "VatNumberInfo", required = true)
    protected VatNumberInfoType vatNumberInfo;

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the vatNumberInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VatNumberInfoType }
     *     
     */
    public VatNumberInfoType getVatNumberInfo() {
        return vatNumberInfo;
    }

    /**
     * Sets the value of the vatNumberInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VatNumberInfoType }
     *     
     */
    public void setVatNumberInfo(VatNumberInfoType value) {
        this.vatNumberInfo = value;
    }

}
