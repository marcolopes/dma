/*
 * An XML document type.
 * Localname: SourceDocuments
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.01_01
 * Java type: x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument
 *
 * Automatically generated - do not modify.
 */
package x0101.oecdStandardAuditFileTaxPT1;


/**
 * A document containing one SourceDocuments(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01) element.
 *
 * This is a complex type.
 */
public interface SourceDocumentsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SourceDocumentsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD333BD87CA6FBD44E91365563B1F8A20").resolveHandle("sourcedocuments6aa7doctype");
    
    /**
     * Gets the "SourceDocuments" element
     */
    x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments getSourceDocuments();
    
    /**
     * Sets the "SourceDocuments" element
     */
    void setSourceDocuments(x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments sourceDocuments);
    
    /**
     * Appends and returns a new empty "SourceDocuments" element
     */
    x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments addNewSourceDocuments();
    
    /**
     * An XML SourceDocuments(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01).
     *
     * This is a complex type.
     */
    public interface SourceDocuments extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SourceDocuments.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD333BD87CA6FBD44E91365563B1F8A20").resolveHandle("sourcedocuments0450elemtype");
        
        /**
         * Gets the "SalesInvoices" element
         */
        x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices getSalesInvoices();
        
        /**
         * True if has "SalesInvoices" element
         */
        boolean isSetSalesInvoices();
        
        /**
         * Sets the "SalesInvoices" element
         */
        void setSalesInvoices(x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices salesInvoices);
        
        /**
         * Appends and returns a new empty "SalesInvoices" element
         */
        x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices addNewSalesInvoices();
        
        /**
         * Unsets the "SalesInvoices" element
         */
        void unsetSalesInvoices();
        
        /**
         * An XML SalesInvoices(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01).
         *
         * This is a complex type.
         */
        public interface SalesInvoices extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SalesInvoices.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD333BD87CA6FBD44E91365563B1F8A20").resolveHandle("salesinvoices7a2eelemtype");
            
            /**
             * Gets the "NumberOfEntries" element
             */
            java.math.BigInteger getNumberOfEntries();
            
            /**
             * Gets (as xml) the "NumberOfEntries" element
             */
            org.apache.xmlbeans.XmlInteger xgetNumberOfEntries();
            
            /**
             * Sets the "NumberOfEntries" element
             */
            void setNumberOfEntries(java.math.BigInteger numberOfEntries);
            
            /**
             * Sets (as xml) the "NumberOfEntries" element
             */
            void xsetNumberOfEntries(org.apache.xmlbeans.XmlInteger numberOfEntries);
            
            /**
             * Gets the "TotalDebit" element
             */
            java.math.BigDecimal getTotalDebit();
            
            /**
             * Gets (as xml) the "TotalDebit" element
             */
            x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetTotalDebit();
            
            /**
             * Sets the "TotalDebit" element
             */
            void setTotalDebit(java.math.BigDecimal totalDebit);
            
            /**
             * Sets (as xml) the "TotalDebit" element
             */
            void xsetTotalDebit(x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType totalDebit);
            
            /**
             * Gets the "TotalCredit" element
             */
            java.math.BigDecimal getTotalCredit();
            
            /**
             * Gets (as xml) the "TotalCredit" element
             */
            x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetTotalCredit();
            
            /**
             * Sets the "TotalCredit" element
             */
            void setTotalCredit(java.math.BigDecimal totalCredit);
            
            /**
             * Sets (as xml) the "TotalCredit" element
             */
            void xsetTotalCredit(x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType totalCredit);
            
            /**
             * Gets a List of "Invoice" elements
             */
            java.util.List<x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice> getInvoiceList();
            
            /**
             * Gets array of all "Invoice" elements
             * @deprecated
             */
            @Deprecated
            x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice[] getInvoiceArray();
            
            /**
             * Gets ith "Invoice" element
             */
            x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice getInvoiceArray(int i);
            
            /**
             * Returns number of "Invoice" element
             */
            int sizeOfInvoiceArray();
            
            /**
             * Sets array of all "Invoice" element
             */
            void setInvoiceArray(x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice[] invoiceArray);
            
            /**
             * Sets ith "Invoice" element
             */
            void setInvoiceArray(int i, x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice invoice);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Invoice" element
             */
            x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice insertNewInvoice(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Invoice" element
             */
            x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice addNewInvoice();
            
            /**
             * Removes the ith "Invoice" element
             */
            void removeInvoice(int i);
            
            /**
             * An XML Invoice(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01).
             *
             * This is a complex type.
             */
            public interface Invoice extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Invoice.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD333BD87CA6FBD44E91365563B1F8A20").resolveHandle("invoice0fe7elemtype");
                
                /**
                 * Gets the "InvoiceNo" element
                 */
                java.lang.String getInvoiceNo();
                
                /**
                 * Gets (as xml) the "InvoiceNo" element
                 */
                x0101.oecdStandardAuditFileTaxPT1.InvoiceNoDocument.InvoiceNo xgetInvoiceNo();
                
                /**
                 * Sets the "InvoiceNo" element
                 */
                void setInvoiceNo(java.lang.String invoiceNo);
                
                /**
                 * Sets (as xml) the "InvoiceNo" element
                 */
                void xsetInvoiceNo(x0101.oecdStandardAuditFileTaxPT1.InvoiceNoDocument.InvoiceNo invoiceNo);
                
                /**
                 * Gets the "InvoiceStatus" element
                 */
                x0101.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument.InvoiceStatus.Enum getInvoiceStatus();
                
                /**
                 * Gets (as xml) the "InvoiceStatus" element
                 */
                x0101.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument.InvoiceStatus xgetInvoiceStatus();
                
                /**
                 * Sets the "InvoiceStatus" element
                 */
                void setInvoiceStatus(x0101.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument.InvoiceStatus.Enum invoiceStatus);
                
                /**
                 * Sets (as xml) the "InvoiceStatus" element
                 */
                void xsetInvoiceStatus(x0101.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument.InvoiceStatus invoiceStatus);
                
                /**
                 * Gets the "Hash" element
                 */
                java.lang.String getHash();
                
                /**
                 * Gets (as xml) the "Hash" element
                 */
                x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car xgetHash();
                
                /**
                 * Sets the "Hash" element
                 */
                void setHash(java.lang.String hash);
                
                /**
                 * Sets (as xml) the "Hash" element
                 */
                void xsetHash(x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car hash);
                
                /**
                 * Gets the "HashControl" element
                 */
                java.lang.String getHashControl();
                
                /**
                 * Gets (as xml) the "HashControl" element
                 */
                x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax40Car xgetHashControl();
                
                /**
                 * True if has "HashControl" element
                 */
                boolean isSetHashControl();
                
                /**
                 * Sets the "HashControl" element
                 */
                void setHashControl(java.lang.String hashControl);
                
                /**
                 * Sets (as xml) the "HashControl" element
                 */
                void xsetHashControl(x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax40Car hashControl);
                
                /**
                 * Unsets the "HashControl" element
                 */
                void unsetHashControl();
                
                /**
                 * Gets the "Period" element
                 */
                int getPeriod();
                
                /**
                 * Gets (as xml) the "Period" element
                 */
                x0101.oecdStandardAuditFileTaxPT1.PeriodDocument.Period xgetPeriod();
                
                /**
                 * True if has "Period" element
                 */
                boolean isSetPeriod();
                
                /**
                 * Sets the "Period" element
                 */
                void setPeriod(int period);
                
                /**
                 * Sets (as xml) the "Period" element
                 */
                void xsetPeriod(x0101.oecdStandardAuditFileTaxPT1.PeriodDocument.Period period);
                
                /**
                 * Unsets the "Period" element
                 */
                void unsetPeriod();
                
                /**
                 * Gets the "InvoiceDate" element
                 */
                java.util.Calendar getInvoiceDate();
                
                /**
                 * Gets (as xml) the "InvoiceDate" element
                 */
                x0101.oecdStandardAuditFileTaxPT1.SAFdateType xgetInvoiceDate();
                
                /**
                 * Sets the "InvoiceDate" element
                 */
                void setInvoiceDate(java.util.Calendar invoiceDate);
                
                /**
                 * Sets (as xml) the "InvoiceDate" element
                 */
                void xsetInvoiceDate(x0101.oecdStandardAuditFileTaxPT1.SAFdateType invoiceDate);
                
                /**
                 * Gets the "InvoiceType" element
                 */
                x0101.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType.Enum getInvoiceType();
                
                /**
                 * Gets (as xml) the "InvoiceType" element
                 */
                x0101.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType xgetInvoiceType();
                
                /**
                 * Sets the "InvoiceType" element
                 */
                void setInvoiceType(x0101.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType.Enum invoiceType);
                
                /**
                 * Sets (as xml) the "InvoiceType" element
                 */
                void xsetInvoiceType(x0101.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType invoiceType);
                
                /**
                 * Gets the "SelfBillingIndicator" element
                 */
                int getSelfBillingIndicator();
                
                /**
                 * Gets (as xml) the "SelfBillingIndicator" element
                 */
                x0101.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator xgetSelfBillingIndicator();
                
                /**
                 * Sets the "SelfBillingIndicator" element
                 */
                void setSelfBillingIndicator(int selfBillingIndicator);
                
                /**
                 * Sets (as xml) the "SelfBillingIndicator" element
                 */
                void xsetSelfBillingIndicator(x0101.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator selfBillingIndicator);
                
                /**
                 * Gets the "SystemEntryDate" element
                 */
                java.util.Calendar getSystemEntryDate();
                
                /**
                 * Gets (as xml) the "SystemEntryDate" element
                 */
                x0101.oecdStandardAuditFileTaxPT1.SAFdateTimeType xgetSystemEntryDate();
                
                /**
                 * Sets the "SystemEntryDate" element
                 */
                void setSystemEntryDate(java.util.Calendar systemEntryDate);
                
                /**
                 * Sets (as xml) the "SystemEntryDate" element
                 */
                void xsetSystemEntryDate(x0101.oecdStandardAuditFileTaxPT1.SAFdateTimeType systemEntryDate);
                
                /**
                 * Gets the "TransactionID" element
                 */
                java.lang.String getTransactionID();
                
                /**
                 * Gets (as xml) the "TransactionID" element
                 */
                x0101.oecdStandardAuditFileTaxPT1.SAFPTTransactionID xgetTransactionID();
                
                /**
                 * True if has "TransactionID" element
                 */
                boolean isSetTransactionID();
                
                /**
                 * Sets the "TransactionID" element
                 */
                void setTransactionID(java.lang.String transactionID);
                
                /**
                 * Sets (as xml) the "TransactionID" element
                 */
                void xsetTransactionID(x0101.oecdStandardAuditFileTaxPT1.SAFPTTransactionID transactionID);
                
                /**
                 * Unsets the "TransactionID" element
                 */
                void unsetTransactionID();
                
                /**
                 * Gets the "CustomerID" element
                 */
                java.lang.String getCustomerID();
                
                /**
                 * Gets (as xml) the "CustomerID" element
                 */
                x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetCustomerID();
                
                /**
                 * Sets the "CustomerID" element
                 */
                void setCustomerID(java.lang.String customerID);
                
                /**
                 * Sets (as xml) the "CustomerID" element
                 */
                void xsetCustomerID(x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car customerID);
                
                /**
                 * Gets the "ShipTo" element
                 */
                x0101.oecdStandardAuditFileTaxPT1.ShippingPointStructure getShipTo();
                
                /**
                 * True if has "ShipTo" element
                 */
                boolean isSetShipTo();
                
                /**
                 * Sets the "ShipTo" element
                 */
                void setShipTo(x0101.oecdStandardAuditFileTaxPT1.ShippingPointStructure shipTo);
                
                /**
                 * Appends and returns a new empty "ShipTo" element
                 */
                x0101.oecdStandardAuditFileTaxPT1.ShippingPointStructure addNewShipTo();
                
                /**
                 * Unsets the "ShipTo" element
                 */
                void unsetShipTo();
                
                /**
                 * Gets the "ShipFrom" element
                 */
                x0101.oecdStandardAuditFileTaxPT1.ShippingPointStructure getShipFrom();
                
                /**
                 * True if has "ShipFrom" element
                 */
                boolean isSetShipFrom();
                
                /**
                 * Sets the "ShipFrom" element
                 */
                void setShipFrom(x0101.oecdStandardAuditFileTaxPT1.ShippingPointStructure shipFrom);
                
                /**
                 * Appends and returns a new empty "ShipFrom" element
                 */
                x0101.oecdStandardAuditFileTaxPT1.ShippingPointStructure addNewShipFrom();
                
                /**
                 * Unsets the "ShipFrom" element
                 */
                void unsetShipFrom();
                
                /**
                 * Gets a List of "Line" elements
                 */
                java.util.List<x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line> getLineList();
                
                /**
                 * Gets array of all "Line" elements
                 * @deprecated
                 */
                @Deprecated
                x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line[] getLineArray();
                
                /**
                 * Gets ith "Line" element
                 */
                x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line getLineArray(int i);
                
                /**
                 * Returns number of "Line" element
                 */
                int sizeOfLineArray();
                
                /**
                 * Sets array of all "Line" element
                 */
                void setLineArray(x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line[] lineArray);
                
                /**
                 * Sets ith "Line" element
                 */
                void setLineArray(int i, x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line line);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "Line" element
                 */
                x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line insertNewLine(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "Line" element
                 */
                x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line addNewLine();
                
                /**
                 * Removes the ith "Line" element
                 */
                void removeLine(int i);
                
                /**
                 * Gets the "DocumentTotals" element
                 */
                x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentTotals getDocumentTotals();
                
                /**
                 * Sets the "DocumentTotals" element
                 */
                void setDocumentTotals(x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentTotals documentTotals);
                
                /**
                 * Appends and returns a new empty "DocumentTotals" element
                 */
                x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentTotals addNewDocumentTotals();
                
                /**
                 * An XML Line(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01).
                 *
                 * This is a complex type.
                 */
                public interface Line extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Line.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD333BD87CA6FBD44E91365563B1F8A20").resolveHandle("line4097elemtype");
                    
                    /**
                     * Gets the "LineNumber" element
                     */
                    java.math.BigInteger getLineNumber();
                    
                    /**
                     * Gets (as xml) the "LineNumber" element
                     */
                    org.apache.xmlbeans.XmlInteger xgetLineNumber();
                    
                    /**
                     * Sets the "LineNumber" element
                     */
                    void setLineNumber(java.math.BigInteger lineNumber);
                    
                    /**
                     * Sets (as xml) the "LineNumber" element
                     */
                    void xsetLineNumber(org.apache.xmlbeans.XmlInteger lineNumber);
                    
                    /**
                     * Gets a List of "OrderReferences" elements
                     */
                    java.util.List<x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument.OrderReferences> getOrderReferencesList();
                    
                    /**
                     * Gets array of all "OrderReferences" elements
                     * @deprecated
                     */
                    @Deprecated
                    x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument.OrderReferences[] getOrderReferencesArray();
                    
                    /**
                     * Gets ith "OrderReferences" element
                     */
                    x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument.OrderReferences getOrderReferencesArray(int i);
                    
                    /**
                     * Returns number of "OrderReferences" element
                     */
                    int sizeOfOrderReferencesArray();
                    
                    /**
                     * Sets array of all "OrderReferences" element
                     */
                    void setOrderReferencesArray(x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument.OrderReferences[] orderReferencesArray);
                    
                    /**
                     * Sets ith "OrderReferences" element
                     */
                    void setOrderReferencesArray(int i, x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument.OrderReferences orderReferences);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "OrderReferences" element
                     */
                    x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument.OrderReferences insertNewOrderReferences(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "OrderReferences" element
                     */
                    x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument.OrderReferences addNewOrderReferences();
                    
                    /**
                     * Removes the ith "OrderReferences" element
                     */
                    void removeOrderReferences(int i);
                    
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
                     * Gets the "Quantity" element
                     */
                    java.math.BigDecimal getQuantity();
                    
                    /**
                     * Gets (as xml) the "Quantity" element
                     */
                    x0101.oecdStandardAuditFileTaxPT1.SAFdecimalType xgetQuantity();
                    
                    /**
                     * Sets the "Quantity" element
                     */
                    void setQuantity(java.math.BigDecimal quantity);
                    
                    /**
                     * Sets (as xml) the "Quantity" element
                     */
                    void xsetQuantity(x0101.oecdStandardAuditFileTaxPT1.SAFdecimalType quantity);
                    
                    /**
                     * Gets the "UnitOfMeasure" element
                     */
                    java.lang.String getUnitOfMeasure();
                    
                    /**
                     * Gets (as xml) the "UnitOfMeasure" element
                     */
                    x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car xgetUnitOfMeasure();
                    
                    /**
                     * Sets the "UnitOfMeasure" element
                     */
                    void setUnitOfMeasure(java.lang.String unitOfMeasure);
                    
                    /**
                     * Sets (as xml) the "UnitOfMeasure" element
                     */
                    void xsetUnitOfMeasure(x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car unitOfMeasure);
                    
                    /**
                     * Gets the "UnitPrice" element
                     */
                    java.math.BigDecimal getUnitPrice();
                    
                    /**
                     * Gets (as xml) the "UnitPrice" element
                     */
                    x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetUnitPrice();
                    
                    /**
                     * Sets the "UnitPrice" element
                     */
                    void setUnitPrice(java.math.BigDecimal unitPrice);
                    
                    /**
                     * Sets (as xml) the "UnitPrice" element
                     */
                    void xsetUnitPrice(x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType unitPrice);
                    
                    /**
                     * Gets the "TaxPointDate" element
                     */
                    java.util.Calendar getTaxPointDate();
                    
                    /**
                     * Gets (as xml) the "TaxPointDate" element
                     */
                    x0101.oecdStandardAuditFileTaxPT1.SAFdateType xgetTaxPointDate();
                    
                    /**
                     * Sets the "TaxPointDate" element
                     */
                    void setTaxPointDate(java.util.Calendar taxPointDate);
                    
                    /**
                     * Sets (as xml) the "TaxPointDate" element
                     */
                    void xsetTaxPointDate(x0101.oecdStandardAuditFileTaxPT1.SAFdateType taxPointDate);
                    
                    /**
                     * Gets the "References" element
                     */
                    x0101.oecdStandardAuditFileTaxPT1.ReferencesDocument.References getReferences();
                    
                    /**
                     * True if has "References" element
                     */
                    boolean isSetReferences();
                    
                    /**
                     * Sets the "References" element
                     */
                    void setReferences(x0101.oecdStandardAuditFileTaxPT1.ReferencesDocument.References references);
                    
                    /**
                     * Appends and returns a new empty "References" element
                     */
                    x0101.oecdStandardAuditFileTaxPT1.ReferencesDocument.References addNewReferences();
                    
                    /**
                     * Unsets the "References" element
                     */
                    void unsetReferences();
                    
                    /**
                     * Gets the "Description" element
                     */
                    java.lang.String getDescription();
                    
                    /**
                     * Gets (as xml) the "Description" element
                     */
                    x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car xgetDescription();
                    
                    /**
                     * Sets the "Description" element
                     */
                    void setDescription(java.lang.String description);
                    
                    /**
                     * Sets (as xml) the "Description" element
                     */
                    void xsetDescription(x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car description);
                    
                    /**
                     * Gets the "DebitAmount" element
                     */
                    java.math.BigDecimal getDebitAmount();
                    
                    /**
                     * Gets (as xml) the "DebitAmount" element
                     */
                    x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetDebitAmount();
                    
                    /**
                     * True if has "DebitAmount" element
                     */
                    boolean isSetDebitAmount();
                    
                    /**
                     * Sets the "DebitAmount" element
                     */
                    void setDebitAmount(java.math.BigDecimal debitAmount);
                    
                    /**
                     * Sets (as xml) the "DebitAmount" element
                     */
                    void xsetDebitAmount(x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType debitAmount);
                    
                    /**
                     * Unsets the "DebitAmount" element
                     */
                    void unsetDebitAmount();
                    
                    /**
                     * Gets the "CreditAmount" element
                     */
                    java.math.BigDecimal getCreditAmount();
                    
                    /**
                     * Gets (as xml) the "CreditAmount" element
                     */
                    x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetCreditAmount();
                    
                    /**
                     * True if has "CreditAmount" element
                     */
                    boolean isSetCreditAmount();
                    
                    /**
                     * Sets the "CreditAmount" element
                     */
                    void setCreditAmount(java.math.BigDecimal creditAmount);
                    
                    /**
                     * Sets (as xml) the "CreditAmount" element
                     */
                    void xsetCreditAmount(x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType creditAmount);
                    
                    /**
                     * Unsets the "CreditAmount" element
                     */
                    void unsetCreditAmount();
                    
                    /**
                     * Gets the "Tax" element
                     */
                    x0101.oecdStandardAuditFileTaxPT1.TaxDocument.Tax getTax();
                    
                    /**
                     * True if has "Tax" element
                     */
                    boolean isSetTax();
                    
                    /**
                     * Sets the "Tax" element
                     */
                    void setTax(x0101.oecdStandardAuditFileTaxPT1.TaxDocument.Tax tax);
                    
                    /**
                     * Appends and returns a new empty "Tax" element
                     */
                    x0101.oecdStandardAuditFileTaxPT1.TaxDocument.Tax addNewTax();
                    
                    /**
                     * Unsets the "Tax" element
                     */
                    void unsetTax();
                    
                    /**
                     * Gets the "TaxExemptionReason" element
                     */
                    java.lang.String getTaxExemptionReason();
                    
                    /**
                     * Gets (as xml) the "TaxExemptionReason" element
                     */
                    x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car xgetTaxExemptionReason();
                    
                    /**
                     * True if has "TaxExemptionReason" element
                     */
                    boolean isSetTaxExemptionReason();
                    
                    /**
                     * Sets the "TaxExemptionReason" element
                     */
                    void setTaxExemptionReason(java.lang.String taxExemptionReason);
                    
                    /**
                     * Sets (as xml) the "TaxExemptionReason" element
                     */
                    void xsetTaxExemptionReason(x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car taxExemptionReason);
                    
                    /**
                     * Unsets the "TaxExemptionReason" element
                     */
                    void unsetTaxExemptionReason();
                    
                    /**
                     * Gets the "SettlementAmount" element
                     */
                    java.math.BigDecimal getSettlementAmount();
                    
                    /**
                     * Gets (as xml) the "SettlementAmount" element
                     */
                    x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetSettlementAmount();
                    
                    /**
                     * True if has "SettlementAmount" element
                     */
                    boolean isSetSettlementAmount();
                    
                    /**
                     * Sets the "SettlementAmount" element
                     */
                    void setSettlementAmount(java.math.BigDecimal settlementAmount);
                    
                    /**
                     * Sets (as xml) the "SettlementAmount" element
                     */
                    void xsetSettlementAmount(x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType settlementAmount);
                    
                    /**
                     * Unsets the "SettlementAmount" element
                     */
                    void unsetSettlementAmount();
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line newInstance() {
                        return (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML DocumentTotals(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01).
                 *
                 * This is a complex type.
                 */
                public interface DocumentTotals extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DocumentTotals.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD333BD87CA6FBD44E91365563B1F8A20").resolveHandle("documenttotalsb74delemtype");
                    
                    /**
                     * Gets the "TaxPayable" element
                     */
                    java.math.BigDecimal getTaxPayable();
                    
                    /**
                     * Gets (as xml) the "TaxPayable" element
                     */
                    x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetTaxPayable();
                    
                    /**
                     * Sets the "TaxPayable" element
                     */
                    void setTaxPayable(java.math.BigDecimal taxPayable);
                    
                    /**
                     * Sets (as xml) the "TaxPayable" element
                     */
                    void xsetTaxPayable(x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType taxPayable);
                    
                    /**
                     * Gets the "NetTotal" element
                     */
                    java.math.BigDecimal getNetTotal();
                    
                    /**
                     * Gets (as xml) the "NetTotal" element
                     */
                    x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetNetTotal();
                    
                    /**
                     * Sets the "NetTotal" element
                     */
                    void setNetTotal(java.math.BigDecimal netTotal);
                    
                    /**
                     * Sets (as xml) the "NetTotal" element
                     */
                    void xsetNetTotal(x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType netTotal);
                    
                    /**
                     * Gets the "GrossTotal" element
                     */
                    java.math.BigDecimal getGrossTotal();
                    
                    /**
                     * Gets (as xml) the "GrossTotal" element
                     */
                    x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetGrossTotal();
                    
                    /**
                     * Sets the "GrossTotal" element
                     */
                    void setGrossTotal(java.math.BigDecimal grossTotal);
                    
                    /**
                     * Sets (as xml) the "GrossTotal" element
                     */
                    void xsetGrossTotal(x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType grossTotal);
                    
                    /**
                     * Gets the "Currency" element
                     */
                    x0101.oecdStandardAuditFileTaxPT1.CurrencyDocument.Currency getCurrency();
                    
                    /**
                     * True if has "Currency" element
                     */
                    boolean isSetCurrency();
                    
                    /**
                     * Sets the "Currency" element
                     */
                    void setCurrency(x0101.oecdStandardAuditFileTaxPT1.CurrencyDocument.Currency currency);
                    
                    /**
                     * Appends and returns a new empty "Currency" element
                     */
                    x0101.oecdStandardAuditFileTaxPT1.CurrencyDocument.Currency addNewCurrency();
                    
                    /**
                     * Unsets the "Currency" element
                     */
                    void unsetCurrency();
                    
                    /**
                     * Gets the "Settlement" element
                     */
                    x0101.oecdStandardAuditFileTaxPT1.SettlementDocument.Settlement getSettlement();
                    
                    /**
                     * True if has "Settlement" element
                     */
                    boolean isSetSettlement();
                    
                    /**
                     * Sets the "Settlement" element
                     */
                    void setSettlement(x0101.oecdStandardAuditFileTaxPT1.SettlementDocument.Settlement settlement);
                    
                    /**
                     * Appends and returns a new empty "Settlement" element
                     */
                    x0101.oecdStandardAuditFileTaxPT1.SettlementDocument.Settlement addNewSettlement();
                    
                    /**
                     * Unsets the "Settlement" element
                     */
                    void unsetSettlement();
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentTotals newInstance() {
                        return (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentTotals) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentTotals newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentTotals) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice newInstance() {
                      return (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices newInstance() {
                  return (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments newInstance() {
              return (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument newInstance() {
          return (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
