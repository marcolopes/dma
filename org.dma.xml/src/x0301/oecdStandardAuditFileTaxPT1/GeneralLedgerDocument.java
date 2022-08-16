/*
 * An XML document type.
 * Localname: GeneralLedger
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.03_01
 * Java type: x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument
 *
 * Automatically generated - do not modify.
 */
package x0301.oecdStandardAuditFileTaxPT1;


/**
 * A document containing one GeneralLedger(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01) element.
 *
 * This is a complex type.
 */
public interface GeneralLedgerDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GeneralLedgerDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB56920DEA176B941910A868497F4EE85").resolveHandle("generalledgerabb9doctype");
    
    /**
     * Gets the "GeneralLedger" element
     */
    x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger getGeneralLedger();
    
    /**
     * Sets the "GeneralLedger" element
     */
    void setGeneralLedger(x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger generalLedger);
    
    /**
     * Appends and returns a new empty "GeneralLedger" element
     */
    x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger addNewGeneralLedger();
    
    /**
     * An XML GeneralLedger(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
     *
     * This is a complex type.
     */
    public interface GeneralLedger extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GeneralLedger.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB56920DEA176B941910A868497F4EE85").resolveHandle("generalledger8836elemtype");
        
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
         * Gets the "AccountDescription" element
         */
        java.lang.String getAccountDescription();
        
        /**
         * Gets (as xml) the "AccountDescription" element
         */
        x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car xgetAccountDescription();
        
        /**
         * Sets the "AccountDescription" element
         */
        void setAccountDescription(java.lang.String accountDescription);
        
        /**
         * Sets (as xml) the "AccountDescription" element
         */
        void xsetAccountDescription(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car accountDescription);
        
        /**
         * Gets the "OpeningDebitBalance" element
         */
        java.math.BigDecimal getOpeningDebitBalance();
        
        /**
         * Gets (as xml) the "OpeningDebitBalance" element
         */
        x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetOpeningDebitBalance();
        
        /**
         * Sets the "OpeningDebitBalance" element
         */
        void setOpeningDebitBalance(java.math.BigDecimal openingDebitBalance);
        
        /**
         * Sets (as xml) the "OpeningDebitBalance" element
         */
        void xsetOpeningDebitBalance(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType openingDebitBalance);
        
        /**
         * Gets the "OpeningCreditBalance" element
         */
        java.math.BigDecimal getOpeningCreditBalance();
        
        /**
         * Gets (as xml) the "OpeningCreditBalance" element
         */
        x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetOpeningCreditBalance();
        
        /**
         * Sets the "OpeningCreditBalance" element
         */
        void setOpeningCreditBalance(java.math.BigDecimal openingCreditBalance);
        
        /**
         * Sets (as xml) the "OpeningCreditBalance" element
         */
        void xsetOpeningCreditBalance(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType openingCreditBalance);
        
        /**
         * Gets the "ClosingDebitBalance" element
         */
        java.math.BigDecimal getClosingDebitBalance();
        
        /**
         * Gets (as xml) the "ClosingDebitBalance" element
         */
        x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetClosingDebitBalance();
        
        /**
         * Sets the "ClosingDebitBalance" element
         */
        void setClosingDebitBalance(java.math.BigDecimal closingDebitBalance);
        
        /**
         * Sets (as xml) the "ClosingDebitBalance" element
         */
        void xsetClosingDebitBalance(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType closingDebitBalance);
        
        /**
         * Gets the "ClosingCreditBalance" element
         */
        java.math.BigDecimal getClosingCreditBalance();
        
        /**
         * Gets (as xml) the "ClosingCreditBalance" element
         */
        x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetClosingCreditBalance();
        
        /**
         * Sets the "ClosingCreditBalance" element
         */
        void setClosingCreditBalance(java.math.BigDecimal closingCreditBalance);
        
        /**
         * Sets (as xml) the "ClosingCreditBalance" element
         */
        void xsetClosingCreditBalance(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType closingCreditBalance);
        
        /**
         * Gets the "GroupingCategory" element
         */
        x0301.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument.GroupingCategory.Enum getGroupingCategory();
        
        /**
         * Gets (as xml) the "GroupingCategory" element
         */
        x0301.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument.GroupingCategory xgetGroupingCategory();
        
        /**
         * Sets the "GroupingCategory" element
         */
        void setGroupingCategory(x0301.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument.GroupingCategory.Enum groupingCategory);
        
        /**
         * Sets (as xml) the "GroupingCategory" element
         */
        void xsetGroupingCategory(x0301.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument.GroupingCategory groupingCategory);
        
        /**
         * Gets the "GroupingCode" element
         */
        java.lang.String getGroupingCode();
        
        /**
         * Gets (as xml) the "GroupingCode" element
         */
        x0301.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID xgetGroupingCode();
        
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
        void xsetGroupingCode(x0301.oecdStandardAuditFileTaxPT1.SAFPTGLAccountID groupingCode);
        
        /**
         * Unsets the "GroupingCode" element
         */
        void unsetGroupingCode();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger newInstance() {
              return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument newInstance() {
          return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0301.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
