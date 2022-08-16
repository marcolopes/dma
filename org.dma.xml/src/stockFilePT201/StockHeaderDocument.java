/*
 * An XML document type.
 * Localname: StockHeader
 * Namespace: urn:StockFile:PT_2_01
 * Java type: stockFilePT201.StockHeaderDocument
 *
 * Automatically generated - do not modify.
 */
package stockFilePT201;


/**
 * A document containing one StockHeader(@urn:StockFile:PT_2_01) element.
 *
 * This is a complex type.
 */
public interface StockHeaderDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StockHeaderDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1FEADA075163D98187D9DF3A0C311B79").resolveHandle("stockheadera622doctype");
    
    /**
     * Gets the "StockHeader" element
     */
    stockFilePT201.StockHeaderDocument.StockHeader getStockHeader();
    
    /**
     * Sets the "StockHeader" element
     */
    void setStockHeader(stockFilePT201.StockHeaderDocument.StockHeader stockHeader);
    
    /**
     * Appends and returns a new empty "StockHeader" element
     */
    stockFilePT201.StockHeaderDocument.StockHeader addNewStockHeader();
    
    /**
     * An XML StockHeader(@urn:StockFile:PT_2_01).
     *
     * This is a complex type.
     */
    public interface StockHeader extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StockHeader.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1FEADA075163D98187D9DF3A0C311B79").resolveHandle("stockheaderb831elemtype");
        
        /**
         * Gets the "FileVersion" element
         */
        java.lang.String getFileVersion();
        
        /**
         * Gets (as xml) the "FileVersion" element
         */
        stockFilePT201.FileVersionDocument.FileVersion xgetFileVersion();
        
        /**
         * Sets the "FileVersion" element
         */
        void setFileVersion(java.lang.String fileVersion);
        
        /**
         * Sets (as xml) the "FileVersion" element
         */
        void xsetFileVersion(stockFilePT201.FileVersionDocument.FileVersion fileVersion);
        
        /**
         * Gets the "TaxRegistrationNumber" element
         */
        int getTaxRegistrationNumber();
        
        /**
         * Gets (as xml) the "TaxRegistrationNumber" element
         */
        stockFilePT201.SAFPTPortugueseVatNumber xgetTaxRegistrationNumber();
        
        /**
         * Sets the "TaxRegistrationNumber" element
         */
        void setTaxRegistrationNumber(int taxRegistrationNumber);
        
        /**
         * Sets (as xml) the "TaxRegistrationNumber" element
         */
        void xsetTaxRegistrationNumber(stockFilePT201.SAFPTPortugueseVatNumber taxRegistrationNumber);
        
        /**
         * Gets the "FiscalYear" element
         */
        int getFiscalYear();
        
        /**
         * Gets (as xml) the "FiscalYear" element
         */
        stockFilePT201.FiscalYearDocument.FiscalYear xgetFiscalYear();
        
        /**
         * Sets the "FiscalYear" element
         */
        void setFiscalYear(int fiscalYear);
        
        /**
         * Sets (as xml) the "FiscalYear" element
         */
        void xsetFiscalYear(stockFilePT201.FiscalYearDocument.FiscalYear fiscalYear);
        
        /**
         * Gets the "EndDate" element
         */
        java.util.Calendar getEndDate();
        
        /**
         * Gets (as xml) the "EndDate" element
         */
        stockFilePT201.SAFPTDateSpan xgetEndDate();
        
        /**
         * Sets the "EndDate" element
         */
        void setEndDate(java.util.Calendar endDate);
        
        /**
         * Sets (as xml) the "EndDate" element
         */
        void xsetEndDate(stockFilePT201.SAFPTDateSpan endDate);
        
        /**
         * Gets the "NoStock" element
         */
        boolean getNoStock();
        
        /**
         * Gets (as xml) the "NoStock" element
         */
        org.apache.xmlbeans.XmlBoolean xgetNoStock();
        
        /**
         * Sets the "NoStock" element
         */
        void setNoStock(boolean noStock);
        
        /**
         * Sets (as xml) the "NoStock" element
         */
        void xsetNoStock(org.apache.xmlbeans.XmlBoolean noStock);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static stockFilePT201.StockHeaderDocument.StockHeader newInstance() {
              return (stockFilePT201.StockHeaderDocument.StockHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static stockFilePT201.StockHeaderDocument.StockHeader newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (stockFilePT201.StockHeaderDocument.StockHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static stockFilePT201.StockHeaderDocument newInstance() {
          return (stockFilePT201.StockHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static stockFilePT201.StockHeaderDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (stockFilePT201.StockHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static stockFilePT201.StockHeaderDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (stockFilePT201.StockHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static stockFilePT201.StockHeaderDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (stockFilePT201.StockHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static stockFilePT201.StockHeaderDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (stockFilePT201.StockHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static stockFilePT201.StockHeaderDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (stockFilePT201.StockHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static stockFilePT201.StockHeaderDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (stockFilePT201.StockHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static stockFilePT201.StockHeaderDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (stockFilePT201.StockHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static stockFilePT201.StockHeaderDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (stockFilePT201.StockHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static stockFilePT201.StockHeaderDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (stockFilePT201.StockHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static stockFilePT201.StockHeaderDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (stockFilePT201.StockHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static stockFilePT201.StockHeaderDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (stockFilePT201.StockHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static stockFilePT201.StockHeaderDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (stockFilePT201.StockHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static stockFilePT201.StockHeaderDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (stockFilePT201.StockHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static stockFilePT201.StockHeaderDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (stockFilePT201.StockHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static stockFilePT201.StockHeaderDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (stockFilePT201.StockHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static stockFilePT201.StockHeaderDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (stockFilePT201.StockHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static stockFilePT201.StockHeaderDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (stockFilePT201.StockHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
