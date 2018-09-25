
package pt.gov.portaldasfinancas.servicos.etaxfree.taxfreeservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxFreeSearchResultsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxFreeSearchResultsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxFreeComm" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}TaxFreeSearchResultType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxFreeSearchResultsType", propOrder = {
    "taxFreeComm"
})
public class TaxFreeSearchResultsType {

    @XmlElement(name = "TaxFreeComm", required = true)
    protected List<TaxFreeSearchResultType> taxFreeComm;

    /**
     * Gets the value of the taxFreeComm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxFreeComm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxFreeComm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxFreeSearchResultType }
     * 
     * 
     */
    public List<TaxFreeSearchResultType> getTaxFreeComm() {
        if (taxFreeComm == null) {
            taxFreeComm = new ArrayList<TaxFreeSearchResultType>();
        }
        return this.taxFreeComm;
    }

}
