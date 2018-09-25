
package pt.gov.portaldasfinancas.servicos.taxfree;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefundQueryResultsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefundQueryResultsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="RefundableAmountNotDefined">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Montante Exato a Restituir N�o Definido"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RefundableAmount" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}MonetaryType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefundQueryResultsType", propOrder = {
    "refundableAmountNotDefined",
    "refundableAmount"
})
public class RefundQueryResultsType {

    @XmlElement(name = "RefundableAmountNotDefined")
    protected String refundableAmountNotDefined;
    @XmlElement(name = "RefundableAmount")
    protected BigDecimal refundableAmount;

    /**
     * Gets the value of the refundableAmountNotDefined property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundableAmountNotDefined() {
        return refundableAmountNotDefined;
    }

    /**
     * Sets the value of the refundableAmountNotDefined property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundableAmountNotDefined(String value) {
        this.refundableAmountNotDefined = value;
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

}
