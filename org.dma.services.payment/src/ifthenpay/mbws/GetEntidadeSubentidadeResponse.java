
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
 *         &lt;element name="getEntidadeSubentidadeResult" type="{https://www.ifthensoftware.com/}ArrayOfIfmb" minOccurs="0"/>
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
    "getEntidadeSubentidadeResult"
})
@XmlRootElement(name = "getEntidadeSubentidadeResponse")
public class GetEntidadeSubentidadeResponse {

    protected ArrayOfIfmb getEntidadeSubentidadeResult;

    /**
     * Gets the value of the getEntidadeSubentidadeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIfmb }
     *     
     */
    public ArrayOfIfmb getGetEntidadeSubentidadeResult() {
        return getEntidadeSubentidadeResult;
    }

    /**
     * Sets the value of the getEntidadeSubentidadeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIfmb }
     *     
     */
    public void setGetEntidadeSubentidadeResult(ArrayOfIfmb value) {
        this.getEntidadeSubentidadeResult = value;
    }

}
