
package pt.gov.portaldasfinancas.servicos.taxfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrentStatusCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrentStatusCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentStatus">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}InvoiceStatusType">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StatusDateInterval" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}DateIntervalType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrentStatusCriteriaType", propOrder = {
    "currentStatus",
    "statusDateInterval"
})
public class CurrentStatusCriteriaType {

    @XmlElement(name = "CurrentStatus", required = true)
    protected InvoiceStatusType currentStatus;
    @XmlElement(name = "StatusDateInterval", required = true)
    protected DateIntervalType statusDateInterval;

    /**
     * Gets the value of the currentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceStatusType }
     *     
     */
    public InvoiceStatusType getCurrentStatus() {
        return currentStatus;
    }

    /**
     * Sets the value of the currentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceStatusType }
     *     
     */
    public void setCurrentStatus(InvoiceStatusType value) {
        this.currentStatus = value;
    }

    /**
     * Gets the value of the statusDateInterval property.
     * 
     * @return
     *     possible object is
     *     {@link DateIntervalType }
     *     
     */
    public DateIntervalType getStatusDateInterval() {
        return statusDateInterval;
    }

    /**
     * Sets the value of the statusDateInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateIntervalType }
     *     
     */
    public void setStatusDateInterval(DateIntervalType value) {
        this.statusDateInterval = value;
    }

}
