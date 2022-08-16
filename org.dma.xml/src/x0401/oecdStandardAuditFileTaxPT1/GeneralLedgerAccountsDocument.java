/*
 * An XML document type.
 * Localname: GeneralLedgerAccounts
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1;


/**
 * A document containing one GeneralLedgerAccounts(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public interface GeneralLedgerAccountsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GeneralLedgerAccountsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25593249777A7B590168EB7C07CF83EB").resolveHandle("generalledgeraccountse09edoctype");
    
    /**
     * Gets the "GeneralLedgerAccounts" element
     */
    x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts getGeneralLedgerAccounts();
    
    /**
     * Sets the "GeneralLedgerAccounts" element
     */
    void setGeneralLedgerAccounts(x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts generalLedgerAccounts);
    
    /**
     * Appends and returns a new empty "GeneralLedgerAccounts" element
     */
    x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts addNewGeneralLedgerAccounts();
    
    /**
     * An XML GeneralLedgerAccounts(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
     *
     * This is a complex type.
     */
    public interface GeneralLedgerAccounts extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GeneralLedgerAccounts.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25593249777A7B590168EB7C07CF83EB").resolveHandle("generalledgeraccounts6da1elemtype");
        
        /**
         * Gets the "TaxonomyReference" element
         */
        x0401.oecdStandardAuditFileTaxPT1.TaxonomyReferenceDocument.TaxonomyReference.Enum getTaxonomyReference();
        
        /**
         * Gets (as xml) the "TaxonomyReference" element
         */
        x0401.oecdStandardAuditFileTaxPT1.TaxonomyReferenceDocument.TaxonomyReference xgetTaxonomyReference();
        
        /**
         * Sets the "TaxonomyReference" element
         */
        void setTaxonomyReference(x0401.oecdStandardAuditFileTaxPT1.TaxonomyReferenceDocument.TaxonomyReference.Enum taxonomyReference);
        
        /**
         * Sets (as xml) the "TaxonomyReference" element
         */
        void xsetTaxonomyReference(x0401.oecdStandardAuditFileTaxPT1.TaxonomyReferenceDocument.TaxonomyReference taxonomyReference);
        
        /**
         * Gets a List of "Account" elements
         */
        java.util.List<x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts.Account> getAccountList();
        
        /**
         * Gets array of all "Account" elements
         * @deprecated
         */
        @Deprecated
        x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts.Account[] getAccountArray();
        
        /**
         * Gets ith "Account" element
         */
        x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts.Account getAccountArray(int i);
        
        /**
         * Returns number of "Account" element
         */
        int sizeOfAccountArray();
        
        /**
         * Sets array of all "Account" element
         */
        void setAccountArray(x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts.Account[] accountArray);
        
        /**
         * Sets ith "Account" element
         */
        void setAccountArray(int i, x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts.Account account);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Account" element
         */
        x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts.Account insertNewAccount(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Account" element
         */
        x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts.Account addNewAccount();
        
        /**
         * Removes the ith "Account" element
         */
        void removeAccount(int i);
        
        /**
         * An XML Account(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
         *
         * This is a complex type.
         */
        public interface Account extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Account.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25593249777A7B590168EB7C07CF83EB").resolveHandle("account4edaelemtype");
            
            /**
             * Gets the "AccountID" element
             */
            java.lang.String getAccountID();
            
            /**
             * Gets (as xml) the "AccountID" element
             */
            x0401.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID xgetAccountID();
            
            /**
             * Sets the "AccountID" element
             */
            void setAccountID(java.lang.String accountID);
            
            /**
             * Sets (as xml) the "AccountID" element
             */
            void xsetAccountID(x0401.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID accountID);
            
            /**
             * Gets the "AccountDescription" element
             */
            java.lang.String getAccountDescription();
            
            /**
             * Gets (as xml) the "AccountDescription" element
             */
            x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car xgetAccountDescription();
            
            /**
             * Sets the "AccountDescription" element
             */
            void setAccountDescription(java.lang.String accountDescription);
            
            /**
             * Sets (as xml) the "AccountDescription" element
             */
            void xsetAccountDescription(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car accountDescription);
            
            /**
             * Gets the "OpeningDebitBalance" element
             */
            java.math.BigDecimal getOpeningDebitBalance();
            
            /**
             * Gets (as xml) the "OpeningDebitBalance" element
             */
            x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetOpeningDebitBalance();
            
            /**
             * Sets the "OpeningDebitBalance" element
             */
            void setOpeningDebitBalance(java.math.BigDecimal openingDebitBalance);
            
            /**
             * Sets (as xml) the "OpeningDebitBalance" element
             */
            void xsetOpeningDebitBalance(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType openingDebitBalance);
            
            /**
             * Gets the "OpeningCreditBalance" element
             */
            java.math.BigDecimal getOpeningCreditBalance();
            
            /**
             * Gets (as xml) the "OpeningCreditBalance" element
             */
            x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetOpeningCreditBalance();
            
            /**
             * Sets the "OpeningCreditBalance" element
             */
            void setOpeningCreditBalance(java.math.BigDecimal openingCreditBalance);
            
            /**
             * Sets (as xml) the "OpeningCreditBalance" element
             */
            void xsetOpeningCreditBalance(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType openingCreditBalance);
            
            /**
             * Gets the "ClosingDebitBalance" element
             */
            java.math.BigDecimal getClosingDebitBalance();
            
            /**
             * Gets (as xml) the "ClosingDebitBalance" element
             */
            x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetClosingDebitBalance();
            
            /**
             * Sets the "ClosingDebitBalance" element
             */
            void setClosingDebitBalance(java.math.BigDecimal closingDebitBalance);
            
            /**
             * Sets (as xml) the "ClosingDebitBalance" element
             */
            void xsetClosingDebitBalance(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType closingDebitBalance);
            
            /**
             * Gets the "ClosingCreditBalance" element
             */
            java.math.BigDecimal getClosingCreditBalance();
            
            /**
             * Gets (as xml) the "ClosingCreditBalance" element
             */
            x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetClosingCreditBalance();
            
            /**
             * Sets the "ClosingCreditBalance" element
             */
            void setClosingCreditBalance(java.math.BigDecimal closingCreditBalance);
            
            /**
             * Sets (as xml) the "ClosingCreditBalance" element
             */
            void xsetClosingCreditBalance(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType closingCreditBalance);
            
            /**
             * Gets the "GroupingCategory" element
             */
            x0401.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument.GroupingCategory.Enum getGroupingCategory();
            
            /**
             * Gets (as xml) the "GroupingCategory" element
             */
            x0401.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument.GroupingCategory xgetGroupingCategory();
            
            /**
             * Sets the "GroupingCategory" element
             */
            void setGroupingCategory(x0401.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument.GroupingCategory.Enum groupingCategory);
            
            /**
             * Sets (as xml) the "GroupingCategory" element
             */
            void xsetGroupingCategory(x0401.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument.GroupingCategory groupingCategory);
            
            /**
             * Gets the "GroupingCode" element
             */
            java.lang.String getGroupingCode();
            
            /**
             * Gets (as xml) the "GroupingCode" element
             */
            x0401.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID xgetGroupingCode();
            
            /**
             * True if has "GroupingCode" element
             */
            boolean isSetGroupingCode();
            
            /**
             * Sets the "GroupingCode" element
             */
            void setGroupingCode(java.lang.String groupingCode);
            
            /**
             * Sets (as xml) the "GroupingCode" element
             */
            void xsetGroupingCode(x0401.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID groupingCode);
            
            /**
             * Unsets the "GroupingCode" element
             */
            void unsetGroupingCode();
            
            /**
             * Gets the "TaxonomyCode" element
             */
            int getTaxonomyCode();
            
            /**
             * Gets (as xml) the "TaxonomyCode" element
             */
            x0401.oecdStandardAuditFileTaxPT1.SAFTaxonomyCode xgetTaxonomyCode();
            
            /**
             * True if has "TaxonomyCode" element
             */
            boolean isSetTaxonomyCode();
            
            /**
             * Sets the "TaxonomyCode" element
             */
            void setTaxonomyCode(int taxonomyCode);
            
            /**
             * Sets (as xml) the "TaxonomyCode" element
             */
            void xsetTaxonomyCode(x0401.oecdStandardAuditFileTaxPT1.SAFTaxonomyCode taxonomyCode);
            
            /**
             * Unsets the "TaxonomyCode" element
             */
            void unsetTaxonomyCode();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts.Account newInstance() {
                  return (x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts.Account) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts.Account newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts.Account) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts newInstance() {
              return (x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument.GeneralLedgerAccounts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument newInstance() {
          return (x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0401.oecdStandardAuditFileTaxPT1.GeneralLedgerAccountsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
