
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
 *         &lt;element name="chavebackoffice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subentidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtHrInicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtHrFim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sandbox" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "chavebackoffice",
    "entidade",
    "subentidade",
    "dtHrInicio",
    "dtHrFim",
    "referencia",
    "valor",
    "sandbox"
})
@XmlRootElement(name = "getPaymentsJsonWithSandBoxV2")
public class GetPaymentsJsonWithSandBoxV2 {

    protected String chavebackoffice;
    protected String entidade;
    protected String subentidade;
    protected String dtHrInicio;
    protected String dtHrFim;
    protected String referencia;
    protected String valor;
    protected int sandbox;

    /**
     * Gets the value of the chavebackoffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChavebackoffice() {
        return chavebackoffice;
    }

    /**
     * Sets the value of the chavebackoffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChavebackoffice(String value) {
        this.chavebackoffice = value;
    }

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
     * Gets the value of the subentidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubentidade() {
        return subentidade;
    }

    /**
     * Sets the value of the subentidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubentidade(String value) {
        this.subentidade = value;
    }

    /**
     * Gets the value of the dtHrInicio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtHrInicio() {
        return dtHrInicio;
    }

    /**
     * Sets the value of the dtHrInicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtHrInicio(String value) {
        this.dtHrInicio = value;
    }

    /**
     * Gets the value of the dtHrFim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtHrFim() {
        return dtHrFim;
    }

    /**
     * Sets the value of the dtHrFim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtHrFim(String value) {
        this.dtHrFim = value;
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
     * Gets the value of the sandbox property.
     * 
     */
    public int getSandbox() {
        return sandbox;
    }

    /**
     * Sets the value of the sandbox property.
     * 
     */
    public void setSandbox(int value) {
        this.sandbox = value;
    }

}
