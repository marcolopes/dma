/*
 * An XML document type.
 * Localname: Header
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.02_01
 * Java type: x0201.oecdStandardAuditFileTaxPT1.HeaderDocument
 *
 * Automatically generated - do not modify.
 */
package x0201.oecdStandardAuditFileTaxPT1;


/**
 * A document containing one Header(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01) element.
 *
 * This is a complex type.
 */
public interface HeaderDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HeaderDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6807A875E02E61D8569B452CCBF2BB75").resolveHandle("header7dc8doctype");
    
    /**
     * Gets the "Header" element
     */
    x0201.oecdStandardAuditFileTaxPT1.HeaderDocument.Header getHeader();
    
    /**
     * Sets the "Header" element
     */
    void setHeader(x0201.oecdStandardAuditFileTaxPT1.HeaderDocument.Header header);
    
    /**
     * Appends and returns a new empty "Header" element
     */
    x0201.oecdStandardAuditFileTaxPT1.HeaderDocument.Header addNewHeader();
    
    /**
     * An XML Header(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01).
     *
     * This is a complex type.
     */
    public interface Header extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Header.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6807A875E02E61D8569B452CCBF2BB75").resolveHandle("header5ddfelemtype");
        
        /**
         * Gets the "AuditFileVersion" element
         */
        java.lang.String getAuditFileVersion();
        
        /**
         * Gets (as xml) the "AuditFileVersion" element
         */
        x0201.oecdStandardAuditFileTaxPT1.AuditFileVersionDocument.AuditFileVersion xgetAuditFileVersion();
        
        /**
         * Sets the "AuditFileVersion" element
         */
        void setAuditFileVersion(java.lang.String auditFileVersion);
        
        /**
         * Sets (as xml) the "AuditFileVersion" element
         */
        void xsetAuditFileVersion(x0201.oecdStandardAuditFileTaxPT1.AuditFileVersionDocument.AuditFileVersion auditFileVersion);
        
        /**
         * Gets the "CompanyID" element
         */
        java.lang.String getCompanyID();
        
        /**
         * Gets (as xml) the "CompanyID" element
         */
        x0201.oecdStandardAuditFileTaxPT1.CompanyIDDocument.CompanyID xgetCompanyID();
        
        /**
         * Sets the "CompanyID" element
         */
        void setCompanyID(java.lang.String companyID);
        
        /**
         * Sets (as xml) the "CompanyID" element
         */
        void xsetCompanyID(x0201.oecdStandardAuditFileTaxPT1.CompanyIDDocument.CompanyID companyID);
        
        /**
         * Gets the "TaxRegistrationNumber" element
         */
        int getTaxRegistrationNumber();
        
        /**
         * Gets (as xml) the "TaxRegistrationNumber" element
         */
        x0201.oecdStandardAuditFileTaxPT1.SAFPTPortugueseVatNumber xgetTaxRegistrationNumber();
        
        /**
         * Sets the "TaxRegistrationNumber" element
         */
        void setTaxRegistrationNumber(int taxRegistrationNumber);
        
        /**
         * Sets (as xml) the "TaxRegistrationNumber" element
         */
        void xsetTaxRegistrationNumber(x0201.oecdStandardAuditFileTaxPT1.SAFPTPortugueseVatNumber taxRegistrationNumber);
        
        /**
         * Gets the "TaxAccountingBasis" element
         */
        x0201.oecdStandardAuditFileTaxPT1.TaxAccountingBasisDocument.TaxAccountingBasis.Enum getTaxAccountingBasis();
        
        /**
         * Gets (as xml) the "TaxAccountingBasis" element
         */
        x0201.oecdStandardAuditFileTaxPT1.TaxAccountingBasisDocument.TaxAccountingBasis xgetTaxAccountingBasis();
        
        /**
         * Sets the "TaxAccountingBasis" element
         */
        void setTaxAccountingBasis(x0201.oecdStandardAuditFileTaxPT1.TaxAccountingBasisDocument.TaxAccountingBasis.Enum taxAccountingBasis);
        
        /**
         * Sets (as xml) the "TaxAccountingBasis" element
         */
        void xsetTaxAccountingBasis(x0201.oecdStandardAuditFileTaxPT1.TaxAccountingBasisDocument.TaxAccountingBasis taxAccountingBasis);
        
        /**
         * Gets the "CompanyName" element
         */
        java.lang.String getCompanyName();
        
        /**
         * Gets (as xml) the "CompanyName" element
         */
        x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car xgetCompanyName();
        
        /**
         * Sets the "CompanyName" element
         */
        void setCompanyName(java.lang.String companyName);
        
        /**
         * Sets (as xml) the "CompanyName" element
         */
        void xsetCompanyName(x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car companyName);
        
        /**
         * Gets the "BusinessName" element
         */
        java.lang.String getBusinessName();
        
        /**
         * Gets (as xml) the "BusinessName" element
         */
        x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car xgetBusinessName();
        
        /**
         * True if has "BusinessName" element
         */
        boolean isSetBusinessName();
        
        /**
         * Sets the "BusinessName" element
         */
        void setBusinessName(java.lang.String businessName);
        
        /**
         * Sets (as xml) the "BusinessName" element
         */
        void xsetBusinessName(x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car businessName);
        
        /**
         * Unsets the "BusinessName" element
         */
        void unsetBusinessName();
        
        /**
         * Gets the "CompanyAddress" element
         */
        x0201.oecdStandardAuditFileTaxPT1.AddressStructurePT getCompanyAddress();
        
        /**
         * Sets the "CompanyAddress" element
         */
        void setCompanyAddress(x0201.oecdStandardAuditFileTaxPT1.AddressStructurePT companyAddress);
        
        /**
         * Appends and returns a new empty "CompanyAddress" element
         */
        x0201.oecdStandardAuditFileTaxPT1.AddressStructurePT addNewCompanyAddress();
        
        /**
         * Gets the "FiscalYear" element
         */
        int getFiscalYear();
        
        /**
         * Gets (as xml) the "FiscalYear" element
         */
        x0201.oecdStandardAuditFileTaxPT1.FiscalYearDocument.FiscalYear xgetFiscalYear();
        
        /**
         * Sets the "FiscalYear" element
         */
        void setFiscalYear(int fiscalYear);
        
        /**
         * Sets (as xml) the "FiscalYear" element
         */
        void xsetFiscalYear(x0201.oecdStandardAuditFileTaxPT1.FiscalYearDocument.FiscalYear fiscalYear);
        
        /**
         * Gets the "StartDate" element
         */
        java.util.Calendar getStartDate();
        
        /**
         * Gets (as xml) the "StartDate" element
         */
        x0201.oecdStandardAuditFileTaxPT1.SAFPTDateSpan xgetStartDate();
        
        /**
         * Sets the "StartDate" element
         */
        void setStartDate(java.util.Calendar startDate);
        
        /**
         * Sets (as xml) the "StartDate" element
         */
        void xsetStartDate(x0201.oecdStandardAuditFileTaxPT1.SAFPTDateSpan startDate);
        
        /**
         * Gets the "EndDate" element
         */
        java.util.Calendar getEndDate();
        
        /**
         * Gets (as xml) the "EndDate" element
         */
        x0201.oecdStandardAuditFileTaxPT1.SAFPTDateSpan xgetEndDate();
        
        /**
         * Sets the "EndDate" element
         */
        void setEndDate(java.util.Calendar endDate);
        
        /**
         * Sets (as xml) the "EndDate" element
         */
        void xsetEndDate(x0201.oecdStandardAuditFileTaxPT1.SAFPTDateSpan endDate);
        
        /**
         * Gets the "CurrencyCode" element
         */
        org.apache.xmlbeans.XmlObject getCurrencyCode();
        
        /**
         * Sets the "CurrencyCode" element
         */
        void setCurrencyCode(org.apache.xmlbeans.XmlObject currencyCode);
        
        /**
         * Appends and returns a new empty "CurrencyCode" element
         */
        org.apache.xmlbeans.XmlObject addNewCurrencyCode();
        
        /**
         * Gets the "DateCreated" element
         */
        java.util.Calendar getDateCreated();
        
        /**
         * Gets (as xml) the "DateCreated" element
         */
        x0201.oecdStandardAuditFileTaxPT1.SAFPTDateSpan xgetDateCreated();
        
        /**
         * Sets the "DateCreated" element
         */
        void setDateCreated(java.util.Calendar dateCreated);
        
        /**
         * Sets (as xml) the "DateCreated" element
         */
        void xsetDateCreated(x0201.oecdStandardAuditFileTaxPT1.SAFPTDateSpan dateCreated);
        
        /**
         * Gets the "TaxEntity" element
         */
        java.lang.String getTaxEntity();
        
        /**
         * Gets (as xml) the "TaxEntity" element
         */
        x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car xgetTaxEntity();
        
        /**
         * Sets the "TaxEntity" element
         */
        void setTaxEntity(java.lang.String taxEntity);
        
        /**
         * Sets (as xml) the "TaxEntity" element
         */
        void xsetTaxEntity(x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car taxEntity);
        
        /**
         * Gets the "ProductCompanyTaxID" element
         */
        java.lang.String getProductCompanyTaxID();
        
        /**
         * Gets (as xml) the "ProductCompanyTaxID" element
         */
        x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car xgetProductCompanyTaxID();
        
        /**
         * Sets the "ProductCompanyTaxID" element
         */
        void setProductCompanyTaxID(java.lang.String productCompanyTaxID);
        
        /**
         * Sets (as xml) the "ProductCompanyTaxID" element
         */
        void xsetProductCompanyTaxID(x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car productCompanyTaxID);
        
        /**
         * Gets the "SoftwareCertificateNumber" element
         */
        java.math.BigInteger getSoftwareCertificateNumber();
        
        /**
         * Gets (as xml) the "SoftwareCertificateNumber" element
         */
        org.apache.xmlbeans.XmlNonNegativeInteger xgetSoftwareCertificateNumber();
        
        /**
         * Sets the "SoftwareCertificateNumber" element
         */
        void setSoftwareCertificateNumber(java.math.BigInteger softwareCertificateNumber);
        
        /**
         * Sets (as xml) the "SoftwareCertificateNumber" element
         */
        void xsetSoftwareCertificateNumber(org.apache.xmlbeans.XmlNonNegativeInteger softwareCertificateNumber);
        
        /**
         * Gets the "ProductID" element
         */
        java.lang.String getProductID();
        
        /**
         * Gets (as xml) the "ProductID" element
         */
        x0201.oecdStandardAuditFileTaxPT1.SAFPTProductID xgetProductID();
        
        /**
         * Sets the "ProductID" element
         */
        void setProductID(java.lang.String productID);
        
        /**
         * Sets (as xml) the "ProductID" element
         */
        void xsetProductID(x0201.oecdStandardAuditFileTaxPT1.SAFPTProductID productID);
        
        /**
         * Gets the "ProductVersion" element
         */
        java.lang.String getProductVersion();
        
        /**
         * Gets (as xml) the "ProductVersion" element
         */
        x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetProductVersion();
        
        /**
         * Sets the "ProductVersion" element
         */
        void setProductVersion(java.lang.String productVersion);
        
        /**
         * Sets (as xml) the "ProductVersion" element
         */
        void xsetProductVersion(x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car productVersion);
        
        /**
         * Gets the "HeaderComment" element
         */
        java.lang.String getHeaderComment();
        
        /**
         * Gets (as xml) the "HeaderComment" element
         */
        x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax255Car xgetHeaderComment();
        
        /**
         * True if has "HeaderComment" element
         */
        boolean isSetHeaderComment();
        
        /**
         * Sets the "HeaderComment" element
         */
        void setHeaderComment(java.lang.String headerComment);
        
        /**
         * Sets (as xml) the "HeaderComment" element
         */
        void xsetHeaderComment(x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax255Car headerComment);
        
        /**
         * Unsets the "HeaderComment" element
         */
        void unsetHeaderComment();
        
        /**
         * Gets the "Telephone" element
         */
        java.lang.String getTelephone();
        
        /**
         * Gets (as xml) the "Telephone" element
         */
        x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car xgetTelephone();
        
        /**
         * True if has "Telephone" element
         */
        boolean isSetTelephone();
        
        /**
         * Sets the "Telephone" element
         */
        void setTelephone(java.lang.String telephone);
        
        /**
         * Sets (as xml) the "Telephone" element
         */
        void xsetTelephone(x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car telephone);
        
        /**
         * Unsets the "Telephone" element
         */
        void unsetTelephone();
        
        /**
         * Gets the "Fax" element
         */
        java.lang.String getFax();
        
        /**
         * Gets (as xml) the "Fax" element
         */
        x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car xgetFax();
        
        /**
         * True if has "Fax" element
         */
        boolean isSetFax();
        
        /**
         * Sets the "Fax" element
         */
        void setFax(java.lang.String fax);
        
        /**
         * Sets (as xml) the "Fax" element
         */
        void xsetFax(x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car fax);
        
        /**
         * Unsets the "Fax" element
         */
        void unsetFax();
        
        /**
         * Gets the "Email" element
         */
        java.lang.String getEmail();
        
        /**
         * Gets (as xml) the "Email" element
         */
        x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car xgetEmail();
        
        /**
         * True if has "Email" element
         */
        boolean isSetEmail();
        
        /**
         * Sets the "Email" element
         */
        void setEmail(java.lang.String email);
        
        /**
         * Sets (as xml) the "Email" element
         */
        void xsetEmail(x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car email);
        
        /**
         * Unsets the "Email" element
         */
        void unsetEmail();
        
        /**
         * Gets the "Website" element
         */
        java.lang.String getWebsite();
        
        /**
         * Gets (as xml) the "Website" element
         */
        x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car xgetWebsite();
        
        /**
         * True if has "Website" element
         */
        boolean isSetWebsite();
        
        /**
         * Sets the "Website" element
         */
        void setWebsite(java.lang.String website);
        
        /**
         * Sets (as xml) the "Website" element
         */
        void xsetWebsite(x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car website);
        
        /**
         * Unsets the "Website" element
         */
        void unsetWebsite();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static x0201.oecdStandardAuditFileTaxPT1.HeaderDocument.Header newInstance() {
              return (x0201.oecdStandardAuditFileTaxPT1.HeaderDocument.Header) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static x0201.oecdStandardAuditFileTaxPT1.HeaderDocument.Header newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (x0201.oecdStandardAuditFileTaxPT1.HeaderDocument.Header) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0201.oecdStandardAuditFileTaxPT1.HeaderDocument newInstance() {
          return (x0201.oecdStandardAuditFileTaxPT1.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.HeaderDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0201.oecdStandardAuditFileTaxPT1.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0201.oecdStandardAuditFileTaxPT1.HeaderDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0201.oecdStandardAuditFileTaxPT1.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.HeaderDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0201.oecdStandardAuditFileTaxPT1.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0201.oecdStandardAuditFileTaxPT1.HeaderDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0201.oecdStandardAuditFileTaxPT1.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.HeaderDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0201.oecdStandardAuditFileTaxPT1.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.HeaderDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0201.oecdStandardAuditFileTaxPT1.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.HeaderDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0201.oecdStandardAuditFileTaxPT1.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.HeaderDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0201.oecdStandardAuditFileTaxPT1.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.HeaderDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0201.oecdStandardAuditFileTaxPT1.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.HeaderDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0201.oecdStandardAuditFileTaxPT1.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.HeaderDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0201.oecdStandardAuditFileTaxPT1.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.HeaderDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0201.oecdStandardAuditFileTaxPT1.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.HeaderDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0201.oecdStandardAuditFileTaxPT1.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.HeaderDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0201.oecdStandardAuditFileTaxPT1.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.HeaderDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0201.oecdStandardAuditFileTaxPT1.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0201.oecdStandardAuditFileTaxPT1.HeaderDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0201.oecdStandardAuditFileTaxPT1.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0201.oecdStandardAuditFileTaxPT1.HeaderDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0201.oecdStandardAuditFileTaxPT1.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
