/*
 * An XML document type.
 * Localname: DeliveryDate
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.02_01
 * Java type: x0201.oecdStandardAuditFileTaxPT1.DeliveryDateDocument
 *
 * Automatically generated - do not modify.
 */
package x0201.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one DeliveryDate(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01) element.
 *
 * This is a complex type.
 */
public class DeliveryDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0201.oecdStandardAuditFileTaxPT1.DeliveryDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public DeliveryDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELIVERYDATE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "DeliveryDate");
    
    
    /**
     * Gets the "DeliveryDate" element
     */
    public java.util.Calendar getDeliveryDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIVERYDATE$0, 0);
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
    public x0201.oecdStandardAuditFileTaxPT1.SAFdateType xgetDeliveryDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(DELIVERYDATE$0, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIVERYDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELIVERYDATE$0);
            }
            target.setCalendarValue(deliveryDate);
        }
    }
    
    /**
     * Sets (as xml) the "DeliveryDate" element
     */
    public void xsetDeliveryDate(x0201.oecdStandardAuditFileTaxPT1.SAFdateType deliveryDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(DELIVERYDATE$0, 0);
            if (target == null)
            {
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().add_element_user(DELIVERYDATE$0);
            }
            target.set(deliveryDate);
        }
    }
}
