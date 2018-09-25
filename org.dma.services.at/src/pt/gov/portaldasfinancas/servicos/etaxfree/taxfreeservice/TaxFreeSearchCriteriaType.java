
package pt.gov.portaldasfinancas.servicos.etaxfree.taxfreeservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxFreeSearchCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxFreeSearchCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxFreeCommCode" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}TaxFreeCommCodeType" minOccurs="0"/>
 *         &lt;element name="RefundCompanyTaxRegistrationNumber" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}PtVatNumberType" minOccurs="0"/>
 *         &lt;element name="RegistrationDateInterval" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}DateIntervalType" minOccurs="0"/>
 *         &lt;element name="CurrentStatusCriteria" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}CurrentStatusCriteriaType" minOccurs="0"/>
 *         &lt;element name="BuyerIdentityDoc" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}IdentityDocType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxFreeSearchCriteriaType", propOrder = {
    "taxFreeCommCode",
    "refundCompanyTaxRegistrationNumber",
    "registrationDateInterval",
    "currentStatusCriteria",
    "buyerIdentityDoc"
})
public class TaxFreeSearchCriteriaType {

    @XmlElement(name = "TaxFreeCommCode")
    protected String taxFreeCommCode;
    @XmlElement(name = "RefundCompanyTaxRegistrationNumber")
    protected Integer refundCompanyTaxRegistrationNumber;
    @XmlElement(name = "RegistrationDateInterval")
    protected DateIntervalType registrationDateInterval;
    @XmlElement(name = "CurrentStatusCriteria")
    protected CurrentStatusCriteriaType currentStatusCriteria;
    @XmlElement(name = "BuyerIdentityDoc")
    protected IdentityDocType buyerIdentityDoc;

    /**
     * Gets the value of the taxFreeCommCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxFreeCommCode() {
        return taxFreeCommCode;
    }

    /**
     * Sets the value of the taxFreeCommCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxFreeCommCode(String value) {
        this.taxFreeCommCode = value;
    }

    /**
     * Gets the value of the refundCompanyTaxRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRefundCompanyTaxRegistrationNumber() {
        return refundCompanyTaxRegistrationNumber;
    }

    /**
     * Sets the value of the refundCompanyTaxRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRefundCompanyTaxRegistrationNumber(Integer value) {
        this.refundCompanyTaxRegistrationNumber = value;
    }

    /**
     * Gets the value of the registrationDateInterval property.
     * 
     * @return
     *     possible object is
     *     {@link DateIntervalType }
     *     
     */
    public DateIntervalType getRegistrationDateInterval() {
        return registrationDateInterval;
    }

    /**
     * Sets the value of the registrationDateInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateIntervalType }
     *     
     */
    public void setRegistrationDateInterval(DateIntervalType value) {
        this.registrationDateInterval = value;
    }

    /**
     * Gets the value of the currentStatusCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentStatusCriteriaType }
     *     
     */
    public CurrentStatusCriteriaType getCurrentStatusCriteria() {
        return currentStatusCriteria;
    }

    /**
     * Sets the value of the currentStatusCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentStatusCriteriaType }
     *     
     */
    public void setCurrentStatusCriteria(CurrentStatusCriteriaType value) {
        this.currentStatusCriteria = value;
    }

    /**
     * Gets the value of the buyerIdentityDoc property.
     * 
     * @return
     *     possible object is
     *     {@link IdentityDocType }
     *     
     */
    public IdentityDocType getBuyerIdentityDoc() {
        return buyerIdentityDoc;
    }

    /**
     * Sets the value of the buyerIdentityDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityDocType }
     *     
     */
    public void setBuyerIdentityDoc(IdentityDocType value) {
        this.buyerIdentityDoc = value;
    }

}
