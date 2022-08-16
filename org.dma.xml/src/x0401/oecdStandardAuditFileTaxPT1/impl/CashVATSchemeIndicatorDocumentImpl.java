/*
 * An XML document type.
 * Localname: CashVATSchemeIndicator
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.CashVATSchemeIndicatorDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one CashVATSchemeIndicator(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class CashVATSchemeIndicatorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.CashVATSchemeIndicatorDocument
{
    private static final long serialVersionUID = 1L;
    
    public CashVATSchemeIndicatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CASHVATSCHEMEINDICATOR$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "CashVATSchemeIndicator");
    
    
    /**
     * Gets the "CashVATSchemeIndicator" element
     */
    public int getCashVATSchemeIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CASHVATSCHEMEINDICATOR$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "CashVATSchemeIndicator" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.CashVATSchemeIndicatorDocument.CashVATSchemeIndicator xgetCashVATSchemeIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.CashVATSchemeIndicatorDocument.CashVATSchemeIndicator target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.CashVATSchemeIndicatorDocument.CashVATSchemeIndicator)get_store().find_element_user(CASHVATSCHEMEINDICATOR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CashVATSchemeIndicator" element
     */
    public void setCashVATSchemeIndicator(int cashVATSchemeIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CASHVATSCHEMEINDICATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CASHVATSCHEMEINDICATOR$0);
            }
            target.setIntValue(cashVATSchemeIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "CashVATSchemeIndicator" element
     */
    public void xsetCashVATSchemeIndicator(x0401.oecdStandardAuditFileTaxPT1.CashVATSchemeIndicatorDocument.CashVATSchemeIndicator cashVATSchemeIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.CashVATSchemeIndicatorDocument.CashVATSchemeIndicator target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.CashVATSchemeIndicatorDocument.CashVATSchemeIndicator)get_store().find_element_user(CASHVATSCHEMEINDICATOR$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.CashVATSchemeIndicatorDocument.CashVATSchemeIndicator)get_store().add_element_user(CASHVATSCHEMEINDICATOR$0);
            }
            target.set(cashVATSchemeIndicator);
        }
    }
    /**
     * An XML CashVATSchemeIndicator(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
     *
     * This is an atomic type that is a restriction of x0401.oecdStandardAuditFileTaxPT1.CashVATSchemeIndicatorDocument$CashVATSchemeIndicator.
     */
    public static class CashVATSchemeIndicatorImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements x0401.oecdStandardAuditFileTaxPT1.CashVATSchemeIndicatorDocument.CashVATSchemeIndicator
    {
        private static final long serialVersionUID = 1L;
        
        public CashVATSchemeIndicatorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected CashVATSchemeIndicatorImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
