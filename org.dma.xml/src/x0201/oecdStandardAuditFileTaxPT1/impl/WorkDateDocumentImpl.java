/*
 * An XML document type.
 * Localname: WorkDate
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.02_01
 * Java type: x0201.oecdStandardAuditFileTaxPT1.WorkDateDocument
 *
 * Automatically generated - do not modify.
 */
package x0201.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one WorkDate(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01) element.
 *
 * This is a complex type.
 */
public class WorkDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0201.oecdStandardAuditFileTaxPT1.WorkDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public WorkDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WORKDATE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "WorkDate");
    
    
    /**
     * Gets the "WorkDate" element
     */
    public java.util.Calendar getWorkDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "WorkDate" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.SAFdateType xgetWorkDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(WORKDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "WorkDate" element
     */
    public void setWorkDate(java.util.Calendar workDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKDATE$0);
            }
            target.setCalendarValue(workDate);
        }
    }
    
    /**
     * Sets (as xml) the "WorkDate" element
     */
    public void xsetWorkDate(x0201.oecdStandardAuditFileTaxPT1.SAFdateType workDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(WORKDATE$0, 0);
            if (target == null)
            {
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().add_element_user(WORKDATE$0);
            }
            target.set(workDate);
        }
    }
}
