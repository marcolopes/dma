/*
 * An XML document type.
 * Localname: WorkStatus
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.WorkStatusDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one WorkStatus(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class WorkStatusDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.WorkStatusDocument
{
    private static final long serialVersionUID = 1L;
    
    public WorkStatusDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WORKSTATUS$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "WorkStatus");
    
    
    /**
     * Gets the "WorkStatus" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.WorkStatusDocument.WorkStatus.Enum getWorkStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKSTATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return (x0401.oecdStandardAuditFileTaxPT1.WorkStatusDocument.WorkStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "WorkStatus" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.WorkStatusDocument.WorkStatus xgetWorkStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.WorkStatusDocument.WorkStatus target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.WorkStatusDocument.WorkStatus)get_store().find_element_user(WORKSTATUS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "WorkStatus" element
     */
    public void setWorkStatus(x0401.oecdStandardAuditFileTaxPT1.WorkStatusDocument.WorkStatus.Enum workStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKSTATUS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKSTATUS$0);
            }
            target.setEnumValue(workStatus);
        }
    }
    
    /**
     * Sets (as xml) the "WorkStatus" element
     */
    public void xsetWorkStatus(x0401.oecdStandardAuditFileTaxPT1.WorkStatusDocument.WorkStatus workStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.WorkStatusDocument.WorkStatus target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.WorkStatusDocument.WorkStatus)get_store().find_element_user(WORKSTATUS$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.WorkStatusDocument.WorkStatus)get_store().add_element_user(WORKSTATUS$0);
            }
            target.set(workStatus);
        }
    }
    /**
     * An XML WorkStatus(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
     *
     * This is an atomic type that is a restriction of x0401.oecdStandardAuditFileTaxPT1.WorkStatusDocument$WorkStatus.
     */
    public static class WorkStatusImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x0401.oecdStandardAuditFileTaxPT1.WorkStatusDocument.WorkStatus
    {
        private static final long serialVersionUID = 1L;
        
        public WorkStatusImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected WorkStatusImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
