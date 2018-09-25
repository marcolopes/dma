
package pt.gov.portaldasfinancas.servicos.taxfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ContingencySubmissionResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContingencySubmissionResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReturnInfo" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}ReturnInfoType"/>
 *         &lt;element name="RegistrationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContingencySubmissionResponseType", propOrder = {
    "returnInfo",
    "registrationDateTime"
})
public class ContingencySubmissionResponseType {

    @XmlElement(name = "ReturnInfo", required = true)
    protected ReturnInfoType returnInfo;
    @XmlElement(name = "RegistrationDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar registrationDateTime;

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
     * Gets the value of the registrationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistrationDateTime() {
        return registrationDateTime;
    }

    /**
     * Sets the value of the registrationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegistrationDateTime(XMLGregorianCalendar value) {
        this.registrationDateTime = value;
    }

}
