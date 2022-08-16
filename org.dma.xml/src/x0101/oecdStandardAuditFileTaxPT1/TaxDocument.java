/*
 * An XML document type.
 * Localname: Tax
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.01_01
 * Java type: x0101.oecdStandardAuditFileTaxPT1.TaxDocument
 *
 * Automatically generated - do not modify.
 */
package x0101.oecdStandardAuditFileTaxPT1;


/**
 * A document containing one Tax(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01) element.
 *
 * This is a complex type.
 */
public interface TaxDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TaxDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD333BD87CA6FBD44E91365563B1F8A20").resolveHandle("taxa275doctype");
    
    /**
     * Gets the "Tax" element
     */
    x0101.oecdStandardAuditFileTaxPT1.TaxDocument.Tax getTax();
    
    /**
     * Sets the "Tax" element
     */
    void setTax(x0101.oecdStandardAuditFileTaxPT1.TaxDocument.Tax tax);
    
    /**
     * Appends and returns a new empty "Tax" element
     */
    x0101.oecdStandardAuditFileTaxPT1.TaxDocument.Tax addNewTax();
    
    /**
     * An XML Tax(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01).
     *
     * This is a complex type.
     */
    public interface Tax extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Tax.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD333BD87CA6FBD44E91365563B1F8A20").resolveHandle("tax906celemtype");
        
        /**
         * Gets the "TaxType" element
         */
        x0101.oecdStandardAuditFileTaxPT1.TaxTypeDocument.TaxType.Enum getTaxType();
        
        /**
         * Gets (as xml) the "TaxType" element
         */
        x0101.oecdStandardAuditFileTaxPT1.TaxTypeDocument.TaxType xgetTaxType();
        
        /**
         * Sets the "TaxType" element
         */
        void setTaxType(x0101.oecdStandardAuditFileTaxPT1.TaxTypeDocument.TaxType.Enum taxType);
        
        /**
         * Sets (as xml) the "TaxType" element
         */
        void xsetTaxType(x0101.oecdStandardAuditFileTaxPT1.TaxTypeDocument.TaxType taxType);
        
        /**
         * Gets the "TaxCountryRegion" element
         */
        java.lang.String getTaxCountryRegion();
        
        /**
         * Gets (as xml) the "TaxCountryRegion" element
         */
        x0101.oecdStandardAuditFileTaxPT1.TaxCountryRegionDocument.TaxCountryRegion xgetTaxCountryRegion();
        
        /**
         * Sets the "TaxCountryRegion" element
         */
        void setTaxCountryRegion(java.lang.String taxCountryRegion);
        
        /**
         * Sets (as xml) the "TaxCountryRegion" element
         */
        void xsetTaxCountryRegion(x0101.oecdStandardAuditFileTaxPT1.TaxCountryRegionDocument.TaxCountryRegion taxCountryRegion);
        
        /**
         * Gets the "TaxCode" element
         */
        java.lang.String getTaxCode();
        
        /**
         * Gets (as xml) the "TaxCode" element
         */
        x0101.oecdStandardAuditFileTaxPT1.TaxCodeDocument.TaxCode xgetTaxCode();
        
        /**
         * Sets the "TaxCode" element
         */
        void setTaxCode(java.lang.String taxCode);
        
        /**
         * Sets (as xml) the "TaxCode" element
         */
        void xsetTaxCode(x0101.oecdStandardAuditFileTaxPT1.TaxCodeDocument.TaxCode taxCode);
        
        /**
         * Gets the "TaxPercentage" element
         */
        java.math.BigDecimal getTaxPercentage();
        
        /**
         * Gets (as xml) the "TaxPercentage" element
         */
        x0101.oecdStandardAuditFileTaxPT1.SAFdecimalType xgetTaxPercentage();
        
        /**
         * True if has "TaxPercentage" element
         */
        boolean isSetTaxPercentage();
        
        /**
         * Sets the "TaxPercentage" element
         */
        void setTaxPercentage(java.math.BigDecimal taxPercentage);
        
        /**
         * Sets (as xml) the "TaxPercentage" element
         */
        void xsetTaxPercentage(x0101.oecdStandardAuditFileTaxPT1.SAFdecimalType taxPercentage);
        
        /**
         * Unsets the "TaxPercentage" element
         */
        void unsetTaxPercentage();
        
        /**
         * Gets the "TaxAmount" element
         */
        java.math.BigDecimal getTaxAmount();
        
        /**
         * Gets (as xml) the "TaxAmount" element
         */
        x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetTaxAmount();
        
        /**
         * True if has "TaxAmount" element
         */
        boolean isSetTaxAmount();
        
        /**
         * Sets the "TaxAmount" element
         */
        void setTaxAmount(java.math.BigDecimal taxAmount);
        
        /**
         * Sets (as xml) the "TaxAmount" element
         */
        void xsetTaxAmount(x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType taxAmount);
        
        /**
         * Unsets the "TaxAmount" element
         */
        void unsetTaxAmount();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static x0101.oecdStandardAuditFileTaxPT1.TaxDocument.Tax newInstance() {
              return (x0101.oecdStandardAuditFileTaxPT1.TaxDocument.Tax) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static x0101.oecdStandardAuditFileTaxPT1.TaxDocument.Tax newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (x0101.oecdStandardAuditFileTaxPT1.TaxDocument.Tax) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0101.oecdStandardAuditFileTaxPT1.TaxDocument newInstance() {
          return (x0101.oecdStandardAuditFileTaxPT1.TaxDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.TaxDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0101.oecdStandardAuditFileTaxPT1.TaxDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0101.oecdStandardAuditFileTaxPT1.TaxDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0101.oecdStandardAuditFileTaxPT1.TaxDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.TaxDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0101.oecdStandardAuditFileTaxPT1.TaxDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0101.oecdStandardAuditFileTaxPT1.TaxDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0101.oecdStandardAuditFileTaxPT1.TaxDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.TaxDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0101.oecdStandardAuditFileTaxPT1.TaxDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.TaxDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0101.oecdStandardAuditFileTaxPT1.TaxDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.TaxDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0101.oecdStandardAuditFileTaxPT1.TaxDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.TaxDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0101.oecdStandardAuditFileTaxPT1.TaxDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.TaxDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0101.oecdStandardAuditFileTaxPT1.TaxDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.TaxDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0101.oecdStandardAuditFileTaxPT1.TaxDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.TaxDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0101.oecdStandardAuditFileTaxPT1.TaxDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.TaxDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0101.oecdStandardAuditFileTaxPT1.TaxDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.TaxDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0101.oecdStandardAuditFileTaxPT1.TaxDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.TaxDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0101.oecdStandardAuditFileTaxPT1.TaxDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.TaxDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0101.oecdStandardAuditFileTaxPT1.TaxDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0101.oecdStandardAuditFileTaxPT1.TaxDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0101.oecdStandardAuditFileTaxPT1.TaxDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0101.oecdStandardAuditFileTaxPT1.TaxDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0101.oecdStandardAuditFileTaxPT1.TaxDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
