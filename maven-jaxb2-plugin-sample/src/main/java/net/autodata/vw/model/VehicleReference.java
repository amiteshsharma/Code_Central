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


/**
 * <p>Java class for VehicleReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://xmldefs.vwgoa.na.vwg/DD/Vehicle}VehicleRef"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleReference", namespace = "http://xmldefs.vwgoa.na.vwg/services/DataService/VehicleLifecycleService/V1", propOrder = {
    "vehicleRef"
})
public class VehicleReference
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "VehicleRef", namespace = "http://xmldefs.vwgoa.na.vwg/DD/Vehicle", required = true)
    protected VehicleIdentifierType vehicleRef;

    /**
     * Gets the value of the vehicleRef property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleIdentifierType }
     *     
     */
    public VehicleIdentifierType getVehicleRef() {
        return vehicleRef;
    }

    /**
     * Sets the value of the vehicleRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleIdentifierType }
     *     
     */
    public void setVehicleRef(VehicleIdentifierType value) {
        this.vehicleRef = value;
    }

    public boolean isSetVehicleRef() {
        return (this.vehicleRef!= null);
    }

}
