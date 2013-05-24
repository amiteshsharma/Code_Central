//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.04 at 05:18:11 PM IST 
//


package net.autodata.vw.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ModelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Carline" type="{http://xmldefs.vwgoa.na.vwg/DD/BasicTypes/V2}CodeType" minOccurs="0"/>
 *         &lt;element name="ModelName" type="{http://xmldefs.vwgoa.na.vwg/DD/BasicTypes/V2}TextType" minOccurs="0"/>
 *         &lt;element name="ModelCodes" type="{http://xmldefs.vwgoa.na.vwg/DD/Vehicle}ModelCodesType" minOccurs="0"/>
 *         &lt;element name="ModelYear" type="{http://xmldefs.vwgoa.na.vwg/DD/BasicTypes/V2}YearType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModelType", propOrder = {
    "carline",
    "modelName",
    "modelCodes",
    "modelYear"
})
public class ModelType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Carline", namespace = "http://xmldefs.vwgoa.na.vwg/DD/Vehicle")
    protected CodeType carline;
    @XmlElement(name = "ModelName", namespace = "http://xmldefs.vwgoa.na.vwg/DD/Vehicle")
    protected TextType modelName;
    @XmlElement(name = "ModelCodes", namespace = "http://xmldefs.vwgoa.na.vwg/DD/Vehicle")
    protected ModelCodesType modelCodes;
    @XmlElement(name = "ModelYear", namespace = "http://xmldefs.vwgoa.na.vwg/DD/Vehicle")
    protected XMLGregorianCalendar modelYear;

    /**
     * Gets the value of the carline property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCarline() {
        return carline;
    }

    /**
     * Sets the value of the carline property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCarline(CodeType value) {
        this.carline = value;
    }

    public boolean isSetCarline() {
        return (this.carline!= null);
    }

    /**
     * Gets the value of the modelName property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getModelName() {
        return modelName;
    }

    /**
     * Sets the value of the modelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setModelName(TextType value) {
        this.modelName = value;
    }

    public boolean isSetModelName() {
        return (this.modelName!= null);
    }

    /**
     * Gets the value of the modelCodes property.
     * 
     * @return
     *     possible object is
     *     {@link ModelCodesType }
     *     
     */
    public ModelCodesType getModelCodes() {
        return modelCodes;
    }

    /**
     * Sets the value of the modelCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelCodesType }
     *     
     */
    public void setModelCodes(ModelCodesType value) {
        this.modelCodes = value;
    }

    public boolean isSetModelCodes() {
        return (this.modelCodes!= null);
    }

    /**
     * Gets the value of the modelYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModelYear() {
        return modelYear;
    }

    /**
     * Sets the value of the modelYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModelYear(XMLGregorianCalendar value) {
        this.modelYear = value;
    }

    public boolean isSetModelYear() {
        return (this.modelYear!= null);
    }

}
