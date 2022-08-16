/*
 * An XML document type.
 * Localname: AuditFile
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.02_01
 * Java type: x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument
 *
 * Automatically generated - do not modify.
 */
package x0201.oecdStandardAuditFileTaxPT1;


/**
 * A document containing one AuditFile(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01) element.
 *
 * This is a complex type.
 */
public interface AuditFileDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AuditFileDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6807A875E02E61D8569B452CCBF2BB75").resolveHandle("auditfile76e0doctype");
    
    /**
     * Gets the "AuditFile" element
     */
    x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument.AuditFile getAuditFile();
    
    /**
     * Sets the "AuditFile" element
     */
    void setAuditFile(x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument.AuditFile auditFile);
    
    /**
     * Appends and returns a new empty "AuditFile" element
     */
    x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument.AuditFile addNewAuditFile();
    
    /**
     * An XML AuditFile(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01).
     *
     * This is a complex type.
     */
    public interface AuditFile extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AuditFile.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6807A875E02E61D8569B452CCBF2BB75").resolveHandle("auditfile28e3elemtype");
        
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
         * Gets the "MasterFiles" element
         */
        x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument.AuditFile.MasterFiles getMasterFiles();
        
        /**
         * Sets the "MasterFiles" element
         */
        void setMasterFiles(x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument.AuditFile.MasterFiles masterFiles);
        
        /**
         * Appends and returns a new empty "MasterFiles" element
         */
        x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument.AuditFile.MasterFiles addNewMasterFiles();
        
        /**
         * Gets the "GeneralLedgerEntries" element
         */
        x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries getGeneralLedgerEntries();
        
        /**
         * True if has "GeneralLedgerEntries" element
         */
        boolean isSetGeneralLedgerEntries();
        
        /**
         * Sets the "GeneralLedgerEntries" element
         */
        void setGeneralLedgerEntries(x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries generalLedgerEntries);
        
        /**
         * Appends and returns a new empty "GeneralLedgerEntries" element
         */
        x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries addNewGeneralLedgerEntries();
        
        /**
         * Unsets the "GeneralLedgerEntries" element
         */
        void unsetGeneralLedgerEntries();
        
        /**
         * Gets the "SourceDocuments" element
         */
        x0201.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments getSourceDocuments();
        
        /**
         * True if has "SourceDocuments" element
         */
        boolean isSetSourceDocuments();
        
        /**
         * Sets the "SourceDocuments" element
         */
        void setSourceDocuments(x0201.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments sourceDocuments);
        
        /**
         * Appends and returns a new empty "SourceDocuments" element
         */
        x0201.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments addNewSourceDocuments();
        
        /**
         * Unsets the "SourceDocuments" element
         */
        void unsetSourceDocuments();
        
        /**
         * An XML MasterFiles(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01).
         *
         * This is a complex type.
         */
        public interface MasterFiles extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MasterFiles.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6807A875E02E61D8569B452CCBF2BB75").resolveHandle("masterfilese224elemtype");
            
            /**
             * Gets a List of "GeneralLedger" elements
             */
            java.util.List<x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger> getGeneralLedgerList();
            
            /**
             * Gets array of all "GeneralLedger" elements
             * @deprecated
             */
            @Deprecated
            x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger[] getGeneralLedgerArray();
            
            /**
             * Gets ith "GeneralLedger" element
             */
            x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger getGeneralLedgerArray(int i);
            
            /**
             * Returns number of "GeneralLedger" element
             */
            int sizeOfGeneralLedgerArray();
            
            /**
             * Sets array of all "GeneralLedger" element
             */
            void setGeneralLedgerArray(x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger[] generalLedgerArray);
            
            /**
             * Sets ith "GeneralLedger" element
             */
            void setGeneralLedgerArray(int i, x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger generalLedger);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "GeneralLedger" element
             */
            x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger insertNewGeneralLedger(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "GeneralLedger" element
             */
            x0201.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger addNewGeneralLedger();
            
            /**
             * Removes the ith "GeneralLedger" element
             */
            void removeGeneralLedger(int i);
            
            /**
             * Gets a List of "Customer" elements
             */
            java.util.List<x0201.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer> getCustomerList();
            
            /**
             * Gets array of all "Customer" elements
             * @deprecated
             */
            @Deprecated
            x0201.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer[] getCustomerArray();
            
            /**
             * Gets ith "Customer" element
             */
            x0201.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer getCustomerArray(int i);
            
            /**
             * Returns number of "Customer" element
             */
            int sizeOfCustomerArray();
            
            /**
             * Sets array of all "Customer" element
             */
            void setCustomerArray(x0201.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer[] customerArray);
            
            /**
             * Sets ith "Customer" element
             */
            void setCustomerArray(int i, x0201.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer customer);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Customer" element
             */
            x0201.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer insertNewCustomer(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Customer" element
             */
            x0201.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer addNewCustomer();
            
            /**
             * Removes the ith "Customer" element
             */
            void removeCustomer(int i);
            
            /**
             * Gets a List of "Supplier" elements
             */
            java.util.List<x0201.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier> getSupplierList();
            
            /**
             * Gets array of all "Supplier" elements
             * @deprecated
             */
            @Deprecated
            x0201.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier[] getSupplierArray();
            
            /**
             * Gets ith "Supplier" element
             */
            x0201.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier getSupplierArray(int i);
            
            /**
             * Returns number of "Supplier" element
             */
            int sizeOfSupplierArray();
            
            /**
             * Sets array of all "Supplier" element
             */
            void setSupplierArray(x0201.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier[] supplierArray);
            
            /**
             * Sets ith "Supplier" element
             */
            void setSupplierArray(int i, x0201.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier supplier);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Supplier" element
             */
            x0201.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier insertNewSupplier(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Supplier" element
             */
            x0201.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier addNewSupplier();
            
            /**
             * Removes the ith "Supplier" element
             */
            void removeSupplier(int i);
            
            /**
             * Gets a List of "Product" elements
             */
            java.util.List<x0201.oecdStandardAuditFileTaxPT1.ProductDocument.Product> getProductList();
            
            /**
             * Gets array of all "Product" elements
             * @deprecated
             */
            @Deprecated
            x0201.oecdStandardAuditFileTaxPT1.ProductDocument.Product[] getProductArray();
            
            /**
             * Gets ith "Product" element
             */
            x0201.oecdStandardAuditFileTaxPT1.ProductDocument.Product getProductArray(int i);
            
            /**
             * Returns number of "Product" element
             */
            int sizeOfProductArray();
            
            /**
             * Sets array of all "Product" element
             */
            void setProductArray(x0201.oecdStandardAuditFileTaxPT1.ProductDocument.Product[] productArray);
            
            /**
             * Sets ith "Product" element
             */
            void setProductArray(int i, x0201.oecdStandardAuditFileTaxPT1.ProductDocument.Product product);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Product" element
             */
            x0201.oecdStandardAuditFileTaxPT1.ProductDocument.Product insertNewProduct(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Product" element
             */
            x0201.oecdStandardAuditFileTaxPT1.ProductDocument.Product addNewProduct();
            
            /**
             * Removes the ith "Product" element
             */
            void removeProduct(int i);
            
            /**
             * Gets the "TaxTable" element
             */
            x0201.oecdStandardAuditFileTaxPT1.TaxTableDocument.TaxTable getTaxTable();
            
            /**
             * True if has "TaxTable" element
             */
            boolean isSetTaxTable();
            
            /**
             * Sets the "TaxTable" element
             */
            void setTaxTable(x0201.oecdStandardAuditFileTaxPT1.TaxTableDocument.TaxTable taxTable);
            
            /**
             * Appends and returns a new empty "TaxTable" element
             */
            x0201.oecdStandardAuditFileTaxPT1.TaxTableDocument.TaxTable addNewTaxTable();
            
            /**
             * Unsets the "TaxTable" element
             */
            void unsetTaxTable();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument.AuditFile.MasterFiles newInstance() {
                  return (x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument.AuditFile.MasterFiles) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument.AuditFile.MasterFiles newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument.AuditFile.MasterFiles) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument.AuditFile newInstance() {
              return (x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument.AuditFile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument.AuditFile newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument.AuditFile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument newInstance() {
          return (x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0201.oecdStandardAuditFileTaxPT1.AuditFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
