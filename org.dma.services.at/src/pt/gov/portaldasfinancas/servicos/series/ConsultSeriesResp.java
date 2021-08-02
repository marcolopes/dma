
package pt.gov.portaldasfinancas.servicos.series;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultSeriesResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultSeriesResp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="infoSerie" type="{http://at.gov.pt/}seriesInfo" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "consultSeriesResp", propOrder = {
    "infoSerie",
    "infoResultOper"
})
public class ConsultSeriesResp {

    protected List<SeriesInfo> infoSerie;
    @XmlElement(required = true)
    protected OperationResultInfo infoResultOper;

    /**
     * Gets the value of the infoSerie property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infoSerie property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfoSerie().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeriesInfo }
     * 
     * 
     */
    public List<SeriesInfo> getInfoSerie() {
        if (infoSerie == null) {
            infoSerie = new ArrayList<SeriesInfo>();
        }
        return this.infoSerie;
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
