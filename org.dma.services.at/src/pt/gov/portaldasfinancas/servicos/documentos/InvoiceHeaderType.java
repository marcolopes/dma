
package pt.gov.portaldasfinancas.servicos.documentos;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InvoiceHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://factemi.at.min_financas.pt/documents}InvoiceNo"/>
 *         &lt;element ref="{http://factemi.at.min_financas.pt/documents}ATCUD"/>
 *         &lt;element ref="{http://factemi.at.min_financas.pt/documents}InvoiceDate"/>
 *         &lt;element ref="{http://factemi.at.min_financas.pt/documents}InvoiceType"/>
 *         &lt;element name="SelfBillingIndicator" type="{http://factemi.at.min_financas.pt/documents}SelfBillingIndicator"/>
 *         &lt;element ref="{http://factemi.at.min_financas.pt/documents}CustomerTaxID"/>
 *         &lt;element ref="{http://factemi.at.min_financas.pt/documents}CustomerTaxIDCountry"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceHeaderType", propOrder = {
    "invoiceNo",
    "atcud",
    "invoiceDate",
    "invoiceType",
    "selfBillingIndicator",
    "customerTaxID",
    "customerTaxIDCountry"
})
@XmlSeeAlso({
    InvoiceDataType.class
})
public class InvoiceHeaderType {

    @XmlElement(name = "InvoiceNo", required = true)
    protected String invoiceNo;
    @XmlElement(name = "ATCUD", required = true)
    protected String atcud;
    @XmlElement(name = "InvoiceDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar invoiceDate;
    @XmlElement(name = "InvoiceType", required = true)
    protected InvoiceTypeType invoiceType;
    @XmlElement(name = "SelfBillingIndicator", required = true)
    protected BigInteger selfBillingIndicator;
    @XmlElement(name = "CustomerTaxID", required = true)
    protected String customerTaxID;
    @XmlElement(name = "CustomerTaxIDCountry", required = true)
    protected String customerTaxIDCountry;

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
     * Gets the value of the invoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * Sets the value of the invoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvoiceDate(XMLGregorianCalendar value) {
        this.invoiceDate = value;
    }

    /**
     * Gets the value of the invoiceType property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceTypeType }
     *     
     */
    public InvoiceTypeType getInvoiceType() {
        return invoiceType;
    }

    /**
     * Sets the value of the invoiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceTypeType }
     *     
     */
    public void setInvoiceType(InvoiceTypeType value) {
        this.invoiceType = value;
    }

    /**
     * Gets the value of the selfBillingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSelfBillingIndicator() {
        return selfBillingIndicator;
    }

    /**
     * Sets the value of the selfBillingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSelfBillingIndicator(BigInteger value) {
        this.selfBillingIndicator = value;
    }

    /**
     * Gets the value of the customerTaxID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerTaxID() {
        return customerTaxID;
    }

    /**
     * Sets the value of the customerTaxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerTaxID(String value) {
        this.customerTaxID = value;
    }

    /**
     * Gets the value of the customerTaxIDCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerTaxIDCountry() {
        return customerTaxIDCountry;
    }

    /**
     * Sets the value of the customerTaxIDCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerTaxIDCountry(String value) {
        this.customerTaxIDCountry = value;
    }

}
