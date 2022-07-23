
package pt.gov.portaldasfinancas.servicos.documentos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eFaturaMDVersion" type="{http://factemi.at.min_financas.pt/documents}eFaturaMDVersion"/>
 *         &lt;element ref="{http://factemi.at.min_financas.pt/documents}TaxRegistrationNumber"/>
 *         &lt;element name="InvoiceHeader" type="{http://factemi.at.min_financas.pt/documents}InvoiceHeaderType"/>
 *         &lt;element name="InvoiceStatus" type="{http://factemi.at.min_financas.pt/documents}NewInvoiceStatusType"/>
 *         &lt;element name="CanalRegisto" type="{http://factemi.at.min_financas.pt/documents}ChannelType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "eFaturaMDVersion",
    "taxRegistrationNumber",
    "invoiceHeader",
    "invoiceStatus",
    "canalRegisto"
})
@XmlRootElement(name = "ChangeInvoiceStatusRequest")
public class ChangeInvoiceStatusRequest {

    @XmlElement(required = true)
    protected String eFaturaMDVersion;
    @XmlElement(name = "TaxRegistrationNumber")
    protected int taxRegistrationNumber;
    @XmlElement(name = "InvoiceHeader", required = true)
    protected InvoiceHeaderType invoiceHeader;
    @XmlElement(name = "InvoiceStatus", required = true)
    protected NewInvoiceStatusType invoiceStatus;
    @XmlElement(name = "CanalRegisto")
    protected ChannelType canalRegisto;

    /**
     * Gets the value of the eFaturaMDVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEFaturaMDVersion() {
        return eFaturaMDVersion;
    }

    /**
     * Sets the value of the eFaturaMDVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEFaturaMDVersion(String value) {
        this.eFaturaMDVersion = value;
    }

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
     * Gets the value of the invoiceHeader property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceHeaderType }
     *     
     */
    public InvoiceHeaderType getInvoiceHeader() {
        return invoiceHeader;
    }

    /**
     * Sets the value of the invoiceHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceHeaderType }
     *     
     */
    public void setInvoiceHeader(InvoiceHeaderType value) {
        this.invoiceHeader = value;
    }

    /**
     * Gets the value of the invoiceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link NewInvoiceStatusType }
     *     
     */
    public NewInvoiceStatusType getInvoiceStatus() {
        return invoiceStatus;
    }

    /**
     * Sets the value of the invoiceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewInvoiceStatusType }
     *     
     */
    public void setInvoiceStatus(NewInvoiceStatusType value) {
        this.invoiceStatus = value;
    }

    /**
     * Gets the value of the canalRegisto property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelType }
     *     
     */
    public ChannelType getCanalRegisto() {
        return canalRegisto;
    }

    /**
     * Sets the value of the canalRegisto property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelType }
     *     
     */
    public void setCanalRegisto(ChannelType value) {
        this.canalRegisto = value;
    }

}
