/*
 * An XML document type.
 * Localname: StockFile
 * Namespace: urn:StockFile:PT_1_01
 * Java type: stockFilePT101.StockFileDocument
 *
 * Automatically generated - do not modify.
 */
package stockFilePT101;


/**
 * A document containing one StockFile(@urn:StockFile:PT_1_01) element.
 *
 * This is a complex type.
 */
public interface StockFileDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StockFileDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s624FBD5A08000D14904C5318DC1D35A6").resolveHandle("stockfilee2b2doctype");
    
    /**
     * Gets the "StockFile" element
     */
    stockFilePT101.StockFileDocument.StockFile getStockFile();
    
    /**
     * Sets the "StockFile" element
     */
    void setStockFile(stockFilePT101.StockFileDocument.StockFile stockFile);
    
    /**
     * Appends and returns a new empty "StockFile" element
     */
    stockFilePT101.StockFileDocument.StockFile addNewStockFile();
    
    /**
     * An XML StockFile(@urn:StockFile:PT_1_01).
     *
     * This is a complex type.
     */
    public interface StockFile extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StockFile.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s624FBD5A08000D14904C5318DC1D35A6").resolveHandle("stockfile8b30elemtype");
        
        /**
         * Gets the "StockHeader" element
         */
        stockFilePT101.StockHeaderDocument.StockHeader getStockHeader();
        
        /**
         * Sets the "StockHeader" element
         */
        void setStockHeader(stockFilePT101.StockHeaderDocument.StockHeader stockHeader);
        
        /**
         * Appends and returns a new empty "StockHeader" element
         */
        stockFilePT101.StockHeaderDocument.StockHeader addNewStockHeader();
        
        /**
         * Gets a List of "Stock" elements
         */
        java.util.List<stockFilePT101.StockDocument.Stock> getStockList();
        
        /**
         * Gets array of all "Stock" elements
         * @deprecated
         */
        @Deprecated
        stockFilePT101.StockDocument.Stock[] getStockArray();
        
        /**
         * Gets ith "Stock" element
         */
        stockFilePT101.StockDocument.Stock getStockArray(int i);
        
        /**
         * Returns number of "Stock" element
         */
        int sizeOfStockArray();
        
        /**
         * Sets array of all "Stock" element
         */
        void setStockArray(stockFilePT101.StockDocument.Stock[] stockArray);
        
        /**
         * Sets ith "Stock" element
         */
        void setStockArray(int i, stockFilePT101.StockDocument.Stock stock);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Stock" element
         */
        stockFilePT101.StockDocument.Stock insertNewStock(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Stock" element
         */
        stockFilePT101.StockDocument.Stock addNewStock();
        
        /**
         * Removes the ith "Stock" element
         */
        void removeStock(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static stockFilePT101.StockFileDocument.StockFile newInstance() {
              return (stockFilePT101.StockFileDocument.StockFile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static stockFilePT101.StockFileDocument.StockFile newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (stockFilePT101.StockFileDocument.StockFile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static stockFilePT101.StockFileDocument newInstance() {
          return (stockFilePT101.StockFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static stockFilePT101.StockFileDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (stockFilePT101.StockFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static stockFilePT101.StockFileDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (stockFilePT101.StockFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static stockFilePT101.StockFileDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (stockFilePT101.StockFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static stockFilePT101.StockFileDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (stockFilePT101.StockFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static stockFilePT101.StockFileDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (stockFilePT101.StockFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static stockFilePT101.StockFileDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (stockFilePT101.StockFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static stockFilePT101.StockFileDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (stockFilePT101.StockFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static stockFilePT101.StockFileDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (stockFilePT101.StockFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static stockFilePT101.StockFileDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (stockFilePT101.StockFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static stockFilePT101.StockFileDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (stockFilePT101.StockFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static stockFilePT101.StockFileDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (stockFilePT101.StockFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static stockFilePT101.StockFileDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (stockFilePT101.StockFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static stockFilePT101.StockFileDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (stockFilePT101.StockFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static stockFilePT101.StockFileDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (stockFilePT101.StockFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static stockFilePT101.StockFileDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (stockFilePT101.StockFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static stockFilePT101.StockFileDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (stockFilePT101.StockFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static stockFilePT101.StockFileDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (stockFilePT101.StockFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
