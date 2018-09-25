
package pt.gov.portaldasfinancas.servicos.taxfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceIdentifiersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceIdentifiersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InvoiceNo" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}InvoiceNumberType"/>
 *         &lt;element name="HashTermination">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "InvoiceIdentifiersType", propOrder = {
    "invoiceNo",
    "hashTermination"
})
public class InvoiceIdentifiersType {

    @XmlElement(name = "InvoiceNo", required = true)
    protected String invoiceNo;
    @XmlElement(name = "HashTermination", required = true)
    protected String hashTermination;

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
     * Gets the value of the hashTermination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHashTermination() {
        return hashTermination;
    }

    /**
     * Sets the value of the hashTermination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHashTermination(String value) {
        this.hashTermination = value;
    }

}
