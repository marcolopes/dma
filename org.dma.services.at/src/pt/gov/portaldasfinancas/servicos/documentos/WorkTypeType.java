
package pt.gov.portaldasfinancas.servicos.documentos;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CM"/>
 *     &lt;enumeration value="CC"/>
 *     &lt;enumeration value="FC"/>
 *     &lt;enumeration value="FO"/>
 *     &lt;enumeration value="NE"/>
 *     &lt;enumeration value="OU"/>
 *     &lt;enumeration value="OR"/>
 *     &lt;enumeration value="PF"/>
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
@XmlType(name = "WorkTypeType")
@XmlEnum
public enum WorkTypeType {

    CM,
    CC,
    FC,
    FO,
    NE,
    OU,
    OR,
    PF,
    RP,
    RE,
    CS,
    LD,
    RA;

    public String value() {
        return name();
    }

    public static WorkTypeType fromValue(String v) {
        return valueOf(v);
    }

}
