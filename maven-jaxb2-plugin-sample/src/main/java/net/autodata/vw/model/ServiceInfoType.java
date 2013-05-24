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
 * <p>Java class for ServiceInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://xmldefs.vwgoa.na.vwg/DD/BasicTypes/V2}NameType"/>
 *         &lt;element name="Revision" type="{http://xmldefs.vwgoa.na.vwg/DD/BasicTypes/V2}IdentifierType"/>
 *         &lt;element name="Operation" type="{http://xmldefs.vwgoa.na.vwg/DD/BasicTypes/V2}NameType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceInfoType", namespace = "http://xmldefs.vwgoa.na.vwg/DD/Commons/V2", propOrder = {
    "name",
    "revision",
    "operation"
})
public class ServiceInfoType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Name", namespace = "http://xmldefs.vwgoa.na.vwg/DD/Commons/V2", required = true)
    protected NameType name;
    @XmlElement(name = "Revision", namespace = "http://xmldefs.vwgoa.na.vwg/DD/Commons/V2", required = true)
    protected IdentifierType revision;
    @XmlElement(name = "Operation", namespace = "http://xmldefs.vwgoa.na.vwg/DD/Commons/V2")
    protected List<NameType> operation;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setName(NameType value) {
        this.name = value;
    }

    public boolean isSetName() {
        return (this.name!= null);
    }

    /**
     * Gets the value of the revision property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getRevision() {
        return revision;
    }

    /**
     * Sets the value of the revision property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setRevision(IdentifierType value) {
        this.revision = value;
    }

    public boolean isSetRevision() {
        return (this.revision!= null);
    }

    /**
     * Gets the value of the operation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getOperation() {
        if (operation == null) {
            operation = new ArrayList<NameType>();
        }
        return this.operation;
    }

    public boolean isSetOperation() {
        return ((this.operation!= null)&&(!this.operation.isEmpty()));
    }

    public void unsetOperation() {
        this.operation = null;
    }

}
