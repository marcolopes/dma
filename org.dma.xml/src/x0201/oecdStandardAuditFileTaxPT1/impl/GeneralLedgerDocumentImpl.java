/*
 * An XML document type.
 * Localname: GeneralLedger
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.02_01
 * Java type: x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument
 *
 * Automatically generated - do not modify.
 */
package x0201.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one GeneralLedger(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01) element.
 *
 * This is a complex type.
 */
public class GeneralLedgerDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeneralLedgerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERALLEDGER$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "GeneralLedger");
    
    
    /**
     * Gets the "GeneralLedger" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger getGeneralLedger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger)get_store().find_element_user(GENERALLEDGER$0, 0);
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
    public void setGeneralLedger(x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger generalLedger)
    {
        generatedSetterHelperImpl(generalLedger, GENERALLEDGER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GeneralLedger" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger addNewGeneralLedger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger)get_store().add_element_user(GENERALLEDGER$0);
            return target;
        }
    }
    /**
     * An XML GeneralLedger(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01).
     *
     * This is a complex type.
     */
    public static class GeneralLedgerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger
    {
        private static final long serialVersionUID = 1L;
        
        public GeneralLedgerImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ACCOUNTID$0 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "AccountID");
        private static final javax.xml.namespace.QName ACCOUNTDESCRIPTION$2 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "AccountDescription");
        private static final javax.xml.namespace.QName OPENINGDEBITBALANCE$4 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "OpeningDebitBalance");
        private static final javax.xml.namespace.QName OPENINGCREDITBALANCE$6 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "OpeningCreditBalance");
        private static final javax.xml.namespace.QName CLOSINGDEBITBALANCE$8 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "ClosingDebitBalance");
        private static final javax.xml.namespace.QName CLOSINGCREDITBALANCE$10 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "ClosingCreditBalance");
        private static final javax.xml.namespace.QName GROUPINGCATEGORY$12 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "GroupingCategory");
        private static final javax.xml.namespace.QName GROUPINGCODE$14 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "GroupingCode");
        
        
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
        public x0201.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID xgetAccountID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0201.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID target = null;
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID)get_store().find_element_user(ACCOUNTID$0, 0);
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
        public void xsetAccountID(x0201.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID accountID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0201.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID target = null;
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID)get_store().find_element_user(ACCOUNTID$0, 0);
                if (target == null)
                {
                    target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID)get_store().add_element_user(ACCOUNTID$0);
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
        public x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car xgetAccountDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(ACCOUNTDESCRIPTION$2, 0);
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
        public void xsetAccountDescription(x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car accountDescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(ACCOUNTDESCRIPTION$2, 0);
                if (target == null)
                {
                    target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().add_element_user(ACCOUNTDESCRIPTION$2);
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
        public x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetOpeningDebitBalance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(OPENINGDEBITBALANCE$4, 0);
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
        public void xsetOpeningDebitBalance(x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType openingDebitBalance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(OPENINGDEBITBALANCE$4, 0);
                if (target == null)
                {
                    target = (x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(OPENINGDEBITBALANCE$4);
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
        public x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetOpeningCreditBalance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(OPENINGCREDITBALANCE$6, 0);
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
        public void xsetOpeningCreditBalance(x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType openingCreditBalance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(OPENINGCREDITBALANCE$6, 0);
                if (target == null)
                {
                    target = (x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(OPENINGCREDITBALANCE$6);
                }
                target.set(openingCreditBalance);
            }
        }
        
        /**
         * Gets the "ClosingDebitBalance" element
         */
        public java.math.BigDecimal getClosingDebitBalance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSINGDEBITBALANCE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "ClosingDebitBalance" element
         */
        public x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetClosingDebitBalance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(CLOSINGDEBITBALANCE$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ClosingDebitBalance" element
         */
        public void setClosingDebitBalance(java.math.BigDecimal closingDebitBalance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSINGDEBITBALANCE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLOSINGDEBITBALANCE$8);
                }
                target.setBigDecimalValue(closingDebitBalance);
            }
        }
        
        /**
         * Sets (as xml) the "ClosingDebitBalance" element
         */
        public void xsetClosingDebitBalance(x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType closingDebitBalance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(CLOSINGDEBITBALANCE$8, 0);
                if (target == null)
                {
                    target = (x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(CLOSINGDEBITBALANCE$8);
                }
                target.set(closingDebitBalance);
            }
        }
        
        /**
         * Gets the "ClosingCreditBalance" element
         */
        public java.math.BigDecimal getClosingCreditBalance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSINGCREDITBALANCE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "ClosingCreditBalance" element
         */
        public x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetClosingCreditBalance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(CLOSINGCREDITBALANCE$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ClosingCreditBalance" element
         */
        public void setClosingCreditBalance(java.math.BigDecimal closingCreditBalance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSINGCREDITBALANCE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLOSINGCREDITBALANCE$10);
                }
                target.setBigDecimalValue(closingCreditBalance);
            }
        }
        
        /**
         * Sets (as xml) the "ClosingCreditBalance" element
         */
        public void xsetClosingCreditBalance(x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType closingCreditBalance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(CLOSINGCREDITBALANCE$10, 0);
                if (target == null)
                {
                    target = (x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(CLOSINGCREDITBALANCE$10);
                }
                target.set(closingCreditBalance);
            }
        }
        
        /**
         * Gets the "GroupingCategory" element
         */
        public x0201.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument.GroupingCategory.Enum getGroupingCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUPINGCATEGORY$12, 0);
                if (target == null)
                {
                    return null;
                }
                return (x0201.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument.GroupingCategory.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "GroupingCategory" element
         */
        public x0201.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument.GroupingCategory xgetGroupingCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0201.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument.GroupingCategory target = null;
                target = (x0201.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument.GroupingCategory)get_store().find_element_user(GROUPINGCATEGORY$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "GroupingCategory" element
         */
        public void setGroupingCategory(x0201.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument.GroupingCategory.Enum groupingCategory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUPINGCATEGORY$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GROUPINGCATEGORY$12);
                }
                target.setEnumValue(groupingCategory);
            }
        }
        
        /**
         * Sets (as xml) the "GroupingCategory" element
         */
        public void xsetGroupingCategory(x0201.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument.GroupingCategory groupingCategory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0201.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument.GroupingCategory target = null;
                target = (x0201.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument.GroupingCategory)get_store().find_element_user(GROUPINGCATEGORY$12, 0);
                if (target == null)
                {
                    target = (x0201.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument.GroupingCategory)get_store().add_element_user(GROUPINGCATEGORY$12);
                }
                target.set(groupingCategory);
            }
        }
        
        /**
         * Gets the "GroupingCode" element
         */
        public java.lang.String getGroupingCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUPINGCODE$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "GroupingCode" element
         */
        public x0201.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID xgetGroupingCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0201.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID target = null;
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID)get_store().find_element_user(GROUPINGCODE$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "GroupingCode" element
         */
        public boolean isSetGroupingCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GROUPINGCODE$14) != 0;
            }
        }
        
        /**
         * Sets the "GroupingCode" element
         */
        public void setGroupingCode(java.lang.String groupingCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUPINGCODE$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GROUPINGCODE$14);
                }
                target.setStringValue(groupingCode);
            }
        }
        
        /**
         * Sets (as xml) the "GroupingCode" element
         */
        public void xsetGroupingCode(x0201.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID groupingCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0201.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID target = null;
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID)get_store().find_element_user(GROUPINGCODE$14, 0);
                if (target == null)
                {
                    target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID)get_store().add_element_user(GROUPINGCODE$14);
                }
                target.set(groupingCode);
            }
        }
        
        /**
         * Unsets the "GroupingCode" element
         */
        public void unsetGroupingCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GROUPINGCODE$14, 0);
            }
        }
    }
}
