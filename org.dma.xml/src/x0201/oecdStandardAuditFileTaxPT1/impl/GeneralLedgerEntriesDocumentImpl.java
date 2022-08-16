/*
 * An XML document type.
 * Localname: GeneralLedgerEntries
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.02_01
 * Java type: x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument
 *
 * Automatically generated - do not modify.
 */
package x0201.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one GeneralLedgerEntries(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01) element.
 *
 * This is a complex type.
 */
public class GeneralLedgerEntriesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeneralLedgerEntriesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERALLEDGERENTRIES$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "GeneralLedgerEntries");
    
    
    /**
     * Gets the "GeneralLedgerEntries" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries getGeneralLedgerEntries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries)get_store().find_element_user(GENERALLEDGERENTRIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GeneralLedgerEntries" element
     */
    public void setGeneralLedgerEntries(x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries generalLedgerEntries)
    {
        generatedSetterHelperImpl(generalLedgerEntries, GENERALLEDGERENTRIES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GeneralLedgerEntries" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries addNewGeneralLedgerEntries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries)get_store().add_element_user(GENERALLEDGERENTRIES$0);
            return target;
        }
    }
    /**
     * An XML GeneralLedgerEntries(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01).
     *
     * This is a complex type.
     */
    public static class GeneralLedgerEntriesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries
    {
        private static final long serialVersionUID = 1L;
        
        public GeneralLedgerEntriesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NUMBEROFENTRIES$0 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "NumberOfEntries");
        private static final javax.xml.namespace.QName TOTALDEBIT$2 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "TotalDebit");
        private static final javax.xml.namespace.QName TOTALCREDIT$4 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "TotalCredit");
        private static final javax.xml.namespace.QName JOURNAL$6 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "Journal");
        
        
        /**
         * Gets the "NumberOfEntries" element
         */
        public java.math.BigInteger getNumberOfEntries()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFENTRIES$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "NumberOfEntries" element
         */
        public org.apache.xmlbeans.XmlNonNegativeInteger xgetNumberOfEntries()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(NUMBEROFENTRIES$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "NumberOfEntries" element
         */
        public void setNumberOfEntries(java.math.BigInteger numberOfEntries)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFENTRIES$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFENTRIES$0);
                }
                target.setBigIntegerValue(numberOfEntries);
            }
        }
        
        /**
         * Sets (as xml) the "NumberOfEntries" element
         */
        public void xsetNumberOfEntries(org.apache.xmlbeans.XmlNonNegativeInteger numberOfEntries)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(NUMBEROFENTRIES$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(NUMBEROFENTRIES$0);
                }
                target.set(numberOfEntries);
            }
        }
        
        /**
         * Gets the "TotalDebit" element
         */
        public java.math.BigDecimal getTotalDebit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALDEBIT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "TotalDebit" element
         */
        public x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetTotalDebit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TOTALDEBIT$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "TotalDebit" element
         */
        public void setTotalDebit(java.math.BigDecimal totalDebit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALDEBIT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALDEBIT$2);
                }
                target.setBigDecimalValue(totalDebit);
            }
        }
        
        /**
         * Sets (as xml) the "TotalDebit" element
         */
        public void xsetTotalDebit(x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType totalDebit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TOTALDEBIT$2, 0);
                if (target == null)
                {
                    target = (x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(TOTALDEBIT$2);
                }
                target.set(totalDebit);
            }
        }
        
        /**
         * Gets the "TotalCredit" element
         */
        public java.math.BigDecimal getTotalCredit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALCREDIT$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "TotalCredit" element
         */
        public x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetTotalCredit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TOTALCREDIT$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "TotalCredit" element
         */
        public void setTotalCredit(java.math.BigDecimal totalCredit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALCREDIT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALCREDIT$4);
                }
                target.setBigDecimalValue(totalCredit);
            }
        }
        
        /**
         * Sets (as xml) the "TotalCredit" element
         */
        public void xsetTotalCredit(x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType totalCredit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TOTALCREDIT$4, 0);
                if (target == null)
                {
                    target = (x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(TOTALCREDIT$4);
                }
                target.set(totalCredit);
            }
        }
        
        /**
         * Gets a List of "Journal" elements
         */
        public java.util.List<x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal> getJournalList()
        {
            final class JournalList extends java.util.AbstractList<x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal>
            {
                @Override
                public x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal get(int i)
                    { return GeneralLedgerEntriesImpl.this.getJournalArray(i); }
                
                @Override
                public x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal set(int i, x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal o)
                {
                    x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal old = GeneralLedgerEntriesImpl.this.getJournalArray(i);
                    GeneralLedgerEntriesImpl.this.setJournalArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal o)
                    { GeneralLedgerEntriesImpl.this.insertNewJournal(i).set(o); }
                
                @Override
                public x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal remove(int i)
                {
                    x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal old = GeneralLedgerEntriesImpl.this.getJournalArray(i);
                    GeneralLedgerEntriesImpl.this.removeJournal(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return GeneralLedgerEntriesImpl.this.sizeOfJournalArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new JournalList();
            }
        }
        
        /**
         * Gets array of all "Journal" elements
         * @deprecated
         */
        @Deprecated
        public x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal[] getJournalArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal> targetList = new java.util.ArrayList<x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal>();
                get_store().find_all_element_users(JOURNAL$6, targetList);
                x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal[] result = new x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Journal" element
         */
        public x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal getJournalArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal target = null;
                target = (x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal)get_store().find_element_user(JOURNAL$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Journal" element
         */
        public int sizeOfJournalArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(JOURNAL$6);
            }
        }
        
        /**
         * Sets array of all "Journal" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setJournalArray(x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal[] journalArray)
        {
            check_orphaned();
            arraySetterHelper(journalArray, JOURNAL$6);
        }
        
        /**
         * Sets ith "Journal" element
         */
        public void setJournalArray(int i, x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal journal)
        {
            generatedSetterHelperImpl(journal, JOURNAL$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Journal" element
         */
        public x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal insertNewJournal(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal target = null;
                target = (x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal)get_store().insert_element_user(JOURNAL$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Journal" element
         */
        public x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal addNewJournal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal target = null;
                target = (x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal)get_store().add_element_user(JOURNAL$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "Journal" element
         */
        public void removeJournal(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(JOURNAL$6, i);
            }
        }
        /**
         * An XML Journal(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01).
         *
         * This is a complex type.
         */
        public static class JournalImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal
        {
            private static final long serialVersionUID = 1L;
            
            public JournalImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName JOURNALID$0 = 
                new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "JournalID");
            private static final javax.xml.namespace.QName DESCRIPTION$2 = 
                new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "Description");
            private static final javax.xml.namespace.QName TRANSACTION$4 = 
                new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "Transaction");
            
            
            /**
             * Gets the "JournalID" element
             */
            public java.lang.String getJournalID()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOURNALID$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "JournalID" element
             */
            public x0201.oecdStandardAuditFileTaxPT1.SAFPTJournalID xgetJournalID()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0201.oecdStandardAuditFileTaxPT1.SAFPTJournalID target = null;
                    target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTJournalID)get_store().find_element_user(JOURNALID$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "JournalID" element
             */
            public void setJournalID(java.lang.String journalID)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOURNALID$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOURNALID$0);
                    }
                    target.setStringValue(journalID);
                }
            }
            
            /**
             * Sets (as xml) the "JournalID" element
             */
            public void xsetJournalID(x0201.oecdStandardAuditFileTaxPT1.SAFPTJournalID journalID)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0201.oecdStandardAuditFileTaxPT1.SAFPTJournalID target = null;
                    target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTJournalID)get_store().find_element_user(JOURNALID$0, 0);
                    if (target == null)
                    {
                      target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTJournalID)get_store().add_element_user(JOURNALID$0);
                    }
                    target.set(journalID);
                }
            }
            
            /**
             * Gets the "Description" element
             */
            public java.lang.String getDescription()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "Description" element
             */
            public x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car xgetDescription()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car target = null;
                    target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car)get_store().find_element_user(DESCRIPTION$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "Description" element
             */
            public void setDescription(java.lang.String description)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$2);
                    }
                    target.setStringValue(description);
                }
            }
            
            /**
             * Sets (as xml) the "Description" element
             */
            public void xsetDescription(x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car description)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car target = null;
                    target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car)get_store().find_element_user(DESCRIPTION$2, 0);
                    if (target == null)
                    {
                      target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car)get_store().add_element_user(DESCRIPTION$2);
                    }
                    target.set(description);
                }
            }
            
            /**
             * Gets a List of "Transaction" elements
             */
            public java.util.List<x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction> getTransactionList()
            {
                final class TransactionList extends java.util.AbstractList<x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction>
                {
                    @Override
                    public x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction get(int i)
                        { return JournalImpl.this.getTransactionArray(i); }
                    
                    @Override
                    public x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction set(int i, x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction o)
                    {
                      x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction old = JournalImpl.this.getTransactionArray(i);
                      JournalImpl.this.setTransactionArray(i, o);
                      return old;
                    }
                    
                    @Override
                    public void add(int i, x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction o)
                        { JournalImpl.this.insertNewTransaction(i).set(o); }
                    
                    @Override
                    public x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction remove(int i)
                    {
                      x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction old = JournalImpl.this.getTransactionArray(i);
                      JournalImpl.this.removeTransaction(i);
                      return old;
                    }
                    
                    @Override
                    public int size()
                        { return JournalImpl.this.sizeOfTransactionArray(); }
                    
                }
                
                synchronized (monitor())
                {
                    check_orphaned();
                    return new TransactionList();
                }
            }
            
            /**
             * Gets array of all "Transaction" elements
             * @deprecated
             */
            @Deprecated
            public x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction[] getTransactionArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List<x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction> targetList = new java.util.ArrayList<x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction>();
                    get_store().find_all_element_users(TRANSACTION$4, targetList);
                    x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction[] result = new x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Transaction" element
             */
            public x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction getTransactionArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction target = null;
                    target = (x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction)get_store().find_element_user(TRANSACTION$4, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Transaction" element
             */
            public int sizeOfTransactionArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(TRANSACTION$4);
                }
            }
            
            /**
             * Sets array of all "Transaction" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setTransactionArray(x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction[] transactionArray)
            {
                check_orphaned();
                arraySetterHelper(transactionArray, TRANSACTION$4);
            }
            
            /**
             * Sets ith "Transaction" element
             */
            public void setTransactionArray(int i, x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction transaction)
            {
                generatedSetterHelperImpl(transaction, TRANSACTION$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Transaction" element
             */
            public x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction insertNewTransaction(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction target = null;
                    target = (x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction)get_store().insert_element_user(TRANSACTION$4, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Transaction" element
             */
            public x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction addNewTransaction()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction target = null;
                    target = (x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction)get_store().add_element_user(TRANSACTION$4);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Transaction" element
             */
            public void removeTransaction(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(TRANSACTION$4, i);
                }
            }
            /**
             * An XML Transaction(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01).
             *
             * This is a complex type.
             */
            public static class TransactionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction
            {
                private static final long serialVersionUID = 1L;
                
                public TransactionImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName TRANSACTIONID$0 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "TransactionID");
                private static final javax.xml.namespace.QName PERIOD$2 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "Period");
                private static final javax.xml.namespace.QName TRANSACTIONDATE$4 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "TransactionDate");
                private static final javax.xml.namespace.QName SOURCEID$6 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "SourceID");
                private static final javax.xml.namespace.QName DESCRIPTION$8 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "Description");
                private static final javax.xml.namespace.QName DOCARCHIVALNUMBER$10 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "DocArchivalNumber");
                private static final javax.xml.namespace.QName TRANSACTIONTYPE$12 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "TransactionType");
                private static final javax.xml.namespace.QName GLPOSTINGDATE$14 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "GLPostingDate");
                private static final javax.xml.namespace.QName CUSTOMERID$16 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "CustomerID");
                private static final javax.xml.namespace.QName SUPPLIERID$18 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "SupplierID");
                private static final javax.xml.namespace.QName LINE$20 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "Line");
                
                
                /**
                 * Gets the "TransactionID" element
                 */
                public java.lang.String getTransactionID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONID$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TransactionID" element
                 */
                public x0201.oecdStandardAuditFileTaxPT1.SAFPTTransactionID xgetTransactionID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0201.oecdStandardAuditFileTaxPT1.SAFPTTransactionID target = null;
                      target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTTransactionID)get_store().find_element_user(TRANSACTIONID$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "TransactionID" element
                 */
                public void setTransactionID(java.lang.String transactionID)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONID$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSACTIONID$0);
                      }
                      target.setStringValue(transactionID);
                    }
                }
                
                /**
                 * Sets (as xml) the "TransactionID" element
                 */
                public void xsetTransactionID(x0201.oecdStandardAuditFileTaxPT1.SAFPTTransactionID transactionID)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0201.oecdStandardAuditFileTaxPT1.SAFPTTransactionID target = null;
                      target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTTransactionID)get_store().find_element_user(TRANSACTIONID$0, 0);
                      if (target == null)
                      {
                        target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTTransactionID)get_store().add_element_user(TRANSACTIONID$0);
                      }
                      target.set(transactionID);
                    }
                }
                
                /**
                 * Gets the "Period" element
                 */
                public int getPeriod()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIOD$2, 0);
                      if (target == null)
                      {
                        return 0;
                      }
                      return target.getIntValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Period" element
                 */
                public x0201.oecdStandardAuditFileTaxPT1.SAFPTAccountingPeriod xgetPeriod()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0201.oecdStandardAuditFileTaxPT1.SAFPTAccountingPeriod target = null;
                      target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTAccountingPeriod)get_store().find_element_user(PERIOD$2, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "Period" element
                 */
                public void setPeriod(int period)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIOD$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERIOD$2);
                      }
                      target.setIntValue(period);
                    }
                }
                
                /**
                 * Sets (as xml) the "Period" element
                 */
                public void xsetPeriod(x0201.oecdStandardAuditFileTaxPT1.SAFPTAccountingPeriod period)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0201.oecdStandardAuditFileTaxPT1.SAFPTAccountingPeriod target = null;
                      target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTAccountingPeriod)get_store().find_element_user(PERIOD$2, 0);
                      if (target == null)
                      {
                        target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTAccountingPeriod)get_store().add_element_user(PERIOD$2);
                      }
                      target.set(period);
                    }
                }
                
                /**
                 * Gets the "TransactionDate" element
                 */
                public java.util.Calendar getTransactionDate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONDATE$4, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getCalendarValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TransactionDate" element
                 */
                public x0201.oecdStandardAuditFileTaxPT1.SAFdateType xgetTransactionDate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0201.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
                      target = (x0201.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(TRANSACTIONDATE$4, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "TransactionDate" element
                 */
                public void setTransactionDate(java.util.Calendar transactionDate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONDATE$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSACTIONDATE$4);
                      }
                      target.setCalendarValue(transactionDate);
                    }
                }
                
                /**
                 * Sets (as xml) the "TransactionDate" element
                 */
                public void xsetTransactionDate(x0201.oecdStandardAuditFileTaxPT1.SAFdateType transactionDate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0201.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
                      target = (x0201.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(TRANSACTIONDATE$4, 0);
                      if (target == null)
                      {
                        target = (x0201.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().add_element_user(TRANSACTIONDATE$4);
                      }
                      target.set(transactionDate);
                    }
                }
                
                /**
                 * Gets the "SourceID" element
                 */
                public java.lang.String getSourceID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEID$6, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "SourceID" element
                 */
                public x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetSourceID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                      target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(SOURCEID$6, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "SourceID" element
                 */
                public void setSourceID(java.lang.String sourceID)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEID$6, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEID$6);
                      }
                      target.setStringValue(sourceID);
                    }
                }
                
                /**
                 * Sets (as xml) the "SourceID" element
                 */
                public void xsetSourceID(x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car sourceID)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                      target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(SOURCEID$6, 0);
                      if (target == null)
                      {
                        target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().add_element_user(SOURCEID$6);
                      }
                      target.set(sourceID);
                    }
                }
                
                /**
                 * Gets the "Description" element
                 */
                public java.lang.String getDescription()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$8, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Description" element
                 */
                public x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car xgetDescription()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car target = null;
                      target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car)get_store().find_element_user(DESCRIPTION$8, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "Description" element
                 */
                public void setDescription(java.lang.String description)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$8);
                      }
                      target.setStringValue(description);
                    }
                }
                
                /**
                 * Sets (as xml) the "Description" element
                 */
                public void xsetDescription(x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car description)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car target = null;
                      target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car)get_store().find_element_user(DESCRIPTION$8, 0);
                      if (target == null)
                      {
                        target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car)get_store().add_element_user(DESCRIPTION$8);
                      }
                      target.set(description);
                    }
                }
                
                /**
                 * Gets the "DocArchivalNumber" element
                 */
                public java.lang.String getDocArchivalNumber()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCARCHIVALNUMBER$10, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "DocArchivalNumber" element
                 */
                public x0201.oecdStandardAuditFileTaxPT1.SAFTPTDocArchivalNumber xgetDocArchivalNumber()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0201.oecdStandardAuditFileTaxPT1.SAFTPTDocArchivalNumber target = null;
                      target = (x0201.oecdStandardAuditFileTaxPT1.SAFTPTDocArchivalNumber)get_store().find_element_user(DOCARCHIVALNUMBER$10, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "DocArchivalNumber" element
                 */
                public void setDocArchivalNumber(java.lang.String docArchivalNumber)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCARCHIVALNUMBER$10, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCARCHIVALNUMBER$10);
                      }
                      target.setStringValue(docArchivalNumber);
                    }
                }
                
                /**
                 * Sets (as xml) the "DocArchivalNumber" element
                 */
                public void xsetDocArchivalNumber(x0201.oecdStandardAuditFileTaxPT1.SAFTPTDocArchivalNumber docArchivalNumber)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0201.oecdStandardAuditFileTaxPT1.SAFTPTDocArchivalNumber target = null;
                      target = (x0201.oecdStandardAuditFileTaxPT1.SAFTPTDocArchivalNumber)get_store().find_element_user(DOCARCHIVALNUMBER$10, 0);
                      if (target == null)
                      {
                        target = (x0201.oecdStandardAuditFileTaxPT1.SAFTPTDocArchivalNumber)get_store().add_element_user(DOCARCHIVALNUMBER$10);
                      }
                      target.set(docArchivalNumber);
                    }
                }
                
                /**
                 * Gets the "TransactionType" element
                 */
                public x0201.oecdStandardAuditFileTaxPT1.TransactionTypeDocument.TransactionType.Enum getTransactionType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONTYPE$12, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return (x0201.oecdStandardAuditFileTaxPT1.TransactionTypeDocument.TransactionType.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TransactionType" element
                 */
                public x0201.oecdStandardAuditFileTaxPT1.TransactionTypeDocument.TransactionType xgetTransactionType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0201.oecdStandardAuditFileTaxPT1.TransactionTypeDocument.TransactionType target = null;
                      target = (x0201.oecdStandardAuditFileTaxPT1.TransactionTypeDocument.TransactionType)get_store().find_element_user(TRANSACTIONTYPE$12, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "TransactionType" element
                 */
                public void setTransactionType(x0201.oecdStandardAuditFileTaxPT1.TransactionTypeDocument.TransactionType.Enum transactionType)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONTYPE$12, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSACTIONTYPE$12);
                      }
                      target.setEnumValue(transactionType);
                    }
                }
                
                /**
                 * Sets (as xml) the "TransactionType" element
                 */
                public void xsetTransactionType(x0201.oecdStandardAuditFileTaxPT1.TransactionTypeDocument.TransactionType transactionType)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0201.oecdStandardAuditFileTaxPT1.TransactionTypeDocument.TransactionType target = null;
                      target = (x0201.oecdStandardAuditFileTaxPT1.TransactionTypeDocument.TransactionType)get_store().find_element_user(TRANSACTIONTYPE$12, 0);
                      if (target == null)
                      {
                        target = (x0201.oecdStandardAuditFileTaxPT1.TransactionTypeDocument.TransactionType)get_store().add_element_user(TRANSACTIONTYPE$12);
                      }
                      target.set(transactionType);
                    }
                }
                
                /**
                 * Gets the "GLPostingDate" element
                 */
                public java.util.Calendar getGLPostingDate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GLPOSTINGDATE$14, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getCalendarValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "GLPostingDate" element
                 */
                public x0201.oecdStandardAuditFileTaxPT1.SAFdateTimeType xgetGLPostingDate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0201.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
                      target = (x0201.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(GLPOSTINGDATE$14, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "GLPostingDate" element
                 */
                public void setGLPostingDate(java.util.Calendar glPostingDate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GLPOSTINGDATE$14, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GLPOSTINGDATE$14);
                      }
                      target.setCalendarValue(glPostingDate);
                    }
                }
                
                /**
                 * Sets (as xml) the "GLPostingDate" element
                 */
                public void xsetGLPostingDate(x0201.oecdStandardAuditFileTaxPT1.SAFdateTimeType glPostingDate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0201.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
                      target = (x0201.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(GLPOSTINGDATE$14, 0);
                      if (target == null)
                      {
                        target = (x0201.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().add_element_user(GLPOSTINGDATE$14);
                      }
                      target.set(glPostingDate);
                    }
                }
                
                /**
                 * Gets the "CustomerID" element
                 */
                public java.lang.String getCustomerID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERID$16, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "CustomerID" element
                 */
                public x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetCustomerID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                      target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(CUSTOMERID$16, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "CustomerID" element
                 */
                public boolean isSetCustomerID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(CUSTOMERID$16) != 0;
                    }
                }
                
                /**
                 * Sets the "CustomerID" element
                 */
                public void setCustomerID(java.lang.String customerID)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERID$16, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTOMERID$16);
                      }
                      target.setStringValue(customerID);
                    }
                }
                
                /**
                 * Sets (as xml) the "CustomerID" element
                 */
                public void xsetCustomerID(x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car customerID)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                      target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(CUSTOMERID$16, 0);
                      if (target == null)
                      {
                        target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().add_element_user(CUSTOMERID$16);
                      }
                      target.set(customerID);
                    }
                }
                
                /**
                 * Unsets the "CustomerID" element
                 */
                public void unsetCustomerID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(CUSTOMERID$16, 0);
                    }
                }
                
                /**
                 * Gets the "SupplierID" element
                 */
                public java.lang.String getSupplierID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPLIERID$18, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "SupplierID" element
                 */
                public x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetSupplierID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                      target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(SUPPLIERID$18, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "SupplierID" element
                 */
                public boolean isSetSupplierID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(SUPPLIERID$18) != 0;
                    }
                }
                
                /**
                 * Sets the "SupplierID" element
                 */
                public void setSupplierID(java.lang.String supplierID)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPLIERID$18, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUPPLIERID$18);
                      }
                      target.setStringValue(supplierID);
                    }
                }
                
                /**
                 * Sets (as xml) the "SupplierID" element
                 */
                public void xsetSupplierID(x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car supplierID)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                      target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(SUPPLIERID$18, 0);
                      if (target == null)
                      {
                        target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().add_element_user(SUPPLIERID$18);
                      }
                      target.set(supplierID);
                    }
                }
                
                /**
                 * Unsets the "SupplierID" element
                 */
                public void unsetSupplierID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(SUPPLIERID$18, 0);
                    }
                }
                
                /**
                 * Gets a List of "Line" elements
                 */
                public java.util.List<x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction.Line> getLineList()
                {
                    final class LineList extends java.util.AbstractList<x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction.Line>
                    {
                      @Override
                      public x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction.Line get(int i)
                          { return TransactionImpl.this.getLineArray(i); }
                      
                      @Override
                      public x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction.Line set(int i, x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction.Line o)
                      {
                        x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction.Line old = TransactionImpl.this.getLineArray(i);
                        TransactionImpl.this.setLineArray(i, o);
                        return old;
                      }
                      
                      @Override
                      public void add(int i, x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction.Line o)
                          { TransactionImpl.this.insertNewLine(i).set(o); }
                      
                      @Override
                      public x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction.Line remove(int i)
                      {
                        x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction.Line old = TransactionImpl.this.getLineArray(i);
                        TransactionImpl.this.removeLine(i);
                        return old;
                      }
                      
                      @Override
                      public int size()
                          { return TransactionImpl.this.sizeOfLineArray(); }
                      
                    }
                    
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return new LineList();
                    }
                }
                
                /**
                 * Gets array of all "Line" elements
                 * @deprecated
                 */
                @Deprecated
                public x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction.Line[] getLineArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List<x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction.Line> targetList = new java.util.ArrayList<x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction.Line>();
                      get_store().find_all_element_users(LINE$20, targetList);
                      x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction.Line[] result = new x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction.Line[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "Line" element
                 */
                public x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction.Line getLineArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction.Line target = null;
                      target = (x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction.Line)get_store().find_element_user(LINE$20, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "Line" element
                 */
                public int sizeOfLineArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(LINE$20);
                    }
                }
                
                /**
                 * Sets array of all "Line" element  WARNING: This method is not atomicaly synchronized.
                 */
                public void setLineArray(x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction.Line[] lineArray)
                {
                    check_orphaned();
                    arraySetterHelper(lineArray, LINE$20);
                }
                
                /**
                 * Sets ith "Line" element
                 */
                public void setLineArray(int i, x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction.Line line)
                {
                    generatedSetterHelperImpl(line, LINE$20, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "Line" element
                 */
                public x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction.Line insertNewLine(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction.Line target = null;
                      target = (x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction.Line)get_store().insert_element_user(LINE$20, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "Line" element
                 */
                public x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction.Line addNewLine()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction.Line target = null;
                      target = (x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction.Line)get_store().add_element_user(LINE$20);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "Line" element
                 */
                public void removeLine(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(LINE$20, i);
                    }
                }
                /**
                 * An XML Line(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01).
                 *
                 * This is a complex type.
                 */
                public static class LineImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction.Line
                {
                    private static final long serialVersionUID = 1L;
                    
                    public LineImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName RECORDID$0 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "RecordID");
                    private static final javax.xml.namespace.QName ACCOUNTID$2 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "AccountID");
                    private static final javax.xml.namespace.QName SOURCEDOCUMENTID$4 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "SourceDocumentID");
                    private static final javax.xml.namespace.QName SYSTEMENTRYDATE$6 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "SystemEntryDate");
                    private static final javax.xml.namespace.QName DESCRIPTION$8 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "Description");
                    private static final javax.xml.namespace.QName DEBITAMOUNT$10 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "DebitAmount");
                    private static final javax.xml.namespace.QName CREDITAMOUNT$12 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "CreditAmount");
                    
                    
                    /**
                     * Gets the "RecordID" element
                     */
                    public java.lang.String getRecordID()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECORDID$0, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "RecordID" element
                     */
                    public x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetRecordID()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                        target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(RECORDID$0, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "RecordID" element
                     */
                    public void setRecordID(java.lang.String recordID)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECORDID$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECORDID$0);
                        }
                        target.setStringValue(recordID);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "RecordID" element
                     */
                    public void xsetRecordID(x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car recordID)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                        target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(RECORDID$0, 0);
                        if (target == null)
                        {
                          target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().add_element_user(RECORDID$0);
                        }
                        target.set(recordID);
                      }
                    }
                    
                    /**
                     * Gets the "AccountID" element
                     */
                    public java.lang.String getAccountID()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTID$2, 0);
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
                        target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID)get_store().find_element_user(ACCOUNTID$2, 0);
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTID$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCOUNTID$2);
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
                        target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID)get_store().find_element_user(ACCOUNTID$2, 0);
                        if (target == null)
                        {
                          target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID)get_store().add_element_user(ACCOUNTID$2);
                        }
                        target.set(accountID);
                      }
                    }
                    
                    /**
                     * Gets the "SourceDocumentID" element
                     */
                    public java.lang.String getSourceDocumentID()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEDOCUMENTID$4, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "SourceDocumentID" element
                     */
                    public x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetSourceDocumentID()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                        target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(SOURCEDOCUMENTID$4, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "SourceDocumentID" element
                     */
                    public boolean isSetSourceDocumentID()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(SOURCEDOCUMENTID$4) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "SourceDocumentID" element
                     */
                    public void setSourceDocumentID(java.lang.String sourceDocumentID)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEDOCUMENTID$4, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEDOCUMENTID$4);
                        }
                        target.setStringValue(sourceDocumentID);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "SourceDocumentID" element
                     */
                    public void xsetSourceDocumentID(x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car sourceDocumentID)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                        target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(SOURCEDOCUMENTID$4, 0);
                        if (target == null)
                        {
                          target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().add_element_user(SOURCEDOCUMENTID$4);
                        }
                        target.set(sourceDocumentID);
                      }
                    }
                    
                    /**
                     * Unsets the "SourceDocumentID" element
                     */
                    public void unsetSourceDocumentID()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(SOURCEDOCUMENTID$4, 0);
                      }
                    }
                    
                    /**
                     * Gets the "SystemEntryDate" element
                     */
                    public java.util.Calendar getSystemEntryDate()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSTEMENTRYDATE$6, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getCalendarValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "SystemEntryDate" element
                     */
                    public x0201.oecdStandardAuditFileTaxPT1.SAFdateTimeType xgetSystemEntryDate()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0201.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
                        target = (x0201.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(SYSTEMENTRYDATE$6, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "SystemEntryDate" element
                     */
                    public void setSystemEntryDate(java.util.Calendar systemEntryDate)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSTEMENTRYDATE$6, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SYSTEMENTRYDATE$6);
                        }
                        target.setCalendarValue(systemEntryDate);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "SystemEntryDate" element
                     */
                    public void xsetSystemEntryDate(x0201.oecdStandardAuditFileTaxPT1.SAFdateTimeType systemEntryDate)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0201.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
                        target = (x0201.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(SYSTEMENTRYDATE$6, 0);
                        if (target == null)
                        {
                          target = (x0201.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().add_element_user(SYSTEMENTRYDATE$6);
                        }
                        target.set(systemEntryDate);
                      }
                    }
                    
                    /**
                     * Gets the "Description" element
                     */
                    public java.lang.String getDescription()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$8, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "Description" element
                     */
                    public x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car xgetDescription()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car target = null;
                        target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car)get_store().find_element_user(DESCRIPTION$8, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "Description" element
                     */
                    public void setDescription(java.lang.String description)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$8, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$8);
                        }
                        target.setStringValue(description);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "Description" element
                     */
                    public void xsetDescription(x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car description)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car target = null;
                        target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car)get_store().find_element_user(DESCRIPTION$8, 0);
                        if (target == null)
                        {
                          target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car)get_store().add_element_user(DESCRIPTION$8);
                        }
                        target.set(description);
                      }
                    }
                    
                    /**
                     * Gets the "DebitAmount" element
                     */
                    public java.math.BigDecimal getDebitAmount()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEBITAMOUNT$10, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getBigDecimalValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "DebitAmount" element
                     */
                    public x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetDebitAmount()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(DEBITAMOUNT$10, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "DebitAmount" element
                     */
                    public boolean isSetDebitAmount()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(DEBITAMOUNT$10) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "DebitAmount" element
                     */
                    public void setDebitAmount(java.math.BigDecimal debitAmount)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEBITAMOUNT$10, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEBITAMOUNT$10);
                        }
                        target.setBigDecimalValue(debitAmount);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "DebitAmount" element
                     */
                    public void xsetDebitAmount(x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType debitAmount)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(DEBITAMOUNT$10, 0);
                        if (target == null)
                        {
                          target = (x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(DEBITAMOUNT$10);
                        }
                        target.set(debitAmount);
                      }
                    }
                    
                    /**
                     * Unsets the "DebitAmount" element
                     */
                    public void unsetDebitAmount()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(DEBITAMOUNT$10, 0);
                      }
                    }
                    
                    /**
                     * Gets the "CreditAmount" element
                     */
                    public java.math.BigDecimal getCreditAmount()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREDITAMOUNT$12, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getBigDecimalValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "CreditAmount" element
                     */
                    public x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetCreditAmount()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(CREDITAMOUNT$12, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "CreditAmount" element
                     */
                    public boolean isSetCreditAmount()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(CREDITAMOUNT$12) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "CreditAmount" element
                     */
                    public void setCreditAmount(java.math.BigDecimal creditAmount)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREDITAMOUNT$12, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREDITAMOUNT$12);
                        }
                        target.setBigDecimalValue(creditAmount);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "CreditAmount" element
                     */
                    public void xsetCreditAmount(x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType creditAmount)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(CREDITAMOUNT$12, 0);
                        if (target == null)
                        {
                          target = (x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(CREDITAMOUNT$12);
                        }
                        target.set(creditAmount);
                      }
                    }
                    
                    /**
                     * Unsets the "CreditAmount" element
                     */
                    public void unsetCreditAmount()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(CREDITAMOUNT$12, 0);
                      }
                    }
                }
            }
        }
    }
}
