/*
 * An XML document type.
 * Localname: SourceBilling
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.02_01
 * Java type: x0201.oecdStandardAuditFileTaxPT1.SourceBillingDocument
 *
 * Automatically generated - do not modify.
 */
package x0201.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one SourceBilling(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01) element.
 *
 * This is a complex type.
 */
public class SourceBillingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0201.oecdStandardAuditFileTaxPT1.SourceBillingDocument
{
    private static final long serialVersionUID = 1L;
    
    public SourceBillingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCEBILLING$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "SourceBilling");
    
    
    /**
     * Gets the "SourceBilling" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.SourceBillingDocument.SourceBilling.Enum getSourceBilling()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEBILLING$0, 0);
            if (target == null)
            {
                return null;
            }
            return (x0201.oecdStandardAuditFileTaxPT1.SourceBillingDocument.SourceBilling.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "SourceBilling" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.SourceBillingDocument.SourceBilling xgetSourceBilling()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SourceBillingDocument.SourceBilling target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SourceBillingDocument.SourceBilling)get_store().find_element_user(SOURCEBILLING$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SourceBilling" element
     */
    public void setSourceBilling(x0201.oecdStandardAuditFileTaxPT1.SourceBillingDocument.SourceBilling.Enum sourceBilling)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEBILLING$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEBILLING$0);
            }
            target.setEnumValue(sourceBilling);
        }
    }
    
    /**
     * Sets (as xml) the "SourceBilling" element
     */
    public void xsetSourceBilling(x0201.oecdStandardAuditFileTaxPT1.SourceBillingDocument.SourceBilling sourceBilling)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SourceBillingDocument.SourceBilling target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SourceBillingDocument.SourceBilling)get_store().find_element_user(SOURCEBILLING$0, 0);
            if (target == null)
            {
                target = (x0201.oecdStandardAuditFileTaxPT1.SourceBillingDocument.SourceBilling)get_store().add_element_user(SOURCEBILLING$0);
            }
            target.set(sourceBilling);
        }
    }
    /**
     * An XML SourceBilling(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01).
     *
     * This is an atomic type that is a restriction of x0201.oecdStandardAuditFileTaxPT1.SourceBillingDocument$SourceBilling.
     */
    public static class SourceBillingImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x0201.oecdStandardAuditFileTaxPT1.SourceBillingDocument.SourceBilling
    {
        private static final long serialVersionUID = 1L;
        
        public SourceBillingImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected SourceBillingImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
