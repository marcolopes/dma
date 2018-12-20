
package com.softlimits.clarinet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMessageOutputIdentification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMessageOutputIdentification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageOutputIdentification" type="{http://www.softlimits.com/Clarinet.Trade}MessageOutputIdentification" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMessageOutputIdentification", propOrder = {
    "messageOutputIdentification"
})
public class ArrayOfMessageOutputIdentification {

    @XmlElement(name = "MessageOutputIdentification", nillable = true)
    protected List<MessageOutputIdentification> messageOutputIdentification;

    /**
     * Gets the value of the messageOutputIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageOutputIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageOutputIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageOutputIdentification }
     * 
     * 
     */
    public List<MessageOutputIdentification> getMessageOutputIdentification() {
        if (messageOutputIdentification == null) {
            messageOutputIdentification = new ArrayList<MessageOutputIdentification>();
        }
        return this.messageOutputIdentification;
    }

}
