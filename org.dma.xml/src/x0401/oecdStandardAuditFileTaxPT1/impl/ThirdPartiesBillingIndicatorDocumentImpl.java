/*
 * An XML document type.
 * Localname: ThirdPartiesBillingIndicator
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.ThirdPartiesBillingIndicatorDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one ThirdPartiesBillingIndicator(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class ThirdPartiesBillingIndicatorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.ThirdPartiesBillingIndicatorDocument
{
    private static final long serialVersionUID = 1L;
    
    public ThirdPartiesBillingIndicatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName THIRDPARTIESBILLINGINDICATOR$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "ThirdPartiesBillingIndicator");
    
    
    /**
     * Gets the "ThirdPartiesBillingIndicator" element
     */
    public int getThirdPartiesBillingIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(THIRDPARTIESBILLINGINDICATOR$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ThirdPartiesBillingIndicator" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.ThirdPartiesBillingIndicatorDocument.ThirdPartiesBillingIndicator xgetThirdPartiesBillingIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.ThirdPartiesBillingIndicatorDocument.ThirdPartiesBillingIndicator target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.ThirdPartiesBillingIndicatorDocument.ThirdPartiesBillingIndicator)get_store().find_element_user(THIRDPARTIESBILLINGINDICATOR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ThirdPartiesBillingIndicator" element
     */
    public void setThirdPartiesBillingIndicator(int thirdPartiesBillingIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(THIRDPARTIESBILLINGINDICATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(THIRDPARTIESBILLINGINDICATOR$0);
            }
            target.setIntValue(thirdPartiesBillingIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "ThirdPartiesBillingIndicator" element
     */
    public void xsetThirdPartiesBillingIndicator(x0401.oecdStandardAuditFileTaxPT1.ThirdPartiesBillingIndicatorDocument.ThirdPartiesBillingIndicator thirdPartiesBillingIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.ThirdPartiesBillingIndicatorDocument.ThirdPartiesBillingIndicator target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.ThirdPartiesBillingIndicatorDocument.ThirdPartiesBillingIndicator)get_store().find_element_user(THIRDPARTIESBILLINGINDICATOR$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.ThirdPartiesBillingIndicatorDocument.ThirdPartiesBillingIndicator)get_store().add_element_user(THIRDPARTIESBILLINGINDICATOR$0);
            }
            target.set(thirdPartiesBillingIndicator);
        }
    }
    /**
     * An XML ThirdPartiesBillingIndicator(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
     *
     * This is an atomic type that is a restriction of x0401.oecdStandardAuditFileTaxPT1.ThirdPartiesBillingIndicatorDocument$ThirdPartiesBillingIndicator.
     */
    public static class ThirdPartiesBillingIndicatorImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements x0401.oecdStandardAuditFileTaxPT1.ThirdPartiesBillingIndicatorDocument.ThirdPartiesBillingIndicator
    {
        private static final long serialVersionUID = 1L;
        
        public ThirdPartiesBillingIndicatorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ThirdPartiesBillingIndicatorImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
