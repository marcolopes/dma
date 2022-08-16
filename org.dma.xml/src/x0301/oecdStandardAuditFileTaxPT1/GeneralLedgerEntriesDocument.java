/*
 * An XML document type.
 * Localname: GeneralLedgerEntries
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.03_01
 * Java type: x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument
 *
 * Automatically generated - do not modify.
 */
package x0301.oecdStandardAuditFileTaxPT1;


/**
 * A document containing one GeneralLedgerEntries(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01) element.
 *
 * This is a complex type.
 */
public interface GeneralLedgerEntriesDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GeneralLedgerEntriesDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB56920DEA176B941910A868497F4EE85").resolveHandle("generalledgerentriesa039doctype");
    
    /**
     * Gets the "GeneralLedgerEntries" element
     */
    x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries getGeneralLedgerEntries();
    
    /**
     * Sets the "GeneralLedgerEntries" element
     */
    void setGeneralLedgerEntries(x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries generalLedgerEntries);
    
    /**
     * Appends and returns a new empty "GeneralLedgerEntries" element
     */
    x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries addNewGeneralLedgerEntries();
    
    /**
     * An XML GeneralLedgerEntries(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
     *
     * This is a complex type.
     */
    public interface GeneralLedgerEntries extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GeneralLedgerEntries.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB56920DEA176B941910A868497F4EE85").resolveHandle("generalledgerentriesd3feelemtype");
        
        /**
         * Gets the "NumberOfEntries" element
         */
        java.math.BigInteger getNumberOfEntries();
        
        /**
         * Gets (as xml) the "NumberOfEntries" element
         */
        org.apache.xmlbeans.XmlNonNegativeInteger xgetNumberOfEntries();
        
        /**
         * Sets the "NumberOfEntries" element
         */
        void setNumberOfEntries(java.math.BigInteger numberOfEntries);
        
        /**
         * Sets (as xml) the "NumberOfEntries" element
         */
        void xsetNumberOfEntries(org.apache.xmlbeans.XmlNonNegativeInteger numberOfEntries);
        
        /**
         * Gets the "TotalDebit" element
         */
        java.math.BigDecimal getTotalDebit();
        
        /**
         * Gets (as xml) the "TotalDebit" element
         */
        x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetTotalDebit();
        
        /**
         * Sets the "TotalDebit" element
         */
        void setTotalDebit(java.math.BigDecimal totalDebit);
        
        /**
         * Sets (as xml) the "TotalDebit" element
         */
        void xsetTotalDebit(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType totalDebit);
        
        /**
         * Gets the "TotalCredit" element
         */
        java.math.BigDecimal getTotalCredit();
        
        /**
         * Gets (as xml) the "TotalCredit" element
         */
        x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetTotalCredit();
        
        /**
         * Sets the "TotalCredit" element
         */
        void setTotalCredit(java.math.BigDecimal totalCredit);
        
        /**
         * Sets (as xml) the "TotalCredit" element
         */
        void xsetTotalCredit(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType totalCredit);
        
        /**
         * Gets a List of "Journal" elements
         */
        java.util.List<x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal> getJournalList();
        
        /**
         * Gets array of all "Journal" elements
         * @deprecated
         */
        @Deprecated
        x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal[] getJournalArray();
        
        /**
         * Gets ith "Journal" element
         */
        x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal getJournalArray(int i);
        
        /**
         * Returns number of "Journal" element
         */
        int sizeOfJournalArray();
        
        /**
         * Sets array of all "Journal" element
         */
        void setJournalArray(x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal[] journalArray);
        
        /**
         * Sets ith "Journal" element
         */
        void setJournalArray(int i, x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal journal);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Journal" element
         */
        x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal insertNewJournal(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Journal" element
         */
        x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal addNewJournal();
        
        /**
         * Removes the ith "Journal" element
         */
        void removeJournal(int i);
        
        /**
         * An XML Journal(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
         *
         * This is a complex type.
         */
        public interface Journal extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Journal.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB56920DEA176B941910A868497F4EE85").resolveHandle("journal8681elemtype");
            
            /**
             * Gets the "JournalID" element
             */
            java.lang.String getJournalID();
            
            /**
             * Gets (as xml) the "JournalID" element
             */
            x0301.oecdStandardAuditFileTaxPT1.SAFPTJournalID xgetJournalID();
            
            /**
             * Sets the "JournalID" element
             */
            void setJournalID(java.lang.String journalID);
            
            /**
             * Sets (as xml) the "JournalID" element
             */
            void xsetJournalID(x0301.oecdStandardAuditFileTaxPT1.SAFPTJournalID journalID);
            
            /**
             * Gets the "Description" element
             */
            java.lang.String getDescription();
            
            /**
             * Gets (as xml) the "Description" element
             */
            x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car xgetDescription();
            
            /**
             * Sets the "Description" element
             */
            void setDescription(java.lang.String description);
            
            /**
             * Sets (as xml) the "Description" element
             */
            void xsetDescription(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car description);
            
            /**
             * Gets a List of "Transaction" elements
             */
            java.util.List<x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction> getTransactionList();
            
            /**
             * Gets array of all "Transaction" elements
             * @deprecated
             */
            @Deprecated
            x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction[] getTransactionArray();
            
            /**
             * Gets ith "Transaction" element
             */
            x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction getTransactionArray(int i);
            
            /**
             * Returns number of "Transaction" element
             */
            int sizeOfTransactionArray();
            
            /**
             * Sets array of all "Transaction" element
             */
            void setTransactionArray(x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction[] transactionArray);
            
            /**
             * Sets ith "Transaction" element
             */
            void setTransactionArray(int i, x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction transaction);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Transaction" element
             */
            x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction insertNewTransaction(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Transaction" element
             */
            x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction addNewTransaction();
            
            /**
             * Removes the ith "Transaction" element
             */
            void removeTransaction(int i);
            
            /**
             * An XML Transaction(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
             *
             * This is a complex type.
             */
            public interface Transaction extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Transaction.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB56920DEA176B941910A868497F4EE85").resolveHandle("transaction8f2belemtype");
                
                /**
                 * Gets the "TransactionID" element
                 */
                java.lang.String getTransactionID();
                
                /**
                 * Gets (as xml) the "TransactionID" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFPTTransactionID xgetTransactionID();
                
                /**
                 * Sets the "TransactionID" element
                 */
                void setTransactionID(java.lang.String transactionID);
                
                /**
                 * Sets (as xml) the "TransactionID" element
                 */
                void xsetTransactionID(x0301.oecdStandardAuditFileTaxPT1.SAFPTTransactionID transactionID);
                
                /**
                 * Gets the "Period" element
                 */
                int getPeriod();
                
                /**
                 * Gets (as xml) the "Period" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFPTAccountingPeriod xgetPeriod();
                
                /**
                 * Sets the "Period" element
                 */
                void setPeriod(int period);
                
                /**
                 * Sets (as xml) the "Period" element
                 */
                void xsetPeriod(x0301.oecdStandardAuditFileTaxPT1.SAFPTAccountingPeriod period);
                
                /**
                 * Gets the "TransactionDate" element
                 */
                java.util.Calendar getTransactionDate();
                
                /**
                 * Gets (as xml) the "TransactionDate" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFdateType xgetTransactionDate();
                
                /**
                 * Sets the "TransactionDate" element
                 */
                void setTransactionDate(java.util.Calendar transactionDate);
                
                /**
                 * Sets (as xml) the "TransactionDate" element
                 */
                void xsetTransactionDate(x0301.oecdStandardAuditFileTaxPT1.SAFdateType transactionDate);
                
                /**
                 * Gets the "SourceID" element
                 */
                java.lang.String getSourceID();
                
                /**
                 * Gets (as xml) the "SourceID" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetSourceID();
                
                /**
                 * Sets the "SourceID" element
                 */
                void setSourceID(java.lang.String sourceID);
                
                /**
                 * Sets (as xml) the "SourceID" element
                 */
                void xsetSourceID(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car sourceID);
                
                /**
                 * Gets the "Description" element
                 */
                java.lang.String getDescription();
                
                /**
                 * Gets (as xml) the "Description" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car xgetDescription();
                
                /**
                 * Sets the "Description" element
                 */
                void setDescription(java.lang.String description);
                
                /**
                 * Sets (as xml) the "Description" element
                 */
                void xsetDescription(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car description);
                
                /**
                 * Gets the "DocArchivalNumber" element
                 */
                java.lang.String getDocArchivalNumber();
                
                /**
                 * Gets (as xml) the "DocArchivalNumber" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFTPTDocArchivalNumber xgetDocArchivalNumber();
                
                /**
                 * Sets the "DocArchivalNumber" element
                 */
                void setDocArchivalNumber(java.lang.String docArchivalNumber);
                
                /**
                 * Sets (as xml) the "DocArchivalNumber" element
                 */
                void xsetDocArchivalNumber(x0301.oecdStandardAuditFileTaxPT1.SAFTPTDocArchivalNumber docArchivalNumber);
                
                /**
                 * Gets the "TransactionType" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.TransactionTypeDocument.TransactionType.Enum getTransactionType();
                
                /**
                 * Gets (as xml) the "TransactionType" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.TransactionTypeDocument.TransactionType xgetTransactionType();
                
                /**
                 * Sets the "TransactionType" element
                 */
                void setTransactionType(x0301.oecdStandardAuditFileTaxPT1.TransactionTypeDocument.TransactionType.Enum transactionType);
                
                /**
                 * Sets (as xml) the "TransactionType" element
                 */
                void xsetTransactionType(x0301.oecdStandardAuditFileTaxPT1.TransactionTypeDocument.TransactionType transactionType);
                
                /**
                 * Gets the "GLPostingDate" element
                 */
                java.util.Calendar getGLPostingDate();
                
                /**
                 * Gets (as xml) the "GLPostingDate" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType xgetGLPostingDate();
                
                /**
                 * Sets the "GLPostingDate" element
                 */
                void setGLPostingDate(java.util.Calendar glPostingDate);
                
                /**
                 * Sets (as xml) the "GLPostingDate" element
                 */
                void xsetGLPostingDate(x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType glPostingDate);
                
                /**
                 * Gets the "CustomerID" element
                 */
                java.lang.String getCustomerID();
                
                /**
                 * Gets (as xml) the "CustomerID" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetCustomerID();
                
                /**
                 * True if has "CustomerID" element
                 */
                boolean isSetCustomerID();
                
                /**
                 * Sets the "CustomerID" element
                 */
                void setCustomerID(java.lang.String customerID);
                
                /**
                 * Sets (as xml) the "CustomerID" element
                 */
                void xsetCustomerID(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car customerID);
                
                /**
                 * Unsets the "CustomerID" element
                 */
                void unsetCustomerID();
                
                /**
                 * Gets the "SupplierID" element
                 */
                java.lang.String getSupplierID();
                
                /**
                 * Gets (as xml) the "SupplierID" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetSupplierID();
                
                /**
                 * True if has "SupplierID" element
                 */
                boolean isSetSupplierID();
                
                /**
                 * Sets the "SupplierID" element
                 */
                void setSupplierID(java.lang.String supplierID);
                
                /**
                 * Sets (as xml) the "SupplierID" element
                 */
                void xsetSupplierID(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car supplierID);
                
                /**
                 * Unsets the "SupplierID" element
                 */
                void unsetSupplierID();
                
                /**
                 * Gets a List of "Line" elements
                 */
                java.util.List<x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction.Line> getLineList();
                
                /**
                 * Gets array of all "Line" elements
                 * @deprecated
                 */
                @Deprecated
                x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction.Line[] getLineArray();
                
                /**
                 * Gets ith "Line" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction.Line getLineArray(int i);
                
                /**
                 * Returns number of "Line" element
                 */
                int sizeOfLineArray();
                
                /**
                 * Sets array of all "Line" element
                 */
                void setLineArray(x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction.Line[] lineArray);
                
                /**
                 * Sets ith "Line" element
                 */
                void setLineArray(int i, x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction.Line line);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "Line" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction.Line insertNewLine(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "Line" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction.Line addNewLine();
                
                /**
                 * Removes the ith "Line" element
                 */
                void removeLine(int i);
                
                /**
                 * An XML Line(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
                 *
                 * This is a complex type.
                 */
                public interface Line extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Line.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB56920DEA176B941910A868497F4EE85").resolveHandle("line0fdbelemtype");
                    
                    /**
                     * Gets the "RecordID" element
                     */
                    java.lang.String getRecordID();
                    
                    /**
                     * Gets (as xml) the "RecordID" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetRecordID();
                    
                    /**
                     * Sets the "RecordID" element
                     */
                    void setRecordID(java.lang.String recordID);
                    
                    /**
                     * Sets (as xml) the "RecordID" element
                     */
                    void xsetRecordID(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car recordID);
                    
                    /**
                     * Gets the "AccountID" element
                     */
                    java.lang.String getAccountID();
                    
                    /**
                     * Gets (as xml) the "AccountID" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID xgetAccountID();
                    
                    /**
                     * Sets the "AccountID" element
                     */
                    void setAccountID(java.lang.String accountID);
                    
                    /**
                     * Sets (as xml) the "AccountID" element
                     */
                    void xsetAccountID(x0301.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID accountID);
                    
                    /**
                     * Gets the "SourceDocumentID" element
                     */
                    java.lang.String getSourceDocumentID();
                    
                    /**
                     * Gets (as xml) the "SourceDocumentID" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetSourceDocumentID();
                    
                    /**
                     * True if has "SourceDocumentID" element
                     */
                    boolean isSetSourceDocumentID();
                    
                    /**
                     * Sets the "SourceDocumentID" element
                     */
                    void setSourceDocumentID(java.lang.String sourceDocumentID);
                    
                    /**
                     * Sets (as xml) the "SourceDocumentID" element
                     */
                    void xsetSourceDocumentID(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car sourceDocumentID);
                    
                    /**
                     * Unsets the "SourceDocumentID" element
                     */
                    void unsetSourceDocumentID();
                    
                    /**
                     * Gets the "SystemEntryDate" element
                     */
                    java.util.Calendar getSystemEntryDate();
                    
                    /**
                     * Gets (as xml) the "SystemEntryDate" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType xgetSystemEntryDate();
                    
                    /**
                     * Sets the "SystemEntryDate" element
                     */
                    void setSystemEntryDate(java.util.Calendar systemEntryDate);
                    
                    /**
                     * Sets (as xml) the "SystemEntryDate" element
                     */
                    void xsetSystemEntryDate(x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType systemEntryDate);
                    
                    /**
                     * Gets the "Description" element
                     */
                    java.lang.String getDescription();
                    
                    /**
                     * Gets (as xml) the "Description" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car xgetDescription();
                    
                    /**
                     * Sets the "Description" element
                     */
                    void setDescription(java.lang.String description);
                    
                    /**
                     * Sets (as xml) the "Description" element
                     */
                    void xsetDescription(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car description);
                    
                    /**
                     * Gets the "DebitAmount" element
                     */
                    java.math.BigDecimal getDebitAmount();
                    
                    /**
                     * Gets (as xml) the "DebitAmount" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetDebitAmount();
                    
                    /**
                     * True if has "DebitAmount" element
                     */
                    boolean isSetDebitAmount();
                    
                    /**
                     * Sets the "DebitAmount" element
                     */
                    void setDebitAmount(java.math.BigDecimal debitAmount);
                    
                    /**
                     * Sets (as xml) the "DebitAmount" element
                     */
                    void xsetDebitAmount(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType debitAmount);
                    
                    /**
                     * Unsets the "DebitAmount" element
                     */
                    void unsetDebitAmount();
                    
                    /**
                     * Gets the "CreditAmount" element
                     */
                    java.math.BigDecimal getCreditAmount();
                    
                    /**
                     * Gets (as xml) the "CreditAmount" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetCreditAmount();
                    
                    /**
                     * True if has "CreditAmount" element
                     */
                    boolean isSetCreditAmount();
                    
                    /**
                     * Sets the "CreditAmount" element
                     */
                    void setCreditAmount(java.math.BigDecimal creditAmount);
                    
                    /**
                     * Sets (as xml) the "CreditAmount" element
                     */
                    void xsetCreditAmount(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType creditAmount);
                    
                    /**
                     * Unsets the "CreditAmount" element
                     */
                    void unsetCreditAmount();
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction.Line newInstance() {
                        return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction.Line) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction.Line newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction.Line) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction newInstance() {
                      return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal.Transaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal newInstance() {
                  return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries.Journal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries newInstance() {
              return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument newInstance() {
          return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
