
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
 *         &lt;element name="getPaymentsJsonWithSandBoxResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getPaymentsJsonWithSandBoxResult"
})
@XmlRootElement(name = "getPaymentsJsonWithSandBoxResponse")
public class GetPaymentsJsonWithSandBoxResponse {

    protected String getPaymentsJsonWithSandBoxResult;

    /**
     * Gets the value of the getPaymentsJsonWithSandBoxResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetPaymentsJsonWithSandBoxResult() {
        return getPaymentsJsonWithSandBoxResult;
    }

    /**
     * Sets the value of the getPaymentsJsonWithSandBoxResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetPaymentsJsonWithSandBoxResult(String value) {
        this.getPaymentsJsonWithSandBoxResult = value;
    }

}
