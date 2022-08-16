/*
 * An XML document type.
 * Localname: WorkType
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.03_01
 * Java type: x0301.oecdStandardAuditFileTaxPT1.WorkTypeDocument
 *
 * Automatically generated - do not modify.
 */
package x0301.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one WorkType(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01) element.
 *
 * This is a complex type.
 */
public class WorkTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0301.oecdStandardAuditFileTaxPT1.WorkTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public WorkTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WORKTYPE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "WorkType");
    
    
    /**
     * Gets the "WorkType" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.WorkTypeDocument.WorkType.Enum getWorkType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (x0301.oecdStandardAuditFileTaxPT1.WorkTypeDocument.WorkType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "WorkType" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.WorkTypeDocument.WorkType xgetWorkType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.WorkTypeDocument.WorkType target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.WorkTypeDocument.WorkType)get_store().find_element_user(WORKTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "WorkType" element
     */
    public void setWorkType(x0301.oecdStandardAuditFileTaxPT1.WorkTypeDocument.WorkType.Enum workType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKTYPE$0);
            }
            target.setEnumValue(workType);
        }
    }
    
    /**
     * Sets (as xml) the "WorkType" element
     */
    public void xsetWorkType(x0301.oecdStandardAuditFileTaxPT1.WorkTypeDocument.WorkType workType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.WorkTypeDocument.WorkType target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.WorkTypeDocument.WorkType)get_store().find_element_user(WORKTYPE$0, 0);
            if (target == null)
            {
                target = (x0301.oecdStandardAuditFileTaxPT1.WorkTypeDocument.WorkType)get_store().add_element_user(WORKTYPE$0);
            }
            target.set(workType);
        }
    }
    /**
     * An XML WorkType(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
     *
     * This is an atomic type that is a restriction of x0301.oecdStandardAuditFileTaxPT1.WorkTypeDocument$WorkType.
     */
    public static class WorkTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x0301.oecdStandardAuditFileTaxPT1.WorkTypeDocument.WorkType
    {
        private static final long serialVersionUID = 1L;
        
        public WorkTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected WorkTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
