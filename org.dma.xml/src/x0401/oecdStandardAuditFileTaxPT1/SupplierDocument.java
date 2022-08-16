/*
 * An XML document type.
 * Localname: Supplier
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.SupplierDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1;


/**
 * A document containing one Supplier(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public interface SupplierDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SupplierDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25593249777A7B590168EB7C07CF83EB").resolveHandle("supplierbcc5doctype");
    
    /**
     * Gets the "Supplier" element
     */
    x0401.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier getSupplier();
    
    /**
     * Sets the "Supplier" element
     */
    void setSupplier(x0401.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier supplier);
    
    /**
     * Appends and returns a new empty "Supplier" element
     */
    x0401.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier addNewSupplier();
    
    /**
     * An XML Supplier(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
     *
     * This is a complex type.
     */
    public interface Supplier extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Supplier.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25593249777A7B590168EB7C07CF83EB").resolveHandle("supplier733delemtype");
        
        /**
         * Gets the "SupplierID" element
         */
        java.lang.String getSupplierID();
        
        /**
         * Gets (as xml) the "SupplierID" element
         */
        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetSupplierID();
        
        /**
         * Sets the "SupplierID" element
         */
        void setSupplierID(java.lang.String supplierID);
        
        /**
         * Sets (as xml) the "SupplierID" element
         */
        void xsetSupplierID(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car supplierID);
        
        /**
         * Gets the "AccountID" element
         */
        java.lang.String getAccountID();
        
        /**
         * Gets (as xml) the "AccountID" element
         */
        x0401.oecdStandardAuditFileTaxPT1.AccountIDDocument.AccountID xgetAccountID();
        
        /**
         * Sets the "AccountID" element
         */
        void setAccountID(java.lang.String accountID);
        
        /**
         * Sets (as xml) the "AccountID" element
         */
        void xsetAccountID(x0401.oecdStandardAuditFileTaxPT1.AccountIDDocument.AccountID accountID);
        
        /**
         * Gets the "SupplierTaxID" element
         */
        java.lang.String getSupplierTaxID();
        
        /**
         * Gets (as xml) the "SupplierTaxID" element
         */
        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetSupplierTaxID();
        
        /**
         * Sets the "SupplierTaxID" element
         */
        void setSupplierTaxID(java.lang.String supplierTaxID);
        
        /**
         * Sets (as xml) the "SupplierTaxID" element
         */
        void xsetSupplierTaxID(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car supplierTaxID);
        
        /**
         * Gets the "CompanyName" element
         */
        java.lang.String getCompanyName();
        
        /**
         * Gets (as xml) the "CompanyName" element
         */
        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car xgetCompanyName();
        
        /**
         * Sets the "CompanyName" element
         */
        void setCompanyName(java.lang.String companyName);
        
        /**
         * Sets (as xml) the "CompanyName" element
         */
        void xsetCompanyName(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car companyName);
        
        /**
         * Gets the "Contact" element
         */
        java.lang.String getContact();
        
        /**
         * Gets (as xml) the "Contact" element
         */
        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car xgetContact();
        
        /**
         * True if has "Contact" element
         */
        boolean isSetContact();
        
        /**
         * Sets the "Contact" element
         */
        void setContact(java.lang.String contact);
        
        /**
         * Sets (as xml) the "Contact" element
         */
        void xsetContact(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car contact);
        
        /**
         * Unsets the "Contact" element
         */
        void unsetContact();
        
        /**
         * Gets the "BillingAddress" element
         */
        x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure getBillingAddress();
        
        /**
         * Sets the "BillingAddress" element
         */
        void setBillingAddress(x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure billingAddress);
        
        /**
         * Appends and returns a new empty "BillingAddress" element
         */
        x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure addNewBillingAddress();
        
        /**
         * Gets a List of "ShipFromAddress" elements
         */
        java.util.List<x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure> getShipFromAddressList();
        
        /**
         * Gets array of all "ShipFromAddress" elements
         * @deprecated
         */
        @Deprecated
        x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure[] getShipFromAddressArray();
        
        /**
         * Gets ith "ShipFromAddress" element
         */
        x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure getShipFromAddressArray(int i);
        
        /**
         * Returns number of "ShipFromAddress" element
         */
        int sizeOfShipFromAddressArray();
        
        /**
         * Sets array of all "ShipFromAddress" element
         */
        void setShipFromAddressArray(x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure[] shipFromAddressArray);
        
        /**
         * Sets ith "ShipFromAddress" element
         */
        void setShipFromAddressArray(int i, x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure shipFromAddress);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ShipFromAddress" element
         */
        x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure insertNewShipFromAddress(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ShipFromAddress" element
         */
        x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure addNewShipFromAddress();
        
        /**
         * Removes the ith "ShipFromAddress" element
         */
        void removeShipFromAddress(int i);
        
        /**
         * Gets the "Telephone" element
         */
        java.lang.String getTelephone();
        
        /**
         * Gets (as xml) the "Telephone" element
         */
        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car xgetTelephone();
        
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
        void xsetTelephone(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car telephone);
        
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
        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car xgetFax();
        
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
        void xsetFax(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car fax);
        
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
        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax254Car xgetEmail();
        
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
        void xsetEmail(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax254Car email);
        
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
        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car xgetWebsite();
        
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
        void xsetWebsite(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car website);
        
        /**
         * Unsets the "Website" element
         */
        void unsetWebsite();
        
        /**
         * Gets the "SelfBillingIndicator" element
         */
        int getSelfBillingIndicator();
        
        /**
         * Gets (as xml) the "SelfBillingIndicator" element
         */
        x0401.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator xgetSelfBillingIndicator();
        
        /**
         * Sets the "SelfBillingIndicator" element
         */
        void setSelfBillingIndicator(int selfBillingIndicator);
        
        /**
         * Sets (as xml) the "SelfBillingIndicator" element
         */
        void xsetSelfBillingIndicator(x0401.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator selfBillingIndicator);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static x0401.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier newInstance() {
              return (x0401.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static x0401.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (x0401.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0401.oecdStandardAuditFileTaxPT1.SupplierDocument newInstance() {
          return (x0401.oecdStandardAuditFileTaxPT1.SupplierDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.SupplierDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0401.oecdStandardAuditFileTaxPT1.SupplierDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0401.oecdStandardAuditFileTaxPT1.SupplierDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.SupplierDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.SupplierDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.SupplierDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0401.oecdStandardAuditFileTaxPT1.SupplierDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.SupplierDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.SupplierDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.SupplierDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.SupplierDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.SupplierDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.SupplierDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.SupplierDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.SupplierDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.SupplierDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.SupplierDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.SupplierDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.SupplierDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.SupplierDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.SupplierDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.SupplierDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.SupplierDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.SupplierDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.SupplierDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.SupplierDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.SupplierDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.SupplierDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.SupplierDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.SupplierDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0401.oecdStandardAuditFileTaxPT1.SupplierDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0401.oecdStandardAuditFileTaxPT1.SupplierDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0401.oecdStandardAuditFileTaxPT1.SupplierDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0401.oecdStandardAuditFileTaxPT1.SupplierDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
