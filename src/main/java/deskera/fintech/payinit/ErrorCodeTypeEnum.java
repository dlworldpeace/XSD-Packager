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
 * <p>Java class for ErrorCodeTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ErrorCodeTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INTERNAL_ERROR"/&gt;
 *     &lt;enumeration value="UNKNOWN_PAYLOAD_TYPE"/&gt;
 *     &lt;enumeration value="UNKNOWN_USER"/&gt;
 *     &lt;enumeration value="XML_SCHEMA_VALIDATION_ERROR"/&gt;
 *     &lt;enumeration value="PREVIOUS_STATEMENT_IS_STILL_BEEN_PROCESSED"/&gt;
 *     &lt;enumeration value="STATEMENT_ACCOUNT_MANDATORY"/&gt;
 *     &lt;enumeration value="STATEMENT_FROM_DATE_GREATER_THAN_TO_DATE"/&gt;
 *     &lt;enumeration value="NOT_ENTITLED_TO_DOWNLOAD_STATEMENT"/&gt;
 *     &lt;enumeration value="STATEMENT_NOT_READY"/&gt;
 *     &lt;enumeration value="STATEMENT_NOT_FOUND"/&gt;
 *     &lt;enumeration value="STATEMENT_EMPTY"/&gt;
 *     &lt;enumeration value="STATEMENT_FILE_SIZE_EXCEEDED"/&gt;
 *     &lt;enumeration value="BALANCE_DATES_GREATER_THAN_180_DAYS_FROM_CURRENT_DATE"/&gt;
 *     &lt;enumeration value="BALANCE_ACCOUNT_OR_BRANCH_NO_MANDATORY"/&gt;
 *     &lt;enumeration value="BALANCE_FROM_DATE_GREATER_THAN_TO_DATE"/&gt;
 *     &lt;enumeration value="ACCESS_DENIED"/&gt;
 *     &lt;enumeration value="INVALID_MESSAGE"/&gt;
 *     &lt;enumeration value="INVALID_OAUTH_TOKEN"/&gt;
 *     &lt;enumeration value="UNAUTHORIZED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ErrorCodeTypeEnum")
@XmlEnum
public enum ErrorCodeTypeEnum {

    INTERNAL_ERROR,
    UNKNOWN_PAYLOAD_TYPE,
    UNKNOWN_USER,
    XML_SCHEMA_VALIDATION_ERROR,
    PREVIOUS_STATEMENT_IS_STILL_BEEN_PROCESSED,
    STATEMENT_ACCOUNT_MANDATORY,
    STATEMENT_FROM_DATE_GREATER_THAN_TO_DATE,
    NOT_ENTITLED_TO_DOWNLOAD_STATEMENT,
    STATEMENT_NOT_READY,
    STATEMENT_NOT_FOUND,
    STATEMENT_EMPTY,
    STATEMENT_FILE_SIZE_EXCEEDED,
    BALANCE_DATES_GREATER_THAN_180_DAYS_FROM_CURRENT_DATE,
    BALANCE_ACCOUNT_OR_BRANCH_NO_MANDATORY,
    BALANCE_FROM_DATE_GREATER_THAN_TO_DATE,
    ACCESS_DENIED,
    INVALID_MESSAGE,
    INVALID_OAUTH_TOKEN,
    UNAUTHORIZED;

    public String value() {
        return name();
    }

    public static ErrorCodeTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}