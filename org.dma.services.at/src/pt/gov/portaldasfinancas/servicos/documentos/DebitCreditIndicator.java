
package pt.gov.portaldasfinancas.servicos.documentos;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DebitCreditIndicator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DebitCreditIndicator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="C"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DebitCreditIndicator")
@XmlEnum
public enum DebitCreditIndicator {

    D,
    C;

    public String value() {
        return name();
    }

    public static DebitCreditIndicator fromValue(String v) {
        return valueOf(v);
    }

}
