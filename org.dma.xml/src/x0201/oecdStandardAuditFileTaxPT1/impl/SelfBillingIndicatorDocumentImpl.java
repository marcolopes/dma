/*
 * An XML document type.
 * Localname: SelfBillingIndicator
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.02_01
 * Java type: x0201.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument
 *
 * Automatically generated - do not modify.
 */
package x0201.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one SelfBillingIndicator(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01) element.
 *
 * This is a complex type.
 */
public class SelfBillingIndicatorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0201.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument
{
    private static final long serialVersionUID = 1L;
    
    public SelfBillingIndicatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SELFBILLINGINDICATOR$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "SelfBillingIndicator");
    
    
    /**
     * Gets the "SelfBillingIndicator" element
     */
    public int getSelfBillingIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELFBILLINGINDICATOR$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "SelfBillingIndicator" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator xgetSelfBillingIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator)get_store().find_element_user(SELFBILLINGINDICATOR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SelfBillingIndicator" element
     */
    public void setSelfBillingIndicator(int selfBillingIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELFBILLINGINDICATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SELFBILLINGINDICATOR$0);
            }
            target.setIntValue(selfBillingIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "SelfBillingIndicator" element
     */
    public void xsetSelfBillingIndicator(x0201.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator selfBillingIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator)get_store().find_element_user(SELFBILLINGINDICATOR$0, 0);
            if (target == null)
            {
                target = (x0201.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator)get_store().add_element_user(SELFBILLINGINDICATOR$0);
            }
            target.set(selfBillingIndicator);
        }
    }
    /**
     * An XML SelfBillingIndicator(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01).
     *
     * This is an atomic type that is a restriction of x0201.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument$SelfBillingIndicator.
     */
    public static class SelfBillingIndicatorImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements x0201.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator
    {
        private static final long serialVersionUID = 1L;
        
        public SelfBillingIndicatorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected SelfBillingIndicatorImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
