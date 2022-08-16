/*
 * An XML document type.
 * Localname: GLPostingDate
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.02_01
 * Java type: x0201.oecdStandardAuditFileTaxPT1.GLPostingDateDocument
 *
 * Automatically generated - do not modify.
 */
package x0201.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one GLPostingDate(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01) element.
 *
 * This is a complex type.
 */
public class GLPostingDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0201.oecdStandardAuditFileTaxPT1.GLPostingDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public GLPostingDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GLPOSTINGDATE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "GLPostingDate");
    
    
    /**
     * Gets the "GLPostingDate" element
     */
    public java.util.Calendar getGLPostingDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GLPOSTINGDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "GLPostingDate" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.SAFdateTimeType xgetGLPostingDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(GLPOSTINGDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "GLPostingDate" element
     */
    public void setGLPostingDate(java.util.Calendar glPostingDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GLPOSTINGDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GLPOSTINGDATE$0);
            }
            target.setCalendarValue(glPostingDate);
        }
    }
    
    /**
     * Sets (as xml) the "GLPostingDate" element
     */
    public void xsetGLPostingDate(x0201.oecdStandardAuditFileTaxPT1.SAFdateTimeType glPostingDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(GLPOSTINGDATE$0, 0);
            if (target == null)
            {
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().add_element_user(GLPOSTINGDATE$0);
            }
            target.set(glPostingDate);
        }
    }
}
