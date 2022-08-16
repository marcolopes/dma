/*
 * An XML document type.
 * Localname: CurrencyCreditAmount
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.01_01
 * Java type: x0101.oecdStandardAuditFileTaxPT1.CurrencyCreditAmountDocument
 *
 * Automatically generated - do not modify.
 */
package x0101.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one CurrencyCreditAmount(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01) element.
 *
 * This is a complex type.
 */
public class CurrencyCreditAmountDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.CurrencyCreditAmountDocument
{
    private static final long serialVersionUID = 1L;
    
    public CurrencyCreditAmountDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURRENCYCREDITAMOUNT$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "CurrencyCreditAmount");
    
    
    /**
     * Gets the "CurrencyCreditAmount" element
     */
    public java.math.BigDecimal getCurrencyCreditAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCYCREDITAMOUNT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "CurrencyCreditAmount" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetCurrencyCreditAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(CURRENCYCREDITAMOUNT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CurrencyCreditAmount" element
     */
    public void setCurrencyCreditAmount(java.math.BigDecimal currencyCreditAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCYCREDITAMOUNT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENCYCREDITAMOUNT$0);
            }
            target.setBigDecimalValue(currencyCreditAmount);
        }
    }
    
    /**
     * Sets (as xml) the "CurrencyCreditAmount" element
     */
    public void xsetCurrencyCreditAmount(x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType currencyCreditAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(CURRENCYCREDITAMOUNT$0, 0);
            if (target == null)
            {
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(CURRENCYCREDITAMOUNT$0);
            }
            target.set(currencyCreditAmount);
        }
    }
}
