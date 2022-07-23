
package pt.gov.portaldasfinancas.servicos.documentos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WorkHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://factemi.at.min_financas.pt/documents}DocumentNumber"/>
 *         &lt;element ref="{http://factemi.at.min_financas.pt/documents}ATCUD"/>
 *         &lt;element ref="{http://factemi.at.min_financas.pt/documents}WorkDate"/>
 *         &lt;element ref="{http://factemi.at.min_financas.pt/documents}WorkType"/>
 *         &lt;element ref="{http://factemi.at.min_financas.pt/documents}CustomerTaxID"/>
 *         &lt;element ref="{http://factemi.at.min_financas.pt/documents}CustomerTaxIDCountry"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkHeaderType", propOrder = {
    "documentNumber",
    "atcud",
    "workDate",
    "workType",
    "customerTaxID",
    "customerTaxIDCountry"
})
@XmlSeeAlso({
    WorkDataType.class
})
public class WorkHeaderType {

    @XmlElement(name = "DocumentNumber", required = true)
    protected String documentNumber;
    @XmlElement(name = "ATCUD", required = true)
    protected String atcud;
    @XmlElement(name = "WorkDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar workDate;
    @XmlElement(name = "WorkType", required = true)
    protected WorkTypeType workType;
    @XmlElement(name = "CustomerTaxID", required = true)
    protected String customerTaxID;
    @XmlElement(name = "CustomerTaxIDCountry", required = true)
    protected String customerTaxIDCountry;

    /**
     * Gets the value of the documentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Sets the value of the documentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumber(String value) {
        this.documentNumber = value;
    }

    /**
     * Gets the value of the atcud property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATCUD() {
        return atcud;
    }

    /**
     * Sets the value of the atcud property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATCUD(String value) {
        this.atcud = value;
    }

    /**
     * Gets the value of the workDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWorkDate() {
        return workDate;
    }

    /**
     * Sets the value of the workDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWorkDate(XMLGregorianCalendar value) {
        this.workDate = value;
    }

    /**
     * Gets the value of the workType property.
     * 
     * @return
     *     possible object is
     *     {@link WorkTypeType }
     *     
     */
    public WorkTypeType getWorkType() {
        return workType;
    }

    /**
     * Sets the value of the workType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkTypeType }
     *     
     */
    public void setWorkType(WorkTypeType value) {
        this.workType = value;
    }

    /**
     * Gets the value of the customerTaxID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerTaxID() {
        return customerTaxID;
    }

    /**
     * Sets the value of the customerTaxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerTaxID(String value) {
        this.customerTaxID = value;
    }

    /**
     * Gets the value of the customerTaxIDCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerTaxIDCountry() {
        return customerTaxIDCountry;
    }

    /**
     * Sets the value of the customerTaxIDCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerTaxIDCountry(String value) {
        this.customerTaxIDCountry = value;
    }

}
