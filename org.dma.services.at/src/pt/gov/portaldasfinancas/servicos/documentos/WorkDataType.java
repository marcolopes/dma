
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
 * <p>Java class for WorkDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://factemi.at.min_financas.pt/documents}WorkHeaderType">
 *       &lt;sequence>
 *         &lt;element name="DocumentStatus" type="{http://factemi.at.min_financas.pt/documents}WorkStatus"/>
 *         &lt;element ref="{http://factemi.at.min_financas.pt/documents}HashCharacters"/>
 *         &lt;element ref="{http://factemi.at.min_financas.pt/documents}EACCode" minOccurs="0"/>
 *         &lt;element ref="{http://factemi.at.min_financas.pt/documents}SystemEntryDate"/>
 *         &lt;element name="LineSummary" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://factemi.at.min_financas.pt/documents}OrderReferences" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{http://factemi.at.min_financas.pt/documents}TaxPointDate"/>
 *                   &lt;element ref="{http://factemi.at.min_financas.pt/documents}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{http://factemi.at.min_financas.pt/documents}DebitCreditIndicator"/>
 *                   &lt;choice>
 *                     &lt;element ref="{http://factemi.at.min_financas.pt/documents}TotalTaxBase"/>
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
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkDataType", propOrder = {
    "documentStatus",
    "hashCharacters",
    "eacCode",
    "systemEntryDate",
    "lineSummary",
    "documentTotals"
})
public class WorkDataType
    extends WorkHeaderType
{

    @XmlElement(name = "DocumentStatus", required = true)
    protected WorkStatus documentStatus;
    @XmlElement(name = "HashCharacters", required = true)
    protected String hashCharacters;
    @XmlElement(name = "EACCode")
    protected String eacCode;
    @XmlElement(name = "SystemEntryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemEntryDate;
    @XmlElement(name = "LineSummary", required = true)
    protected List<WorkDataType.LineSummary> lineSummary;
    @XmlElement(name = "DocumentTotals", required = true)
    protected DocumentTotals documentTotals;

    /**
     * Gets the value of the documentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link WorkStatus }
     *     
     */
    public WorkStatus getDocumentStatus() {
        return documentStatus;
    }

    /**
     * Sets the value of the documentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkStatus }
     *     
     */
    public void setDocumentStatus(WorkStatus value) {
        this.documentStatus = value;
    }

    /**
     * Gets the value of the hashCharacters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHashCharacters() {
        return hashCharacters;
    }

    /**
     * Sets the value of the hashCharacters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHashCharacters(String value) {
        this.hashCharacters = value;
    }

    /**
     * Gets the value of the eacCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEACCode() {
        return eacCode;
    }

    /**
     * Sets the value of the eacCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEACCode(String value) {
        this.eacCode = value;
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
     * {@link WorkDataType.LineSummary }
     * 
     * 
     */
    public List<WorkDataType.LineSummary> getLineSummary() {
        if (lineSummary == null) {
            lineSummary = new ArrayList<WorkDataType.LineSummary>();
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://factemi.at.min_financas.pt/documents}OrderReferences" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{http://factemi.at.min_financas.pt/documents}TaxPointDate"/>
     *         &lt;element ref="{http://factemi.at.min_financas.pt/documents}Reference" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{http://factemi.at.min_financas.pt/documents}DebitCreditIndicator"/>
     *         &lt;choice>
     *           &lt;element ref="{http://factemi.at.min_financas.pt/documents}TotalTaxBase"/>
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
        "orderReferences",
        "taxPointDate",
        "reference",
        "debitCreditIndicator",
        "totalTaxBase",
        "amount",
        "tax",
        "taxExemptionCode"
    })
    public static class LineSummary {

        @XmlElement(name = "OrderReferences")
        protected List<OrderReferences> orderReferences;
        @XmlElement(name = "TaxPointDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar taxPointDate;
        @XmlElement(name = "Reference")
        protected List<String> reference;
        @XmlElement(name = "DebitCreditIndicator", required = true)
        protected DebitCreditIndicator debitCreditIndicator;
        @XmlElement(name = "TotalTaxBase")
        protected BigDecimal totalTaxBase;
        @XmlElement(name = "Amount")
        protected BigDecimal amount;
        @XmlElement(name = "Tax")
        protected Tax tax;
        @XmlElement(name = "TaxExemptionCode")
        protected String taxExemptionCode;

        /**
         * Gets the value of the orderReferences property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the orderReferences property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrderReferences().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrderReferences }
         * 
         * 
         */
        public List<OrderReferences> getOrderReferences() {
            if (orderReferences == null) {
                orderReferences = new ArrayList<OrderReferences>();
            }
            return this.orderReferences;
        }

        /**
         * Gets the value of the taxPointDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTaxPointDate() {
            return taxPointDate;
        }

        /**
         * Sets the value of the taxPointDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTaxPointDate(XMLGregorianCalendar value) {
            this.taxPointDate = value;
        }

        /**
         * Gets the value of the reference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getReference() {
            if (reference == null) {
                reference = new ArrayList<String>();
            }
            return this.reference;
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
         * Gets the value of the totalTaxBase property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalTaxBase() {
            return totalTaxBase;
        }

        /**
         * Sets the value of the totalTaxBase property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalTaxBase(BigDecimal value) {
            this.totalTaxBase = value;
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
