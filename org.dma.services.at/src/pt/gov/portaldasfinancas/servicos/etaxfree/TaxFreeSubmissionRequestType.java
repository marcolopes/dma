
package pt.gov.portaldasfinancas.servicos.etaxfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxFreeSubmissionRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxFreeSubmissionRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestHeader" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}RequestHeaderType"/>
 *         &lt;element name="TaxFreeComm" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}TaxFreeCommType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxFreeSubmissionRequestType", propOrder = {
    "requestHeader",
    "taxFreeComm"
})
public class TaxFreeSubmissionRequestType {

    @XmlElement(name = "RequestHeader", required = true)
    protected RequestHeaderType requestHeader;
    @XmlElement(name = "TaxFreeComm", required = true)
    protected TaxFreeCommType taxFreeComm;

    /**
     * Gets the value of the requestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link RequestHeaderType }
     *     
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the value of the requestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestHeaderType }
     *     
     */
    public void setRequestHeader(RequestHeaderType value) {
        this.requestHeader = value;
    }

    /**
     * Gets the value of the taxFreeComm property.
     * 
     * @return
     *     possible object is
     *     {@link TaxFreeCommType }
     *     
     */
    public TaxFreeCommType getTaxFreeComm() {
        return taxFreeComm;
    }

    /**
     * Sets the value of the taxFreeComm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxFreeCommType }
     *     
     */
    public void setTaxFreeComm(TaxFreeCommType value) {
        this.taxFreeComm = value;
    }

}
