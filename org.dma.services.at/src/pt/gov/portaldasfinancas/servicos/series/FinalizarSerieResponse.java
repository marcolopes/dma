
package pt.gov.portaldasfinancas.servicos.series;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for finalizarSerieResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="finalizarSerieResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="finalizarSerieResp" type="{http://at.gov.pt/}seriesResp"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "finalizarSerieResponse", propOrder = {
    "finalizarSerieResp"
})
public class FinalizarSerieResponse {

    @XmlElement(required = true)
    protected SeriesResp finalizarSerieResp;

    /**
     * Gets the value of the finalizarSerieResp property.
     * 
     * @return
     *     possible object is
     *     {@link SeriesResp }
     *     
     */
    public SeriesResp getFinalizarSerieResp() {
        return finalizarSerieResp;
    }

    /**
     * Sets the value of the finalizarSerieResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeriesResp }
     *     
     */
    public void setFinalizarSerieResp(SeriesResp value) {
        this.finalizarSerieResp = value;
    }

}
