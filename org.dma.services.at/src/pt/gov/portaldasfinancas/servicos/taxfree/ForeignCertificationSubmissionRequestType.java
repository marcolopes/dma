
package pt.gov.portaldasfinancas.servicos.taxfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForeignCertificationSubmissionRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForeignCertificationSubmissionRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequesterTaxID" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}PtVatNumberType"/>
 *         &lt;element name="TaxFreeCommCode" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}TaxFreeCommCodeType"/>
 *         &lt;element name="CertifiedInvoices" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}CertifiedInvoicesType"/>
 *         &lt;element name="Certification" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}ForeignExportCertificateType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignCertificationSubmissionRequestType", propOrder = {
    "requesterTaxID",
    "taxFreeCommCode",
    "certifiedInvoices",
    "certification"
})
public class ForeignCertificationSubmissionRequestType {

    @XmlElement(name = "RequesterTaxID")
    protected int requesterTaxID;
    @XmlElement(name = "TaxFreeCommCode", required = true)
    protected String taxFreeCommCode;
    @XmlElement(name = "CertifiedInvoices", required = true)
    protected CertifiedInvoicesType certifiedInvoices;
    @XmlElement(name = "Certification", required = true)
    protected ForeignExportCertificateType certification;

    /**
     * Gets the value of the requesterTaxID property.
     * 
     */
    public int getRequesterTaxID() {
        return requesterTaxID;
    }

    /**
     * Sets the value of the requesterTaxID property.
     * 
     */
    public void setRequesterTaxID(int value) {
        this.requesterTaxID = value;
    }

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
     * Gets the value of the certifiedInvoices property.
     * 
     * @return
     *     possible object is
     *     {@link CertifiedInvoicesType }
     *     
     */
    public CertifiedInvoicesType getCertifiedInvoices() {
        return certifiedInvoices;
    }

    /**
     * Sets the value of the certifiedInvoices property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertifiedInvoicesType }
     *     
     */
    public void setCertifiedInvoices(CertifiedInvoicesType value) {
        this.certifiedInvoices = value;
    }

    /**
     * Gets the value of the certification property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExportCertificateType }
     *     
     */
    public ForeignExportCertificateType getCertification() {
        return certification;
    }

    /**
     * Sets the value of the certification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExportCertificateType }
     *     
     */
    public void setCertification(ForeignExportCertificateType value) {
        this.certification = value;
    }

}
