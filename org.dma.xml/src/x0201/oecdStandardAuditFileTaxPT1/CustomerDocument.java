/*
 * An XML document type.
 * Localname: Customer
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.02_01
 * Java type: x0201.oecdStandardAuditFileTaxPT1.CustomerDocument
 *
 * Automatically generated - do not modify.
 */
package x0201.oecdStandardAuditFileTaxPT1;


/**
 * A document containing one Customer(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01) element.
 *
 * This is a complex type.
 */
public interface CustomerDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CustomerDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6807A875E02E61D8569B452CCBF2BB75").resolveHandle("customera399doctype");
    
    /**
     * Gets the "Customer" element
     */
    x0201.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer getCustomer();
    
    /**
     * Sets the "Customer" element
     */
    void setCustomer(x0201.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer customer);
    
    /**
     * Appends and returns a new empty "Customer" element
     */
    x0201.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer addNewCustomer();
    
    /**
     * An XML Customer(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01).
     *
     * This is a complex type.
     */
    public interface Customer extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Customer.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6807A875E02E61D8569B452CCBF2BB75").resolveHandle("customer7b3felemtype");
        
        /**
         * Gets the "CustomerID" element
         */
        java.lang.String getCustomerID();
        
        /**
         * Gets (as xml) the "CustomerID" element
         */
        x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetCustomerID();
        
        /**
         * Sets the "CustomerID" element
         */
        void setCustomerID(java.lang.String customerID);
        
        /**
         * Sets (as xml) the "CustomerID" element
         */
        void xsetCustomerID(x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car customerID);
        
        /**
         * Gets the "AccountID" element
         */
        java.lang.String getAccountID();
        
        /**
         * Gets (as xml) the "AccountID" element
         */
        x0201.oecdStandardAuditFileTaxPT1.AccountIDDocument.AccountID xgetAccountID();
        
        /**
         * Sets the "AccountID" element
         */
        void setAccountID(java.lang.String accountID);
        
        /**
         * Sets (as xml) the "AccountID" element
         */
        void xsetAccountID(x0201.oecdStandardAuditFileTaxPT1.AccountIDDocument.AccountID accountID);
        
        /**
         * Gets the "CustomerTaxID" element
         */
        java.lang.String getCustomerTaxID();
        
        /**
         * Gets (as xml) the "CustomerTaxID" element
         */
        x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car xgetCustomerTaxID();
        
        /**
         * Sets the "CustomerTaxID" element
         */
        void setCustomerTaxID(java.lang.String customerTaxID);
        
        /**
         * Sets (as xml) the "CustomerTaxID" element
         */
        void xsetCustomerTaxID(x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car customerTaxID);
        
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
         * Gets the "Contact" element
         */
        java.lang.String getContact();
        
        /**
         * Gets (as xml) the "Contact" element
         */
        x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car xgetContact();
        
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
        void xsetContact(x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car contact);
        
        /**
         * Unsets the "Contact" element
         */
        void unsetContact();
        
        /**
         * Gets the "BillingAddress" element
         */
        x0201.oecdStandardAuditFileTaxPT1.AddressStructure getBillingAddress();
        
        /**
         * Sets the "BillingAddress" element
         */
        void setBillingAddress(x0201.oecdStandardAuditFileTaxPT1.AddressStructure billingAddress);
        
        /**
         * Appends and returns a new empty "BillingAddress" element
         */
        x0201.oecdStandardAuditFileTaxPT1.AddressStructure addNewBillingAddress();
        
        /**
         * Gets a List of "ShipToAddress" elements
         */
        java.util.List<x0201.oecdStandardAuditFileTaxPT1.AddressStructure> getShipToAddressList();
        
        /**
         * Gets array of all "ShipToAddress" elements
         * @deprecated
         */
        @Deprecated
        x0201.oecdStandardAuditFileTaxPT1.AddressStructure[] getShipToAddressArray();
        
        /**
         * Gets ith "ShipToAddress" element
         */
        x0201.oecdStandardAuditFileTaxPT1.AddressStructure getShipToAddressArray(int i);
        
        /**
         * Returns number of "ShipToAddress" element
         */
        int sizeOfShipToAddressArray();
        
        /**
         * Sets array of all "ShipToAddress" element
         */
        void setShipToAddressArray(x0201.oecdStandardAuditFileTaxPT1.AddressStructure[] shipToAddressArray);
        
        /**
         * Sets ith "ShipToAddress" element
         */
        void setShipToAddressArray(int i, x0201.oecdStandardAuditFileTaxPT1.AddressStructure shipToAddress);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ShipToAddress" element
         */
        x0201.oecdStandardAuditFileTaxPT1.AddressStructure insertNewShipToAddress(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ShipToAddress" element
         */
        x0201.oecdStandardAuditFileTaxPT1.AddressStructure addNewShipToAddress();
        
        /**
         * Removes the ith "ShipToAddress" element
         */
        void removeShipToAddress(int i);
        
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
         * Gets the "SelfBillingIndicator" element
         */
        int getSelfBillingIndicator();
        
        /**
         * Gets (as xml) the "SelfBillingIndicator" element
         */
        x0201.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator xgetSelfBillingIndicator();
        
        /**
         * Sets the "SelfBillingIndicator" element
         */
        void setSelfBillingIndicator(int selfBillingIndicator);
        
        /**
         * Sets (as xml) the "SelfBillingIndicator" element
         */
        void xsetSelfBillingIndicator(x0201.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator selfBillingIndicator);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static x0201.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer newInstance() {
              return (x0201.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static x0201.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (x0201.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0201.oecdStandardAuditFileTaxPT1.CustomerDocument newInstance() {
          return (x0201.oecdStandardAuditFileTaxPT1.CustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.CustomerDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0201.oecdStandardAuditFileTaxPT1.CustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0201.oecdStandardAuditFileTaxPT1.CustomerDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0201.oecdStandardAuditFileTaxPT1.CustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.CustomerDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0201.oecdStandardAuditFileTaxPT1.CustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0201.oecdStandardAuditFileTaxPT1.CustomerDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0201.oecdStandardAuditFileTaxPT1.CustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.CustomerDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0201.oecdStandardAuditFileTaxPT1.CustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.CustomerDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0201.oecdStandardAuditFileTaxPT1.CustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.CustomerDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0201.oecdStandardAuditFileTaxPT1.CustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.CustomerDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0201.oecdStandardAuditFileTaxPT1.CustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.CustomerDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0201.oecdStandardAuditFileTaxPT1.CustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.CustomerDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0201.oecdStandardAuditFileTaxPT1.CustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.CustomerDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0201.oecdStandardAuditFileTaxPT1.CustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.CustomerDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0201.oecdStandardAuditFileTaxPT1.CustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.CustomerDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0201.oecdStandardAuditFileTaxPT1.CustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.CustomerDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0201.oecdStandardAuditFileTaxPT1.CustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.CustomerDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0201.oecdStandardAuditFileTaxPT1.CustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0201.oecdStandardAuditFileTaxPT1.CustomerDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0201.oecdStandardAuditFileTaxPT1.CustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0201.oecdStandardAuditFileTaxPT1.CustomerDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0201.oecdStandardAuditFileTaxPT1.CustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
