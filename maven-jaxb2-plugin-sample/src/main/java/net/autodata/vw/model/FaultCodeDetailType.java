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
 * <p>Java class for FaultCodeDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FaultCodeDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Param" type="{http://xmldefs.vwgoa.na.vwg/DD/Commons/V2}CodeParamType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultCodeDetailType", namespace = "http://xmldefs.vwgoa.na.vwg/DD/Commons/V2", propOrder = {
    "param"
})
public class FaultCodeDetailType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Param", namespace = "http://xmldefs.vwgoa.na.vwg/DD/Commons/V2", required = true)
    protected List<CodeParamType> param;

    /**
     * Gets the value of the param property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the param property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeParamType }
     * 
     * 
     */
    public List<CodeParamType> getParam() {
        if (param == null) {
            param = new ArrayList<CodeParamType>();
        }
        return this.param;
    }

    public boolean isSetParam() {
        return ((this.param!= null)&&(!this.param.isEmpty()));
    }

    public void unsetParam() {
        this.param = null;
    }

}
