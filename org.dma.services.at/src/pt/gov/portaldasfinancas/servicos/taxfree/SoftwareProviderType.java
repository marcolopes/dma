
package pt.gov.portaldasfinancas.servicos.taxfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoftwareProviderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoftwareProviderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductCompanyTaxID" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}TextMandatoryMax20" minOccurs="0"/>
 *         &lt;element name="SoftwareCertificateNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="999999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoftwareProviderType", propOrder = {
    "productCompanyTaxID",
    "softwareCertificateNumber"
})
public class SoftwareProviderType {

    @XmlElement(name = "ProductCompanyTaxID")
    protected String productCompanyTaxID;
    @XmlElement(name = "SoftwareCertificateNumber")
    protected Integer softwareCertificateNumber;

    /**
     * Gets the value of the productCompanyTaxID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCompanyTaxID() {
        return productCompanyTaxID;
    }

    /**
     * Sets the value of the productCompanyTaxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCompanyTaxID(String value) {
        this.productCompanyTaxID = value;
    }

    /**
     * Gets the value of the softwareCertificateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSoftwareCertificateNumber() {
        return softwareCertificateNumber;
    }

    /**
     * Sets the value of the softwareCertificateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSoftwareCertificateNumber(Integer value) {
        this.softwareCertificateNumber = value;
    }

}
