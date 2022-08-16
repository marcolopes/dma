/*
 * An XML document type.
 * Localname: SourceDocuments
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.01_01
 * Java type: x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument
 *
 * Automatically generated - do not modify.
 */
package x0101.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one SourceDocuments(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01) element.
 *
 * This is a complex type.
 */
public class SourceDocumentsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument
{
    private static final long serialVersionUID = 1L;
    
    public SourceDocumentsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCEDOCUMENTS$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "SourceDocuments");
    
    
    /**
     * Gets the "SourceDocuments" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments getSourceDocuments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments)get_store().find_element_user(SOURCEDOCUMENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SourceDocuments" element
     */
    public void setSourceDocuments(x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments sourceDocuments)
    {
        generatedSetterHelperImpl(sourceDocuments, SOURCEDOCUMENTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SourceDocuments" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments addNewSourceDocuments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments)get_store().add_element_user(SOURCEDOCUMENTS$0);
            return target;
        }
    }
    /**
     * An XML SourceDocuments(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01).
     *
     * This is a complex type.
     */
    public static class SourceDocumentsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments
    {
        private static final long serialVersionUID = 1L;
        
        public SourceDocumentsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SALESINVOICES$0 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "SalesInvoices");
        
        
        /**
         * Gets the "SalesInvoices" element
         */
        public x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices getSalesInvoices()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices)get_store().find_element_user(SALESINVOICES$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "SalesInvoices" element
         */
        public boolean isSetSalesInvoices()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SALESINVOICES$0) != 0;
            }
        }
        
        /**
         * Sets the "SalesInvoices" element
         */
        public void setSalesInvoices(x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices salesInvoices)
        {
            generatedSetterHelperImpl(salesInvoices, SALESINVOICES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "SalesInvoices" element
         */
        public x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices addNewSalesInvoices()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices)get_store().add_element_user(SALESINVOICES$0);
                return target;
            }
        }
        
        /**
         * Unsets the "SalesInvoices" element
         */
        public void unsetSalesInvoices()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SALESINVOICES$0, 0);
            }
        }
        /**
         * An XML SalesInvoices(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01).
         *
         * This is a complex type.
         */
        public static class SalesInvoicesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices
        {
            private static final long serialVersionUID = 1L;
            
            public SalesInvoicesImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NUMBEROFENTRIES$0 = 
                new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "NumberOfEntries");
            private static final javax.xml.namespace.QName TOTALDEBIT$2 = 
                new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "TotalDebit");
            private static final javax.xml.namespace.QName TOTALCREDIT$4 = 
                new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "TotalCredit");
            private static final javax.xml.namespace.QName INVOICE$6 = 
                new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "Invoice");
            
            
            /**
             * Gets the "NumberOfEntries" element
             */
            public java.math.BigInteger getNumberOfEntries()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFENTRIES$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigIntegerValue();
                }
            }
            
            /**
             * Gets (as xml) the "NumberOfEntries" element
             */
            public org.apache.xmlbeans.XmlInteger xgetNumberOfEntries()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NUMBEROFENTRIES$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "NumberOfEntries" element
             */
            public void setNumberOfEntries(java.math.BigInteger numberOfEntries)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFENTRIES$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFENTRIES$0);
                    }
                    target.setBigIntegerValue(numberOfEntries);
                }
            }
            
            /**
             * Sets (as xml) the "NumberOfEntries" element
             */
            public void xsetNumberOfEntries(org.apache.xmlbeans.XmlInteger numberOfEntries)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NUMBEROFENTRIES$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(NUMBEROFENTRIES$0);
                    }
                    target.set(numberOfEntries);
                }
            }
            
            /**
             * Gets the "TotalDebit" element
             */
            public java.math.BigDecimal getTotalDebit()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALDEBIT$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigDecimalValue();
                }
            }
            
            /**
             * Gets (as xml) the "TotalDebit" element
             */
            public x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetTotalDebit()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                    target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TOTALDEBIT$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "TotalDebit" element
             */
            public void setTotalDebit(java.math.BigDecimal totalDebit)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALDEBIT$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALDEBIT$2);
                    }
                    target.setBigDecimalValue(totalDebit);
                }
            }
            
            /**
             * Sets (as xml) the "TotalDebit" element
             */
            public void xsetTotalDebit(x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType totalDebit)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                    target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TOTALDEBIT$2, 0);
                    if (target == null)
                    {
                      target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(TOTALDEBIT$2);
                    }
                    target.set(totalDebit);
                }
            }
            
            /**
             * Gets the "TotalCredit" element
             */
            public java.math.BigDecimal getTotalCredit()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALCREDIT$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigDecimalValue();
                }
            }
            
            /**
             * Gets (as xml) the "TotalCredit" element
             */
            public x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetTotalCredit()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                    target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TOTALCREDIT$4, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "TotalCredit" element
             */
            public void setTotalCredit(java.math.BigDecimal totalCredit)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALCREDIT$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALCREDIT$4);
                    }
                    target.setBigDecimalValue(totalCredit);
                }
            }
            
            /**
             * Sets (as xml) the "TotalCredit" element
             */
            public void xsetTotalCredit(x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType totalCredit)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                    target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TOTALCREDIT$4, 0);
                    if (target == null)
                    {
                      target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(TOTALCREDIT$4);
                    }
                    target.set(totalCredit);
                }
            }
            
            /**
             * Gets a List of "Invoice" elements
             */
            public java.util.List<x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice> getInvoiceList()
            {
                final class InvoiceList extends java.util.AbstractList<x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice>
                {
                    @Override
                    public x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice get(int i)
                        { return SalesInvoicesImpl.this.getInvoiceArray(i); }
                    
                    @Override
                    public x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice set(int i, x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice o)
                    {
                      x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice old = SalesInvoicesImpl.this.getInvoiceArray(i);
                      SalesInvoicesImpl.this.setInvoiceArray(i, o);
                      return old;
                    }
                    
                    @Override
                    public void add(int i, x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice o)
                        { SalesInvoicesImpl.this.insertNewInvoice(i).set(o); }
                    
                    @Override
                    public x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice remove(int i)
                    {
                      x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice old = SalesInvoicesImpl.this.getInvoiceArray(i);
                      SalesInvoicesImpl.this.removeInvoice(i);
                      return old;
                    }
                    
                    @Override
                    public int size()
                        { return SalesInvoicesImpl.this.sizeOfInvoiceArray(); }
                    
                }
                
                synchronized (monitor())
                {
                    check_orphaned();
                    return new InvoiceList();
                }
            }
            
            /**
             * Gets array of all "Invoice" elements
             * @deprecated
             */
            @Deprecated
            public x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice[] getInvoiceArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List<x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice> targetList = new java.util.ArrayList<x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice>();
                    get_store().find_all_element_users(INVOICE$6, targetList);
                    x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice[] result = new x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Invoice" element
             */
            public x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice getInvoiceArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice target = null;
                    target = (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice)get_store().find_element_user(INVOICE$6, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Invoice" element
             */
            public int sizeOfInvoiceArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(INVOICE$6);
                }
            }
            
            /**
             * Sets array of all "Invoice" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setInvoiceArray(x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice[] invoiceArray)
            {
                check_orphaned();
                arraySetterHelper(invoiceArray, INVOICE$6);
            }
            
            /**
             * Sets ith "Invoice" element
             */
            public void setInvoiceArray(int i, x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice invoice)
            {
                generatedSetterHelperImpl(invoice, INVOICE$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Invoice" element
             */
            public x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice insertNewInvoice(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice target = null;
                    target = (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice)get_store().insert_element_user(INVOICE$6, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Invoice" element
             */
            public x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice addNewInvoice()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice target = null;
                    target = (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice)get_store().add_element_user(INVOICE$6);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Invoice" element
             */
            public void removeInvoice(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(INVOICE$6, i);
                }
            }
            /**
             * An XML Invoice(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01).
             *
             * This is a complex type.
             */
            public static class InvoiceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice
            {
                private static final long serialVersionUID = 1L;
                
                public InvoiceImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName INVOICENO$0 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "InvoiceNo");
                private static final javax.xml.namespace.QName INVOICESTATUS$2 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "InvoiceStatus");
                private static final javax.xml.namespace.QName HASH$4 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "Hash");
                private static final javax.xml.namespace.QName HASHCONTROL$6 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "HashControl");
                private static final javax.xml.namespace.QName PERIOD$8 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "Period");
                private static final javax.xml.namespace.QName INVOICEDATE$10 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "InvoiceDate");
                private static final javax.xml.namespace.QName INVOICETYPE$12 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "InvoiceType");
                private static final javax.xml.namespace.QName SELFBILLINGINDICATOR$14 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "SelfBillingIndicator");
                private static final javax.xml.namespace.QName SYSTEMENTRYDATE$16 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "SystemEntryDate");
                private static final javax.xml.namespace.QName TRANSACTIONID$18 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "TransactionID");
                private static final javax.xml.namespace.QName CUSTOMERID$20 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "CustomerID");
                private static final javax.xml.namespace.QName SHIPTO$22 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "ShipTo");
                private static final javax.xml.namespace.QName SHIPFROM$24 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "ShipFrom");
                private static final javax.xml.namespace.QName LINE$26 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "Line");
                private static final javax.xml.namespace.QName DOCUMENTTOTALS$28 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "DocumentTotals");
                
                
                /**
                 * Gets the "InvoiceNo" element
                 */
                public java.lang.String getInvoiceNo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOICENO$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "InvoiceNo" element
                 */
                public x0101.oecdStandardAuditFileTaxPT1.InvoiceNoDocument.InvoiceNo xgetInvoiceNo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0101.oecdStandardAuditFileTaxPT1.InvoiceNoDocument.InvoiceNo target = null;
                      target = (x0101.oecdStandardAuditFileTaxPT1.InvoiceNoDocument.InvoiceNo)get_store().find_element_user(INVOICENO$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "InvoiceNo" element
                 */
                public void setInvoiceNo(java.lang.String invoiceNo)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOICENO$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INVOICENO$0);
                      }
                      target.setStringValue(invoiceNo);
                    }
                }
                
                /**
                 * Sets (as xml) the "InvoiceNo" element
                 */
                public void xsetInvoiceNo(x0101.oecdStandardAuditFileTaxPT1.InvoiceNoDocument.InvoiceNo invoiceNo)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0101.oecdStandardAuditFileTaxPT1.InvoiceNoDocument.InvoiceNo target = null;
                      target = (x0101.oecdStandardAuditFileTaxPT1.InvoiceNoDocument.InvoiceNo)get_store().find_element_user(INVOICENO$0, 0);
                      if (target == null)
                      {
                        target = (x0101.oecdStandardAuditFileTaxPT1.InvoiceNoDocument.InvoiceNo)get_store().add_element_user(INVOICENO$0);
                      }
                      target.set(invoiceNo);
                    }
                }
                
                /**
                 * Gets the "InvoiceStatus" element
                 */
                public x0101.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument.InvoiceStatus.Enum getInvoiceStatus()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOICESTATUS$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return (x0101.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument.InvoiceStatus.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "InvoiceStatus" element
                 */
                public x0101.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument.InvoiceStatus xgetInvoiceStatus()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0101.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument.InvoiceStatus target = null;
                      target = (x0101.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument.InvoiceStatus)get_store().find_element_user(INVOICESTATUS$2, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "InvoiceStatus" element
                 */
                public void setInvoiceStatus(x0101.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument.InvoiceStatus.Enum invoiceStatus)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOICESTATUS$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INVOICESTATUS$2);
                      }
                      target.setEnumValue(invoiceStatus);
                    }
                }
                
                /**
                 * Sets (as xml) the "InvoiceStatus" element
                 */
                public void xsetInvoiceStatus(x0101.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument.InvoiceStatus invoiceStatus)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0101.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument.InvoiceStatus target = null;
                      target = (x0101.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument.InvoiceStatus)get_store().find_element_user(INVOICESTATUS$2, 0);
                      if (target == null)
                      {
                        target = (x0101.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument.InvoiceStatus)get_store().add_element_user(INVOICESTATUS$2);
                      }
                      target.set(invoiceStatus);
                    }
                }
                
                /**
                 * Gets the "Hash" element
                 */
                public java.lang.String getHash()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASH$4, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Hash" element
                 */
                public x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car xgetHash()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car target = null;
                      target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car)get_store().find_element_user(HASH$4, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "Hash" element
                 */
                public void setHash(java.lang.String hash)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASH$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASH$4);
                      }
                      target.setStringValue(hash);
                    }
                }
                
                /**
                 * Sets (as xml) the "Hash" element
                 */
                public void xsetHash(x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car hash)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car target = null;
                      target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car)get_store().find_element_user(HASH$4, 0);
                      if (target == null)
                      {
                        target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car)get_store().add_element_user(HASH$4);
                      }
                      target.set(hash);
                    }
                }
                
                /**
                 * Gets the "HashControl" element
                 */
                public java.lang.String getHashControl()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASHCONTROL$6, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "HashControl" element
                 */
                public x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax40Car xgetHashControl()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax40Car target = null;
                      target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax40Car)get_store().find_element_user(HASHCONTROL$6, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "HashControl" element
                 */
                public boolean isSetHashControl()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(HASHCONTROL$6) != 0;
                    }
                }
                
                /**
                 * Sets the "HashControl" element
                 */
                public void setHashControl(java.lang.String hashControl)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASHCONTROL$6, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASHCONTROL$6);
                      }
                      target.setStringValue(hashControl);
                    }
                }
                
                /**
                 * Sets (as xml) the "HashControl" element
                 */
                public void xsetHashControl(x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax40Car hashControl)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax40Car target = null;
                      target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax40Car)get_store().find_element_user(HASHCONTROL$6, 0);
                      if (target == null)
                      {
                        target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax40Car)get_store().add_element_user(HASHCONTROL$6);
                      }
                      target.set(hashControl);
                    }
                }
                
                /**
                 * Unsets the "HashControl" element
                 */
                public void unsetHashControl()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(HASHCONTROL$6, 0);
                    }
                }
                
                /**
                 * Gets the "Period" element
                 */
                public int getPeriod()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIOD$8, 0);
                      if (target == null)
                      {
                        return 0;
                      }
                      return target.getIntValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Period" element
                 */
                public x0101.oecdStandardAuditFileTaxPT1.PeriodDocument.Period xgetPeriod()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0101.oecdStandardAuditFileTaxPT1.PeriodDocument.Period target = null;
                      target = (x0101.oecdStandardAuditFileTaxPT1.PeriodDocument.Period)get_store().find_element_user(PERIOD$8, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "Period" element
                 */
                public boolean isSetPeriod()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(PERIOD$8) != 0;
                    }
                }
                
                /**
                 * Sets the "Period" element
                 */
                public void setPeriod(int period)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIOD$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERIOD$8);
                      }
                      target.setIntValue(period);
                    }
                }
                
                /**
                 * Sets (as xml) the "Period" element
                 */
                public void xsetPeriod(x0101.oecdStandardAuditFileTaxPT1.PeriodDocument.Period period)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0101.oecdStandardAuditFileTaxPT1.PeriodDocument.Period target = null;
                      target = (x0101.oecdStandardAuditFileTaxPT1.PeriodDocument.Period)get_store().find_element_user(PERIOD$8, 0);
                      if (target == null)
                      {
                        target = (x0101.oecdStandardAuditFileTaxPT1.PeriodDocument.Period)get_store().add_element_user(PERIOD$8);
                      }
                      target.set(period);
                    }
                }
                
                /**
                 * Unsets the "Period" element
                 */
                public void unsetPeriod()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(PERIOD$8, 0);
                    }
                }
                
                /**
                 * Gets the "InvoiceDate" element
                 */
                public java.util.Calendar getInvoiceDate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOICEDATE$10, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getCalendarValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "InvoiceDate" element
                 */
                public x0101.oecdStandardAuditFileTaxPT1.SAFdateType xgetInvoiceDate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0101.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
                      target = (x0101.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(INVOICEDATE$10, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "InvoiceDate" element
                 */
                public void setInvoiceDate(java.util.Calendar invoiceDate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOICEDATE$10, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INVOICEDATE$10);
                      }
                      target.setCalendarValue(invoiceDate);
                    }
                }
                
                /**
                 * Sets (as xml) the "InvoiceDate" element
                 */
                public void xsetInvoiceDate(x0101.oecdStandardAuditFileTaxPT1.SAFdateType invoiceDate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0101.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
                      target = (x0101.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(INVOICEDATE$10, 0);
                      if (target == null)
                      {
                        target = (x0101.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().add_element_user(INVOICEDATE$10);
                      }
                      target.set(invoiceDate);
                    }
                }
                
                /**
                 * Gets the "InvoiceType" element
                 */
                public x0101.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType.Enum getInvoiceType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOICETYPE$12, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return (x0101.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "InvoiceType" element
                 */
                public x0101.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType xgetInvoiceType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0101.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType target = null;
                      target = (x0101.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType)get_store().find_element_user(INVOICETYPE$12, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "InvoiceType" element
                 */
                public void setInvoiceType(x0101.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType.Enum invoiceType)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOICETYPE$12, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INVOICETYPE$12);
                      }
                      target.setEnumValue(invoiceType);
                    }
                }
                
                /**
                 * Sets (as xml) the "InvoiceType" element
                 */
                public void xsetInvoiceType(x0101.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType invoiceType)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0101.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType target = null;
                      target = (x0101.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType)get_store().find_element_user(INVOICETYPE$12, 0);
                      if (target == null)
                      {
                        target = (x0101.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType)get_store().add_element_user(INVOICETYPE$12);
                      }
                      target.set(invoiceType);
                    }
                }
                
                /**
                 * Gets the "SelfBillingIndicator" element
                 */
                public int getSelfBillingIndicator()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELFBILLINGINDICATOR$14, 0);
                      if (target == null)
                      {
                        return 0;
                      }
                      return target.getIntValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "SelfBillingIndicator" element
                 */
                public x0101.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator xgetSelfBillingIndicator()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0101.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator target = null;
                      target = (x0101.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator)get_store().find_element_user(SELFBILLINGINDICATOR$14, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "SelfBillingIndicator" element
                 */
                public void setSelfBillingIndicator(int selfBillingIndicator)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELFBILLINGINDICATOR$14, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SELFBILLINGINDICATOR$14);
                      }
                      target.setIntValue(selfBillingIndicator);
                    }
                }
                
                /**
                 * Sets (as xml) the "SelfBillingIndicator" element
                 */
                public void xsetSelfBillingIndicator(x0101.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator selfBillingIndicator)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0101.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator target = null;
                      target = (x0101.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator)get_store().find_element_user(SELFBILLINGINDICATOR$14, 0);
                      if (target == null)
                      {
                        target = (x0101.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator)get_store().add_element_user(SELFBILLINGINDICATOR$14);
                      }
                      target.set(selfBillingIndicator);
                    }
                }
                
                /**
                 * Gets the "SystemEntryDate" element
                 */
                public java.util.Calendar getSystemEntryDate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSTEMENTRYDATE$16, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getCalendarValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "SystemEntryDate" element
                 */
                public x0101.oecdStandardAuditFileTaxPT1.SAFdateTimeType xgetSystemEntryDate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0101.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
                      target = (x0101.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(SYSTEMENTRYDATE$16, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "SystemEntryDate" element
                 */
                public void setSystemEntryDate(java.util.Calendar systemEntryDate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSTEMENTRYDATE$16, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SYSTEMENTRYDATE$16);
                      }
                      target.setCalendarValue(systemEntryDate);
                    }
                }
                
                /**
                 * Sets (as xml) the "SystemEntryDate" element
                 */
                public void xsetSystemEntryDate(x0101.oecdStandardAuditFileTaxPT1.SAFdateTimeType systemEntryDate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0101.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
                      target = (x0101.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(SYSTEMENTRYDATE$16, 0);
                      if (target == null)
                      {
                        target = (x0101.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().add_element_user(SYSTEMENTRYDATE$16);
                      }
                      target.set(systemEntryDate);
                    }
                }
                
                /**
                 * Gets the "TransactionID" element
                 */
                public java.lang.String getTransactionID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONID$18, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TransactionID" element
                 */
                public x0101.oecdStandardAuditFileTaxPT1.SAFPTTransactionID xgetTransactionID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0101.oecdStandardAuditFileTaxPT1.SAFPTTransactionID target = null;
                      target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTTransactionID)get_store().find_element_user(TRANSACTIONID$18, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "TransactionID" element
                 */
                public boolean isSetTransactionID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(TRANSACTIONID$18) != 0;
                    }
                }
                
                /**
                 * Sets the "TransactionID" element
                 */
                public void setTransactionID(java.lang.String transactionID)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONID$18, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSACTIONID$18);
                      }
                      target.setStringValue(transactionID);
                    }
                }
                
                /**
                 * Sets (as xml) the "TransactionID" element
                 */
                public void xsetTransactionID(x0101.oecdStandardAuditFileTaxPT1.SAFPTTransactionID transactionID)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0101.oecdStandardAuditFileTaxPT1.SAFPTTransactionID target = null;
                      target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTTransactionID)get_store().find_element_user(TRANSACTIONID$18, 0);
                      if (target == null)
                      {
                        target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTTransactionID)get_store().add_element_user(TRANSACTIONID$18);
                      }
                      target.set(transactionID);
                    }
                }
                
                /**
                 * Unsets the "TransactionID" element
                 */
                public void unsetTransactionID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(TRANSACTIONID$18, 0);
                    }
                }
                
                /**
                 * Gets the "CustomerID" element
                 */
                public java.lang.String getCustomerID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERID$20, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "CustomerID" element
                 */
                public x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetCustomerID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                      target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(CUSTOMERID$20, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "CustomerID" element
                 */
                public void setCustomerID(java.lang.String customerID)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERID$20, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTOMERID$20);
                      }
                      target.setStringValue(customerID);
                    }
                }
                
                /**
                 * Sets (as xml) the "CustomerID" element
                 */
                public void xsetCustomerID(x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car customerID)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                      target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(CUSTOMERID$20, 0);
                      if (target == null)
                      {
                        target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().add_element_user(CUSTOMERID$20);
                      }
                      target.set(customerID);
                    }
                }
                
                /**
                 * Gets the "ShipTo" element
                 */
                public x0101.oecdStandardAuditFileTaxPT1.ShippingPointStructure getShipTo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0101.oecdStandardAuditFileTaxPT1.ShippingPointStructure target = null;
                      target = (x0101.oecdStandardAuditFileTaxPT1.ShippingPointStructure)get_store().find_element_user(SHIPTO$22, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * True if has "ShipTo" element
                 */
                public boolean isSetShipTo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(SHIPTO$22) != 0;
                    }
                }
                
                /**
                 * Sets the "ShipTo" element
                 */
                public void setShipTo(x0101.oecdStandardAuditFileTaxPT1.ShippingPointStructure shipTo)
                {
                    generatedSetterHelperImpl(shipTo, SHIPTO$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                }
                
                /**
                 * Appends and returns a new empty "ShipTo" element
                 */
                public x0101.oecdStandardAuditFileTaxPT1.ShippingPointStructure addNewShipTo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0101.oecdStandardAuditFileTaxPT1.ShippingPointStructure target = null;
                      target = (x0101.oecdStandardAuditFileTaxPT1.ShippingPointStructure)get_store().add_element_user(SHIPTO$22);
                      return target;
                    }
                }
                
                /**
                 * Unsets the "ShipTo" element
                 */
                public void unsetShipTo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(SHIPTO$22, 0);
                    }
                }
                
                /**
                 * Gets the "ShipFrom" element
                 */
                public x0101.oecdStandardAuditFileTaxPT1.ShippingPointStructure getShipFrom()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0101.oecdStandardAuditFileTaxPT1.ShippingPointStructure target = null;
                      target = (x0101.oecdStandardAuditFileTaxPT1.ShippingPointStructure)get_store().find_element_user(SHIPFROM$24, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * True if has "ShipFrom" element
                 */
                public boolean isSetShipFrom()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(SHIPFROM$24) != 0;
                    }
                }
                
                /**
                 * Sets the "ShipFrom" element
                 */
                public void setShipFrom(x0101.oecdStandardAuditFileTaxPT1.ShippingPointStructure shipFrom)
                {
                    generatedSetterHelperImpl(shipFrom, SHIPFROM$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                }
                
                /**
                 * Appends and returns a new empty "ShipFrom" element
                 */
                public x0101.oecdStandardAuditFileTaxPT1.ShippingPointStructure addNewShipFrom()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0101.oecdStandardAuditFileTaxPT1.ShippingPointStructure target = null;
                      target = (x0101.oecdStandardAuditFileTaxPT1.ShippingPointStructure)get_store().add_element_user(SHIPFROM$24);
                      return target;
                    }
                }
                
                /**
                 * Unsets the "ShipFrom" element
                 */
                public void unsetShipFrom()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(SHIPFROM$24, 0);
                    }
                }
                
                /**
                 * Gets a List of "Line" elements
                 */
                public java.util.List<x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line> getLineList()
                {
                    final class LineList extends java.util.AbstractList<x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line>
                    {
                      @Override
                      public x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line get(int i)
                          { return InvoiceImpl.this.getLineArray(i); }
                      
                      @Override
                      public x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line set(int i, x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line o)
                      {
                        x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line old = InvoiceImpl.this.getLineArray(i);
                        InvoiceImpl.this.setLineArray(i, o);
                        return old;
                      }
                      
                      @Override
                      public void add(int i, x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line o)
                          { InvoiceImpl.this.insertNewLine(i).set(o); }
                      
                      @Override
                      public x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line remove(int i)
                      {
                        x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line old = InvoiceImpl.this.getLineArray(i);
                        InvoiceImpl.this.removeLine(i);
                        return old;
                      }
                      
                      @Override
                      public int size()
                          { return InvoiceImpl.this.sizeOfLineArray(); }
                      
                    }
                    
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return new LineList();
                    }
                }
                
                /**
                 * Gets array of all "Line" elements
                 * @deprecated
                 */
                @Deprecated
                public x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line[] getLineArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List<x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line> targetList = new java.util.ArrayList<x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line>();
                      get_store().find_all_element_users(LINE$26, targetList);
                      x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line[] result = new x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "Line" element
                 */
                public x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line getLineArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line target = null;
                      target = (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line)get_store().find_element_user(LINE$26, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "Line" element
                 */
                public int sizeOfLineArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(LINE$26);
                    }
                }
                
                /**
                 * Sets array of all "Line" element  WARNING: This method is not atomicaly synchronized.
                 */
                public void setLineArray(x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line[] lineArray)
                {
                    check_orphaned();
                    arraySetterHelper(lineArray, LINE$26);
                }
                
                /**
                 * Sets ith "Line" element
                 */
                public void setLineArray(int i, x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line line)
                {
                    generatedSetterHelperImpl(line, LINE$26, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "Line" element
                 */
                public x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line insertNewLine(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line target = null;
                      target = (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line)get_store().insert_element_user(LINE$26, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "Line" element
                 */
                public x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line addNewLine()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line target = null;
                      target = (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line)get_store().add_element_user(LINE$26);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "Line" element
                 */
                public void removeLine(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(LINE$26, i);
                    }
                }
                
                /**
                 * Gets the "DocumentTotals" element
                 */
                public x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentTotals getDocumentTotals()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentTotals target = null;
                      target = (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentTotals)get_store().find_element_user(DOCUMENTTOTALS$28, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "DocumentTotals" element
                 */
                public void setDocumentTotals(x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentTotals documentTotals)
                {
                    generatedSetterHelperImpl(documentTotals, DOCUMENTTOTALS$28, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                }
                
                /**
                 * Appends and returns a new empty "DocumentTotals" element
                 */
                public x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentTotals addNewDocumentTotals()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentTotals target = null;
                      target = (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentTotals)get_store().add_element_user(DOCUMENTTOTALS$28);
                      return target;
                    }
                }
                /**
                 * An XML Line(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01).
                 *
                 * This is a complex type.
                 */
                public static class LineImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line
                {
                    private static final long serialVersionUID = 1L;
                    
                    public LineImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName LINENUMBER$0 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "LineNumber");
                    private static final javax.xml.namespace.QName ORDERREFERENCES$2 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "OrderReferences");
                    private static final javax.xml.namespace.QName PRODUCTCODE$4 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "ProductCode");
                    private static final javax.xml.namespace.QName PRODUCTDESCRIPTION$6 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "ProductDescription");
                    private static final javax.xml.namespace.QName QUANTITY$8 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "Quantity");
                    private static final javax.xml.namespace.QName UNITOFMEASURE$10 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "UnitOfMeasure");
                    private static final javax.xml.namespace.QName UNITPRICE$12 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "UnitPrice");
                    private static final javax.xml.namespace.QName TAXPOINTDATE$14 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "TaxPointDate");
                    private static final javax.xml.namespace.QName REFERENCES$16 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "References");
                    private static final javax.xml.namespace.QName DESCRIPTION$18 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "Description");
                    private static final javax.xml.namespace.QName DEBITAMOUNT$20 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "DebitAmount");
                    private static final javax.xml.namespace.QName CREDITAMOUNT$22 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "CreditAmount");
                    private static final javax.xml.namespace.QName TAX$24 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "Tax");
                    private static final javax.xml.namespace.QName TAXEXEMPTIONREASON$26 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "TaxExemptionReason");
                    private static final javax.xml.namespace.QName SETTLEMENTAMOUNT$28 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "SettlementAmount");
                    
                    
                    /**
                     * Gets the "LineNumber" element
                     */
                    public java.math.BigInteger getLineNumber()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINENUMBER$0, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getBigIntegerValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "LineNumber" element
                     */
                    public org.apache.xmlbeans.XmlInteger xgetLineNumber()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlInteger target = null;
                        target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(LINENUMBER$0, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "LineNumber" element
                     */
                    public void setLineNumber(java.math.BigInteger lineNumber)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINENUMBER$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINENUMBER$0);
                        }
                        target.setBigIntegerValue(lineNumber);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "LineNumber" element
                     */
                    public void xsetLineNumber(org.apache.xmlbeans.XmlInteger lineNumber)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlInteger target = null;
                        target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(LINENUMBER$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(LINENUMBER$0);
                        }
                        target.set(lineNumber);
                      }
                    }
                    
                    /**
                     * Gets a List of "OrderReferences" elements
                     */
                    public java.util.List<x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument.OrderReferences> getOrderReferencesList()
                    {
                      final class OrderReferencesList extends java.util.AbstractList<x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument.OrderReferences>
                      {
                        @Override
                        public x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument.OrderReferences get(int i)
                            { return LineImpl.this.getOrderReferencesArray(i); }
                        
                        @Override
                        public x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument.OrderReferences set(int i, x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument.OrderReferences o)
                        {
                          x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument.OrderReferences old = LineImpl.this.getOrderReferencesArray(i);
                          LineImpl.this.setOrderReferencesArray(i, o);
                          return old;
                        }
                        
                        @Override
                        public void add(int i, x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument.OrderReferences o)
                            { LineImpl.this.insertNewOrderReferences(i).set(o); }
                        
                        @Override
                        public x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument.OrderReferences remove(int i)
                        {
                          x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument.OrderReferences old = LineImpl.this.getOrderReferencesArray(i);
                          LineImpl.this.removeOrderReferences(i);
                          return old;
                        }
                        
                        @Override
                        public int size()
                            { return LineImpl.this.sizeOfOrderReferencesArray(); }
                        
                      }
                      
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return new OrderReferencesList();
                      }
                    }
                    
                    /**
                     * Gets array of all "OrderReferences" elements
                     * @deprecated
                     */
                    @Deprecated
                    public x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument.OrderReferences[] getOrderReferencesArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        java.util.List<x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument.OrderReferences> targetList = new java.util.ArrayList<x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument.OrderReferences>();
                        get_store().find_all_element_users(ORDERREFERENCES$2, targetList);
                        x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument.OrderReferences[] result = new x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument.OrderReferences[targetList.size()];
                        targetList.toArray(result);
                        return result;
                      }
                    }
                    
                    /**
                     * Gets ith "OrderReferences" element
                     */
                    public x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument.OrderReferences getOrderReferencesArray(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument.OrderReferences target = null;
                        target = (x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument.OrderReferences)get_store().find_element_user(ORDERREFERENCES$2, i);
                        if (target == null)
                        {
                          throw new IndexOutOfBoundsException();
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Returns number of "OrderReferences" element
                     */
                    public int sizeOfOrderReferencesArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(ORDERREFERENCES$2);
                      }
                    }
                    
                    /**
                     * Sets array of all "OrderReferences" element  WARNING: This method is not atomicaly synchronized.
                     */
                    public void setOrderReferencesArray(x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument.OrderReferences[] orderReferencesArray)
                    {
                      check_orphaned();
                      arraySetterHelper(orderReferencesArray, ORDERREFERENCES$2);
                    }
                    
                    /**
                     * Sets ith "OrderReferences" element
                     */
                    public void setOrderReferencesArray(int i, x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument.OrderReferences orderReferences)
                    {
                      generatedSetterHelperImpl(orderReferences, ORDERREFERENCES$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
                    }
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "OrderReferences" element
                     */
                    public x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument.OrderReferences insertNewOrderReferences(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument.OrderReferences target = null;
                        target = (x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument.OrderReferences)get_store().insert_element_user(ORDERREFERENCES$2, i);
                        return target;
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "OrderReferences" element
                     */
                    public x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument.OrderReferences addNewOrderReferences()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument.OrderReferences target = null;
                        target = (x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument.OrderReferences)get_store().add_element_user(ORDERREFERENCES$2);
                        return target;
                      }
                    }
                    
                    /**
                     * Removes the ith "OrderReferences" element
                     */
                    public void removeOrderReferences(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(ORDERREFERENCES$2, i);
                      }
                    }
                    
                    /**
                     * Gets the "ProductCode" element
                     */
                    public java.lang.String getProductCode()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCODE$4, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "ProductCode" element
                     */
                    public x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetProductCode()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                        target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(PRODUCTCODE$4, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "ProductCode" element
                     */
                    public void setProductCode(java.lang.String productCode)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCODE$4, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTCODE$4);
                        }
                        target.setStringValue(productCode);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "ProductCode" element
                     */
                    public void xsetProductCode(x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car productCode)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                        target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(PRODUCTCODE$4, 0);
                        if (target == null)
                        {
                          target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().add_element_user(PRODUCTCODE$4);
                        }
                        target.set(productCode);
                      }
                    }
                    
                    /**
                     * Gets the "ProductDescription" element
                     */
                    public java.lang.String getProductDescription()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTDESCRIPTION$6, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "ProductDescription" element
                     */
                    public x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car xgetProductDescription()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
                        target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(PRODUCTDESCRIPTION$6, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "ProductDescription" element
                     */
                    public void setProductDescription(java.lang.String productDescription)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTDESCRIPTION$6, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTDESCRIPTION$6);
                        }
                        target.setStringValue(productDescription);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "ProductDescription" element
                     */
                    public void xsetProductDescription(x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car productDescription)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
                        target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(PRODUCTDESCRIPTION$6, 0);
                        if (target == null)
                        {
                          target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().add_element_user(PRODUCTDESCRIPTION$6);
                        }
                        target.set(productDescription);
                      }
                    }
                    
                    /**
                     * Gets the "Quantity" element
                     */
                    public java.math.BigDecimal getQuantity()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTITY$8, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getBigDecimalValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "Quantity" element
                     */
                    public x0101.oecdStandardAuditFileTaxPT1.SAFdecimalType xgetQuantity()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0101.oecdStandardAuditFileTaxPT1.SAFdecimalType target = null;
                        target = (x0101.oecdStandardAuditFileTaxPT1.SAFdecimalType)get_store().find_element_user(QUANTITY$8, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "Quantity" element
                     */
                    public void setQuantity(java.math.BigDecimal quantity)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTITY$8, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUANTITY$8);
                        }
                        target.setBigDecimalValue(quantity);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "Quantity" element
                     */
                    public void xsetQuantity(x0101.oecdStandardAuditFileTaxPT1.SAFdecimalType quantity)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0101.oecdStandardAuditFileTaxPT1.SAFdecimalType target = null;
                        target = (x0101.oecdStandardAuditFileTaxPT1.SAFdecimalType)get_store().find_element_user(QUANTITY$8, 0);
                        if (target == null)
                        {
                          target = (x0101.oecdStandardAuditFileTaxPT1.SAFdecimalType)get_store().add_element_user(QUANTITY$8);
                        }
                        target.set(quantity);
                      }
                    }
                    
                    /**
                     * Gets the "UnitOfMeasure" element
                     */
                    public java.lang.String getUnitOfMeasure()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITOFMEASURE$10, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "UnitOfMeasure" element
                     */
                    public x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car xgetUnitOfMeasure()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car target = null;
                        target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().find_element_user(UNITOFMEASURE$10, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "UnitOfMeasure" element
                     */
                    public void setUnitOfMeasure(java.lang.String unitOfMeasure)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITOFMEASURE$10, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNITOFMEASURE$10);
                        }
                        target.setStringValue(unitOfMeasure);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "UnitOfMeasure" element
                     */
                    public void xsetUnitOfMeasure(x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car unitOfMeasure)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car target = null;
                        target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().find_element_user(UNITOFMEASURE$10, 0);
                        if (target == null)
                        {
                          target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().add_element_user(UNITOFMEASURE$10);
                        }
                        target.set(unitOfMeasure);
                      }
                    }
                    
                    /**
                     * Gets the "UnitPrice" element
                     */
                    public java.math.BigDecimal getUnitPrice()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITPRICE$12, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getBigDecimalValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "UnitPrice" element
                     */
                    public x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetUnitPrice()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(UNITPRICE$12, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "UnitPrice" element
                     */
                    public void setUnitPrice(java.math.BigDecimal unitPrice)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITPRICE$12, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNITPRICE$12);
                        }
                        target.setBigDecimalValue(unitPrice);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "UnitPrice" element
                     */
                    public void xsetUnitPrice(x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType unitPrice)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(UNITPRICE$12, 0);
                        if (target == null)
                        {
                          target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(UNITPRICE$12);
                        }
                        target.set(unitPrice);
                      }
                    }
                    
                    /**
                     * Gets the "TaxPointDate" element
                     */
                    public java.util.Calendar getTaxPointDate()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXPOINTDATE$14, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getCalendarValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TaxPointDate" element
                     */
                    public x0101.oecdStandardAuditFileTaxPT1.SAFdateType xgetTaxPointDate()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0101.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
                        target = (x0101.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(TAXPOINTDATE$14, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "TaxPointDate" element
                     */
                    public void setTaxPointDate(java.util.Calendar taxPointDate)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXPOINTDATE$14, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXPOINTDATE$14);
                        }
                        target.setCalendarValue(taxPointDate);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TaxPointDate" element
                     */
                    public void xsetTaxPointDate(x0101.oecdStandardAuditFileTaxPT1.SAFdateType taxPointDate)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0101.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
                        target = (x0101.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(TAXPOINTDATE$14, 0);
                        if (target == null)
                        {
                          target = (x0101.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().add_element_user(TAXPOINTDATE$14);
                        }
                        target.set(taxPointDate);
                      }
                    }
                    
                    /**
                     * Gets the "References" element
                     */
                    public x0101.oecdStandardAuditFileTaxPT1.ReferencesDocument.References getReferences()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0101.oecdStandardAuditFileTaxPT1.ReferencesDocument.References target = null;
                        target = (x0101.oecdStandardAuditFileTaxPT1.ReferencesDocument.References)get_store().find_element_user(REFERENCES$16, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "References" element
                     */
                    public boolean isSetReferences()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(REFERENCES$16) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "References" element
                     */
                    public void setReferences(x0101.oecdStandardAuditFileTaxPT1.ReferencesDocument.References references)
                    {
                      generatedSetterHelperImpl(references, REFERENCES$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "References" element
                     */
                    public x0101.oecdStandardAuditFileTaxPT1.ReferencesDocument.References addNewReferences()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0101.oecdStandardAuditFileTaxPT1.ReferencesDocument.References target = null;
                        target = (x0101.oecdStandardAuditFileTaxPT1.ReferencesDocument.References)get_store().add_element_user(REFERENCES$16);
                        return target;
                      }
                    }
                    
                    /**
                     * Unsets the "References" element
                     */
                    public void unsetReferences()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(REFERENCES$16, 0);
                      }
                    }
                    
                    /**
                     * Gets the "Description" element
                     */
                    public java.lang.String getDescription()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$18, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "Description" element
                     */
                    public x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car xgetDescription()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
                        target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(DESCRIPTION$18, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "Description" element
                     */
                    public void setDescription(java.lang.String description)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$18, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$18);
                        }
                        target.setStringValue(description);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "Description" element
                     */
                    public void xsetDescription(x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car description)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
                        target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(DESCRIPTION$18, 0);
                        if (target == null)
                        {
                          target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().add_element_user(DESCRIPTION$18);
                        }
                        target.set(description);
                      }
                    }
                    
                    /**
                     * Gets the "DebitAmount" element
                     */
                    public java.math.BigDecimal getDebitAmount()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEBITAMOUNT$20, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getBigDecimalValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "DebitAmount" element
                     */
                    public x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetDebitAmount()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(DEBITAMOUNT$20, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "DebitAmount" element
                     */
                    public boolean isSetDebitAmount()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(DEBITAMOUNT$20) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "DebitAmount" element
                     */
                    public void setDebitAmount(java.math.BigDecimal debitAmount)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEBITAMOUNT$20, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEBITAMOUNT$20);
                        }
                        target.setBigDecimalValue(debitAmount);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "DebitAmount" element
                     */
                    public void xsetDebitAmount(x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType debitAmount)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(DEBITAMOUNT$20, 0);
                        if (target == null)
                        {
                          target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(DEBITAMOUNT$20);
                        }
                        target.set(debitAmount);
                      }
                    }
                    
                    /**
                     * Unsets the "DebitAmount" element
                     */
                    public void unsetDebitAmount()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(DEBITAMOUNT$20, 0);
                      }
                    }
                    
                    /**
                     * Gets the "CreditAmount" element
                     */
                    public java.math.BigDecimal getCreditAmount()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREDITAMOUNT$22, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getBigDecimalValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "CreditAmount" element
                     */
                    public x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetCreditAmount()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(CREDITAMOUNT$22, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "CreditAmount" element
                     */
                    public boolean isSetCreditAmount()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(CREDITAMOUNT$22) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "CreditAmount" element
                     */
                    public void setCreditAmount(java.math.BigDecimal creditAmount)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREDITAMOUNT$22, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREDITAMOUNT$22);
                        }
                        target.setBigDecimalValue(creditAmount);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "CreditAmount" element
                     */
                    public void xsetCreditAmount(x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType creditAmount)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(CREDITAMOUNT$22, 0);
                        if (target == null)
                        {
                          target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(CREDITAMOUNT$22);
                        }
                        target.set(creditAmount);
                      }
                    }
                    
                    /**
                     * Unsets the "CreditAmount" element
                     */
                    public void unsetCreditAmount()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(CREDITAMOUNT$22, 0);
                      }
                    }
                    
                    /**
                     * Gets the "Tax" element
                     */
                    public x0101.oecdStandardAuditFileTaxPT1.TaxDocument.Tax getTax()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0101.oecdStandardAuditFileTaxPT1.TaxDocument.Tax target = null;
                        target = (x0101.oecdStandardAuditFileTaxPT1.TaxDocument.Tax)get_store().find_element_user(TAX$24, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "Tax" element
                     */
                    public boolean isSetTax()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TAX$24) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "Tax" element
                     */
                    public void setTax(x0101.oecdStandardAuditFileTaxPT1.TaxDocument.Tax tax)
                    {
                      generatedSetterHelperImpl(tax, TAX$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "Tax" element
                     */
                    public x0101.oecdStandardAuditFileTaxPT1.TaxDocument.Tax addNewTax()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0101.oecdStandardAuditFileTaxPT1.TaxDocument.Tax target = null;
                        target = (x0101.oecdStandardAuditFileTaxPT1.TaxDocument.Tax)get_store().add_element_user(TAX$24);
                        return target;
                      }
                    }
                    
                    /**
                     * Unsets the "Tax" element
                     */
                    public void unsetTax()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TAX$24, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TaxExemptionReason" element
                     */
                    public java.lang.String getTaxExemptionReason()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXEXEMPTIONREASON$26, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TaxExemptionReason" element
                     */
                    public x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car xgetTaxExemptionReason()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
                        target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(TAXEXEMPTIONREASON$26, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TaxExemptionReason" element
                     */
                    public boolean isSetTaxExemptionReason()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TAXEXEMPTIONREASON$26) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TaxExemptionReason" element
                     */
                    public void setTaxExemptionReason(java.lang.String taxExemptionReason)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXEXEMPTIONREASON$26, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXEXEMPTIONREASON$26);
                        }
                        target.setStringValue(taxExemptionReason);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TaxExemptionReason" element
                     */
                    public void xsetTaxExemptionReason(x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car taxExemptionReason)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
                        target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(TAXEXEMPTIONREASON$26, 0);
                        if (target == null)
                        {
                          target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().add_element_user(TAXEXEMPTIONREASON$26);
                        }
                        target.set(taxExemptionReason);
                      }
                    }
                    
                    /**
                     * Unsets the "TaxExemptionReason" element
                     */
                    public void unsetTaxExemptionReason()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TAXEXEMPTIONREASON$26, 0);
                      }
                    }
                    
                    /**
                     * Gets the "SettlementAmount" element
                     */
                    public java.math.BigDecimal getSettlementAmount()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SETTLEMENTAMOUNT$28, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getBigDecimalValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "SettlementAmount" element
                     */
                    public x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetSettlementAmount()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(SETTLEMENTAMOUNT$28, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "SettlementAmount" element
                     */
                    public boolean isSetSettlementAmount()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(SETTLEMENTAMOUNT$28) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "SettlementAmount" element
                     */
                    public void setSettlementAmount(java.math.BigDecimal settlementAmount)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SETTLEMENTAMOUNT$28, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SETTLEMENTAMOUNT$28);
                        }
                        target.setBigDecimalValue(settlementAmount);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "SettlementAmount" element
                     */
                    public void xsetSettlementAmount(x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType settlementAmount)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(SETTLEMENTAMOUNT$28, 0);
                        if (target == null)
                        {
                          target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(SETTLEMENTAMOUNT$28);
                        }
                        target.set(settlementAmount);
                      }
                    }
                    
                    /**
                     * Unsets the "SettlementAmount" element
                     */
                    public void unsetSettlementAmount()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(SETTLEMENTAMOUNT$28, 0);
                      }
                    }
                }
                /**
                 * An XML DocumentTotals(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01).
                 *
                 * This is a complex type.
                 */
                public static class DocumentTotalsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentTotals
                {
                    private static final long serialVersionUID = 1L;
                    
                    public DocumentTotalsImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName TAXPAYABLE$0 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "TaxPayable");
                    private static final javax.xml.namespace.QName NETTOTAL$2 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "NetTotal");
                    private static final javax.xml.namespace.QName GROSSTOTAL$4 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "GrossTotal");
                    private static final javax.xml.namespace.QName CURRENCY$6 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "Currency");
                    private static final javax.xml.namespace.QName SETTLEMENT$8 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "Settlement");
                    
                    
                    /**
                     * Gets the "TaxPayable" element
                     */
                    public java.math.BigDecimal getTaxPayable()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXPAYABLE$0, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getBigDecimalValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TaxPayable" element
                     */
                    public x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetTaxPayable()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TAXPAYABLE$0, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "TaxPayable" element
                     */
                    public void setTaxPayable(java.math.BigDecimal taxPayable)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXPAYABLE$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXPAYABLE$0);
                        }
                        target.setBigDecimalValue(taxPayable);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TaxPayable" element
                     */
                    public void xsetTaxPayable(x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType taxPayable)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TAXPAYABLE$0, 0);
                        if (target == null)
                        {
                          target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(TAXPAYABLE$0);
                        }
                        target.set(taxPayable);
                      }
                    }
                    
                    /**
                     * Gets the "NetTotal" element
                     */
                    public java.math.BigDecimal getNetTotal()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NETTOTAL$2, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getBigDecimalValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "NetTotal" element
                     */
                    public x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetNetTotal()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(NETTOTAL$2, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "NetTotal" element
                     */
                    public void setNetTotal(java.math.BigDecimal netTotal)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NETTOTAL$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NETTOTAL$2);
                        }
                        target.setBigDecimalValue(netTotal);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "NetTotal" element
                     */
                    public void xsetNetTotal(x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType netTotal)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(NETTOTAL$2, 0);
                        if (target == null)
                        {
                          target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(NETTOTAL$2);
                        }
                        target.set(netTotal);
                      }
                    }
                    
                    /**
                     * Gets the "GrossTotal" element
                     */
                    public java.math.BigDecimal getGrossTotal()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROSSTOTAL$4, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getBigDecimalValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "GrossTotal" element
                     */
                    public x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetGrossTotal()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(GROSSTOTAL$4, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "GrossTotal" element
                     */
                    public void setGrossTotal(java.math.BigDecimal grossTotal)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROSSTOTAL$4, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GROSSTOTAL$4);
                        }
                        target.setBigDecimalValue(grossTotal);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "GrossTotal" element
                     */
                    public void xsetGrossTotal(x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType grossTotal)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(GROSSTOTAL$4, 0);
                        if (target == null)
                        {
                          target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(GROSSTOTAL$4);
                        }
                        target.set(grossTotal);
                      }
                    }
                    
                    /**
                     * Gets the "Currency" element
                     */
                    public x0101.oecdStandardAuditFileTaxPT1.CurrencyDocument.Currency getCurrency()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0101.oecdStandardAuditFileTaxPT1.CurrencyDocument.Currency target = null;
                        target = (x0101.oecdStandardAuditFileTaxPT1.CurrencyDocument.Currency)get_store().find_element_user(CURRENCY$6, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "Currency" element
                     */
                    public boolean isSetCurrency()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(CURRENCY$6) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "Currency" element
                     */
                    public void setCurrency(x0101.oecdStandardAuditFileTaxPT1.CurrencyDocument.Currency currency)
                    {
                      generatedSetterHelperImpl(currency, CURRENCY$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "Currency" element
                     */
                    public x0101.oecdStandardAuditFileTaxPT1.CurrencyDocument.Currency addNewCurrency()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0101.oecdStandardAuditFileTaxPT1.CurrencyDocument.Currency target = null;
                        target = (x0101.oecdStandardAuditFileTaxPT1.CurrencyDocument.Currency)get_store().add_element_user(CURRENCY$6);
                        return target;
                      }
                    }
                    
                    /**
                     * Unsets the "Currency" element
                     */
                    public void unsetCurrency()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(CURRENCY$6, 0);
                      }
                    }
                    
                    /**
                     * Gets the "Settlement" element
                     */
                    public x0101.oecdStandardAuditFileTaxPT1.SettlementDocument.Settlement getSettlement()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0101.oecdStandardAuditFileTaxPT1.SettlementDocument.Settlement target = null;
                        target = (x0101.oecdStandardAuditFileTaxPT1.SettlementDocument.Settlement)get_store().find_element_user(SETTLEMENT$8, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "Settlement" element
                     */
                    public boolean isSetSettlement()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(SETTLEMENT$8) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "Settlement" element
                     */
                    public void setSettlement(x0101.oecdStandardAuditFileTaxPT1.SettlementDocument.Settlement settlement)
                    {
                      generatedSetterHelperImpl(settlement, SETTLEMENT$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "Settlement" element
                     */
                    public x0101.oecdStandardAuditFileTaxPT1.SettlementDocument.Settlement addNewSettlement()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0101.oecdStandardAuditFileTaxPT1.SettlementDocument.Settlement target = null;
                        target = (x0101.oecdStandardAuditFileTaxPT1.SettlementDocument.Settlement)get_store().add_element_user(SETTLEMENT$8);
                        return target;
                      }
                    }
                    
                    /**
                     * Unsets the "Settlement" element
                     */
                    public void unsetSettlement()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(SETTLEMENT$8, 0);
                      }
                    }
                }
            }
        }
    }
}
