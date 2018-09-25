
package pt.gov.portaldasfinancas.servicos.documentosTransporte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Comunica��o de um Documentos de Transporte pelo Cliente
 * 
 * <p>Java class for StockMovement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StockMovement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxRegistrationNumber" type="{https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/}SAFPTPortugueseVatNumber"/>
 *         &lt;element name="CompanyName" type="{https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/}SAFPTtextTypeMandatoryMax100Car"/>
 *         &lt;element name="CompanyAddress" type="{https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/}AddressStructurePT"/>
 *         &lt;element name="DocumentNumber" type="{https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/}SAFPTtextTypeMandatoryMax60Car"/>
 *         &lt;element name="ATDocCodeID" type="{https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/}SAFPTtextTypeMandatoryMax200Car" minOccurs="0"/>
 *         &lt;element name="MovementStatus" type="{https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/}MovementStatus"/>
 *         &lt;element name="MovementDate" type="{https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/}SAFdateType"/>
 *         &lt;element name="MovementType" type="{https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/}MovementType"/>
 *         &lt;choice>
 *           &lt;element name="CustomerTaxID" type="{https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/}SAFPTtextTypeMandatoryMax20Car" minOccurs="0"/>
 *           &lt;element name="SupplierTaxID" type="{https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/}SAFPTtextTypeMandatoryMax20Car" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="CustomerAddress" type="{https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/}AddressStructurePT" minOccurs="0"/>
 *         &lt;element name="CustomerName" type="{https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/}SAFPTtextTypeMandatoryMax100Car" minOccurs="0"/>
 *         &lt;element name="AddressTo" type="{https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/}AddressStructurePT" minOccurs="0"/>
 *         &lt;element name="AddressFrom" type="{https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/}AddressStructurePT"/>
 *         &lt;element name="MovementEndTime" type="{https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/}SAFdateTimeType" minOccurs="0"/>
 *         &lt;element name="MovementStartTime" type="{https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/}SAFdateTimeType"/>
 *         &lt;element name="VehicleID" type="{https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/}SAFPTtextTypeMandatoryMax32Car" minOccurs="0"/>
 *         &lt;element name="Line" type="{https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/}Line" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StockMovement", propOrder = {
    "taxRegistrationNumber",
    "companyName",
    "companyAddress",
    "documentNumber",
    "atDocCodeID",
    "movementStatus",
    "movementDate",
    "movementType",
    "customerTaxID",
    "supplierTaxID",
    "customerAddress",
    "customerName",
    "addressTo",
    "addressFrom",
    "movementEndTime",
    "movementStartTime",
    "vehicleID",
    "line"
})
public class StockMovement {

    @XmlElement(name = "TaxRegistrationNumber")
    protected int taxRegistrationNumber;
    @XmlElement(name = "CompanyName", required = true)
    protected String companyName;
    @XmlElement(name = "CompanyAddress", required = true)
    protected AddressStructurePT companyAddress;
    @XmlElement(name = "DocumentNumber", required = true)
    protected String documentNumber;
    @XmlElement(name = "ATDocCodeID")
    protected String atDocCodeID;
    @XmlElement(name = "MovementStatus", required = true)
    protected MovementStatus movementStatus;
    @XmlElement(name = "MovementDate", required = true)
    protected XMLGregorianCalendar movementDate;
    @XmlElement(name = "MovementType", required = true)
    protected MovementType movementType;
    @XmlElement(name = "CustomerTaxID")
    protected String customerTaxID;
    @XmlElement(name = "SupplierTaxID")
    protected String supplierTaxID;
    @XmlElement(name = "CustomerAddress")
    protected AddressStructurePT customerAddress;
    @XmlElement(name = "CustomerName")
    protected String customerName;
    @XmlElement(name = "AddressTo")
    protected AddressStructurePT addressTo;
    @XmlElement(name = "AddressFrom", required = true)
    protected AddressStructurePT addressFrom;
    @XmlElement(name = "MovementEndTime")
    protected XMLGregorianCalendar movementEndTime;
    @XmlElement(name = "MovementStartTime", required = true)
    protected XMLGregorianCalendar movementStartTime;
    @XmlElement(name = "VehicleID")
    protected String vehicleID;
    @XmlElement(name = "Line", required = true)
    protected List<Line> line;

    /**
     * Gets the value of the taxRegistrationNumber property.
     * 
     */
    public int getTaxRegistrationNumber() {
        return taxRegistrationNumber;
    }

    /**
     * Sets the value of the taxRegistrationNumber property.
     * 
     */
    public void setTaxRegistrationNumber(int value) {
        this.taxRegistrationNumber = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the companyAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressStructurePT }
     *     
     */
    public AddressStructurePT getCompanyAddress() {
        return companyAddress;
    }

    /**
     * Sets the value of the companyAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressStructurePT }
     *     
     */
    public void setCompanyAddress(AddressStructurePT value) {
        this.companyAddress = value;
    }

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
     * Gets the value of the atDocCodeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATDocCodeID() {
        return atDocCodeID;
    }

    /**
     * Sets the value of the atDocCodeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATDocCodeID(String value) {
        this.atDocCodeID = value;
    }

    /**
     * Gets the value of the movementStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MovementStatus }
     *     
     */
    public MovementStatus getMovementStatus() {
        return movementStatus;
    }

    /**
     * Sets the value of the movementStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MovementStatus }
     *     
     */
    public void setMovementStatus(MovementStatus value) {
        this.movementStatus = value;
    }

    /**
     * Gets the value of the movementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMovementDate() {
        return movementDate;
    }

    /**
     * Sets the value of the movementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMovementDate(XMLGregorianCalendar value) {
        this.movementDate = value;
    }

    /**
     * Gets the value of the movementType property.
     * 
     * @return
     *     possible object is
     *     {@link MovementType }
     *     
     */
    public MovementType getMovementType() {
        return movementType;
    }

    /**
     * Sets the value of the movementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MovementType }
     *     
     */
    public void setMovementType(MovementType value) {
        this.movementType = value;
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
     * Gets the value of the supplierTaxID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierTaxID() {
        return supplierTaxID;
    }

    /**
     * Sets the value of the supplierTaxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierTaxID(String value) {
        this.supplierTaxID = value;
    }

    /**
     * Gets the value of the customerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressStructurePT }
     *     
     */
    public AddressStructurePT getCustomerAddress() {
        return customerAddress;
    }

    /**
     * Sets the value of the customerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressStructurePT }
     *     
     */
    public void setCustomerAddress(AddressStructurePT value) {
        this.customerAddress = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the addressTo property.
     * 
     * @return
     *     possible object is
     *     {@link AddressStructurePT }
     *     
     */
    public AddressStructurePT getAddressTo() {
        return addressTo;
    }

    /**
     * Sets the value of the addressTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressStructurePT }
     *     
     */
    public void setAddressTo(AddressStructurePT value) {
        this.addressTo = value;
    }

    /**
     * Gets the value of the addressFrom property.
     * 
     * @return
     *     possible object is
     *     {@link AddressStructurePT }
     *     
     */
    public AddressStructurePT getAddressFrom() {
        return addressFrom;
    }

    /**
     * Sets the value of the addressFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressStructurePT }
     *     
     */
    public void setAddressFrom(AddressStructurePT value) {
        this.addressFrom = value;
    }

    /**
     * Gets the value of the movementEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMovementEndTime() {
        return movementEndTime;
    }

    /**
     * Sets the value of the movementEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMovementEndTime(XMLGregorianCalendar value) {
        this.movementEndTime = value;
    }

    /**
     * Gets the value of the movementStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMovementStartTime() {
        return movementStartTime;
    }

    /**
     * Sets the value of the movementStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMovementStartTime(XMLGregorianCalendar value) {
        this.movementStartTime = value;
    }

    /**
     * Gets the value of the vehicleID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleID() {
        return vehicleID;
    }

    /**
     * Sets the value of the vehicleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleID(String value) {
        this.vehicleID = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the line property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Line }
     * 
     * 
     */
    public List<Line> getLine() {
        if (line == null) {
            line = new ArrayList<Line>();
        }
        return this.line;
    }

}
