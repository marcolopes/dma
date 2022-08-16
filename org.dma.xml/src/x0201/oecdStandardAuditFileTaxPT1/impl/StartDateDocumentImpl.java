/*
 * An XML document type.
 * Localname: StartDate
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.02_01
 * Java type: x0201.oecdStandardAuditFileTaxPT1.StartDateDocument
 *
 * Automatically generated - do not modify.
 */
package x0201.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one StartDate(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01) element.
 *
 * This is a complex type.
 */
public class StartDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0201.oecdStandardAuditFileTaxPT1.StartDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public StartDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STARTDATE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "StartDate");
    
    
    /**
     * Gets the "StartDate" element
     */
    public java.util.Calendar getStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "StartDate" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.SAFPTDateSpan xgetStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFPTDateSpan target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTDateSpan)get_store().find_element_user(STARTDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "StartDate" element
     */
    public void setStartDate(java.util.Calendar startDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATE$0);
            }
            target.setCalendarValue(startDate);
        }
    }
    
    /**
     * Sets (as xml) the "StartDate" element
     */
    public void xsetStartDate(x0201.oecdStandardAuditFileTaxPT1.SAFPTDateSpan startDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFPTDateSpan target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTDateSpan)get_store().find_element_user(STARTDATE$0, 0);
            if (target == null)
            {
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTDateSpan)get_store().add_element_user(STARTDATE$0);
            }
            target.set(startDate);
        }
    }
}
