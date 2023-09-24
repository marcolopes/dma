
package ifthenpay.mbw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Pedido complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pedido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdPedido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataHoraPedidoRegistado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataHoraPedidoAtualizado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Pedido", propOrder = {
    "idPedido",
    "estado",
    "dataHoraPedidoRegistado",
    "dataHoraPedidoAtualizado",
    "msgDescricao"
})
public class Pedido {

    @XmlElement(name = "IdPedido")
    protected String idPedido;
    @XmlElement(name = "Estado")
    protected String estado;
    @XmlElement(name = "DataHoraPedidoRegistado")
    protected String dataHoraPedidoRegistado;
    @XmlElement(name = "DataHoraPedidoAtualizado")
    protected String dataHoraPedidoAtualizado;
    @XmlElement(name = "MsgDescricao")
    protected String msgDescricao;

    /**
     * Gets the value of the idPedido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPedido() {
        return idPedido;
    }

    /**
     * Sets the value of the idPedido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPedido(String value) {
        this.idPedido = value;
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
     * Gets the value of the dataHoraPedidoRegistado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataHoraPedidoRegistado() {
        return dataHoraPedidoRegistado;
    }

    /**
     * Sets the value of the dataHoraPedidoRegistado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataHoraPedidoRegistado(String value) {
        this.dataHoraPedidoRegistado = value;
    }

    /**
     * Gets the value of the dataHoraPedidoAtualizado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataHoraPedidoAtualizado() {
        return dataHoraPedidoAtualizado;
    }

    /**
     * Sets the value of the dataHoraPedidoAtualizado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataHoraPedidoAtualizado(String value) {
        this.dataHoraPedidoAtualizado = value;
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
