/*
 * An XML document type.
 * Localname: Currency
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.01_01
 * Java type: x0101.oecdStandardAuditFileTaxPT1.CurrencyDocument
 *
 * Automatically generated - do not modify.
 */
package x0101.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one Currency(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01) element.
 *
 * This is a complex type.
 */
public class CurrencyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.CurrencyDocument
{
    private static final long serialVersionUID = 1L;
    
    public CurrencyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURRENCY$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "Currency");
    
    
    /**
     * Gets the "Currency" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.CurrencyDocument.Currency getCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.CurrencyDocument.Currency target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.CurrencyDocument.Currency)get_store().find_element_user(CURRENCY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Currency" element
     */
    public void setCurrency(x0101.oecdStandardAuditFileTaxPT1.CurrencyDocument.Currency currency)
    {
        generatedSetterHelperImpl(currency, CURRENCY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Currency" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.CurrencyDocument.Currency addNewCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.CurrencyDocument.Currency target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.CurrencyDocument.Currency)get_store().add_element_user(CURRENCY$0);
            return target;
        }
    }
    /**
     * An XML Currency(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01).
     *
     * This is a complex type.
     */
    public static class CurrencyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.CurrencyDocument.Currency
    {
        private static final long serialVersionUID = 1L;
        
        public CurrencyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CURRENCYCODE$0 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "CurrencyCode");
        private static final javax.xml.namespace.QName CURRENCYCREDITAMOUNT$2 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "CurrencyCreditAmount");
        private static final javax.xml.namespace.QName CURRENCYDEBITAMOUNT$4 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "CurrencyDebitAmount");
        
        
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
        public x0101.oecdStandardAuditFileTaxPT1.CurrencyCodeDocument.CurrencyCode xgetCurrencyCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.CurrencyCodeDocument.CurrencyCode target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.CurrencyCodeDocument.CurrencyCode)get_store().find_element_user(CURRENCYCODE$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "CurrencyCode" element
         */
        public boolean isSetCurrencyCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CURRENCYCODE$0) != 0;
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
        public void xsetCurrencyCode(x0101.oecdStandardAuditFileTaxPT1.CurrencyCodeDocument.CurrencyCode currencyCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.CurrencyCodeDocument.CurrencyCode target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.CurrencyCodeDocument.CurrencyCode)get_store().find_element_user(CURRENCYCODE$0, 0);
                if (target == null)
                {
                    target = (x0101.oecdStandardAuditFileTaxPT1.CurrencyCodeDocument.CurrencyCode)get_store().add_element_user(CURRENCYCODE$0);
                }
                target.set(currencyCode);
            }
        }
        
        /**
         * Unsets the "CurrencyCode" element
         */
        public void unsetCurrencyCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CURRENCYCODE$0, 0);
            }
        }
        
        /**
         * Gets the "CurrencyCreditAmount" element
         */
        public java.math.BigDecimal getCurrencyCreditAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCYCREDITAMOUNT$2, 0);
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
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(CURRENCYCREDITAMOUNT$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "CurrencyCreditAmount" element
         */
        public boolean isSetCurrencyCreditAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CURRENCYCREDITAMOUNT$2) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCYCREDITAMOUNT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENCYCREDITAMOUNT$2);
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
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(CURRENCYCREDITAMOUNT$2, 0);
                if (target == null)
                {
                    target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(CURRENCYCREDITAMOUNT$2);
                }
                target.set(currencyCreditAmount);
            }
        }
        
        /**
         * Unsets the "CurrencyCreditAmount" element
         */
        public void unsetCurrencyCreditAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CURRENCYCREDITAMOUNT$2, 0);
            }
        }
        
        /**
         * Gets the "CurrencyDebitAmount" element
         */
        public java.math.BigDecimal getCurrencyDebitAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCYDEBITAMOUNT$4, 0);
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
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(CURRENCYDEBITAMOUNT$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "CurrencyDebitAmount" element
         */
        public boolean isSetCurrencyDebitAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CURRENCYDEBITAMOUNT$4) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCYDEBITAMOUNT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENCYDEBITAMOUNT$4);
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
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(CURRENCYDEBITAMOUNT$4, 0);
                if (target == null)
                {
                    target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(CURRENCYDEBITAMOUNT$4);
                }
                target.set(currencyDebitAmount);
            }
        }
        
        /**
         * Unsets the "CurrencyDebitAmount" element
         */
        public void unsetCurrencyDebitAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CURRENCYDEBITAMOUNT$4, 0);
            }
        }
    }
}
