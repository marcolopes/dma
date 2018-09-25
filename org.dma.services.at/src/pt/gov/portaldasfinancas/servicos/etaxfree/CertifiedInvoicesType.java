
package pt.gov.portaldasfinancas.servicos.etaxfree;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CertifiedInvoicesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CertifiedInvoicesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CertifiedInvoice" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}CertifiedInvoiceType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertifiedInvoicesType", propOrder = {
    "certifiedInvoice"
})
public class CertifiedInvoicesType {

    @XmlElement(name = "CertifiedInvoice", required = true)
    protected List<CertifiedInvoiceType> certifiedInvoice;

    /**
     * Gets the value of the certifiedInvoice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certifiedInvoice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertifiedInvoice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CertifiedInvoiceType }
     * 
     * 
     */
    public List<CertifiedInvoiceType> getCertifiedInvoice() {
        if (certifiedInvoice == null) {
            certifiedInvoice = new ArrayList<CertifiedInvoiceType>();
        }
        return this.certifiedInvoice;
    }

}
