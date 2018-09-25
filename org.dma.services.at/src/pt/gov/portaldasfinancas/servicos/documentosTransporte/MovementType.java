
package pt.gov.portaldasfinancas.servicos.documentosTransporte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MovementType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MovementType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GR"/>
 *     &lt;enumeration value="GT"/>
 *     &lt;enumeration value="GA"/>
 *     &lt;enumeration value="GC"/>
 *     &lt;enumeration value="GD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MovementType")
@XmlEnum
public enum MovementType {

    GR,
    GT,
    GA,
    GC,
    GD;

    public String value() {
        return name();
    }

    public static MovementType fromValue(String v) {
        return valueOf(v);
    }

}
