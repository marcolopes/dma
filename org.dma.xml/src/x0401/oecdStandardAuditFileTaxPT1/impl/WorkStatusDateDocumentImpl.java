/*
 * An XML document type.
 * Localname: WorkStatusDate
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.WorkStatusDateDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one WorkStatusDate(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class WorkStatusDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.WorkStatusDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public WorkStatusDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WORKSTATUSDATE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "WorkStatusDate");
    
    
    /**
     * Gets the "WorkStatusDate" element
     */
    public java.util.Calendar getWorkStatusDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKSTATUSDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "WorkStatusDate" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType xgetWorkStatusDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(WORKSTATUSDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "WorkStatusDate" element
     */
    public void setWorkStatusDate(java.util.Calendar workStatusDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKSTATUSDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKSTATUSDATE$0);
            }
            target.setCalendarValue(workStatusDate);
        }
    }
    
    /**
     * Sets (as xml) the "WorkStatusDate" element
     */
    public void xsetWorkStatusDate(x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType workStatusDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(WORKSTATUSDATE$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().add_element_user(WORKSTATUSDATE$0);
            }
            target.set(workStatusDate);
        }
    }
}
