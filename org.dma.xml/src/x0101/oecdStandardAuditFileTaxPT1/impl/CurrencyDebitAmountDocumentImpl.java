/*
 * An XML document type.
 * Localname: CurrencyDebitAmount
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.01_01
 * Java type: x0101.oecdStandardAuditFileTaxPT1.CurrencyDebitAmountDocument
 *
 * Automatically generated - do not modify.
 */
package x0101.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one CurrencyDebitAmount(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01) element.
 *
 * This is a complex type.
 */
public class CurrencyDebitAmountDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.CurrencyDebitAmountDocument
{
    private static final long serialVersionUID = 1L;
    
    public CurrencyDebitAmountDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURRENCYDEBITAMOUNT$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "CurrencyDebitAmount");
    
    
    /**
     * Gets the "CurrencyDebitAmount" element
     */
    public java.math.BigDecimal getCurrencyDebitAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCYDEBITAMOUNT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "CurrencyDebitAmount" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetCurrencyDebitAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(CURRENCYDEBITAMOUNT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CurrencyDebitAmount" element
     */
    public void setCurrencyDebitAmount(java.math.BigDecimal currencyDebitAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCYDEBITAMOUNT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENCYDEBITAMOUNT$0);
            }
            target.setBigDecimalValue(currencyDebitAmount);
        }
    }
    
    /**
     * Sets (as xml) the "CurrencyDebitAmount" element
     */
    public void xsetCurrencyDebitAmount(x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType currencyDebitAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(CURRENCYDEBITAMOUNT$0, 0);
            if (target == null)
            {
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(CURRENCYDEBITAMOUNT$0);
            }
            target.set(currencyDebitAmount);
        }
    }
}
