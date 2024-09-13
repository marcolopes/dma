
package ifthenpay.mbw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RespostaPedidoEstado complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RespostaPedidoEstado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EstadoPedidos" type="{https://www.ifthenpay.com/}ArrayOfPedido" minOccurs="0"/>
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataHora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MsgDescricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespostaPedidoEstado", propOrder = {
    "estadoPedidos",
    "estado",
    "dataHora",
    "msgDescricao"
})
public class RespostaPedidoEstado {

    @XmlElement(name = "EstadoPedidos")
    protected ArrayOfPedido estadoPedidos;
    @XmlElement(name = "Estado")
    protected String estado;
    @XmlElement(name = "DataHora")
    protected String dataHora;
    @XmlElement(name = "MsgDescricao")
    protected String msgDescricao;

    /**
     * Gets the value of the estadoPedidos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPedido }
     *     
     */
    public ArrayOfPedido getEstadoPedidos() {
        return estadoPedidos;
    }

    /**
     * Sets the value of the estadoPedidos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPedido }
     *     
     */
    public void setEstadoPedidos(ArrayOfPedido value) {
        this.estadoPedidos = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Gets the value of the dataHora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataHora() {
        return dataHora;
    }

    /**
     * Sets the value of the dataHora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataHora(String value) {
        this.dataHora = value;
    }

    /**
     * Gets the value of the msgDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgDescricao() {
        return msgDescricao;
    }

    /**
     * Sets the value of the msgDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgDescricao(String value) {
        this.msgDescricao = value;
    }

}
