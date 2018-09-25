
package pt.gov.portaldasfinancas.servicos.taxfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TaxFreeCommRegistrationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxFreeCommRegistrationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxFreeCommCode" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}TaxFreeCommCodeType"/>
 *         &lt;element name="RegistrationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="QRCodeContent" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}QRCodeContentType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxFreeCommRegistrationType", propOrder = {
    "taxFreeCommCode",
    "registrationDateTime",
    "qrCodeContent"
})
public class TaxFreeCommRegistrationType {

    @XmlElement(name = "TaxFreeCommCode", required = true)
    protected String taxFreeCommCode;
    @XmlElement(name = "RegistrationDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar registrationDateTime;
    @XmlElement(name = "QRCodeContent", required = true)
    protected String qrCodeContent;

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
     * Gets the value of the registrationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistrationDateTime() {
        return registrationDateTime;
    }

    /**
     * Sets the value of the registrationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegistrationDateTime(XMLGregorianCalendar value) {
        this.registrationDateTime = value;
    }

    /**
     * Gets the value of the qrCodeContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQRCodeContent() {
        return qrCodeContent;
    }

    /**
     * Sets the value of the qrCodeContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQRCodeContent(String value) {
        this.qrCodeContent = value;
    }

}
