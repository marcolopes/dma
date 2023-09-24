
package ifthenpay.mbws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfIfmb complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfIfmb">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ifmb" type="{https://www.ifthenpay.com/}Ifmb" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfIfmb", propOrder = {
    "ifmb"
})
public class ArrayOfIfmb {

    @XmlElement(name = "Ifmb", nillable = true)
    protected List<Ifmb> ifmb;

    /**
     * Gets the value of the ifmb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ifmb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIfmb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ifmb }
     * 
     * 
     */
    public List<Ifmb> getIfmb() {
        if (ifmb == null) {
            ifmb = new ArrayList<Ifmb>();
        }
        return this.ifmb;
    }

}
