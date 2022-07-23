
package pt.gov.portaldasfinancas.servicos.documentos;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentTypeType")
@XmlEnum
public enum PaymentTypeType {

    RC;

    public String value() {
        return name();
    }

    public static PaymentTypeType fromValue(String v) {
        return valueOf(v);
    }

}
