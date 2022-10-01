
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
 *         &lt;element name="EstadoPedidosResult" type="{https://www.ifthenpay.com/}RespostaPedidoEstado" minOccurs="0"/>
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
    "estadoPedidosResult"
})
@XmlRootElement(name = "EstadoPedidosResponse")
public class EstadoPedidosResponse {

    @XmlElement(name = "EstadoPedidosResult")
    protected RespostaPedidoEstado estadoPedidosResult;

    /**
     * Gets the value of the estadoPedidosResult property.
     * 
     * @return
     *     possible object is
     *     {@link RespostaPedidoEstado }
     *     
     */
    public RespostaPedidoEstado getEstadoPedidosResult() {
        return estadoPedidosResult;
    }

    /**
     * Sets the value of the estadoPedidosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespostaPedidoEstado }
     *     
     */
    public void setEstadoPedidosResult(RespostaPedidoEstado value) {
        this.estadoPedidosResult = value;
    }

}
