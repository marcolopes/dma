
package pt.gov.portaldasfinancas.servicos.taxfree;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxFreeSearchRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxFreeSearchRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequesterTaxID" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}PtVatNumberType"/>
 *         &lt;element name="TaxFreeSearchCriteria" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}TaxFreeSearchCriteriaType"/>
 *         &lt;element name="ResultListStartIndex">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
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
@XmlType(name = "TaxFreeSearchRequestType", propOrder = {
    "requesterTaxID",
    "taxFreeSearchCriteria",
    "resultListStartIndex"
})
public class TaxFreeSearchRequestType {

    @XmlElement(name = "RequesterTaxID")
    protected int requesterTaxID;
    @XmlElement(name = "TaxFreeSearchCriteria", required = true)
    protected TaxFreeSearchCriteriaType taxFreeSearchCriteria;
    @XmlElement(name = "ResultListStartIndex", required = true)
    protected BigInteger resultListStartIndex;

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
     * Gets the value of the taxFreeSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link TaxFreeSearchCriteriaType }
     *     
     */
    public TaxFreeSearchCriteriaType getTaxFreeSearchCriteria() {
        return taxFreeSearchCriteria;
    }

    /**
     * Sets the value of the taxFreeSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxFreeSearchCriteriaType }
     *     
     */
    public void setTaxFreeSearchCriteria(TaxFreeSearchCriteriaType value) {
        this.taxFreeSearchCriteria = value;
    }

    /**
     * Gets the value of the resultListStartIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResultListStartIndex() {
        return resultListStartIndex;
    }

    /**
     * Sets the value of the resultListStartIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResultListStartIndex(BigInteger value) {
        this.resultListStartIndex = value;
    }

}
