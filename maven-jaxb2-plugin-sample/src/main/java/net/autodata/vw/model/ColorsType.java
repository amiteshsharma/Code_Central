//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.04 at 05:18:11 PM IST 
//


package net.autodata.vw.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ColorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ColorsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ColorCode" type="{http://xmldefs.vwgoa.na.vwg/DD/BasicTypes/V2}CodeType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColorsType", propOrder = {
    "colorCode"
})
public class ColorsType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ColorCode", namespace = "http://xmldefs.vwgoa.na.vwg/DD/Vehicle", required = true)
    protected List<CodeType> colorCode;

    /**
     * Gets the value of the colorCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colorCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColorCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getColorCode() {
        if (colorCode == null) {
            colorCode = new ArrayList<CodeType>();
        }
        return this.colorCode;
    }

    public boolean isSetColorCode() {
        return ((this.colorCode!= null)&&(!this.colorCode.isEmpty()));
    }

    public void unsetColorCode() {
        this.colorCode = null;
    }

}
