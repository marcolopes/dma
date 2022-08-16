/*
 * An XML document type.
 * Localname: TaxTableEntry
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1;


/**
 * A document containing one TaxTableEntry(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public interface TaxTableEntryDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TaxTableEntryDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25593249777A7B590168EB7C07CF83EB").resolveHandle("taxtableentrya576doctype");
    
    /**
     * Gets the "TaxTableEntry" element
     */
    x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument.TaxTableEntry getTaxTableEntry();
    
    /**
     * Sets the "TaxTableEntry" element
     */
    void setTaxTableEntry(x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument.TaxTableEntry taxTableEntry);
    
    /**
     * Appends and returns a new empty "TaxTableEntry" element
     */
    x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument.TaxTableEntry addNewTaxTableEntry();
    
    /**
     * An XML TaxTableEntry(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
     *
     * This is a complex type.
     */
    public interface TaxTableEntry extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TaxTableEntry.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25593249777A7B590168EB7C07CF83EB").resolveHandle("taxtableentry8b51elemtype");
        
        /**
         * Gets the "TaxType" element
         */
        x0401.oecdStandardAuditFileTaxPT1.TaxTypeDocument.TaxType.Enum getTaxType();
        
        /**
         * Gets (as xml) the "TaxType" element
         */
        x0401.oecdStandardAuditFileTaxPT1.TaxTypeDocument.TaxType xgetTaxType();
        
        /**
         * Sets the "TaxType" element
         */
        void setTaxType(x0401.oecdStandardAuditFileTaxPT1.TaxTypeDocument.TaxType.Enum taxType);
        
        /**
         * Sets (as xml) the "TaxType" element
         */
        void xsetTaxType(x0401.oecdStandardAuditFileTaxPT1.TaxTypeDocument.TaxType taxType);
        
        /**
         * Gets the "TaxCountryRegion" element
         */
        java.lang.String getTaxCountryRegion();
        
        /**
         * Gets (as xml) the "TaxCountryRegion" element
         */
        x0401.oecdStandardAuditFileTaxPT1.TaxCountryRegionDocument.TaxCountryRegion xgetTaxCountryRegion();
        
        /**
         * Sets the "TaxCountryRegion" element
         */
        void setTaxCountryRegion(java.lang.String taxCountryRegion);
        
        /**
         * Sets (as xml) the "TaxCountryRegion" element
         */
        void xsetTaxCountryRegion(x0401.oecdStandardAuditFileTaxPT1.TaxCountryRegionDocument.TaxCountryRegion taxCountryRegion);
        
        /**
         * Gets the "TaxCode" element
         */
        java.lang.String getTaxCode();
        
        /**
         * Gets (as xml) the "TaxCode" element
         */
        x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryTaxCode xgetTaxCode();
        
        /**
         * Sets the "TaxCode" element
         */
        void setTaxCode(java.lang.String taxCode);
        
        /**
         * Sets (as xml) the "TaxCode" element
         */
        void xsetTaxCode(x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryTaxCode taxCode);
        
        /**
         * Gets the "Description" element
         */
        java.lang.String getDescription();
        
        /**
         * Gets (as xml) the "Description" element
         */
        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax255Car xgetDescription();
        
        /**
         * Sets the "Description" element
         */
        void setDescription(java.lang.String description);
        
        /**
         * Sets (as xml) the "Description" element
         */
        void xsetDescription(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax255Car description);
        
        /**
         * Gets the "TaxExpirationDate" element
         */
        java.util.Calendar getTaxExpirationDate();
        
        /**
         * Gets (as xml) the "TaxExpirationDate" element
         */
        x0401.oecdStandardAuditFileTaxPT1.SAFdateType xgetTaxExpirationDate();
        
        /**
         * True if has "TaxExpirationDate" element
         */
        boolean isSetTaxExpirationDate();
        
        /**
         * Sets the "TaxExpirationDate" element
         */
        void setTaxExpirationDate(java.util.Calendar taxExpirationDate);
        
        /**
         * Sets (as xml) the "TaxExpirationDate" element
         */
        void xsetTaxExpirationDate(x0401.oecdStandardAuditFileTaxPT1.SAFdateType taxExpirationDate);
        
        /**
         * Unsets the "TaxExpirationDate" element
         */
        void unsetTaxExpirationDate();
        
        /**
         * Gets the "TaxPercentage" element
         */
        java.math.BigDecimal getTaxPercentage();
        
        /**
         * Gets (as xml) the "TaxPercentage" element
         */
        x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType xgetTaxPercentage();
        
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
        void xsetTaxPercentage(x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType taxPercentage);
        
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
        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetTaxAmount();
        
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
        void xsetTaxAmount(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType taxAmount);
        
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
            public static x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument.TaxTableEntry newInstance() {
              return (x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument.TaxTableEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument.TaxTableEntry newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument.TaxTableEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument newInstance() {
          return (x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0401.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
