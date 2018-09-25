
package pt.gov.portaldasfinancas.servicos.taxfree;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceLineDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceLineDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductClass">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="3"/>
 *               &lt;pattern value="[A-Z][A-Z][A-Z]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ProductDescription" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}TextMandatoryMax200"/>
 *         &lt;element name="Quantity">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="4"/>
 *               &lt;minInclusive value="0.0001"/>
 *               &lt;totalDigits value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TaxBaseTotal" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}PositiveMonetaryType"/>
 *         &lt;element name="TaxPercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="4"/>
 *               &lt;fractionDigits value="2"/>
 *               &lt;minInclusive value="0.01"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SerialNumbersList" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}SerialNumbersListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceLineDetailType", propOrder = {
    "productClass",
    "productDescription",
    "quantity",
    "taxBaseTotal",
    "taxPercentage",
    "serialNumbersList"
})
public class InvoiceLineDetailType {

    @XmlElement(name = "ProductClass", required = true)
    protected String productClass;
    @XmlElement(name = "ProductDescription", required = true)
    protected String productDescription;
    @XmlElement(name = "Quantity", required = true)
    protected BigDecimal quantity;
    @XmlElement(name = "TaxBaseTotal", required = true)
    protected BigDecimal taxBaseTotal;
    @XmlElement(name = "TaxPercentage")
    protected BigDecimal taxPercentage;
    @XmlElement(name = "SerialNumbersList")
    protected SerialNumbersListType serialNumbersList;

    /**
     * Gets the value of the productClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductClass() {
        return productClass;
    }

    /**
     * Sets the value of the productClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductClass(String value) {
        this.productClass = value;
    }

    /**
     * Gets the value of the productDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the value of the productDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDescription(String value) {
        this.productDescription = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantity(BigDecimal value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the taxBaseTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxBaseTotal() {
        return taxBaseTotal;
    }

    /**
     * Sets the value of the taxBaseTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxBaseTotal(BigDecimal value) {
        this.taxBaseTotal = value;
    }

    /**
     * Gets the value of the taxPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxPercentage() {
        return taxPercentage;
    }

    /**
     * Sets the value of the taxPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxPercentage(BigDecimal value) {
        this.taxPercentage = value;
    }

    /**
     * Gets the value of the serialNumbersList property.
     * 
     * @return
     *     possible object is
     *     {@link SerialNumbersListType }
     *     
     */
    public SerialNumbersListType getSerialNumbersList() {
        return serialNumbersList;
    }

    /**
     * Sets the value of the serialNumbersList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerialNumbersListType }
     *     
     */
    public void setSerialNumbersList(SerialNumbersListType value) {
        this.serialNumbersList = value;
    }

}
