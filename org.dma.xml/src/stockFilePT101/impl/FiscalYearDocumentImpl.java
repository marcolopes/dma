/*
 * An XML document type.
 * Localname: FiscalYear
 * Namespace: urn:StockFile:PT_1_01
 * Java type: stockFilePT101.FiscalYearDocument
 *
 * Automatically generated - do not modify.
 */
package stockFilePT101.impl;
/**
 * A document containing one FiscalYear(@urn:StockFile:PT_1_01) element.
 *
 * This is a complex type.
 */
public class FiscalYearDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements stockFilePT101.FiscalYearDocument
{
    private static final long serialVersionUID = 1L;
    
    public FiscalYearDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FISCALYEAR$0 = 
        new javax.xml.namespace.QName("urn:StockFile:PT_1_01", "FiscalYear");
    
    
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
    public stockFilePT101.FiscalYearDocument.FiscalYear xgetFiscalYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            stockFilePT101.FiscalYearDocument.FiscalYear target = null;
            target = (stockFilePT101.FiscalYearDocument.FiscalYear)get_store().find_element_user(FISCALYEAR$0, 0);
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
    public void xsetFiscalYear(stockFilePT101.FiscalYearDocument.FiscalYear fiscalYear)
    {
        synchronized (monitor())
        {
            check_orphaned();
            stockFilePT101.FiscalYearDocument.FiscalYear target = null;
            target = (stockFilePT101.FiscalYearDocument.FiscalYear)get_store().find_element_user(FISCALYEAR$0, 0);
            if (target == null)
            {
                target = (stockFilePT101.FiscalYearDocument.FiscalYear)get_store().add_element_user(FISCALYEAR$0);
            }
            target.set(fiscalYear);
        }
    }
    /**
     * An XML FiscalYear(@urn:StockFile:PT_1_01).
     *
     * This is an atomic type that is a restriction of stockFilePT101.FiscalYearDocument$FiscalYear.
     */
    public static class FiscalYearImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements stockFilePT101.FiscalYearDocument.FiscalYear
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
