
package pt.gov.portaldasfinancas.servicos.taxfree;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InvoiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="ATCUD" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}TextMandatoryMax100"/>
 *           &lt;element name="InvoiceIdentifiers" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}InvoiceIdentifiersType"/>
 *         &lt;/choice>
 *         &lt;element name="InvoiceType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="2"/>
 *               &lt;pattern value="[A-Z][A-Z]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="InvoiceDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Buyer" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}SimpleBuyerType"/>
 *         &lt;element name="GrossTotal" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}PositiveMonetaryType"/>
 *         &lt;element name="CalculatedTaxes" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}CalculatedTaxesType"/>
 *         &lt;element name="RefundableAmount" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}MonetaryType"/>
 *         &lt;element name="InvoiceLinesList" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}InvoiceLinesListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceType", propOrder = {
    "atcud",
    "invoiceIdentifiers",
    "invoiceType",
    "invoiceDate",
    "buyer",
    "grossTotal",
    "calculatedTaxes",
    "refundableAmount",
    "invoiceLinesList"
})
public class InvoiceType {

    @XmlElement(name = "ATCUD")
    protected String atcud;
    @XmlElement(name = "InvoiceIdentifiers")
    protected InvoiceIdentifiersType invoiceIdentifiers;
    @XmlElement(name = "InvoiceType", required = true)
    protected String invoiceType;
    @XmlElement(name = "InvoiceDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar invoiceDate;
    @XmlElement(name = "Buyer", required = true)
    protected SimpleBuyerType buyer;
    @XmlElement(name = "GrossTotal", required = true)
    protected BigDecimal grossTotal;
    @XmlElement(name = "CalculatedTaxes", required = true)
    protected CalculatedTaxesType calculatedTaxes;
    @XmlElement(name = "RefundableAmount", required = true)
    protected BigDecimal refundableAmount;
    @XmlElement(name = "InvoiceLinesList", required = true)
    protected InvoiceLinesListType invoiceLinesList;

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
     * Gets the value of the invoiceIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceIdentifiersType }
     *     
     */
    public InvoiceIdentifiersType getInvoiceIdentifiers() {
        return invoiceIdentifiers;
    }

    /**
     * Sets the value of the invoiceIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceIdentifiersType }
     *     
     */
    public void setInvoiceIdentifiers(InvoiceIdentifiersType value) {
        this.invoiceIdentifiers = value;
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
     * Gets the value of the buyer property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleBuyerType }
     *     
     */
    public SimpleBuyerType getBuyer() {
        return buyer;
    }

    /**
     * Sets the value of the buyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleBuyerType }
     *     
     */
    public void setBuyer(SimpleBuyerType value) {
        this.buyer = value;
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

    /**
     * Gets the value of the calculatedTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatedTaxesType }
     *     
     */
    public CalculatedTaxesType getCalculatedTaxes() {
        return calculatedTaxes;
    }

    /**
     * Sets the value of the calculatedTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatedTaxesType }
     *     
     */
    public void setCalculatedTaxes(CalculatedTaxesType value) {
        this.calculatedTaxes = value;
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
     * Gets the value of the invoiceLinesList property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceLinesListType }
     *     
     */
    public InvoiceLinesListType getInvoiceLinesList() {
        return invoiceLinesList;
    }

    /**
     * Sets the value of the invoiceLinesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceLinesListType }
     *     
     */
    public void setInvoiceLinesList(InvoiceLinesListType value) {
        this.invoiceLinesList = value;
    }

}
