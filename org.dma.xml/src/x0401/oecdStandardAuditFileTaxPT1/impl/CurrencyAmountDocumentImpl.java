/*
 * An XML document type.
 * Localname: CurrencyAmount
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.CurrencyAmountDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one CurrencyAmount(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class CurrencyAmountDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.CurrencyAmountDocument
{
    private static final long serialVersionUID = 1L;
    
    public CurrencyAmountDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURRENCYAMOUNT$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "CurrencyAmount");
    
    
    /**
     * Gets the "CurrencyAmount" element
     */
    public java.math.BigDecimal getCurrencyAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCYAMOUNT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "CurrencyAmount" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetCurrencyAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(CURRENCYAMOUNT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CurrencyAmount" element
     */
    public void setCurrencyAmount(java.math.BigDecimal currencyAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCYAMOUNT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENCYAMOUNT$0);
            }
            target.setBigDecimalValue(currencyAmount);
        }
    }
    
    /**
     * Sets (as xml) the "CurrencyAmount" element
     */
    public void xsetCurrencyAmount(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType currencyAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(CURRENCYAMOUNT$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(CURRENCYAMOUNT$0);
            }
            target.set(currencyAmount);
        }
    }
}
