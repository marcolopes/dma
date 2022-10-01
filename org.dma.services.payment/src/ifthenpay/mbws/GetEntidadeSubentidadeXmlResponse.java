
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
 *         &lt;element name="getEntidadeSubentidadeXmlResult" type="{https://www.ifthensoftware.com/}ArrayOfIfmb" minOccurs="0"/>
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
    "getEntidadeSubentidadeXmlResult"
})
@XmlRootElement(name = "getEntidadeSubentidadeXmlResponse")
public class GetEntidadeSubentidadeXmlResponse {

    protected ArrayOfIfmb getEntidadeSubentidadeXmlResult;

    /**
     * Gets the value of the getEntidadeSubentidadeXmlResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIfmb }
     *     
     */
    public ArrayOfIfmb getGetEntidadeSubentidadeXmlResult() {
        return getEntidadeSubentidadeXmlResult;
    }

    /**
     * Sets the value of the getEntidadeSubentidadeXmlResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIfmb }
     *     
     */
    public void setGetEntidadeSubentidadeXmlResult(ArrayOfIfmb value) {
        this.getEntidadeSubentidadeXmlResult = value;
    }

}
