
package pt.gov.portaldasfinancas.servicos.documentos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NewWorkStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NewWorkStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WorkStatus">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="N"/>
 *               &lt;enumeration value="A"/>
 *               &lt;enumeration value="F"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WorkStatusDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewWorkStatusType", propOrder = {
    "workStatus",
    "workStatusDate"
})
public class NewWorkStatusType {

    @XmlElement(name = "WorkStatus", required = true)
    protected String workStatus;
    @XmlElement(name = "WorkStatusDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar workStatusDate;

    /**
     * Gets the value of the workStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkStatus() {
        return workStatus;
    }

    /**
     * Sets the value of the workStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkStatus(String value) {
        this.workStatus = value;
    }

    /**
     * Gets the value of the workStatusDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWorkStatusDate() {
        return workStatusDate;
    }

    /**
     * Sets the value of the workStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWorkStatusDate(XMLGregorianCalendar value) {
        this.workStatusDate = value;
    }

}
