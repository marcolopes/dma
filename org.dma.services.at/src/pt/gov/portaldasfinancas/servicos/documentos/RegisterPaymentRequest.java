
package pt.gov.portaldasfinancas.servicos.documentos;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{http://factemi.at.min_financas.pt/documents}AuditFileVersion"/>
 *         &lt;element ref="{http://factemi.at.min_financas.pt/documents}TaxRegistrationNumber"/>
 *         &lt;element ref="{http://factemi.at.min_financas.pt/documents}TaxEntity"/>
 *         &lt;element ref="{http://factemi.at.min_financas.pt/documents}SoftwareCertificateNumber"/>
 *         &lt;element name="PaymentData" type="{http://factemi.at.min_financas.pt/documents}PaymentDataType"/>
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
    "auditFileVersion",
    "taxRegistrationNumber",
    "taxEntity",
    "softwareCertificateNumber",
    "paymentData",
    "canalRegisto"
})
@XmlRootElement(name = "RegisterPaymentRequest")
public class RegisterPaymentRequest {

    @XmlElement(required = true)
    protected String eFaturaMDVersion;
    @XmlElement(name = "AuditFileVersion", required = true)
    protected String auditFileVersion;
    @XmlElement(name = "TaxRegistrationNumber")
    protected int taxRegistrationNumber;
    @XmlElement(name = "TaxEntity", required = true)
    protected String taxEntity;
    @XmlElement(name = "SoftwareCertificateNumber", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger softwareCertificateNumber;
    @XmlElement(name = "PaymentData", required = true)
    protected PaymentDataType paymentData;
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
     * Gets the value of the auditFileVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditFileVersion() {
        return auditFileVersion;
    }

    /**
     * Sets the value of the auditFileVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditFileVersion(String value) {
        this.auditFileVersion = value;
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
     * Gets the value of the taxEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxEntity() {
        return taxEntity;
    }

    /**
     * Sets the value of the taxEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxEntity(String value) {
        this.taxEntity = value;
    }

    /**
     * Gets the value of the softwareCertificateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSoftwareCertificateNumber() {
        return softwareCertificateNumber;
    }

    /**
     * Sets the value of the softwareCertificateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSoftwareCertificateNumber(BigInteger value) {
        this.softwareCertificateNumber = value;
    }

    /**
     * Gets the value of the paymentData property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDataType }
     *     
     */
    public PaymentDataType getPaymentData() {
        return paymentData;
    }

    /**
     * Sets the value of the paymentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDataType }
     *     
     */
    public void setPaymentData(PaymentDataType value) {
        this.paymentData = value;
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
