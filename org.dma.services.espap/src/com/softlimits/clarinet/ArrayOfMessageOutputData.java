
package com.softlimits.clarinet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMessageOutputData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMessageOutputData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageOutputData" type="{http://www.softlimits.com/Clarinet.Trade}MessageOutputData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMessageOutputData", propOrder = {
    "messageOutputData"
})
public class ArrayOfMessageOutputData {

    @XmlElement(name = "MessageOutputData", nillable = true)
    protected List<MessageOutputData> messageOutputData;

    /**
     * Gets the value of the messageOutputData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageOutputData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageOutputData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageOutputData }
     * 
     * 
     */
    public List<MessageOutputData> getMessageOutputData() {
        if (messageOutputData == null) {
            messageOutputData = new ArrayList<MessageOutputData>();
        }
        return this.messageOutputData;
    }

}
