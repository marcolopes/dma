
package pt.gov.portaldasfinancas.servicos.documentos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="eFaturaMDVersion" type="{http://factemi.at.min_financas.pt/documents}eFaturaMDVersion"/>
 *         &lt;element ref="{http://factemi.at.min_financas.pt/documents}TaxRegistrationNumber"/>
 *         &lt;element name="WorkHeader" type="{http://factemi.at.min_financas.pt/documents}WorkHeaderType"/>
 *         &lt;element name="WorkStatus" type="{http://factemi.at.min_financas.pt/documents}NewWorkStatusType"/>
 *         &lt;element name="CanalRegisto" type="{http://factemi.at.min_financas.pt/documents}ChannelType" minOccurs="0"/>
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
    "eFaturaMDVersion",
    "taxRegistrationNumber",
    "workHeader",
    "workStatus",
    "canalRegisto"
})
@XmlRootElement(name = "ChangeWorkStatusRequest")
public class ChangeWorkStatusRequest {

    @XmlElement(required = true)
    protected String eFaturaMDVersion;
    @XmlElement(name = "TaxRegistrationNumber")
    protected int taxRegistrationNumber;
    @XmlElement(name = "WorkHeader", required = true)
    protected WorkHeaderType workHeader;
    @XmlElement(name = "WorkStatus", required = true)
    protected NewWorkStatusType workStatus;
    @XmlElement(name = "CanalRegisto")
    protected ChannelType canalRegisto;

    /**
     * Gets the value of the eFaturaMDVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEFaturaMDVersion() {
        return eFaturaMDVersion;
    }

    /**
     * Sets the value of the eFaturaMDVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEFaturaMDVersion(String value) {
        this.eFaturaMDVersion = value;
    }

    /**
     * Gets the value of the taxRegistrationNumber property.
     * 
     */
    public int getTaxRegistrationNumber() {
        return taxRegistrationNumber;
    }

    /**
     * Sets the value of the taxRegistrationNumber property.
     * 
     */
    public void setTaxRegistrationNumber(int value) {
        this.taxRegistrationNumber = value;
    }

    /**
     * Gets the value of the workHeader property.
     * 
     * @return
     *     possible object is
     *     {@link WorkHeaderType }
     *     
     */
    public WorkHeaderType getWorkHeader() {
        return workHeader;
    }

    /**
     * Sets the value of the workHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkHeaderType }
     *     
     */
    public void setWorkHeader(WorkHeaderType value) {
        this.workHeader = value;
    }

    /**
     * Gets the value of the workStatus property.
     * 
     * @return
     *     possible object is
     *     {@link NewWorkStatusType }
     *     
     */
    public NewWorkStatusType getWorkStatus() {
        return workStatus;
    }

    /**
     * Sets the value of the workStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewWorkStatusType }
     *     
     */
    public void setWorkStatus(NewWorkStatusType value) {
        this.workStatus = value;
    }

    /**
     * Gets the value of the canalRegisto property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelType }
     *     
     */
    public ChannelType getCanalRegisto() {
        return canalRegisto;
    }

    /**
     * Sets the value of the canalRegisto property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelType }
     *     
     */
    public void setCanalRegisto(ChannelType value) {
        this.canalRegisto = value;
    }

}
