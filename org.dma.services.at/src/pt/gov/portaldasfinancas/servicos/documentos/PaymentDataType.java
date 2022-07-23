
package pt.gov.portaldasfinancas.servicos.documentos;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PaymentDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://factemi.at.min_financas.pt/documents}PaymentHeaderType">
 *       &lt;sequence>
 *         &lt;element name="DocumentStatus" type="{http://factemi.at.min_financas.pt/documents}PaymentStatus"/>
 *         &lt;element ref="{http://factemi.at.min_financas.pt/documents}SystemEntryDate"/>
 *         &lt;element name="LineSummary" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://factemi.at.min_financas.pt/documents}SourceDocumentID" maxOccurs="unbounded"/>
 *                   &lt;element name="SettlementAmount" type="{http://factemi.at.min_financas.pt/documents}MonetaryType" minOccurs="0"/>
 *                   &lt;element ref="{http://factemi.at.min_financas.pt/documents}DebitCreditIndicator"/>
 *                   &lt;choice>
 *                     &lt;element ref="{http://factemi.at.min_financas.pt/documents}Amount"/>
 *                   &lt;/choice>
 *                   &lt;element ref="{http://factemi.at.min_financas.pt/documents}Tax" minOccurs="0"/>
 *                   &lt;element ref="{http://factemi.at.min_financas.pt/documents}TaxExemptionCode" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DocumentTotals" type="{http://factemi.at.min_financas.pt/documents}DocumentTotals"/>
 *         &lt;element name="WithholdingTax" type="{http://factemi.at.min_financas.pt/documents}WithholdingTax" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDataType", propOrder = {
    "documentStatus",
    "systemEntryDate",
    "lineSummary",
    "documentTotals",
    "withholdingTax"
})
public class PaymentDataType
    extends PaymentHeaderType
{

    @XmlElement(name = "DocumentStatus", required = true)
    protected PaymentStatus documentStatus;
    @XmlElement(name = "SystemEntryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemEntryDate;
    @XmlElement(name = "LineSummary", required = true)
    protected List<PaymentDataType.LineSummary> lineSummary;
    @XmlElement(name = "DocumentTotals", required = true)
    protected DocumentTotals documentTotals;
    @XmlElement(name = "WithholdingTax")
    protected List<WithholdingTax> withholdingTax;

    /**
     * Gets the value of the documentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentStatus }
     *     
     */
    public PaymentStatus getDocumentStatus() {
        return documentStatus;
    }

    /**
     * Sets the value of the documentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentStatus }
     *     
     */
    public void setDocumentStatus(PaymentStatus value) {
        this.documentStatus = value;
    }

    /**
     * Gets the value of the systemEntryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSystemEntryDate() {
        return systemEntryDate;
    }

    /**
     * Sets the value of the systemEntryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSystemEntryDate(XMLGregorianCalendar value) {
        this.systemEntryDate = value;
    }

    /**
     * Gets the value of the lineSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentDataType.LineSummary }
     * 
     * 
     */
    public List<PaymentDataType.LineSummary> getLineSummary() {
        if (lineSummary == null) {
            lineSummary = new ArrayList<PaymentDataType.LineSummary>();
        }
        return this.lineSummary;
    }

    /**
     * Gets the value of the documentTotals property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentTotals }
     *     
     */
    public DocumentTotals getDocumentTotals() {
        return documentTotals;
    }

    /**
     * Sets the value of the documentTotals property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentTotals }
     *     
     */
    public void setDocumentTotals(DocumentTotals value) {
        this.documentTotals = value;
    }

    /**
     * Gets the value of the withholdingTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the withholdingTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWithholdingTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WithholdingTax }
     * 
     * 
     */
    public List<WithholdingTax> getWithholdingTax() {
        if (withholdingTax == null) {
            withholdingTax = new ArrayList<WithholdingTax>();
        }
        return this.withholdingTax;
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
     *         &lt;element ref="{http://factemi.at.min_financas.pt/documents}SourceDocumentID" maxOccurs="unbounded"/>
     *         &lt;element name="SettlementAmount" type="{http://factemi.at.min_financas.pt/documents}MonetaryType" minOccurs="0"/>
     *         &lt;element ref="{http://factemi.at.min_financas.pt/documents}DebitCreditIndicator"/>
     *         &lt;choice>
     *           &lt;element ref="{http://factemi.at.min_financas.pt/documents}Amount"/>
     *         &lt;/choice>
     *         &lt;element ref="{http://factemi.at.min_financas.pt/documents}Tax" minOccurs="0"/>
     *         &lt;element ref="{http://factemi.at.min_financas.pt/documents}TaxExemptionCode" minOccurs="0"/>
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
        "sourceDocumentID",
        "settlementAmount",
        "debitCreditIndicator",
        "amount",
        "tax",
        "taxExemptionCode"
    })
    public static class LineSummary {

        @XmlElement(name = "SourceDocumentID", required = true)
        protected List<SourceDocumentID> sourceDocumentID;
        @XmlElement(name = "SettlementAmount")
        protected BigDecimal settlementAmount;
        @XmlElement(name = "DebitCreditIndicator", required = true)
        protected DebitCreditIndicator debitCreditIndicator;
        @XmlElement(name = "Amount")
        protected BigDecimal amount;
        @XmlElement(name = "Tax")
        protected Tax tax;
        @XmlElement(name = "TaxExemptionCode")
        protected String taxExemptionCode;

        /**
         * Gets the value of the sourceDocumentID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sourceDocumentID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSourceDocumentID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SourceDocumentID }
         * 
         * 
         */
        public List<SourceDocumentID> getSourceDocumentID() {
            if (sourceDocumentID == null) {
                sourceDocumentID = new ArrayList<SourceDocumentID>();
            }
            return this.sourceDocumentID;
        }

        /**
         * Gets the value of the settlementAmount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSettlementAmount() {
            return settlementAmount;
        }

        /**
         * Sets the value of the settlementAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSettlementAmount(BigDecimal value) {
            this.settlementAmount = value;
        }

        /**
         * Gets the value of the debitCreditIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link DebitCreditIndicator }
         *     
         */
        public DebitCreditIndicator getDebitCreditIndicator() {
            return debitCreditIndicator;
        }

        /**
         * Sets the value of the debitCreditIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link DebitCreditIndicator }
         *     
         */
        public void setDebitCreditIndicator(DebitCreditIndicator value) {
            this.debitCreditIndicator = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmount(BigDecimal value) {
            this.amount = value;
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
         * Gets the value of the taxExemptionCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxExemptionCode() {
            return taxExemptionCode;
        }

        /**
         * Sets the value of the taxExemptionCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxExemptionCode(String value) {
            this.taxExemptionCode = value;
        }

    }

}
