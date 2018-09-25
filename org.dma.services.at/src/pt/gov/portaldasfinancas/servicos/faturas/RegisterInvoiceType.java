
package pt.gov.portaldasfinancas.servicos.faturas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RegisterInvoiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterInvoiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxRegistrationNumber" type="{http://servicos.portaldasfinancas.gov.pt/faturas/}SAFPTPortugueseVatNumber"/>
 *         &lt;element ref="{http://servicos.portaldasfinancas.gov.pt/faturas/}InvoiceNo"/>
 *         &lt;element ref="{http://servicos.portaldasfinancas.gov.pt/faturas/}InvoiceDate"/>
 *         &lt;element ref="{http://servicos.portaldasfinancas.gov.pt/faturas/}InvoiceType"/>
 *         &lt;element ref="{http://servicos.portaldasfinancas.gov.pt/faturas/}InvoiceStatus" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="CustomerTaxID" type="{http://servicos.portaldasfinancas.gov.pt/faturas/}SAFPTPortugueseVatNumber"/>
 *           &lt;element ref="{http://servicos.portaldasfinancas.gov.pt/faturas/}InternationalCustomerTaxID"/>
 *         &lt;/choice>
 *         &lt;element name="Line" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element ref="{http://servicos.portaldasfinancas.gov.pt/faturas/}DebitAmount"/>
 *                     &lt;element ref="{http://servicos.portaldasfinancas.gov.pt/faturas/}CreditAmount"/>
 *                   &lt;/choice>
 *                   &lt;element ref="{http://servicos.portaldasfinancas.gov.pt/faturas/}Tax"/>
 *                   &lt;element ref="{http://servicos.portaldasfinancas.gov.pt/faturas/}TaxExemptionReason" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DocumentTotals">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://servicos.portaldasfinancas.gov.pt/faturas/}TaxPayable"/>
 *                   &lt;element ref="{http://servicos.portaldasfinancas.gov.pt/faturas/}NetTotal"/>
 *                   &lt;element ref="{http://servicos.portaldasfinancas.gov.pt/faturas/}GrossTotal"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterInvoiceType", propOrder = {
    "taxRegistrationNumber",
    "invoiceNo",
    "invoiceDate",
    "invoiceType",
    "invoiceStatus",
    "customerTaxID",
    "internationalCustomerTaxID",
    "line",
    "documentTotals"
})
public class RegisterInvoiceType {

    @XmlElement(name = "TaxRegistrationNumber", namespace = "")
    protected int taxRegistrationNumber;
    @XmlElement(name = "InvoiceNo", required = true)
    protected String invoiceNo;
    @XmlElement(name = "InvoiceDate", required = true)
    protected XMLGregorianCalendar invoiceDate;
    @XmlElement(name = "InvoiceType", required = true)
    protected String invoiceType;
    @XmlElement(name = "InvoiceStatus")
    protected String invoiceStatus;
    @XmlElement(name = "CustomerTaxID", namespace = "")
    protected Integer customerTaxID;
    @XmlElement(name = "InternationalCustomerTaxID")
    protected InternationalCustomerTaxID internationalCustomerTaxID;
    @XmlElement(name = "Line", namespace = "", required = true)
    protected List<RegisterInvoiceType.Line> line;
    @XmlElement(name = "DocumentTotals", namespace = "", required = true)
    protected RegisterInvoiceType.DocumentTotals documentTotals;

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
     *     {@link String }
     *     
     */
    public String getInvoiceType() {
        return invoiceType;
    }

    /**
     * Sets the value of the invoiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceType(String value) {
        this.invoiceType = value;
    }

    /**
     * Gets the value of the invoiceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceStatus() {
        return invoiceStatus;
    }

    /**
     * Sets the value of the invoiceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceStatus(String value) {
        this.invoiceStatus = value;
    }

    /**
     * Gets the value of the customerTaxID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomerTaxID() {
        return customerTaxID;
    }

    /**
     * Sets the value of the customerTaxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomerTaxID(Integer value) {
        this.customerTaxID = value;
    }

    /**
     * Gets the value of the internationalCustomerTaxID property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalCustomerTaxID }
     *     
     */
    public InternationalCustomerTaxID getInternationalCustomerTaxID() {
        return internationalCustomerTaxID;
    }

    /**
     * Sets the value of the internationalCustomerTaxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalCustomerTaxID }
     *     
     */
    public void setInternationalCustomerTaxID(InternationalCustomerTaxID value) {
        this.internationalCustomerTaxID = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the line property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegisterInvoiceType.Line }
     * 
     * 
     */
    public List<RegisterInvoiceType.Line> getLine() {
        if (line == null) {
            line = new ArrayList<RegisterInvoiceType.Line>();
        }
        return this.line;
    }

    /**
     * Gets the value of the documentTotals property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterInvoiceType.DocumentTotals }
     *     
     */
    public RegisterInvoiceType.DocumentTotals getDocumentTotals() {
        return documentTotals;
    }

    /**
     * Sets the value of the documentTotals property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterInvoiceType.DocumentTotals }
     *     
     */
    public void setDocumentTotals(RegisterInvoiceType.DocumentTotals value) {
        this.documentTotals = value;
    }


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
     *         &lt;element ref="{http://servicos.portaldasfinancas.gov.pt/faturas/}TaxPayable"/>
     *         &lt;element ref="{http://servicos.portaldasfinancas.gov.pt/faturas/}NetTotal"/>
     *         &lt;element ref="{http://servicos.portaldasfinancas.gov.pt/faturas/}GrossTotal"/>
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
        "taxPayable",
        "netTotal",
        "grossTotal"
    })
    public static class DocumentTotals {

        @XmlElement(name = "TaxPayable", required = true)
        protected BigDecimal taxPayable;
        @XmlElement(name = "NetTotal", required = true)
        protected BigDecimal netTotal;
        @XmlElement(name = "GrossTotal", required = true)
        protected BigDecimal grossTotal;

        /**
         * Gets the value of the taxPayable property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTaxPayable() {
            return taxPayable;
        }

        /**
         * Sets the value of the taxPayable property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTaxPayable(BigDecimal value) {
            this.taxPayable = value;
        }

        /**
         * Gets the value of the netTotal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getNetTotal() {
            return netTotal;
        }

        /**
         * Sets the value of the netTotal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setNetTotal(BigDecimal value) {
            this.netTotal = value;
        }

        /**
         * Gets the value of the grossTotal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getGrossTotal() {
            return grossTotal;
        }

        /**
         * Sets the value of the grossTotal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setGrossTotal(BigDecimal value) {
            this.grossTotal = value;
        }

    }


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
     *         &lt;choice>
     *           &lt;element ref="{http://servicos.portaldasfinancas.gov.pt/faturas/}DebitAmount"/>
     *           &lt;element ref="{http://servicos.portaldasfinancas.gov.pt/faturas/}CreditAmount"/>
     *         &lt;/choice>
     *         &lt;element ref="{http://servicos.portaldasfinancas.gov.pt/faturas/}Tax"/>
     *         &lt;element ref="{http://servicos.portaldasfinancas.gov.pt/faturas/}TaxExemptionReason" minOccurs="0"/>
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
        "debitAmount",
        "creditAmount",
        "tax",
        "taxExemptionReason"
    })
    public static class Line {

        @XmlElement(name = "DebitAmount")
        protected BigDecimal debitAmount;
        @XmlElement(name = "CreditAmount")
        protected BigDecimal creditAmount;
        @XmlElement(name = "Tax", required = true)
        protected Tax tax;
        @XmlElement(name = "TaxExemptionReason")
        protected String taxExemptionReason;

        /**
         * Gets the value of the debitAmount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDebitAmount() {
            return debitAmount;
        }

        /**
         * Sets the value of the debitAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDebitAmount(BigDecimal value) {
            this.debitAmount = value;
        }

        /**
         * Gets the value of the creditAmount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCreditAmount() {
            return creditAmount;
        }

        /**
         * Sets the value of the creditAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCreditAmount(BigDecimal value) {
            this.creditAmount = value;
        }

        /**
         * Gets the value of the tax property.
         * 
         * @return
         *     possible object is
         *     {@link Tax }
         *     
         */
        public Tax getTax() {
            return tax;
        }

        /**
         * Sets the value of the tax property.
         * 
         * @param value
         *     allowed object is
         *     {@link Tax }
         *     
         */
        public void setTax(Tax value) {
            this.tax = value;
        }

        /**
         * Gets the value of the taxExemptionReason property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxExemptionReason() {
            return taxExemptionReason;
        }

        /**
         * Sets the value of the taxExemptionReason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxExemptionReason(String value) {
            this.taxExemptionReason = value;
        }

    }

}
