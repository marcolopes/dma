/*
 * An XML document type.
 * Localname: Product
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.01_01
 * Java type: x0101.oecdStandardAuditFileTaxPT1.ProductDocument
 *
 * Automatically generated - do not modify.
 */
package x0101.oecdStandardAuditFileTaxPT1;


/**
 * A document containing one Product(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01) element.
 *
 * This is a complex type.
 */
public interface ProductDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProductDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD333BD87CA6FBD44E91365563B1F8A20").resolveHandle("product7f39doctype");
    
    /**
     * Gets the "Product" element
     */
    x0101.oecdStandardAuditFileTaxPT1.ProductDocument.Product getProduct();
    
    /**
     * Sets the "Product" element
     */
    void setProduct(x0101.oecdStandardAuditFileTaxPT1.ProductDocument.Product product);
    
    /**
     * Appends and returns a new empty "Product" element
     */
    x0101.oecdStandardAuditFileTaxPT1.ProductDocument.Product addNewProduct();
    
    /**
     * An XML Product(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01).
     *
     * This is a complex type.
     */
    public interface Product extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Product.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD333BD87CA6FBD44E91365563B1F8A20").resolveHandle("producte8f4elemtype");
        
        /**
         * Gets the "ProductType" element
         */
        x0101.oecdStandardAuditFileTaxPT1.ProductTypeDocument.ProductType.Enum getProductType();
        
        /**
         * Gets (as xml) the "ProductType" element
         */
        x0101.oecdStandardAuditFileTaxPT1.ProductTypeDocument.ProductType xgetProductType();
        
        /**
         * Sets the "ProductType" element
         */
        void setProductType(x0101.oecdStandardAuditFileTaxPT1.ProductTypeDocument.ProductType.Enum productType);
        
        /**
         * Sets (as xml) the "ProductType" element
         */
        void xsetProductType(x0101.oecdStandardAuditFileTaxPT1.ProductTypeDocument.ProductType productType);
        
        /**
         * Gets the "ProductCode" element
         */
        java.lang.String getProductCode();
        
        /**
         * Gets (as xml) the "ProductCode" element
         */
        x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetProductCode();
        
        /**
         * Sets the "ProductCode" element
         */
        void setProductCode(java.lang.String productCode);
        
        /**
         * Sets (as xml) the "ProductCode" element
         */
        void xsetProductCode(x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car productCode);
        
        /**
         * Gets the "ProductGroup" element
         */
        java.lang.String getProductGroup();
        
        /**
         * Gets (as xml) the "ProductGroup" element
         */
        x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car xgetProductGroup();
        
        /**
         * True if has "ProductGroup" element
         */
        boolean isSetProductGroup();
        
        /**
         * Sets the "ProductGroup" element
         */
        void setProductGroup(java.lang.String productGroup);
        
        /**
         * Sets (as xml) the "ProductGroup" element
         */
        void xsetProductGroup(x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car productGroup);
        
        /**
         * Unsets the "ProductGroup" element
         */
        void unsetProductGroup();
        
        /**
         * Gets the "ProductDescription" element
         */
        java.lang.String getProductDescription();
        
        /**
         * Gets (as xml) the "ProductDescription" element
         */
        x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car xgetProductDescription();
        
        /**
         * Sets the "ProductDescription" element
         */
        void setProductDescription(java.lang.String productDescription);
        
        /**
         * Sets (as xml) the "ProductDescription" element
         */
        void xsetProductDescription(x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car productDescription);
        
        /**
         * Gets the "ProductNumberCode" element
         */
        java.lang.String getProductNumberCode();
        
        /**
         * Gets (as xml) the "ProductNumberCode" element
         */
        x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car xgetProductNumberCode();
        
        /**
         * Sets the "ProductNumberCode" element
         */
        void setProductNumberCode(java.lang.String productNumberCode);
        
        /**
         * Sets (as xml) the "ProductNumberCode" element
         */
        void xsetProductNumberCode(x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car productNumberCode);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static x0101.oecdStandardAuditFileTaxPT1.ProductDocument.Product newInstance() {
              return (x0101.oecdStandardAuditFileTaxPT1.ProductDocument.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static x0101.oecdStandardAuditFileTaxPT1.ProductDocument.Product newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (x0101.oecdStandardAuditFileTaxPT1.ProductDocument.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0101.oecdStandardAuditFileTaxPT1.ProductDocument newInstance() {
          return (x0101.oecdStandardAuditFileTaxPT1.ProductDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.ProductDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0101.oecdStandardAuditFileTaxPT1.ProductDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0101.oecdStandardAuditFileTaxPT1.ProductDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0101.oecdStandardAuditFileTaxPT1.ProductDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.ProductDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0101.oecdStandardAuditFileTaxPT1.ProductDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0101.oecdStandardAuditFileTaxPT1.ProductDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0101.oecdStandardAuditFileTaxPT1.ProductDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.ProductDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0101.oecdStandardAuditFileTaxPT1.ProductDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.ProductDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0101.oecdStandardAuditFileTaxPT1.ProductDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.ProductDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0101.oecdStandardAuditFileTaxPT1.ProductDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.ProductDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0101.oecdStandardAuditFileTaxPT1.ProductDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.ProductDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0101.oecdStandardAuditFileTaxPT1.ProductDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.ProductDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0101.oecdStandardAuditFileTaxPT1.ProductDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.ProductDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0101.oecdStandardAuditFileTaxPT1.ProductDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.ProductDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0101.oecdStandardAuditFileTaxPT1.ProductDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.ProductDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0101.oecdStandardAuditFileTaxPT1.ProductDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.ProductDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0101.oecdStandardAuditFileTaxPT1.ProductDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.ProductDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0101.oecdStandardAuditFileTaxPT1.ProductDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0101.oecdStandardAuditFileTaxPT1.ProductDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0101.oecdStandardAuditFileTaxPT1.ProductDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0101.oecdStandardAuditFileTaxPT1.ProductDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0101.oecdStandardAuditFileTaxPT1.ProductDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
