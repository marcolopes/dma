
package pt.gov.portaldasfinancas.servicos.taxfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxFreeSearchResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxFreeSearchResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReturnInfo" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}ReturnInfoType"/>
 *         &lt;element name="TaxFreeSearchResults" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}TaxFreeSearchResultsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxFreeSearchResponseType", propOrder = {
    "returnInfo",
    "taxFreeSearchResults"
})
public class TaxFreeSearchResponseType {

    @XmlElement(name = "ReturnInfo", required = true)
    protected ReturnInfoType returnInfo;
    @XmlElement(name = "TaxFreeSearchResults")
    protected TaxFreeSearchResultsType taxFreeSearchResults;

    /**
     * Gets the value of the returnInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnInfoType }
     *     
     */
    public ReturnInfoType getReturnInfo() {
        return returnInfo;
    }

    /**
     * Sets the value of the returnInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnInfoType }
     *     
     */
    public void setReturnInfo(ReturnInfoType value) {
        this.returnInfo = value;
    }

    /**
     * Gets the value of the taxFreeSearchResults property.
     * 
     * @return
     *     possible object is
     *     {@link TaxFreeSearchResultsType }
     *     
     */
    public TaxFreeSearchResultsType getTaxFreeSearchResults() {
        return taxFreeSearchResults;
    }

    /**
     * Sets the value of the taxFreeSearchResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxFreeSearchResultsType }
     *     
     */
    public void setTaxFreeSearchResults(TaxFreeSearchResultsType value) {
        this.taxFreeSearchResults = value;
    }

}
