/*
 * An XML document type.
 * Localname: DateCreated
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.03_01
 * Java type: x0301.oecdStandardAuditFileTaxPT1.DateCreatedDocument
 *
 * Automatically generated - do not modify.
 */
package x0301.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one DateCreated(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01) element.
 *
 * This is a complex type.
 */
public class DateCreatedDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0301.oecdStandardAuditFileTaxPT1.DateCreatedDocument
{
    private static final long serialVersionUID = 1L;
    
    public DateCreatedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATECREATED$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "DateCreated");
    
    
    /**
     * Gets the "DateCreated" element
     */
    public java.util.Calendar getDateCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATECREATED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DateCreated" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.SAFPTDateSpan xgetDateCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFPTDateSpan target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTDateSpan)get_store().find_element_user(DATECREATED$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DateCreated" element
     */
    public void setDateCreated(java.util.Calendar dateCreated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATECREATED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATECREATED$0);
            }
            target.setCalendarValue(dateCreated);
        }
    }
    
    /**
     * Sets (as xml) the "DateCreated" element
     */
    public void xsetDateCreated(x0301.oecdStandardAuditFileTaxPT1.SAFPTDateSpan dateCreated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFPTDateSpan target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTDateSpan)get_store().find_element_user(DATECREATED$0, 0);
            if (target == null)
            {
                target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTDateSpan)get_store().add_element_user(DATECREATED$0);
            }
            target.set(dateCreated);
        }
    }
}
