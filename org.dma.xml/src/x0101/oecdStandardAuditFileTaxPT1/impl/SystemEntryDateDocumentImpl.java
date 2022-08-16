/*
 * An XML document type.
 * Localname: SystemEntryDate
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.01_01
 * Java type: x0101.oecdStandardAuditFileTaxPT1.SystemEntryDateDocument
 *
 * Automatically generated - do not modify.
 */
package x0101.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one SystemEntryDate(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01) element.
 *
 * This is a complex type.
 */
public class SystemEntryDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.SystemEntryDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public SystemEntryDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SYSTEMENTRYDATE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "SystemEntryDate");
    
    
    /**
     * Gets the "SystemEntryDate" element
     */
    public java.util.Calendar getSystemEntryDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSTEMENTRYDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "SystemEntryDate" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.SAFdateTimeType xgetSystemEntryDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(SYSTEMENTRYDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SystemEntryDate" element
     */
    public void setSystemEntryDate(java.util.Calendar systemEntryDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSTEMENTRYDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SYSTEMENTRYDATE$0);
            }
            target.setCalendarValue(systemEntryDate);
        }
    }
    
    /**
     * Sets (as xml) the "SystemEntryDate" element
     */
    public void xsetSystemEntryDate(x0101.oecdStandardAuditFileTaxPT1.SAFdateTimeType systemEntryDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(SYSTEMENTRYDATE$0, 0);
            if (target == null)
            {
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().add_element_user(SYSTEMENTRYDATE$0);
            }
            target.set(systemEntryDate);
        }
    }
}
