
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
 *         &lt;element name="getPaymentsXmlResult" type="{https://www.ifthenpay.com/}ArrayOfIfmb" minOccurs="0"/>
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
    "getPaymentsXmlResult"
})
@XmlRootElement(name = "getPaymentsXmlResponse")
public class GetPaymentsXmlResponse {

    protected ArrayOfIfmb getPaymentsXmlResult;

    /**
     * Gets the value of the getPaymentsXmlResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIfmb }
     *     
     */
    public ArrayOfIfmb getGetPaymentsXmlResult() {
        return getPaymentsXmlResult;
    }

    /**
     * Sets the value of the getPaymentsXmlResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIfmb }
     *     
     */
    public void setGetPaymentsXmlResult(ArrayOfIfmb value) {
        this.getPaymentsXmlResult = value;
    }

}
