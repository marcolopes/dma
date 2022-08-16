/*
 * An XML document type.
 * Localname: SourceDocuments
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one SourceDocuments(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class SourceDocumentsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument
{
    private static final long serialVersionUID = 1L;
    
    public SourceDocumentsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCEDOCUMENTS$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "SourceDocuments");
    
    
    /**
     * Gets the "SourceDocuments" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments getSourceDocuments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments)get_store().find_element_user(SOURCEDOCUMENTS$0, 0);
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
    public void setSourceDocuments(x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments sourceDocuments)
    {
        generatedSetterHelperImpl(sourceDocuments, SOURCEDOCUMENTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SourceDocuments" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments addNewSourceDocuments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments)get_store().add_element_user(SOURCEDOCUMENTS$0);
            return target;
        }
    }
    /**
     * An XML SourceDocuments(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
     *
     * This is a complex type.
     */
    public static class SourceDocumentsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments
    {
        private static final long serialVersionUID = 1L;
        
        public SourceDocumentsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SALESINVOICES$0 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "SalesInvoices");
        private static final javax.xml.namespace.QName MOVEMENTOFGOODS$2 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "MovementOfGoods");
        private static final javax.xml.namespace.QName WORKINGDOCUMENTS$4 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "WorkingDocuments");
        private static final javax.xml.namespace.QName PAYMENTS$6 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Payments");
        
        
        /**
         * Gets the "SalesInvoices" element
         */
        public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices getSalesInvoices()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices)get_store().find_element_user(SALESINVOICES$0, 0);
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
        public void setSalesInvoices(x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices salesInvoices)
        {
            generatedSetterHelperImpl(salesInvoices, SALESINVOICES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "SalesInvoices" element
         */
        public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices addNewSalesInvoices()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices)get_store().add_element_user(SALESINVOICES$0);
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
         * Gets the "MovementOfGoods" element
         */
        public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods getMovementOfGoods()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods)get_store().find_element_user(MOVEMENTOFGOODS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "MovementOfGoods" element
         */
        public boolean isSetMovementOfGoods()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MOVEMENTOFGOODS$2) != 0;
            }
        }
        
        /**
         * Sets the "MovementOfGoods" element
         */
        public void setMovementOfGoods(x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods movementOfGoods)
        {
            generatedSetterHelperImpl(movementOfGoods, MOVEMENTOFGOODS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "MovementOfGoods" element
         */
        public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods addNewMovementOfGoods()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods)get_store().add_element_user(MOVEMENTOFGOODS$2);
                return target;
            }
        }
        
        /**
         * Unsets the "MovementOfGoods" element
         */
        public void unsetMovementOfGoods()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MOVEMENTOFGOODS$2, 0);
            }
        }
        
        /**
         * Gets the "WorkingDocuments" element
         */
        public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments getWorkingDocuments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments)get_store().find_element_user(WORKINGDOCUMENTS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "WorkingDocuments" element
         */
        public boolean isSetWorkingDocuments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WORKINGDOCUMENTS$4) != 0;
            }
        }
        
        /**
         * Sets the "WorkingDocuments" element
         */
        public void setWorkingDocuments(x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments workingDocuments)
        {
            generatedSetterHelperImpl(workingDocuments, WORKINGDOCUMENTS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "WorkingDocuments" element
         */
        public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments addNewWorkingDocuments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments)get_store().add_element_user(WORKINGDOCUMENTS$4);
                return target;
            }
        }
        
        /**
         * Unsets the "WorkingDocuments" element
         */
        public void unsetWorkingDocuments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WORKINGDOCUMENTS$4, 0);
            }
        }
        
        /**
         * Gets the "Payments" element
         */
        public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments getPayments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments)get_store().find_element_user(PAYMENTS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Payments" element
         */
        public boolean isSetPayments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PAYMENTS$6) != 0;
            }
        }
        
        /**
         * Sets the "Payments" element
         */
        public void setPayments(x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments payments)
        {
            generatedSetterHelperImpl(payments, PAYMENTS$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Payments" element
         */
        public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments addNewPayments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments)get_store().add_element_user(PAYMENTS$6);
                return target;
            }
        }
        
        /**
         * Unsets the "Payments" element
         */
        public void unsetPayments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PAYMENTS$6, 0);
            }
        }
        /**
         * An XML SalesInvoices(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
         *
         * This is a complex type.
         */
        public static class SalesInvoicesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices
        {
            private static final long serialVersionUID = 1L;
            
            public SalesInvoicesImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NUMBEROFENTRIES$0 = 
                new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "NumberOfEntries");
            private static final javax.xml.namespace.QName TOTALDEBIT$2 = 
                new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TotalDebit");
            private static final javax.xml.namespace.QName TOTALCREDIT$4 = 
                new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TotalCredit");
            private static final javax.xml.namespace.QName INVOICE$6 = 
                new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Invoice");
            
            
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
            public org.apache.xmlbeans.XmlNonNegativeInteger xgetNumberOfEntries()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(NUMBEROFENTRIES$0, 0);
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
            public void xsetNumberOfEntries(org.apache.xmlbeans.XmlNonNegativeInteger numberOfEntries)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(NUMBEROFENTRIES$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(NUMBEROFENTRIES$0);
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
            public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetTotalDebit()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TOTALDEBIT$2, 0);
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
            public void xsetTotalDebit(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType totalDebit)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TOTALDEBIT$2, 0);
                    if (target == null)
                    {
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(TOTALDEBIT$2);
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
            public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetTotalCredit()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TOTALCREDIT$4, 0);
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
            public void xsetTotalCredit(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType totalCredit)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TOTALCREDIT$4, 0);
                    if (target == null)
                    {
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(TOTALCREDIT$4);
                    }
                    target.set(totalCredit);
                }
            }
            
            /**
             * Gets a List of "Invoice" elements
             */
            public java.util.List<x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice> getInvoiceList()
            {
                final class InvoiceList extends java.util.AbstractList<x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice>
                {
                    @Override
                    public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice get(int i)
                        { return SalesInvoicesImpl.this.getInvoiceArray(i); }
                    
                    @Override
                    public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice set(int i, x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice o)
                    {
                      x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice old = SalesInvoicesImpl.this.getInvoiceArray(i);
                      SalesInvoicesImpl.this.setInvoiceArray(i, o);
                      return old;
                    }
                    
                    @Override
                    public void add(int i, x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice o)
                        { SalesInvoicesImpl.this.insertNewInvoice(i).set(o); }
                    
                    @Override
                    public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice remove(int i)
                    {
                      x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice old = SalesInvoicesImpl.this.getInvoiceArray(i);
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
            public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice[] getInvoiceArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List<x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice> targetList = new java.util.ArrayList<x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice>();
                    get_store().find_all_element_users(INVOICE$6, targetList);
                    x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice[] result = new x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Invoice" element
             */
            public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice getInvoiceArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice)get_store().find_element_user(INVOICE$6, i);
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
            public void setInvoiceArray(x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice[] invoiceArray)
            {
                check_orphaned();
                arraySetterHelper(invoiceArray, INVOICE$6);
            }
            
            /**
             * Sets ith "Invoice" element
             */
            public void setInvoiceArray(int i, x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice invoice)
            {
                generatedSetterHelperImpl(invoice, INVOICE$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Invoice" element
             */
            public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice insertNewInvoice(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice)get_store().insert_element_user(INVOICE$6, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Invoice" element
             */
            public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice addNewInvoice()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice)get_store().add_element_user(INVOICE$6);
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
             * An XML Invoice(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
             *
             * This is a complex type.
             */
            public static class InvoiceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice
            {
                private static final long serialVersionUID = 1L;
                
                public InvoiceImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName INVOICENO$0 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "InvoiceNo");
                private static final javax.xml.namespace.QName ATCUD$2 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "ATCUD");
                private static final javax.xml.namespace.QName DOCUMENTSTATUS$4 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "DocumentStatus");
                private static final javax.xml.namespace.QName HASH$6 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Hash");
                private static final javax.xml.namespace.QName HASHCONTROL$8 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "HashControl");
                private static final javax.xml.namespace.QName PERIOD$10 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Period");
                private static final javax.xml.namespace.QName INVOICEDATE$12 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "InvoiceDate");
                private static final javax.xml.namespace.QName INVOICETYPE$14 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "InvoiceType");
                private static final javax.xml.namespace.QName SPECIALREGIMES$16 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "SpecialRegimes");
                private static final javax.xml.namespace.QName SOURCEID$18 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "SourceID");
                private static final javax.xml.namespace.QName EACCODE$20 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "EACCode");
                private static final javax.xml.namespace.QName SYSTEMENTRYDATE$22 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "SystemEntryDate");
                private static final javax.xml.namespace.QName TRANSACTIONID$24 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TransactionID");
                private static final javax.xml.namespace.QName CUSTOMERID$26 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "CustomerID");
                private static final javax.xml.namespace.QName SHIPTO$28 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "ShipTo");
                private static final javax.xml.namespace.QName SHIPFROM$30 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "ShipFrom");
                private static final javax.xml.namespace.QName MOVEMENTENDTIME$32 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "MovementEndTime");
                private static final javax.xml.namespace.QName MOVEMENTSTARTTIME$34 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "MovementStartTime");
                private static final javax.xml.namespace.QName LINE$36 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Line");
                private static final javax.xml.namespace.QName DOCUMENTTOTALS$38 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "DocumentTotals");
                private static final javax.xml.namespace.QName WITHHOLDINGTAX$40 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "WithholdingTax");
                
                
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
                public x0401.oecdStandardAuditFileTaxPT1.InvoiceNoDocument.InvoiceNo xgetInvoiceNo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.InvoiceNoDocument.InvoiceNo target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.InvoiceNoDocument.InvoiceNo)get_store().find_element_user(INVOICENO$0, 0);
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
                public void xsetInvoiceNo(x0401.oecdStandardAuditFileTaxPT1.InvoiceNoDocument.InvoiceNo invoiceNo)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.InvoiceNoDocument.InvoiceNo target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.InvoiceNoDocument.InvoiceNo)get_store().find_element_user(INVOICENO$0, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.InvoiceNoDocument.InvoiceNo)get_store().add_element_user(INVOICENO$0);
                      }
                      target.set(invoiceNo);
                    }
                }
                
                /**
                 * Gets the "ATCUD" element
                 */
                public java.lang.String getATCUD()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATCUD$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "ATCUD" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car xgetATCUD()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car)get_store().find_element_user(ATCUD$2, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "ATCUD" element
                 */
                public void setATCUD(java.lang.String atcud)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATCUD$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATCUD$2);
                      }
                      target.setStringValue(atcud);
                    }
                }
                
                /**
                 * Sets (as xml) the "ATCUD" element
                 */
                public void xsetATCUD(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car atcud)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car)get_store().find_element_user(ATCUD$2, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car)get_store().add_element_user(ATCUD$2);
                      }
                      target.set(atcud);
                    }
                }
                
                /**
                 * Gets the "DocumentStatus" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentStatus getDocumentStatus()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentStatus target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentStatus)get_store().find_element_user(DOCUMENTSTATUS$4, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "DocumentStatus" element
                 */
                public void setDocumentStatus(x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentStatus documentStatus)
                {
                    generatedSetterHelperImpl(documentStatus, DOCUMENTSTATUS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                }
                
                /**
                 * Appends and returns a new empty "DocumentStatus" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentStatus addNewDocumentStatus()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentStatus target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentStatus)get_store().add_element_user(DOCUMENTSTATUS$4);
                      return target;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASH$6, 0);
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
                public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax172Car xgetHash()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax172Car target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax172Car)get_store().find_element_user(HASH$6, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASH$6, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASH$6);
                      }
                      target.setStringValue(hash);
                    }
                }
                
                /**
                 * Sets (as xml) the "Hash" element
                 */
                public void xsetHash(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax172Car hash)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax172Car target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax172Car)get_store().find_element_user(HASH$6, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax172Car)get_store().add_element_user(HASH$6);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASHCONTROL$8, 0);
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
                public x0401.oecdStandardAuditFileTaxPT1.SAFPTHashControl xgetHashControl()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTHashControl target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTHashControl)get_store().find_element_user(HASHCONTROL$8, 0);
                      return target;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASHCONTROL$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASHCONTROL$8);
                      }
                      target.setStringValue(hashControl);
                    }
                }
                
                /**
                 * Sets (as xml) the "HashControl" element
                 */
                public void xsetHashControl(x0401.oecdStandardAuditFileTaxPT1.SAFPTHashControl hashControl)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTHashControl target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTHashControl)get_store().find_element_user(HASHCONTROL$8, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTHashControl)get_store().add_element_user(HASHCONTROL$8);
                      }
                      target.set(hashControl);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIOD$10, 0);
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
                public x0401.oecdStandardAuditFileTaxPT1.PeriodDocument.Period xgetPeriod()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.PeriodDocument.Period target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.PeriodDocument.Period)get_store().find_element_user(PERIOD$10, 0);
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
                      return get_store().count_elements(PERIOD$10) != 0;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIOD$10, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERIOD$10);
                      }
                      target.setIntValue(period);
                    }
                }
                
                /**
                 * Sets (as xml) the "Period" element
                 */
                public void xsetPeriod(x0401.oecdStandardAuditFileTaxPT1.PeriodDocument.Period period)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.PeriodDocument.Period target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.PeriodDocument.Period)get_store().find_element_user(PERIOD$10, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.PeriodDocument.Period)get_store().add_element_user(PERIOD$10);
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
                      get_store().remove_element(PERIOD$10, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOICEDATE$12, 0);
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
                public x0401.oecdStandardAuditFileTaxPT1.SAFdateType xgetInvoiceDate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(INVOICEDATE$12, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOICEDATE$12, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INVOICEDATE$12);
                      }
                      target.setCalendarValue(invoiceDate);
                    }
                }
                
                /**
                 * Sets (as xml) the "InvoiceDate" element
                 */
                public void xsetInvoiceDate(x0401.oecdStandardAuditFileTaxPT1.SAFdateType invoiceDate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(INVOICEDATE$12, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().add_element_user(INVOICEDATE$12);
                      }
                      target.set(invoiceDate);
                    }
                }
                
                /**
                 * Gets the "InvoiceType" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType.Enum getInvoiceType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOICETYPE$14, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return (x0401.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "InvoiceType" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType xgetInvoiceType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType)get_store().find_element_user(INVOICETYPE$14, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "InvoiceType" element
                 */
                public void setInvoiceType(x0401.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType.Enum invoiceType)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOICETYPE$14, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INVOICETYPE$14);
                      }
                      target.setEnumValue(invoiceType);
                    }
                }
                
                /**
                 * Sets (as xml) the "InvoiceType" element
                 */
                public void xsetInvoiceType(x0401.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType invoiceType)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType)get_store().find_element_user(INVOICETYPE$14, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType)get_store().add_element_user(INVOICETYPE$14);
                      }
                      target.set(invoiceType);
                    }
                }
                
                /**
                 * Gets the "SpecialRegimes" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SpecialRegimes getSpecialRegimes()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SpecialRegimes target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SpecialRegimes)get_store().find_element_user(SPECIALREGIMES$16, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "SpecialRegimes" element
                 */
                public void setSpecialRegimes(x0401.oecdStandardAuditFileTaxPT1.SpecialRegimes specialRegimes)
                {
                    generatedSetterHelperImpl(specialRegimes, SPECIALREGIMES$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                }
                
                /**
                 * Appends and returns a new empty "SpecialRegimes" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SpecialRegimes addNewSpecialRegimes()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SpecialRegimes target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SpecialRegimes)get_store().add_element_user(SPECIALREGIMES$16);
                      return target;
                    }
                }
                
                /**
                 * Gets the "SourceID" element
                 */
                public java.lang.String getSourceID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEID$18, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "SourceID" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetSourceID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(SOURCEID$18, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "SourceID" element
                 */
                public void setSourceID(java.lang.String sourceID)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEID$18, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEID$18);
                      }
                      target.setStringValue(sourceID);
                    }
                }
                
                /**
                 * Sets (as xml) the "SourceID" element
                 */
                public void xsetSourceID(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car sourceID)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(SOURCEID$18, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().add_element_user(SOURCEID$18);
                      }
                      target.set(sourceID);
                    }
                }
                
                /**
                 * Gets the "EACCode" element
                 */
                public java.lang.String getEACCode()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EACCODE$20, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "EACCode" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.EACCodeDocument.EACCode xgetEACCode()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.EACCodeDocument.EACCode target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.EACCodeDocument.EACCode)get_store().find_element_user(EACCODE$20, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "EACCode" element
                 */
                public boolean isSetEACCode()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(EACCODE$20) != 0;
                    }
                }
                
                /**
                 * Sets the "EACCode" element
                 */
                public void setEACCode(java.lang.String eacCode)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EACCODE$20, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EACCODE$20);
                      }
                      target.setStringValue(eacCode);
                    }
                }
                
                /**
                 * Sets (as xml) the "EACCode" element
                 */
                public void xsetEACCode(x0401.oecdStandardAuditFileTaxPT1.EACCodeDocument.EACCode eacCode)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.EACCodeDocument.EACCode target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.EACCodeDocument.EACCode)get_store().find_element_user(EACCODE$20, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.EACCodeDocument.EACCode)get_store().add_element_user(EACCODE$20);
                      }
                      target.set(eacCode);
                    }
                }
                
                /**
                 * Unsets the "EACCode" element
                 */
                public void unsetEACCode()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(EACCODE$20, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSTEMENTRYDATE$22, 0);
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
                public x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType xgetSystemEntryDate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(SYSTEMENTRYDATE$22, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSTEMENTRYDATE$22, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SYSTEMENTRYDATE$22);
                      }
                      target.setCalendarValue(systemEntryDate);
                    }
                }
                
                /**
                 * Sets (as xml) the "SystemEntryDate" element
                 */
                public void xsetSystemEntryDate(x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType systemEntryDate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(SYSTEMENTRYDATE$22, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().add_element_user(SYSTEMENTRYDATE$22);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONID$24, 0);
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
                public x0401.oecdStandardAuditFileTaxPT1.SAFPTTransactionID xgetTransactionID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTTransactionID target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTTransactionID)get_store().find_element_user(TRANSACTIONID$24, 0);
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
                      return get_store().count_elements(TRANSACTIONID$24) != 0;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONID$24, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSACTIONID$24);
                      }
                      target.setStringValue(transactionID);
                    }
                }
                
                /**
                 * Sets (as xml) the "TransactionID" element
                 */
                public void xsetTransactionID(x0401.oecdStandardAuditFileTaxPT1.SAFPTTransactionID transactionID)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTTransactionID target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTTransactionID)get_store().find_element_user(TRANSACTIONID$24, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTTransactionID)get_store().add_element_user(TRANSACTIONID$24);
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
                      get_store().remove_element(TRANSACTIONID$24, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERID$26, 0);
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
                public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetCustomerID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(CUSTOMERID$26, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERID$26, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTOMERID$26);
                      }
                      target.setStringValue(customerID);
                    }
                }
                
                /**
                 * Sets (as xml) the "CustomerID" element
                 */
                public void xsetCustomerID(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car customerID)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(CUSTOMERID$26, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().add_element_user(CUSTOMERID$26);
                      }
                      target.set(customerID);
                    }
                }
                
                /**
                 * Gets the "ShipTo" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.ShippingPointStructure getShipTo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.ShippingPointStructure target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.ShippingPointStructure)get_store().find_element_user(SHIPTO$28, 0);
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
                      return get_store().count_elements(SHIPTO$28) != 0;
                    }
                }
                
                /**
                 * Sets the "ShipTo" element
                 */
                public void setShipTo(x0401.oecdStandardAuditFileTaxPT1.ShippingPointStructure shipTo)
                {
                    generatedSetterHelperImpl(shipTo, SHIPTO$28, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                }
                
                /**
                 * Appends and returns a new empty "ShipTo" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.ShippingPointStructure addNewShipTo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.ShippingPointStructure target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.ShippingPointStructure)get_store().add_element_user(SHIPTO$28);
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
                      get_store().remove_element(SHIPTO$28, 0);
                    }
                }
                
                /**
                 * Gets the "ShipFrom" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.ShippingPointStructure getShipFrom()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.ShippingPointStructure target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.ShippingPointStructure)get_store().find_element_user(SHIPFROM$30, 0);
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
                      return get_store().count_elements(SHIPFROM$30) != 0;
                    }
                }
                
                /**
                 * Sets the "ShipFrom" element
                 */
                public void setShipFrom(x0401.oecdStandardAuditFileTaxPT1.ShippingPointStructure shipFrom)
                {
                    generatedSetterHelperImpl(shipFrom, SHIPFROM$30, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                }
                
                /**
                 * Appends and returns a new empty "ShipFrom" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.ShippingPointStructure addNewShipFrom()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.ShippingPointStructure target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.ShippingPointStructure)get_store().add_element_user(SHIPFROM$30);
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
                      get_store().remove_element(SHIPFROM$30, 0);
                    }
                }
                
                /**
                 * Gets the "MovementEndTime" element
                 */
                public java.util.Calendar getMovementEndTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOVEMENTENDTIME$32, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getCalendarValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "MovementEndTime" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType xgetMovementEndTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(MOVEMENTENDTIME$32, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "MovementEndTime" element
                 */
                public boolean isSetMovementEndTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(MOVEMENTENDTIME$32) != 0;
                    }
                }
                
                /**
                 * Sets the "MovementEndTime" element
                 */
                public void setMovementEndTime(java.util.Calendar movementEndTime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOVEMENTENDTIME$32, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOVEMENTENDTIME$32);
                      }
                      target.setCalendarValue(movementEndTime);
                    }
                }
                
                /**
                 * Sets (as xml) the "MovementEndTime" element
                 */
                public void xsetMovementEndTime(x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType movementEndTime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(MOVEMENTENDTIME$32, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().add_element_user(MOVEMENTENDTIME$32);
                      }
                      target.set(movementEndTime);
                    }
                }
                
                /**
                 * Unsets the "MovementEndTime" element
                 */
                public void unsetMovementEndTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(MOVEMENTENDTIME$32, 0);
                    }
                }
                
                /**
                 * Gets the "MovementStartTime" element
                 */
                public java.util.Calendar getMovementStartTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOVEMENTSTARTTIME$34, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getCalendarValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "MovementStartTime" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType xgetMovementStartTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(MOVEMENTSTARTTIME$34, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "MovementStartTime" element
                 */
                public boolean isSetMovementStartTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(MOVEMENTSTARTTIME$34) != 0;
                    }
                }
                
                /**
                 * Sets the "MovementStartTime" element
                 */
                public void setMovementStartTime(java.util.Calendar movementStartTime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOVEMENTSTARTTIME$34, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOVEMENTSTARTTIME$34);
                      }
                      target.setCalendarValue(movementStartTime);
                    }
                }
                
                /**
                 * Sets (as xml) the "MovementStartTime" element
                 */
                public void xsetMovementStartTime(x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType movementStartTime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(MOVEMENTSTARTTIME$34, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().add_element_user(MOVEMENTSTARTTIME$34);
                      }
                      target.set(movementStartTime);
                    }
                }
                
                /**
                 * Unsets the "MovementStartTime" element
                 */
                public void unsetMovementStartTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(MOVEMENTSTARTTIME$34, 0);
                    }
                }
                
                /**
                 * Gets a List of "Line" elements
                 */
                public java.util.List<x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line> getLineList()
                {
                    final class LineList extends java.util.AbstractList<x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line>
                    {
                      @Override
                      public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line get(int i)
                          { return InvoiceImpl.this.getLineArray(i); }
                      
                      @Override
                      public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line set(int i, x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line o)
                      {
                        x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line old = InvoiceImpl.this.getLineArray(i);
                        InvoiceImpl.this.setLineArray(i, o);
                        return old;
                      }
                      
                      @Override
                      public void add(int i, x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line o)
                          { InvoiceImpl.this.insertNewLine(i).set(o); }
                      
                      @Override
                      public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line remove(int i)
                      {
                        x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line old = InvoiceImpl.this.getLineArray(i);
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
                public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line[] getLineArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List<x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line> targetList = new java.util.ArrayList<x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line>();
                      get_store().find_all_element_users(LINE$36, targetList);
                      x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line[] result = new x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "Line" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line getLineArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line)get_store().find_element_user(LINE$36, i);
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
                      return get_store().count_elements(LINE$36);
                    }
                }
                
                /**
                 * Sets array of all "Line" element  WARNING: This method is not atomicaly synchronized.
                 */
                public void setLineArray(x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line[] lineArray)
                {
                    check_orphaned();
                    arraySetterHelper(lineArray, LINE$36);
                }
                
                /**
                 * Sets ith "Line" element
                 */
                public void setLineArray(int i, x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line line)
                {
                    generatedSetterHelperImpl(line, LINE$36, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "Line" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line insertNewLine(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line)get_store().insert_element_user(LINE$36, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "Line" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line addNewLine()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line)get_store().add_element_user(LINE$36);
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
                      get_store().remove_element(LINE$36, i);
                    }
                }
                
                /**
                 * Gets the "DocumentTotals" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentTotals getDocumentTotals()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentTotals target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentTotals)get_store().find_element_user(DOCUMENTTOTALS$38, 0);
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
                public void setDocumentTotals(x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentTotals documentTotals)
                {
                    generatedSetterHelperImpl(documentTotals, DOCUMENTTOTALS$38, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                }
                
                /**
                 * Appends and returns a new empty "DocumentTotals" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentTotals addNewDocumentTotals()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentTotals target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentTotals)get_store().add_element_user(DOCUMENTTOTALS$38);
                      return target;
                    }
                }
                
                /**
                 * Gets a List of "WithholdingTax" elements
                 */
                public java.util.List<x0401.oecdStandardAuditFileTaxPT1.WithholdingTax> getWithholdingTaxList()
                {
                    final class WithholdingTaxList extends java.util.AbstractList<x0401.oecdStandardAuditFileTaxPT1.WithholdingTax>
                    {
                      @Override
                      public x0401.oecdStandardAuditFileTaxPT1.WithholdingTax get(int i)
                          { return InvoiceImpl.this.getWithholdingTaxArray(i); }
                      
                      @Override
                      public x0401.oecdStandardAuditFileTaxPT1.WithholdingTax set(int i, x0401.oecdStandardAuditFileTaxPT1.WithholdingTax o)
                      {
                        x0401.oecdStandardAuditFileTaxPT1.WithholdingTax old = InvoiceImpl.this.getWithholdingTaxArray(i);
                        InvoiceImpl.this.setWithholdingTaxArray(i, o);
                        return old;
                      }
                      
                      @Override
                      public void add(int i, x0401.oecdStandardAuditFileTaxPT1.WithholdingTax o)
                          { InvoiceImpl.this.insertNewWithholdingTax(i).set(o); }
                      
                      @Override
                      public x0401.oecdStandardAuditFileTaxPT1.WithholdingTax remove(int i)
                      {
                        x0401.oecdStandardAuditFileTaxPT1.WithholdingTax old = InvoiceImpl.this.getWithholdingTaxArray(i);
                        InvoiceImpl.this.removeWithholdingTax(i);
                        return old;
                      }
                      
                      @Override
                      public int size()
                          { return InvoiceImpl.this.sizeOfWithholdingTaxArray(); }
                      
                    }
                    
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return new WithholdingTaxList();
                    }
                }
                
                /**
                 * Gets array of all "WithholdingTax" elements
                 * @deprecated
                 */
                @Deprecated
                public x0401.oecdStandardAuditFileTaxPT1.WithholdingTax[] getWithholdingTaxArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List<x0401.oecdStandardAuditFileTaxPT1.WithholdingTax> targetList = new java.util.ArrayList<x0401.oecdStandardAuditFileTaxPT1.WithholdingTax>();
                      get_store().find_all_element_users(WITHHOLDINGTAX$40, targetList);
                      x0401.oecdStandardAuditFileTaxPT1.WithholdingTax[] result = new x0401.oecdStandardAuditFileTaxPT1.WithholdingTax[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "WithholdingTax" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.WithholdingTax getWithholdingTaxArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.WithholdingTax target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.WithholdingTax)get_store().find_element_user(WITHHOLDINGTAX$40, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "WithholdingTax" element
                 */
                public int sizeOfWithholdingTaxArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(WITHHOLDINGTAX$40);
                    }
                }
                
                /**
                 * Sets array of all "WithholdingTax" element  WARNING: This method is not atomicaly synchronized.
                 */
                public void setWithholdingTaxArray(x0401.oecdStandardAuditFileTaxPT1.WithholdingTax[] withholdingTaxArray)
                {
                    check_orphaned();
                    arraySetterHelper(withholdingTaxArray, WITHHOLDINGTAX$40);
                }
                
                /**
                 * Sets ith "WithholdingTax" element
                 */
                public void setWithholdingTaxArray(int i, x0401.oecdStandardAuditFileTaxPT1.WithholdingTax withholdingTax)
                {
                    generatedSetterHelperImpl(withholdingTax, WITHHOLDINGTAX$40, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "WithholdingTax" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.WithholdingTax insertNewWithholdingTax(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.WithholdingTax target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.WithholdingTax)get_store().insert_element_user(WITHHOLDINGTAX$40, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "WithholdingTax" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.WithholdingTax addNewWithholdingTax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.WithholdingTax target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.WithholdingTax)get_store().add_element_user(WITHHOLDINGTAX$40);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "WithholdingTax" element
                 */
                public void removeWithholdingTax(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(WITHHOLDINGTAX$40, i);
                    }
                }
                /**
                 * An XML DocumentStatus(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
                 *
                 * This is a complex type.
                 */
                public static class DocumentStatusImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentStatus
                {
                    private static final long serialVersionUID = 1L;
                    
                    public DocumentStatusImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName INVOICESTATUS$0 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "InvoiceStatus");
                    private static final javax.xml.namespace.QName INVOICESTATUSDATE$2 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "InvoiceStatusDate");
                    private static final javax.xml.namespace.QName REASON$4 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Reason");
                    private static final javax.xml.namespace.QName SOURCEID$6 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "SourceID");
                    private static final javax.xml.namespace.QName SOURCEBILLING$8 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "SourceBilling");
                    
                    
                    /**
                     * Gets the "InvoiceStatus" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument.InvoiceStatus.Enum getInvoiceStatus()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOICESTATUS$0, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return (x0401.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument.InvoiceStatus.Enum)target.getEnumValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "InvoiceStatus" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument.InvoiceStatus xgetInvoiceStatus()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument.InvoiceStatus target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument.InvoiceStatus)get_store().find_element_user(INVOICESTATUS$0, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "InvoiceStatus" element
                     */
                    public void setInvoiceStatus(x0401.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument.InvoiceStatus.Enum invoiceStatus)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOICESTATUS$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INVOICESTATUS$0);
                        }
                        target.setEnumValue(invoiceStatus);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "InvoiceStatus" element
                     */
                    public void xsetInvoiceStatus(x0401.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument.InvoiceStatus invoiceStatus)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument.InvoiceStatus target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument.InvoiceStatus)get_store().find_element_user(INVOICESTATUS$0, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument.InvoiceStatus)get_store().add_element_user(INVOICESTATUS$0);
                        }
                        target.set(invoiceStatus);
                      }
                    }
                    
                    /**
                     * Gets the "InvoiceStatusDate" element
                     */
                    public java.util.Calendar getInvoiceStatusDate()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOICESTATUSDATE$2, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getCalendarValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "InvoiceStatusDate" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType xgetInvoiceStatusDate()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(INVOICESTATUSDATE$2, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "InvoiceStatusDate" element
                     */
                    public void setInvoiceStatusDate(java.util.Calendar invoiceStatusDate)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOICESTATUSDATE$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INVOICESTATUSDATE$2);
                        }
                        target.setCalendarValue(invoiceStatusDate);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "InvoiceStatusDate" element
                     */
                    public void xsetInvoiceStatusDate(x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType invoiceStatusDate)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(INVOICESTATUSDATE$2, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().add_element_user(INVOICESTATUSDATE$2);
                        }
                        target.set(invoiceStatusDate);
                      }
                    }
                    
                    /**
                     * Gets the "Reason" element
                     */
                    public java.lang.String getReason()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASON$4, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "Reason" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car xgetReason()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().find_element_user(REASON$4, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "Reason" element
                     */
                    public boolean isSetReason()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(REASON$4) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "Reason" element
                     */
                    public void setReason(java.lang.String reason)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASON$4, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REASON$4);
                        }
                        target.setStringValue(reason);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "Reason" element
                     */
                    public void xsetReason(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car reason)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().find_element_user(REASON$4, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().add_element_user(REASON$4);
                        }
                        target.set(reason);
                      }
                    }
                    
                    /**
                     * Unsets the "Reason" element
                     */
                    public void unsetReason()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(REASON$4, 0);
                      }
                    }
                    
                    /**
                     * Gets the "SourceID" element
                     */
                    public java.lang.String getSourceID()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEID$6, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "SourceID" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetSourceID()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(SOURCEID$6, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "SourceID" element
                     */
                    public void setSourceID(java.lang.String sourceID)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEID$6, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEID$6);
                        }
                        target.setStringValue(sourceID);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "SourceID" element
                     */
                    public void xsetSourceID(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car sourceID)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(SOURCEID$6, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().add_element_user(SOURCEID$6);
                        }
                        target.set(sourceID);
                      }
                    }
                    
                    /**
                     * Gets the "SourceBilling" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling.Enum getSourceBilling()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEBILLING$8, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return (x0401.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling.Enum)target.getEnumValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "SourceBilling" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling xgetSourceBilling()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling)get_store().find_element_user(SOURCEBILLING$8, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "SourceBilling" element
                     */
                    public void setSourceBilling(x0401.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling.Enum sourceBilling)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEBILLING$8, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEBILLING$8);
                        }
                        target.setEnumValue(sourceBilling);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "SourceBilling" element
                     */
                    public void xsetSourceBilling(x0401.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling sourceBilling)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling)get_store().find_element_user(SOURCEBILLING$8, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling)get_store().add_element_user(SOURCEBILLING$8);
                        }
                        target.set(sourceBilling);
                      }
                    }
                }
                /**
                 * An XML Line(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
                 *
                 * This is a complex type.
                 */
                public static class LineImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.Line
                {
                    private static final long serialVersionUID = 1L;
                    
                    public LineImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName LINENUMBER$0 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "LineNumber");
                    private static final javax.xml.namespace.QName ORDERREFERENCES$2 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "OrderReferences");
                    private static final javax.xml.namespace.QName PRODUCTCODE$4 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "ProductCode");
                    private static final javax.xml.namespace.QName PRODUCTDESCRIPTION$6 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "ProductDescription");
                    private static final javax.xml.namespace.QName QUANTITY$8 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Quantity");
                    private static final javax.xml.namespace.QName UNITOFMEASURE$10 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "UnitOfMeasure");
                    private static final javax.xml.namespace.QName UNITPRICE$12 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "UnitPrice");
                    private static final javax.xml.namespace.QName TAXBASE$14 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TaxBase");
                    private static final javax.xml.namespace.QName TAXPOINTDATE$16 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TaxPointDate");
                    private static final javax.xml.namespace.QName REFERENCES$18 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "References");
                    private static final javax.xml.namespace.QName DESCRIPTION$20 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Description");
                    private static final javax.xml.namespace.QName PRODUCTSERIALNUMBER$22 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "ProductSerialNumber");
                    private static final javax.xml.namespace.QName DEBITAMOUNT$24 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "DebitAmount");
                    private static final javax.xml.namespace.QName CREDITAMOUNT$26 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "CreditAmount");
                    private static final javax.xml.namespace.QName TAX$28 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Tax");
                    private static final javax.xml.namespace.QName TAXEXEMPTIONREASON$30 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TaxExemptionReason");
                    private static final javax.xml.namespace.QName TAXEXEMPTIONCODE$32 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TaxExemptionCode");
                    private static final javax.xml.namespace.QName SETTLEMENTAMOUNT$34 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "SettlementAmount");
                    private static final javax.xml.namespace.QName CUSTOMSINFORMATION$36 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "CustomsInformation");
                    
                    
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
                    public org.apache.xmlbeans.XmlNonNegativeInteger xgetLineNumber()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                        target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(LINENUMBER$0, 0);
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
                    public void xsetLineNumber(org.apache.xmlbeans.XmlNonNegativeInteger lineNumber)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                        target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(LINENUMBER$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(LINENUMBER$0);
                        }
                        target.set(lineNumber);
                      }
                    }
                    
                    /**
                     * Gets a List of "OrderReferences" elements
                     */
                    public java.util.List<x0401.oecdStandardAuditFileTaxPT1.OrderReferences> getOrderReferencesList()
                    {
                      final class OrderReferencesList extends java.util.AbstractList<x0401.oecdStandardAuditFileTaxPT1.OrderReferences>
                      {
                        @Override
                        public x0401.oecdStandardAuditFileTaxPT1.OrderReferences get(int i)
                            { return LineImpl.this.getOrderReferencesArray(i); }
                        
                        @Override
                        public x0401.oecdStandardAuditFileTaxPT1.OrderReferences set(int i, x0401.oecdStandardAuditFileTaxPT1.OrderReferences o)
                        {
                          x0401.oecdStandardAuditFileTaxPT1.OrderReferences old = LineImpl.this.getOrderReferencesArray(i);
                          LineImpl.this.setOrderReferencesArray(i, o);
                          return old;
                        }
                        
                        @Override
                        public void add(int i, x0401.oecdStandardAuditFileTaxPT1.OrderReferences o)
                            { LineImpl.this.insertNewOrderReferences(i).set(o); }
                        
                        @Override
                        public x0401.oecdStandardAuditFileTaxPT1.OrderReferences remove(int i)
                        {
                          x0401.oecdStandardAuditFileTaxPT1.OrderReferences old = LineImpl.this.getOrderReferencesArray(i);
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
                    public x0401.oecdStandardAuditFileTaxPT1.OrderReferences[] getOrderReferencesArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        java.util.List<x0401.oecdStandardAuditFileTaxPT1.OrderReferences> targetList = new java.util.ArrayList<x0401.oecdStandardAuditFileTaxPT1.OrderReferences>();
                        get_store().find_all_element_users(ORDERREFERENCES$2, targetList);
                        x0401.oecdStandardAuditFileTaxPT1.OrderReferences[] result = new x0401.oecdStandardAuditFileTaxPT1.OrderReferences[targetList.size()];
                        targetList.toArray(result);
                        return result;
                      }
                    }
                    
                    /**
                     * Gets ith "OrderReferences" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.OrderReferences getOrderReferencesArray(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.OrderReferences target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.OrderReferences)get_store().find_element_user(ORDERREFERENCES$2, i);
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
                    public void setOrderReferencesArray(x0401.oecdStandardAuditFileTaxPT1.OrderReferences[] orderReferencesArray)
                    {
                      check_orphaned();
                      arraySetterHelper(orderReferencesArray, ORDERREFERENCES$2);
                    }
                    
                    /**
                     * Sets ith "OrderReferences" element
                     */
                    public void setOrderReferencesArray(int i, x0401.oecdStandardAuditFileTaxPT1.OrderReferences orderReferences)
                    {
                      generatedSetterHelperImpl(orderReferences, ORDERREFERENCES$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
                    }
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "OrderReferences" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.OrderReferences insertNewOrderReferences(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.OrderReferences target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.OrderReferences)get_store().insert_element_user(ORDERREFERENCES$2, i);
                        return target;
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "OrderReferences" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.OrderReferences addNewOrderReferences()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.OrderReferences target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.OrderReferences)get_store().add_element_user(ORDERREFERENCES$2);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car xgetProductCode()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(PRODUCTCODE$4, 0);
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
                    public void xsetProductCode(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car productCode)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(PRODUCTCODE$4, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().add_element_user(PRODUCTCODE$4);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFPTProductDescription xgetProductDescription()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTProductDescription target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTProductDescription)get_store().find_element_user(PRODUCTDESCRIPTION$6, 0);
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
                    public void xsetProductDescription(x0401.oecdStandardAuditFileTaxPT1.SAFPTProductDescription productDescription)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTProductDescription target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTProductDescription)get_store().find_element_user(PRODUCTDESCRIPTION$6, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTProductDescription)get_store().add_element_user(PRODUCTDESCRIPTION$6);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType xgetQuantity()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType)get_store().find_element_user(QUANTITY$8, 0);
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
                    public void xsetQuantity(x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType quantity)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType)get_store().find_element_user(QUANTITY$8, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType)get_store().add_element_user(QUANTITY$8);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car xgetUnitOfMeasure()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().find_element_user(UNITOFMEASURE$10, 0);
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
                    public void xsetUnitOfMeasure(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car unitOfMeasure)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().find_element_user(UNITOFMEASURE$10, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().add_element_user(UNITOFMEASURE$10);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetUnitPrice()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(UNITPRICE$12, 0);
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
                    public void xsetUnitPrice(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType unitPrice)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(UNITPRICE$12, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(UNITPRICE$12);
                        }
                        target.set(unitPrice);
                      }
                    }
                    
                    /**
                     * Gets the "TaxBase" element
                     */
                    public java.math.BigDecimal getTaxBase()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXBASE$14, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getBigDecimalValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TaxBase" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetTaxBase()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TAXBASE$14, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TaxBase" element
                     */
                    public boolean isSetTaxBase()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TAXBASE$14) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TaxBase" element
                     */
                    public void setTaxBase(java.math.BigDecimal taxBase)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXBASE$14, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXBASE$14);
                        }
                        target.setBigDecimalValue(taxBase);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TaxBase" element
                     */
                    public void xsetTaxBase(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType taxBase)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TAXBASE$14, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(TAXBASE$14);
                        }
                        target.set(taxBase);
                      }
                    }
                    
                    /**
                     * Unsets the "TaxBase" element
                     */
                    public void unsetTaxBase()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TAXBASE$14, 0);
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXPOINTDATE$16, 0);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFdateType xgetTaxPointDate()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(TAXPOINTDATE$16, 0);
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXPOINTDATE$16, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXPOINTDATE$16);
                        }
                        target.setCalendarValue(taxPointDate);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TaxPointDate" element
                     */
                    public void xsetTaxPointDate(x0401.oecdStandardAuditFileTaxPT1.SAFdateType taxPointDate)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(TAXPOINTDATE$16, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().add_element_user(TAXPOINTDATE$16);
                        }
                        target.set(taxPointDate);
                      }
                    }
                    
                    /**
                     * Gets a List of "References" elements
                     */
                    public java.util.List<x0401.oecdStandardAuditFileTaxPT1.References> getReferencesList()
                    {
                      final class ReferencesList extends java.util.AbstractList<x0401.oecdStandardAuditFileTaxPT1.References>
                      {
                        @Override
                        public x0401.oecdStandardAuditFileTaxPT1.References get(int i)
                            { return LineImpl.this.getReferencesArray(i); }
                        
                        @Override
                        public x0401.oecdStandardAuditFileTaxPT1.References set(int i, x0401.oecdStandardAuditFileTaxPT1.References o)
                        {
                          x0401.oecdStandardAuditFileTaxPT1.References old = LineImpl.this.getReferencesArray(i);
                          LineImpl.this.setReferencesArray(i, o);
                          return old;
                        }
                        
                        @Override
                        public void add(int i, x0401.oecdStandardAuditFileTaxPT1.References o)
                            { LineImpl.this.insertNewReferences(i).set(o); }
                        
                        @Override
                        public x0401.oecdStandardAuditFileTaxPT1.References remove(int i)
                        {
                          x0401.oecdStandardAuditFileTaxPT1.References old = LineImpl.this.getReferencesArray(i);
                          LineImpl.this.removeReferences(i);
                          return old;
                        }
                        
                        @Override
                        public int size()
                            { return LineImpl.this.sizeOfReferencesArray(); }
                        
                      }
                      
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return new ReferencesList();
                      }
                    }
                    
                    /**
                     * Gets array of all "References" elements
                     * @deprecated
                     */
                    @Deprecated
                    public x0401.oecdStandardAuditFileTaxPT1.References[] getReferencesArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        java.util.List<x0401.oecdStandardAuditFileTaxPT1.References> targetList = new java.util.ArrayList<x0401.oecdStandardAuditFileTaxPT1.References>();
                        get_store().find_all_element_users(REFERENCES$18, targetList);
                        x0401.oecdStandardAuditFileTaxPT1.References[] result = new x0401.oecdStandardAuditFileTaxPT1.References[targetList.size()];
                        targetList.toArray(result);
                        return result;
                      }
                    }
                    
                    /**
                     * Gets ith "References" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.References getReferencesArray(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.References target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.References)get_store().find_element_user(REFERENCES$18, i);
                        if (target == null)
                        {
                          throw new IndexOutOfBoundsException();
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Returns number of "References" element
                     */
                    public int sizeOfReferencesArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(REFERENCES$18);
                      }
                    }
                    
                    /**
                     * Sets array of all "References" element  WARNING: This method is not atomicaly synchronized.
                     */
                    public void setReferencesArray(x0401.oecdStandardAuditFileTaxPT1.References[] referencesArray)
                    {
                      check_orphaned();
                      arraySetterHelper(referencesArray, REFERENCES$18);
                    }
                    
                    /**
                     * Sets ith "References" element
                     */
                    public void setReferencesArray(int i, x0401.oecdStandardAuditFileTaxPT1.References references)
                    {
                      generatedSetterHelperImpl(references, REFERENCES$18, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
                    }
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "References" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.References insertNewReferences(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.References target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.References)get_store().insert_element_user(REFERENCES$18, i);
                        return target;
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "References" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.References addNewReferences()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.References target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.References)get_store().add_element_user(REFERENCES$18);
                        return target;
                      }
                    }
                    
                    /**
                     * Removes the ith "References" element
                     */
                    public void removeReferences(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(REFERENCES$18, i);
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$20, 0);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car xgetDescription()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car)get_store().find_element_user(DESCRIPTION$20, 0);
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$20, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$20);
                        }
                        target.setStringValue(description);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "Description" element
                     */
                    public void xsetDescription(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car description)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car)get_store().find_element_user(DESCRIPTION$20, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car)get_store().add_element_user(DESCRIPTION$20);
                        }
                        target.set(description);
                      }
                    }
                    
                    /**
                     * Gets the "ProductSerialNumber" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.ProductSerialNumber getProductSerialNumber()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.ProductSerialNumber target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.ProductSerialNumber)get_store().find_element_user(PRODUCTSERIALNUMBER$22, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "ProductSerialNumber" element
                     */
                    public boolean isSetProductSerialNumber()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(PRODUCTSERIALNUMBER$22) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "ProductSerialNumber" element
                     */
                    public void setProductSerialNumber(x0401.oecdStandardAuditFileTaxPT1.ProductSerialNumber productSerialNumber)
                    {
                      generatedSetterHelperImpl(productSerialNumber, PRODUCTSERIALNUMBER$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "ProductSerialNumber" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.ProductSerialNumber addNewProductSerialNumber()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.ProductSerialNumber target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.ProductSerialNumber)get_store().add_element_user(PRODUCTSERIALNUMBER$22);
                        return target;
                      }
                    }
                    
                    /**
                     * Unsets the "ProductSerialNumber" element
                     */
                    public void unsetProductSerialNumber()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(PRODUCTSERIALNUMBER$22, 0);
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEBITAMOUNT$24, 0);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetDebitAmount()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(DEBITAMOUNT$24, 0);
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
                        return get_store().count_elements(DEBITAMOUNT$24) != 0;
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEBITAMOUNT$24, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEBITAMOUNT$24);
                        }
                        target.setBigDecimalValue(debitAmount);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "DebitAmount" element
                     */
                    public void xsetDebitAmount(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType debitAmount)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(DEBITAMOUNT$24, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(DEBITAMOUNT$24);
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
                        get_store().remove_element(DEBITAMOUNT$24, 0);
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREDITAMOUNT$26, 0);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetCreditAmount()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(CREDITAMOUNT$26, 0);
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
                        return get_store().count_elements(CREDITAMOUNT$26) != 0;
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREDITAMOUNT$26, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREDITAMOUNT$26);
                        }
                        target.setBigDecimalValue(creditAmount);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "CreditAmount" element
                     */
                    public void xsetCreditAmount(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType creditAmount)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(CREDITAMOUNT$26, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(CREDITAMOUNT$26);
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
                        get_store().remove_element(CREDITAMOUNT$26, 0);
                      }
                    }
                    
                    /**
                     * Gets the "Tax" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.Tax getTax()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.Tax target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.Tax)get_store().find_element_user(TAX$28, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "Tax" element
                     */
                    public void setTax(x0401.oecdStandardAuditFileTaxPT1.Tax tax)
                    {
                      generatedSetterHelperImpl(tax, TAX$28, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "Tax" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.Tax addNewTax()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.Tax target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.Tax)get_store().add_element_user(TAX$28);
                        return target;
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXEXEMPTIONREASON$30, 0);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionReason xgetTaxExemptionReason()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionReason target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionReason)get_store().find_element_user(TAXEXEMPTIONREASON$30, 0);
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
                        return get_store().count_elements(TAXEXEMPTIONREASON$30) != 0;
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXEXEMPTIONREASON$30, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXEXEMPTIONREASON$30);
                        }
                        target.setStringValue(taxExemptionReason);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TaxExemptionReason" element
                     */
                    public void xsetTaxExemptionReason(x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionReason taxExemptionReason)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionReason target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionReason)get_store().find_element_user(TAXEXEMPTIONREASON$30, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionReason)get_store().add_element_user(TAXEXEMPTIONREASON$30);
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
                        get_store().remove_element(TAXEXEMPTIONREASON$30, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TaxExemptionCode" element
                     */
                    public java.lang.String getTaxExemptionCode()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXEXEMPTIONCODE$32, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TaxExemptionCode" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionCode xgetTaxExemptionCode()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionCode target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionCode)get_store().find_element_user(TAXEXEMPTIONCODE$32, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TaxExemptionCode" element
                     */
                    public boolean isSetTaxExemptionCode()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TAXEXEMPTIONCODE$32) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TaxExemptionCode" element
                     */
                    public void setTaxExemptionCode(java.lang.String taxExemptionCode)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXEXEMPTIONCODE$32, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXEXEMPTIONCODE$32);
                        }
                        target.setStringValue(taxExemptionCode);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TaxExemptionCode" element
                     */
                    public void xsetTaxExemptionCode(x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionCode taxExemptionCode)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionCode target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionCode)get_store().find_element_user(TAXEXEMPTIONCODE$32, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionCode)get_store().add_element_user(TAXEXEMPTIONCODE$32);
                        }
                        target.set(taxExemptionCode);
                      }
                    }
                    
                    /**
                     * Unsets the "TaxExemptionCode" element
                     */
                    public void unsetTaxExemptionCode()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TAXEXEMPTIONCODE$32, 0);
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SETTLEMENTAMOUNT$34, 0);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetSettlementAmount()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(SETTLEMENTAMOUNT$34, 0);
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
                        return get_store().count_elements(SETTLEMENTAMOUNT$34) != 0;
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SETTLEMENTAMOUNT$34, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SETTLEMENTAMOUNT$34);
                        }
                        target.setBigDecimalValue(settlementAmount);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "SettlementAmount" element
                     */
                    public void xsetSettlementAmount(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType settlementAmount)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(SETTLEMENTAMOUNT$34, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(SETTLEMENTAMOUNT$34);
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
                        get_store().remove_element(SETTLEMENTAMOUNT$34, 0);
                      }
                    }
                    
                    /**
                     * Gets the "CustomsInformation" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.CustomsInformation getCustomsInformation()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.CustomsInformation target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.CustomsInformation)get_store().find_element_user(CUSTOMSINFORMATION$36, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "CustomsInformation" element
                     */
                    public boolean isSetCustomsInformation()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(CUSTOMSINFORMATION$36) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "CustomsInformation" element
                     */
                    public void setCustomsInformation(x0401.oecdStandardAuditFileTaxPT1.CustomsInformation customsInformation)
                    {
                      generatedSetterHelperImpl(customsInformation, CUSTOMSINFORMATION$36, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "CustomsInformation" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.CustomsInformation addNewCustomsInformation()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.CustomsInformation target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.CustomsInformation)get_store().add_element_user(CUSTOMSINFORMATION$36);
                        return target;
                      }
                    }
                    
                    /**
                     * Unsets the "CustomsInformation" element
                     */
                    public void unsetCustomsInformation()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(CUSTOMSINFORMATION$36, 0);
                      }
                    }
                }
                /**
                 * An XML DocumentTotals(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
                 *
                 * This is a complex type.
                 */
                public static class DocumentTotalsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.SalesInvoices.Invoice.DocumentTotals
                {
                    private static final long serialVersionUID = 1L;
                    
                    public DocumentTotalsImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName TAXPAYABLE$0 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TaxPayable");
                    private static final javax.xml.namespace.QName NETTOTAL$2 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "NetTotal");
                    private static final javax.xml.namespace.QName GROSSTOTAL$4 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "GrossTotal");
                    private static final javax.xml.namespace.QName CURRENCY$6 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Currency");
                    private static final javax.xml.namespace.QName SETTLEMENT$8 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Settlement");
                    private static final javax.xml.namespace.QName PAYMENT$10 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Payment");
                    
                    
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetTaxPayable()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TAXPAYABLE$0, 0);
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
                    public void xsetTaxPayable(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType taxPayable)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TAXPAYABLE$0, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(TAXPAYABLE$0);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetNetTotal()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(NETTOTAL$2, 0);
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
                    public void xsetNetTotal(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType netTotal)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(NETTOTAL$2, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(NETTOTAL$2);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetGrossTotal()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(GROSSTOTAL$4, 0);
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
                    public void xsetGrossTotal(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType grossTotal)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(GROSSTOTAL$4, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(GROSSTOTAL$4);
                        }
                        target.set(grossTotal);
                      }
                    }
                    
                    /**
                     * Gets the "Currency" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.Currency getCurrency()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.Currency target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.Currency)get_store().find_element_user(CURRENCY$6, 0);
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
                    public void setCurrency(x0401.oecdStandardAuditFileTaxPT1.Currency currency)
                    {
                      generatedSetterHelperImpl(currency, CURRENCY$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "Currency" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.Currency addNewCurrency()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.Currency target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.Currency)get_store().add_element_user(CURRENCY$6);
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
                     * Gets a List of "Settlement" elements
                     */
                    public java.util.List<x0401.oecdStandardAuditFileTaxPT1.Settlement> getSettlementList()
                    {
                      final class SettlementList extends java.util.AbstractList<x0401.oecdStandardAuditFileTaxPT1.Settlement>
                      {
                        @Override
                        public x0401.oecdStandardAuditFileTaxPT1.Settlement get(int i)
                            { return DocumentTotalsImpl.this.getSettlementArray(i); }
                        
                        @Override
                        public x0401.oecdStandardAuditFileTaxPT1.Settlement set(int i, x0401.oecdStandardAuditFileTaxPT1.Settlement o)
                        {
                          x0401.oecdStandardAuditFileTaxPT1.Settlement old = DocumentTotalsImpl.this.getSettlementArray(i);
                          DocumentTotalsImpl.this.setSettlementArray(i, o);
                          return old;
                        }
                        
                        @Override
                        public void add(int i, x0401.oecdStandardAuditFileTaxPT1.Settlement o)
                            { DocumentTotalsImpl.this.insertNewSettlement(i).set(o); }
                        
                        @Override
                        public x0401.oecdStandardAuditFileTaxPT1.Settlement remove(int i)
                        {
                          x0401.oecdStandardAuditFileTaxPT1.Settlement old = DocumentTotalsImpl.this.getSettlementArray(i);
                          DocumentTotalsImpl.this.removeSettlement(i);
                          return old;
                        }
                        
                        @Override
                        public int size()
                            { return DocumentTotalsImpl.this.sizeOfSettlementArray(); }
                        
                      }
                      
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return new SettlementList();
                      }
                    }
                    
                    /**
                     * Gets array of all "Settlement" elements
                     * @deprecated
                     */
                    @Deprecated
                    public x0401.oecdStandardAuditFileTaxPT1.Settlement[] getSettlementArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        java.util.List<x0401.oecdStandardAuditFileTaxPT1.Settlement> targetList = new java.util.ArrayList<x0401.oecdStandardAuditFileTaxPT1.Settlement>();
                        get_store().find_all_element_users(SETTLEMENT$8, targetList);
                        x0401.oecdStandardAuditFileTaxPT1.Settlement[] result = new x0401.oecdStandardAuditFileTaxPT1.Settlement[targetList.size()];
                        targetList.toArray(result);
                        return result;
                      }
                    }
                    
                    /**
                     * Gets ith "Settlement" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.Settlement getSettlementArray(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.Settlement target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.Settlement)get_store().find_element_user(SETTLEMENT$8, i);
                        if (target == null)
                        {
                          throw new IndexOutOfBoundsException();
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Returns number of "Settlement" element
                     */
                    public int sizeOfSettlementArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(SETTLEMENT$8);
                      }
                    }
                    
                    /**
                     * Sets array of all "Settlement" element  WARNING: This method is not atomicaly synchronized.
                     */
                    public void setSettlementArray(x0401.oecdStandardAuditFileTaxPT1.Settlement[] settlementArray)
                    {
                      check_orphaned();
                      arraySetterHelper(settlementArray, SETTLEMENT$8);
                    }
                    
                    /**
                     * Sets ith "Settlement" element
                     */
                    public void setSettlementArray(int i, x0401.oecdStandardAuditFileTaxPT1.Settlement settlement)
                    {
                      generatedSetterHelperImpl(settlement, SETTLEMENT$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
                    }
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "Settlement" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.Settlement insertNewSettlement(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.Settlement target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.Settlement)get_store().insert_element_user(SETTLEMENT$8, i);
                        return target;
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "Settlement" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.Settlement addNewSettlement()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.Settlement target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.Settlement)get_store().add_element_user(SETTLEMENT$8);
                        return target;
                      }
                    }
                    
                    /**
                     * Removes the ith "Settlement" element
                     */
                    public void removeSettlement(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(SETTLEMENT$8, i);
                      }
                    }
                    
                    /**
                     * Gets a List of "Payment" elements
                     */
                    public java.util.List<x0401.oecdStandardAuditFileTaxPT1.PaymentMethod> getPaymentList()
                    {
                      final class PaymentList extends java.util.AbstractList<x0401.oecdStandardAuditFileTaxPT1.PaymentMethod>
                      {
                        @Override
                        public x0401.oecdStandardAuditFileTaxPT1.PaymentMethod get(int i)
                            { return DocumentTotalsImpl.this.getPaymentArray(i); }
                        
                        @Override
                        public x0401.oecdStandardAuditFileTaxPT1.PaymentMethod set(int i, x0401.oecdStandardAuditFileTaxPT1.PaymentMethod o)
                        {
                          x0401.oecdStandardAuditFileTaxPT1.PaymentMethod old = DocumentTotalsImpl.this.getPaymentArray(i);
                          DocumentTotalsImpl.this.setPaymentArray(i, o);
                          return old;
                        }
                        
                        @Override
                        public void add(int i, x0401.oecdStandardAuditFileTaxPT1.PaymentMethod o)
                            { DocumentTotalsImpl.this.insertNewPayment(i).set(o); }
                        
                        @Override
                        public x0401.oecdStandardAuditFileTaxPT1.PaymentMethod remove(int i)
                        {
                          x0401.oecdStandardAuditFileTaxPT1.PaymentMethod old = DocumentTotalsImpl.this.getPaymentArray(i);
                          DocumentTotalsImpl.this.removePayment(i);
                          return old;
                        }
                        
                        @Override
                        public int size()
                            { return DocumentTotalsImpl.this.sizeOfPaymentArray(); }
                        
                      }
                      
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return new PaymentList();
                      }
                    }
                    
                    /**
                     * Gets array of all "Payment" elements
                     * @deprecated
                     */
                    @Deprecated
                    public x0401.oecdStandardAuditFileTaxPT1.PaymentMethod[] getPaymentArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        java.util.List<x0401.oecdStandardAuditFileTaxPT1.PaymentMethod> targetList = new java.util.ArrayList<x0401.oecdStandardAuditFileTaxPT1.PaymentMethod>();
                        get_store().find_all_element_users(PAYMENT$10, targetList);
                        x0401.oecdStandardAuditFileTaxPT1.PaymentMethod[] result = new x0401.oecdStandardAuditFileTaxPT1.PaymentMethod[targetList.size()];
                        targetList.toArray(result);
                        return result;
                      }
                    }
                    
                    /**
                     * Gets ith "Payment" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.PaymentMethod getPaymentArray(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.PaymentMethod target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.PaymentMethod)get_store().find_element_user(PAYMENT$10, i);
                        if (target == null)
                        {
                          throw new IndexOutOfBoundsException();
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Returns number of "Payment" element
                     */
                    public int sizeOfPaymentArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(PAYMENT$10);
                      }
                    }
                    
                    /**
                     * Sets array of all "Payment" element  WARNING: This method is not atomicaly synchronized.
                     */
                    public void setPaymentArray(x0401.oecdStandardAuditFileTaxPT1.PaymentMethod[] paymentArray)
                    {
                      check_orphaned();
                      arraySetterHelper(paymentArray, PAYMENT$10);
                    }
                    
                    /**
                     * Sets ith "Payment" element
                     */
                    public void setPaymentArray(int i, x0401.oecdStandardAuditFileTaxPT1.PaymentMethod payment)
                    {
                      generatedSetterHelperImpl(payment, PAYMENT$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
                    }
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "Payment" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.PaymentMethod insertNewPayment(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.PaymentMethod target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.PaymentMethod)get_store().insert_element_user(PAYMENT$10, i);
                        return target;
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "Payment" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.PaymentMethod addNewPayment()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.PaymentMethod target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.PaymentMethod)get_store().add_element_user(PAYMENT$10);
                        return target;
                      }
                    }
                    
                    /**
                     * Removes the ith "Payment" element
                     */
                    public void removePayment(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(PAYMENT$10, i);
                      }
                    }
                }
            }
        }
        /**
         * An XML MovementOfGoods(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
         *
         * This is a complex type.
         */
        public static class MovementOfGoodsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods
        {
            private static final long serialVersionUID = 1L;
            
            public MovementOfGoodsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NUMBEROFMOVEMENTLINES$0 = 
                new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "NumberOfMovementLines");
            private static final javax.xml.namespace.QName TOTALQUANTITYISSUED$2 = 
                new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TotalQuantityIssued");
            private static final javax.xml.namespace.QName STOCKMOVEMENT$4 = 
                new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "StockMovement");
            
            
            /**
             * Gets the "NumberOfMovementLines" element
             */
            public java.math.BigInteger getNumberOfMovementLines()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFMOVEMENTLINES$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigIntegerValue();
                }
            }
            
            /**
             * Gets (as xml) the "NumberOfMovementLines" element
             */
            public org.apache.xmlbeans.XmlNonNegativeInteger xgetNumberOfMovementLines()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(NUMBEROFMOVEMENTLINES$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "NumberOfMovementLines" element
             */
            public void setNumberOfMovementLines(java.math.BigInteger numberOfMovementLines)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFMOVEMENTLINES$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFMOVEMENTLINES$0);
                    }
                    target.setBigIntegerValue(numberOfMovementLines);
                }
            }
            
            /**
             * Sets (as xml) the "NumberOfMovementLines" element
             */
            public void xsetNumberOfMovementLines(org.apache.xmlbeans.XmlNonNegativeInteger numberOfMovementLines)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(NUMBEROFMOVEMENTLINES$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(NUMBEROFMOVEMENTLINES$0);
                    }
                    target.set(numberOfMovementLines);
                }
            }
            
            /**
             * Gets the "TotalQuantityIssued" element
             */
            public java.math.BigDecimal getTotalQuantityIssued()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALQUANTITYISSUED$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigDecimalValue();
                }
            }
            
            /**
             * Gets (as xml) the "TotalQuantityIssued" element
             */
            public x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType xgetTotalQuantityIssued()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType)get_store().find_element_user(TOTALQUANTITYISSUED$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "TotalQuantityIssued" element
             */
            public void setTotalQuantityIssued(java.math.BigDecimal totalQuantityIssued)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALQUANTITYISSUED$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALQUANTITYISSUED$2);
                    }
                    target.setBigDecimalValue(totalQuantityIssued);
                }
            }
            
            /**
             * Sets (as xml) the "TotalQuantityIssued" element
             */
            public void xsetTotalQuantityIssued(x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType totalQuantityIssued)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType)get_store().find_element_user(TOTALQUANTITYISSUED$2, 0);
                    if (target == null)
                    {
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType)get_store().add_element_user(TOTALQUANTITYISSUED$2);
                    }
                    target.set(totalQuantityIssued);
                }
            }
            
            /**
             * Gets a List of "StockMovement" elements
             */
            public java.util.List<x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement> getStockMovementList()
            {
                final class StockMovementList extends java.util.AbstractList<x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement>
                {
                    @Override
                    public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement get(int i)
                        { return MovementOfGoodsImpl.this.getStockMovementArray(i); }
                    
                    @Override
                    public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement set(int i, x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement o)
                    {
                      x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement old = MovementOfGoodsImpl.this.getStockMovementArray(i);
                      MovementOfGoodsImpl.this.setStockMovementArray(i, o);
                      return old;
                    }
                    
                    @Override
                    public void add(int i, x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement o)
                        { MovementOfGoodsImpl.this.insertNewStockMovement(i).set(o); }
                    
                    @Override
                    public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement remove(int i)
                    {
                      x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement old = MovementOfGoodsImpl.this.getStockMovementArray(i);
                      MovementOfGoodsImpl.this.removeStockMovement(i);
                      return old;
                    }
                    
                    @Override
                    public int size()
                        { return MovementOfGoodsImpl.this.sizeOfStockMovementArray(); }
                    
                }
                
                synchronized (monitor())
                {
                    check_orphaned();
                    return new StockMovementList();
                }
            }
            
            /**
             * Gets array of all "StockMovement" elements
             * @deprecated
             */
            @Deprecated
            public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement[] getStockMovementArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List<x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement> targetList = new java.util.ArrayList<x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement>();
                    get_store().find_all_element_users(STOCKMOVEMENT$4, targetList);
                    x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement[] result = new x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "StockMovement" element
             */
            public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement getStockMovementArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement)get_store().find_element_user(STOCKMOVEMENT$4, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "StockMovement" element
             */
            public int sizeOfStockMovementArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(STOCKMOVEMENT$4);
                }
            }
            
            /**
             * Sets array of all "StockMovement" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setStockMovementArray(x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement[] stockMovementArray)
            {
                check_orphaned();
                arraySetterHelper(stockMovementArray, STOCKMOVEMENT$4);
            }
            
            /**
             * Sets ith "StockMovement" element
             */
            public void setStockMovementArray(int i, x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement stockMovement)
            {
                generatedSetterHelperImpl(stockMovement, STOCKMOVEMENT$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "StockMovement" element
             */
            public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement insertNewStockMovement(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement)get_store().insert_element_user(STOCKMOVEMENT$4, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "StockMovement" element
             */
            public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement addNewStockMovement()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement)get_store().add_element_user(STOCKMOVEMENT$4);
                    return target;
                }
            }
            
            /**
             * Removes the ith "StockMovement" element
             */
            public void removeStockMovement(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(STOCKMOVEMENT$4, i);
                }
            }
            /**
             * An XML StockMovement(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
             *
             * This is a complex type.
             */
            public static class StockMovementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement
            {
                private static final long serialVersionUID = 1L;
                
                public StockMovementImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName DOCUMENTNUMBER$0 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "DocumentNumber");
                private static final javax.xml.namespace.QName ATCUD$2 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "ATCUD");
                private static final javax.xml.namespace.QName DOCUMENTSTATUS$4 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "DocumentStatus");
                private static final javax.xml.namespace.QName HASH$6 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Hash");
                private static final javax.xml.namespace.QName HASHCONTROL$8 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "HashControl");
                private static final javax.xml.namespace.QName PERIOD$10 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Period");
                private static final javax.xml.namespace.QName MOVEMENTDATE$12 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "MovementDate");
                private static final javax.xml.namespace.QName MOVEMENTTYPE$14 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "MovementType");
                private static final javax.xml.namespace.QName SYSTEMENTRYDATE$16 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "SystemEntryDate");
                private static final javax.xml.namespace.QName TRANSACTIONID$18 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TransactionID");
                private static final javax.xml.namespace.QName CUSTOMERID$20 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "CustomerID");
                private static final javax.xml.namespace.QName SUPPLIERID$22 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "SupplierID");
                private static final javax.xml.namespace.QName SOURCEID$24 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "SourceID");
                private static final javax.xml.namespace.QName EACCODE$26 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "EACCode");
                private static final javax.xml.namespace.QName MOVEMENTCOMMENTS$28 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "MovementComments");
                private static final javax.xml.namespace.QName SHIPTO$30 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "ShipTo");
                private static final javax.xml.namespace.QName SHIPFROM$32 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "ShipFrom");
                private static final javax.xml.namespace.QName MOVEMENTENDTIME$34 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "MovementEndTime");
                private static final javax.xml.namespace.QName MOVEMENTSTARTTIME$36 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "MovementStartTime");
                private static final javax.xml.namespace.QName ATDOCCODEID$38 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "ATDocCodeID");
                private static final javax.xml.namespace.QName LINE$40 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Line");
                private static final javax.xml.namespace.QName DOCUMENTTOTALS$42 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "DocumentTotals");
                
                
                /**
                 * Gets the "DocumentNumber" element
                 */
                public java.lang.String getDocumentNumber()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTNUMBER$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "DocumentNumber" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.DocumentNumberDocument.DocumentNumber xgetDocumentNumber()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.DocumentNumberDocument.DocumentNumber target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.DocumentNumberDocument.DocumentNumber)get_store().find_element_user(DOCUMENTNUMBER$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "DocumentNumber" element
                 */
                public void setDocumentNumber(java.lang.String documentNumber)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTNUMBER$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCUMENTNUMBER$0);
                      }
                      target.setStringValue(documentNumber);
                    }
                }
                
                /**
                 * Sets (as xml) the "DocumentNumber" element
                 */
                public void xsetDocumentNumber(x0401.oecdStandardAuditFileTaxPT1.DocumentNumberDocument.DocumentNumber documentNumber)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.DocumentNumberDocument.DocumentNumber target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.DocumentNumberDocument.DocumentNumber)get_store().find_element_user(DOCUMENTNUMBER$0, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.DocumentNumberDocument.DocumentNumber)get_store().add_element_user(DOCUMENTNUMBER$0);
                      }
                      target.set(documentNumber);
                    }
                }
                
                /**
                 * Gets the "ATCUD" element
                 */
                public java.lang.String getATCUD()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATCUD$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "ATCUD" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car xgetATCUD()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car)get_store().find_element_user(ATCUD$2, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "ATCUD" element
                 */
                public void setATCUD(java.lang.String atcud)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATCUD$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATCUD$2);
                      }
                      target.setStringValue(atcud);
                    }
                }
                
                /**
                 * Sets (as xml) the "ATCUD" element
                 */
                public void xsetATCUD(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car atcud)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car)get_store().find_element_user(ATCUD$2, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car)get_store().add_element_user(ATCUD$2);
                      }
                      target.set(atcud);
                    }
                }
                
                /**
                 * Gets the "DocumentStatus" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.DocumentStatus getDocumentStatus()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.DocumentStatus target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.DocumentStatus)get_store().find_element_user(DOCUMENTSTATUS$4, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "DocumentStatus" element
                 */
                public void setDocumentStatus(x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.DocumentStatus documentStatus)
                {
                    generatedSetterHelperImpl(documentStatus, DOCUMENTSTATUS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                }
                
                /**
                 * Appends and returns a new empty "DocumentStatus" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.DocumentStatus addNewDocumentStatus()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.DocumentStatus target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.DocumentStatus)get_store().add_element_user(DOCUMENTSTATUS$4);
                      return target;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASH$6, 0);
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
                public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax172Car xgetHash()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax172Car target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax172Car)get_store().find_element_user(HASH$6, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASH$6, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASH$6);
                      }
                      target.setStringValue(hash);
                    }
                }
                
                /**
                 * Sets (as xml) the "Hash" element
                 */
                public void xsetHash(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax172Car hash)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax172Car target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax172Car)get_store().find_element_user(HASH$6, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax172Car)get_store().add_element_user(HASH$6);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASHCONTROL$8, 0);
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
                public x0401.oecdStandardAuditFileTaxPT1.SAFPTHashControl xgetHashControl()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTHashControl target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTHashControl)get_store().find_element_user(HASHCONTROL$8, 0);
                      return target;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASHCONTROL$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASHCONTROL$8);
                      }
                      target.setStringValue(hashControl);
                    }
                }
                
                /**
                 * Sets (as xml) the "HashControl" element
                 */
                public void xsetHashControl(x0401.oecdStandardAuditFileTaxPT1.SAFPTHashControl hashControl)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTHashControl target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTHashControl)get_store().find_element_user(HASHCONTROL$8, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTHashControl)get_store().add_element_user(HASHCONTROL$8);
                      }
                      target.set(hashControl);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIOD$10, 0);
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
                public x0401.oecdStandardAuditFileTaxPT1.PeriodDocument.Period xgetPeriod()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.PeriodDocument.Period target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.PeriodDocument.Period)get_store().find_element_user(PERIOD$10, 0);
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
                      return get_store().count_elements(PERIOD$10) != 0;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIOD$10, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERIOD$10);
                      }
                      target.setIntValue(period);
                    }
                }
                
                /**
                 * Sets (as xml) the "Period" element
                 */
                public void xsetPeriod(x0401.oecdStandardAuditFileTaxPT1.PeriodDocument.Period period)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.PeriodDocument.Period target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.PeriodDocument.Period)get_store().find_element_user(PERIOD$10, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.PeriodDocument.Period)get_store().add_element_user(PERIOD$10);
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
                      get_store().remove_element(PERIOD$10, 0);
                    }
                }
                
                /**
                 * Gets the "MovementDate" element
                 */
                public java.util.Calendar getMovementDate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOVEMENTDATE$12, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getCalendarValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "MovementDate" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SAFdateType xgetMovementDate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(MOVEMENTDATE$12, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "MovementDate" element
                 */
                public void setMovementDate(java.util.Calendar movementDate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOVEMENTDATE$12, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOVEMENTDATE$12);
                      }
                      target.setCalendarValue(movementDate);
                    }
                }
                
                /**
                 * Sets (as xml) the "MovementDate" element
                 */
                public void xsetMovementDate(x0401.oecdStandardAuditFileTaxPT1.SAFdateType movementDate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(MOVEMENTDATE$12, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().add_element_user(MOVEMENTDATE$12);
                      }
                      target.set(movementDate);
                    }
                }
                
                /**
                 * Gets the "MovementType" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.MovementTypeDocument.MovementType.Enum getMovementType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOVEMENTTYPE$14, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return (x0401.oecdStandardAuditFileTaxPT1.MovementTypeDocument.MovementType.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "MovementType" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.MovementTypeDocument.MovementType xgetMovementType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.MovementTypeDocument.MovementType target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.MovementTypeDocument.MovementType)get_store().find_element_user(MOVEMENTTYPE$14, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "MovementType" element
                 */
                public void setMovementType(x0401.oecdStandardAuditFileTaxPT1.MovementTypeDocument.MovementType.Enum movementType)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOVEMENTTYPE$14, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOVEMENTTYPE$14);
                      }
                      target.setEnumValue(movementType);
                    }
                }
                
                /**
                 * Sets (as xml) the "MovementType" element
                 */
                public void xsetMovementType(x0401.oecdStandardAuditFileTaxPT1.MovementTypeDocument.MovementType movementType)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.MovementTypeDocument.MovementType target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.MovementTypeDocument.MovementType)get_store().find_element_user(MOVEMENTTYPE$14, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.MovementTypeDocument.MovementType)get_store().add_element_user(MOVEMENTTYPE$14);
                      }
                      target.set(movementType);
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
                public x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType xgetSystemEntryDate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(SYSTEMENTRYDATE$16, 0);
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
                public void xsetSystemEntryDate(x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType systemEntryDate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(SYSTEMENTRYDATE$16, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().add_element_user(SYSTEMENTRYDATE$16);
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
                public x0401.oecdStandardAuditFileTaxPT1.SAFPTTransactionID xgetTransactionID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTTransactionID target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTTransactionID)get_store().find_element_user(TRANSACTIONID$18, 0);
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
                public void xsetTransactionID(x0401.oecdStandardAuditFileTaxPT1.SAFPTTransactionID transactionID)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTTransactionID target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTTransactionID)get_store().find_element_user(TRANSACTIONID$18, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTTransactionID)get_store().add_element_user(TRANSACTIONID$18);
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
                public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetCustomerID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(CUSTOMERID$20, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "CustomerID" element
                 */
                public boolean isSetCustomerID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(CUSTOMERID$20) != 0;
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
                public void xsetCustomerID(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car customerID)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(CUSTOMERID$20, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().add_element_user(CUSTOMERID$20);
                      }
                      target.set(customerID);
                    }
                }
                
                /**
                 * Unsets the "CustomerID" element
                 */
                public void unsetCustomerID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(CUSTOMERID$20, 0);
                    }
                }
                
                /**
                 * Gets the "SupplierID" element
                 */
                public java.lang.String getSupplierID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPLIERID$22, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "SupplierID" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetSupplierID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(SUPPLIERID$22, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "SupplierID" element
                 */
                public boolean isSetSupplierID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(SUPPLIERID$22) != 0;
                    }
                }
                
                /**
                 * Sets the "SupplierID" element
                 */
                public void setSupplierID(java.lang.String supplierID)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPLIERID$22, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUPPLIERID$22);
                      }
                      target.setStringValue(supplierID);
                    }
                }
                
                /**
                 * Sets (as xml) the "SupplierID" element
                 */
                public void xsetSupplierID(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car supplierID)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(SUPPLIERID$22, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().add_element_user(SUPPLIERID$22);
                      }
                      target.set(supplierID);
                    }
                }
                
                /**
                 * Unsets the "SupplierID" element
                 */
                public void unsetSupplierID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(SUPPLIERID$22, 0);
                    }
                }
                
                /**
                 * Gets the "SourceID" element
                 */
                public java.lang.String getSourceID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEID$24, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "SourceID" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetSourceID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(SOURCEID$24, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "SourceID" element
                 */
                public void setSourceID(java.lang.String sourceID)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEID$24, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEID$24);
                      }
                      target.setStringValue(sourceID);
                    }
                }
                
                /**
                 * Sets (as xml) the "SourceID" element
                 */
                public void xsetSourceID(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car sourceID)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(SOURCEID$24, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().add_element_user(SOURCEID$24);
                      }
                      target.set(sourceID);
                    }
                }
                
                /**
                 * Gets the "EACCode" element
                 */
                public java.lang.String getEACCode()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EACCODE$26, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "EACCode" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.EACCodeDocument.EACCode xgetEACCode()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.EACCodeDocument.EACCode target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.EACCodeDocument.EACCode)get_store().find_element_user(EACCODE$26, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "EACCode" element
                 */
                public boolean isSetEACCode()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(EACCODE$26) != 0;
                    }
                }
                
                /**
                 * Sets the "EACCode" element
                 */
                public void setEACCode(java.lang.String eacCode)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EACCODE$26, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EACCODE$26);
                      }
                      target.setStringValue(eacCode);
                    }
                }
                
                /**
                 * Sets (as xml) the "EACCode" element
                 */
                public void xsetEACCode(x0401.oecdStandardAuditFileTaxPT1.EACCodeDocument.EACCode eacCode)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.EACCodeDocument.EACCode target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.EACCodeDocument.EACCode)get_store().find_element_user(EACCODE$26, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.EACCodeDocument.EACCode)get_store().add_element_user(EACCODE$26);
                      }
                      target.set(eacCode);
                    }
                }
                
                /**
                 * Unsets the "EACCode" element
                 */
                public void unsetEACCode()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(EACCODE$26, 0);
                    }
                }
                
                /**
                 * Gets the "MovementComments" element
                 */
                public java.lang.String getMovementComments()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOVEMENTCOMMENTS$28, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "MovementComments" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car xgetMovementComments()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(MOVEMENTCOMMENTS$28, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "MovementComments" element
                 */
                public boolean isSetMovementComments()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(MOVEMENTCOMMENTS$28) != 0;
                    }
                }
                
                /**
                 * Sets the "MovementComments" element
                 */
                public void setMovementComments(java.lang.String movementComments)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOVEMENTCOMMENTS$28, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOVEMENTCOMMENTS$28);
                      }
                      target.setStringValue(movementComments);
                    }
                }
                
                /**
                 * Sets (as xml) the "MovementComments" element
                 */
                public void xsetMovementComments(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car movementComments)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(MOVEMENTCOMMENTS$28, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().add_element_user(MOVEMENTCOMMENTS$28);
                      }
                      target.set(movementComments);
                    }
                }
                
                /**
                 * Unsets the "MovementComments" element
                 */
                public void unsetMovementComments()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(MOVEMENTCOMMENTS$28, 0);
                    }
                }
                
                /**
                 * Gets the "ShipTo" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.ShippingPointStructure getShipTo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.ShippingPointStructure target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.ShippingPointStructure)get_store().find_element_user(SHIPTO$30, 0);
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
                      return get_store().count_elements(SHIPTO$30) != 0;
                    }
                }
                
                /**
                 * Sets the "ShipTo" element
                 */
                public void setShipTo(x0401.oecdStandardAuditFileTaxPT1.ShippingPointStructure shipTo)
                {
                    generatedSetterHelperImpl(shipTo, SHIPTO$30, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                }
                
                /**
                 * Appends and returns a new empty "ShipTo" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.ShippingPointStructure addNewShipTo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.ShippingPointStructure target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.ShippingPointStructure)get_store().add_element_user(SHIPTO$30);
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
                      get_store().remove_element(SHIPTO$30, 0);
                    }
                }
                
                /**
                 * Gets the "ShipFrom" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.ShippingPointStructure getShipFrom()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.ShippingPointStructure target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.ShippingPointStructure)get_store().find_element_user(SHIPFROM$32, 0);
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
                      return get_store().count_elements(SHIPFROM$32) != 0;
                    }
                }
                
                /**
                 * Sets the "ShipFrom" element
                 */
                public void setShipFrom(x0401.oecdStandardAuditFileTaxPT1.ShippingPointStructure shipFrom)
                {
                    generatedSetterHelperImpl(shipFrom, SHIPFROM$32, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                }
                
                /**
                 * Appends and returns a new empty "ShipFrom" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.ShippingPointStructure addNewShipFrom()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.ShippingPointStructure target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.ShippingPointStructure)get_store().add_element_user(SHIPFROM$32);
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
                      get_store().remove_element(SHIPFROM$32, 0);
                    }
                }
                
                /**
                 * Gets the "MovementEndTime" element
                 */
                public java.util.Calendar getMovementEndTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOVEMENTENDTIME$34, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getCalendarValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "MovementEndTime" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType xgetMovementEndTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(MOVEMENTENDTIME$34, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "MovementEndTime" element
                 */
                public boolean isSetMovementEndTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(MOVEMENTENDTIME$34) != 0;
                    }
                }
                
                /**
                 * Sets the "MovementEndTime" element
                 */
                public void setMovementEndTime(java.util.Calendar movementEndTime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOVEMENTENDTIME$34, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOVEMENTENDTIME$34);
                      }
                      target.setCalendarValue(movementEndTime);
                    }
                }
                
                /**
                 * Sets (as xml) the "MovementEndTime" element
                 */
                public void xsetMovementEndTime(x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType movementEndTime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(MOVEMENTENDTIME$34, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().add_element_user(MOVEMENTENDTIME$34);
                      }
                      target.set(movementEndTime);
                    }
                }
                
                /**
                 * Unsets the "MovementEndTime" element
                 */
                public void unsetMovementEndTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(MOVEMENTENDTIME$34, 0);
                    }
                }
                
                /**
                 * Gets the "MovementStartTime" element
                 */
                public java.util.Calendar getMovementStartTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOVEMENTSTARTTIME$36, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getCalendarValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "MovementStartTime" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType xgetMovementStartTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(MOVEMENTSTARTTIME$36, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "MovementStartTime" element
                 */
                public void setMovementStartTime(java.util.Calendar movementStartTime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOVEMENTSTARTTIME$36, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOVEMENTSTARTTIME$36);
                      }
                      target.setCalendarValue(movementStartTime);
                    }
                }
                
                /**
                 * Sets (as xml) the "MovementStartTime" element
                 */
                public void xsetMovementStartTime(x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType movementStartTime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(MOVEMENTSTARTTIME$36, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().add_element_user(MOVEMENTSTARTTIME$36);
                      }
                      target.set(movementStartTime);
                    }
                }
                
                /**
                 * Gets the "ATDocCodeID" element
                 */
                public java.lang.String getATDocCodeID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATDOCCODEID$38, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "ATDocCodeID" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car xgetATDocCodeID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car)get_store().find_element_user(ATDOCCODEID$38, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "ATDocCodeID" element
                 */
                public boolean isSetATDocCodeID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(ATDOCCODEID$38) != 0;
                    }
                }
                
                /**
                 * Sets the "ATDocCodeID" element
                 */
                public void setATDocCodeID(java.lang.String atDocCodeID)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATDOCCODEID$38, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATDOCCODEID$38);
                      }
                      target.setStringValue(atDocCodeID);
                    }
                }
                
                /**
                 * Sets (as xml) the "ATDocCodeID" element
                 */
                public void xsetATDocCodeID(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car atDocCodeID)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car)get_store().find_element_user(ATDOCCODEID$38, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car)get_store().add_element_user(ATDOCCODEID$38);
                      }
                      target.set(atDocCodeID);
                    }
                }
                
                /**
                 * Unsets the "ATDocCodeID" element
                 */
                public void unsetATDocCodeID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(ATDOCCODEID$38, 0);
                    }
                }
                
                /**
                 * Gets a List of "Line" elements
                 */
                public java.util.List<x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.Line> getLineList()
                {
                    final class LineList extends java.util.AbstractList<x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.Line>
                    {
                      @Override
                      public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.Line get(int i)
                          { return StockMovementImpl.this.getLineArray(i); }
                      
                      @Override
                      public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.Line set(int i, x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.Line o)
                      {
                        x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.Line old = StockMovementImpl.this.getLineArray(i);
                        StockMovementImpl.this.setLineArray(i, o);
                        return old;
                      }
                      
                      @Override
                      public void add(int i, x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.Line o)
                          { StockMovementImpl.this.insertNewLine(i).set(o); }
                      
                      @Override
                      public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.Line remove(int i)
                      {
                        x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.Line old = StockMovementImpl.this.getLineArray(i);
                        StockMovementImpl.this.removeLine(i);
                        return old;
                      }
                      
                      @Override
                      public int size()
                          { return StockMovementImpl.this.sizeOfLineArray(); }
                      
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
                public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.Line[] getLineArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List<x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.Line> targetList = new java.util.ArrayList<x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.Line>();
                      get_store().find_all_element_users(LINE$40, targetList);
                      x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.Line[] result = new x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.Line[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "Line" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.Line getLineArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.Line target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.Line)get_store().find_element_user(LINE$40, i);
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
                      return get_store().count_elements(LINE$40);
                    }
                }
                
                /**
                 * Sets array of all "Line" element  WARNING: This method is not atomicaly synchronized.
                 */
                public void setLineArray(x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.Line[] lineArray)
                {
                    check_orphaned();
                    arraySetterHelper(lineArray, LINE$40);
                }
                
                /**
                 * Sets ith "Line" element
                 */
                public void setLineArray(int i, x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.Line line)
                {
                    generatedSetterHelperImpl(line, LINE$40, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "Line" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.Line insertNewLine(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.Line target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.Line)get_store().insert_element_user(LINE$40, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "Line" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.Line addNewLine()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.Line target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.Line)get_store().add_element_user(LINE$40);
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
                      get_store().remove_element(LINE$40, i);
                    }
                }
                
                /**
                 * Gets the "DocumentTotals" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.DocumentTotals getDocumentTotals()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.DocumentTotals target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.DocumentTotals)get_store().find_element_user(DOCUMENTTOTALS$42, 0);
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
                public void setDocumentTotals(x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.DocumentTotals documentTotals)
                {
                    generatedSetterHelperImpl(documentTotals, DOCUMENTTOTALS$42, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                }
                
                /**
                 * Appends and returns a new empty "DocumentTotals" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.DocumentTotals addNewDocumentTotals()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.DocumentTotals target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.DocumentTotals)get_store().add_element_user(DOCUMENTTOTALS$42);
                      return target;
                    }
                }
                /**
                 * An XML DocumentStatus(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
                 *
                 * This is a complex type.
                 */
                public static class DocumentStatusImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.DocumentStatus
                {
                    private static final long serialVersionUID = 1L;
                    
                    public DocumentStatusImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName MOVEMENTSTATUS$0 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "MovementStatus");
                    private static final javax.xml.namespace.QName MOVEMENTSTATUSDATE$2 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "MovementStatusDate");
                    private static final javax.xml.namespace.QName REASON$4 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Reason");
                    private static final javax.xml.namespace.QName SOURCEID$6 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "SourceID");
                    private static final javax.xml.namespace.QName SOURCEBILLING$8 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "SourceBilling");
                    
                    
                    /**
                     * Gets the "MovementStatus" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.MovementStatusDocument.MovementStatus.Enum getMovementStatus()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOVEMENTSTATUS$0, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return (x0401.oecdStandardAuditFileTaxPT1.MovementStatusDocument.MovementStatus.Enum)target.getEnumValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "MovementStatus" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.MovementStatusDocument.MovementStatus xgetMovementStatus()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.MovementStatusDocument.MovementStatus target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.MovementStatusDocument.MovementStatus)get_store().find_element_user(MOVEMENTSTATUS$0, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "MovementStatus" element
                     */
                    public void setMovementStatus(x0401.oecdStandardAuditFileTaxPT1.MovementStatusDocument.MovementStatus.Enum movementStatus)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOVEMENTSTATUS$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOVEMENTSTATUS$0);
                        }
                        target.setEnumValue(movementStatus);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "MovementStatus" element
                     */
                    public void xsetMovementStatus(x0401.oecdStandardAuditFileTaxPT1.MovementStatusDocument.MovementStatus movementStatus)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.MovementStatusDocument.MovementStatus target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.MovementStatusDocument.MovementStatus)get_store().find_element_user(MOVEMENTSTATUS$0, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.MovementStatusDocument.MovementStatus)get_store().add_element_user(MOVEMENTSTATUS$0);
                        }
                        target.set(movementStatus);
                      }
                    }
                    
                    /**
                     * Gets the "MovementStatusDate" element
                     */
                    public java.util.Calendar getMovementStatusDate()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOVEMENTSTATUSDATE$2, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getCalendarValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "MovementStatusDate" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType xgetMovementStatusDate()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(MOVEMENTSTATUSDATE$2, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "MovementStatusDate" element
                     */
                    public void setMovementStatusDate(java.util.Calendar movementStatusDate)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOVEMENTSTATUSDATE$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOVEMENTSTATUSDATE$2);
                        }
                        target.setCalendarValue(movementStatusDate);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "MovementStatusDate" element
                     */
                    public void xsetMovementStatusDate(x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType movementStatusDate)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(MOVEMENTSTATUSDATE$2, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().add_element_user(MOVEMENTSTATUSDATE$2);
                        }
                        target.set(movementStatusDate);
                      }
                    }
                    
                    /**
                     * Gets the "Reason" element
                     */
                    public java.lang.String getReason()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASON$4, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "Reason" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car xgetReason()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().find_element_user(REASON$4, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "Reason" element
                     */
                    public boolean isSetReason()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(REASON$4) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "Reason" element
                     */
                    public void setReason(java.lang.String reason)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASON$4, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REASON$4);
                        }
                        target.setStringValue(reason);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "Reason" element
                     */
                    public void xsetReason(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car reason)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().find_element_user(REASON$4, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().add_element_user(REASON$4);
                        }
                        target.set(reason);
                      }
                    }
                    
                    /**
                     * Unsets the "Reason" element
                     */
                    public void unsetReason()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(REASON$4, 0);
                      }
                    }
                    
                    /**
                     * Gets the "SourceID" element
                     */
                    public java.lang.String getSourceID()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEID$6, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "SourceID" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetSourceID()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(SOURCEID$6, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "SourceID" element
                     */
                    public void setSourceID(java.lang.String sourceID)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEID$6, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEID$6);
                        }
                        target.setStringValue(sourceID);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "SourceID" element
                     */
                    public void xsetSourceID(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car sourceID)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(SOURCEID$6, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().add_element_user(SOURCEID$6);
                        }
                        target.set(sourceID);
                      }
                    }
                    
                    /**
                     * Gets the "SourceBilling" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling.Enum getSourceBilling()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEBILLING$8, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return (x0401.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling.Enum)target.getEnumValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "SourceBilling" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling xgetSourceBilling()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling)get_store().find_element_user(SOURCEBILLING$8, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "SourceBilling" element
                     */
                    public void setSourceBilling(x0401.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling.Enum sourceBilling)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEBILLING$8, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEBILLING$8);
                        }
                        target.setEnumValue(sourceBilling);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "SourceBilling" element
                     */
                    public void xsetSourceBilling(x0401.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling sourceBilling)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling)get_store().find_element_user(SOURCEBILLING$8, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling)get_store().add_element_user(SOURCEBILLING$8);
                        }
                        target.set(sourceBilling);
                      }
                    }
                }
                /**
                 * An XML Line(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
                 *
                 * This is a complex type.
                 */
                public static class LineImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.Line
                {
                    private static final long serialVersionUID = 1L;
                    
                    public LineImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName LINENUMBER$0 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "LineNumber");
                    private static final javax.xml.namespace.QName ORDERREFERENCES$2 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "OrderReferences");
                    private static final javax.xml.namespace.QName PRODUCTCODE$4 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "ProductCode");
                    private static final javax.xml.namespace.QName PRODUCTDESCRIPTION$6 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "ProductDescription");
                    private static final javax.xml.namespace.QName QUANTITY$8 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Quantity");
                    private static final javax.xml.namespace.QName UNITOFMEASURE$10 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "UnitOfMeasure");
                    private static final javax.xml.namespace.QName UNITPRICE$12 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "UnitPrice");
                    private static final javax.xml.namespace.QName DESCRIPTION$14 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Description");
                    private static final javax.xml.namespace.QName PRODUCTSERIALNUMBER$16 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "ProductSerialNumber");
                    private static final javax.xml.namespace.QName DEBITAMOUNT$18 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "DebitAmount");
                    private static final javax.xml.namespace.QName CREDITAMOUNT$20 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "CreditAmount");
                    private static final javax.xml.namespace.QName TAX$22 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Tax");
                    private static final javax.xml.namespace.QName TAXEXEMPTIONREASON$24 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TaxExemptionReason");
                    private static final javax.xml.namespace.QName TAXEXEMPTIONCODE$26 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TaxExemptionCode");
                    private static final javax.xml.namespace.QName SETTLEMENTAMOUNT$28 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "SettlementAmount");
                    private static final javax.xml.namespace.QName CUSTOMSINFORMATION$30 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "CustomsInformation");
                    
                    
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
                    public org.apache.xmlbeans.XmlNonNegativeInteger xgetLineNumber()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                        target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(LINENUMBER$0, 0);
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
                    public void xsetLineNumber(org.apache.xmlbeans.XmlNonNegativeInteger lineNumber)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                        target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(LINENUMBER$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(LINENUMBER$0);
                        }
                        target.set(lineNumber);
                      }
                    }
                    
                    /**
                     * Gets a List of "OrderReferences" elements
                     */
                    public java.util.List<x0401.oecdStandardAuditFileTaxPT1.OrderReferences> getOrderReferencesList()
                    {
                      final class OrderReferencesList extends java.util.AbstractList<x0401.oecdStandardAuditFileTaxPT1.OrderReferences>
                      {
                        @Override
                        public x0401.oecdStandardAuditFileTaxPT1.OrderReferences get(int i)
                            { return LineImpl.this.getOrderReferencesArray(i); }
                        
                        @Override
                        public x0401.oecdStandardAuditFileTaxPT1.OrderReferences set(int i, x0401.oecdStandardAuditFileTaxPT1.OrderReferences o)
                        {
                          x0401.oecdStandardAuditFileTaxPT1.OrderReferences old = LineImpl.this.getOrderReferencesArray(i);
                          LineImpl.this.setOrderReferencesArray(i, o);
                          return old;
                        }
                        
                        @Override
                        public void add(int i, x0401.oecdStandardAuditFileTaxPT1.OrderReferences o)
                            { LineImpl.this.insertNewOrderReferences(i).set(o); }
                        
                        @Override
                        public x0401.oecdStandardAuditFileTaxPT1.OrderReferences remove(int i)
                        {
                          x0401.oecdStandardAuditFileTaxPT1.OrderReferences old = LineImpl.this.getOrderReferencesArray(i);
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
                    public x0401.oecdStandardAuditFileTaxPT1.OrderReferences[] getOrderReferencesArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        java.util.List<x0401.oecdStandardAuditFileTaxPT1.OrderReferences> targetList = new java.util.ArrayList<x0401.oecdStandardAuditFileTaxPT1.OrderReferences>();
                        get_store().find_all_element_users(ORDERREFERENCES$2, targetList);
                        x0401.oecdStandardAuditFileTaxPT1.OrderReferences[] result = new x0401.oecdStandardAuditFileTaxPT1.OrderReferences[targetList.size()];
                        targetList.toArray(result);
                        return result;
                      }
                    }
                    
                    /**
                     * Gets ith "OrderReferences" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.OrderReferences getOrderReferencesArray(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.OrderReferences target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.OrderReferences)get_store().find_element_user(ORDERREFERENCES$2, i);
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
                    public void setOrderReferencesArray(x0401.oecdStandardAuditFileTaxPT1.OrderReferences[] orderReferencesArray)
                    {
                      check_orphaned();
                      arraySetterHelper(orderReferencesArray, ORDERREFERENCES$2);
                    }
                    
                    /**
                     * Sets ith "OrderReferences" element
                     */
                    public void setOrderReferencesArray(int i, x0401.oecdStandardAuditFileTaxPT1.OrderReferences orderReferences)
                    {
                      generatedSetterHelperImpl(orderReferences, ORDERREFERENCES$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
                    }
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "OrderReferences" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.OrderReferences insertNewOrderReferences(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.OrderReferences target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.OrderReferences)get_store().insert_element_user(ORDERREFERENCES$2, i);
                        return target;
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "OrderReferences" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.OrderReferences addNewOrderReferences()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.OrderReferences target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.OrderReferences)get_store().add_element_user(ORDERREFERENCES$2);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car xgetProductCode()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(PRODUCTCODE$4, 0);
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
                    public void xsetProductCode(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car productCode)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(PRODUCTCODE$4, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().add_element_user(PRODUCTCODE$4);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFPTProductDescription xgetProductDescription()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTProductDescription target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTProductDescription)get_store().find_element_user(PRODUCTDESCRIPTION$6, 0);
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
                    public void xsetProductDescription(x0401.oecdStandardAuditFileTaxPT1.SAFPTProductDescription productDescription)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTProductDescription target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTProductDescription)get_store().find_element_user(PRODUCTDESCRIPTION$6, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTProductDescription)get_store().add_element_user(PRODUCTDESCRIPTION$6);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType xgetQuantity()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType)get_store().find_element_user(QUANTITY$8, 0);
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
                    public void xsetQuantity(x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType quantity)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType)get_store().find_element_user(QUANTITY$8, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType)get_store().add_element_user(QUANTITY$8);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car xgetUnitOfMeasure()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().find_element_user(UNITOFMEASURE$10, 0);
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
                    public void xsetUnitOfMeasure(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car unitOfMeasure)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().find_element_user(UNITOFMEASURE$10, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().add_element_user(UNITOFMEASURE$10);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetUnitPrice()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(UNITPRICE$12, 0);
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
                    public void xsetUnitPrice(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType unitPrice)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(UNITPRICE$12, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(UNITPRICE$12);
                        }
                        target.set(unitPrice);
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$14, 0);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car xgetDescription()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car)get_store().find_element_user(DESCRIPTION$14, 0);
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$14, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$14);
                        }
                        target.setStringValue(description);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "Description" element
                     */
                    public void xsetDescription(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car description)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car)get_store().find_element_user(DESCRIPTION$14, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car)get_store().add_element_user(DESCRIPTION$14);
                        }
                        target.set(description);
                      }
                    }
                    
                    /**
                     * Gets the "ProductSerialNumber" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.ProductSerialNumber getProductSerialNumber()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.ProductSerialNumber target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.ProductSerialNumber)get_store().find_element_user(PRODUCTSERIALNUMBER$16, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "ProductSerialNumber" element
                     */
                    public boolean isSetProductSerialNumber()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(PRODUCTSERIALNUMBER$16) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "ProductSerialNumber" element
                     */
                    public void setProductSerialNumber(x0401.oecdStandardAuditFileTaxPT1.ProductSerialNumber productSerialNumber)
                    {
                      generatedSetterHelperImpl(productSerialNumber, PRODUCTSERIALNUMBER$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "ProductSerialNumber" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.ProductSerialNumber addNewProductSerialNumber()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.ProductSerialNumber target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.ProductSerialNumber)get_store().add_element_user(PRODUCTSERIALNUMBER$16);
                        return target;
                      }
                    }
                    
                    /**
                     * Unsets the "ProductSerialNumber" element
                     */
                    public void unsetProductSerialNumber()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(PRODUCTSERIALNUMBER$16, 0);
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEBITAMOUNT$18, 0);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetDebitAmount()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(DEBITAMOUNT$18, 0);
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
                        return get_store().count_elements(DEBITAMOUNT$18) != 0;
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEBITAMOUNT$18, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEBITAMOUNT$18);
                        }
                        target.setBigDecimalValue(debitAmount);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "DebitAmount" element
                     */
                    public void xsetDebitAmount(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType debitAmount)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(DEBITAMOUNT$18, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(DEBITAMOUNT$18);
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
                        get_store().remove_element(DEBITAMOUNT$18, 0);
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREDITAMOUNT$20, 0);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetCreditAmount()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(CREDITAMOUNT$20, 0);
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
                        return get_store().count_elements(CREDITAMOUNT$20) != 0;
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREDITAMOUNT$20, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREDITAMOUNT$20);
                        }
                        target.setBigDecimalValue(creditAmount);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "CreditAmount" element
                     */
                    public void xsetCreditAmount(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType creditAmount)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(CREDITAMOUNT$20, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(CREDITAMOUNT$20);
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
                        get_store().remove_element(CREDITAMOUNT$20, 0);
                      }
                    }
                    
                    /**
                     * Gets the "Tax" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.MovementTax getTax()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.MovementTax target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.MovementTax)get_store().find_element_user(TAX$22, 0);
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
                        return get_store().count_elements(TAX$22) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "Tax" element
                     */
                    public void setTax(x0401.oecdStandardAuditFileTaxPT1.MovementTax tax)
                    {
                      generatedSetterHelperImpl(tax, TAX$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "Tax" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.MovementTax addNewTax()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.MovementTax target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.MovementTax)get_store().add_element_user(TAX$22);
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
                        get_store().remove_element(TAX$22, 0);
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXEXEMPTIONREASON$24, 0);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionReason xgetTaxExemptionReason()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionReason target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionReason)get_store().find_element_user(TAXEXEMPTIONREASON$24, 0);
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
                        return get_store().count_elements(TAXEXEMPTIONREASON$24) != 0;
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXEXEMPTIONREASON$24, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXEXEMPTIONREASON$24);
                        }
                        target.setStringValue(taxExemptionReason);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TaxExemptionReason" element
                     */
                    public void xsetTaxExemptionReason(x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionReason taxExemptionReason)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionReason target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionReason)get_store().find_element_user(TAXEXEMPTIONREASON$24, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionReason)get_store().add_element_user(TAXEXEMPTIONREASON$24);
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
                        get_store().remove_element(TAXEXEMPTIONREASON$24, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TaxExemptionCode" element
                     */
                    public java.lang.String getTaxExemptionCode()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXEXEMPTIONCODE$26, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TaxExemptionCode" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionCode xgetTaxExemptionCode()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionCode target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionCode)get_store().find_element_user(TAXEXEMPTIONCODE$26, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TaxExemptionCode" element
                     */
                    public boolean isSetTaxExemptionCode()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TAXEXEMPTIONCODE$26) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TaxExemptionCode" element
                     */
                    public void setTaxExemptionCode(java.lang.String taxExemptionCode)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXEXEMPTIONCODE$26, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXEXEMPTIONCODE$26);
                        }
                        target.setStringValue(taxExemptionCode);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TaxExemptionCode" element
                     */
                    public void xsetTaxExemptionCode(x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionCode taxExemptionCode)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionCode target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionCode)get_store().find_element_user(TAXEXEMPTIONCODE$26, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionCode)get_store().add_element_user(TAXEXEMPTIONCODE$26);
                        }
                        target.set(taxExemptionCode);
                      }
                    }
                    
                    /**
                     * Unsets the "TaxExemptionCode" element
                     */
                    public void unsetTaxExemptionCode()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TAXEXEMPTIONCODE$26, 0);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetSettlementAmount()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(SETTLEMENTAMOUNT$28, 0);
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
                    public void xsetSettlementAmount(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType settlementAmount)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(SETTLEMENTAMOUNT$28, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(SETTLEMENTAMOUNT$28);
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
                    
                    /**
                     * Gets the "CustomsInformation" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.CustomsInformation getCustomsInformation()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.CustomsInformation target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.CustomsInformation)get_store().find_element_user(CUSTOMSINFORMATION$30, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "CustomsInformation" element
                     */
                    public boolean isSetCustomsInformation()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(CUSTOMSINFORMATION$30) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "CustomsInformation" element
                     */
                    public void setCustomsInformation(x0401.oecdStandardAuditFileTaxPT1.CustomsInformation customsInformation)
                    {
                      generatedSetterHelperImpl(customsInformation, CUSTOMSINFORMATION$30, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "CustomsInformation" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.CustomsInformation addNewCustomsInformation()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.CustomsInformation target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.CustomsInformation)get_store().add_element_user(CUSTOMSINFORMATION$30);
                        return target;
                      }
                    }
                    
                    /**
                     * Unsets the "CustomsInformation" element
                     */
                    public void unsetCustomsInformation()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(CUSTOMSINFORMATION$30, 0);
                      }
                    }
                }
                /**
                 * An XML DocumentTotals(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
                 *
                 * This is a complex type.
                 */
                public static class DocumentTotalsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.MovementOfGoods.StockMovement.DocumentTotals
                {
                    private static final long serialVersionUID = 1L;
                    
                    public DocumentTotalsImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName TAXPAYABLE$0 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TaxPayable");
                    private static final javax.xml.namespace.QName NETTOTAL$2 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "NetTotal");
                    private static final javax.xml.namespace.QName GROSSTOTAL$4 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "GrossTotal");
                    private static final javax.xml.namespace.QName CURRENCY$6 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Currency");
                    
                    
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetTaxPayable()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TAXPAYABLE$0, 0);
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
                    public void xsetTaxPayable(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType taxPayable)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TAXPAYABLE$0, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(TAXPAYABLE$0);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetNetTotal()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(NETTOTAL$2, 0);
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
                    public void xsetNetTotal(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType netTotal)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(NETTOTAL$2, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(NETTOTAL$2);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetGrossTotal()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(GROSSTOTAL$4, 0);
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
                    public void xsetGrossTotal(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType grossTotal)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(GROSSTOTAL$4, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(GROSSTOTAL$4);
                        }
                        target.set(grossTotal);
                      }
                    }
                    
                    /**
                     * Gets the "Currency" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.Currency getCurrency()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.Currency target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.Currency)get_store().find_element_user(CURRENCY$6, 0);
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
                    public void setCurrency(x0401.oecdStandardAuditFileTaxPT1.Currency currency)
                    {
                      generatedSetterHelperImpl(currency, CURRENCY$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "Currency" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.Currency addNewCurrency()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.Currency target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.Currency)get_store().add_element_user(CURRENCY$6);
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
                }
            }
        }
        /**
         * An XML WorkingDocuments(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
         *
         * This is a complex type.
         */
        public static class WorkingDocumentsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments
        {
            private static final long serialVersionUID = 1L;
            
            public WorkingDocumentsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NUMBEROFENTRIES$0 = 
                new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "NumberOfEntries");
            private static final javax.xml.namespace.QName TOTALDEBIT$2 = 
                new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TotalDebit");
            private static final javax.xml.namespace.QName TOTALCREDIT$4 = 
                new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TotalCredit");
            private static final javax.xml.namespace.QName WORKDOCUMENT$6 = 
                new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "WorkDocument");
            
            
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
            public org.apache.xmlbeans.XmlNonNegativeInteger xgetNumberOfEntries()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(NUMBEROFENTRIES$0, 0);
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
            public void xsetNumberOfEntries(org.apache.xmlbeans.XmlNonNegativeInteger numberOfEntries)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(NUMBEROFENTRIES$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(NUMBEROFENTRIES$0);
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
            public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetTotalDebit()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TOTALDEBIT$2, 0);
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
            public void xsetTotalDebit(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType totalDebit)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TOTALDEBIT$2, 0);
                    if (target == null)
                    {
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(TOTALDEBIT$2);
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
            public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetTotalCredit()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TOTALCREDIT$4, 0);
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
            public void xsetTotalCredit(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType totalCredit)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TOTALCREDIT$4, 0);
                    if (target == null)
                    {
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(TOTALCREDIT$4);
                    }
                    target.set(totalCredit);
                }
            }
            
            /**
             * Gets a List of "WorkDocument" elements
             */
            public java.util.List<x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument> getWorkDocumentList()
            {
                final class WorkDocumentList extends java.util.AbstractList<x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument>
                {
                    @Override
                    public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument get(int i)
                        { return WorkingDocumentsImpl.this.getWorkDocumentArray(i); }
                    
                    @Override
                    public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument set(int i, x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument o)
                    {
                      x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument old = WorkingDocumentsImpl.this.getWorkDocumentArray(i);
                      WorkingDocumentsImpl.this.setWorkDocumentArray(i, o);
                      return old;
                    }
                    
                    @Override
                    public void add(int i, x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument o)
                        { WorkingDocumentsImpl.this.insertNewWorkDocument(i).set(o); }
                    
                    @Override
                    public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument remove(int i)
                    {
                      x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument old = WorkingDocumentsImpl.this.getWorkDocumentArray(i);
                      WorkingDocumentsImpl.this.removeWorkDocument(i);
                      return old;
                    }
                    
                    @Override
                    public int size()
                        { return WorkingDocumentsImpl.this.sizeOfWorkDocumentArray(); }
                    
                }
                
                synchronized (monitor())
                {
                    check_orphaned();
                    return new WorkDocumentList();
                }
            }
            
            /**
             * Gets array of all "WorkDocument" elements
             * @deprecated
             */
            @Deprecated
            public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument[] getWorkDocumentArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List<x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument> targetList = new java.util.ArrayList<x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument>();
                    get_store().find_all_element_users(WORKDOCUMENT$6, targetList);
                    x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument[] result = new x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "WorkDocument" element
             */
            public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument getWorkDocumentArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument)get_store().find_element_user(WORKDOCUMENT$6, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "WorkDocument" element
             */
            public int sizeOfWorkDocumentArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(WORKDOCUMENT$6);
                }
            }
            
            /**
             * Sets array of all "WorkDocument" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setWorkDocumentArray(x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument[] workDocumentArray)
            {
                check_orphaned();
                arraySetterHelper(workDocumentArray, WORKDOCUMENT$6);
            }
            
            /**
             * Sets ith "WorkDocument" element
             */
            public void setWorkDocumentArray(int i, x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument workDocument)
            {
                generatedSetterHelperImpl(workDocument, WORKDOCUMENT$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "WorkDocument" element
             */
            public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument insertNewWorkDocument(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument)get_store().insert_element_user(WORKDOCUMENT$6, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "WorkDocument" element
             */
            public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument addNewWorkDocument()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument)get_store().add_element_user(WORKDOCUMENT$6);
                    return target;
                }
            }
            
            /**
             * Removes the ith "WorkDocument" element
             */
            public void removeWorkDocument(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(WORKDOCUMENT$6, i);
                }
            }
            /**
             * An XML WorkDocument(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
             *
             * This is a complex type.
             */
            public static class WorkDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument
            {
                private static final long serialVersionUID = 1L;
                
                public WorkDocumentImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName DOCUMENTNUMBER$0 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "DocumentNumber");
                private static final javax.xml.namespace.QName ATCUD$2 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "ATCUD");
                private static final javax.xml.namespace.QName DOCUMENTSTATUS$4 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "DocumentStatus");
                private static final javax.xml.namespace.QName HASH$6 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Hash");
                private static final javax.xml.namespace.QName HASHCONTROL$8 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "HashControl");
                private static final javax.xml.namespace.QName PERIOD$10 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Period");
                private static final javax.xml.namespace.QName WORKDATE$12 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "WorkDate");
                private static final javax.xml.namespace.QName WORKTYPE$14 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "WorkType");
                private static final javax.xml.namespace.QName SOURCEID$16 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "SourceID");
                private static final javax.xml.namespace.QName EACCODE$18 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "EACCode");
                private static final javax.xml.namespace.QName SYSTEMENTRYDATE$20 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "SystemEntryDate");
                private static final javax.xml.namespace.QName TRANSACTIONID$22 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TransactionID");
                private static final javax.xml.namespace.QName CUSTOMERID$24 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "CustomerID");
                private static final javax.xml.namespace.QName LINE$26 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Line");
                private static final javax.xml.namespace.QName DOCUMENTTOTALS$28 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "DocumentTotals");
                
                
                /**
                 * Gets the "DocumentNumber" element
                 */
                public java.lang.String getDocumentNumber()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTNUMBER$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "DocumentNumber" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.DocumentNumberDocument.DocumentNumber xgetDocumentNumber()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.DocumentNumberDocument.DocumentNumber target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.DocumentNumberDocument.DocumentNumber)get_store().find_element_user(DOCUMENTNUMBER$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "DocumentNumber" element
                 */
                public void setDocumentNumber(java.lang.String documentNumber)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTNUMBER$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCUMENTNUMBER$0);
                      }
                      target.setStringValue(documentNumber);
                    }
                }
                
                /**
                 * Sets (as xml) the "DocumentNumber" element
                 */
                public void xsetDocumentNumber(x0401.oecdStandardAuditFileTaxPT1.DocumentNumberDocument.DocumentNumber documentNumber)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.DocumentNumberDocument.DocumentNumber target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.DocumentNumberDocument.DocumentNumber)get_store().find_element_user(DOCUMENTNUMBER$0, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.DocumentNumberDocument.DocumentNumber)get_store().add_element_user(DOCUMENTNUMBER$0);
                      }
                      target.set(documentNumber);
                    }
                }
                
                /**
                 * Gets the "ATCUD" element
                 */
                public java.lang.String getATCUD()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATCUD$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "ATCUD" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car xgetATCUD()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car)get_store().find_element_user(ATCUD$2, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "ATCUD" element
                 */
                public void setATCUD(java.lang.String atcud)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATCUD$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATCUD$2);
                      }
                      target.setStringValue(atcud);
                    }
                }
                
                /**
                 * Sets (as xml) the "ATCUD" element
                 */
                public void xsetATCUD(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car atcud)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car)get_store().find_element_user(ATCUD$2, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car)get_store().add_element_user(ATCUD$2);
                      }
                      target.set(atcud);
                    }
                }
                
                /**
                 * Gets the "DocumentStatus" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.DocumentStatus getDocumentStatus()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.DocumentStatus target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.DocumentStatus)get_store().find_element_user(DOCUMENTSTATUS$4, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "DocumentStatus" element
                 */
                public void setDocumentStatus(x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.DocumentStatus documentStatus)
                {
                    generatedSetterHelperImpl(documentStatus, DOCUMENTSTATUS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                }
                
                /**
                 * Appends and returns a new empty "DocumentStatus" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.DocumentStatus addNewDocumentStatus()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.DocumentStatus target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.DocumentStatus)get_store().add_element_user(DOCUMENTSTATUS$4);
                      return target;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASH$6, 0);
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
                public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax172Car xgetHash()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax172Car target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax172Car)get_store().find_element_user(HASH$6, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASH$6, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASH$6);
                      }
                      target.setStringValue(hash);
                    }
                }
                
                /**
                 * Sets (as xml) the "Hash" element
                 */
                public void xsetHash(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax172Car hash)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax172Car target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax172Car)get_store().find_element_user(HASH$6, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax172Car)get_store().add_element_user(HASH$6);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASHCONTROL$8, 0);
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
                public x0401.oecdStandardAuditFileTaxPT1.SAFPTHashControl xgetHashControl()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTHashControl target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTHashControl)get_store().find_element_user(HASHCONTROL$8, 0);
                      return target;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASHCONTROL$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASHCONTROL$8);
                      }
                      target.setStringValue(hashControl);
                    }
                }
                
                /**
                 * Sets (as xml) the "HashControl" element
                 */
                public void xsetHashControl(x0401.oecdStandardAuditFileTaxPT1.SAFPTHashControl hashControl)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTHashControl target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTHashControl)get_store().find_element_user(HASHCONTROL$8, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTHashControl)get_store().add_element_user(HASHCONTROL$8);
                      }
                      target.set(hashControl);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIOD$10, 0);
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
                public x0401.oecdStandardAuditFileTaxPT1.PeriodDocument.Period xgetPeriod()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.PeriodDocument.Period target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.PeriodDocument.Period)get_store().find_element_user(PERIOD$10, 0);
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
                      return get_store().count_elements(PERIOD$10) != 0;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIOD$10, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERIOD$10);
                      }
                      target.setIntValue(period);
                    }
                }
                
                /**
                 * Sets (as xml) the "Period" element
                 */
                public void xsetPeriod(x0401.oecdStandardAuditFileTaxPT1.PeriodDocument.Period period)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.PeriodDocument.Period target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.PeriodDocument.Period)get_store().find_element_user(PERIOD$10, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.PeriodDocument.Period)get_store().add_element_user(PERIOD$10);
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
                      get_store().remove_element(PERIOD$10, 0);
                    }
                }
                
                /**
                 * Gets the "WorkDate" element
                 */
                public java.util.Calendar getWorkDate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKDATE$12, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getCalendarValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "WorkDate" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SAFdateType xgetWorkDate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(WORKDATE$12, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "WorkDate" element
                 */
                public void setWorkDate(java.util.Calendar workDate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKDATE$12, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKDATE$12);
                      }
                      target.setCalendarValue(workDate);
                    }
                }
                
                /**
                 * Sets (as xml) the "WorkDate" element
                 */
                public void xsetWorkDate(x0401.oecdStandardAuditFileTaxPT1.SAFdateType workDate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(WORKDATE$12, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().add_element_user(WORKDATE$12);
                      }
                      target.set(workDate);
                    }
                }
                
                /**
                 * Gets the "WorkType" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.WorkTypeDocument.WorkType.Enum getWorkType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKTYPE$14, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return (x0401.oecdStandardAuditFileTaxPT1.WorkTypeDocument.WorkType.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "WorkType" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.WorkTypeDocument.WorkType xgetWorkType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.WorkTypeDocument.WorkType target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.WorkTypeDocument.WorkType)get_store().find_element_user(WORKTYPE$14, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "WorkType" element
                 */
                public void setWorkType(x0401.oecdStandardAuditFileTaxPT1.WorkTypeDocument.WorkType.Enum workType)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKTYPE$14, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKTYPE$14);
                      }
                      target.setEnumValue(workType);
                    }
                }
                
                /**
                 * Sets (as xml) the "WorkType" element
                 */
                public void xsetWorkType(x0401.oecdStandardAuditFileTaxPT1.WorkTypeDocument.WorkType workType)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.WorkTypeDocument.WorkType target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.WorkTypeDocument.WorkType)get_store().find_element_user(WORKTYPE$14, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.WorkTypeDocument.WorkType)get_store().add_element_user(WORKTYPE$14);
                      }
                      target.set(workType);
                    }
                }
                
                /**
                 * Gets the "SourceID" element
                 */
                public java.lang.String getSourceID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEID$16, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "SourceID" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetSourceID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(SOURCEID$16, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "SourceID" element
                 */
                public void setSourceID(java.lang.String sourceID)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEID$16, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEID$16);
                      }
                      target.setStringValue(sourceID);
                    }
                }
                
                /**
                 * Sets (as xml) the "SourceID" element
                 */
                public void xsetSourceID(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car sourceID)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(SOURCEID$16, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().add_element_user(SOURCEID$16);
                      }
                      target.set(sourceID);
                    }
                }
                
                /**
                 * Gets the "EACCode" element
                 */
                public java.lang.String getEACCode()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EACCODE$18, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "EACCode" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.EACCodeDocument.EACCode xgetEACCode()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.EACCodeDocument.EACCode target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.EACCodeDocument.EACCode)get_store().find_element_user(EACCODE$18, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "EACCode" element
                 */
                public boolean isSetEACCode()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(EACCODE$18) != 0;
                    }
                }
                
                /**
                 * Sets the "EACCode" element
                 */
                public void setEACCode(java.lang.String eacCode)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EACCODE$18, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EACCODE$18);
                      }
                      target.setStringValue(eacCode);
                    }
                }
                
                /**
                 * Sets (as xml) the "EACCode" element
                 */
                public void xsetEACCode(x0401.oecdStandardAuditFileTaxPT1.EACCodeDocument.EACCode eacCode)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.EACCodeDocument.EACCode target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.EACCodeDocument.EACCode)get_store().find_element_user(EACCODE$18, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.EACCodeDocument.EACCode)get_store().add_element_user(EACCODE$18);
                      }
                      target.set(eacCode);
                    }
                }
                
                /**
                 * Unsets the "EACCode" element
                 */
                public void unsetEACCode()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(EACCODE$18, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSTEMENTRYDATE$20, 0);
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
                public x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType xgetSystemEntryDate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(SYSTEMENTRYDATE$20, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSTEMENTRYDATE$20, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SYSTEMENTRYDATE$20);
                      }
                      target.setCalendarValue(systemEntryDate);
                    }
                }
                
                /**
                 * Sets (as xml) the "SystemEntryDate" element
                 */
                public void xsetSystemEntryDate(x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType systemEntryDate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(SYSTEMENTRYDATE$20, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().add_element_user(SYSTEMENTRYDATE$20);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONID$22, 0);
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
                public x0401.oecdStandardAuditFileTaxPT1.SAFPTTransactionID xgetTransactionID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTTransactionID target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTTransactionID)get_store().find_element_user(TRANSACTIONID$22, 0);
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
                      return get_store().count_elements(TRANSACTIONID$22) != 0;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONID$22, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSACTIONID$22);
                      }
                      target.setStringValue(transactionID);
                    }
                }
                
                /**
                 * Sets (as xml) the "TransactionID" element
                 */
                public void xsetTransactionID(x0401.oecdStandardAuditFileTaxPT1.SAFPTTransactionID transactionID)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTTransactionID target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTTransactionID)get_store().find_element_user(TRANSACTIONID$22, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTTransactionID)get_store().add_element_user(TRANSACTIONID$22);
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
                      get_store().remove_element(TRANSACTIONID$22, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERID$24, 0);
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
                public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetCustomerID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(CUSTOMERID$24, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERID$24, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTOMERID$24);
                      }
                      target.setStringValue(customerID);
                    }
                }
                
                /**
                 * Sets (as xml) the "CustomerID" element
                 */
                public void xsetCustomerID(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car customerID)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(CUSTOMERID$24, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().add_element_user(CUSTOMERID$24);
                      }
                      target.set(customerID);
                    }
                }
                
                /**
                 * Gets a List of "Line" elements
                 */
                public java.util.List<x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.Line> getLineList()
                {
                    final class LineList extends java.util.AbstractList<x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.Line>
                    {
                      @Override
                      public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.Line get(int i)
                          { return WorkDocumentImpl.this.getLineArray(i); }
                      
                      @Override
                      public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.Line set(int i, x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.Line o)
                      {
                        x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.Line old = WorkDocumentImpl.this.getLineArray(i);
                        WorkDocumentImpl.this.setLineArray(i, o);
                        return old;
                      }
                      
                      @Override
                      public void add(int i, x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.Line o)
                          { WorkDocumentImpl.this.insertNewLine(i).set(o); }
                      
                      @Override
                      public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.Line remove(int i)
                      {
                        x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.Line old = WorkDocumentImpl.this.getLineArray(i);
                        WorkDocumentImpl.this.removeLine(i);
                        return old;
                      }
                      
                      @Override
                      public int size()
                          { return WorkDocumentImpl.this.sizeOfLineArray(); }
                      
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
                public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.Line[] getLineArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List<x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.Line> targetList = new java.util.ArrayList<x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.Line>();
                      get_store().find_all_element_users(LINE$26, targetList);
                      x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.Line[] result = new x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.Line[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "Line" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.Line getLineArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.Line target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.Line)get_store().find_element_user(LINE$26, i);
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
                public void setLineArray(x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.Line[] lineArray)
                {
                    check_orphaned();
                    arraySetterHelper(lineArray, LINE$26);
                }
                
                /**
                 * Sets ith "Line" element
                 */
                public void setLineArray(int i, x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.Line line)
                {
                    generatedSetterHelperImpl(line, LINE$26, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "Line" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.Line insertNewLine(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.Line target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.Line)get_store().insert_element_user(LINE$26, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "Line" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.Line addNewLine()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.Line target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.Line)get_store().add_element_user(LINE$26);
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
                public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.DocumentTotals getDocumentTotals()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.DocumentTotals target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.DocumentTotals)get_store().find_element_user(DOCUMENTTOTALS$28, 0);
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
                public void setDocumentTotals(x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.DocumentTotals documentTotals)
                {
                    generatedSetterHelperImpl(documentTotals, DOCUMENTTOTALS$28, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                }
                
                /**
                 * Appends and returns a new empty "DocumentTotals" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.DocumentTotals addNewDocumentTotals()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.DocumentTotals target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.DocumentTotals)get_store().add_element_user(DOCUMENTTOTALS$28);
                      return target;
                    }
                }
                /**
                 * An XML DocumentStatus(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
                 *
                 * This is a complex type.
                 */
                public static class DocumentStatusImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.DocumentStatus
                {
                    private static final long serialVersionUID = 1L;
                    
                    public DocumentStatusImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName WORKSTATUS$0 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "WorkStatus");
                    private static final javax.xml.namespace.QName WORKSTATUSDATE$2 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "WorkStatusDate");
                    private static final javax.xml.namespace.QName REASON$4 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Reason");
                    private static final javax.xml.namespace.QName SOURCEID$6 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "SourceID");
                    private static final javax.xml.namespace.QName SOURCEBILLING$8 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "SourceBilling");
                    
                    
                    /**
                     * Gets the "WorkStatus" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.WorkStatusDocument.WorkStatus.Enum getWorkStatus()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKSTATUS$0, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return (x0401.oecdStandardAuditFileTaxPT1.WorkStatusDocument.WorkStatus.Enum)target.getEnumValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "WorkStatus" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.WorkStatusDocument.WorkStatus xgetWorkStatus()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.WorkStatusDocument.WorkStatus target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.WorkStatusDocument.WorkStatus)get_store().find_element_user(WORKSTATUS$0, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "WorkStatus" element
                     */
                    public void setWorkStatus(x0401.oecdStandardAuditFileTaxPT1.WorkStatusDocument.WorkStatus.Enum workStatus)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKSTATUS$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKSTATUS$0);
                        }
                        target.setEnumValue(workStatus);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "WorkStatus" element
                     */
                    public void xsetWorkStatus(x0401.oecdStandardAuditFileTaxPT1.WorkStatusDocument.WorkStatus workStatus)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.WorkStatusDocument.WorkStatus target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.WorkStatusDocument.WorkStatus)get_store().find_element_user(WORKSTATUS$0, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.WorkStatusDocument.WorkStatus)get_store().add_element_user(WORKSTATUS$0);
                        }
                        target.set(workStatus);
                      }
                    }
                    
                    /**
                     * Gets the "WorkStatusDate" element
                     */
                    public java.util.Calendar getWorkStatusDate()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKSTATUSDATE$2, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getCalendarValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "WorkStatusDate" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType xgetWorkStatusDate()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(WORKSTATUSDATE$2, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "WorkStatusDate" element
                     */
                    public void setWorkStatusDate(java.util.Calendar workStatusDate)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKSTATUSDATE$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKSTATUSDATE$2);
                        }
                        target.setCalendarValue(workStatusDate);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "WorkStatusDate" element
                     */
                    public void xsetWorkStatusDate(x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType workStatusDate)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(WORKSTATUSDATE$2, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().add_element_user(WORKSTATUSDATE$2);
                        }
                        target.set(workStatusDate);
                      }
                    }
                    
                    /**
                     * Gets the "Reason" element
                     */
                    public java.lang.String getReason()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASON$4, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "Reason" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car xgetReason()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().find_element_user(REASON$4, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "Reason" element
                     */
                    public boolean isSetReason()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(REASON$4) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "Reason" element
                     */
                    public void setReason(java.lang.String reason)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASON$4, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REASON$4);
                        }
                        target.setStringValue(reason);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "Reason" element
                     */
                    public void xsetReason(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car reason)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().find_element_user(REASON$4, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().add_element_user(REASON$4);
                        }
                        target.set(reason);
                      }
                    }
                    
                    /**
                     * Unsets the "Reason" element
                     */
                    public void unsetReason()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(REASON$4, 0);
                      }
                    }
                    
                    /**
                     * Gets the "SourceID" element
                     */
                    public java.lang.String getSourceID()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEID$6, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "SourceID" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetSourceID()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(SOURCEID$6, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "SourceID" element
                     */
                    public void setSourceID(java.lang.String sourceID)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEID$6, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEID$6);
                        }
                        target.setStringValue(sourceID);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "SourceID" element
                     */
                    public void xsetSourceID(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car sourceID)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(SOURCEID$6, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().add_element_user(SOURCEID$6);
                        }
                        target.set(sourceID);
                      }
                    }
                    
                    /**
                     * Gets the "SourceBilling" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling.Enum getSourceBilling()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEBILLING$8, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return (x0401.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling.Enum)target.getEnumValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "SourceBilling" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling xgetSourceBilling()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling)get_store().find_element_user(SOURCEBILLING$8, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "SourceBilling" element
                     */
                    public void setSourceBilling(x0401.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling.Enum sourceBilling)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEBILLING$8, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEBILLING$8);
                        }
                        target.setEnumValue(sourceBilling);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "SourceBilling" element
                     */
                    public void xsetSourceBilling(x0401.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling sourceBilling)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling)get_store().find_element_user(SOURCEBILLING$8, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFTPTSourceBilling)get_store().add_element_user(SOURCEBILLING$8);
                        }
                        target.set(sourceBilling);
                      }
                    }
                }
                /**
                 * An XML Line(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
                 *
                 * This is a complex type.
                 */
                public static class LineImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.Line
                {
                    private static final long serialVersionUID = 1L;
                    
                    public LineImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName LINENUMBER$0 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "LineNumber");
                    private static final javax.xml.namespace.QName ORDERREFERENCES$2 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "OrderReferences");
                    private static final javax.xml.namespace.QName PRODUCTCODE$4 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "ProductCode");
                    private static final javax.xml.namespace.QName PRODUCTDESCRIPTION$6 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "ProductDescription");
                    private static final javax.xml.namespace.QName QUANTITY$8 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Quantity");
                    private static final javax.xml.namespace.QName UNITOFMEASURE$10 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "UnitOfMeasure");
                    private static final javax.xml.namespace.QName UNITPRICE$12 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "UnitPrice");
                    private static final javax.xml.namespace.QName TAXBASE$14 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TaxBase");
                    private static final javax.xml.namespace.QName TAXPOINTDATE$16 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TaxPointDate");
                    private static final javax.xml.namespace.QName REFERENCES$18 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "References");
                    private static final javax.xml.namespace.QName DESCRIPTION$20 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Description");
                    private static final javax.xml.namespace.QName PRODUCTSERIALNUMBER$22 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "ProductSerialNumber");
                    private static final javax.xml.namespace.QName DEBITAMOUNT$24 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "DebitAmount");
                    private static final javax.xml.namespace.QName CREDITAMOUNT$26 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "CreditAmount");
                    private static final javax.xml.namespace.QName TAX$28 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Tax");
                    private static final javax.xml.namespace.QName TAXEXEMPTIONREASON$30 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TaxExemptionReason");
                    private static final javax.xml.namespace.QName TAXEXEMPTIONCODE$32 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TaxExemptionCode");
                    private static final javax.xml.namespace.QName SETTLEMENTAMOUNT$34 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "SettlementAmount");
                    private static final javax.xml.namespace.QName CUSTOMSINFORMATION$36 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "CustomsInformation");
                    
                    
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
                    public org.apache.xmlbeans.XmlNonNegativeInteger xgetLineNumber()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                        target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(LINENUMBER$0, 0);
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
                    public void xsetLineNumber(org.apache.xmlbeans.XmlNonNegativeInteger lineNumber)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                        target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(LINENUMBER$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(LINENUMBER$0);
                        }
                        target.set(lineNumber);
                      }
                    }
                    
                    /**
                     * Gets a List of "OrderReferences" elements
                     */
                    public java.util.List<x0401.oecdStandardAuditFileTaxPT1.OrderReferences> getOrderReferencesList()
                    {
                      final class OrderReferencesList extends java.util.AbstractList<x0401.oecdStandardAuditFileTaxPT1.OrderReferences>
                      {
                        @Override
                        public x0401.oecdStandardAuditFileTaxPT1.OrderReferences get(int i)
                            { return LineImpl.this.getOrderReferencesArray(i); }
                        
                        @Override
                        public x0401.oecdStandardAuditFileTaxPT1.OrderReferences set(int i, x0401.oecdStandardAuditFileTaxPT1.OrderReferences o)
                        {
                          x0401.oecdStandardAuditFileTaxPT1.OrderReferences old = LineImpl.this.getOrderReferencesArray(i);
                          LineImpl.this.setOrderReferencesArray(i, o);
                          return old;
                        }
                        
                        @Override
                        public void add(int i, x0401.oecdStandardAuditFileTaxPT1.OrderReferences o)
                            { LineImpl.this.insertNewOrderReferences(i).set(o); }
                        
                        @Override
                        public x0401.oecdStandardAuditFileTaxPT1.OrderReferences remove(int i)
                        {
                          x0401.oecdStandardAuditFileTaxPT1.OrderReferences old = LineImpl.this.getOrderReferencesArray(i);
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
                    public x0401.oecdStandardAuditFileTaxPT1.OrderReferences[] getOrderReferencesArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        java.util.List<x0401.oecdStandardAuditFileTaxPT1.OrderReferences> targetList = new java.util.ArrayList<x0401.oecdStandardAuditFileTaxPT1.OrderReferences>();
                        get_store().find_all_element_users(ORDERREFERENCES$2, targetList);
                        x0401.oecdStandardAuditFileTaxPT1.OrderReferences[] result = new x0401.oecdStandardAuditFileTaxPT1.OrderReferences[targetList.size()];
                        targetList.toArray(result);
                        return result;
                      }
                    }
                    
                    /**
                     * Gets ith "OrderReferences" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.OrderReferences getOrderReferencesArray(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.OrderReferences target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.OrderReferences)get_store().find_element_user(ORDERREFERENCES$2, i);
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
                    public void setOrderReferencesArray(x0401.oecdStandardAuditFileTaxPT1.OrderReferences[] orderReferencesArray)
                    {
                      check_orphaned();
                      arraySetterHelper(orderReferencesArray, ORDERREFERENCES$2);
                    }
                    
                    /**
                     * Sets ith "OrderReferences" element
                     */
                    public void setOrderReferencesArray(int i, x0401.oecdStandardAuditFileTaxPT1.OrderReferences orderReferences)
                    {
                      generatedSetterHelperImpl(orderReferences, ORDERREFERENCES$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
                    }
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "OrderReferences" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.OrderReferences insertNewOrderReferences(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.OrderReferences target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.OrderReferences)get_store().insert_element_user(ORDERREFERENCES$2, i);
                        return target;
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "OrderReferences" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.OrderReferences addNewOrderReferences()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.OrderReferences target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.OrderReferences)get_store().add_element_user(ORDERREFERENCES$2);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car xgetProductCode()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(PRODUCTCODE$4, 0);
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
                    public void xsetProductCode(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car productCode)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(PRODUCTCODE$4, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().add_element_user(PRODUCTCODE$4);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFPTProductDescription xgetProductDescription()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTProductDescription target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTProductDescription)get_store().find_element_user(PRODUCTDESCRIPTION$6, 0);
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
                    public void xsetProductDescription(x0401.oecdStandardAuditFileTaxPT1.SAFPTProductDescription productDescription)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTProductDescription target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTProductDescription)get_store().find_element_user(PRODUCTDESCRIPTION$6, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTProductDescription)get_store().add_element_user(PRODUCTDESCRIPTION$6);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType xgetQuantity()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType)get_store().find_element_user(QUANTITY$8, 0);
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
                    public void xsetQuantity(x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType quantity)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType)get_store().find_element_user(QUANTITY$8, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType)get_store().add_element_user(QUANTITY$8);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car xgetUnitOfMeasure()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().find_element_user(UNITOFMEASURE$10, 0);
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
                    public void xsetUnitOfMeasure(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car unitOfMeasure)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().find_element_user(UNITOFMEASURE$10, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().add_element_user(UNITOFMEASURE$10);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetUnitPrice()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(UNITPRICE$12, 0);
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
                    public void xsetUnitPrice(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType unitPrice)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(UNITPRICE$12, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(UNITPRICE$12);
                        }
                        target.set(unitPrice);
                      }
                    }
                    
                    /**
                     * Gets the "TaxBase" element
                     */
                    public java.math.BigDecimal getTaxBase()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXBASE$14, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getBigDecimalValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TaxBase" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetTaxBase()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TAXBASE$14, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TaxBase" element
                     */
                    public boolean isSetTaxBase()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TAXBASE$14) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TaxBase" element
                     */
                    public void setTaxBase(java.math.BigDecimal taxBase)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXBASE$14, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXBASE$14);
                        }
                        target.setBigDecimalValue(taxBase);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TaxBase" element
                     */
                    public void xsetTaxBase(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType taxBase)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TAXBASE$14, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(TAXBASE$14);
                        }
                        target.set(taxBase);
                      }
                    }
                    
                    /**
                     * Unsets the "TaxBase" element
                     */
                    public void unsetTaxBase()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TAXBASE$14, 0);
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXPOINTDATE$16, 0);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFdateType xgetTaxPointDate()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(TAXPOINTDATE$16, 0);
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXPOINTDATE$16, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXPOINTDATE$16);
                        }
                        target.setCalendarValue(taxPointDate);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TaxPointDate" element
                     */
                    public void xsetTaxPointDate(x0401.oecdStandardAuditFileTaxPT1.SAFdateType taxPointDate)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(TAXPOINTDATE$16, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().add_element_user(TAXPOINTDATE$16);
                        }
                        target.set(taxPointDate);
                      }
                    }
                    
                    /**
                     * Gets a List of "References" elements
                     */
                    public java.util.List<x0401.oecdStandardAuditFileTaxPT1.References> getReferencesList()
                    {
                      final class ReferencesList extends java.util.AbstractList<x0401.oecdStandardAuditFileTaxPT1.References>
                      {
                        @Override
                        public x0401.oecdStandardAuditFileTaxPT1.References get(int i)
                            { return LineImpl.this.getReferencesArray(i); }
                        
                        @Override
                        public x0401.oecdStandardAuditFileTaxPT1.References set(int i, x0401.oecdStandardAuditFileTaxPT1.References o)
                        {
                          x0401.oecdStandardAuditFileTaxPT1.References old = LineImpl.this.getReferencesArray(i);
                          LineImpl.this.setReferencesArray(i, o);
                          return old;
                        }
                        
                        @Override
                        public void add(int i, x0401.oecdStandardAuditFileTaxPT1.References o)
                            { LineImpl.this.insertNewReferences(i).set(o); }
                        
                        @Override
                        public x0401.oecdStandardAuditFileTaxPT1.References remove(int i)
                        {
                          x0401.oecdStandardAuditFileTaxPT1.References old = LineImpl.this.getReferencesArray(i);
                          LineImpl.this.removeReferences(i);
                          return old;
                        }
                        
                        @Override
                        public int size()
                            { return LineImpl.this.sizeOfReferencesArray(); }
                        
                      }
                      
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return new ReferencesList();
                      }
                    }
                    
                    /**
                     * Gets array of all "References" elements
                     * @deprecated
                     */
                    @Deprecated
                    public x0401.oecdStandardAuditFileTaxPT1.References[] getReferencesArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        java.util.List<x0401.oecdStandardAuditFileTaxPT1.References> targetList = new java.util.ArrayList<x0401.oecdStandardAuditFileTaxPT1.References>();
                        get_store().find_all_element_users(REFERENCES$18, targetList);
                        x0401.oecdStandardAuditFileTaxPT1.References[] result = new x0401.oecdStandardAuditFileTaxPT1.References[targetList.size()];
                        targetList.toArray(result);
                        return result;
                      }
                    }
                    
                    /**
                     * Gets ith "References" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.References getReferencesArray(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.References target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.References)get_store().find_element_user(REFERENCES$18, i);
                        if (target == null)
                        {
                          throw new IndexOutOfBoundsException();
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Returns number of "References" element
                     */
                    public int sizeOfReferencesArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(REFERENCES$18);
                      }
                    }
                    
                    /**
                     * Sets array of all "References" element  WARNING: This method is not atomicaly synchronized.
                     */
                    public void setReferencesArray(x0401.oecdStandardAuditFileTaxPT1.References[] referencesArray)
                    {
                      check_orphaned();
                      arraySetterHelper(referencesArray, REFERENCES$18);
                    }
                    
                    /**
                     * Sets ith "References" element
                     */
                    public void setReferencesArray(int i, x0401.oecdStandardAuditFileTaxPT1.References references)
                    {
                      generatedSetterHelperImpl(references, REFERENCES$18, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
                    }
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "References" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.References insertNewReferences(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.References target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.References)get_store().insert_element_user(REFERENCES$18, i);
                        return target;
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "References" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.References addNewReferences()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.References target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.References)get_store().add_element_user(REFERENCES$18);
                        return target;
                      }
                    }
                    
                    /**
                     * Removes the ith "References" element
                     */
                    public void removeReferences(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(REFERENCES$18, i);
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$20, 0);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car xgetDescription()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car)get_store().find_element_user(DESCRIPTION$20, 0);
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$20, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$20);
                        }
                        target.setStringValue(description);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "Description" element
                     */
                    public void xsetDescription(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car description)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car)get_store().find_element_user(DESCRIPTION$20, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car)get_store().add_element_user(DESCRIPTION$20);
                        }
                        target.set(description);
                      }
                    }
                    
                    /**
                     * Gets the "ProductSerialNumber" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.ProductSerialNumber getProductSerialNumber()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.ProductSerialNumber target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.ProductSerialNumber)get_store().find_element_user(PRODUCTSERIALNUMBER$22, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "ProductSerialNumber" element
                     */
                    public boolean isSetProductSerialNumber()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(PRODUCTSERIALNUMBER$22) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "ProductSerialNumber" element
                     */
                    public void setProductSerialNumber(x0401.oecdStandardAuditFileTaxPT1.ProductSerialNumber productSerialNumber)
                    {
                      generatedSetterHelperImpl(productSerialNumber, PRODUCTSERIALNUMBER$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "ProductSerialNumber" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.ProductSerialNumber addNewProductSerialNumber()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.ProductSerialNumber target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.ProductSerialNumber)get_store().add_element_user(PRODUCTSERIALNUMBER$22);
                        return target;
                      }
                    }
                    
                    /**
                     * Unsets the "ProductSerialNumber" element
                     */
                    public void unsetProductSerialNumber()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(PRODUCTSERIALNUMBER$22, 0);
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEBITAMOUNT$24, 0);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetDebitAmount()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(DEBITAMOUNT$24, 0);
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
                        return get_store().count_elements(DEBITAMOUNT$24) != 0;
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEBITAMOUNT$24, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEBITAMOUNT$24);
                        }
                        target.setBigDecimalValue(debitAmount);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "DebitAmount" element
                     */
                    public void xsetDebitAmount(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType debitAmount)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(DEBITAMOUNT$24, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(DEBITAMOUNT$24);
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
                        get_store().remove_element(DEBITAMOUNT$24, 0);
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREDITAMOUNT$26, 0);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetCreditAmount()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(CREDITAMOUNT$26, 0);
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
                        return get_store().count_elements(CREDITAMOUNT$26) != 0;
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREDITAMOUNT$26, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREDITAMOUNT$26);
                        }
                        target.setBigDecimalValue(creditAmount);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "CreditAmount" element
                     */
                    public void xsetCreditAmount(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType creditAmount)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(CREDITAMOUNT$26, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(CREDITAMOUNT$26);
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
                        get_store().remove_element(CREDITAMOUNT$26, 0);
                      }
                    }
                    
                    /**
                     * Gets the "Tax" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.Tax getTax()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.Tax target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.Tax)get_store().find_element_user(TAX$28, 0);
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
                        return get_store().count_elements(TAX$28) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "Tax" element
                     */
                    public void setTax(x0401.oecdStandardAuditFileTaxPT1.Tax tax)
                    {
                      generatedSetterHelperImpl(tax, TAX$28, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "Tax" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.Tax addNewTax()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.Tax target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.Tax)get_store().add_element_user(TAX$28);
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
                        get_store().remove_element(TAX$28, 0);
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXEXEMPTIONREASON$30, 0);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionReason xgetTaxExemptionReason()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionReason target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionReason)get_store().find_element_user(TAXEXEMPTIONREASON$30, 0);
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
                        return get_store().count_elements(TAXEXEMPTIONREASON$30) != 0;
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXEXEMPTIONREASON$30, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXEXEMPTIONREASON$30);
                        }
                        target.setStringValue(taxExemptionReason);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TaxExemptionReason" element
                     */
                    public void xsetTaxExemptionReason(x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionReason taxExemptionReason)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionReason target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionReason)get_store().find_element_user(TAXEXEMPTIONREASON$30, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionReason)get_store().add_element_user(TAXEXEMPTIONREASON$30);
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
                        get_store().remove_element(TAXEXEMPTIONREASON$30, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TaxExemptionCode" element
                     */
                    public java.lang.String getTaxExemptionCode()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXEXEMPTIONCODE$32, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TaxExemptionCode" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionCode xgetTaxExemptionCode()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionCode target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionCode)get_store().find_element_user(TAXEXEMPTIONCODE$32, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TaxExemptionCode" element
                     */
                    public boolean isSetTaxExemptionCode()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TAXEXEMPTIONCODE$32) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TaxExemptionCode" element
                     */
                    public void setTaxExemptionCode(java.lang.String taxExemptionCode)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXEXEMPTIONCODE$32, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXEXEMPTIONCODE$32);
                        }
                        target.setStringValue(taxExemptionCode);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TaxExemptionCode" element
                     */
                    public void xsetTaxExemptionCode(x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionCode taxExemptionCode)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionCode target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionCode)get_store().find_element_user(TAXEXEMPTIONCODE$32, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionCode)get_store().add_element_user(TAXEXEMPTIONCODE$32);
                        }
                        target.set(taxExemptionCode);
                      }
                    }
                    
                    /**
                     * Unsets the "TaxExemptionCode" element
                     */
                    public void unsetTaxExemptionCode()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TAXEXEMPTIONCODE$32, 0);
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SETTLEMENTAMOUNT$34, 0);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetSettlementAmount()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(SETTLEMENTAMOUNT$34, 0);
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
                        return get_store().count_elements(SETTLEMENTAMOUNT$34) != 0;
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SETTLEMENTAMOUNT$34, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SETTLEMENTAMOUNT$34);
                        }
                        target.setBigDecimalValue(settlementAmount);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "SettlementAmount" element
                     */
                    public void xsetSettlementAmount(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType settlementAmount)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(SETTLEMENTAMOUNT$34, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(SETTLEMENTAMOUNT$34);
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
                        get_store().remove_element(SETTLEMENTAMOUNT$34, 0);
                      }
                    }
                    
                    /**
                     * Gets the "CustomsInformation" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.CustomsInformation getCustomsInformation()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.CustomsInformation target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.CustomsInformation)get_store().find_element_user(CUSTOMSINFORMATION$36, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "CustomsInformation" element
                     */
                    public boolean isSetCustomsInformation()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(CUSTOMSINFORMATION$36) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "CustomsInformation" element
                     */
                    public void setCustomsInformation(x0401.oecdStandardAuditFileTaxPT1.CustomsInformation customsInformation)
                    {
                      generatedSetterHelperImpl(customsInformation, CUSTOMSINFORMATION$36, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "CustomsInformation" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.CustomsInformation addNewCustomsInformation()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.CustomsInformation target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.CustomsInformation)get_store().add_element_user(CUSTOMSINFORMATION$36);
                        return target;
                      }
                    }
                    
                    /**
                     * Unsets the "CustomsInformation" element
                     */
                    public void unsetCustomsInformation()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(CUSTOMSINFORMATION$36, 0);
                      }
                    }
                }
                /**
                 * An XML DocumentTotals(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
                 *
                 * This is a complex type.
                 */
                public static class DocumentTotalsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.WorkingDocuments.WorkDocument.DocumentTotals
                {
                    private static final long serialVersionUID = 1L;
                    
                    public DocumentTotalsImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName TAXPAYABLE$0 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TaxPayable");
                    private static final javax.xml.namespace.QName NETTOTAL$2 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "NetTotal");
                    private static final javax.xml.namespace.QName GROSSTOTAL$4 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "GrossTotal");
                    private static final javax.xml.namespace.QName CURRENCY$6 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Currency");
                    
                    
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetTaxPayable()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TAXPAYABLE$0, 0);
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
                    public void xsetTaxPayable(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType taxPayable)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TAXPAYABLE$0, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(TAXPAYABLE$0);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetNetTotal()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(NETTOTAL$2, 0);
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
                    public void xsetNetTotal(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType netTotal)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(NETTOTAL$2, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(NETTOTAL$2);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetGrossTotal()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(GROSSTOTAL$4, 0);
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
                    public void xsetGrossTotal(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType grossTotal)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(GROSSTOTAL$4, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(GROSSTOTAL$4);
                        }
                        target.set(grossTotal);
                      }
                    }
                    
                    /**
                     * Gets the "Currency" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.Currency getCurrency()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.Currency target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.Currency)get_store().find_element_user(CURRENCY$6, 0);
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
                    public void setCurrency(x0401.oecdStandardAuditFileTaxPT1.Currency currency)
                    {
                      generatedSetterHelperImpl(currency, CURRENCY$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "Currency" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.Currency addNewCurrency()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.Currency target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.Currency)get_store().add_element_user(CURRENCY$6);
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
                }
            }
        }
        /**
         * An XML Payments(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
         *
         * This is a complex type.
         */
        public static class PaymentsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments
        {
            private static final long serialVersionUID = 1L;
            
            public PaymentsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NUMBEROFENTRIES$0 = 
                new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "NumberOfEntries");
            private static final javax.xml.namespace.QName TOTALDEBIT$2 = 
                new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TotalDebit");
            private static final javax.xml.namespace.QName TOTALCREDIT$4 = 
                new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TotalCredit");
            private static final javax.xml.namespace.QName PAYMENT$6 = 
                new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Payment");
            
            
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
            public org.apache.xmlbeans.XmlNonNegativeInteger xgetNumberOfEntries()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(NUMBEROFENTRIES$0, 0);
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
            public void xsetNumberOfEntries(org.apache.xmlbeans.XmlNonNegativeInteger numberOfEntries)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(NUMBEROFENTRIES$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(NUMBEROFENTRIES$0);
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
            public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetTotalDebit()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TOTALDEBIT$2, 0);
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
            public void xsetTotalDebit(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType totalDebit)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TOTALDEBIT$2, 0);
                    if (target == null)
                    {
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(TOTALDEBIT$2);
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
            public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetTotalCredit()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TOTALCREDIT$4, 0);
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
            public void xsetTotalCredit(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType totalCredit)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TOTALCREDIT$4, 0);
                    if (target == null)
                    {
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(TOTALCREDIT$4);
                    }
                    target.set(totalCredit);
                }
            }
            
            /**
             * Gets a List of "Payment" elements
             */
            public java.util.List<x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment> getPaymentList()
            {
                final class PaymentList extends java.util.AbstractList<x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment>
                {
                    @Override
                    public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment get(int i)
                        { return PaymentsImpl.this.getPaymentArray(i); }
                    
                    @Override
                    public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment set(int i, x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment o)
                    {
                      x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment old = PaymentsImpl.this.getPaymentArray(i);
                      PaymentsImpl.this.setPaymentArray(i, o);
                      return old;
                    }
                    
                    @Override
                    public void add(int i, x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment o)
                        { PaymentsImpl.this.insertNewPayment(i).set(o); }
                    
                    @Override
                    public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment remove(int i)
                    {
                      x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment old = PaymentsImpl.this.getPaymentArray(i);
                      PaymentsImpl.this.removePayment(i);
                      return old;
                    }
                    
                    @Override
                    public int size()
                        { return PaymentsImpl.this.sizeOfPaymentArray(); }
                    
                }
                
                synchronized (monitor())
                {
                    check_orphaned();
                    return new PaymentList();
                }
            }
            
            /**
             * Gets array of all "Payment" elements
             * @deprecated
             */
            @Deprecated
            public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment[] getPaymentArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List<x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment> targetList = new java.util.ArrayList<x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment>();
                    get_store().find_all_element_users(PAYMENT$6, targetList);
                    x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment[] result = new x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Payment" element
             */
            public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment getPaymentArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment)get_store().find_element_user(PAYMENT$6, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Payment" element
             */
            public int sizeOfPaymentArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PAYMENT$6);
                }
            }
            
            /**
             * Sets array of all "Payment" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setPaymentArray(x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment[] paymentArray)
            {
                check_orphaned();
                arraySetterHelper(paymentArray, PAYMENT$6);
            }
            
            /**
             * Sets ith "Payment" element
             */
            public void setPaymentArray(int i, x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment payment)
            {
                generatedSetterHelperImpl(payment, PAYMENT$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Payment" element
             */
            public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment insertNewPayment(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment)get_store().insert_element_user(PAYMENT$6, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Payment" element
             */
            public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment addNewPayment()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment target = null;
                    target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment)get_store().add_element_user(PAYMENT$6);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Payment" element
             */
            public void removePayment(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PAYMENT$6, i);
                }
            }
            /**
             * An XML Payment(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
             *
             * This is a complex type.
             */
            public static class PaymentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment
            {
                private static final long serialVersionUID = 1L;
                
                public PaymentImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName PAYMENTREFNO$0 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "PaymentRefNo");
                private static final javax.xml.namespace.QName ATCUD$2 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "ATCUD");
                private static final javax.xml.namespace.QName PERIOD$4 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Period");
                private static final javax.xml.namespace.QName TRANSACTIONID$6 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TransactionID");
                private static final javax.xml.namespace.QName TRANSACTIONDATE$8 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TransactionDate");
                private static final javax.xml.namespace.QName PAYMENTTYPE$10 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "PaymentType");
                private static final javax.xml.namespace.QName DESCRIPTION$12 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Description");
                private static final javax.xml.namespace.QName SYSTEMID$14 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "SystemID");
                private static final javax.xml.namespace.QName DOCUMENTSTATUS$16 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "DocumentStatus");
                private static final javax.xml.namespace.QName PAYMENTMETHOD$18 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "PaymentMethod");
                private static final javax.xml.namespace.QName SOURCEID$20 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "SourceID");
                private static final javax.xml.namespace.QName SYSTEMENTRYDATE$22 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "SystemEntryDate");
                private static final javax.xml.namespace.QName CUSTOMERID$24 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "CustomerID");
                private static final javax.xml.namespace.QName LINE$26 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Line");
                private static final javax.xml.namespace.QName DOCUMENTTOTALS$28 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "DocumentTotals");
                private static final javax.xml.namespace.QName WITHHOLDINGTAX$30 = 
                    new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "WithholdingTax");
                
                
                /**
                 * Gets the "PaymentRefNo" element
                 */
                public java.lang.String getPaymentRefNo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTREFNO$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "PaymentRefNo" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.PaymentRefNoDocument.PaymentRefNo xgetPaymentRefNo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.PaymentRefNoDocument.PaymentRefNo target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.PaymentRefNoDocument.PaymentRefNo)get_store().find_element_user(PAYMENTREFNO$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "PaymentRefNo" element
                 */
                public void setPaymentRefNo(java.lang.String paymentRefNo)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTREFNO$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAYMENTREFNO$0);
                      }
                      target.setStringValue(paymentRefNo);
                    }
                }
                
                /**
                 * Sets (as xml) the "PaymentRefNo" element
                 */
                public void xsetPaymentRefNo(x0401.oecdStandardAuditFileTaxPT1.PaymentRefNoDocument.PaymentRefNo paymentRefNo)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.PaymentRefNoDocument.PaymentRefNo target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.PaymentRefNoDocument.PaymentRefNo)get_store().find_element_user(PAYMENTREFNO$0, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.PaymentRefNoDocument.PaymentRefNo)get_store().add_element_user(PAYMENTREFNO$0);
                      }
                      target.set(paymentRefNo);
                    }
                }
                
                /**
                 * Gets the "ATCUD" element
                 */
                public java.lang.String getATCUD()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATCUD$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "ATCUD" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car xgetATCUD()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car)get_store().find_element_user(ATCUD$2, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "ATCUD" element
                 */
                public void setATCUD(java.lang.String atcud)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATCUD$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATCUD$2);
                      }
                      target.setStringValue(atcud);
                    }
                }
                
                /**
                 * Sets (as xml) the "ATCUD" element
                 */
                public void xsetATCUD(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car atcud)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car)get_store().find_element_user(ATCUD$2, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car)get_store().add_element_user(ATCUD$2);
                      }
                      target.set(atcud);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIOD$4, 0);
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
                public x0401.oecdStandardAuditFileTaxPT1.PeriodDocument.Period xgetPeriod()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.PeriodDocument.Period target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.PeriodDocument.Period)get_store().find_element_user(PERIOD$4, 0);
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
                      return get_store().count_elements(PERIOD$4) != 0;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIOD$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERIOD$4);
                      }
                      target.setIntValue(period);
                    }
                }
                
                /**
                 * Sets (as xml) the "Period" element
                 */
                public void xsetPeriod(x0401.oecdStandardAuditFileTaxPT1.PeriodDocument.Period period)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.PeriodDocument.Period target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.PeriodDocument.Period)get_store().find_element_user(PERIOD$4, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.PeriodDocument.Period)get_store().add_element_user(PERIOD$4);
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
                      get_store().remove_element(PERIOD$4, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONID$6, 0);
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
                public x0401.oecdStandardAuditFileTaxPT1.SAFPTTransactionID xgetTransactionID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTTransactionID target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTTransactionID)get_store().find_element_user(TRANSACTIONID$6, 0);
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
                      return get_store().count_elements(TRANSACTIONID$6) != 0;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONID$6, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSACTIONID$6);
                      }
                      target.setStringValue(transactionID);
                    }
                }
                
                /**
                 * Sets (as xml) the "TransactionID" element
                 */
                public void xsetTransactionID(x0401.oecdStandardAuditFileTaxPT1.SAFPTTransactionID transactionID)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTTransactionID target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTTransactionID)get_store().find_element_user(TRANSACTIONID$6, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTTransactionID)get_store().add_element_user(TRANSACTIONID$6);
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
                      get_store().remove_element(TRANSACTIONID$6, 0);
                    }
                }
                
                /**
                 * Gets the "TransactionDate" element
                 */
                public java.util.Calendar getTransactionDate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONDATE$8, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getCalendarValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TransactionDate" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SAFdateType xgetTransactionDate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(TRANSACTIONDATE$8, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "TransactionDate" element
                 */
                public void setTransactionDate(java.util.Calendar transactionDate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONDATE$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSACTIONDATE$8);
                      }
                      target.setCalendarValue(transactionDate);
                    }
                }
                
                /**
                 * Sets (as xml) the "TransactionDate" element
                 */
                public void xsetTransactionDate(x0401.oecdStandardAuditFileTaxPT1.SAFdateType transactionDate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(TRANSACTIONDATE$8, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().add_element_user(TRANSACTIONDATE$8);
                      }
                      target.set(transactionDate);
                    }
                }
                
                /**
                 * Gets the "PaymentType" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SAFTPTPaymentType.Enum getPaymentType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTTYPE$10, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return (x0401.oecdStandardAuditFileTaxPT1.SAFTPTPaymentType.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "PaymentType" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SAFTPTPaymentType xgetPaymentType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFTPTPaymentType target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFTPTPaymentType)get_store().find_element_user(PAYMENTTYPE$10, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "PaymentType" element
                 */
                public void setPaymentType(x0401.oecdStandardAuditFileTaxPT1.SAFTPTPaymentType.Enum paymentType)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTTYPE$10, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAYMENTTYPE$10);
                      }
                      target.setEnumValue(paymentType);
                    }
                }
                
                /**
                 * Sets (as xml) the "PaymentType" element
                 */
                public void xsetPaymentType(x0401.oecdStandardAuditFileTaxPT1.SAFTPTPaymentType paymentType)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFTPTPaymentType target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFTPTPaymentType)get_store().find_element_user(PAYMENTTYPE$10, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFTPTPaymentType)get_store().add_element_user(PAYMENTTYPE$10);
                      }
                      target.set(paymentType);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$12, 0);
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
                public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car xgetDescription()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car)get_store().find_element_user(DESCRIPTION$12, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "Description" element
                 */
                public boolean isSetDescription()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(DESCRIPTION$12) != 0;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$12, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$12);
                      }
                      target.setStringValue(description);
                    }
                }
                
                /**
                 * Sets (as xml) the "Description" element
                 */
                public void xsetDescription(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car description)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car)get_store().find_element_user(DESCRIPTION$12, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car)get_store().add_element_user(DESCRIPTION$12);
                      }
                      target.set(description);
                    }
                }
                
                /**
                 * Unsets the "Description" element
                 */
                public void unsetDescription()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(DESCRIPTION$12, 0);
                    }
                }
                
                /**
                 * Gets the "SystemID" element
                 */
                public java.lang.String getSystemID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSTEMID$14, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "SystemID" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car xgetSystemID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(SYSTEMID$14, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "SystemID" element
                 */
                public boolean isSetSystemID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(SYSTEMID$14) != 0;
                    }
                }
                
                /**
                 * Sets the "SystemID" element
                 */
                public void setSystemID(java.lang.String systemID)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSTEMID$14, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SYSTEMID$14);
                      }
                      target.setStringValue(systemID);
                    }
                }
                
                /**
                 * Sets (as xml) the "SystemID" element
                 */
                public void xsetSystemID(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car systemID)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(SYSTEMID$14, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().add_element_user(SYSTEMID$14);
                      }
                      target.set(systemID);
                    }
                }
                
                /**
                 * Unsets the "SystemID" element
                 */
                public void unsetSystemID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(SYSTEMID$14, 0);
                    }
                }
                
                /**
                 * Gets the "DocumentStatus" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentStatus getDocumentStatus()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentStatus target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentStatus)get_store().find_element_user(DOCUMENTSTATUS$16, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "DocumentStatus" element
                 */
                public void setDocumentStatus(x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentStatus documentStatus)
                {
                    generatedSetterHelperImpl(documentStatus, DOCUMENTSTATUS$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                }
                
                /**
                 * Appends and returns a new empty "DocumentStatus" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentStatus addNewDocumentStatus()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentStatus target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentStatus)get_store().add_element_user(DOCUMENTSTATUS$16);
                      return target;
                    }
                }
                
                /**
                 * Gets a List of "PaymentMethod" elements
                 */
                public java.util.List<x0401.oecdStandardAuditFileTaxPT1.PaymentMethod> getPaymentMethodList()
                {
                    final class PaymentMethodList extends java.util.AbstractList<x0401.oecdStandardAuditFileTaxPT1.PaymentMethod>
                    {
                      @Override
                      public x0401.oecdStandardAuditFileTaxPT1.PaymentMethod get(int i)
                          { return PaymentImpl.this.getPaymentMethodArray(i); }
                      
                      @Override
                      public x0401.oecdStandardAuditFileTaxPT1.PaymentMethod set(int i, x0401.oecdStandardAuditFileTaxPT1.PaymentMethod o)
                      {
                        x0401.oecdStandardAuditFileTaxPT1.PaymentMethod old = PaymentImpl.this.getPaymentMethodArray(i);
                        PaymentImpl.this.setPaymentMethodArray(i, o);
                        return old;
                      }
                      
                      @Override
                      public void add(int i, x0401.oecdStandardAuditFileTaxPT1.PaymentMethod o)
                          { PaymentImpl.this.insertNewPaymentMethod(i).set(o); }
                      
                      @Override
                      public x0401.oecdStandardAuditFileTaxPT1.PaymentMethod remove(int i)
                      {
                        x0401.oecdStandardAuditFileTaxPT1.PaymentMethod old = PaymentImpl.this.getPaymentMethodArray(i);
                        PaymentImpl.this.removePaymentMethod(i);
                        return old;
                      }
                      
                      @Override
                      public int size()
                          { return PaymentImpl.this.sizeOfPaymentMethodArray(); }
                      
                    }
                    
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return new PaymentMethodList();
                    }
                }
                
                /**
                 * Gets array of all "PaymentMethod" elements
                 * @deprecated
                 */
                @Deprecated
                public x0401.oecdStandardAuditFileTaxPT1.PaymentMethod[] getPaymentMethodArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List<x0401.oecdStandardAuditFileTaxPT1.PaymentMethod> targetList = new java.util.ArrayList<x0401.oecdStandardAuditFileTaxPT1.PaymentMethod>();
                      get_store().find_all_element_users(PAYMENTMETHOD$18, targetList);
                      x0401.oecdStandardAuditFileTaxPT1.PaymentMethod[] result = new x0401.oecdStandardAuditFileTaxPT1.PaymentMethod[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "PaymentMethod" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.PaymentMethod getPaymentMethodArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.PaymentMethod target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.PaymentMethod)get_store().find_element_user(PAYMENTMETHOD$18, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "PaymentMethod" element
                 */
                public int sizeOfPaymentMethodArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(PAYMENTMETHOD$18);
                    }
                }
                
                /**
                 * Sets array of all "PaymentMethod" element  WARNING: This method is not atomicaly synchronized.
                 */
                public void setPaymentMethodArray(x0401.oecdStandardAuditFileTaxPT1.PaymentMethod[] paymentMethodArray)
                {
                    check_orphaned();
                    arraySetterHelper(paymentMethodArray, PAYMENTMETHOD$18);
                }
                
                /**
                 * Sets ith "PaymentMethod" element
                 */
                public void setPaymentMethodArray(int i, x0401.oecdStandardAuditFileTaxPT1.PaymentMethod paymentMethod)
                {
                    generatedSetterHelperImpl(paymentMethod, PAYMENTMETHOD$18, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "PaymentMethod" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.PaymentMethod insertNewPaymentMethod(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.PaymentMethod target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.PaymentMethod)get_store().insert_element_user(PAYMENTMETHOD$18, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "PaymentMethod" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.PaymentMethod addNewPaymentMethod()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.PaymentMethod target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.PaymentMethod)get_store().add_element_user(PAYMENTMETHOD$18);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "PaymentMethod" element
                 */
                public void removePaymentMethod(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(PAYMENTMETHOD$18, i);
                    }
                }
                
                /**
                 * Gets the "SourceID" element
                 */
                public java.lang.String getSourceID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEID$20, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "SourceID" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetSourceID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(SOURCEID$20, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "SourceID" element
                 */
                public void setSourceID(java.lang.String sourceID)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEID$20, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEID$20);
                      }
                      target.setStringValue(sourceID);
                    }
                }
                
                /**
                 * Sets (as xml) the "SourceID" element
                 */
                public void xsetSourceID(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car sourceID)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(SOURCEID$20, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().add_element_user(SOURCEID$20);
                      }
                      target.set(sourceID);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSTEMENTRYDATE$22, 0);
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
                public x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType xgetSystemEntryDate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(SYSTEMENTRYDATE$22, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSTEMENTRYDATE$22, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SYSTEMENTRYDATE$22);
                      }
                      target.setCalendarValue(systemEntryDate);
                    }
                }
                
                /**
                 * Sets (as xml) the "SystemEntryDate" element
                 */
                public void xsetSystemEntryDate(x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType systemEntryDate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(SYSTEMENTRYDATE$22, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().add_element_user(SYSTEMENTRYDATE$22);
                      }
                      target.set(systemEntryDate);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERID$24, 0);
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
                public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetCustomerID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(CUSTOMERID$24, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERID$24, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTOMERID$24);
                      }
                      target.setStringValue(customerID);
                    }
                }
                
                /**
                 * Sets (as xml) the "CustomerID" element
                 */
                public void xsetCustomerID(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car customerID)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(CUSTOMERID$24, 0);
                      if (target == null)
                      {
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().add_element_user(CUSTOMERID$24);
                      }
                      target.set(customerID);
                    }
                }
                
                /**
                 * Gets a List of "Line" elements
                 */
                public java.util.List<x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line> getLineList()
                {
                    final class LineList extends java.util.AbstractList<x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line>
                    {
                      @Override
                      public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line get(int i)
                          { return PaymentImpl.this.getLineArray(i); }
                      
                      @Override
                      public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line set(int i, x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line o)
                      {
                        x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line old = PaymentImpl.this.getLineArray(i);
                        PaymentImpl.this.setLineArray(i, o);
                        return old;
                      }
                      
                      @Override
                      public void add(int i, x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line o)
                          { PaymentImpl.this.insertNewLine(i).set(o); }
                      
                      @Override
                      public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line remove(int i)
                      {
                        x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line old = PaymentImpl.this.getLineArray(i);
                        PaymentImpl.this.removeLine(i);
                        return old;
                      }
                      
                      @Override
                      public int size()
                          { return PaymentImpl.this.sizeOfLineArray(); }
                      
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
                public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line[] getLineArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List<x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line> targetList = new java.util.ArrayList<x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line>();
                      get_store().find_all_element_users(LINE$26, targetList);
                      x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line[] result = new x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "Line" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line getLineArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line)get_store().find_element_user(LINE$26, i);
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
                public void setLineArray(x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line[] lineArray)
                {
                    check_orphaned();
                    arraySetterHelper(lineArray, LINE$26);
                }
                
                /**
                 * Sets ith "Line" element
                 */
                public void setLineArray(int i, x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line line)
                {
                    generatedSetterHelperImpl(line, LINE$26, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "Line" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line insertNewLine(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line)get_store().insert_element_user(LINE$26, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "Line" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line addNewLine()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line)get_store().add_element_user(LINE$26);
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
                public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentTotals getDocumentTotals()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentTotals target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentTotals)get_store().find_element_user(DOCUMENTTOTALS$28, 0);
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
                public void setDocumentTotals(x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentTotals documentTotals)
                {
                    generatedSetterHelperImpl(documentTotals, DOCUMENTTOTALS$28, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                }
                
                /**
                 * Appends and returns a new empty "DocumentTotals" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentTotals addNewDocumentTotals()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentTotals target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentTotals)get_store().add_element_user(DOCUMENTTOTALS$28);
                      return target;
                    }
                }
                
                /**
                 * Gets a List of "WithholdingTax" elements
                 */
                public java.util.List<x0401.oecdStandardAuditFileTaxPT1.WithholdingTax> getWithholdingTaxList()
                {
                    final class WithholdingTaxList extends java.util.AbstractList<x0401.oecdStandardAuditFileTaxPT1.WithholdingTax>
                    {
                      @Override
                      public x0401.oecdStandardAuditFileTaxPT1.WithholdingTax get(int i)
                          { return PaymentImpl.this.getWithholdingTaxArray(i); }
                      
                      @Override
                      public x0401.oecdStandardAuditFileTaxPT1.WithholdingTax set(int i, x0401.oecdStandardAuditFileTaxPT1.WithholdingTax o)
                      {
                        x0401.oecdStandardAuditFileTaxPT1.WithholdingTax old = PaymentImpl.this.getWithholdingTaxArray(i);
                        PaymentImpl.this.setWithholdingTaxArray(i, o);
                        return old;
                      }
                      
                      @Override
                      public void add(int i, x0401.oecdStandardAuditFileTaxPT1.WithholdingTax o)
                          { PaymentImpl.this.insertNewWithholdingTax(i).set(o); }
                      
                      @Override
                      public x0401.oecdStandardAuditFileTaxPT1.WithholdingTax remove(int i)
                      {
                        x0401.oecdStandardAuditFileTaxPT1.WithholdingTax old = PaymentImpl.this.getWithholdingTaxArray(i);
                        PaymentImpl.this.removeWithholdingTax(i);
                        return old;
                      }
                      
                      @Override
                      public int size()
                          { return PaymentImpl.this.sizeOfWithholdingTaxArray(); }
                      
                    }
                    
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return new WithholdingTaxList();
                    }
                }
                
                /**
                 * Gets array of all "WithholdingTax" elements
                 * @deprecated
                 */
                @Deprecated
                public x0401.oecdStandardAuditFileTaxPT1.WithholdingTax[] getWithholdingTaxArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List<x0401.oecdStandardAuditFileTaxPT1.WithholdingTax> targetList = new java.util.ArrayList<x0401.oecdStandardAuditFileTaxPT1.WithholdingTax>();
                      get_store().find_all_element_users(WITHHOLDINGTAX$30, targetList);
                      x0401.oecdStandardAuditFileTaxPT1.WithholdingTax[] result = new x0401.oecdStandardAuditFileTaxPT1.WithholdingTax[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "WithholdingTax" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.WithholdingTax getWithholdingTaxArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.WithholdingTax target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.WithholdingTax)get_store().find_element_user(WITHHOLDINGTAX$30, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "WithholdingTax" element
                 */
                public int sizeOfWithholdingTaxArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(WITHHOLDINGTAX$30);
                    }
                }
                
                /**
                 * Sets array of all "WithholdingTax" element  WARNING: This method is not atomicaly synchronized.
                 */
                public void setWithholdingTaxArray(x0401.oecdStandardAuditFileTaxPT1.WithholdingTax[] withholdingTaxArray)
                {
                    check_orphaned();
                    arraySetterHelper(withholdingTaxArray, WITHHOLDINGTAX$30);
                }
                
                /**
                 * Sets ith "WithholdingTax" element
                 */
                public void setWithholdingTaxArray(int i, x0401.oecdStandardAuditFileTaxPT1.WithholdingTax withholdingTax)
                {
                    generatedSetterHelperImpl(withholdingTax, WITHHOLDINGTAX$30, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "WithholdingTax" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.WithholdingTax insertNewWithholdingTax(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.WithholdingTax target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.WithholdingTax)get_store().insert_element_user(WITHHOLDINGTAX$30, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "WithholdingTax" element
                 */
                public x0401.oecdStandardAuditFileTaxPT1.WithholdingTax addNewWithholdingTax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0401.oecdStandardAuditFileTaxPT1.WithholdingTax target = null;
                      target = (x0401.oecdStandardAuditFileTaxPT1.WithholdingTax)get_store().add_element_user(WITHHOLDINGTAX$30);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "WithholdingTax" element
                 */
                public void removeWithholdingTax(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(WITHHOLDINGTAX$30, i);
                    }
                }
                /**
                 * An XML DocumentStatus(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
                 *
                 * This is a complex type.
                 */
                public static class DocumentStatusImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentStatus
                {
                    private static final long serialVersionUID = 1L;
                    
                    public DocumentStatusImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName PAYMENTSTATUS$0 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "PaymentStatus");
                    private static final javax.xml.namespace.QName PAYMENTSTATUSDATE$2 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "PaymentStatusDate");
                    private static final javax.xml.namespace.QName REASON$4 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Reason");
                    private static final javax.xml.namespace.QName SOURCEID$6 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "SourceID");
                    private static final javax.xml.namespace.QName SOURCEPAYMENT$8 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "SourcePayment");
                    
                    
                    /**
                     * Gets the "PaymentStatus" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.PaymentStatusDocument.PaymentStatus.Enum getPaymentStatus()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTSTATUS$0, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return (x0401.oecdStandardAuditFileTaxPT1.PaymentStatusDocument.PaymentStatus.Enum)target.getEnumValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "PaymentStatus" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.PaymentStatusDocument.PaymentStatus xgetPaymentStatus()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.PaymentStatusDocument.PaymentStatus target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.PaymentStatusDocument.PaymentStatus)get_store().find_element_user(PAYMENTSTATUS$0, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "PaymentStatus" element
                     */
                    public void setPaymentStatus(x0401.oecdStandardAuditFileTaxPT1.PaymentStatusDocument.PaymentStatus.Enum paymentStatus)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTSTATUS$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAYMENTSTATUS$0);
                        }
                        target.setEnumValue(paymentStatus);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "PaymentStatus" element
                     */
                    public void xsetPaymentStatus(x0401.oecdStandardAuditFileTaxPT1.PaymentStatusDocument.PaymentStatus paymentStatus)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.PaymentStatusDocument.PaymentStatus target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.PaymentStatusDocument.PaymentStatus)get_store().find_element_user(PAYMENTSTATUS$0, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.PaymentStatusDocument.PaymentStatus)get_store().add_element_user(PAYMENTSTATUS$0);
                        }
                        target.set(paymentStatus);
                      }
                    }
                    
                    /**
                     * Gets the "PaymentStatusDate" element
                     */
                    public java.util.Calendar getPaymentStatusDate()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTSTATUSDATE$2, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getCalendarValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "PaymentStatusDate" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType xgetPaymentStatusDate()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(PAYMENTSTATUSDATE$2, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "PaymentStatusDate" element
                     */
                    public void setPaymentStatusDate(java.util.Calendar paymentStatusDate)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTSTATUSDATE$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAYMENTSTATUSDATE$2);
                        }
                        target.setCalendarValue(paymentStatusDate);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "PaymentStatusDate" element
                     */
                    public void xsetPaymentStatusDate(x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType paymentStatusDate)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(PAYMENTSTATUSDATE$2, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().add_element_user(PAYMENTSTATUSDATE$2);
                        }
                        target.set(paymentStatusDate);
                      }
                    }
                    
                    /**
                     * Gets the "Reason" element
                     */
                    public java.lang.String getReason()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASON$4, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "Reason" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car xgetReason()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().find_element_user(REASON$4, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "Reason" element
                     */
                    public boolean isSetReason()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(REASON$4) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "Reason" element
                     */
                    public void setReason(java.lang.String reason)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASON$4, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REASON$4);
                        }
                        target.setStringValue(reason);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "Reason" element
                     */
                    public void xsetReason(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car reason)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().find_element_user(REASON$4, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().add_element_user(REASON$4);
                        }
                        target.set(reason);
                      }
                    }
                    
                    /**
                     * Unsets the "Reason" element
                     */
                    public void unsetReason()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(REASON$4, 0);
                      }
                    }
                    
                    /**
                     * Gets the "SourceID" element
                     */
                    public java.lang.String getSourceID()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEID$6, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "SourceID" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetSourceID()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(SOURCEID$6, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "SourceID" element
                     */
                    public void setSourceID(java.lang.String sourceID)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEID$6, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEID$6);
                        }
                        target.setStringValue(sourceID);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "SourceID" element
                     */
                    public void xsetSourceID(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car sourceID)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(SOURCEID$6, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().add_element_user(SOURCEID$6);
                        }
                        target.set(sourceID);
                      }
                    }
                    
                    /**
                     * Gets the "SourcePayment" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.SAFTPTSourcePayment.Enum getSourcePayment()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEPAYMENT$8, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return (x0401.oecdStandardAuditFileTaxPT1.SAFTPTSourcePayment.Enum)target.getEnumValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "SourcePayment" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.SAFTPTSourcePayment xgetSourcePayment()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFTPTSourcePayment target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFTPTSourcePayment)get_store().find_element_user(SOURCEPAYMENT$8, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "SourcePayment" element
                     */
                    public void setSourcePayment(x0401.oecdStandardAuditFileTaxPT1.SAFTPTSourcePayment.Enum sourcePayment)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEPAYMENT$8, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEPAYMENT$8);
                        }
                        target.setEnumValue(sourcePayment);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "SourcePayment" element
                     */
                    public void xsetSourcePayment(x0401.oecdStandardAuditFileTaxPT1.SAFTPTSourcePayment sourcePayment)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFTPTSourcePayment target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFTPTSourcePayment)get_store().find_element_user(SOURCEPAYMENT$8, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFTPTSourcePayment)get_store().add_element_user(SOURCEPAYMENT$8);
                        }
                        target.set(sourcePayment);
                      }
                    }
                }
                /**
                 * An XML Line(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
                 *
                 * This is a complex type.
                 */
                public static class LineImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line
                {
                    private static final long serialVersionUID = 1L;
                    
                    public LineImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName LINENUMBER$0 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "LineNumber");
                    private static final javax.xml.namespace.QName SOURCEDOCUMENTID$2 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "SourceDocumentID");
                    private static final javax.xml.namespace.QName SETTLEMENTAMOUNT$4 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "SettlementAmount");
                    private static final javax.xml.namespace.QName DEBITAMOUNT$6 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "DebitAmount");
                    private static final javax.xml.namespace.QName CREDITAMOUNT$8 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "CreditAmount");
                    private static final javax.xml.namespace.QName TAX$10 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Tax");
                    private static final javax.xml.namespace.QName TAXEXEMPTIONREASON$12 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TaxExemptionReason");
                    private static final javax.xml.namespace.QName TAXEXEMPTIONCODE$14 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TaxExemptionCode");
                    
                    
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
                    public org.apache.xmlbeans.XmlNonNegativeInteger xgetLineNumber()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                        target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(LINENUMBER$0, 0);
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
                    public void xsetLineNumber(org.apache.xmlbeans.XmlNonNegativeInteger lineNumber)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                        target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(LINENUMBER$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(LINENUMBER$0);
                        }
                        target.set(lineNumber);
                      }
                    }
                    
                    /**
                     * Gets a List of "SourceDocumentID" elements
                     */
                    public java.util.List<x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line.SourceDocumentID> getSourceDocumentIDList()
                    {
                      final class SourceDocumentIDList extends java.util.AbstractList<x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line.SourceDocumentID>
                      {
                        @Override
                        public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line.SourceDocumentID get(int i)
                            { return LineImpl.this.getSourceDocumentIDArray(i); }
                        
                        @Override
                        public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line.SourceDocumentID set(int i, x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line.SourceDocumentID o)
                        {
                          x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line.SourceDocumentID old = LineImpl.this.getSourceDocumentIDArray(i);
                          LineImpl.this.setSourceDocumentIDArray(i, o);
                          return old;
                        }
                        
                        @Override
                        public void add(int i, x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line.SourceDocumentID o)
                            { LineImpl.this.insertNewSourceDocumentID(i).set(o); }
                        
                        @Override
                        public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line.SourceDocumentID remove(int i)
                        {
                          x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line.SourceDocumentID old = LineImpl.this.getSourceDocumentIDArray(i);
                          LineImpl.this.removeSourceDocumentID(i);
                          return old;
                        }
                        
                        @Override
                        public int size()
                            { return LineImpl.this.sizeOfSourceDocumentIDArray(); }
                        
                      }
                      
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return new SourceDocumentIDList();
                      }
                    }
                    
                    /**
                     * Gets array of all "SourceDocumentID" elements
                     * @deprecated
                     */
                    @Deprecated
                    public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line.SourceDocumentID[] getSourceDocumentIDArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        java.util.List<x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line.SourceDocumentID> targetList = new java.util.ArrayList<x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line.SourceDocumentID>();
                        get_store().find_all_element_users(SOURCEDOCUMENTID$2, targetList);
                        x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line.SourceDocumentID[] result = new x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line.SourceDocumentID[targetList.size()];
                        targetList.toArray(result);
                        return result;
                      }
                    }
                    
                    /**
                     * Gets ith "SourceDocumentID" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line.SourceDocumentID getSourceDocumentIDArray(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line.SourceDocumentID target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line.SourceDocumentID)get_store().find_element_user(SOURCEDOCUMENTID$2, i);
                        if (target == null)
                        {
                          throw new IndexOutOfBoundsException();
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Returns number of "SourceDocumentID" element
                     */
                    public int sizeOfSourceDocumentIDArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(SOURCEDOCUMENTID$2);
                      }
                    }
                    
                    /**
                     * Sets array of all "SourceDocumentID" element  WARNING: This method is not atomicaly synchronized.
                     */
                    public void setSourceDocumentIDArray(x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line.SourceDocumentID[] sourceDocumentIDArray)
                    {
                      check_orphaned();
                      arraySetterHelper(sourceDocumentIDArray, SOURCEDOCUMENTID$2);
                    }
                    
                    /**
                     * Sets ith "SourceDocumentID" element
                     */
                    public void setSourceDocumentIDArray(int i, x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line.SourceDocumentID sourceDocumentID)
                    {
                      generatedSetterHelperImpl(sourceDocumentID, SOURCEDOCUMENTID$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
                    }
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "SourceDocumentID" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line.SourceDocumentID insertNewSourceDocumentID(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line.SourceDocumentID target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line.SourceDocumentID)get_store().insert_element_user(SOURCEDOCUMENTID$2, i);
                        return target;
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "SourceDocumentID" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line.SourceDocumentID addNewSourceDocumentID()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line.SourceDocumentID target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line.SourceDocumentID)get_store().add_element_user(SOURCEDOCUMENTID$2);
                        return target;
                      }
                    }
                    
                    /**
                     * Removes the ith "SourceDocumentID" element
                     */
                    public void removeSourceDocumentID(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(SOURCEDOCUMENTID$2, i);
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SETTLEMENTAMOUNT$4, 0);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetSettlementAmount()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(SETTLEMENTAMOUNT$4, 0);
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
                        return get_store().count_elements(SETTLEMENTAMOUNT$4) != 0;
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SETTLEMENTAMOUNT$4, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SETTLEMENTAMOUNT$4);
                        }
                        target.setBigDecimalValue(settlementAmount);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "SettlementAmount" element
                     */
                    public void xsetSettlementAmount(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType settlementAmount)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(SETTLEMENTAMOUNT$4, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(SETTLEMENTAMOUNT$4);
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
                        get_store().remove_element(SETTLEMENTAMOUNT$4, 0);
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEBITAMOUNT$6, 0);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetDebitAmount()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(DEBITAMOUNT$6, 0);
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
                        return get_store().count_elements(DEBITAMOUNT$6) != 0;
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEBITAMOUNT$6, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEBITAMOUNT$6);
                        }
                        target.setBigDecimalValue(debitAmount);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "DebitAmount" element
                     */
                    public void xsetDebitAmount(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType debitAmount)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(DEBITAMOUNT$6, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(DEBITAMOUNT$6);
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
                        get_store().remove_element(DEBITAMOUNT$6, 0);
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREDITAMOUNT$8, 0);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetCreditAmount()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(CREDITAMOUNT$8, 0);
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
                        return get_store().count_elements(CREDITAMOUNT$8) != 0;
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREDITAMOUNT$8, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREDITAMOUNT$8);
                        }
                        target.setBigDecimalValue(creditAmount);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "CreditAmount" element
                     */
                    public void xsetCreditAmount(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType creditAmount)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(CREDITAMOUNT$8, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(CREDITAMOUNT$8);
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
                        get_store().remove_element(CREDITAMOUNT$8, 0);
                      }
                    }
                    
                    /**
                     * Gets the "Tax" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.PaymentTax getTax()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.PaymentTax target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.PaymentTax)get_store().find_element_user(TAX$10, 0);
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
                        return get_store().count_elements(TAX$10) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "Tax" element
                     */
                    public void setTax(x0401.oecdStandardAuditFileTaxPT1.PaymentTax tax)
                    {
                      generatedSetterHelperImpl(tax, TAX$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "Tax" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.PaymentTax addNewTax()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.PaymentTax target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.PaymentTax)get_store().add_element_user(TAX$10);
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
                        get_store().remove_element(TAX$10, 0);
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXEXEMPTIONREASON$12, 0);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionReason xgetTaxExemptionReason()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionReason target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionReason)get_store().find_element_user(TAXEXEMPTIONREASON$12, 0);
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
                        return get_store().count_elements(TAXEXEMPTIONREASON$12) != 0;
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXEXEMPTIONREASON$12, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXEXEMPTIONREASON$12);
                        }
                        target.setStringValue(taxExemptionReason);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TaxExemptionReason" element
                     */
                    public void xsetTaxExemptionReason(x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionReason taxExemptionReason)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionReason target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionReason)get_store().find_element_user(TAXEXEMPTIONREASON$12, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionReason)get_store().add_element_user(TAXEXEMPTIONREASON$12);
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
                        get_store().remove_element(TAXEXEMPTIONREASON$12, 0);
                      }
                    }
                    
                    /**
                     * Gets the "TaxExemptionCode" element
                     */
                    public java.lang.String getTaxExemptionCode()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXEXEMPTIONCODE$14, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TaxExemptionCode" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionCode xgetTaxExemptionCode()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionCode target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionCode)get_store().find_element_user(TAXEXEMPTIONCODE$14, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "TaxExemptionCode" element
                     */
                    public boolean isSetTaxExemptionCode()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TAXEXEMPTIONCODE$14) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "TaxExemptionCode" element
                     */
                    public void setTaxExemptionCode(java.lang.String taxExemptionCode)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXEXEMPTIONCODE$14, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXEXEMPTIONCODE$14);
                        }
                        target.setStringValue(taxExemptionCode);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TaxExemptionCode" element
                     */
                    public void xsetTaxExemptionCode(x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionCode taxExemptionCode)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionCode target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionCode)get_store().find_element_user(TAXEXEMPTIONCODE$14, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionCode)get_store().add_element_user(TAXEXEMPTIONCODE$14);
                        }
                        target.set(taxExemptionCode);
                      }
                    }
                    
                    /**
                     * Unsets the "TaxExemptionCode" element
                     */
                    public void unsetTaxExemptionCode()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TAXEXEMPTIONCODE$14, 0);
                      }
                    }
                    /**
                     * An XML SourceDocumentID(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
                     *
                     * This is a complex type.
                     */
                    public static class SourceDocumentIDImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.Line.SourceDocumentID
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public SourceDocumentIDImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName ORIGINATINGON$0 = 
                        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "OriginatingON");
                      private static final javax.xml.namespace.QName INVOICEDATE$2 = 
                        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "InvoiceDate");
                      private static final javax.xml.namespace.QName DESCRIPTION$4 = 
                        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Description");
                      
                      
                      /**
                       * Gets the "OriginatingON" element
                       */
                      public java.lang.String getOriginatingON()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINATINGON$0, 0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "OriginatingON" element
                       */
                      public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car xgetOriginatingON()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(ORIGINATINGON$0, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "OriginatingON" element
                       */
                      public void setOriginatingON(java.lang.String originatingON)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINATINGON$0, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORIGINATINGON$0);
                          }
                          target.setStringValue(originatingON);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "OriginatingON" element
                       */
                      public void xsetOriginatingON(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car originatingON)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(ORIGINATINGON$0, 0);
                          if (target == null)
                          {
                            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().add_element_user(ORIGINATINGON$0);
                          }
                          target.set(originatingON);
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
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOICEDATE$2, 0);
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
                      public x0401.oecdStandardAuditFileTaxPT1.SAFdateType xgetInvoiceDate()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          x0401.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(INVOICEDATE$2, 0);
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
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOICEDATE$2, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INVOICEDATE$2);
                          }
                          target.setCalendarValue(invoiceDate);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "InvoiceDate" element
                       */
                      public void xsetInvoiceDate(x0401.oecdStandardAuditFileTaxPT1.SAFdateType invoiceDate)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          x0401.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(INVOICEDATE$2, 0);
                          if (target == null)
                          {
                            target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().add_element_user(INVOICEDATE$2);
                          }
                          target.set(invoiceDate);
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
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$4, 0);
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
                      public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car xgetDescription()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car target = null;
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car)get_store().find_element_user(DESCRIPTION$4, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * True if has "Description" element
                       */
                      public boolean isSetDescription()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          return get_store().count_elements(DESCRIPTION$4) != 0;
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
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$4, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$4);
                          }
                          target.setStringValue(description);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "Description" element
                       */
                      public void xsetDescription(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car description)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car target = null;
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car)get_store().find_element_user(DESCRIPTION$4, 0);
                          if (target == null)
                          {
                            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car)get_store().add_element_user(DESCRIPTION$4);
                          }
                          target.set(description);
                        }
                      }
                      
                      /**
                       * Unsets the "Description" element
                       */
                      public void unsetDescription()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          get_store().remove_element(DESCRIPTION$4, 0);
                        }
                      }
                    }
                }
                /**
                 * An XML DocumentTotals(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
                 *
                 * This is a complex type.
                 */
                public static class DocumentTotalsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentTotals
                {
                    private static final long serialVersionUID = 1L;
                    
                    public DocumentTotalsImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName TAXPAYABLE$0 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TaxPayable");
                    private static final javax.xml.namespace.QName NETTOTAL$2 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "NetTotal");
                    private static final javax.xml.namespace.QName GROSSTOTAL$4 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "GrossTotal");
                    private static final javax.xml.namespace.QName SETTLEMENT$6 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Settlement");
                    private static final javax.xml.namespace.QName CURRENCY$8 = 
                      new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Currency");
                    
                    
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetTaxPayable()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TAXPAYABLE$0, 0);
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
                    public void xsetTaxPayable(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType taxPayable)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TAXPAYABLE$0, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(TAXPAYABLE$0);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetNetTotal()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(NETTOTAL$2, 0);
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
                    public void xsetNetTotal(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType netTotal)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(NETTOTAL$2, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(NETTOTAL$2);
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
                    public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetGrossTotal()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(GROSSTOTAL$4, 0);
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
                    public void xsetGrossTotal(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType grossTotal)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(GROSSTOTAL$4, 0);
                        if (target == null)
                        {
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(GROSSTOTAL$4);
                        }
                        target.set(grossTotal);
                      }
                    }
                    
                    /**
                     * Gets the "Settlement" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentTotals.Settlement getSettlement()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentTotals.Settlement target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentTotals.Settlement)get_store().find_element_user(SETTLEMENT$6, 0);
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
                        return get_store().count_elements(SETTLEMENT$6) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "Settlement" element
                     */
                    public void setSettlement(x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentTotals.Settlement settlement)
                    {
                      generatedSetterHelperImpl(settlement, SETTLEMENT$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "Settlement" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentTotals.Settlement addNewSettlement()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentTotals.Settlement target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentTotals.Settlement)get_store().add_element_user(SETTLEMENT$6);
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
                        get_store().remove_element(SETTLEMENT$6, 0);
                      }
                    }
                    
                    /**
                     * Gets the "Currency" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.Currency getCurrency()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.Currency target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.Currency)get_store().find_element_user(CURRENCY$8, 0);
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
                        return get_store().count_elements(CURRENCY$8) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "Currency" element
                     */
                    public void setCurrency(x0401.oecdStandardAuditFileTaxPT1.Currency currency)
                    {
                      generatedSetterHelperImpl(currency, CURRENCY$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "Currency" element
                     */
                    public x0401.oecdStandardAuditFileTaxPT1.Currency addNewCurrency()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0401.oecdStandardAuditFileTaxPT1.Currency target = null;
                        target = (x0401.oecdStandardAuditFileTaxPT1.Currency)get_store().add_element_user(CURRENCY$8);
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
                        get_store().remove_element(CURRENCY$8, 0);
                      }
                    }
                    /**
                     * An XML Settlement(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
                     *
                     * This is a complex type.
                     */
                    public static class SettlementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments.Payments.Payment.DocumentTotals.Settlement
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public SettlementImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName SETTLEMENTAMOUNT$0 = 
                        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "SettlementAmount");
                      
                      
                      /**
                       * Gets the "SettlementAmount" element
                       */
                      public java.math.BigDecimal getSettlementAmount()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SETTLEMENTAMOUNT$0, 0);
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
                      public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetSettlementAmount()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(SETTLEMENTAMOUNT$0, 0);
                          return target;
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
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SETTLEMENTAMOUNT$0, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SETTLEMENTAMOUNT$0);
                          }
                          target.setBigDecimalValue(settlementAmount);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "SettlementAmount" element
                       */
                      public void xsetSettlementAmount(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType settlementAmount)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                          target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(SETTLEMENTAMOUNT$0, 0);
                          if (target == null)
                          {
                            target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(SETTLEMENTAMOUNT$0);
                          }
                          target.set(settlementAmount);
                        }
                      }
                    }
                }
            }
        }
    }
}
