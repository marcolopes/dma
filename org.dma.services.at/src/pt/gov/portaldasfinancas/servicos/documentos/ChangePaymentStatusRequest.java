
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
 *         &lt;element name="PaymentHeader" type="{http://factemi.at.min_financas.pt/documents}PaymentHeaderType"/>
 *         &lt;element name="PaymentStatus" type="{http://factemi.at.min_financas.pt/documents}NewPaymentStatusType"/>
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
    "paymentHeader",
    "paymentStatus",
    "canalRegisto"
})
@XmlRootElement(name = "ChangePaymentStatusRequest")
public class ChangePaymentStatusRequest {

    @XmlElement(required = true)
    protected String eFaturaMDVersion;
    @XmlElement(name = "TaxRegistrationNumber")
    protected int taxRegistrationNumber;
    @XmlElement(name = "PaymentHeader", required = true)
    protected PaymentHeaderType paymentHeader;
    @XmlElement(name = "PaymentStatus", required = true)
    protected NewPaymentStatusType paymentStatus;
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
     * Gets the value of the paymentHeader property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentHeaderType }
     *     
     */
    public PaymentHeaderType getPaymentHeader() {
        return paymentHeader;
    }

    /**
     * Sets the value of the paymentHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentHeaderType }
     *     
     */
    public void setPaymentHeader(PaymentHeaderType value) {
        this.paymentHeader = value;
    }

    /**
     * Gets the value of the paymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link NewPaymentStatusType }
     *     
     */
    public NewPaymentStatusType getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Sets the value of the paymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewPaymentStatusType }
     *     
     */
    public void setPaymentStatus(NewPaymentStatusType value) {
        this.paymentStatus = value;
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
