
package pt.gov.portaldasfinancas.servicos.etaxfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefundQueryByRefundCompanyResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefundQueryByRefundCompanyResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReturnInfo" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}ReturnInfoType"/>
 *         &lt;element name="RefundQueryResults" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}RefundQueryResultsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefundQueryByRefundCompanyResponseType", propOrder = {
    "returnInfo",
    "refundQueryResults"
})
public class RefundQueryByRefundCompanyResponseType {

    @XmlElement(name = "ReturnInfo", required = true)
    protected ReturnInfoType returnInfo;
    @XmlElement(name = "RefundQueryResults")
    protected RefundQueryResultsType refundQueryResults;

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
     * Gets the value of the refundQueryResults property.
     * 
     * @return
     *     possible object is
     *     {@link RefundQueryResultsType }
     *     
     */
    public RefundQueryResultsType getRefundQueryResults() {
        return refundQueryResults;
    }

    /**
     * Sets the value of the refundQueryResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundQueryResultsType }
     *     
     */
    public void setRefundQueryResults(RefundQueryResultsType value) {
        this.refundQueryResults = value;
    }

}
