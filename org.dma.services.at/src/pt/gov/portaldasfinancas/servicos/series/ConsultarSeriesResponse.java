
package pt.gov.portaldasfinancas.servicos.series;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultarSeriesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultarSeriesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consultarSeriesResp" type="{http://at.gov.pt/}consultSeriesResp"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarSeriesResponse", propOrder = {
    "consultarSeriesResp"
})
public class ConsultarSeriesResponse {

    @XmlElement(required = true)
    protected ConsultarSeriesResp consultarSeriesResp;

    /**
     * Gets the value of the consultarSeriesResp property.
     * 
     * @return
     *     possible object is
     *     {@link ConsultarSeriesResp }
     *     
     */
    public ConsultarSeriesResp getConsultarSeriesResp() {
        return consultarSeriesResp;
    }

    /**
     * Sets the value of the consultarSeriesResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultarSeriesResp }
     *     
     */
    public void setConsultarSeriesResp(ConsultarSeriesResp value) {
        this.consultarSeriesResp = value;
    }

}
