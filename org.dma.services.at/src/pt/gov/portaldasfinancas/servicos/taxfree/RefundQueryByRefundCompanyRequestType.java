
package pt.gov.portaldasfinancas.servicos.taxfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefundQueryByRefundCompanyRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefundQueryByRefundCompanyRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequesterTaxID" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}PtVatNumberType"/>
 *         &lt;element name="TaxFreeCommCode" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}TaxFreeCommCodeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefundQueryByRefundCompanyRequestType", propOrder = {
    "requesterTaxID",
    "taxFreeCommCode"
})
public class RefundQueryByRefundCompanyRequestType {

    @XmlElement(name = "RequesterTaxID")
    protected int requesterTaxID;
    @XmlElement(name = "TaxFreeCommCode", required = true)
    protected String taxFreeCommCode;

    /**
     * Gets the value of the requesterTaxID property.
     * 
     */
    public int getRequesterTaxID() {
        return requesterTaxID;
    }

    /**
     * Sets the value of the requesterTaxID property.
     * 
     */
    public void setRequesterTaxID(int value) {
        this.requesterTaxID = value;
    }

    /**
     * Gets the value of the taxFreeCommCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxFreeCommCode() {
        return taxFreeCommCode;
    }

    /**
     * Sets the value of the taxFreeCommCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxFreeCommCode(String value) {
        this.taxFreeCommCode = value;
    }

}
