
package pt.gov.portaldasfinancas.servicos.etaxfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TaxFreeAnnulmentResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxFreeAnnulmentResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReturnInfo" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}ReturnInfoType"/>
 *         &lt;element name="AnnulmentDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxFreeAnnulmentResponseType", propOrder = {
    "returnInfo",
    "annulmentDateTime"
})
public class TaxFreeAnnulmentResponseType {

    @XmlElement(name = "ReturnInfo", required = true)
    protected ReturnInfoType returnInfo;
    @XmlElement(name = "AnnulmentDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar annulmentDateTime;

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
     * Gets the value of the annulmentDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAnnulmentDateTime() {
        return annulmentDateTime;
    }

    /**
     * Sets the value of the annulmentDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAnnulmentDateTime(XMLGregorianCalendar value) {
        this.annulmentDateTime = value;
    }

}
