
package pt.gov.portaldasfinancas.servicos.documentosTransporte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Resposta da AT ao envio do Documento de Transporte
 * 
 * <p>Java class for StockMovementResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StockMovementResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResponseStatus" type="{https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/}ResponseStatus" maxOccurs="unbounded"/>
 *         &lt;element name="DocumentNumber" type="{https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/}SAFPTtextTypeMandatoryMax60Car" minOccurs="0"/>
 *         &lt;element name="ATDocCodeID" type="{https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/}SAFPTtextTypeMandatoryMax200Car" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StockMovementResponse", propOrder = {
    "responseStatus",
    "documentNumber",
    "atDocCodeID"
})
public class StockMovementResponse {

    @XmlElement(name = "ResponseStatus", required = true)
    protected List<ResponseStatus> responseStatus;
    @XmlElement(name = "DocumentNumber")
    protected String documentNumber;
    @XmlElement(name = "ATDocCodeID")
    protected String atDocCodeID;

    /**
     * Gets the value of the responseStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseStatus }
     * 
     * 
     */
    public List<ResponseStatus> getResponseStatus() {
        if (responseStatus == null) {
            responseStatus = new ArrayList<ResponseStatus>();
        }
        return this.responseStatus;
    }

    /**
     * Gets the value of the documentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Sets the value of the documentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumber(String value) {
        this.documentNumber = value;
    }

    /**
     * Gets the value of the atDocCodeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATDocCodeID() {
        return atDocCodeID;
    }

    /**
     * Sets the value of the atDocCodeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATDocCodeID(String value) {
        this.atDocCodeID = value;
    }

}
