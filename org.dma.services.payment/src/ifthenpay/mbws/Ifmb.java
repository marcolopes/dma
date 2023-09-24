
package ifthenpay.mbws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ifmb complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ifmb">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Entidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubEntidade" type="{https://www.ifthenpay.com/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="Referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Valor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DtHrPagamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Processamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Terminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tarifa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValorLiquido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoErro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MensagemErro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ifmb", propOrder = {
    "entidade",
    "subEntidade",
    "referencia",
    "valor",
    "id",
    "dtHrPagamento",
    "processamento",
    "terminal",
    "tarifa",
    "valorLiquido",
    "codigoErro",
    "mensagemErro"
})
public class Ifmb {

    @XmlElement(name = "Entidade")
    protected String entidade;
    @XmlElement(name = "SubEntidade")
    protected ArrayOfString subEntidade;
    @XmlElement(name = "Referencia")
    protected String referencia;
    @XmlElement(name = "Valor")
    protected String valor;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "DtHrPagamento")
    protected String dtHrPagamento;
    @XmlElement(name = "Processamento")
    protected String processamento;
    @XmlElement(name = "Terminal")
    protected String terminal;
    @XmlElement(name = "Tarifa")
    protected String tarifa;
    @XmlElement(name = "ValorLiquido")
    protected String valorLiquido;
    @XmlElement(name = "CodigoErro")
    protected String codigoErro;
    @XmlElement(name = "MensagemErro")
    protected String mensagemErro;

    /**
     * Gets the value of the entidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntidade() {
        return entidade;
    }

    /**
     * Sets the value of the entidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntidade(String value) {
        this.entidade = value;
    }

    /**
     * Gets the value of the subEntidade property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getSubEntidade() {
        return subEntidade;
    }

    /**
     * Sets the value of the subEntidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setSubEntidade(ArrayOfString value) {
        this.subEntidade = value;
    }

    /**
     * Gets the value of the referencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * Sets the value of the referencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencia(String value) {
        this.referencia = value;
    }

    /**
     * Gets the value of the valor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValor() {
        return valor;
    }

    /**
     * Sets the value of the valor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValor(String value) {
        this.valor = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the dtHrPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtHrPagamento() {
        return dtHrPagamento;
    }

    /**
     * Sets the value of the dtHrPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtHrPagamento(String value) {
        this.dtHrPagamento = value;
    }

    /**
     * Gets the value of the processamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessamento() {
        return processamento;
    }

    /**
     * Sets the value of the processamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessamento(String value) {
        this.processamento = value;
    }

    /**
     * Gets the value of the terminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminal() {
        return terminal;
    }

    /**
     * Sets the value of the terminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminal(String value) {
        this.terminal = value;
    }

    /**
     * Gets the value of the tarifa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarifa() {
        return tarifa;
    }

    /**
     * Sets the value of the tarifa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarifa(String value) {
        this.tarifa = value;
    }

    /**
     * Gets the value of the valorLiquido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorLiquido() {
        return valorLiquido;
    }

    /**
     * Sets the value of the valorLiquido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorLiquido(String value) {
        this.valorLiquido = value;
    }

    /**
     * Gets the value of the codigoErro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoErro() {
        return codigoErro;
    }

    /**
     * Sets the value of the codigoErro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoErro(String value) {
        this.codigoErro = value;
    }

    /**
     * Gets the value of the mensagemErro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensagemErro() {
        return mensagemErro;
    }

    /**
     * Sets the value of the mensagemErro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensagemErro(String value) {
        this.mensagemErro = value;
    }

}
