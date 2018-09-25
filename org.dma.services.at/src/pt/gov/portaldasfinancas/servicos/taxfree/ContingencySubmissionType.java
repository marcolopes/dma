
package pt.gov.portaldasfinancas.servicos.taxfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContingencySubmissionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContingencySubmissionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxFreeCommCode" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}TaxFreeContingencyCommCodeType"/>
 *         &lt;element name="QRCodeContent" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}ContingencyQRCodeContentType"/>
 *         &lt;element name="TaxFreeComm" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}TaxFreeCommType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContingencySubmissionType", propOrder = {
    "taxFreeCommCode",
    "qrCodeContent",
    "taxFreeComm"
})
public class ContingencySubmissionType {

    @XmlElement(name = "TaxFreeCommCode", required = true)
    protected String taxFreeCommCode;
    @XmlElement(name = "QRCodeContent", required = true)
    protected String qrCodeContent;
    @XmlElement(name = "TaxFreeComm", required = true)
    protected TaxFreeCommType taxFreeComm;

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
     *     {@link TaxFreeCommType }
     *     
     */
    public TaxFreeCommType getTaxFreeComm() {
        return taxFreeComm;
    }

    /**
     * Sets the value of the taxFreeComm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxFreeCommType }
     *     
     */
    public void setTaxFreeComm(TaxFreeCommType value) {
        this.taxFreeComm = value;
    }

}
