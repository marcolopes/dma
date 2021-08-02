
package pt.gov.portaldasfinancas.servicos.series;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Informação de caracterização da Série comunicada
 * 
 * <p>Java class for seriesInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="seriesInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serie" type="{http://at.gov.pt/}serieType"/>
 *         &lt;element name="tipoSerie" type="{http://at.gov.pt/}tipoSerieType"/>
 *         &lt;element name="classeDoc" type="{http://at.gov.pt/}classeDocType"/>
 *         &lt;element name="tipoDoc" type="{http://at.gov.pt/}tipoDocType"/>
 *         &lt;element name="numInicialSeq" type="{http://at.gov.pt/}numSeqType"/>
 *         &lt;element name="numFinalSeq" type="{http://at.gov.pt/}numSeqType" minOccurs="0"/>
 *         &lt;element name="dataInicioPrevUtiliz" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="seqUltimoDocEmitido" type="{http://at.gov.pt/}numSeqType" minOccurs="0"/>
 *         &lt;element name="meioProcessamento" type="{http://at.gov.pt/}meioProcessamentoType"/>
 *         &lt;element name="numCertSWFatur" type="{http://at.gov.pt/}numCertSWFaturType"/>
 *         &lt;element name="codValidacaoSerie" type="{http://at.gov.pt/}codValidacaoSerieType"/>
 *         &lt;element name="dataRegisto" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="estado" type="{http://at.gov.pt/}estadoType"/>
 *         &lt;element name="motivoEstado" type="{http://at.gov.pt/}motivoType" minOccurs="0"/>
 *         &lt;element name="justificacao" type="{http://at.gov.pt/}justificacaoType" minOccurs="0"/>
 *         &lt;element name="dataEstado" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="nifComunicou" type="{http://at.gov.pt/}nifType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seriesInfo", propOrder = {
    "serie",
    "tipoSerie",
    "classeDoc",
    "tipoDoc",
    "numInicialSeq",
    "numFinalSeq",
    "dataInicioPrevUtiliz",
    "seqUltimoDocEmitido",
    "meioProcessamento",
    "numCertSWFatur",
    "codValidacaoSerie",
    "dataRegisto",
    "estado",
    "motivoEstado",
    "justificacao",
    "dataEstado",
    "nifComunicou"
})
public class SeriesInfo {

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
    protected BigInteger numFinalSeq;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataInicioPrevUtiliz;
    protected BigInteger seqUltimoDocEmitido;
    @XmlElement(required = true)
    protected String meioProcessamento;
    @XmlElement(required = true)
    protected BigInteger numCertSWFatur;
    @XmlElement(required = true)
    protected String codValidacaoSerie;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataRegisto;
    @XmlElement(required = true)
    protected String estado;
    protected String motivoEstado;
    protected String justificacao;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataEstado;
    @XmlElement(required = true)
    protected String nifComunicou;

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
     * Gets the value of the numFinalSeq property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumFinalSeq() {
        return numFinalSeq;
    }

    /**
     * Sets the value of the numFinalSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumFinalSeq(BigInteger value) {
        this.numFinalSeq = value;
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
     * Gets the value of the seqUltimoDocEmitido property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeqUltimoDocEmitido() {
        return seqUltimoDocEmitido;
    }

    /**
     * Sets the value of the seqUltimoDocEmitido property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeqUltimoDocEmitido(BigInteger value) {
        this.seqUltimoDocEmitido = value;
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
     * Gets the value of the dataRegisto property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataRegisto() {
        return dataRegisto;
    }

    /**
     * Sets the value of the dataRegisto property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataRegisto(XMLGregorianCalendar value) {
        this.dataRegisto = value;
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
     * Gets the value of the motivoEstado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoEstado() {
        return motivoEstado;
    }

    /**
     * Sets the value of the motivoEstado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoEstado(String value) {
        this.motivoEstado = value;
    }

    /**
     * Gets the value of the justificacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustificacao() {
        return justificacao;
    }

    /**
     * Sets the value of the justificacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustificacao(String value) {
        this.justificacao = value;
    }

    /**
     * Gets the value of the dataEstado property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEstado() {
        return dataEstado;
    }

    /**
     * Sets the value of the dataEstado property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEstado(XMLGregorianCalendar value) {
        this.dataEstado = value;
    }

    /**
     * Gets the value of the nifComunicou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNifComunicou() {
        return nifComunicou;
    }

    /**
     * Sets the value of the nifComunicou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNifComunicou(String value) {
        this.nifComunicou = value;
    }

}
