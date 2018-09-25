
package pt.gov.portaldasfinancas.servicos.etaxfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CurrentStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrentStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}InvoiceStatusType"/>
 *         &lt;element name="StatusDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrentStatusType", propOrder = {
    "status",
    "statusDateTime"
})
public class CurrentStatusType {

    @XmlElement(name = "Status", required = true)
    protected InvoiceStatusType status;
    @XmlElement(name = "StatusDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusDateTime;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceStatusType }
     *     
     */
    public InvoiceStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceStatusType }
     *     
     */
    public void setStatus(InvoiceStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusDateTime() {
        return statusDateTime;
    }

    /**
     * Sets the value of the statusDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusDateTime(XMLGregorianCalendar value) {
        this.statusDateTime = value;
    }

}
