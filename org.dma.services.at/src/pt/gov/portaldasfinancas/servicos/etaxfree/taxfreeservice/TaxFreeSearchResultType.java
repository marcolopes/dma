
package pt.gov.portaldasfinancas.servicos.etaxfree.taxfreeservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TaxFreeSearchResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxFreeSearchResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxFreeCommCode" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}TaxFreeCommCodeType"/>
 *         &lt;element name="RegistrationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Identifier" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}TextMandatoryMax30" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="ATCUD" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}TextMandatoryMax100"/>
 *           &lt;element name="InvoiceNo" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}InvoiceNumberType"/>
 *         &lt;/choice>
 *         &lt;element name="CurrentStatus" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}CurrentStatusType"/>
 *         &lt;element name="BuyerIdentityDoc" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}IdentityDocType"/>
 *         &lt;element name="RefundableAmount" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}MonetaryType"/>
 *         &lt;element name="RefundCompanyTaxRegistrationNumber" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}PtVatNumberType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxFreeSearchResultType", propOrder = {
    "taxFreeCommCode",
    "registrationDateTime",
    "identifier",
    "atcud",
    "invoiceNo",
    "currentStatus",
    "buyerIdentityDoc",
    "refundableAmount",
    "refundCompanyTaxRegistrationNumber"
})
public class TaxFreeSearchResultType {

    @XmlElement(name = "TaxFreeCommCode", required = true)
    protected String taxFreeCommCode;
    @XmlElement(name = "RegistrationDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar registrationDateTime;
    @XmlElement(name = "Identifier")
    protected String identifier;
    @XmlElement(name = "ATCUD")
    protected String atcud;
    @XmlElement(name = "InvoiceNo")
    protected String invoiceNo;
    @XmlElement(name = "CurrentStatus", required = true)
    protected CurrentStatusType currentStatus;
    @XmlElement(name = "BuyerIdentityDoc", required = true)
    protected IdentityDocType buyerIdentityDoc;
    @XmlElement(name = "RefundableAmount", required = true)
    protected BigDecimal refundableAmount;
    @XmlElement(name = "RefundCompanyTaxRegistrationNumber")
    protected Integer refundCompanyTaxRegistrationNumber;

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
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the atcud property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATCUD() {
        return atcud;
    }

    /**
     * Sets the value of the atcud property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATCUD(String value) {
        this.atcud = value;
    }

    /**
     * Gets the value of the invoiceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * Sets the value of the invoiceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNo(String value) {
        this.invoiceNo = value;
    }

    /**
     * Gets the value of the currentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentStatusType }
     *     
     */
    public CurrentStatusType getCurrentStatus() {
        return currentStatus;
    }

    /**
     * Sets the value of the currentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentStatusType }
     *     
     */
    public void setCurrentStatus(CurrentStatusType value) {
        this.currentStatus = value;
    }

    /**
     * Gets the value of the buyerIdentityDoc property.
     * 
     * @return
     *     possible object is
     *     {@link IdentityDocType }
     *     
     */
    public IdentityDocType getBuyerIdentityDoc() {
        return buyerIdentityDoc;
    }

    /**
     * Sets the value of the buyerIdentityDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityDocType }
     *     
     */
    public void setBuyerIdentityDoc(IdentityDocType value) {
        this.buyerIdentityDoc = value;
    }

    /**
     * Gets the value of the refundableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRefundableAmount() {
        return refundableAmount;
    }

    /**
     * Sets the value of the refundableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRefundableAmount(BigDecimal value) {
        this.refundableAmount = value;
    }

    /**
     * Gets the value of the refundCompanyTaxRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRefundCompanyTaxRegistrationNumber() {
        return refundCompanyTaxRegistrationNumber;
    }

    /**
     * Sets the value of the refundCompanyTaxRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRefundCompanyTaxRegistrationNumber(Integer value) {
        this.refundCompanyTaxRegistrationNumber = value;
    }

}
