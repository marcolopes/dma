
package eu.europa.ec.taxud.vies.services.checkvat.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vatNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="requestDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="valid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="traderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="traderCompanyType" type="{urn:ec.europa.eu:taxud:vies:services:checkVat:types}companyTypeCode" minOccurs="0"/>
 *         &lt;element name="traderAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="traderStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="traderPostcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="traderCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="traderNameMatch" type="{urn:ec.europa.eu:taxud:vies:services:checkVat:types}matchCode" minOccurs="0"/>
 *         &lt;element name="traderCompanyTypeMatch" type="{urn:ec.europa.eu:taxud:vies:services:checkVat:types}matchCode" minOccurs="0"/>
 *         &lt;element name="traderStreetMatch" type="{urn:ec.europa.eu:taxud:vies:services:checkVat:types}matchCode" minOccurs="0"/>
 *         &lt;element name="traderPostcodeMatch" type="{urn:ec.europa.eu:taxud:vies:services:checkVat:types}matchCode" minOccurs="0"/>
 *         &lt;element name="traderCityMatch" type="{urn:ec.europa.eu:taxud:vies:services:checkVat:types}matchCode" minOccurs="0"/>
 *         &lt;element name="requestIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "countryCode",
    "vatNumber",
    "requestDate",
    "valid",
    "traderName",
    "traderCompanyType",
    "traderAddress",
    "traderStreet",
    "traderPostcode",
    "traderCity",
    "traderNameMatch",
    "traderCompanyTypeMatch",
    "traderStreetMatch",
    "traderPostcodeMatch",
    "traderCityMatch",
    "requestIdentifier"
})
@XmlRootElement(name = "checkVatApproxResponse")
public class CheckVatApproxResponse {

    @XmlElement(required = true)
    protected String countryCode;
    @XmlElement(required = true)
    protected String vatNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar requestDate;
    protected boolean valid;
    @XmlElementRef(name = "traderName", namespace = "urn:ec.europa.eu:taxud:vies:services:checkVat:types", type = JAXBElement.class)
    protected JAXBElement<String> traderName;
    @XmlElementRef(name = "traderCompanyType", namespace = "urn:ec.europa.eu:taxud:vies:services:checkVat:types", type = JAXBElement.class)
    protected JAXBElement<String> traderCompanyType;
    protected String traderAddress;
    protected String traderStreet;
    protected String traderPostcode;
    protected String traderCity;
    protected String traderNameMatch;
    protected String traderCompanyTypeMatch;
    protected String traderStreetMatch;
    protected String traderPostcodeMatch;
    protected String traderCityMatch;
    @XmlElement(required = true)
    protected String requestIdentifier;

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the vatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatNumber() {
        return vatNumber;
    }

    /**
     * Sets the value of the vatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatNumber(String value) {
        this.vatNumber = value;
    }

    /**
     * Gets the value of the requestDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestDate() {
        return requestDate;
    }

    /**
     * Sets the value of the requestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestDate(XMLGregorianCalendar value) {
        this.requestDate = value;
    }

    /**
     * Gets the value of the valid property.
     * 
     */
    public boolean isValid() {
        return valid;
    }

    /**
     * Sets the value of the valid property.
     * 
     */
    public void setValid(boolean value) {
        this.valid = value;
    }

    /**
     * Gets the value of the traderName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTraderName() {
        return traderName;
    }

    /**
     * Sets the value of the traderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTraderName(JAXBElement<String> value) {
        this.traderName = value;
    }

    /**
     * Gets the value of the traderCompanyType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTraderCompanyType() {
        return traderCompanyType;
    }

    /**
     * Sets the value of the traderCompanyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTraderCompanyType(JAXBElement<String> value) {
        this.traderCompanyType = value;
    }

    /**
     * Gets the value of the traderAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderAddress() {
        return traderAddress;
    }

    /**
     * Sets the value of the traderAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderAddress(String value) {
        this.traderAddress = value;
    }

    /**
     * Gets the value of the traderStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderStreet() {
        return traderStreet;
    }

    /**
     * Sets the value of the traderStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderStreet(String value) {
        this.traderStreet = value;
    }

    /**
     * Gets the value of the traderPostcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderPostcode() {
        return traderPostcode;
    }

    /**
     * Sets the value of the traderPostcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderPostcode(String value) {
        this.traderPostcode = value;
    }

    /**
     * Gets the value of the traderCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderCity() {
        return traderCity;
    }

    /**
     * Sets the value of the traderCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderCity(String value) {
        this.traderCity = value;
    }

    /**
     * Gets the value of the traderNameMatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderNameMatch() {
        return traderNameMatch;
    }

    /**
     * Sets the value of the traderNameMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderNameMatch(String value) {
        this.traderNameMatch = value;
    }

    /**
     * Gets the value of the traderCompanyTypeMatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderCompanyTypeMatch() {
        return traderCompanyTypeMatch;
    }

    /**
     * Sets the value of the traderCompanyTypeMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderCompanyTypeMatch(String value) {
        this.traderCompanyTypeMatch = value;
    }

    /**
     * Gets the value of the traderStreetMatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderStreetMatch() {
        return traderStreetMatch;
    }

    /**
     * Sets the value of the traderStreetMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderStreetMatch(String value) {
        this.traderStreetMatch = value;
    }

    /**
     * Gets the value of the traderPostcodeMatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderPostcodeMatch() {
        return traderPostcodeMatch;
    }

    /**
     * Sets the value of the traderPostcodeMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderPostcodeMatch(String value) {
        this.traderPostcodeMatch = value;
    }

    /**
     * Gets the value of the traderCityMatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderCityMatch() {
        return traderCityMatch;
    }

    /**
     * Sets the value of the traderCityMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderCityMatch(String value) {
        this.traderCityMatch = value;
    }

    /**
     * Gets the value of the requestIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestIdentifier() {
        return requestIdentifier;
    }

    /**
     * Sets the value of the requestIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestIdentifier(String value) {
        this.requestIdentifier = value;
    }

}
