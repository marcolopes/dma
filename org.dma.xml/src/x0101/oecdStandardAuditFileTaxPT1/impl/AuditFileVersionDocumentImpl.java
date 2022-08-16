/*
 * An XML document type.
 * Localname: AuditFileVersion
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.01_01
 * Java type: x0101.oecdStandardAuditFileTaxPT1.AuditFileVersionDocument
 *
 * Automatically generated - do not modify.
 */
package x0101.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one AuditFileVersion(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01) element.
 *
 * This is a complex type.
 */
public class AuditFileVersionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.AuditFileVersionDocument
{
    private static final long serialVersionUID = 1L;
    
    public AuditFileVersionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUDITFILEVERSION$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "AuditFileVersion");
    
    
    /**
     * Gets the "AuditFileVersion" element
     */
    public java.lang.String getAuditFileVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUDITFILEVERSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AuditFileVersion" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.AuditFileVersionDocument.AuditFileVersion xgetAuditFileVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.AuditFileVersionDocument.AuditFileVersion target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.AuditFileVersionDocument.AuditFileVersion)get_store().find_element_user(AUDITFILEVERSION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AuditFileVersion" element
     */
    public void setAuditFileVersion(java.lang.String auditFileVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUDITFILEVERSION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUDITFILEVERSION$0);
            }
            target.setStringValue(auditFileVersion);
        }
    }
    
    /**
     * Sets (as xml) the "AuditFileVersion" element
     */
    public void xsetAuditFileVersion(x0101.oecdStandardAuditFileTaxPT1.AuditFileVersionDocument.AuditFileVersion auditFileVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.AuditFileVersionDocument.AuditFileVersion target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.AuditFileVersionDocument.AuditFileVersion)get_store().find_element_user(AUDITFILEVERSION$0, 0);
            if (target == null)
            {
                target = (x0101.oecdStandardAuditFileTaxPT1.AuditFileVersionDocument.AuditFileVersion)get_store().add_element_user(AUDITFILEVERSION$0);
            }
            target.set(auditFileVersion);
        }
    }
    /**
     * An XML AuditFileVersion(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01).
     *
     * This is an atomic type that is a restriction of x0101.oecdStandardAuditFileTaxPT1.AuditFileVersionDocument$AuditFileVersion.
     */
    public static class AuditFileVersionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements x0101.oecdStandardAuditFileTaxPT1.AuditFileVersionDocument.AuditFileVersion
    {
        private static final long serialVersionUID = 1L;
        
        public AuditFileVersionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected AuditFileVersionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
