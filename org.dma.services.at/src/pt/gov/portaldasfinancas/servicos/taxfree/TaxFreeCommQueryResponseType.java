
package pt.gov.portaldasfinancas.servicos.taxfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TaxFreeCommQueryResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxFreeCommQueryResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReturnInfo" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}ReturnInfoType"/>
 *         &lt;element name="RegistrationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="QRCodeContent" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}QRCodeContentType" minOccurs="0"/>
 *         &lt;element name="TaxFreeComm" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}TaxFreeCommDetailType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxFreeCommQueryResponseType", propOrder = {
    "returnInfo",
    "registrationDateTime",
    "qrCodeContent",
    "taxFreeComm"
})
public class TaxFreeCommQueryResponseType {

    @XmlElement(name = "ReturnInfo", required = true)
    protected ReturnInfoType returnInfo;
    @XmlElement(name = "RegistrationDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar registrationDateTime;
    @XmlElement(name = "QRCodeContent")
    protected String qrCodeContent;
    @XmlElement(name = "TaxFreeComm")
    protected TaxFreeCommDetailType taxFreeComm;

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

    /**
     * Gets the value of the taxFreeComm property.
     * 
     * @return
     *     possible object is
     *     {@link TaxFreeCommDetailType }
     *     
     */
    public TaxFreeCommDetailType getTaxFreeComm() {
        return taxFreeComm;
    }

    /**
     * Sets the value of the taxFreeComm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxFreeCommDetailType }
     *     
     */
    public void setTaxFreeComm(TaxFreeCommDetailType value) {
        this.taxFreeComm = value;
    }

}
