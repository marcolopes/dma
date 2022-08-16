/*
 * An XML document type.
 * Localname: AuditFile
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.01_01
 * Java type: x0101.oecdStandardAuditFileTaxPT1.AuditFileDocument
 *
 * Automatically generated - do not modify.
 */
package x0101.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one AuditFile(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01) element.
 *
 * This is a complex type.
 */
public class AuditFileDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.AuditFileDocument
{
    private static final long serialVersionUID = 1L;
    
    public AuditFileDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUDITFILE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "AuditFile");
    
    
    /**
     * Gets the "AuditFile" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.AuditFileDocument.AuditFile getAuditFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.AuditFileDocument.AuditFile target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.AuditFileDocument.AuditFile)get_store().find_element_user(AUDITFILE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AuditFile" element
     */
    public void setAuditFile(x0101.oecdStandardAuditFileTaxPT1.AuditFileDocument.AuditFile auditFile)
    {
        generatedSetterHelperImpl(auditFile, AUDITFILE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AuditFile" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.AuditFileDocument.AuditFile addNewAuditFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.AuditFileDocument.AuditFile target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.AuditFileDocument.AuditFile)get_store().add_element_user(AUDITFILE$0);
            return target;
        }
    }
    /**
     * An XML AuditFile(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01).
     *
     * This is a complex type.
     */
    public static class AuditFileImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.AuditFileDocument.AuditFile
    {
        private static final long serialVersionUID = 1L;
        
        public AuditFileImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HEADER$0 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "Header");
        private static final javax.xml.namespace.QName MASTERFILES$2 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "MasterFiles");
        private static final javax.xml.namespace.QName GENERALLEDGERENTRIES$4 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "GeneralLedgerEntries");
        private static final javax.xml.namespace.QName SOURCEDOCUMENTS$6 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "SourceDocuments");
        
        
        /**
         * Gets the "Header" element
         */
        public x0101.oecdStandardAuditFileTaxPT1.HeaderDocument.Header getHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.HeaderDocument.Header target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.HeaderDocument.Header)get_store().find_element_user(HEADER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Header" element
         */
        public void setHeader(x0101.oecdStandardAuditFileTaxPT1.HeaderDocument.Header header)
        {
            generatedSetterHelperImpl(header, HEADER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Header" element
         */
        public x0101.oecdStandardAuditFileTaxPT1.HeaderDocument.Header addNewHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.HeaderDocument.Header target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.HeaderDocument.Header)get_store().add_element_user(HEADER$0);
                return target;
            }
        }
        
        /**
         * Gets the "MasterFiles" element
         */
        public x0101.oecdStandardAuditFileTaxPT1.AuditFileDocument.AuditFile.MasterFiles getMasterFiles()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.AuditFileDocument.AuditFile.MasterFiles target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.AuditFileDocument.AuditFile.MasterFiles)get_store().find_element_user(MASTERFILES$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "MasterFiles" element
         */
        public void setMasterFiles(x0101.oecdStandardAuditFileTaxPT1.AuditFileDocument.AuditFile.MasterFiles masterFiles)
        {
            generatedSetterHelperImpl(masterFiles, MASTERFILES$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "MasterFiles" element
         */
        public x0101.oecdStandardAuditFileTaxPT1.AuditFileDocument.AuditFile.MasterFiles addNewMasterFiles()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.AuditFileDocument.AuditFile.MasterFiles target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.AuditFileDocument.AuditFile.MasterFiles)get_store().add_element_user(MASTERFILES$2);
                return target;
            }
        }
        
        /**
         * Gets the "GeneralLedgerEntries" element
         */
        public x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries getGeneralLedgerEntries()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries)get_store().find_element_user(GENERALLEDGERENTRIES$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "GeneralLedgerEntries" element
         */
        public boolean isSetGeneralLedgerEntries()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GENERALLEDGERENTRIES$4) != 0;
            }
        }
        
        /**
         * Sets the "GeneralLedgerEntries" element
         */
        public void setGeneralLedgerEntries(x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries generalLedgerEntries)
        {
            generatedSetterHelperImpl(generalLedgerEntries, GENERALLEDGERENTRIES$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GeneralLedgerEntries" element
         */
        public x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries addNewGeneralLedgerEntries()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerEntriesDocument.GeneralLedgerEntries)get_store().add_element_user(GENERALLEDGERENTRIES$4);
                return target;
            }
        }
        
        /**
         * Unsets the "GeneralLedgerEntries" element
         */
        public void unsetGeneralLedgerEntries()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GENERALLEDGERENTRIES$4, 0);
            }
        }
        
        /**
         * Gets the "SourceDocuments" element
         */
        public x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments getSourceDocuments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments)get_store().find_element_user(SOURCEDOCUMENTS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "SourceDocuments" element
         */
        public boolean isSetSourceDocuments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SOURCEDOCUMENTS$6) != 0;
            }
        }
        
        /**
         * Sets the "SourceDocuments" element
         */
        public void setSourceDocuments(x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments sourceDocuments)
        {
            generatedSetterHelperImpl(sourceDocuments, SOURCEDOCUMENTS$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
                target = (x0101.oecdStandardAuditFileTaxPT1.SourceDocumentsDocument.SourceDocuments)get_store().add_element_user(SOURCEDOCUMENTS$6);
                return target;
            }
        }
        
        /**
         * Unsets the "SourceDocuments" element
         */
        public void unsetSourceDocuments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SOURCEDOCUMENTS$6, 0);
            }
        }
        /**
         * An XML MasterFiles(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01).
         *
         * This is a complex type.
         */
        public static class MasterFilesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.AuditFileDocument.AuditFile.MasterFiles
        {
            private static final long serialVersionUID = 1L;
            
            public MasterFilesImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName GENERALLEDGER$0 = 
                new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "GeneralLedger");
            private static final javax.xml.namespace.QName CUSTOMER$2 = 
                new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "Customer");
            private static final javax.xml.namespace.QName SUPPLIER$4 = 
                new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "Supplier");
            private static final javax.xml.namespace.QName PRODUCT$6 = 
                new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "Product");
            private static final javax.xml.namespace.QName TAXTABLE$8 = 
                new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "TaxTable");
            
            
            /**
             * Gets a List of "GeneralLedger" elements
             */
            public java.util.List<x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger> getGeneralLedgerList()
            {
                final class GeneralLedgerList extends java.util.AbstractList<x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger>
                {
                    @Override
                    public x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger get(int i)
                        { return MasterFilesImpl.this.getGeneralLedgerArray(i); }
                    
                    @Override
                    public x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger set(int i, x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger o)
                    {
                      x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger old = MasterFilesImpl.this.getGeneralLedgerArray(i);
                      MasterFilesImpl.this.setGeneralLedgerArray(i, o);
                      return old;
                    }
                    
                    @Override
                    public void add(int i, x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger o)
                        { MasterFilesImpl.this.insertNewGeneralLedger(i).set(o); }
                    
                    @Override
                    public x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger remove(int i)
                    {
                      x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger old = MasterFilesImpl.this.getGeneralLedgerArray(i);
                      MasterFilesImpl.this.removeGeneralLedger(i);
                      return old;
                    }
                    
                    @Override
                    public int size()
                        { return MasterFilesImpl.this.sizeOfGeneralLedgerArray(); }
                    
                }
                
                synchronized (monitor())
                {
                    check_orphaned();
                    return new GeneralLedgerList();
                }
            }
            
            /**
             * Gets array of all "GeneralLedger" elements
             * @deprecated
             */
            @Deprecated
            public x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger[] getGeneralLedgerArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List<x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger> targetList = new java.util.ArrayList<x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger>();
                    get_store().find_all_element_users(GENERALLEDGER$0, targetList);
                    x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger[] result = new x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "GeneralLedger" element
             */
            public x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger getGeneralLedgerArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger target = null;
                    target = (x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger)get_store().find_element_user(GENERALLEDGER$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "GeneralLedger" element
             */
            public int sizeOfGeneralLedgerArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(GENERALLEDGER$0);
                }
            }
            
            /**
             * Sets array of all "GeneralLedger" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setGeneralLedgerArray(x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger[] generalLedgerArray)
            {
                check_orphaned();
                arraySetterHelper(generalLedgerArray, GENERALLEDGER$0);
            }
            
            /**
             * Sets ith "GeneralLedger" element
             */
            public void setGeneralLedgerArray(int i, x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger generalLedger)
            {
                generatedSetterHelperImpl(generalLedger, GENERALLEDGER$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "GeneralLedger" element
             */
            public x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger insertNewGeneralLedger(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger target = null;
                    target = (x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger)get_store().insert_element_user(GENERALLEDGER$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "GeneralLedger" element
             */
            public x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger addNewGeneralLedger()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger target = null;
                    target = (x0101.oecdStandardAuditFileTaxPT1.GeneralLedgerDocument.GeneralLedger)get_store().add_element_user(GENERALLEDGER$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "GeneralLedger" element
             */
            public void removeGeneralLedger(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(GENERALLEDGER$0, i);
                }
            }
            
            /**
             * Gets a List of "Customer" elements
             */
            public java.util.List<x0101.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer> getCustomerList()
            {
                final class CustomerList extends java.util.AbstractList<x0101.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer>
                {
                    @Override
                    public x0101.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer get(int i)
                        { return MasterFilesImpl.this.getCustomerArray(i); }
                    
                    @Override
                    public x0101.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer set(int i, x0101.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer o)
                    {
                      x0101.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer old = MasterFilesImpl.this.getCustomerArray(i);
                      MasterFilesImpl.this.setCustomerArray(i, o);
                      return old;
                    }
                    
                    @Override
                    public void add(int i, x0101.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer o)
                        { MasterFilesImpl.this.insertNewCustomer(i).set(o); }
                    
                    @Override
                    public x0101.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer remove(int i)
                    {
                      x0101.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer old = MasterFilesImpl.this.getCustomerArray(i);
                      MasterFilesImpl.this.removeCustomer(i);
                      return old;
                    }
                    
                    @Override
                    public int size()
                        { return MasterFilesImpl.this.sizeOfCustomerArray(); }
                    
                }
                
                synchronized (monitor())
                {
                    check_orphaned();
                    return new CustomerList();
                }
            }
            
            /**
             * Gets array of all "Customer" elements
             * @deprecated
             */
            @Deprecated
            public x0101.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer[] getCustomerArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List<x0101.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer> targetList = new java.util.ArrayList<x0101.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer>();
                    get_store().find_all_element_users(CUSTOMER$2, targetList);
                    x0101.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer[] result = new x0101.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Customer" element
             */
            public x0101.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer getCustomerArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0101.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer target = null;
                    target = (x0101.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer)get_store().find_element_user(CUSTOMER$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Customer" element
             */
            public int sizeOfCustomerArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(CUSTOMER$2);
                }
            }
            
            /**
             * Sets array of all "Customer" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setCustomerArray(x0101.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer[] customerArray)
            {
                check_orphaned();
                arraySetterHelper(customerArray, CUSTOMER$2);
            }
            
            /**
             * Sets ith "Customer" element
             */
            public void setCustomerArray(int i, x0101.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer customer)
            {
                generatedSetterHelperImpl(customer, CUSTOMER$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Customer" element
             */
            public x0101.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer insertNewCustomer(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0101.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer target = null;
                    target = (x0101.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer)get_store().insert_element_user(CUSTOMER$2, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Customer" element
             */
            public x0101.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer addNewCustomer()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0101.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer target = null;
                    target = (x0101.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer)get_store().add_element_user(CUSTOMER$2);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Customer" element
             */
            public void removeCustomer(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(CUSTOMER$2, i);
                }
            }
            
            /**
             * Gets a List of "Supplier" elements
             */
            public java.util.List<x0101.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier> getSupplierList()
            {
                final class SupplierList extends java.util.AbstractList<x0101.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier>
                {
                    @Override
                    public x0101.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier get(int i)
                        { return MasterFilesImpl.this.getSupplierArray(i); }
                    
                    @Override
                    public x0101.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier set(int i, x0101.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier o)
                    {
                      x0101.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier old = MasterFilesImpl.this.getSupplierArray(i);
                      MasterFilesImpl.this.setSupplierArray(i, o);
                      return old;
                    }
                    
                    @Override
                    public void add(int i, x0101.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier o)
                        { MasterFilesImpl.this.insertNewSupplier(i).set(o); }
                    
                    @Override
                    public x0101.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier remove(int i)
                    {
                      x0101.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier old = MasterFilesImpl.this.getSupplierArray(i);
                      MasterFilesImpl.this.removeSupplier(i);
                      return old;
                    }
                    
                    @Override
                    public int size()
                        { return MasterFilesImpl.this.sizeOfSupplierArray(); }
                    
                }
                
                synchronized (monitor())
                {
                    check_orphaned();
                    return new SupplierList();
                }
            }
            
            /**
             * Gets array of all "Supplier" elements
             * @deprecated
             */
            @Deprecated
            public x0101.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier[] getSupplierArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List<x0101.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier> targetList = new java.util.ArrayList<x0101.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier>();
                    get_store().find_all_element_users(SUPPLIER$4, targetList);
                    x0101.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier[] result = new x0101.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Supplier" element
             */
            public x0101.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier getSupplierArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0101.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier target = null;
                    target = (x0101.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier)get_store().find_element_user(SUPPLIER$4, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Supplier" element
             */
            public int sizeOfSupplierArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SUPPLIER$4);
                }
            }
            
            /**
             * Sets array of all "Supplier" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setSupplierArray(x0101.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier[] supplierArray)
            {
                check_orphaned();
                arraySetterHelper(supplierArray, SUPPLIER$4);
            }
            
            /**
             * Sets ith "Supplier" element
             */
            public void setSupplierArray(int i, x0101.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier supplier)
            {
                generatedSetterHelperImpl(supplier, SUPPLIER$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Supplier" element
             */
            public x0101.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier insertNewSupplier(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0101.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier target = null;
                    target = (x0101.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier)get_store().insert_element_user(SUPPLIER$4, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Supplier" element
             */
            public x0101.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier addNewSupplier()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0101.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier target = null;
                    target = (x0101.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier)get_store().add_element_user(SUPPLIER$4);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Supplier" element
             */
            public void removeSupplier(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SUPPLIER$4, i);
                }
            }
            
            /**
             * Gets a List of "Product" elements
             */
            public java.util.List<x0101.oecdStandardAuditFileTaxPT1.ProductDocument.Product> getProductList()
            {
                final class ProductList extends java.util.AbstractList<x0101.oecdStandardAuditFileTaxPT1.ProductDocument.Product>
                {
                    @Override
                    public x0101.oecdStandardAuditFileTaxPT1.ProductDocument.Product get(int i)
                        { return MasterFilesImpl.this.getProductArray(i); }
                    
                    @Override
                    public x0101.oecdStandardAuditFileTaxPT1.ProductDocument.Product set(int i, x0101.oecdStandardAuditFileTaxPT1.ProductDocument.Product o)
                    {
                      x0101.oecdStandardAuditFileTaxPT1.ProductDocument.Product old = MasterFilesImpl.this.getProductArray(i);
                      MasterFilesImpl.this.setProductArray(i, o);
                      return old;
                    }
                    
                    @Override
                    public void add(int i, x0101.oecdStandardAuditFileTaxPT1.ProductDocument.Product o)
                        { MasterFilesImpl.this.insertNewProduct(i).set(o); }
                    
                    @Override
                    public x0101.oecdStandardAuditFileTaxPT1.ProductDocument.Product remove(int i)
                    {
                      x0101.oecdStandardAuditFileTaxPT1.ProductDocument.Product old = MasterFilesImpl.this.getProductArray(i);
                      MasterFilesImpl.this.removeProduct(i);
                      return old;
                    }
                    
                    @Override
                    public int size()
                        { return MasterFilesImpl.this.sizeOfProductArray(); }
                    
                }
                
                synchronized (monitor())
                {
                    check_orphaned();
                    return new ProductList();
                }
            }
            
            /**
             * Gets array of all "Product" elements
             * @deprecated
             */
            @Deprecated
            public x0101.oecdStandardAuditFileTaxPT1.ProductDocument.Product[] getProductArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List<x0101.oecdStandardAuditFileTaxPT1.ProductDocument.Product> targetList = new java.util.ArrayList<x0101.oecdStandardAuditFileTaxPT1.ProductDocument.Product>();
                    get_store().find_all_element_users(PRODUCT$6, targetList);
                    x0101.oecdStandardAuditFileTaxPT1.ProductDocument.Product[] result = new x0101.oecdStandardAuditFileTaxPT1.ProductDocument.Product[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Product" element
             */
            public x0101.oecdStandardAuditFileTaxPT1.ProductDocument.Product getProductArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0101.oecdStandardAuditFileTaxPT1.ProductDocument.Product target = null;
                    target = (x0101.oecdStandardAuditFileTaxPT1.ProductDocument.Product)get_store().find_element_user(PRODUCT$6, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Product" element
             */
            public int sizeOfProductArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PRODUCT$6);
                }
            }
            
            /**
             * Sets array of all "Product" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setProductArray(x0101.oecdStandardAuditFileTaxPT1.ProductDocument.Product[] productArray)
            {
                check_orphaned();
                arraySetterHelper(productArray, PRODUCT$6);
            }
            
            /**
             * Sets ith "Product" element
             */
            public void setProductArray(int i, x0101.oecdStandardAuditFileTaxPT1.ProductDocument.Product product)
            {
                generatedSetterHelperImpl(product, PRODUCT$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Product" element
             */
            public x0101.oecdStandardAuditFileTaxPT1.ProductDocument.Product insertNewProduct(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0101.oecdStandardAuditFileTaxPT1.ProductDocument.Product target = null;
                    target = (x0101.oecdStandardAuditFileTaxPT1.ProductDocument.Product)get_store().insert_element_user(PRODUCT$6, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Product" element
             */
            public x0101.oecdStandardAuditFileTaxPT1.ProductDocument.Product addNewProduct()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0101.oecdStandardAuditFileTaxPT1.ProductDocument.Product target = null;
                    target = (x0101.oecdStandardAuditFileTaxPT1.ProductDocument.Product)get_store().add_element_user(PRODUCT$6);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Product" element
             */
            public void removeProduct(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PRODUCT$6, i);
                }
            }
            
            /**
             * Gets a List of "TaxTable" elements
             */
            public java.util.List<x0101.oecdStandardAuditFileTaxPT1.TaxTableDocument.TaxTable> getTaxTableList()
            {
                final class TaxTableList extends java.util.AbstractList<x0101.oecdStandardAuditFileTaxPT1.TaxTableDocument.TaxTable>
                {
                    @Override
                    public x0101.oecdStandardAuditFileTaxPT1.TaxTableDocument.TaxTable get(int i)
                        { return MasterFilesImpl.this.getTaxTableArray(i); }
                    
                    @Override
                    public x0101.oecdStandardAuditFileTaxPT1.TaxTableDocument.TaxTable set(int i, x0101.oecdStandardAuditFileTaxPT1.TaxTableDocument.TaxTable o)
                    {
                      x0101.oecdStandardAuditFileTaxPT1.TaxTableDocument.TaxTable old = MasterFilesImpl.this.getTaxTableArray(i);
                      MasterFilesImpl.this.setTaxTableArray(i, o);
                      return old;
                    }
                    
                    @Override
                    public void add(int i, x0101.oecdStandardAuditFileTaxPT1.TaxTableDocument.TaxTable o)
                        { MasterFilesImpl.this.insertNewTaxTable(i).set(o); }
                    
                    @Override
                    public x0101.oecdStandardAuditFileTaxPT1.TaxTableDocument.TaxTable remove(int i)
                    {
                      x0101.oecdStandardAuditFileTaxPT1.TaxTableDocument.TaxTable old = MasterFilesImpl.this.getTaxTableArray(i);
                      MasterFilesImpl.this.removeTaxTable(i);
                      return old;
                    }
                    
                    @Override
                    public int size()
                        { return MasterFilesImpl.this.sizeOfTaxTableArray(); }
                    
                }
                
                synchronized (monitor())
                {
                    check_orphaned();
                    return new TaxTableList();
                }
            }
            
            /**
             * Gets array of all "TaxTable" elements
             * @deprecated
             */
            @Deprecated
            public x0101.oecdStandardAuditFileTaxPT1.TaxTableDocument.TaxTable[] getTaxTableArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List<x0101.oecdStandardAuditFileTaxPT1.TaxTableDocument.TaxTable> targetList = new java.util.ArrayList<x0101.oecdStandardAuditFileTaxPT1.TaxTableDocument.TaxTable>();
                    get_store().find_all_element_users(TAXTABLE$8, targetList);
                    x0101.oecdStandardAuditFileTaxPT1.TaxTableDocument.TaxTable[] result = new x0101.oecdStandardAuditFileTaxPT1.TaxTableDocument.TaxTable[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "TaxTable" element
             */
            public x0101.oecdStandardAuditFileTaxPT1.TaxTableDocument.TaxTable getTaxTableArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0101.oecdStandardAuditFileTaxPT1.TaxTableDocument.TaxTable target = null;
                    target = (x0101.oecdStandardAuditFileTaxPT1.TaxTableDocument.TaxTable)get_store().find_element_user(TAXTABLE$8, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "TaxTable" element
             */
            public int sizeOfTaxTableArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(TAXTABLE$8);
                }
            }
            
            /**
             * Sets array of all "TaxTable" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setTaxTableArray(x0101.oecdStandardAuditFileTaxPT1.TaxTableDocument.TaxTable[] taxTableArray)
            {
                check_orphaned();
                arraySetterHelper(taxTableArray, TAXTABLE$8);
            }
            
            /**
             * Sets ith "TaxTable" element
             */
            public void setTaxTableArray(int i, x0101.oecdStandardAuditFileTaxPT1.TaxTableDocument.TaxTable taxTable)
            {
                generatedSetterHelperImpl(taxTable, TAXTABLE$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "TaxTable" element
             */
            public x0101.oecdStandardAuditFileTaxPT1.TaxTableDocument.TaxTable insertNewTaxTable(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0101.oecdStandardAuditFileTaxPT1.TaxTableDocument.TaxTable target = null;
                    target = (x0101.oecdStandardAuditFileTaxPT1.TaxTableDocument.TaxTable)get_store().insert_element_user(TAXTABLE$8, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "TaxTable" element
             */
            public x0101.oecdStandardAuditFileTaxPT1.TaxTableDocument.TaxTable addNewTaxTable()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0101.oecdStandardAuditFileTaxPT1.TaxTableDocument.TaxTable target = null;
                    target = (x0101.oecdStandardAuditFileTaxPT1.TaxTableDocument.TaxTable)get_store().add_element_user(TAXTABLE$8);
                    return target;
                }
            }
            
            /**
             * Removes the ith "TaxTable" element
             */
            public void removeTaxTable(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(TAXTABLE$8, i);
                }
            }
        }
    }
}
