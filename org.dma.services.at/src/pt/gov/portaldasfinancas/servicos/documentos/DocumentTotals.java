
package pt.gov.portaldasfinancas.servicos.documentos;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentTotals complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentTotals">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxPayable" type="{http://factemi.at.min_financas.pt/documents}MonetaryType"/>
 *         &lt;element name="NetTotal" type="{http://factemi.at.min_financas.pt/documents}MonetaryType"/>
 *         &lt;element name="GrossTotal" type="{http://factemi.at.min_financas.pt/documents}MonetaryType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentTotals", propOrder = {
    "taxPayable",
    "netTotal",
    "grossTotal"
})
public class DocumentTotals {

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
