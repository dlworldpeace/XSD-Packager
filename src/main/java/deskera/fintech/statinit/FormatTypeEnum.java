//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2019.06.13 at 04:40:58 PM CST 
//


package deskera.fintech.statinit;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FormatTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FormatTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SWIFT_MT940"/&gt;
 *     &lt;enumeration value="CAMT_053_001_02"/&gt;
 *     &lt;enumeration value="SWIFT_MT942"/&gt;
 *     &lt;enumeration value="CAMT_052_001_02"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FormatTypeEnum", namespace = "http://com.citi.citiconnect/services/types/inquiries/statement/v1")
@XmlEnum
public enum FormatTypeEnum {

    @XmlEnumValue("SWIFT_MT940")
    SWIFT_MT_940("SWIFT_MT940"),
    CAMT_053_001_02("CAMT_053_001_02"),
    @XmlEnumValue("SWIFT_MT942")
    SWIFT_MT_942("SWIFT_MT942"),
    CAMT_052_001_02("CAMT_052_001_02");
    private final String value;

    FormatTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FormatTypeEnum fromValue(String v) {
        for (FormatTypeEnum c: FormatTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}