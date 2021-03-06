//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.06 at 11:34:29 AM CET 
//


package org.railml.schemas._2009;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * vehicle related data
 * 
 * <p>Java class for tVehicle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tVehicle">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.railml.org/schemas/2009}tElementWithIDAndName">
 *       &lt;attGroup ref="{http://www.railml.org/schemas/2009}aVehicle"/>
 *       &lt;anyAttribute namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tVehicle")
@XmlSeeAlso({
    EVehicle.class
})
public class TVehicle
    extends TElementWithIDAndName
{

    @XmlAttribute(name = "vehicleFamilyRef")
    @XmlIDREF
    protected Object vehicleFamilyRef;
    @XmlAttribute(name = "axleSequence")
    protected String axleSequence;
    @XmlAttribute(name = "numberDrivenAxles")
    protected BigInteger numberDrivenAxles;
    @XmlAttribute(name = "numberNonDrivenAxles")
    protected BigInteger numberNonDrivenAxles;
    @XmlAttribute(name = "trackGauge")
    protected BigDecimal trackGauge;
    @XmlAttribute(name = "length", required = true)
    protected BigDecimal length;
    @XmlAttribute(name = "speed", required = true)
    protected BigDecimal speed;
    @XmlAttribute(name = "bruttoWeight", required = true)
    protected BigDecimal bruttoWeight;
    @XmlAttribute(name = "nettoWeight")
    protected BigDecimal nettoWeight;
    @XmlAttribute(name = "bruttoAdhesionWeight")
    protected BigDecimal bruttoAdhesionWeight;
    @XmlAttribute(name = "nettoAdhesionWeight")
    protected BigDecimal nettoAdhesionWeight;
    @XmlAttribute(name = "resistanceFactor")
    protected BigDecimal resistanceFactor;

    /**
     * Gets the value of the vehicleFamilyRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getVehicleFamilyRef() {
        return vehicleFamilyRef;
    }

    /**
     * Sets the value of the vehicleFamilyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setVehicleFamilyRef(Object value) {
        this.vehicleFamilyRef = value;
    }

    /**
     * Gets the value of the axleSequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAxleSequence() {
        return axleSequence;
    }

    /**
     * Sets the value of the axleSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAxleSequence(String value) {
        this.axleSequence = value;
    }

    /**
     * Gets the value of the numberDrivenAxles property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberDrivenAxles() {
        return numberDrivenAxles;
    }

    /**
     * Sets the value of the numberDrivenAxles property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberDrivenAxles(BigInteger value) {
        this.numberDrivenAxles = value;
    }

    /**
     * Gets the value of the numberNonDrivenAxles property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberNonDrivenAxles() {
        return numberNonDrivenAxles;
    }

    /**
     * Sets the value of the numberNonDrivenAxles property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberNonDrivenAxles(BigInteger value) {
        this.numberNonDrivenAxles = value;
    }

    /**
     * Gets the value of the trackGauge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrackGauge() {
        return trackGauge;
    }

    /**
     * Sets the value of the trackGauge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTrackGauge(BigDecimal value) {
        this.trackGauge = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLength(BigDecimal value) {
        this.length = value;
    }

    /**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpeed(BigDecimal value) {
        this.speed = value;
    }

    /**
     * Gets the value of the bruttoWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBruttoWeight() {
        return bruttoWeight;
    }

    /**
     * Sets the value of the bruttoWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBruttoWeight(BigDecimal value) {
        this.bruttoWeight = value;
    }

    /**
     * Gets the value of the nettoWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNettoWeight() {
        return nettoWeight;
    }

    /**
     * Sets the value of the nettoWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNettoWeight(BigDecimal value) {
        this.nettoWeight = value;
    }

    /**
     * Gets the value of the bruttoAdhesionWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBruttoAdhesionWeight() {
        return bruttoAdhesionWeight;
    }

    /**
     * Sets the value of the bruttoAdhesionWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBruttoAdhesionWeight(BigDecimal value) {
        this.bruttoAdhesionWeight = value;
    }

    /**
     * Gets the value of the nettoAdhesionWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNettoAdhesionWeight() {
        return nettoAdhesionWeight;
    }

    /**
     * Sets the value of the nettoAdhesionWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNettoAdhesionWeight(BigDecimal value) {
        this.nettoAdhesionWeight = value;
    }

    /**
     * Gets the value of the resistanceFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getResistanceFactor() {
        return resistanceFactor;
    }

    /**
     * Sets the value of the resistanceFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setResistanceFactor(BigDecimal value) {
        this.resistanceFactor = value;
    }

}
