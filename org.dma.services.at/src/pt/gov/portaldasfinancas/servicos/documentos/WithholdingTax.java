
package pt.gov.portaldasfinancas.servicos.documentos;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WithholdingTax complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WithholdingTax">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WithholdingTaxType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="IRS"/>
 *               &lt;enumeration value="IRC"/>
 *               &lt;enumeration value="IS"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WithholdingTaxAmount" type="{http://factemi.at.min_financas.pt/documents}MonetaryType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WithholdingTax", propOrder = {
    "withholdingTaxType",
    "withholdingTaxAmount"
})
public class WithholdingTax {

    @XmlElement(name = "WithholdingTaxType")
    protected String withholdingTaxType;
    @XmlElement(name = "WithholdingTaxAmount", required = true)
    protected BigDecimal withholdingTaxAmount;

    /**
     * Gets the value of the withholdingTaxType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithholdingTaxType() {
        return withholdingTaxType;
    }

    /**
     * Sets the value of the withholdingTaxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithholdingTaxType(String value) {
        this.withholdingTaxType = value;
    }

    /**
     * Gets the value of the withholdingTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWithholdingTaxAmount() {
        return withholdingTaxAmount;
    }

    /**
     * Sets the value of the withholdingTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWithholdingTaxAmount(BigDecimal value) {
        this.withholdingTaxAmount = value;
    }

}
