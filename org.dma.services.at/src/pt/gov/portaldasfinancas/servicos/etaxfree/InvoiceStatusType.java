
package pt.gov.portaldasfinancas.servicos.etaxfree;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvoiceStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COMUNICACAO_REGISTADA"/>
 *     &lt;enumeration value="COMUNICACAO_ANULADA"/>
 *     &lt;enumeration value="COMUNICACAO_SELECIONADA_PARA_CONTROLO"/>
 *     &lt;enumeration value="FATURA_INVALIDADA"/>
 *     &lt;enumeration value="FATURA_CERTIFICADA"/>
 *     &lt;enumeration value="EXPIRADO_PRAZO_PARA_CERTIFICACAO_DA_FATURA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InvoiceStatusType")
@XmlEnum
public enum InvoiceStatusType {

    COMUNICACAO_REGISTADA,
    COMUNICACAO_ANULADA,
    COMUNICACAO_SELECIONADA_PARA_CONTROLO,
    FATURA_INVALIDADA,
    FATURA_CERTIFICADA,
    EXPIRADO_PRAZO_PARA_CERTIFICACAO_DA_FATURA;

    public String value() {
        return name();
    }

    public static InvoiceStatusType fromValue(String v) {
        return valueOf(v);
    }

}
