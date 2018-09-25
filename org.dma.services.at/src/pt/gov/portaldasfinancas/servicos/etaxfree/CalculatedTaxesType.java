
package pt.gov.portaldasfinancas.servicos.etaxfree;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalculatedTaxesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalculatedTaxesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CalculatedTax" type="{http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService}CalculatedTaxType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculatedTaxesType", propOrder = {
    "calculatedTax"
})
public class CalculatedTaxesType {

    @XmlElement(name = "CalculatedTax", required = true)
    protected List<CalculatedTaxType> calculatedTax;

    /**
     * Gets the value of the calculatedTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calculatedTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalculatedTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CalculatedTaxType }
     * 
     * 
     */
    public List<CalculatedTaxType> getCalculatedTax() {
        if (calculatedTax == null) {
            calculatedTax = new ArrayList<CalculatedTaxType>();
        }
        return this.calculatedTax;
    }

}
