
package ifthenpay.mbw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="SetPedidoResult" type="{https://www.ifthenpay.com/}RespostaPedido" minOccurs="0"/>
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
    "setPedidoResult"
})
@XmlRootElement(name = "SetPedidoResponse")
public class SetPedidoResponse {

    @XmlElement(name = "SetPedidoResult")
    protected RespostaPedido setPedidoResult;

    /**
     * Gets the value of the setPedidoResult property.
     * 
     * @return
     *     possible object is
     *     {@link RespostaPedido }
     *     
     */
    public RespostaPedido getSetPedidoResult() {
        return setPedidoResult;
    }

    /**
     * Sets the value of the setPedidoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespostaPedido }
     *     
     */
    public void setSetPedidoResult(RespostaPedido value) {
        this.setPedidoResult = value;
    }

}
