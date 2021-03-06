//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.06 at 11:34:29 AM CET 
//


package org.w3._1998.math.mathml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for simple-size.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="simple-size">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="small"/>
 *     &lt;enumeration value="normal"/>
 *     &lt;enumeration value="big"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "simple-size")
@XmlEnum
public enum SimpleSize {

    @XmlEnumValue("small")
    SMALL("small"),
    @XmlEnumValue("normal")
    NORMAL("normal"),
    @XmlEnumValue("big")
    BIG("big");
    private final String value;

    SimpleSize(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SimpleSize fromValue(String v) {
        for (SimpleSize c: SimpleSize.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
