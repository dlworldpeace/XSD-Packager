//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2019.06.13 at 04:37:49 PM CST 
//


package deskera.fintech.payinit;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SourceApplicationTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SourceApplicationTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TWS"/&gt;
 *     &lt;enumeration value="CCC"/&gt;
 *     &lt;enumeration value="CCF"/&gt;
 *     &lt;enumeration value="BESERVICE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SourceApplicationTypeEnum", namespace = "http://com.citi.citiconnect/services/types/oauthtoken/v1")
@XmlEnum
public enum SourceApplicationTypeEnum {


    /**
     * Indicates source application is a Treasury Work Station.
     *                     
     * 
     */
    TWS,

    /**
     * Indicates source application is a Citi Connect Cash client
     *                         application.
     *                     
     * 
     */
    CCC,

    /**
     * Indicates source application wants to use the CCF route.
     *                         The long term plan is to remove this field altogether from the API when BE supports all payments.
     *                     
     * 
     */
    CCF,

    /**
     * Indicates source application wants to use the BESERVICE route.
     *                         This is currently used only for internal testing and will be removed at some point in the future.
     *                     
     * 
     */
    BESERVICE;

    public String value() {
        return name();
    }

    public static SourceApplicationTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}