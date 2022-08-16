/*
 * An XML document type.
 * Localname: SourceDocuments
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.03_01
 * Java type: x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument
 *
 * Automatically generated - do not modify.
 */
package x0301.oecdStandardAuditFileTaxPT1;


/**
 * A document containing one SourceDocuments(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01) element.
 *
 * This is a complex type.
 */
public interface SourceDocumentsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SourceDocumentsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB56920DEA176B941910A868497F4EE85").resolveHandle("sourcedocuments5365doctype");
    
    /**
     * Gets the "SourceDocuments" element
     */
    x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments getSourceDocuments();
    
    /**
     * Sets the "SourceDocuments" element
     */
    void setSourceDocuments(x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments sourceDocuments);
    
    /**
     * Appends and returns a new empty "SourceDocuments" element
     */
    x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments addNewSourceDocuments();
    
    /**
     * An XML SourceDocuments(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
     *
     * This is a complex type.
     */
    public interface SourceDocuments extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SourceDocuments.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB56920DEA176B941910A868497F4EE85").resolveHandle("sourcedocumentsed0eelemtype");
        
        /**
         * Gets the "SalesInvoices" element
         */
        x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices getSalesInvoices();
        
        /**
         * True if has "SalesInvoices" element
         */
        boolean isSetSalesInvoices();
        
        /**
         * Sets the "SalesInvoices" element
         */
        void setSalesInvoices(x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices salesInvoices);
        
        /**
         * Appends and returns a new empty "SalesInvoices" element
         */
        x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices addNewSalesInvoices();
        
        /**
         * Unsets the "SalesInvoices" element
         */
        void unsetSalesInvoices();
        
        /**
         * Gets the "MovementOfGoods" element
         */
        x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods getMovementOfGoods();
        
        /**
         * True if has "MovementOfGoods" element
         */
        boolean isSetMovementOfGoods();
        
        /**
         * Sets the "MovementOfGoods" element
         */
        void setMovementOfGoods(x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods movementOfGoods);
        
        /**
         * Appends and returns a new empty "MovementOfGoods" element
         */
        x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods addNewMovementOfGoods();
        
        /**
         * Unsets the "MovementOfGoods" element
         */
        void unsetMovementOfGoods();
        
        /**
         * Gets the "WorkingDocuments" element
         */
        x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments getWorkingDocuments();
        
        /**
         * True if has "WorkingDocuments" element
         */
        boolean isSetWorkingDocuments();
        
        /**
         * Sets the "WorkingDocuments" element
         */
        void setWorkingDocuments(x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments workingDocuments);
        
        /**
         * Appends and returns a new empty "WorkingDocuments" element
         */
        x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments addNewWorkingDocuments();
        
        /**
         * Unsets the "WorkingDocuments" element
         */
        void unsetWorkingDocuments();
        
        /**
         * Gets the "Payments" element
         */
        x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments getPayments();
        
        /**
         * True if has "Payments" element
         */
        boolean isSetPayments();
        
        /**
         * Sets the "Payments" element
         */
        void setPayments(x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments payments);
        
        /**
         * Appends and returns a new empty "Payments" element
         */
        x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments addNewPayments();
        
        /**
         * Unsets the "Payments" element
         */
        void unsetPayments();
        
        /**
         * An XML SalesInvoices(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
         *
         * This is a complex type.
         */
        public interface SalesInvoices extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SalesInvoices.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB56920DEA176B941910A868497F4EE85").resolveHandle("salesinvoices62ecelemtype");
            
            /**
             * Gets the "NumberOfEntries" element
             */
            java.math.BigInteger getNumberOfEntries();
            
            /**
             * Gets (as xml) the "NumberOfEntries" element
             */
            org.apache.xmlbeans.XmlNonNegativeInteger xgetNumberOfEntries();
            
            /**
             * Sets the "NumberOfEntries" element
             */
            void setNumberOfEntries(java.math.BigInteger numberOfEntries);
            
            /**
             * Sets (as xml) the "NumberOfEntries" element
             */
            void xsetNumberOfEntries(org.apache.xmlbeans.XmlNonNegativeInteger numberOfEntries);
            
            /**
             * Gets the "TotalDebit" element
             */
            java.math.BigDecimal getTotalDebit();
            
            /**
             * Gets (as xml) the "TotalDebit" element
             */
            x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetTotalDebit();
            
            /**
             * Sets the "TotalDebit" element
             */
            void setTotalDebit(java.math.BigDecimal totalDebit);
            
            /**
             * Sets (as xml) the "TotalDebit" element
             */
            void xsetTotalDebit(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType totalDebit);
            
            /**
             * Gets the "TotalCredit" element
             */
            java.math.BigDecimal getTotalCredit();
            
            /**
             * Gets (as xml) the "TotalCredit" element
             */
            x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetTotalCredit();
            
            /**
             * Sets the "TotalCredit" element
             */
            void setTotalCredit(java.math.BigDecimal totalCredit);
            
            /**
             * Sets (as xml) the "TotalCredit" element
             */
            void xsetTotalCredit(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType totalCredit);
            
            /**
             * Gets a List of "Invoice" elements
             */
            java.util.List<x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice> getInvoiceList();
            
            /**
             * Gets array of all "Invoice" elements
             * @deprecated
             */
            @Deprecated
            x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice[] getInvoiceArray();
            
            /**
             * Gets ith "Invoice" element
             */
            x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice getInvoiceArray(int i);
            
            /**
             * Returns number of "Invoice" element
             */
            int sizeOfInvoiceArray();
            
            /**
             * Sets array of all "Invoice" element
             */
            void setInvoiceArray(x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice[] invoiceArray);
            
            /**
             * Sets ith "Invoice" element
             */
            void setInvoiceArray(int i, x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice invoice);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Invoice" element
             */
            x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice insertNewInvoice(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Invoice" element
             */
            x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice addNewInvoice();
            
            /**
             * Removes the ith "Invoice" element
             */
            void removeInvoice(int i);
            
            /**
             * An XML Invoice(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
             *
             * This is a complex type.
             */
            public interface Invoice extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Invoice.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB56920DEA176B941910A868497F4EE85").resolveHandle("invoicef8a5elemtype");
                
                /**
                 * Gets the "InvoiceNo" element
                 */
                java.lang.String getInvoiceNo();
                
                /**
                 * Gets (as xml) the "InvoiceNo" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.InvoiceNoDocument.InvoiceNo xgetInvoiceNo();
                
                /**
                 * Sets the "InvoiceNo" element
                 */
                void setInvoiceNo(java.lang.String invoiceNo);
                
                /**
                 * Sets (as xml) the "InvoiceNo" element
                 */
                void xsetInvoiceNo(x0301.oecdStandardAuditFileTaxPT1.InvoiceNoDocument.InvoiceNo invoiceNo);
                
                /**
                 * Gets the "DocumentStatus" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentStatus getDocumentStatus();
                
                /**
                 * Sets the "DocumentStatus" element
                 */
                void setDocumentStatus(x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentStatus documentStatus);
                
                /**
                 * Appends and returns a new empty "DocumentStatus" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentStatus addNewDocumentStatus();
                
                /**
                 * Gets the "Hash" element
                 */
                java.lang.String getHash();
                
                /**
                 * Gets (as xml) the "Hash" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax172Car xgetHash();
                
                /**
                 * Sets the "Hash" element
                 */
                void setHash(java.lang.String hash);
                
                /**
                 * Sets (as xml) the "Hash" element
                 */
                void xsetHash(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax172Car hash);
                
                /**
                 * Gets the "HashControl" element
                 */
                java.lang.String getHashControl();
                
                /**
                 * Gets (as xml) the "HashControl" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax40Car xgetHashControl();
                
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
                void xsetHashControl(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax40Car hashControl);
                
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
                x0301.oecdStandardAuditFileTaxPT1.PeriodDocument.Period xgetPeriod();
                
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
                void xsetPeriod(x0301.oecdStandardAuditFileTaxPT1.PeriodDocument.Period period);
                
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
                x0301.oecdStandardAuditFileTaxPT1.SAFdateType xgetInvoiceDate();
                
                /**
                 * Sets the "InvoiceDate" element
                 */
                void setInvoiceDate(java.util.Calendar invoiceDate);
                
                /**
                 * Sets (as xml) the "InvoiceDate" element
                 */
                void xsetInvoiceDate(x0301.oecdStandardAuditFileTaxPT1.SAFdateType invoiceDate);
                
                /**
                 * Gets the "InvoiceType" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType.Enum getInvoiceType();
                
                /**
                 * Gets (as xml) the "InvoiceType" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType xgetInvoiceType();
                
                /**
                 * Sets the "InvoiceType" element
                 */
                void setInvoiceType(x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType.Enum invoiceType);
                
                /**
                 * Sets (as xml) the "InvoiceType" element
                 */
                void xsetInvoiceType(x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType invoiceType);
                
                /**
                 * Gets the "SpecialRegimes" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SpecialRegimes getSpecialRegimes();
                
                /**
                 * Sets the "SpecialRegimes" element
                 */
                void setSpecialRegimes(x0301.oecdStandardAuditFileTaxPT1.SpecialRegimes specialRegimes);
                
                /**
                 * Appends and returns a new empty "SpecialRegimes" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SpecialRegimes addNewSpecialRegimes();
                
                /**
                 * Gets the "SourceID" element
                 */
                java.lang.String getSourceID();
                
                /**
                 * Gets (as xml) the "SourceID" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetSourceID();
                
                /**
                 * Sets the "SourceID" element
                 */
                void setSourceID(java.lang.String sourceID);
                
                /**
                 * Sets (as xml) the "SourceID" element
                 */
                void xsetSourceID(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car sourceID);
                
                /**
                 * Gets the "EACCode" element
                 */
                java.lang.String getEACCode();
                
                /**
                 * Gets (as xml) the "EACCode" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.EACCodeDocument.EACCode xgetEACCode();
                
                /**
                 * True if has "EACCode" element
                 */
                boolean isSetEACCode();
                
                /**
                 * Sets the "EACCode" element
                 */
                void setEACCode(java.lang.String eacCode);
                
                /**
                 * Sets (as xml) the "EACCode" element
                 */
                void xsetEACCode(x0301.oecdStandardAuditFileTaxPT1.EACCodeDocument.EACCode eacCode);
                
                /**
                 * Unsets the "EACCode" element
                 */
                void unsetEACCode();
                
                /**
                 * Gets the "SystemEntryDate" element
                 */
                java.util.Calendar getSystemEntryDate();
                
                /**
                 * Gets (as xml) the "SystemEntryDate" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType xgetSystemEntryDate();
                
                /**
                 * Sets the "SystemEntryDate" element
                 */
                void setSystemEntryDate(java.util.Calendar systemEntryDate);
                
                /**
                 * Sets (as xml) the "SystemEntryDate" element
                 */
                void xsetSystemEntryDate(x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType systemEntryDate);
                
                /**
                 * Gets the "TransactionID" element
                 */
                java.lang.String getTransactionID();
                
                /**
                 * Gets (as xml) the "TransactionID" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFPTTransactionID xgetTransactionID();
                
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
                void xsetTransactionID(x0301.oecdStandardAuditFileTaxPT1.SAFPTTransactionID transactionID);
                
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
                x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetCustomerID();
                
                /**
                 * Sets the "CustomerID" element
                 */
                void setCustomerID(java.lang.String customerID);
                
                /**
                 * Sets (as xml) the "CustomerID" element
                 */
                void xsetCustomerID(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car customerID);
                
                /**
                 * Gets the "ShipTo" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure getShipTo();
                
                /**
                 * True if has "ShipTo" element
                 */
                boolean isSetShipTo();
                
                /**
                 * Sets the "ShipTo" element
                 */
                void setShipTo(x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure shipTo);
                
                /**
                 * Appends and returns a new empty "ShipTo" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure addNewShipTo();
                
                /**
                 * Unsets the "ShipTo" element
                 */
                void unsetShipTo();
                
                /**
                 * Gets the "ShipFrom" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure getShipFrom();
                
                /**
                 * True if has "ShipFrom" element
                 */
                boolean isSetShipFrom();
                
                /**
                 * Sets the "ShipFrom" element
                 */
                void setShipFrom(x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure shipFrom);
                
                /**
                 * Appends and returns a new empty "ShipFrom" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure addNewShipFrom();
                
                /**
                 * Unsets the "ShipFrom" element
                 */
                void unsetShipFrom();
                
                /**
                 * Gets the "MovementEndTime" element
                 */
                java.util.Calendar getMovementEndTime();
                
                /**
                 * Gets (as xml) the "MovementEndTime" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType xgetMovementEndTime();
                
                /**
                 * True if has "MovementEndTime" element
                 */
                boolean isSetMovementEndTime();
                
                /**
                 * Sets the "MovementEndTime" element
                 */
                void setMovementEndTime(java.util.Calendar movementEndTime);
                
                /**
                 * Sets (as xml) the "MovementEndTime" element
                 */
                void xsetMovementEndTime(x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType movementEndTime);
                
                /**
                 * Unsets the "MovementEndTime" element
                 */
                void unsetMovementEndTime();
                
                /**
                 * Gets the "MovementStartTime" element
                 */
                java.util.Calendar getMovementStartTime();
                
                /**
                 * Gets (as xml) the "MovementStartTime" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType xgetMovementStartTime();
                
                /**
                 * True if has "MovementStartTime" element
                 */
                boolean isSetMovementStartTime();
                
                /**
                 * Sets the "MovementStartTime" element
                 */
                void setMovementStartTime(java.util.Calendar movementStartTime);
                
                /**
                 * Sets (as xml) the "MovementStartTime" element
                 */
                void xsetMovementStartTime(x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType movementStartTime);
                
                /**
                 * Unsets the "MovementStartTime" element
                 */
                void unsetMovementStartTime();
                
                /**
                 * Gets a List of "Line" elements
                 */
                java.util.List<x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line> getLineList();
                
                /**
                 * Gets array of all "Line" elements
                 * @deprecated
                 */
                @Deprecated
                x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line[] getLineArray();
                
                /**
                 * Gets ith "Line" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line getLineArray(int i);
                
                /**
                 * Returns number of "Line" element
                 */
                int sizeOfLineArray();
                
                /**
                 * Sets array of all "Line" element
                 */
                void setLineArray(x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line[] lineArray);
                
                /**
                 * Sets ith "Line" element
                 */
                void setLineArray(int i, x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line line);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "Line" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line insertNewLine(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "Line" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line addNewLine();
                
                /**
                 * Removes the ith "Line" element
                 */
                void removeLine(int i);
                
                /**
                 * Gets the "DocumentTotals" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentTotals getDocumentTotals();
                
                /**
                 * Sets the "DocumentTotals" element
                 */
                void setDocumentTotals(x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentTotals documentTotals);
                
                /**
                 * Appends and returns a new empty "DocumentTotals" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentTotals addNewDocumentTotals();
                
                /**
                 * Gets a List of "WithholdingTax" elements
                 */
                java.util.List<x0301.oecdStandardAuditFileTaxPT1.WithholdingTax> getWithholdingTaxList();
                
                /**
                 * Gets array of all "WithholdingTax" elements
                 * @deprecated
                 */
                @Deprecated
                x0301.oecdStandardAuditFileTaxPT1.WithholdingTax[] getWithholdingTaxArray();
                
                /**
                 * Gets ith "WithholdingTax" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.WithholdingTax getWithholdingTaxArray(int i);
                
                /**
                 * Returns number of "WithholdingTax" element
                 */
                int sizeOfWithholdingTaxArray();
                
                /**
                 * Sets array of all "WithholdingTax" element
                 */
                void setWithholdingTaxArray(x0301.oecdStandardAuditFileTaxPT1.WithholdingTax[] withholdingTaxArray);
                
                /**
                 * Sets ith "WithholdingTax" element
                 */
                void setWithholdingTaxArray(int i, x0301.oecdStandardAuditFileTaxPT1.WithholdingTax withholdingTax);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "WithholdingTax" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.WithholdingTax insertNewWithholdingTax(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "WithholdingTax" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.WithholdingTax addNewWithholdingTax();
                
                /**
                 * Removes the ith "WithholdingTax" element
                 */
                void removeWithholdingTax(int i);
                
                /**
                 * An XML DocumentStatus(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
                 *
                 * This is a complex type.
                 */
                public interface DocumentStatus extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DocumentStatus.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB56920DEA176B941910A868497F4EE85").resolveHandle("documentstatus8b4eelemtype");
                    
                    /**
                     * Gets the "InvoiceStatus" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument.InvoiceStatus.Enum getInvoiceStatus();
                    
                    /**
                     * Gets (as xml) the "InvoiceStatus" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument.InvoiceStatus xgetInvoiceStatus();
                    
                    /**
                     * Sets the "InvoiceStatus" element
                     */
                    void setInvoiceStatus(x0301.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument.InvoiceStatus.Enum invoiceStatus);
                    
                    /**
                     * Sets (as xml) the "InvoiceStatus" element
                     */
                    void xsetInvoiceStatus(x0301.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument.InvoiceStatus invoiceStatus);
                    
                    /**
                     * Gets the "InvoiceStatusDate" element
                     */
                    java.util.Calendar getInvoiceStatusDate();
                    
                    /**
                     * Gets (as xml) the "InvoiceStatusDate" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType xgetInvoiceStatusDate();
                    
                    /**
                     * Sets the "InvoiceStatusDate" element
                     */
                    void setInvoiceStatusDate(java.util.Calendar invoiceStatusDate);
                    
                    /**
                     * Sets (as xml) the "InvoiceStatusDate" element
                     */
                    void xsetInvoiceStatusDate(x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType invoiceStatusDate);
                    
                    /**
                     * Gets the "Reason" element
                     */
                    java.lang.String getReason();
                    
                    /**
                     * Gets (as xml) the "Reason" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car xgetReason();
                    
                    /**
                     * True if has "Reason" element
                     */
                    boolean isSetReason();
                    
                    /**
                     * Sets the "Reason" element
                     */
                    void setReason(java.lang.String reason);
                    
                    /**
                     * Sets (as xml) the "Reason" element
                     */
                    void xsetReason(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car reason);
                    
                    /**
                     * Unsets the "Reason" element
                     */
                    void unsetReason();
                    
                    /**
                     * Gets the "SourceID" element
                     */
                    java.lang.String getSourceID();
                    
                    /**
                     * Gets (as xml) the "SourceID" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetSourceID();
                    
                    /**
                     * Sets the "SourceID" element
                     */
                    void setSourceID(java.lang.String sourceID);
                    
                    /**
                     * Sets (as xml) the "SourceID" element
                     */
                    void xsetSourceID(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car sourceID);
                    
                    /**
                     * Gets the "SourceBilling" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling.Enum getSourceBilling();
                    
                    /**
                     * Gets (as xml) the "SourceBilling" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling xgetSourceBilling();
                    
                    /**
                     * Sets the "SourceBilling" element
                     */
                    void setSourceBilling(x0301.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling.Enum sourceBilling);
                    
                    /**
                     * Sets (as xml) the "SourceBilling" element
                     */
                    void xsetSourceBilling(x0301.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling sourceBilling);
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentStatus newInstance() {
                        return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentStatus newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML Line(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
                 *
                 * This is a complex type.
                 */
                public interface Line extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Line.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB56920DEA176B941910A868497F4EE85").resolveHandle("line2955elemtype");
                    
                    /**
                     * Gets the "LineNumber" element
                     */
                    java.math.BigInteger getLineNumber();
                    
                    /**
                     * Gets (as xml) the "LineNumber" element
                     */
                    org.apache.xmlbeans.XmlNonNegativeInteger xgetLineNumber();
                    
                    /**
                     * Sets the "LineNumber" element
                     */
                    void setLineNumber(java.math.BigInteger lineNumber);
                    
                    /**
                     * Sets (as xml) the "LineNumber" element
                     */
                    void xsetLineNumber(org.apache.xmlbeans.XmlNonNegativeInteger lineNumber);
                    
                    /**
                     * Gets a List of "OrderReferences" elements
                     */
                    java.util.List<x0301.oecdStandardAuditFileTaxPT1.OrderReferences> getOrderReferencesList();
                    
                    /**
                     * Gets array of all "OrderReferences" elements
                     * @deprecated
                     */
                    @Deprecated
                    x0301.oecdStandardAuditFileTaxPT1.OrderReferences[] getOrderReferencesArray();
                    
                    /**
                     * Gets ith "OrderReferences" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.OrderReferences getOrderReferencesArray(int i);
                    
                    /**
                     * Returns number of "OrderReferences" element
                     */
                    int sizeOfOrderReferencesArray();
                    
                    /**
                     * Sets array of all "OrderReferences" element
                     */
                    void setOrderReferencesArray(x0301.oecdStandardAuditFileTaxPT1.OrderReferences[] orderReferencesArray);
                    
                    /**
                     * Sets ith "OrderReferences" element
                     */
                    void setOrderReferencesArray(int i, x0301.oecdStandardAuditFileTaxPT1.OrderReferences orderReferences);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "OrderReferences" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.OrderReferences insertNewOrderReferences(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "OrderReferences" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.OrderReferences addNewOrderReferences();
                    
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
                    x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car xgetProductCode();
                    
                    /**
                     * Sets the "ProductCode" element
                     */
                    void setProductCode(java.lang.String productCode);
                    
                    /**
                     * Sets (as xml) the "ProductCode" element
                     */
                    void xsetProductCode(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car productCode);
                    
                    /**
                     * Gets the "ProductDescription" element
                     */
                    java.lang.String getProductDescription();
                    
                    /**
                     * Gets (as xml) the "ProductDescription" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car xgetProductDescription();
                    
                    /**
                     * Sets the "ProductDescription" element
                     */
                    void setProductDescription(java.lang.String productDescription);
                    
                    /**
                     * Sets (as xml) the "ProductDescription" element
                     */
                    void xsetProductDescription(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car productDescription);
                    
                    /**
                     * Gets the "Quantity" element
                     */
                    java.math.BigDecimal getQuantity();
                    
                    /**
                     * Gets (as xml) the "Quantity" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFdecimalType xgetQuantity();
                    
                    /**
                     * Sets the "Quantity" element
                     */
                    void setQuantity(java.math.BigDecimal quantity);
                    
                    /**
                     * Sets (as xml) the "Quantity" element
                     */
                    void xsetQuantity(x0301.oecdStandardAuditFileTaxPT1.SAFdecimalType quantity);
                    
                    /**
                     * Gets the "UnitOfMeasure" element
                     */
                    java.lang.String getUnitOfMeasure();
                    
                    /**
                     * Gets (as xml) the "UnitOfMeasure" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car xgetUnitOfMeasure();
                    
                    /**
                     * Sets the "UnitOfMeasure" element
                     */
                    void setUnitOfMeasure(java.lang.String unitOfMeasure);
                    
                    /**
                     * Sets (as xml) the "UnitOfMeasure" element
                     */
                    void xsetUnitOfMeasure(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car unitOfMeasure);
                    
                    /**
                     * Gets the "UnitPrice" element
                     */
                    java.math.BigDecimal getUnitPrice();
                    
                    /**
                     * Gets (as xml) the "UnitPrice" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetUnitPrice();
                    
                    /**
                     * Sets the "UnitPrice" element
                     */
                    void setUnitPrice(java.math.BigDecimal unitPrice);
                    
                    /**
                     * Sets (as xml) the "UnitPrice" element
                     */
                    void xsetUnitPrice(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType unitPrice);
                    
                    /**
                     * Gets the "TaxPointDate" element
                     */
                    java.util.Calendar getTaxPointDate();
                    
                    /**
                     * Gets (as xml) the "TaxPointDate" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFdateType xgetTaxPointDate();
                    
                    /**
                     * Sets the "TaxPointDate" element
                     */
                    void setTaxPointDate(java.util.Calendar taxPointDate);
                    
                    /**
                     * Sets (as xml) the "TaxPointDate" element
                     */
                    void xsetTaxPointDate(x0301.oecdStandardAuditFileTaxPT1.SAFdateType taxPointDate);
                    
                    /**
                     * Gets a List of "References" elements
                     */
                    java.util.List<x0301.oecdStandardAuditFileTaxPT1.References> getReferencesList();
                    
                    /**
                     * Gets array of all "References" elements
                     * @deprecated
                     */
                    @Deprecated
                    x0301.oecdStandardAuditFileTaxPT1.References[] getReferencesArray();
                    
                    /**
                     * Gets ith "References" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.References getReferencesArray(int i);
                    
                    /**
                     * Returns number of "References" element
                     */
                    int sizeOfReferencesArray();
                    
                    /**
                     * Sets array of all "References" element
                     */
                    void setReferencesArray(x0301.oecdStandardAuditFileTaxPT1.References[] referencesArray);
                    
                    /**
                     * Sets ith "References" element
                     */
                    void setReferencesArray(int i, x0301.oecdStandardAuditFileTaxPT1.References references);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "References" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.References insertNewReferences(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "References" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.References addNewReferences();
                    
                    /**
                     * Removes the ith "References" element
                     */
                    void removeReferences(int i);
                    
                    /**
                     * Gets the "Description" element
                     */
                    java.lang.String getDescription();
                    
                    /**
                     * Gets (as xml) the "Description" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car xgetDescription();
                    
                    /**
                     * Sets the "Description" element
                     */
                    void setDescription(java.lang.String description);
                    
                    /**
                     * Sets (as xml) the "Description" element
                     */
                    void xsetDescription(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car description);
                    
                    /**
                     * Gets the "DebitAmount" element
                     */
                    java.math.BigDecimal getDebitAmount();
                    
                    /**
                     * Gets (as xml) the "DebitAmount" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetDebitAmount();
                    
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
                    void xsetDebitAmount(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType debitAmount);
                    
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
                    x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetCreditAmount();
                    
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
                    void xsetCreditAmount(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType creditAmount);
                    
                    /**
                     * Unsets the "CreditAmount" element
                     */
                    void unsetCreditAmount();
                    
                    /**
                     * Gets the "Tax" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.Tax getTax();
                    
                    /**
                     * Sets the "Tax" element
                     */
                    void setTax(x0301.oecdStandardAuditFileTaxPT1.Tax tax);
                    
                    /**
                     * Appends and returns a new empty "Tax" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.Tax addNewTax();
                    
                    /**
                     * Gets the "TaxExemptionReason" element
                     */
                    java.lang.String getTaxExemptionReason();
                    
                    /**
                     * Gets (as xml) the "TaxExemptionReason" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemption xgetTaxExemptionReason();
                    
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
                    void xsetTaxExemptionReason(x0301.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemption taxExemptionReason);
                    
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
                    x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetSettlementAmount();
                    
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
                    void xsetSettlementAmount(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType settlementAmount);
                    
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
                      public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line newInstance() {
                        return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML DocumentTotals(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
                 *
                 * This is a complex type.
                 */
                public interface DocumentTotals extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DocumentTotals.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB56920DEA176B941910A868497F4EE85").resolveHandle("documenttotalsa00belemtype");
                    
                    /**
                     * Gets the "TaxPayable" element
                     */
                    java.math.BigDecimal getTaxPayable();
                    
                    /**
                     * Gets (as xml) the "TaxPayable" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetTaxPayable();
                    
                    /**
                     * Sets the "TaxPayable" element
                     */
                    void setTaxPayable(java.math.BigDecimal taxPayable);
                    
                    /**
                     * Sets (as xml) the "TaxPayable" element
                     */
                    void xsetTaxPayable(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType taxPayable);
                    
                    /**
                     * Gets the "NetTotal" element
                     */
                    java.math.BigDecimal getNetTotal();
                    
                    /**
                     * Gets (as xml) the "NetTotal" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetNetTotal();
                    
                    /**
                     * Sets the "NetTotal" element
                     */
                    void setNetTotal(java.math.BigDecimal netTotal);
                    
                    /**
                     * Sets (as xml) the "NetTotal" element
                     */
                    void xsetNetTotal(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType netTotal);
                    
                    /**
                     * Gets the "GrossTotal" element
                     */
                    java.math.BigDecimal getGrossTotal();
                    
                    /**
                     * Gets (as xml) the "GrossTotal" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetGrossTotal();
                    
                    /**
                     * Sets the "GrossTotal" element
                     */
                    void setGrossTotal(java.math.BigDecimal grossTotal);
                    
                    /**
                     * Sets (as xml) the "GrossTotal" element
                     */
                    void xsetGrossTotal(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType grossTotal);
                    
                    /**
                     * Gets the "Currency" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.Currency getCurrency();
                    
                    /**
                     * True if has "Currency" element
                     */
                    boolean isSetCurrency();
                    
                    /**
                     * Sets the "Currency" element
                     */
                    void setCurrency(x0301.oecdStandardAuditFileTaxPT1.Currency currency);
                    
                    /**
                     * Appends and returns a new empty "Currency" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.Currency addNewCurrency();
                    
                    /**
                     * Unsets the "Currency" element
                     */
                    void unsetCurrency();
                    
                    /**
                     * Gets a List of "Settlement" elements
                     */
                    java.util.List<x0301.oecdStandardAuditFileTaxPT1.Settlement> getSettlementList();
                    
                    /**
                     * Gets array of all "Settlement" elements
                     * @deprecated
                     */
                    @Deprecated
                    x0301.oecdStandardAuditFileTaxPT1.Settlement[] getSettlementArray();
                    
                    /**
                     * Gets ith "Settlement" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.Settlement getSettlementArray(int i);
                    
                    /**
                     * Returns number of "Settlement" element
                     */
                    int sizeOfSettlementArray();
                    
                    /**
                     * Sets array of all "Settlement" element
                     */
                    void setSettlementArray(x0301.oecdStandardAuditFileTaxPT1.Settlement[] settlementArray);
                    
                    /**
                     * Sets ith "Settlement" element
                     */
                    void setSettlementArray(int i, x0301.oecdStandardAuditFileTaxPT1.Settlement settlement);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "Settlement" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.Settlement insertNewSettlement(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "Settlement" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.Settlement addNewSettlement();
                    
                    /**
                     * Removes the ith "Settlement" element
                     */
                    void removeSettlement(int i);
                    
                    /**
                     * Gets a List of "Payment" elements
                     */
                    java.util.List<x0301.oecdStandardAuditFileTaxPT1.PaymentMethod> getPaymentList();
                    
                    /**
                     * Gets array of all "Payment" elements
                     * @deprecated
                     */
                    @Deprecated
                    x0301.oecdStandardAuditFileTaxPT1.PaymentMethod[] getPaymentArray();
                    
                    /**
                     * Gets ith "Payment" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.PaymentMethod getPaymentArray(int i);
                    
                    /**
                     * Returns number of "Payment" element
                     */
                    int sizeOfPaymentArray();
                    
                    /**
                     * Sets array of all "Payment" element
                     */
                    void setPaymentArray(x0301.oecdStandardAuditFileTaxPT1.PaymentMethod[] paymentArray);
                    
                    /**
                     * Sets ith "Payment" element
                     */
                    void setPaymentArray(int i, x0301.oecdStandardAuditFileTaxPT1.PaymentMethod payment);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "Payment" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.PaymentMethod insertNewPayment(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "Payment" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.PaymentMethod addNewPayment();
                    
                    /**
                     * Removes the ith "Payment" element
                     */
                    void removePayment(int i);
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentTotals newInstance() {
                        return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentTotals) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentTotals newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentTotals) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice newInstance() {
                      return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices newInstance() {
                  return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML MovementOfGoods(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
         *
         * This is a complex type.
         */
        public interface MovementOfGoods extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MovementOfGoods.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB56920DEA176B941910A868497F4EE85").resolveHandle("movementofgoods946aelemtype");
            
            /**
             * Gets the "NumberOfMovementLines" element
             */
            java.math.BigInteger getNumberOfMovementLines();
            
            /**
             * Gets (as xml) the "NumberOfMovementLines" element
             */
            org.apache.xmlbeans.XmlNonNegativeInteger xgetNumberOfMovementLines();
            
            /**
             * Sets the "NumberOfMovementLines" element
             */
            void setNumberOfMovementLines(java.math.BigInteger numberOfMovementLines);
            
            /**
             * Sets (as xml) the "NumberOfMovementLines" element
             */
            void xsetNumberOfMovementLines(org.apache.xmlbeans.XmlNonNegativeInteger numberOfMovementLines);
            
            /**
             * Gets the "TotalQuantityIssued" element
             */
            java.math.BigDecimal getTotalQuantityIssued();
            
            /**
             * Gets (as xml) the "TotalQuantityIssued" element
             */
            x0301.oecdStandardAuditFileTaxPT1.SAFdecimalType xgetTotalQuantityIssued();
            
            /**
             * Sets the "TotalQuantityIssued" element
             */
            void setTotalQuantityIssued(java.math.BigDecimal totalQuantityIssued);
            
            /**
             * Sets (as xml) the "TotalQuantityIssued" element
             */
            void xsetTotalQuantityIssued(x0301.oecdStandardAuditFileTaxPT1.SAFdecimalType totalQuantityIssued);
            
            /**
             * Gets a List of "StockMovement" elements
             */
            java.util.List<x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement> getStockMovementList();
            
            /**
             * Gets array of all "StockMovement" elements
             * @deprecated
             */
            @Deprecated
            x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement[] getStockMovementArray();
            
            /**
             * Gets ith "StockMovement" element
             */
            x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement getStockMovementArray(int i);
            
            /**
             * Returns number of "StockMovement" element
             */
            int sizeOfStockMovementArray();
            
            /**
             * Sets array of all "StockMovement" element
             */
            void setStockMovementArray(x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement[] stockMovementArray);
            
            /**
             * Sets ith "StockMovement" element
             */
            void setStockMovementArray(int i, x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement stockMovement);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "StockMovement" element
             */
            x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement insertNewStockMovement(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "StockMovement" element
             */
            x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement addNewStockMovement();
            
            /**
             * Removes the ith "StockMovement" element
             */
            void removeStockMovement(int i);
            
            /**
             * An XML StockMovement(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
             *
             * This is a complex type.
             */
            public interface StockMovement extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StockMovement.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB56920DEA176B941910A868497F4EE85").resolveHandle("stockmovement4c9belemtype");
                
                /**
                 * Gets the "DocumentNumber" element
                 */
                java.lang.String getDocumentNumber();
                
                /**
                 * Gets (as xml) the "DocumentNumber" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.DocumentNumberDocument.DocumentNumber xgetDocumentNumber();
                
                /**
                 * Sets the "DocumentNumber" element
                 */
                void setDocumentNumber(java.lang.String documentNumber);
                
                /**
                 * Sets (as xml) the "DocumentNumber" element
                 */
                void xsetDocumentNumber(x0301.oecdStandardAuditFileTaxPT1.DocumentNumberDocument.DocumentNumber documentNumber);
                
                /**
                 * Gets the "DocumentStatus" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.DocumentStatus getDocumentStatus();
                
                /**
                 * Sets the "DocumentStatus" element
                 */
                void setDocumentStatus(x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.DocumentStatus documentStatus);
                
                /**
                 * Appends and returns a new empty "DocumentStatus" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.DocumentStatus addNewDocumentStatus();
                
                /**
                 * Gets the "Hash" element
                 */
                java.lang.String getHash();
                
                /**
                 * Gets (as xml) the "Hash" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax172Car xgetHash();
                
                /**
                 * Sets the "Hash" element
                 */
                void setHash(java.lang.String hash);
                
                /**
                 * Sets (as xml) the "Hash" element
                 */
                void xsetHash(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax172Car hash);
                
                /**
                 * Gets the "HashControl" element
                 */
                java.lang.String getHashControl();
                
                /**
                 * Gets (as xml) the "HashControl" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax40Car xgetHashControl();
                
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
                void xsetHashControl(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax40Car hashControl);
                
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
                x0301.oecdStandardAuditFileTaxPT1.PeriodDocument.Period xgetPeriod();
                
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
                void xsetPeriod(x0301.oecdStandardAuditFileTaxPT1.PeriodDocument.Period period);
                
                /**
                 * Unsets the "Period" element
                 */
                void unsetPeriod();
                
                /**
                 * Gets the "MovementDate" element
                 */
                java.util.Calendar getMovementDate();
                
                /**
                 * Gets (as xml) the "MovementDate" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFdateType xgetMovementDate();
                
                /**
                 * Sets the "MovementDate" element
                 */
                void setMovementDate(java.util.Calendar movementDate);
                
                /**
                 * Sets (as xml) the "MovementDate" element
                 */
                void xsetMovementDate(x0301.oecdStandardAuditFileTaxPT1.SAFdateType movementDate);
                
                /**
                 * Gets the "MovementType" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.MovementTypeDocument.MovementType.Enum getMovementType();
                
                /**
                 * Gets (as xml) the "MovementType" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.MovementTypeDocument.MovementType xgetMovementType();
                
                /**
                 * Sets the "MovementType" element
                 */
                void setMovementType(x0301.oecdStandardAuditFileTaxPT1.MovementTypeDocument.MovementType.Enum movementType);
                
                /**
                 * Sets (as xml) the "MovementType" element
                 */
                void xsetMovementType(x0301.oecdStandardAuditFileTaxPT1.MovementTypeDocument.MovementType movementType);
                
                /**
                 * Gets the "SystemEntryDate" element
                 */
                java.util.Calendar getSystemEntryDate();
                
                /**
                 * Gets (as xml) the "SystemEntryDate" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType xgetSystemEntryDate();
                
                /**
                 * Sets the "SystemEntryDate" element
                 */
                void setSystemEntryDate(java.util.Calendar systemEntryDate);
                
                /**
                 * Sets (as xml) the "SystemEntryDate" element
                 */
                void xsetSystemEntryDate(x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType systemEntryDate);
                
                /**
                 * Gets the "TransactionID" element
                 */
                java.lang.String getTransactionID();
                
                /**
                 * Gets (as xml) the "TransactionID" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFPTTransactionID xgetTransactionID();
                
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
                void xsetTransactionID(x0301.oecdStandardAuditFileTaxPT1.SAFPTTransactionID transactionID);
                
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
                x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetCustomerID();
                
                /**
                 * True if has "CustomerID" element
                 */
                boolean isSetCustomerID();
                
                /**
                 * Sets the "CustomerID" element
                 */
                void setCustomerID(java.lang.String customerID);
                
                /**
                 * Sets (as xml) the "CustomerID" element
                 */
                void xsetCustomerID(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car customerID);
                
                /**
                 * Unsets the "CustomerID" element
                 */
                void unsetCustomerID();
                
                /**
                 * Gets the "SupplierID" element
                 */
                java.lang.String getSupplierID();
                
                /**
                 * Gets (as xml) the "SupplierID" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetSupplierID();
                
                /**
                 * True if has "SupplierID" element
                 */
                boolean isSetSupplierID();
                
                /**
                 * Sets the "SupplierID" element
                 */
                void setSupplierID(java.lang.String supplierID);
                
                /**
                 * Sets (as xml) the "SupplierID" element
                 */
                void xsetSupplierID(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car supplierID);
                
                /**
                 * Unsets the "SupplierID" element
                 */
                void unsetSupplierID();
                
                /**
                 * Gets the "SourceID" element
                 */
                java.lang.String getSourceID();
                
                /**
                 * Gets (as xml) the "SourceID" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetSourceID();
                
                /**
                 * Sets the "SourceID" element
                 */
                void setSourceID(java.lang.String sourceID);
                
                /**
                 * Sets (as xml) the "SourceID" element
                 */
                void xsetSourceID(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car sourceID);
                
                /**
                 * Gets the "EACCode" element
                 */
                java.lang.String getEACCode();
                
                /**
                 * Gets (as xml) the "EACCode" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.EACCodeDocument.EACCode xgetEACCode();
                
                /**
                 * True if has "EACCode" element
                 */
                boolean isSetEACCode();
                
                /**
                 * Sets the "EACCode" element
                 */
                void setEACCode(java.lang.String eacCode);
                
                /**
                 * Sets (as xml) the "EACCode" element
                 */
                void xsetEACCode(x0301.oecdStandardAuditFileTaxPT1.EACCodeDocument.EACCode eacCode);
                
                /**
                 * Unsets the "EACCode" element
                 */
                void unsetEACCode();
                
                /**
                 * Gets the "MovementComments" element
                 */
                java.lang.String getMovementComments();
                
                /**
                 * Gets (as xml) the "MovementComments" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car xgetMovementComments();
                
                /**
                 * True if has "MovementComments" element
                 */
                boolean isSetMovementComments();
                
                /**
                 * Sets the "MovementComments" element
                 */
                void setMovementComments(java.lang.String movementComments);
                
                /**
                 * Sets (as xml) the "MovementComments" element
                 */
                void xsetMovementComments(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car movementComments);
                
                /**
                 * Unsets the "MovementComments" element
                 */
                void unsetMovementComments();
                
                /**
                 * Gets the "ShipTo" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure getShipTo();
                
                /**
                 * True if has "ShipTo" element
                 */
                boolean isSetShipTo();
                
                /**
                 * Sets the "ShipTo" element
                 */
                void setShipTo(x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure shipTo);
                
                /**
                 * Appends and returns a new empty "ShipTo" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure addNewShipTo();
                
                /**
                 * Unsets the "ShipTo" element
                 */
                void unsetShipTo();
                
                /**
                 * Gets the "ShipFrom" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure getShipFrom();
                
                /**
                 * True if has "ShipFrom" element
                 */
                boolean isSetShipFrom();
                
                /**
                 * Sets the "ShipFrom" element
                 */
                void setShipFrom(x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure shipFrom);
                
                /**
                 * Appends and returns a new empty "ShipFrom" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure addNewShipFrom();
                
                /**
                 * Unsets the "ShipFrom" element
                 */
                void unsetShipFrom();
                
                /**
                 * Gets the "MovementEndTime" element
                 */
                java.util.Calendar getMovementEndTime();
                
                /**
                 * Gets (as xml) the "MovementEndTime" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType xgetMovementEndTime();
                
                /**
                 * True if has "MovementEndTime" element
                 */
                boolean isSetMovementEndTime();
                
                /**
                 * Sets the "MovementEndTime" element
                 */
                void setMovementEndTime(java.util.Calendar movementEndTime);
                
                /**
                 * Sets (as xml) the "MovementEndTime" element
                 */
                void xsetMovementEndTime(x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType movementEndTime);
                
                /**
                 * Unsets the "MovementEndTime" element
                 */
                void unsetMovementEndTime();
                
                /**
                 * Gets the "MovementStartTime" element
                 */
                java.util.Calendar getMovementStartTime();
                
                /**
                 * Gets (as xml) the "MovementStartTime" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType xgetMovementStartTime();
                
                /**
                 * Sets the "MovementStartTime" element
                 */
                void setMovementStartTime(java.util.Calendar movementStartTime);
                
                /**
                 * Sets (as xml) the "MovementStartTime" element
                 */
                void xsetMovementStartTime(x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType movementStartTime);
                
                /**
                 * Gets the "ATDocCodeID" element
                 */
                java.lang.String getATDocCodeID();
                
                /**
                 * Gets (as xml) the "ATDocCodeID" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car xgetATDocCodeID();
                
                /**
                 * True if has "ATDocCodeID" element
                 */
                boolean isSetATDocCodeID();
                
                /**
                 * Sets the "ATDocCodeID" element
                 */
                void setATDocCodeID(java.lang.String atDocCodeID);
                
                /**
                 * Sets (as xml) the "ATDocCodeID" element
                 */
                void xsetATDocCodeID(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car atDocCodeID);
                
                /**
                 * Unsets the "ATDocCodeID" element
                 */
                void unsetATDocCodeID();
                
                /**
                 * Gets a List of "Line" elements
                 */
                java.util.List<x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.Line> getLineList();
                
                /**
                 * Gets array of all "Line" elements
                 * @deprecated
                 */
                @Deprecated
                x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.Line[] getLineArray();
                
                /**
                 * Gets ith "Line" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.Line getLineArray(int i);
                
                /**
                 * Returns number of "Line" element
                 */
                int sizeOfLineArray();
                
                /**
                 * Sets array of all "Line" element
                 */
                void setLineArray(x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.Line[] lineArray);
                
                /**
                 * Sets ith "Line" element
                 */
                void setLineArray(int i, x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.Line line);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "Line" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.Line insertNewLine(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "Line" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.Line addNewLine();
                
                /**
                 * Removes the ith "Line" element
                 */
                void removeLine(int i);
                
                /**
                 * Gets the "DocumentTotals" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.DocumentTotals getDocumentTotals();
                
                /**
                 * Sets the "DocumentTotals" element
                 */
                void setDocumentTotals(x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.DocumentTotals documentTotals);
                
                /**
                 * Appends and returns a new empty "DocumentTotals" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.DocumentTotals addNewDocumentTotals();
                
                /**
                 * An XML DocumentStatus(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
                 *
                 * This is a complex type.
                 */
                public interface DocumentStatus extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DocumentStatus.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB56920DEA176B941910A868497F4EE85").resolveHandle("documentstatus2644elemtype");
                    
                    /**
                     * Gets the "MovementStatus" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.MovementStatusDocument.MovementStatus.Enum getMovementStatus();
                    
                    /**
                     * Gets (as xml) the "MovementStatus" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.MovementStatusDocument.MovementStatus xgetMovementStatus();
                    
                    /**
                     * Sets the "MovementStatus" element
                     */
                    void setMovementStatus(x0301.oecdStandardAuditFileTaxPT1.MovementStatusDocument.MovementStatus.Enum movementStatus);
                    
                    /**
                     * Sets (as xml) the "MovementStatus" element
                     */
                    void xsetMovementStatus(x0301.oecdStandardAuditFileTaxPT1.MovementStatusDocument.MovementStatus movementStatus);
                    
                    /**
                     * Gets the "MovementStatusDate" element
                     */
                    java.util.Calendar getMovementStatusDate();
                    
                    /**
                     * Gets (as xml) the "MovementStatusDate" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType xgetMovementStatusDate();
                    
                    /**
                     * Sets the "MovementStatusDate" element
                     */
                    void setMovementStatusDate(java.util.Calendar movementStatusDate);
                    
                    /**
                     * Sets (as xml) the "MovementStatusDate" element
                     */
                    void xsetMovementStatusDate(x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType movementStatusDate);
                    
                    /**
                     * Gets the "Reason" element
                     */
                    java.lang.String getReason();
                    
                    /**
                     * Gets (as xml) the "Reason" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car xgetReason();
                    
                    /**
                     * True if has "Reason" element
                     */
                    boolean isSetReason();
                    
                    /**
                     * Sets the "Reason" element
                     */
                    void setReason(java.lang.String reason);
                    
                    /**
                     * Sets (as xml) the "Reason" element
                     */
                    void xsetReason(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car reason);
                    
                    /**
                     * Unsets the "Reason" element
                     */
                    void unsetReason();
                    
                    /**
                     * Gets the "SourceID" element
                     */
                    java.lang.String getSourceID();
                    
                    /**
                     * Gets (as xml) the "SourceID" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetSourceID();
                    
                    /**
                     * Sets the "SourceID" element
                     */
                    void setSourceID(java.lang.String sourceID);
                    
                    /**
                     * Sets (as xml) the "SourceID" element
                     */
                    void xsetSourceID(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car sourceID);
                    
                    /**
                     * Gets the "SourceBilling" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling.Enum getSourceBilling();
                    
                    /**
                     * Gets (as xml) the "SourceBilling" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling xgetSourceBilling();
                    
                    /**
                     * Sets the "SourceBilling" element
                     */
                    void setSourceBilling(x0301.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling.Enum sourceBilling);
                    
                    /**
                     * Sets (as xml) the "SourceBilling" element
                     */
                    void xsetSourceBilling(x0301.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling sourceBilling);
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.DocumentStatus newInstance() {
                        return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.DocumentStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.DocumentStatus newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.DocumentStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML Line(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
                 *
                 * This is a complex type.
                 */
                public interface Line extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Line.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB56920DEA176B941910A868497F4EE85").resolveHandle("linecd4belemtype");
                    
                    /**
                     * Gets the "LineNumber" element
                     */
                    java.math.BigInteger getLineNumber();
                    
                    /**
                     * Gets (as xml) the "LineNumber" element
                     */
                    org.apache.xmlbeans.XmlNonNegativeInteger xgetLineNumber();
                    
                    /**
                     * Sets the "LineNumber" element
                     */
                    void setLineNumber(java.math.BigInteger lineNumber);
                    
                    /**
                     * Sets (as xml) the "LineNumber" element
                     */
                    void xsetLineNumber(org.apache.xmlbeans.XmlNonNegativeInteger lineNumber);
                    
                    /**
                     * Gets a List of "OrderReferences" elements
                     */
                    java.util.List<x0301.oecdStandardAuditFileTaxPT1.OrderReferences> getOrderReferencesList();
                    
                    /**
                     * Gets array of all "OrderReferences" elements
                     * @deprecated
                     */
                    @Deprecated
                    x0301.oecdStandardAuditFileTaxPT1.OrderReferences[] getOrderReferencesArray();
                    
                    /**
                     * Gets ith "OrderReferences" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.OrderReferences getOrderReferencesArray(int i);
                    
                    /**
                     * Returns number of "OrderReferences" element
                     */
                    int sizeOfOrderReferencesArray();
                    
                    /**
                     * Sets array of all "OrderReferences" element
                     */
                    void setOrderReferencesArray(x0301.oecdStandardAuditFileTaxPT1.OrderReferences[] orderReferencesArray);
                    
                    /**
                     * Sets ith "OrderReferences" element
                     */
                    void setOrderReferencesArray(int i, x0301.oecdStandardAuditFileTaxPT1.OrderReferences orderReferences);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "OrderReferences" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.OrderReferences insertNewOrderReferences(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "OrderReferences" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.OrderReferences addNewOrderReferences();
                    
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
                    x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car xgetProductCode();
                    
                    /**
                     * Sets the "ProductCode" element
                     */
                    void setProductCode(java.lang.String productCode);
                    
                    /**
                     * Sets (as xml) the "ProductCode" element
                     */
                    void xsetProductCode(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car productCode);
                    
                    /**
                     * Gets the "ProductDescription" element
                     */
                    java.lang.String getProductDescription();
                    
                    /**
                     * Gets (as xml) the "ProductDescription" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car xgetProductDescription();
                    
                    /**
                     * Sets the "ProductDescription" element
                     */
                    void setProductDescription(java.lang.String productDescription);
                    
                    /**
                     * Sets (as xml) the "ProductDescription" element
                     */
                    void xsetProductDescription(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car productDescription);
                    
                    /**
                     * Gets the "Quantity" element
                     */
                    java.math.BigDecimal getQuantity();
                    
                    /**
                     * Gets (as xml) the "Quantity" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFdecimalType xgetQuantity();
                    
                    /**
                     * Sets the "Quantity" element
                     */
                    void setQuantity(java.math.BigDecimal quantity);
                    
                    /**
                     * Sets (as xml) the "Quantity" element
                     */
                    void xsetQuantity(x0301.oecdStandardAuditFileTaxPT1.SAFdecimalType quantity);
                    
                    /**
                     * Gets the "UnitOfMeasure" element
                     */
                    java.lang.String getUnitOfMeasure();
                    
                    /**
                     * Gets (as xml) the "UnitOfMeasure" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car xgetUnitOfMeasure();
                    
                    /**
                     * Sets the "UnitOfMeasure" element
                     */
                    void setUnitOfMeasure(java.lang.String unitOfMeasure);
                    
                    /**
                     * Sets (as xml) the "UnitOfMeasure" element
                     */
                    void xsetUnitOfMeasure(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car unitOfMeasure);
                    
                    /**
                     * Gets the "UnitPrice" element
                     */
                    java.math.BigDecimal getUnitPrice();
                    
                    /**
                     * Gets (as xml) the "UnitPrice" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetUnitPrice();
                    
                    /**
                     * Sets the "UnitPrice" element
                     */
                    void setUnitPrice(java.math.BigDecimal unitPrice);
                    
                    /**
                     * Sets (as xml) the "UnitPrice" element
                     */
                    void xsetUnitPrice(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType unitPrice);
                    
                    /**
                     * Gets the "Description" element
                     */
                    java.lang.String getDescription();
                    
                    /**
                     * Gets (as xml) the "Description" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car xgetDescription();
                    
                    /**
                     * Sets the "Description" element
                     */
                    void setDescription(java.lang.String description);
                    
                    /**
                     * Sets (as xml) the "Description" element
                     */
                    void xsetDescription(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car description);
                    
                    /**
                     * Gets the "DebitAmount" element
                     */
                    java.math.BigDecimal getDebitAmount();
                    
                    /**
                     * Gets (as xml) the "DebitAmount" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetDebitAmount();
                    
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
                    void xsetDebitAmount(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType debitAmount);
                    
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
                    x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetCreditAmount();
                    
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
                    void xsetCreditAmount(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType creditAmount);
                    
                    /**
                     * Unsets the "CreditAmount" element
                     */
                    void unsetCreditAmount();
                    
                    /**
                     * Gets the "Tax" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.MovementTax getTax();
                    
                    /**
                     * True if has "Tax" element
                     */
                    boolean isSetTax();
                    
                    /**
                     * Sets the "Tax" element
                     */
                    void setTax(x0301.oecdStandardAuditFileTaxPT1.MovementTax tax);
                    
                    /**
                     * Appends and returns a new empty "Tax" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.MovementTax addNewTax();
                    
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
                    x0301.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemption xgetTaxExemptionReason();
                    
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
                    void xsetTaxExemptionReason(x0301.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemption taxExemptionReason);
                    
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
                    x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetSettlementAmount();
                    
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
                    void xsetSettlementAmount(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType settlementAmount);
                    
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
                      public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.Line newInstance() {
                        return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.Line) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.Line newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.Line) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML DocumentTotals(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
                 *
                 * This is a complex type.
                 */
                public interface DocumentTotals extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DocumentTotals.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB56920DEA176B941910A868497F4EE85").resolveHandle("documenttotals2e01elemtype");
                    
                    /**
                     * Gets the "TaxPayable" element
                     */
                    java.math.BigDecimal getTaxPayable();
                    
                    /**
                     * Gets (as xml) the "TaxPayable" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetTaxPayable();
                    
                    /**
                     * Sets the "TaxPayable" element
                     */
                    void setTaxPayable(java.math.BigDecimal taxPayable);
                    
                    /**
                     * Sets (as xml) the "TaxPayable" element
                     */
                    void xsetTaxPayable(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType taxPayable);
                    
                    /**
                     * Gets the "NetTotal" element
                     */
                    java.math.BigDecimal getNetTotal();
                    
                    /**
                     * Gets (as xml) the "NetTotal" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetNetTotal();
                    
                    /**
                     * Sets the "NetTotal" element
                     */
                    void setNetTotal(java.math.BigDecimal netTotal);
                    
                    /**
                     * Sets (as xml) the "NetTotal" element
                     */
                    void xsetNetTotal(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType netTotal);
                    
                    /**
                     * Gets the "GrossTotal" element
                     */
                    java.math.BigDecimal getGrossTotal();
                    
                    /**
                     * Gets (as xml) the "GrossTotal" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetGrossTotal();
                    
                    /**
                     * Sets the "GrossTotal" element
                     */
                    void setGrossTotal(java.math.BigDecimal grossTotal);
                    
                    /**
                     * Sets (as xml) the "GrossTotal" element
                     */
                    void xsetGrossTotal(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType grossTotal);
                    
                    /**
                     * Gets the "Currency" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.Currency getCurrency();
                    
                    /**
                     * True if has "Currency" element
                     */
                    boolean isSetCurrency();
                    
                    /**
                     * Sets the "Currency" element
                     */
                    void setCurrency(x0301.oecdStandardAuditFileTaxPT1.Currency currency);
                    
                    /**
                     * Appends and returns a new empty "Currency" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.Currency addNewCurrency();
                    
                    /**
                     * Unsets the "Currency" element
                     */
                    void unsetCurrency();
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.DocumentTotals newInstance() {
                        return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.DocumentTotals) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.DocumentTotals newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.DocumentTotals) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement newInstance() {
                      return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods newInstance() {
                  return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML WorkingDocuments(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
         *
         * This is a complex type.
         */
        public interface WorkingDocuments extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WorkingDocuments.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB56920DEA176B941910A868497F4EE85").resolveHandle("workingdocuments4f11elemtype");
            
            /**
             * Gets the "NumberOfEntries" element
             */
            java.math.BigInteger getNumberOfEntries();
            
            /**
             * Gets (as xml) the "NumberOfEntries" element
             */
            org.apache.xmlbeans.XmlNonNegativeInteger xgetNumberOfEntries();
            
            /**
             * Sets the "NumberOfEntries" element
             */
            void setNumberOfEntries(java.math.BigInteger numberOfEntries);
            
            /**
             * Sets (as xml) the "NumberOfEntries" element
             */
            void xsetNumberOfEntries(org.apache.xmlbeans.XmlNonNegativeInteger numberOfEntries);
            
            /**
             * Gets the "TotalDebit" element
             */
            java.math.BigDecimal getTotalDebit();
            
            /**
             * Gets (as xml) the "TotalDebit" element
             */
            x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetTotalDebit();
            
            /**
             * Sets the "TotalDebit" element
             */
            void setTotalDebit(java.math.BigDecimal totalDebit);
            
            /**
             * Sets (as xml) the "TotalDebit" element
             */
            void xsetTotalDebit(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType totalDebit);
            
            /**
             * Gets the "TotalCredit" element
             */
            java.math.BigDecimal getTotalCredit();
            
            /**
             * Gets (as xml) the "TotalCredit" element
             */
            x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetTotalCredit();
            
            /**
             * Sets the "TotalCredit" element
             */
            void setTotalCredit(java.math.BigDecimal totalCredit);
            
            /**
             * Sets (as xml) the "TotalCredit" element
             */
            void xsetTotalCredit(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType totalCredit);
            
            /**
             * Gets a List of "WorkDocument" elements
             */
            java.util.List<x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument> getWorkDocumentList();
            
            /**
             * Gets array of all "WorkDocument" elements
             * @deprecated
             */
            @Deprecated
            x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument[] getWorkDocumentArray();
            
            /**
             * Gets ith "WorkDocument" element
             */
            x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument getWorkDocumentArray(int i);
            
            /**
             * Returns number of "WorkDocument" element
             */
            int sizeOfWorkDocumentArray();
            
            /**
             * Sets array of all "WorkDocument" element
             */
            void setWorkDocumentArray(x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument[] workDocumentArray);
            
            /**
             * Sets ith "WorkDocument" element
             */
            void setWorkDocumentArray(int i, x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument workDocument);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "WorkDocument" element
             */
            x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument insertNewWorkDocument(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "WorkDocument" element
             */
            x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument addNewWorkDocument();
            
            /**
             * Removes the ith "WorkDocument" element
             */
            void removeWorkDocument(int i);
            
            /**
             * An XML WorkDocument(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
             *
             * This is a complex type.
             */
            public interface WorkDocument extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WorkDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB56920DEA176B941910A868497F4EE85").resolveHandle("workdocument9c09elemtype");
                
                /**
                 * Gets the "DocumentNumber" element
                 */
                java.lang.String getDocumentNumber();
                
                /**
                 * Gets (as xml) the "DocumentNumber" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.DocumentNumberDocument.DocumentNumber xgetDocumentNumber();
                
                /**
                 * Sets the "DocumentNumber" element
                 */
                void setDocumentNumber(java.lang.String documentNumber);
                
                /**
                 * Sets (as xml) the "DocumentNumber" element
                 */
                void xsetDocumentNumber(x0301.oecdStandardAuditFileTaxPT1.DocumentNumberDocument.DocumentNumber documentNumber);
                
                /**
                 * Gets the "DocumentStatus" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.DocumentStatus getDocumentStatus();
                
                /**
                 * Sets the "DocumentStatus" element
                 */
                void setDocumentStatus(x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.DocumentStatus documentStatus);
                
                /**
                 * Appends and returns a new empty "DocumentStatus" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.DocumentStatus addNewDocumentStatus();
                
                /**
                 * Gets the "Hash" element
                 */
                java.lang.String getHash();
                
                /**
                 * Gets (as xml) the "Hash" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax172Car xgetHash();
                
                /**
                 * Sets the "Hash" element
                 */
                void setHash(java.lang.String hash);
                
                /**
                 * Sets (as xml) the "Hash" element
                 */
                void xsetHash(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax172Car hash);
                
                /**
                 * Gets the "HashControl" element
                 */
                java.lang.String getHashControl();
                
                /**
                 * Gets (as xml) the "HashControl" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax40Car xgetHashControl();
                
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
                void xsetHashControl(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax40Car hashControl);
                
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
                x0301.oecdStandardAuditFileTaxPT1.PeriodDocument.Period xgetPeriod();
                
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
                void xsetPeriod(x0301.oecdStandardAuditFileTaxPT1.PeriodDocument.Period period);
                
                /**
                 * Unsets the "Period" element
                 */
                void unsetPeriod();
                
                /**
                 * Gets the "WorkDate" element
                 */
                java.util.Calendar getWorkDate();
                
                /**
                 * Gets (as xml) the "WorkDate" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFdateType xgetWorkDate();
                
                /**
                 * Sets the "WorkDate" element
                 */
                void setWorkDate(java.util.Calendar workDate);
                
                /**
                 * Sets (as xml) the "WorkDate" element
                 */
                void xsetWorkDate(x0301.oecdStandardAuditFileTaxPT1.SAFdateType workDate);
                
                /**
                 * Gets the "WorkType" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.WorkTypeDocument.WorkType.Enum getWorkType();
                
                /**
                 * Gets (as xml) the "WorkType" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.WorkTypeDocument.WorkType xgetWorkType();
                
                /**
                 * Sets the "WorkType" element
                 */
                void setWorkType(x0301.oecdStandardAuditFileTaxPT1.WorkTypeDocument.WorkType.Enum workType);
                
                /**
                 * Sets (as xml) the "WorkType" element
                 */
                void xsetWorkType(x0301.oecdStandardAuditFileTaxPT1.WorkTypeDocument.WorkType workType);
                
                /**
                 * Gets the "SourceID" element
                 */
                java.lang.String getSourceID();
                
                /**
                 * Gets (as xml) the "SourceID" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetSourceID();
                
                /**
                 * Sets the "SourceID" element
                 */
                void setSourceID(java.lang.String sourceID);
                
                /**
                 * Sets (as xml) the "SourceID" element
                 */
                void xsetSourceID(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car sourceID);
                
                /**
                 * Gets the "EACCode" element
                 */
                java.lang.String getEACCode();
                
                /**
                 * Gets (as xml) the "EACCode" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.EACCodeDocument.EACCode xgetEACCode();
                
                /**
                 * True if has "EACCode" element
                 */
                boolean isSetEACCode();
                
                /**
                 * Sets the "EACCode" element
                 */
                void setEACCode(java.lang.String eacCode);
                
                /**
                 * Sets (as xml) the "EACCode" element
                 */
                void xsetEACCode(x0301.oecdStandardAuditFileTaxPT1.EACCodeDocument.EACCode eacCode);
                
                /**
                 * Unsets the "EACCode" element
                 */
                void unsetEACCode();
                
                /**
                 * Gets the "SystemEntryDate" element
                 */
                java.util.Calendar getSystemEntryDate();
                
                /**
                 * Gets (as xml) the "SystemEntryDate" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType xgetSystemEntryDate();
                
                /**
                 * Sets the "SystemEntryDate" element
                 */
                void setSystemEntryDate(java.util.Calendar systemEntryDate);
                
                /**
                 * Sets (as xml) the "SystemEntryDate" element
                 */
                void xsetSystemEntryDate(x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType systemEntryDate);
                
                /**
                 * Gets the "CustomerID" element
                 */
                java.lang.String getCustomerID();
                
                /**
                 * Gets (as xml) the "CustomerID" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetCustomerID();
                
                /**
                 * Sets the "CustomerID" element
                 */
                void setCustomerID(java.lang.String customerID);
                
                /**
                 * Sets (as xml) the "CustomerID" element
                 */
                void xsetCustomerID(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car customerID);
                
                /**
                 * Gets a List of "Line" elements
                 */
                java.util.List<x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.Line> getLineList();
                
                /**
                 * Gets array of all "Line" elements
                 * @deprecated
                 */
                @Deprecated
                x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.Line[] getLineArray();
                
                /**
                 * Gets ith "Line" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.Line getLineArray(int i);
                
                /**
                 * Returns number of "Line" element
                 */
                int sizeOfLineArray();
                
                /**
                 * Sets array of all "Line" element
                 */
                void setLineArray(x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.Line[] lineArray);
                
                /**
                 * Sets ith "Line" element
                 */
                void setLineArray(int i, x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.Line line);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "Line" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.Line insertNewLine(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "Line" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.Line addNewLine();
                
                /**
                 * Removes the ith "Line" element
                 */
                void removeLine(int i);
                
                /**
                 * Gets the "DocumentTotals" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.DocumentTotals getDocumentTotals();
                
                /**
                 * Sets the "DocumentTotals" element
                 */
                void setDocumentTotals(x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.DocumentTotals documentTotals);
                
                /**
                 * Appends and returns a new empty "DocumentTotals" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.DocumentTotals addNewDocumentTotals();
                
                /**
                 * An XML DocumentStatus(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
                 *
                 * This is a complex type.
                 */
                public interface DocumentStatus extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DocumentStatus.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB56920DEA176B941910A868497F4EE85").resolveHandle("documentstatus75b2elemtype");
                    
                    /**
                     * Gets the "WorkStatus" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.WorkStatusDocument.WorkStatus.Enum getWorkStatus();
                    
                    /**
                     * Gets (as xml) the "WorkStatus" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.WorkStatusDocument.WorkStatus xgetWorkStatus();
                    
                    /**
                     * Sets the "WorkStatus" element
                     */
                    void setWorkStatus(x0301.oecdStandardAuditFileTaxPT1.WorkStatusDocument.WorkStatus.Enum workStatus);
                    
                    /**
                     * Sets (as xml) the "WorkStatus" element
                     */
                    void xsetWorkStatus(x0301.oecdStandardAuditFileTaxPT1.WorkStatusDocument.WorkStatus workStatus);
                    
                    /**
                     * Gets the "WorkStatusDate" element
                     */
                    java.util.Calendar getWorkStatusDate();
                    
                    /**
                     * Gets (as xml) the "WorkStatusDate" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType xgetWorkStatusDate();
                    
                    /**
                     * Sets the "WorkStatusDate" element
                     */
                    void setWorkStatusDate(java.util.Calendar workStatusDate);
                    
                    /**
                     * Sets (as xml) the "WorkStatusDate" element
                     */
                    void xsetWorkStatusDate(x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType workStatusDate);
                    
                    /**
                     * Gets the "Reason" element
                     */
                    java.lang.String getReason();
                    
                    /**
                     * Gets (as xml) the "Reason" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car xgetReason();
                    
                    /**
                     * True if has "Reason" element
                     */
                    boolean isSetReason();
                    
                    /**
                     * Sets the "Reason" element
                     */
                    void setReason(java.lang.String reason);
                    
                    /**
                     * Sets (as xml) the "Reason" element
                     */
                    void xsetReason(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car reason);
                    
                    /**
                     * Unsets the "Reason" element
                     */
                    void unsetReason();
                    
                    /**
                     * Gets the "SourceID" element
                     */
                    java.lang.String getSourceID();
                    
                    /**
                     * Gets (as xml) the "SourceID" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetSourceID();
                    
                    /**
                     * Sets the "SourceID" element
                     */
                    void setSourceID(java.lang.String sourceID);
                    
                    /**
                     * Sets (as xml) the "SourceID" element
                     */
                    void xsetSourceID(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car sourceID);
                    
                    /**
                     * Gets the "SourceBilling" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling.Enum getSourceBilling();
                    
                    /**
                     * Gets (as xml) the "SourceBilling" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling xgetSourceBilling();
                    
                    /**
                     * Sets the "SourceBilling" element
                     */
                    void setSourceBilling(x0301.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling.Enum sourceBilling);
                    
                    /**
                     * Sets (as xml) the "SourceBilling" element
                     */
                    void xsetSourceBilling(x0301.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling sourceBilling);
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.DocumentStatus newInstance() {
                        return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.DocumentStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.DocumentStatus newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.DocumentStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML Line(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
                 *
                 * This is a complex type.
                 */
                public interface Line extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Line.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB56920DEA176B941910A868497F4EE85").resolveHandle("line1cb9elemtype");
                    
                    /**
                     * Gets the "LineNumber" element
                     */
                    java.math.BigInteger getLineNumber();
                    
                    /**
                     * Gets (as xml) the "LineNumber" element
                     */
                    org.apache.xmlbeans.XmlNonNegativeInteger xgetLineNumber();
                    
                    /**
                     * Sets the "LineNumber" element
                     */
                    void setLineNumber(java.math.BigInteger lineNumber);
                    
                    /**
                     * Sets (as xml) the "LineNumber" element
                     */
                    void xsetLineNumber(org.apache.xmlbeans.XmlNonNegativeInteger lineNumber);
                    
                    /**
                     * Gets a List of "OrderReferences" elements
                     */
                    java.util.List<x0301.oecdStandardAuditFileTaxPT1.OrderReferences> getOrderReferencesList();
                    
                    /**
                     * Gets array of all "OrderReferences" elements
                     * @deprecated
                     */
                    @Deprecated
                    x0301.oecdStandardAuditFileTaxPT1.OrderReferences[] getOrderReferencesArray();
                    
                    /**
                     * Gets ith "OrderReferences" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.OrderReferences getOrderReferencesArray(int i);
                    
                    /**
                     * Returns number of "OrderReferences" element
                     */
                    int sizeOfOrderReferencesArray();
                    
                    /**
                     * Sets array of all "OrderReferences" element
                     */
                    void setOrderReferencesArray(x0301.oecdStandardAuditFileTaxPT1.OrderReferences[] orderReferencesArray);
                    
                    /**
                     * Sets ith "OrderReferences" element
                     */
                    void setOrderReferencesArray(int i, x0301.oecdStandardAuditFileTaxPT1.OrderReferences orderReferences);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "OrderReferences" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.OrderReferences insertNewOrderReferences(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "OrderReferences" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.OrderReferences addNewOrderReferences();
                    
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
                    x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car xgetProductCode();
                    
                    /**
                     * Sets the "ProductCode" element
                     */
                    void setProductCode(java.lang.String productCode);
                    
                    /**
                     * Sets (as xml) the "ProductCode" element
                     */
                    void xsetProductCode(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car productCode);
                    
                    /**
                     * Gets the "ProductDescription" element
                     */
                    java.lang.String getProductDescription();
                    
                    /**
                     * Gets (as xml) the "ProductDescription" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car xgetProductDescription();
                    
                    /**
                     * Sets the "ProductDescription" element
                     */
                    void setProductDescription(java.lang.String productDescription);
                    
                    /**
                     * Sets (as xml) the "ProductDescription" element
                     */
                    void xsetProductDescription(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car productDescription);
                    
                    /**
                     * Gets the "Quantity" element
                     */
                    java.math.BigDecimal getQuantity();
                    
                    /**
                     * Gets (as xml) the "Quantity" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFdecimalType xgetQuantity();
                    
                    /**
                     * Sets the "Quantity" element
                     */
                    void setQuantity(java.math.BigDecimal quantity);
                    
                    /**
                     * Sets (as xml) the "Quantity" element
                     */
                    void xsetQuantity(x0301.oecdStandardAuditFileTaxPT1.SAFdecimalType quantity);
                    
                    /**
                     * Gets the "UnitOfMeasure" element
                     */
                    java.lang.String getUnitOfMeasure();
                    
                    /**
                     * Gets (as xml) the "UnitOfMeasure" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car xgetUnitOfMeasure();
                    
                    /**
                     * Sets the "UnitOfMeasure" element
                     */
                    void setUnitOfMeasure(java.lang.String unitOfMeasure);
                    
                    /**
                     * Sets (as xml) the "UnitOfMeasure" element
                     */
                    void xsetUnitOfMeasure(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car unitOfMeasure);
                    
                    /**
                     * Gets the "UnitPrice" element
                     */
                    java.math.BigDecimal getUnitPrice();
                    
                    /**
                     * Gets (as xml) the "UnitPrice" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetUnitPrice();
                    
                    /**
                     * Sets the "UnitPrice" element
                     */
                    void setUnitPrice(java.math.BigDecimal unitPrice);
                    
                    /**
                     * Sets (as xml) the "UnitPrice" element
                     */
                    void xsetUnitPrice(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType unitPrice);
                    
                    /**
                     * Gets the "TaxPointDate" element
                     */
                    java.util.Calendar getTaxPointDate();
                    
                    /**
                     * Gets (as xml) the "TaxPointDate" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFdateType xgetTaxPointDate();
                    
                    /**
                     * Sets the "TaxPointDate" element
                     */
                    void setTaxPointDate(java.util.Calendar taxPointDate);
                    
                    /**
                     * Sets (as xml) the "TaxPointDate" element
                     */
                    void xsetTaxPointDate(x0301.oecdStandardAuditFileTaxPT1.SAFdateType taxPointDate);
                    
                    /**
                     * Gets the "Description" element
                     */
                    java.lang.String getDescription();
                    
                    /**
                     * Gets (as xml) the "Description" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car xgetDescription();
                    
                    /**
                     * Sets the "Description" element
                     */
                    void setDescription(java.lang.String description);
                    
                    /**
                     * Sets (as xml) the "Description" element
                     */
                    void xsetDescription(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car description);
                    
                    /**
                     * Gets the "DebitAmount" element
                     */
                    java.math.BigDecimal getDebitAmount();
                    
                    /**
                     * Gets (as xml) the "DebitAmount" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetDebitAmount();
                    
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
                    void xsetDebitAmount(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType debitAmount);
                    
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
                    x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetCreditAmount();
                    
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
                    void xsetCreditAmount(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType creditAmount);
                    
                    /**
                     * Unsets the "CreditAmount" element
                     */
                    void unsetCreditAmount();
                    
                    /**
                     * Gets the "Tax" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.Tax getTax();
                    
                    /**
                     * True if has "Tax" element
                     */
                    boolean isSetTax();
                    
                    /**
                     * Sets the "Tax" element
                     */
                    void setTax(x0301.oecdStandardAuditFileTaxPT1.Tax tax);
                    
                    /**
                     * Appends and returns a new empty "Tax" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.Tax addNewTax();
                    
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
                    x0301.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemption xgetTaxExemptionReason();
                    
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
                    void xsetTaxExemptionReason(x0301.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemption taxExemptionReason);
                    
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
                    x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetSettlementAmount();
                    
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
                    void xsetSettlementAmount(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType settlementAmount);
                    
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
                      public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.Line newInstance() {
                        return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.Line) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.Line newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.Line) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML DocumentTotals(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
                 *
                 * This is a complex type.
                 */
                public interface DocumentTotals extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DocumentTotals.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB56920DEA176B941910A868497F4EE85").resolveHandle("documenttotals7d6felemtype");
                    
                    /**
                     * Gets the "TaxPayable" element
                     */
                    java.math.BigDecimal getTaxPayable();
                    
                    /**
                     * Gets (as xml) the "TaxPayable" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetTaxPayable();
                    
                    /**
                     * Sets the "TaxPayable" element
                     */
                    void setTaxPayable(java.math.BigDecimal taxPayable);
                    
                    /**
                     * Sets (as xml) the "TaxPayable" element
                     */
                    void xsetTaxPayable(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType taxPayable);
                    
                    /**
                     * Gets the "NetTotal" element
                     */
                    java.math.BigDecimal getNetTotal();
                    
                    /**
                     * Gets (as xml) the "NetTotal" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetNetTotal();
                    
                    /**
                     * Sets the "NetTotal" element
                     */
                    void setNetTotal(java.math.BigDecimal netTotal);
                    
                    /**
                     * Sets (as xml) the "NetTotal" element
                     */
                    void xsetNetTotal(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType netTotal);
                    
                    /**
                     * Gets the "GrossTotal" element
                     */
                    java.math.BigDecimal getGrossTotal();
                    
                    /**
                     * Gets (as xml) the "GrossTotal" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetGrossTotal();
                    
                    /**
                     * Sets the "GrossTotal" element
                     */
                    void setGrossTotal(java.math.BigDecimal grossTotal);
                    
                    /**
                     * Sets (as xml) the "GrossTotal" element
                     */
                    void xsetGrossTotal(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType grossTotal);
                    
                    /**
                     * Gets the "Currency" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.Currency getCurrency();
                    
                    /**
                     * True if has "Currency" element
                     */
                    boolean isSetCurrency();
                    
                    /**
                     * Sets the "Currency" element
                     */
                    void setCurrency(x0301.oecdStandardAuditFileTaxPT1.Currency currency);
                    
                    /**
                     * Appends and returns a new empty "Currency" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.Currency addNewCurrency();
                    
                    /**
                     * Unsets the "Currency" element
                     */
                    void unsetCurrency();
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.DocumentTotals newInstance() {
                        return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.DocumentTotals) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.DocumentTotals newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.DocumentTotals) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument newInstance() {
                      return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments newInstance() {
                  return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Payments(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
         *
         * This is a complex type.
         */
        public interface Payments extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Payments.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB56920DEA176B941910A868497F4EE85").resolveHandle("paymentsfd37elemtype");
            
            /**
             * Gets the "NumberOfEntries" element
             */
            java.math.BigInteger getNumberOfEntries();
            
            /**
             * Gets (as xml) the "NumberOfEntries" element
             */
            org.apache.xmlbeans.XmlNonNegativeInteger xgetNumberOfEntries();
            
            /**
             * Sets the "NumberOfEntries" element
             */
            void setNumberOfEntries(java.math.BigInteger numberOfEntries);
            
            /**
             * Sets (as xml) the "NumberOfEntries" element
             */
            void xsetNumberOfEntries(org.apache.xmlbeans.XmlNonNegativeInteger numberOfEntries);
            
            /**
             * Gets the "TotalDebit" element
             */
            java.math.BigDecimal getTotalDebit();
            
            /**
             * Gets (as xml) the "TotalDebit" element
             */
            x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetTotalDebit();
            
            /**
             * Sets the "TotalDebit" element
             */
            void setTotalDebit(java.math.BigDecimal totalDebit);
            
            /**
             * Sets (as xml) the "TotalDebit" element
             */
            void xsetTotalDebit(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType totalDebit);
            
            /**
             * Gets the "TotalCredit" element
             */
            java.math.BigDecimal getTotalCredit();
            
            /**
             * Gets (as xml) the "TotalCredit" element
             */
            x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetTotalCredit();
            
            /**
             * Sets the "TotalCredit" element
             */
            void setTotalCredit(java.math.BigDecimal totalCredit);
            
            /**
             * Sets (as xml) the "TotalCredit" element
             */
            void xsetTotalCredit(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType totalCredit);
            
            /**
             * Gets a List of "Payment" elements
             */
            java.util.List<x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment> getPaymentList();
            
            /**
             * Gets array of all "Payment" elements
             * @deprecated
             */
            @Deprecated
            x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment[] getPaymentArray();
            
            /**
             * Gets ith "Payment" element
             */
            x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment getPaymentArray(int i);
            
            /**
             * Returns number of "Payment" element
             */
            int sizeOfPaymentArray();
            
            /**
             * Sets array of all "Payment" element
             */
            void setPaymentArray(x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment[] paymentArray);
            
            /**
             * Sets ith "Payment" element
             */
            void setPaymentArray(int i, x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment payment);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Payment" element
             */
            x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment insertNewPayment(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Payment" element
             */
            x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment addNewPayment();
            
            /**
             * Removes the ith "Payment" element
             */
            void removePayment(int i);
            
            /**
             * An XML Payment(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
             *
             * This is a complex type.
             */
            public interface Payment extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Payment.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB56920DEA176B941910A868497F4EE85").resolveHandle("payment8725elemtype");
                
                /**
                 * Gets the "PaymentRefNo" element
                 */
                java.lang.String getPaymentRefNo();
                
                /**
                 * Gets (as xml) the "PaymentRefNo" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.PaymentRefNoDocument.PaymentRefNo xgetPaymentRefNo();
                
                /**
                 * Sets the "PaymentRefNo" element
                 */
                void setPaymentRefNo(java.lang.String paymentRefNo);
                
                /**
                 * Sets (as xml) the "PaymentRefNo" element
                 */
                void xsetPaymentRefNo(x0301.oecdStandardAuditFileTaxPT1.PaymentRefNoDocument.PaymentRefNo paymentRefNo);
                
                /**
                 * Gets the "Period" element
                 */
                int getPeriod();
                
                /**
                 * Gets (as xml) the "Period" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.PeriodDocument.Period xgetPeriod();
                
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
                void xsetPeriod(x0301.oecdStandardAuditFileTaxPT1.PeriodDocument.Period period);
                
                /**
                 * Unsets the "Period" element
                 */
                void unsetPeriod();
                
                /**
                 * Gets the "TransactionID" element
                 */
                java.lang.String getTransactionID();
                
                /**
                 * Gets (as xml) the "TransactionID" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFPTTransactionID xgetTransactionID();
                
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
                void xsetTransactionID(x0301.oecdStandardAuditFileTaxPT1.SAFPTTransactionID transactionID);
                
                /**
                 * Unsets the "TransactionID" element
                 */
                void unsetTransactionID();
                
                /**
                 * Gets the "TransactionDate" element
                 */
                java.util.Calendar getTransactionDate();
                
                /**
                 * Gets (as xml) the "TransactionDate" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFdateType xgetTransactionDate();
                
                /**
                 * Sets the "TransactionDate" element
                 */
                void setTransactionDate(java.util.Calendar transactionDate);
                
                /**
                 * Sets (as xml) the "TransactionDate" element
                 */
                void xsetTransactionDate(x0301.oecdStandardAuditFileTaxPT1.SAFdateType transactionDate);
                
                /**
                 * Gets the "PaymentType" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFTPTPaymentType.Enum getPaymentType();
                
                /**
                 * Gets (as xml) the "PaymentType" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFTPTPaymentType xgetPaymentType();
                
                /**
                 * Sets the "PaymentType" element
                 */
                void setPaymentType(x0301.oecdStandardAuditFileTaxPT1.SAFTPTPaymentType.Enum paymentType);
                
                /**
                 * Sets (as xml) the "PaymentType" element
                 */
                void xsetPaymentType(x0301.oecdStandardAuditFileTaxPT1.SAFTPTPaymentType paymentType);
                
                /**
                 * Gets the "Description" element
                 */
                java.lang.String getDescription();
                
                /**
                 * Gets (as xml) the "Description" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car xgetDescription();
                
                /**
                 * True if has "Description" element
                 */
                boolean isSetDescription();
                
                /**
                 * Sets the "Description" element
                 */
                void setDescription(java.lang.String description);
                
                /**
                 * Sets (as xml) the "Description" element
                 */
                void xsetDescription(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car description);
                
                /**
                 * Unsets the "Description" element
                 */
                void unsetDescription();
                
                /**
                 * Gets the "SystemID" element
                 */
                java.lang.String getSystemID();
                
                /**
                 * Gets (as xml) the "SystemID" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax35Car xgetSystemID();
                
                /**
                 * True if has "SystemID" element
                 */
                boolean isSetSystemID();
                
                /**
                 * Sets the "SystemID" element
                 */
                void setSystemID(java.lang.String systemID);
                
                /**
                 * Sets (as xml) the "SystemID" element
                 */
                void xsetSystemID(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax35Car systemID);
                
                /**
                 * Unsets the "SystemID" element
                 */
                void unsetSystemID();
                
                /**
                 * Gets the "DocumentStatus" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentStatus getDocumentStatus();
                
                /**
                 * Sets the "DocumentStatus" element
                 */
                void setDocumentStatus(x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentStatus documentStatus);
                
                /**
                 * Appends and returns a new empty "DocumentStatus" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentStatus addNewDocumentStatus();
                
                /**
                 * Gets a List of "PaymentMethod" elements
                 */
                java.util.List<x0301.oecdStandardAuditFileTaxPT1.PaymentMethod> getPaymentMethodList();
                
                /**
                 * Gets array of all "PaymentMethod" elements
                 * @deprecated
                 */
                @Deprecated
                x0301.oecdStandardAuditFileTaxPT1.PaymentMethod[] getPaymentMethodArray();
                
                /**
                 * Gets ith "PaymentMethod" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.PaymentMethod getPaymentMethodArray(int i);
                
                /**
                 * Returns number of "PaymentMethod" element
                 */
                int sizeOfPaymentMethodArray();
                
                /**
                 * Sets array of all "PaymentMethod" element
                 */
                void setPaymentMethodArray(x0301.oecdStandardAuditFileTaxPT1.PaymentMethod[] paymentMethodArray);
                
                /**
                 * Sets ith "PaymentMethod" element
                 */
                void setPaymentMethodArray(int i, x0301.oecdStandardAuditFileTaxPT1.PaymentMethod paymentMethod);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "PaymentMethod" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.PaymentMethod insertNewPaymentMethod(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "PaymentMethod" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.PaymentMethod addNewPaymentMethod();
                
                /**
                 * Removes the ith "PaymentMethod" element
                 */
                void removePaymentMethod(int i);
                
                /**
                 * Gets the "SourceID" element
                 */
                java.lang.String getSourceID();
                
                /**
                 * Gets (as xml) the "SourceID" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetSourceID();
                
                /**
                 * Sets the "SourceID" element
                 */
                void setSourceID(java.lang.String sourceID);
                
                /**
                 * Sets (as xml) the "SourceID" element
                 */
                void xsetSourceID(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car sourceID);
                
                /**
                 * Gets the "SystemEntryDate" element
                 */
                java.util.Calendar getSystemEntryDate();
                
                /**
                 * Gets (as xml) the "SystemEntryDate" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType xgetSystemEntryDate();
                
                /**
                 * Sets the "SystemEntryDate" element
                 */
                void setSystemEntryDate(java.util.Calendar systemEntryDate);
                
                /**
                 * Sets (as xml) the "SystemEntryDate" element
                 */
                void xsetSystemEntryDate(x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType systemEntryDate);
                
                /**
                 * Gets the "CustomerID" element
                 */
                java.lang.String getCustomerID();
                
                /**
                 * Gets (as xml) the "CustomerID" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetCustomerID();
                
                /**
                 * Sets the "CustomerID" element
                 */
                void setCustomerID(java.lang.String customerID);
                
                /**
                 * Sets (as xml) the "CustomerID" element
                 */
                void xsetCustomerID(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car customerID);
                
                /**
                 * Gets a List of "Line" elements
                 */
                java.util.List<x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line> getLineList();
                
                /**
                 * Gets array of all "Line" elements
                 * @deprecated
                 */
                @Deprecated
                x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line[] getLineArray();
                
                /**
                 * Gets ith "Line" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line getLineArray(int i);
                
                /**
                 * Returns number of "Line" element
                 */
                int sizeOfLineArray();
                
                /**
                 * Sets array of all "Line" element
                 */
                void setLineArray(x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line[] lineArray);
                
                /**
                 * Sets ith "Line" element
                 */
                void setLineArray(int i, x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line line);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "Line" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line insertNewLine(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "Line" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line addNewLine();
                
                /**
                 * Removes the ith "Line" element
                 */
                void removeLine(int i);
                
                /**
                 * Gets the "DocumentTotals" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentTotals getDocumentTotals();
                
                /**
                 * Sets the "DocumentTotals" element
                 */
                void setDocumentTotals(x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentTotals documentTotals);
                
                /**
                 * Appends and returns a new empty "DocumentTotals" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentTotals addNewDocumentTotals();
                
                /**
                 * Gets a List of "WithholdingTax" elements
                 */
                java.util.List<x0301.oecdStandardAuditFileTaxPT1.WithholdingTax> getWithholdingTaxList();
                
                /**
                 * Gets array of all "WithholdingTax" elements
                 * @deprecated
                 */
                @Deprecated
                x0301.oecdStandardAuditFileTaxPT1.WithholdingTax[] getWithholdingTaxArray();
                
                /**
                 * Gets ith "WithholdingTax" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.WithholdingTax getWithholdingTaxArray(int i);
                
                /**
                 * Returns number of "WithholdingTax" element
                 */
                int sizeOfWithholdingTaxArray();
                
                /**
                 * Sets array of all "WithholdingTax" element
                 */
                void setWithholdingTaxArray(x0301.oecdStandardAuditFileTaxPT1.WithholdingTax[] withholdingTaxArray);
                
                /**
                 * Sets ith "WithholdingTax" element
                 */
                void setWithholdingTaxArray(int i, x0301.oecdStandardAuditFileTaxPT1.WithholdingTax withholdingTax);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "WithholdingTax" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.WithholdingTax insertNewWithholdingTax(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "WithholdingTax" element
                 */
                x0301.oecdStandardAuditFileTaxPT1.WithholdingTax addNewWithholdingTax();
                
                /**
                 * Removes the ith "WithholdingTax" element
                 */
                void removeWithholdingTax(int i);
                
                /**
                 * An XML DocumentStatus(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
                 *
                 * This is a complex type.
                 */
                public interface DocumentStatus extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DocumentStatus.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB56920DEA176B941910A868497F4EE85").resolveHandle("documentstatus2edcelemtype");
                    
                    /**
                     * Gets the "PaymentStatus" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.PaymentStatusDocument.PaymentStatus.Enum getPaymentStatus();
                    
                    /**
                     * Gets (as xml) the "PaymentStatus" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.PaymentStatusDocument.PaymentStatus xgetPaymentStatus();
                    
                    /**
                     * Sets the "PaymentStatus" element
                     */
                    void setPaymentStatus(x0301.oecdStandardAuditFileTaxPT1.PaymentStatusDocument.PaymentStatus.Enum paymentStatus);
                    
                    /**
                     * Sets (as xml) the "PaymentStatus" element
                     */
                    void xsetPaymentStatus(x0301.oecdStandardAuditFileTaxPT1.PaymentStatusDocument.PaymentStatus paymentStatus);
                    
                    /**
                     * Gets the "PaymentStatusDate" element
                     */
                    java.util.Calendar getPaymentStatusDate();
                    
                    /**
                     * Gets (as xml) the "PaymentStatusDate" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType xgetPaymentStatusDate();
                    
                    /**
                     * Sets the "PaymentStatusDate" element
                     */
                    void setPaymentStatusDate(java.util.Calendar paymentStatusDate);
                    
                    /**
                     * Sets (as xml) the "PaymentStatusDate" element
                     */
                    void xsetPaymentStatusDate(x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType paymentStatusDate);
                    
                    /**
                     * Gets the "Reason" element
                     */
                    java.lang.String getReason();
                    
                    /**
                     * Gets (as xml) the "Reason" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car xgetReason();
                    
                    /**
                     * True if has "Reason" element
                     */
                    boolean isSetReason();
                    
                    /**
                     * Sets the "Reason" element
                     */
                    void setReason(java.lang.String reason);
                    
                    /**
                     * Sets (as xml) the "Reason" element
                     */
                    void xsetReason(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car reason);
                    
                    /**
                     * Unsets the "Reason" element
                     */
                    void unsetReason();
                    
                    /**
                     * Gets the "SourceID" element
                     */
                    java.lang.String getSourceID();
                    
                    /**
                     * Gets (as xml) the "SourceID" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetSourceID();
                    
                    /**
                     * Sets the "SourceID" element
                     */
                    void setSourceID(java.lang.String sourceID);
                    
                    /**
                     * Sets (as xml) the "SourceID" element
                     */
                    void xsetSourceID(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car sourceID);
                    
                    /**
                     * Gets the "SourcePayment" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFTPTSourcePayment.Enum getSourcePayment();
                    
                    /**
                     * Gets (as xml) the "SourcePayment" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFTPTSourcePayment xgetSourcePayment();
                    
                    /**
                     * Sets the "SourcePayment" element
                     */
                    void setSourcePayment(x0301.oecdStandardAuditFileTaxPT1.SAFTPTSourcePayment.Enum sourcePayment);
                    
                    /**
                     * Sets (as xml) the "SourcePayment" element
                     */
                    void xsetSourcePayment(x0301.oecdStandardAuditFileTaxPT1.SAFTPTSourcePayment sourcePayment);
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentStatus newInstance() {
                        return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentStatus newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML Line(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
                 *
                 * This is a complex type.
                 */
                public interface Line extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Line.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB56920DEA176B941910A868497F4EE85").resolveHandle("linea875elemtype");
                    
                    /**
                     * Gets the "LineNumber" element
                     */
                    java.math.BigInteger getLineNumber();
                    
                    /**
                     * Gets (as xml) the "LineNumber" element
                     */
                    org.apache.xmlbeans.XmlNonNegativeInteger xgetLineNumber();
                    
                    /**
                     * Sets the "LineNumber" element
                     */
                    void setLineNumber(java.math.BigInteger lineNumber);
                    
                    /**
                     * Sets (as xml) the "LineNumber" element
                     */
                    void xsetLineNumber(org.apache.xmlbeans.XmlNonNegativeInteger lineNumber);
                    
                    /**
                     * Gets a List of "SourceDocumentID" elements
                     */
                    java.util.List<x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line.SourceDocumentID> getSourceDocumentIDList();
                    
                    /**
                     * Gets array of all "SourceDocumentID" elements
                     * @deprecated
                     */
                    @Deprecated
                    x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line.SourceDocumentID[] getSourceDocumentIDArray();
                    
                    /**
                     * Gets ith "SourceDocumentID" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line.SourceDocumentID getSourceDocumentIDArray(int i);
                    
                    /**
                     * Returns number of "SourceDocumentID" element
                     */
                    int sizeOfSourceDocumentIDArray();
                    
                    /**
                     * Sets array of all "SourceDocumentID" element
                     */
                    void setSourceDocumentIDArray(x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line.SourceDocumentID[] sourceDocumentIDArray);
                    
                    /**
                     * Sets ith "SourceDocumentID" element
                     */
                    void setSourceDocumentIDArray(int i, x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line.SourceDocumentID sourceDocumentID);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "SourceDocumentID" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line.SourceDocumentID insertNewSourceDocumentID(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "SourceDocumentID" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line.SourceDocumentID addNewSourceDocumentID();
                    
                    /**
                     * Removes the ith "SourceDocumentID" element
                     */
                    void removeSourceDocumentID(int i);
                    
                    /**
                     * Gets the "SettlementAmount" element
                     */
                    java.math.BigDecimal getSettlementAmount();
                    
                    /**
                     * Gets (as xml) the "SettlementAmount" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetSettlementAmount();
                    
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
                    void xsetSettlementAmount(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType settlementAmount);
                    
                    /**
                     * Unsets the "SettlementAmount" element
                     */
                    void unsetSettlementAmount();
                    
                    /**
                     * Gets the "DebitAmount" element
                     */
                    java.math.BigDecimal getDebitAmount();
                    
                    /**
                     * Gets (as xml) the "DebitAmount" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetDebitAmount();
                    
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
                    void xsetDebitAmount(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType debitAmount);
                    
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
                    x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetCreditAmount();
                    
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
                    void xsetCreditAmount(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType creditAmount);
                    
                    /**
                     * Unsets the "CreditAmount" element
                     */
                    void unsetCreditAmount();
                    
                    /**
                     * Gets the "Tax" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.PaymentTax getTax();
                    
                    /**
                     * True if has "Tax" element
                     */
                    boolean isSetTax();
                    
                    /**
                     * Sets the "Tax" element
                     */
                    void setTax(x0301.oecdStandardAuditFileTaxPT1.PaymentTax tax);
                    
                    /**
                     * Appends and returns a new empty "Tax" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.PaymentTax addNewTax();
                    
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
                    x0301.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemption xgetTaxExemptionReason();
                    
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
                    void xsetTaxExemptionReason(x0301.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemption taxExemptionReason);
                    
                    /**
                     * Unsets the "TaxExemptionReason" element
                     */
                    void unsetTaxExemptionReason();
                    
                    /**
                     * An XML SourceDocumentID(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
                     *
                     * This is a complex type.
                     */
                    public interface SourceDocumentID extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SourceDocumentID.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB56920DEA176B941910A868497F4EE85").resolveHandle("sourcedocumentid52e2elemtype");
                      
                      /**
                       * Gets the "OriginatingON" element
                       */
                      java.lang.String getOriginatingON();
                      
                      /**
                       * Gets (as xml) the "OriginatingON" element
                       */
                      x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car xgetOriginatingON();
                      
                      /**
                       * Sets the "OriginatingON" element
                       */
                      void setOriginatingON(java.lang.String originatingON);
                      
                      /**
                       * Sets (as xml) the "OriginatingON" element
                       */
                      void xsetOriginatingON(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car originatingON);
                      
                      /**
                       * Gets the "InvoiceDate" element
                       */
                      java.util.Calendar getInvoiceDate();
                      
                      /**
                       * Gets (as xml) the "InvoiceDate" element
                       */
                      x0301.oecdStandardAuditFileTaxPT1.SAFdateType xgetInvoiceDate();
                      
                      /**
                       * Sets the "InvoiceDate" element
                       */
                      void setInvoiceDate(java.util.Calendar invoiceDate);
                      
                      /**
                       * Sets (as xml) the "InvoiceDate" element
                       */
                      void xsetInvoiceDate(x0301.oecdStandardAuditFileTaxPT1.SAFdateType invoiceDate);
                      
                      /**
                       * Gets the "Description" element
                       */
                      java.lang.String getDescription();
                      
                      /**
                       * Gets (as xml) the "Description" element
                       */
                      x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car xgetDescription();
                      
                      /**
                       * True if has "Description" element
                       */
                      boolean isSetDescription();
                      
                      /**
                       * Sets the "Description" element
                       */
                      void setDescription(java.lang.String description);
                      
                      /**
                       * Sets (as xml) the "Description" element
                       */
                      void xsetDescription(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car description);
                      
                      /**
                       * Unsets the "Description" element
                       */
                      void unsetDescription();
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line.SourceDocumentID newInstance() {
                          return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line.SourceDocumentID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line.SourceDocumentID newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line.SourceDocumentID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line newInstance() {
                        return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML DocumentTotals(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
                 *
                 * This is a complex type.
                 */
                public interface DocumentTotals extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DocumentTotals.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB56920DEA176B941910A868497F4EE85").resolveHandle("documenttotals57ffelemtype");
                    
                    /**
                     * Gets the "TaxPayable" element
                     */
                    java.math.BigDecimal getTaxPayable();
                    
                    /**
                     * Gets (as xml) the "TaxPayable" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetTaxPayable();
                    
                    /**
                     * Sets the "TaxPayable" element
                     */
                    void setTaxPayable(java.math.BigDecimal taxPayable);
                    
                    /**
                     * Sets (as xml) the "TaxPayable" element
                     */
                    void xsetTaxPayable(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType taxPayable);
                    
                    /**
                     * Gets the "NetTotal" element
                     */
                    java.math.BigDecimal getNetTotal();
                    
                    /**
                     * Gets (as xml) the "NetTotal" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetNetTotal();
                    
                    /**
                     * Sets the "NetTotal" element
                     */
                    void setNetTotal(java.math.BigDecimal netTotal);
                    
                    /**
                     * Sets (as xml) the "NetTotal" element
                     */
                    void xsetNetTotal(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType netTotal);
                    
                    /**
                     * Gets the "GrossTotal" element
                     */
                    java.math.BigDecimal getGrossTotal();
                    
                    /**
                     * Gets (as xml) the "GrossTotal" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetGrossTotal();
                    
                    /**
                     * Sets the "GrossTotal" element
                     */
                    void setGrossTotal(java.math.BigDecimal grossTotal);
                    
                    /**
                     * Sets (as xml) the "GrossTotal" element
                     */
                    void xsetGrossTotal(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType grossTotal);
                    
                    /**
                     * Gets the "Settlement" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentTotals.Settlement getSettlement();
                    
                    /**
                     * True if has "Settlement" element
                     */
                    boolean isSetSettlement();
                    
                    /**
                     * Sets the "Settlement" element
                     */
                    void setSettlement(x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentTotals.Settlement settlement);
                    
                    /**
                     * Appends and returns a new empty "Settlement" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentTotals.Settlement addNewSettlement();
                    
                    /**
                     * Unsets the "Settlement" element
                     */
                    void unsetSettlement();
                    
                    /**
                     * Gets the "Currency" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.Currency getCurrency();
                    
                    /**
                     * True if has "Currency" element
                     */
                    boolean isSetCurrency();
                    
                    /**
                     * Sets the "Currency" element
                     */
                    void setCurrency(x0301.oecdStandardAuditFileTaxPT1.Currency currency);
                    
                    /**
                     * Appends and returns a new empty "Currency" element
                     */
                    x0301.oecdStandardAuditFileTaxPT1.Currency addNewCurrency();
                    
                    /**
                     * Unsets the "Currency" element
                     */
                    void unsetCurrency();
                    
                    /**
                     * An XML Settlement(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
                     *
                     * This is a complex type.
                     */
                    public interface Settlement extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Settlement.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB56920DEA176B941910A868497F4EE85").resolveHandle("settlement8764elemtype");
                      
                      /**
                       * Gets the "SettlementAmount" element
                       */
                      java.math.BigDecimal getSettlementAmount();
                      
                      /**
                       * Gets (as xml) the "SettlementAmount" element
                       */
                      x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetSettlementAmount();
                      
                      /**
                       * Sets the "SettlementAmount" element
                       */
                      void setSettlementAmount(java.math.BigDecimal settlementAmount);
                      
                      /**
                       * Sets (as xml) the "SettlementAmount" element
                       */
                      void xsetSettlementAmount(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType settlementAmount);
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentTotals.Settlement newInstance() {
                          return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentTotals.Settlement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentTotals.Settlement newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentTotals.Settlement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentTotals newInstance() {
                        return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentTotals) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentTotals newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentTotals) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment newInstance() {
                      return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments newInstance() {
                  return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments newInstance() {
              return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument newInstance() {
          return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0301.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
