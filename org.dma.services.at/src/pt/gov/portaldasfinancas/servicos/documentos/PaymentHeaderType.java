
package pt.gov.portaldasfinancas.servicos.documentos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PaymentHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://factemi.at.min_financas.pt/documents}PaymentRefNo"/>
 *         &lt;element ref="{http://factemi.at.min_financas.pt/documents}ATCUD"/>
 *         &lt;element ref="{http://factemi.at.min_financas.pt/documents}TransactionDate"/>
 *         &lt;element ref="{http://factemi.at.min_financas.pt/documents}PaymentType"/>
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
@XmlType(name = "PaymentHeaderType", propOrder = {
    "paymentRefNo",
    "atcud",
    "transactionDate",
    "paymentType",
    "customerTaxID",
    "customerTaxIDCountry"
})
@XmlSeeAlso({
    PaymentDataType.class
})
public class PaymentHeaderType {

    @XmlElement(name = "PaymentRefNo", required = true)
    protected String paymentRefNo;
    @XmlElement(name = "ATCUD", required = true)
    protected String atcud;
    @XmlElement(name = "TransactionDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar transactionDate;
    @XmlElement(name = "PaymentType", required = true)
    protected PaymentTypeType paymentType;
    @XmlElement(name = "CustomerTaxID", required = true)
    protected String customerTaxID;
    @XmlElement(name = "CustomerTaxIDCountry", required = true)
    protected String customerTaxIDCountry;

    /**
     * Gets the value of the paymentRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentRefNo() {
        return paymentRefNo;
    }

    /**
     * Sets the value of the paymentRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentRefNo(String value) {
        this.paymentRefNo = value;
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
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionDate(XMLGregorianCalendar value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTypeType }
     *     
     */
    public PaymentTypeType getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTypeType }
     *     
     */
    public void setPaymentType(PaymentTypeType value) {
        this.paymentType = value;
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
