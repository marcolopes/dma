
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
 *         &lt;element name="getPaymentsXMLResult" type="{https://www.ifthenpay.com/}ArrayOfIfmb" minOccurs="0"/>
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
    "getPaymentsXMLResult"
})
@XmlRootElement(name = "getPaymentsXMLResponse")
public class GetPaymentsXMLResponse {

    protected ArrayOfIfmb getPaymentsXMLResult;

    /**
     * Gets the value of the getPaymentsXMLResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIfmb }
     *     
     */
    public ArrayOfIfmb getGetPaymentsXMLResult() {
        return getPaymentsXMLResult;
    }

    /**
     * Sets the value of the getPaymentsXMLResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIfmb }
     *     
     */
    public void setGetPaymentsXMLResult(ArrayOfIfmb value) {
        this.getPaymentsXMLResult = value;
    }

}
