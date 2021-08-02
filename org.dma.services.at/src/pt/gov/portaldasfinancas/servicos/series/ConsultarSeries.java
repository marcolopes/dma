
package pt.gov.portaldasfinancas.servicos.series;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for consultarSeries complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultarSeries">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serie" type="{http://at.gov.pt/}serieType" minOccurs="0"/>
 *         &lt;element name="tipoSerie" type="{http://at.gov.pt/}tipoSerieType" minOccurs="0"/>
 *         &lt;element name="classeDoc" type="{http://at.gov.pt/}classeDocType" minOccurs="0"/>
 *         &lt;element name="tipoDoc" type="{http://at.gov.pt/}tipoDocType" minOccurs="0"/>
 *         &lt;element name="codValidacaoSerie" type="{http://at.gov.pt/}codValidacaoSerieType" minOccurs="0"/>
 *         &lt;element name="dataRegistoDe" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="dataRegistoAte" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://at.gov.pt/}estadoType" minOccurs="0"/>
 *         &lt;element name="meioProcessamento" type="{http://at.gov.pt/}meioProcessamentoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarSeries", propOrder = {
    "serie",
    "tipoSerie",
    "classeDoc",
    "tipoDoc",
    "codValidacaoSerie",
    "dataRegistoDe",
    "dataRegistoAte",
    "estado",
    "meioProcessamento"
})
public class ConsultarSeries {

    protected String serie;
    protected String tipoSerie;
    protected String classeDoc;
    protected String tipoDoc;
    protected String codValidacaoSerie;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataRegistoDe;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataRegistoAte;
    protected String estado;
    protected String meioProcessamento;

    /**
     * Gets the value of the serie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Sets the value of the serie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerie(String value) {
        this.serie = value;
    }

    /**
     * Gets the value of the tipoSerie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoSerie() {
        return tipoSerie;
    }

    /**
     * Sets the value of the tipoSerie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoSerie(String value) {
        this.tipoSerie = value;
    }

    /**
     * Gets the value of the classeDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClasseDoc() {
        return classeDoc;
    }

    /**
     * Sets the value of the classeDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClasseDoc(String value) {
        this.classeDoc = value;
    }

    /**
     * Gets the value of the tipoDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDoc() {
        return tipoDoc;
    }

    /**
     * Sets the value of the tipoDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDoc(String value) {
        this.tipoDoc = value;
    }

    /**
     * Gets the value of the codValidacaoSerie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodValidacaoSerie() {
        return codValidacaoSerie;
    }

    /**
     * Sets the value of the codValidacaoSerie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodValidacaoSerie(String value) {
        this.codValidacaoSerie = value;
    }

    /**
     * Gets the value of the dataRegistoDe property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataRegistoDe() {
        return dataRegistoDe;
    }

    /**
     * Sets the value of the dataRegistoDe property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataRegistoDe(XMLGregorianCalendar value) {
        this.dataRegistoDe = value;
    }

    /**
     * Gets the value of the dataRegistoAte property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataRegistoAte() {
        return dataRegistoAte;
    }

    /**
     * Sets the value of the dataRegistoAte property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataRegistoAte(XMLGregorianCalendar value) {
        this.dataRegistoAte = value;
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
     * Gets the value of the meioProcessamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeioProcessamento() {
        return meioProcessamento;
    }

    /**
     * Sets the value of the meioProcessamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeioProcessamento(String value) {
        this.meioProcessamento = value;
    }

}
