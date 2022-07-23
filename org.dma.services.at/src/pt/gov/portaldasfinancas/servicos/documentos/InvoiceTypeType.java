
package pt.gov.portaldasfinancas.servicos.documentos;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvoiceTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FT"/>
 *     &lt;enumeration value="NC"/>
 *     &lt;enumeration value="ND"/>
 *     &lt;enumeration value="FS"/>
 *     &lt;enumeration value="FR"/>
 *     &lt;enumeration value="RP"/>
 *     &lt;enumeration value="RE"/>
 *     &lt;enumeration value="CS"/>
 *     &lt;enumeration value="LD"/>
 *     &lt;enumeration value="RA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InvoiceTypeType")
@XmlEnum
public enum InvoiceTypeType {

    FT,
    NC,
    ND,
    FS,
    FR,
    RP,
    RE,
    CS,
    LD,
    RA;

    public String value() {
        return name();
    }

    public static InvoiceTypeType fromValue(String v) {
        return valueOf(v);
    }

}
