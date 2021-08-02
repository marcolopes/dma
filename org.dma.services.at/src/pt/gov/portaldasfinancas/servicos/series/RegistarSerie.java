
package pt.gov.portaldasfinancas.servicos.series;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for registarSerie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registarSerie">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serie" type="{http://at.gov.pt/}serieType"/>
 *         &lt;element name="tipoSerie" type="{http://at.gov.pt/}tipoSerieType"/>
 *         &lt;element name="classeDoc" type="{http://at.gov.pt/}classeDocType"/>
 *         &lt;element name="tipoDoc" type="{http://at.gov.pt/}tipoDocType"/>
 *         &lt;element name="numInicialSeq" type="{http://at.gov.pt/}numSeqType"/>
 *         &lt;element name="dataInicioPrevUtiliz" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="numCertSWFatur" type="{http://at.gov.pt/}numCertSWFaturType"/>
 *         &lt;element name="meioProcessamento" type="{http://at.gov.pt/}meioProcessamentoType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registarSerie", propOrder = {
    "serie",
    "tipoSerie",
    "classeDoc",
    "tipoDoc",
    "numInicialSeq",
    "dataInicioPrevUtiliz",
    "numCertSWFatur",
    "meioProcessamento"
})
public class RegistarSerie {

    @XmlElement(required = true)
    protected String serie;
    @XmlElement(required = true)
    protected String tipoSerie;
    @XmlElement(required = true)
    protected String classeDoc;
    @XmlElement(required = true)
    protected String tipoDoc;
    @XmlElement(required = true)
    protected BigInteger numInicialSeq;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataInicioPrevUtiliz;
    @XmlElement(required = true)
    protected BigInteger numCertSWFatur;
    @XmlElement(required = true)
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
     * Gets the value of the numInicialSeq property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumInicialSeq() {
        return numInicialSeq;
    }

    /**
     * Sets the value of the numInicialSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumInicialSeq(BigInteger value) {
        this.numInicialSeq = value;
    }

    /**
     * Gets the value of the dataInicioPrevUtiliz property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInicioPrevUtiliz() {
        return dataInicioPrevUtiliz;
    }

    /**
     * Sets the value of the dataInicioPrevUtiliz property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInicioPrevUtiliz(XMLGregorianCalendar value) {
        this.dataInicioPrevUtiliz = value;
    }

    /**
     * Gets the value of the numCertSWFatur property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumCertSWFatur() {
        return numCertSWFatur;
    }

    /**
     * Sets the value of the numCertSWFatur property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumCertSWFatur(BigInteger value) {
        this.numCertSWFatur = value;
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
