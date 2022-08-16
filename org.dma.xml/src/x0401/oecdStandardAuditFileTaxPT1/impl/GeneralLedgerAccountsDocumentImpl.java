/*
 * An XML document type.
 * Localname: GeneralLedgerAccounts
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one GeneralLedgerAccounts(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class GeneralLedgerAccountsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeneralLedgerAccountsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERALLEDGERACCOUNTS$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "GeneralLedgerAccounts");
    
    
    /**
     * Gets the "GeneralLedgerAccounts" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts getGeneralLedgerAccounts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts)get_store().find_element_user(GENERALLEDGERACCOUNTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GeneralLedgerAccounts" element
     */
    public void setGeneralLedgerAccounts(x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts generalLedgerAccounts)
    {
        generatedSetterHelperImpl(generalLedgerAccounts, GENERALLEDGERACCOUNTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GeneralLedgerAccounts" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts addNewGeneralLedgerAccounts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts)get_store().add_element_user(GENERALLEDGERACCOUNTS$0);
            return target;
        }
    }
    /**
     * An XML GeneralLedgerAccounts(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
     *
     * This is a complex type.
     */
    public static class GeneralLedgerAccountsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts
    {
        private static final long serialVersionUID = 1L;
        
        public GeneralLedgerAccountsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TAXONOMYREFERENCE$0 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TaxonomyReference");
        private static final javax.xml.namespace.QName ACCOUNT$2 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Account");
        
        
        /**
         * Gets the "TaxonomyReference" element
         */
        public x0401.oecdStandardAuditFileTaxPT1.TaxonomyReferenceDocument.TaxonomyReference.Enum getTaxonomyReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXONOMYREFERENCE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return (x0401.oecdStandardAuditFileTaxPT1.TaxonomyReferenceDocument.TaxonomyReference.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "TaxonomyReference" element
         */
        public x0401.oecdStandardAuditFileTaxPT1.TaxonomyReferenceDocument.TaxonomyReference xgetTaxonomyReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.TaxonomyReferenceDocument.TaxonomyReference target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.TaxonomyReferenceDocument.TaxonomyReference)get_store().find_element_user(TAXONOMYREFERENCE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "TaxonomyReference" element
         */
        public void setTaxonomyReference(x0401.oecdStandardAuditFileTaxPT1.TaxonomyReferenceDocument.TaxonomyReference.Enum taxonomyReference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXONOMYREFERENCE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXONOMYREFERENCE$0);
                }
                target.setEnumValue(taxonomyReference);
            }
        }
        
        /**
         * Sets (as xml) the "TaxonomyReference" element
         */
        public void xsetTaxonomyReference(x0401.oecdStandardAuditFileTaxPT1.TaxonomyReferenceDocument.TaxonomyReference taxonomyReference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.TaxonomyReferenceDocument.TaxonomyReference target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.TaxonomyReferenceDocument.TaxonomyReference)get_store().find_element_user(TAXONOMYREFERENCE$0, 0);
                if (target == null)
                {
                    target = (x0401.oecdStandardAuditFileTaxPT1.TaxonomyReferenceDocument.TaxonomyReference)get_store().add_element_user(TAXONOMYREFERENCE$0);
                }
                target.set(taxonomyReference);
            }
        }
        
        /**
         * Gets a List of "Account" elements
         */
        public java.util.List<x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts.Account> getAccountList()
        {
            final class AccountList extends java.util.AbstractList<x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts.Account>
            {
                @Override
                public x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts.Account get(int i)
                    { return GeneralLedgerAccountsImpl.this.getAccountArray(i); }
                
                @Override
                public x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts.Account set(int i, x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts.Account o)
                {
                    x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts.Account old = GeneralLedgerAccountsImpl.this.getAccountArray(i);
                    GeneralLedgerAccountsImpl.this.setAccountArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts.Account o)
                    { GeneralLedgerAccountsImpl.this.insertNewAccount(i).set(o); }
                
                @Override
                public x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts.Account remove(int i)
                {
                    x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts.Account old = GeneralLedgerAccountsImpl.this.getAccountArray(i);
                    GeneralLedgerAccountsImpl.this.removeAccount(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return GeneralLedgerAccountsImpl.this.sizeOfAccountArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new AccountList();
            }
        }
        
        /**
         * Gets array of all "Account" elements
         * @deprecated
         */
        @Deprecated
        public x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts.Account[] getAccountArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts.Account> targetList = new java.util.ArrayList<x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts.Account>();
                get_store().find_all_element_users(ACCOUNT$2, targetList);
                x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts.Account[] result = new x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts.Account[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Account" element
         */
        public x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts.Account getAccountArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts.Account target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts.Account)get_store().find_element_user(ACCOUNT$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Account" element
         */
        public int sizeOfAccountArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ACCOUNT$2);
            }
        }
        
        /**
         * Sets array of all "Account" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAccountArray(x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts.Account[] accountArray)
        {
            check_orphaned();
            arraySetterHelper(accountArray, ACCOUNT$2);
        }
        
        /**
         * Sets ith "Account" element
         */
        public void setAccountArray(int i, x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts.Account account)
        {
            generatedSetterHelperImpl(account, ACCOUNT$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Account" element
         */
        public x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts.Account insertNewAccount(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts.Account target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts.Account)get_store().insert_element_user(ACCOUNT$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Account" element
         */
        public x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts.Account addNewAccount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts.Account target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts.Account)get_store().add_element_user(ACCOUNT$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "Account" element
         */
        public void removeAccount(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ACCOUNT$2, i);
            }
        }
        /**
         * An XML Account(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
         *
         * This is a complex type.
         */
        public static class AccountImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts.Account
        {
            private static final long serialVersionUID = 1L;
            
            public AccountImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName ACCOUNTID$0 = 
                new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "AccountID");
            private static final javax.xml.namespace.QName ACCOUNTDESCRIPTION$2 = 
                new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "AccountDescription");
            private static final javax.xml.namespace.QName OPENINGDEBITBALANCE$4 = 
                new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "OpeningDebitBalance");
            private static final javax.xml.namespace.QName OPENINGCREDITBALANCE$6 = 
                new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "OpeningCreditBalance");
            private static final javax.xml.namespace.QName CLOSINGDEBITBALANCE$8 = 
                new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "ClosingDebitBalance");
            private static final javax.xml.namespace.QName CLOSINGCREDITBALANCE$10 = 
                new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "ClosingCreditBalance");
            private static final javax.xml.namespace.QName GROUPINGCATEGORY$12 = 
                new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "GroupingCategory");
            private static final javax.xml.namespace.QName GROUPINGCODE$14 = 
                new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "GroupingCode");
            private static final javax.xml.namespace.QName TAXONOMYCODE$16 = 
                new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TaxonomyCode");
            
            
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
            public x0401.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID xgetAccountID()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID)get_store().find_element_user(ACCOUNTID$0, 0);
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
            public void xsetAccountID(x0401.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID accountID)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID)get_store().find_element_user(ACCOUNTID$0, 0);
                    if (target == null)
                    {
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID)get_store().add_element_user(ACCOUNTID$0);
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
            public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car xgetAccountDescription()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car)get_store().find_element_user(ACCOUNTDESCRIPTION$2, 0);
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
            public void xsetAccountDescription(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car accountDescription)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car)get_store().find_element_user(ACCOUNTDESCRIPTION$2, 0);
                    if (target == null)
                    {
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car)get_store().add_element_user(ACCOUNTDESCRIPTION$2);
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
            public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetOpeningDebitBalance()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(OPENINGDEBITBALANCE$4, 0);
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
            public void xsetOpeningDebitBalance(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType openingDebitBalance)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(OPENINGDEBITBALANCE$4, 0);
                    if (target == null)
                    {
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(OPENINGDEBITBALANCE$4);
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
            public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetOpeningCreditBalance()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(OPENINGCREDITBALANCE$6, 0);
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
            public void xsetOpeningCreditBalance(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType openingCreditBalance)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(OPENINGCREDITBALANCE$6, 0);
                    if (target == null)
                    {
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(OPENINGCREDITBALANCE$6);
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
            public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetClosingDebitBalance()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(CLOSINGDEBITBALANCE$8, 0);
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
            public void xsetClosingDebitBalance(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType closingDebitBalance)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(CLOSINGDEBITBALANCE$8, 0);
                    if (target == null)
                    {
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(CLOSINGDEBITBALANCE$8);
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
            public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetClosingCreditBalance()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(CLOSINGCREDITBALANCE$10, 0);
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
            public void xsetClosingCreditBalance(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType closingCreditBalance)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(CLOSINGCREDITBALANCE$10, 0);
                    if (target == null)
                    {
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(CLOSINGCREDITBALANCE$10);
                    }
                    target.set(closingCreditBalance);
                }
            }
            
            /**
             * Gets the "GroupingCategory" element
             */
            public x0401.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument.GroupingCategory.Enum getGroupingCategory()
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
                    return (x0401.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument.GroupingCategory.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "GroupingCategory" element
             */
            public x0401.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument.GroupingCategory xgetGroupingCategory()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument.GroupingCategory target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument.GroupingCategory)get_store().find_element_user(GROUPINGCATEGORY$12, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "GroupingCategory" element
             */
            public void setGroupingCategory(x0401.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument.GroupingCategory.Enum groupingCategory)
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
            public void xsetGroupingCategory(x0401.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument.GroupingCategory groupingCategory)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument.GroupingCategory target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument.GroupingCategory)get_store().find_element_user(GROUPINGCATEGORY$12, 0);
                    if (target == null)
                    {
                      target = (x0401.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument.GroupingCategory)get_store().add_element_user(GROUPINGCATEGORY$12);
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
            public x0401.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID xgetGroupingCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID)get_store().find_element_user(GROUPINGCODE$14, 0);
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
            public void xsetGroupingCode(x0401.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID groupingCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID)get_store().find_element_user(GROUPINGCODE$14, 0);
                    if (target == null)
                    {
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID)get_store().add_element_user(GROUPINGCODE$14);
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
            
            /**
             * Gets the "TaxonomyCode" element
             */
            public int getTaxonomyCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXONOMYCODE$16, 0);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "TaxonomyCode" element
             */
            public x0401.oecdStandardAuditFileTaxPT1.SAFTaxonomyCode xgetTaxonomyCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SAFTaxonomyCode target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFTaxonomyCode)get_store().find_element_user(TAXONOMYCODE$16, 0);
                    return target;
                }
            }
            
            /**
             * True if has "TaxonomyCode" element
             */
            public boolean isSetTaxonomyCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(TAXONOMYCODE$16) != 0;
                }
            }
            
            /**
             * Sets the "TaxonomyCode" element
             */
            public void setTaxonomyCode(int taxonomyCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXONOMYCODE$16, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXONOMYCODE$16);
                    }
                    target.setIntValue(taxonomyCode);
                }
            }
            
            /**
             * Sets (as xml) the "TaxonomyCode" element
             */
            public void xsetTaxonomyCode(x0401.oecdStandardAuditFileTaxPT1.SAFTaxonomyCode taxonomyCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SAFTaxonomyCode target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFTaxonomyCode)get_store().find_element_user(TAXONOMYCODE$16, 0);
                    if (target == null)
                    {
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFTaxonomyCode)get_store().add_element_user(TAXONOMYCODE$16);
                    }
                    target.set(taxonomyCode);
                }
            }
            
            /**
             * Unsets the "TaxonomyCode" element
             */
            public void unsetTaxonomyCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(TAXONOMYCODE$16, 0);
                }
            }
        }
    }
}
