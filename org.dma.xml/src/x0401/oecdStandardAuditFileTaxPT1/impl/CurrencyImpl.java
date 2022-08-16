/*
 * XML Type:  Currency
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.Currency
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * An XML Currency(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
 *
 * This is a complex type.
 */
public class CurrencyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.Currency
{
    private static final long serialVersionUID = 1L;
    
    public CurrencyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURRENCYCODE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "CurrencyCode");
    private static final javax.xml.namespace.QName CURRENCYAMOUNT$2 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "CurrencyAmount");
    private static final javax.xml.namespace.QName EXCHANGERATE$4 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "ExchangeRate");
    
    
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
    public x0401.oecdStandardAuditFileTaxPT1.CurrencyCodeDocument.CurrencyCode xgetCurrencyCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.CurrencyCodeDocument.CurrencyCode target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.CurrencyCodeDocument.CurrencyCode)get_store().find_element_user(CURRENCYCODE$0, 0);
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
    public void xsetCurrencyCode(x0401.oecdStandardAuditFileTaxPT1.CurrencyCodeDocument.CurrencyCode currencyCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.CurrencyCodeDocument.CurrencyCode target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.CurrencyCodeDocument.CurrencyCode)get_store().find_element_user(CURRENCYCODE$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.CurrencyCodeDocument.CurrencyCode)get_store().add_element_user(CURRENCYCODE$0);
            }
            target.set(currencyCode);
        }
    }
    
    /**
     * Gets the "CurrencyAmount" element
     */
    public java.math.BigDecimal getCurrencyAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCYAMOUNT$2, 0);
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
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(CURRENCYAMOUNT$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCYAMOUNT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENCYAMOUNT$2);
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
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(CURRENCYAMOUNT$2, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(CURRENCYAMOUNT$2);
            }
            target.set(currencyAmount);
        }
    }
    
    /**
     * Gets the "ExchangeRate" element
     */
    public java.math.BigDecimal getExchangeRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXCHANGERATE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExchangeRate" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType xgetExchangeRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType)get_store().find_element_user(EXCHANGERATE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ExchangeRate" element
     */
    public void setExchangeRate(java.math.BigDecimal exchangeRate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXCHANGERATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXCHANGERATE$4);
            }
            target.setBigDecimalValue(exchangeRate);
        }
    }
    
    /**
     * Sets (as xml) the "ExchangeRate" element
     */
    public void xsetExchangeRate(x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType exchangeRate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType)get_store().find_element_user(EXCHANGERATE$4, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType)get_store().add_element_user(EXCHANGERATE$4);
            }
            target.set(exchangeRate);
        }
    }
}
