/*
 * An XML document type.
 * Localname: Stock
 * Namespace: urn:StockFile:PT_1_01
 * Java type: stockFilePT101.StockDocument
 *
 * Automatically generated - do not modify.
 */
package stockFilePT101;


/**
 * A document containing one Stock(@urn:StockFile:PT_1_01) element.
 *
 * This is a complex type.
 */
public interface StockDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StockDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s624FBD5A08000D14904C5318DC1D35A6").resolveHandle("stock4c96doctype");
    
    /**
     * Gets the "Stock" element
     */
    stockFilePT101.StockDocument.Stock getStock();
    
    /**
     * Sets the "Stock" element
     */
    void setStock(stockFilePT101.StockDocument.Stock stock);
    
    /**
     * Appends and returns a new empty "Stock" element
     */
    stockFilePT101.StockDocument.Stock addNewStock();
    
    /**
     * An XML Stock(@urn:StockFile:PT_1_01).
     *
     * This is a complex type.
     */
    public interface Stock extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Stock.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s624FBD5A08000D14904C5318DC1D35A6").resolveHandle("stockd278elemtype");
        
        /**
         * Gets the "ProductCategory" element
         */
        stockFilePT101.ProductCategoryDocument.ProductCategory.Enum getProductCategory();
        
        /**
         * Gets (as xml) the "ProductCategory" element
         */
        stockFilePT101.ProductCategoryDocument.ProductCategory xgetProductCategory();
        
        /**
         * Sets the "ProductCategory" element
         */
        void setProductCategory(stockFilePT101.ProductCategoryDocument.ProductCategory.Enum productCategory);
        
        /**
         * Sets (as xml) the "ProductCategory" element
         */
        void xsetProductCategory(stockFilePT101.ProductCategoryDocument.ProductCategory productCategory);
        
        /**
         * Gets the "ProductCode" element
         */
        java.lang.String getProductCode();
        
        /**
         * Gets (as xml) the "ProductCode" element
         */
        stockFilePT101.SAFPTtextTypeMandatoryMax60Car xgetProductCode();
        
        /**
         * Sets the "ProductCode" element
         */
        void setProductCode(java.lang.String productCode);
        
        /**
         * Sets (as xml) the "ProductCode" element
         */
        void xsetProductCode(stockFilePT101.SAFPTtextTypeMandatoryMax60Car productCode);
        
        /**
         * Gets the "ProductDescription" element
         */
        java.lang.String getProductDescription();
        
        /**
         * Gets (as xml) the "ProductDescription" element
         */
        stockFilePT101.SAFPTtextTypeMandatoryMax200Car xgetProductDescription();
        
        /**
         * Sets the "ProductDescription" element
         */
        void setProductDescription(java.lang.String productDescription);
        
        /**
         * Sets (as xml) the "ProductDescription" element
         */
        void xsetProductDescription(stockFilePT101.SAFPTtextTypeMandatoryMax200Car productDescription);
        
        /**
         * Gets the "ProductNumberCode" element
         */
        java.lang.String getProductNumberCode();
        
        /**
         * Gets (as xml) the "ProductNumberCode" element
         */
        stockFilePT101.SAFPTtextTypeMandatoryMax60Car xgetProductNumberCode();
        
        /**
         * Sets the "ProductNumberCode" element
         */
        void setProductNumberCode(java.lang.String productNumberCode);
        
        /**
         * Sets (as xml) the "ProductNumberCode" element
         */
        void xsetProductNumberCode(stockFilePT101.SAFPTtextTypeMandatoryMax60Car productNumberCode);
        
        /**
         * Gets the "ClosingStockQuantity" element
         */
        java.math.BigDecimal getClosingStockQuantity();
        
        /**
         * Gets (as xml) the "ClosingStockQuantity" element
         */
        stockFilePT101.SAFdecimalType xgetClosingStockQuantity();
        
        /**
         * Sets the "ClosingStockQuantity" element
         */
        void setClosingStockQuantity(java.math.BigDecimal closingStockQuantity);
        
        /**
         * Sets (as xml) the "ClosingStockQuantity" element
         */
        void xsetClosingStockQuantity(stockFilePT101.SAFdecimalType closingStockQuantity);
        
        /**
         * Gets the "UnitOfMeasure" element
         */
        java.lang.String getUnitOfMeasure();
        
        /**
         * Gets (as xml) the "UnitOfMeasure" element
         */
        stockFilePT101.SAFPTtextTypeMandatoryMax20Car xgetUnitOfMeasure();
        
        /**
         * Sets the "UnitOfMeasure" element
         */
        void setUnitOfMeasure(java.lang.String unitOfMeasure);
        
        /**
         * Sets (as xml) the "UnitOfMeasure" element
         */
        void xsetUnitOfMeasure(stockFilePT101.SAFPTtextTypeMandatoryMax20Car unitOfMeasure);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static stockFilePT101.StockDocument.Stock newInstance() {
              return (stockFilePT101.StockDocument.Stock) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static stockFilePT101.StockDocument.Stock newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (stockFilePT101.StockDocument.Stock) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static stockFilePT101.StockDocument newInstance() {
          return (stockFilePT101.StockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static stockFilePT101.StockDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (stockFilePT101.StockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static stockFilePT101.StockDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (stockFilePT101.StockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static stockFilePT101.StockDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (stockFilePT101.StockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static stockFilePT101.StockDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (stockFilePT101.StockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static stockFilePT101.StockDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (stockFilePT101.StockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static stockFilePT101.StockDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (stockFilePT101.StockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static stockFilePT101.StockDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (stockFilePT101.StockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static stockFilePT101.StockDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (stockFilePT101.StockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static stockFilePT101.StockDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (stockFilePT101.StockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static stockFilePT101.StockDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (stockFilePT101.StockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static stockFilePT101.StockDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (stockFilePT101.StockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static stockFilePT101.StockDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (stockFilePT101.StockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static stockFilePT101.StockDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (stockFilePT101.StockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static stockFilePT101.StockDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (stockFilePT101.StockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static stockFilePT101.StockDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (stockFilePT101.StockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static stockFilePT101.StockDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (stockFilePT101.StockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static stockFilePT101.StockDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (stockFilePT101.StockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
