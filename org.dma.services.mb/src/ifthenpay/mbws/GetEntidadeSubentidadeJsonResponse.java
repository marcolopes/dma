
package ifthenpay.mbws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="getEntidadeSubentidadeJsonResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getEntidadeSubentidadeJsonResult"
})
@XmlRootElement(name = "getEntidadeSubentidadeJsonResponse")
public class GetEntidadeSubentidadeJsonResponse {

    protected String getEntidadeSubentidadeJsonResult;

    /**
     * Gets the value of the getEntidadeSubentidadeJsonResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetEntidadeSubentidadeJsonResult() {
        return getEntidadeSubentidadeJsonResult;
    }

    /**
     * Sets the value of the getEntidadeSubentidadeJsonResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetEntidadeSubentidadeJsonResult(String value) {
        this.getEntidadeSubentidadeJsonResult = value;
    }

}
