/*
 * An XML document type.
 * Localname: CurrencyCode
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.02_01
 * Java type: x0201.oecdStandardAuditFileTaxPT1.CurrencyCodeDocument
 *
 * Automatically generated - do not modify.
 */
package x0201.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one CurrencyCode(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01) element.
 *
 * This is a complex type.
 */
public class CurrencyCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0201.oecdStandardAuditFileTaxPT1.CurrencyCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public CurrencyCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURRENCYCODE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "CurrencyCode");
    
    
    /**
     * Gets the "CurrencyCode" element
     */
    public java.lang.String getCurrencyCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCYCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CurrencyCode" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.CurrencyCodeDocument.CurrencyCode xgetCurrencyCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.CurrencyCodeDocument.CurrencyCode target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.CurrencyCodeDocument.CurrencyCode)get_store().find_element_user(CURRENCYCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CurrencyCode" element
     */
    public void setCurrencyCode(java.lang.String currencyCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCYCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENCYCODE$0);
            }
            target.setStringValue(currencyCode);
        }
    }
    
    /**
     * Sets (as xml) the "CurrencyCode" element
     */
    public void xsetCurrencyCode(x0201.oecdStandardAuditFileTaxPT1.CurrencyCodeDocument.CurrencyCode currencyCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.CurrencyCodeDocument.CurrencyCode target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.CurrencyCodeDocument.CurrencyCode)get_store().find_element_user(CURRENCYCODE$0, 0);
            if (target == null)
            {
                target = (x0201.oecdStandardAuditFileTaxPT1.CurrencyCodeDocument.CurrencyCode)get_store().add_element_user(CURRENCYCODE$0);
            }
            target.set(currencyCode);
        }
    }
    /**
     * An XML CurrencyCode(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01).
     *
     * This is an atomic type that is a restriction of x0201.oecdStandardAuditFileTaxPT1.CurrencyCodeDocument$CurrencyCode.
     */
    public static class CurrencyCodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements x0201.oecdStandardAuditFileTaxPT1.CurrencyCodeDocument.CurrencyCode
    {
        private static final long serialVersionUID = 1L;
        
        public CurrencyCodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected CurrencyCodeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
