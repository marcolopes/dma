/*
 * An XML document type.
 * Localname: GeneralLedger
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.01_01
 * Java type: x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument
 *
 * Automatically generated - do not modify.
 */
package x0101.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one GeneralLedger(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01) element.
 *
 * This is a complex type.
 */
public class GeneralLedgerDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeneralLedgerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERALLEDGER$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "GeneralLedger");
    
    
    /**
     * Gets the "GeneralLedger" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger getGeneralLedger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger)get_store().find_element_user(GENERALLEDGER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GeneralLedger" element
     */
    public void setGeneralLedger(x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger generalLedger)
    {
        generatedSetterHelperImpl(generalLedger, GENERALLEDGER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GeneralLedger" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger addNewGeneralLedger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger)get_store().add_element_user(GENERALLEDGER$0);
            return target;
        }
    }
    /**
     * An XML GeneralLedger(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01).
     *
     * This is a complex type.
     */
    public static class GeneralLedgerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger
    {
        private static final long serialVersionUID = 1L;
        
        public GeneralLedgerImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ACCOUNTID$0 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "AccountID");
        private static final javax.xml.namespace.QName ACCOUNTDESCRIPTION$2 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "AccountDescription");
        private static final javax.xml.namespace.QName OPENINGDEBITBALANCE$4 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "OpeningDebitBalance");
        private static final javax.xml.namespace.QName OPENINGCREDITBALANCE$6 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "OpeningCreditBalance");
        
        
        /**
         * Gets the "AccountID" element
         */
        public java.lang.String getAccountID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "AccountID" element
         */
        public x0101.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID xgetAccountID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID)get_store().find_element_user(ACCOUNTID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "AccountID" element
         */
        public void setAccountID(java.lang.String accountID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCOUNTID$0);
                }
                target.setStringValue(accountID);
            }
        }
        
        /**
         * Sets (as xml) the "AccountID" element
         */
        public void xsetAccountID(x0101.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID accountID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID)get_store().find_element_user(ACCOUNTID$0, 0);
                if (target == null)
                {
                    target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID)get_store().add_element_user(ACCOUNTID$0);
                }
                target.set(accountID);
            }
        }
        
        /**
         * Gets the "AccountDescription" element
         */
        public java.lang.String getAccountDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTDESCRIPTION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "AccountDescription" element
         */
        public x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car xgetAccountDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(ACCOUNTDESCRIPTION$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "AccountDescription" element
         */
        public void setAccountDescription(java.lang.String accountDescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTDESCRIPTION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCOUNTDESCRIPTION$2);
                }
                target.setStringValue(accountDescription);
            }
        }
        
        /**
         * Sets (as xml) the "AccountDescription" element
         */
        public void xsetAccountDescription(x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car accountDescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(ACCOUNTDESCRIPTION$2, 0);
                if (target == null)
                {
                    target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().add_element_user(ACCOUNTDESCRIPTION$2);
                }
                target.set(accountDescription);
            }
        }
        
        /**
         * Gets the "OpeningDebitBalance" element
         */
        public java.math.BigDecimal getOpeningDebitBalance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPENINGDEBITBALANCE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "OpeningDebitBalance" element
         */
        public x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetOpeningDebitBalance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(OPENINGDEBITBALANCE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "OpeningDebitBalance" element
         */
        public void setOpeningDebitBalance(java.math.BigDecimal openingDebitBalance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPENINGDEBITBALANCE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPENINGDEBITBALANCE$4);
                }
                target.setBigDecimalValue(openingDebitBalance);
            }
        }
        
        /**
         * Sets (as xml) the "OpeningDebitBalance" element
         */
        public void xsetOpeningDebitBalance(x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType openingDebitBalance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(OPENINGDEBITBALANCE$4, 0);
                if (target == null)
                {
                    target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(OPENINGDEBITBALANCE$4);
                }
                target.set(openingDebitBalance);
            }
        }
        
        /**
         * Gets the "OpeningCreditBalance" element
         */
        public java.math.BigDecimal getOpeningCreditBalance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPENINGCREDITBALANCE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "OpeningCreditBalance" element
         */
        public x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetOpeningCreditBalance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(OPENINGCREDITBALANCE$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "OpeningCreditBalance" element
         */
        public void setOpeningCreditBalance(java.math.BigDecimal openingCreditBalance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPENINGCREDITBALANCE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPENINGCREDITBALANCE$6);
                }
                target.setBigDecimalValue(openingCreditBalance);
            }
        }
        
        /**
         * Sets (as xml) the "OpeningCreditBalance" element
         */
        public void xsetOpeningCreditBalance(x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType openingCreditBalance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(OPENINGCREDITBALANCE$6, 0);
                if (target == null)
                {
                    target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(OPENINGCREDITBALANCE$6);
                }
                target.set(openingCreditBalance);
            }
        }
    }
}
