
package pt.gov.portaldasfinancas.servicos.etaxfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SoftwareProvider" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}SoftwareProviderType" minOccurs="0"/>
 *         &lt;element name="RequesterTaxID" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}PtVatNumberType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestHeaderType", propOrder = {
    "softwareProvider",
    "requesterTaxID"
})
public class RequestHeaderType {

    @XmlElement(name = "SoftwareProvider")
    protected SoftwareProviderType softwareProvider;
    @XmlElement(name = "RequesterTaxID")
    protected int requesterTaxID;

    /**
     * Gets the value of the softwareProvider property.
     * 
     * @return
     *     possible object is
     *     {@link SoftwareProviderType }
     *     
     */
    public SoftwareProviderType getSoftwareProvider() {
        return softwareProvider;
    }

    /**
     * Sets the value of the softwareProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoftwareProviderType }
     *     
     */
    public void setSoftwareProvider(SoftwareProviderType value) {
        this.softwareProvider = value;
    }

    /**
     * Gets the value of the requesterTaxID property.
     * 
     */
    public int getRequesterTaxID() {
        return requesterTaxID;
    }

    /**
     * Sets the value of the requesterTaxID property.
     * 
     */
    public void setRequesterTaxID(int value) {
        this.requesterTaxID = value;
    }

}
