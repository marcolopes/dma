
package pt.gov.portaldasfinancas.servicos.etaxfree;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefundType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefundType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GuaranteeTotal" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}MonetaryType"/>
 *         &lt;element name="CalculatedTaxTotal" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}MonetaryType"/>
 *         &lt;element name="RefundableTotal" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}MonetaryType"/>
 *         &lt;element name="RefundCompanyTaxRegistrationNumber" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}PtVatNumberType" minOccurs="0"/>
 *         &lt;element name="RefundCompanyAutorization" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Declaro que autorizo a Autoridade Tribut�ria e Aduaneira a disponibilizar ao Intermedi�rio Financeiro identificado na presente comunica��o, o montante exato a restituir ao Viajante"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefundType", propOrder = {
    "guaranteeTotal",
    "calculatedTaxTotal",
    "refundableTotal",
    "refundCompanyTaxRegistrationNumber",
    "refundCompanyAutorization"
})
public class RefundType {

    @XmlElement(name = "GuaranteeTotal", required = true)
    protected BigDecimal guaranteeTotal;
    @XmlElement(name = "CalculatedTaxTotal", required = true)
    protected BigDecimal calculatedTaxTotal;
    @XmlElement(name = "RefundableTotal", required = true)
    protected BigDecimal refundableTotal;
    @XmlElement(name = "RefundCompanyTaxRegistrationNumber")
    protected Integer refundCompanyTaxRegistrationNumber;
    @XmlElement(name = "RefundCompanyAutorization")
    protected String refundCompanyAutorization;

    /**
     * Gets the value of the guaranteeTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGuaranteeTotal() {
        return guaranteeTotal;
    }

    /**
     * Sets the value of the guaranteeTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGuaranteeTotal(BigDecimal value) {
        this.guaranteeTotal = value;
    }

    /**
     * Gets the value of the calculatedTaxTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalculatedTaxTotal() {
        return calculatedTaxTotal;
    }

    /**
     * Sets the value of the calculatedTaxTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalculatedTaxTotal(BigDecimal value) {
        this.calculatedTaxTotal = value;
    }

    /**
     * Gets the value of the refundableTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRefundableTotal() {
        return refundableTotal;
    }

    /**
     * Sets the value of the refundableTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRefundableTotal(BigDecimal value) {
        this.refundableTotal = value;
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
     * Gets the value of the refundCompanyAutorization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundCompanyAutorization() {
        return refundCompanyAutorization;
    }

    /**
     * Sets the value of the refundCompanyAutorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundCompanyAutorization(String value) {
        this.refundCompanyAutorization = value;
    }

}
