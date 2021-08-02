
package pt.gov.portaldasfinancas.servicos.series;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Resultado da operação
 * 
 * <p>Java class for operationResultInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="operationResultInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codResultOper" type="{http://at.gov.pt/}codResultOperType"/>
 *         &lt;element name="msgResultOper" type="{http://at.gov.pt/}msgResultOperType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operationResultInfo", propOrder = {
    "codResultOper",
    "msgResultOper"
})
public class OperationResultInfo {

    @XmlElement(required = true)
    protected BigInteger codResultOper;
    @XmlElement(required = true)
    protected String msgResultOper;

    /**
     * Gets the value of the codResultOper property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodResultOper() {
        return codResultOper;
    }

    /**
     * Sets the value of the codResultOper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodResultOper(BigInteger value) {
        this.codResultOper = value;
    }

    /**
     * Gets the value of the msgResultOper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgResultOper() {
        return msgResultOper;
    }

    /**
     * Sets the value of the msgResultOper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgResultOper(String value) {
        this.msgResultOper = value;
    }

}
