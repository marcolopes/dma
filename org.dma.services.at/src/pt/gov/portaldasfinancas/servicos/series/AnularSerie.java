
package pt.gov.portaldasfinancas.servicos.series;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anularSerie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="anularSerie">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serie" type="{http://at.gov.pt/}serieType"/>
 *         &lt;element name="classeDoc" type="{http://at.gov.pt/}classeDocType"/>
 *         &lt;element name="tipoDoc" type="{http://at.gov.pt/}tipoDocType"/>
 *         &lt;element name="codValidacaoSerie" type="{http://at.gov.pt/}codValidacaoSerieType"/>
 *         &lt;element name="motivo" type="{http://at.gov.pt/}motivoType"/>
 *         &lt;element name="declaracaoNaoEmissao" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "anularSerie", propOrder = {
    "serie",
    "classeDoc",
    "tipoDoc",
    "codValidacaoSerie",
    "motivo",
    "declaracaoNaoEmissao"
})
public class AnularSerie {

    @XmlElement(required = true)
    protected String serie;
    @XmlElement(required = true)
    protected String classeDoc;
    @XmlElement(required = true)
    protected String tipoDoc;
    @XmlElement(required = true)
    protected String codValidacaoSerie;
    @XmlElement(required = true)
    protected String motivo;
    protected boolean declaracaoNaoEmissao;

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
     * Gets the value of the motivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * Sets the value of the motivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivo(String value) {
        this.motivo = value;
    }

    /**
     * Gets the value of the declaracaoNaoEmissao property.
     * 
     */
    public boolean isDeclaracaoNaoEmissao() {
        return declaracaoNaoEmissao;
    }

    /**
     * Sets the value of the declaracaoNaoEmissao property.
     * 
     */
    public void setDeclaracaoNaoEmissao(boolean value) {
        this.declaracaoNaoEmissao = value;
    }

}
