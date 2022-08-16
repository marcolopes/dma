/*
 * XML Type:  ShippingPointStructure
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.01_01
 * Java type: x0101.oecdStandardAuditFileTaxPT1.ShippingPointStructure
 *
 * Automatically generated - do not modify.
 */
package x0101.oecdStandardAuditFileTaxPT1.impl;
/**
 * An XML ShippingPointStructure(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01).
 *
 * This is a complex type.
 */
public class ShippingPointStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.ShippingPointStructure
{
    private static final long serialVersionUID = 1L;
    
    public ShippingPointStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELIVERYID$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "DeliveryID");
    private static final javax.xml.namespace.QName DELIVERYDATE$2 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "DeliveryDate");
    private static final javax.xml.namespace.QName ADDRESS$4 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "Address");
    
    
    /**
     * Gets the "DeliveryID" element
     */
    public java.lang.String getDeliveryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIVERYID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DeliveryID" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetDeliveryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(DELIVERYID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "DeliveryID" element
     */
    public boolean isSetDeliveryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELIVERYID$0) != 0;
        }
    }
    
    /**
     * Sets the "DeliveryID" element
     */
    public void setDeliveryID(java.lang.String deliveryID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIVERYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELIVERYID$0);
            }
            target.setStringValue(deliveryID);
        }
    }
    
    /**
     * Sets (as xml) the "DeliveryID" element
     */
    public void xsetDeliveryID(x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car deliveryID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(DELIVERYID$0, 0);
            if (target == null)
            {
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().add_element_user(DELIVERYID$0);
            }
            target.set(deliveryID);
        }
    }
    
    /**
     * Unsets the "DeliveryID" element
     */
    public void unsetDeliveryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELIVERYID$0, 0);
        }
    }
    
    /**
     * Gets the "DeliveryDate" element
     */
    public java.util.Calendar getDeliveryDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIVERYDATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DeliveryDate" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.SAFdateType xgetDeliveryDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(DELIVERYDATE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "DeliveryDate" element
     */
    public boolean isSetDeliveryDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELIVERYDATE$2) != 0;
        }
    }
    
    /**
     * Sets the "DeliveryDate" element
     */
    public void setDeliveryDate(java.util.Calendar deliveryDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIVERYDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELIVERYDATE$2);
            }
            target.setCalendarValue(deliveryDate);
        }
    }
    
    /**
     * Sets (as xml) the "DeliveryDate" element
     */
    public void xsetDeliveryDate(x0101.oecdStandardAuditFileTaxPT1.SAFdateType deliveryDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(DELIVERYDATE$2, 0);
            if (target == null)
            {
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().add_element_user(DELIVERYDATE$2);
            }
            target.set(deliveryDate);
        }
    }
    
    /**
     * Unsets the "DeliveryDate" element
     */
    public void unsetDeliveryDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELIVERYDATE$2, 0);
        }
    }
    
    /**
     * Gets the "Address" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.AddressStructure getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.AddressStructure target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.AddressStructure)get_store().find_element_user(ADDRESS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Address" element
     */
    public boolean isSetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS$4) != 0;
        }
    }
    
    /**
     * Sets the "Address" element
     */
    public void setAddress(x0101.oecdStandardAuditFileTaxPT1.AddressStructure address)
    {
        generatedSetterHelperImpl(address, ADDRESS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Address" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.AddressStructure addNewAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.AddressStructure target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.AddressStructure)get_store().add_element_user(ADDRESS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "Address" element
     */
    public void unsetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS$4, 0);
        }
    }
}
