
package pt.gov.portaldasfinancas.servicos.series;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for seriesResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="seriesResp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="infoSerie" type="{http://at.gov.pt/}seriesInfo" minOccurs="0"/>
 *         &lt;element name="infoResultOper" type="{http://at.gov.pt/}operationResultInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seriesResp", propOrder = {
    "infoSerie",
    "infoResultOper"
})
public class SeriesResp {

    protected SeriesInfo infoSerie;
    @XmlElement(required = true)
    protected OperationResultInfo infoResultOper;

    /**
     * Gets the value of the infoSerie property.
     * 
     * @return
     *     possible object is
     *     {@link SeriesInfo }
     *     
     */
    public SeriesInfo getInfoSerie() {
        return infoSerie;
    }

    /**
     * Sets the value of the infoSerie property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeriesInfo }
     *     
     */
    public void setInfoSerie(SeriesInfo value) {
        this.infoSerie = value;
    }

    /**
     * Gets the value of the infoResultOper property.
     * 
     * @return
     *     possible object is
     *     {@link OperationResultInfo }
     *     
     */
    public OperationResultInfo getInfoResultOper() {
        return infoResultOper;
    }

    /**
     * Sets the value of the infoResultOper property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationResultInfo }
     *     
     */
    public void setInfoResultOper(OperationResultInfo value) {
        this.infoResultOper = value;
    }

}
