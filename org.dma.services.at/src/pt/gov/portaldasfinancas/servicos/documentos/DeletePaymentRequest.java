
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
 *         &lt;choice>
 *           &lt;element name="documentsList" type="{http://factemi.at.min_financas.pt/documents}ListPaymentDocumentsType"/>
 *           &lt;element name="dateRange" type="{http://factemi.at.min_financas.pt/documents}DateRangeType"/>
 *         &lt;/choice>
 *         &lt;element name="reason">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="10"/>
 *               &lt;maxLength value="500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
    "documentsList",
    "dateRange",
    "reason",
    "canalRegisto"
})
@XmlRootElement(name = "DeletePaymentRequest")
public class DeletePaymentRequest {

    @XmlElement(required = true)
    protected String eFaturaMDVersion;
    @XmlElement(name = "TaxRegistrationNumber")
    protected int taxRegistrationNumber;
    protected ListPaymentDocumentsType documentsList;
    protected DateRangeType dateRange;
    @XmlElement(required = true)
    protected String reason;
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
     * Gets the value of the documentsList property.
     * 
     * @return
     *     possible object is
     *     {@link ListPaymentDocumentsType }
     *     
     */
    public ListPaymentDocumentsType getDocumentsList() {
        return documentsList;
    }

    /**
     * Sets the value of the documentsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListPaymentDocumentsType }
     *     
     */
    public void setDocumentsList(ListPaymentDocumentsType value) {
        this.documentsList = value;
    }

    /**
     * Gets the value of the dateRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateRangeType }
     *     
     */
    public DateRangeType getDateRange() {
        return dateRange;
    }

    /**
     * Sets the value of the dateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRangeType }
     *     
     */
    public void setDateRange(DateRangeType value) {
        this.dateRange = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
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
