/*
 * An XML document type.
 * Localname: FiscalYear
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.03_01
 * Java type: x0301.oecdStandardAuditFileTaxPT1.FiscalYearDocument
 *
 * Automatically generated - do not modify.
 */
package x0301.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one FiscalYear(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01) element.
 *
 * This is a complex type.
 */
public class FiscalYearDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0301.oecdStandardAuditFileTaxPT1.FiscalYearDocument
{
    private static final long serialVersionUID = 1L;
    
    public FiscalYearDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FISCALYEAR$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "FiscalYear");
    
    
    /**
     * Gets the "FiscalYear" element
     */
    public int getFiscalYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FISCALYEAR$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "FiscalYear" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.FiscalYearDocument.FiscalYear xgetFiscalYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.FiscalYearDocument.FiscalYear target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.FiscalYearDocument.FiscalYear)get_store().find_element_user(FISCALYEAR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FiscalYear" element
     */
    public void setFiscalYear(int fiscalYear)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FISCALYEAR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FISCALYEAR$0);
            }
            target.setIntValue(fiscalYear);
        }
    }
    
    /**
     * Sets (as xml) the "FiscalYear" element
     */
    public void xsetFiscalYear(x0301.oecdStandardAuditFileTaxPT1.FiscalYearDocument.FiscalYear fiscalYear)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.FiscalYearDocument.FiscalYear target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.FiscalYearDocument.FiscalYear)get_store().find_element_user(FISCALYEAR$0, 0);
            if (target == null)
            {
                target = (x0301.oecdStandardAuditFileTaxPT1.FiscalYearDocument.FiscalYear)get_store().add_element_user(FISCALYEAR$0);
            }
            target.set(fiscalYear);
        }
    }
    /**
     * An XML FiscalYear(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
     *
     * This is an atomic type that is a restriction of x0301.oecdStandardAuditFileTaxPT1.FiscalYearDocument$FiscalYear.
     */
    public static class FiscalYearImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements x0301.oecdStandardAuditFileTaxPT1.FiscalYearDocument.FiscalYear
    {
        private static final long serialVersionUID = 1L;
        
        public FiscalYearImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected FiscalYearImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
