
package pt.gov.portaldasfinancas.servicos.taxfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxFreeSubmissionResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxFreeSubmissionResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReturnInfo" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}ReturnInfoType"/>
 *         &lt;element name="TaxFreeCommRegistration" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}TaxFreeCommRegistrationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxFreeSubmissionResponseType", propOrder = {
    "returnInfo",
    "taxFreeCommRegistration"
})
public class TaxFreeSubmissionResponseType {

    @XmlElement(name = "ReturnInfo", required = true)
    protected ReturnInfoType returnInfo;
    @XmlElement(name = "TaxFreeCommRegistration")
    protected TaxFreeCommRegistrationType taxFreeCommRegistration;

    /**
     * Gets the value of the returnInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnInfoType }
     *     
     */
    public ReturnInfoType getReturnInfo() {
        return returnInfo;
    }

    /**
     * Sets the value of the returnInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnInfoType }
     *     
     */
    public void setReturnInfo(ReturnInfoType value) {
        this.returnInfo = value;
    }

    /**
     * Gets the value of the taxFreeCommRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link TaxFreeCommRegistrationType }
     *     
     */
    public TaxFreeCommRegistrationType getTaxFreeCommRegistration() {
        return taxFreeCommRegistration;
    }

    /**
     * Sets the value of the taxFreeCommRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxFreeCommRegistrationType }
     *     
     */
    public void setTaxFreeCommRegistration(TaxFreeCommRegistrationType value) {
        this.taxFreeCommRegistration = value;
    }

}
