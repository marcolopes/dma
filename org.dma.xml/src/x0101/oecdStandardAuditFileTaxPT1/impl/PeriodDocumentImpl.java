/*
 * An XML document type.
 * Localname: Period
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.01_01
 * Java type: x0101.oecdStandardAuditFileTaxPT1.PeriodDocument
 *
 * Automatically generated - do not modify.
 */
package x0101.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one Period(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01) element.
 *
 * This is a complex type.
 */
public class PeriodDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.PeriodDocument
{
    private static final long serialVersionUID = 1L;
    
    public PeriodDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERIOD$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "Period");
    
    
    /**
     * Gets the "Period" element
     */
    public int getPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIOD$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Period" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.PeriodDocument.Period xgetPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.PeriodDocument.Period target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.PeriodDocument.Period)get_store().find_element_user(PERIOD$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Period" element
     */
    public void setPeriod(int period)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIOD$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERIOD$0);
            }
            target.setIntValue(period);
        }
    }
    
    /**
     * Sets (as xml) the "Period" element
     */
    public void xsetPeriod(x0101.oecdStandardAuditFileTaxPT1.PeriodDocument.Period period)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.PeriodDocument.Period target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.PeriodDocument.Period)get_store().find_element_user(PERIOD$0, 0);
            if (target == null)
            {
                target = (x0101.oecdStandardAuditFileTaxPT1.PeriodDocument.Period)get_store().add_element_user(PERIOD$0);
            }
            target.set(period);
        }
    }
    /**
     * An XML Period(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01).
     *
     * This is an atomic type that is a restriction of x0101.oecdStandardAuditFileTaxPT1.PeriodDocument$Period.
     */
    public static class PeriodImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements x0101.oecdStandardAuditFileTaxPT1.PeriodDocument.Period
    {
        private static final long serialVersionUID = 1L;
        
        public PeriodImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected PeriodImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
