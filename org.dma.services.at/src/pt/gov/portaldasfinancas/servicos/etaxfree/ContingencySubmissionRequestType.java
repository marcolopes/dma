
package pt.gov.portaldasfinancas.servicos.etaxfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContingencySubmissionRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContingencySubmissionRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestHeader" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}RequestHeaderType"/>
 *         &lt;element name="ContingencySubmission" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}ContingencySubmissionType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContingencySubmissionRequestType", propOrder = {
    "requestHeader",
    "contingencySubmission"
})
public class ContingencySubmissionRequestType {

    @XmlElement(name = "RequestHeader", required = true)
    protected RequestHeaderType requestHeader;
    @XmlElement(name = "ContingencySubmission", required = true)
    protected ContingencySubmissionType contingencySubmission;

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
     * Gets the value of the contingencySubmission property.
     * 
     * @return
     *     possible object is
     *     {@link ContingencySubmissionType }
     *     
     */
    public ContingencySubmissionType getContingencySubmission() {
        return contingencySubmission;
    }

    /**
     * Sets the value of the contingencySubmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContingencySubmissionType }
     *     
     */
    public void setContingencySubmission(ContingencySubmissionType value) {
        this.contingencySubmission = value;
    }

}
