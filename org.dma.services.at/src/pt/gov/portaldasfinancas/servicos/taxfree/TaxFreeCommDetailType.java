
package pt.gov.portaldasfinancas.servicos.taxfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxFreeCommDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxFreeCommDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}TextMandatoryMax30" minOccurs="0"/>
 *         &lt;element name="Seller" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}CompanyType"/>
 *         &lt;choice>
 *           &lt;element name="PreviousTaxFreeComm" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}PreviousTaxFreeCommType"/>
 *           &lt;element name="Buyer" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}BuyerType"/>
 *         &lt;/choice>
 *         &lt;element name="Refund" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}RefundType"/>
 *         &lt;element name="Invoices" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}InvoicesDetailType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxFreeCommDetailType", propOrder = {
    "identifier",
    "seller",
    "previousTaxFreeComm",
    "buyer",
    "refund",
    "invoices"
})
public class TaxFreeCommDetailType {

    @XmlElement(name = "Identifier")
    protected String identifier;
    @XmlElement(name = "Seller", required = true)
    protected CompanyType seller;
    @XmlElement(name = "PreviousTaxFreeComm")
    protected PreviousTaxFreeCommType previousTaxFreeComm;
    @XmlElement(name = "Buyer")
    protected BuyerType buyer;
    @XmlElement(name = "Refund", required = true)
    protected RefundType refund;
    @XmlElement(name = "Invoices", required = true)
    protected InvoicesDetailType invoices;

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
     * Gets the value of the seller property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyType }
     *     
     */
    public CompanyType getSeller() {
        return seller;
    }

    /**
     * Sets the value of the seller property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyType }
     *     
     */
    public void setSeller(CompanyType value) {
        this.seller = value;
    }

    /**
     * Gets the value of the previousTaxFreeComm property.
     * 
     * @return
     *     possible object is
     *     {@link PreviousTaxFreeCommType }
     *     
     */
    public PreviousTaxFreeCommType getPreviousTaxFreeComm() {
        return previousTaxFreeComm;
    }

    /**
     * Sets the value of the previousTaxFreeComm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousTaxFreeCommType }
     *     
     */
    public void setPreviousTaxFreeComm(PreviousTaxFreeCommType value) {
        this.previousTaxFreeComm = value;
    }

    /**
     * Gets the value of the buyer property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerType }
     *     
     */
    public BuyerType getBuyer() {
        return buyer;
    }

    /**
     * Sets the value of the buyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerType }
     *     
     */
    public void setBuyer(BuyerType value) {
        this.buyer = value;
    }

    /**
     * Gets the value of the refund property.
     * 
     * @return
     *     possible object is
     *     {@link RefundType }
     *     
     */
    public RefundType getRefund() {
        return refund;
    }

    /**
     * Sets the value of the refund property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundType }
     *     
     */
    public void setRefund(RefundType value) {
        this.refund = value;
    }

    /**
     * Gets the value of the invoices property.
     * 
     * @return
     *     possible object is
     *     {@link InvoicesDetailType }
     *     
     */
    public InvoicesDetailType getInvoices() {
        return invoices;
    }

    /**
     * Sets the value of the invoices property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoicesDetailType }
     *     
     */
    public void setInvoices(InvoicesDetailType value) {
        this.invoices = value;
    }

}
