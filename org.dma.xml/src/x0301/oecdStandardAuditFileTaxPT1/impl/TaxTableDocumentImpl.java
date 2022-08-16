/*
 * An XML document type.
 * Localname: TaxTable
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.03_01
 * Java type: x0301.oecdStandardAuditFileTaxPT1.TaxTableDocument
 *
 * Automatically generated - do not modify.
 */
package x0301.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one TaxTable(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01) element.
 *
 * This is a complex type.
 */
public class TaxTableDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0301.oecdStandardAuditFileTaxPT1.TaxTableDocument
{
    private static final long serialVersionUID = 1L;
    
    public TaxTableDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TAXTABLE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "TaxTable");
    
    
    /**
     * Gets the "TaxTable" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.TaxTableDocument.TaxTable getTaxTable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.TaxTableDocument.TaxTable target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.TaxTableDocument.TaxTable)get_store().find_element_user(TAXTABLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TaxTable" element
     */
    public void setTaxTable(x0301.oecdStandardAuditFileTaxPT1.TaxTableDocument.TaxTable taxTable)
    {
        generatedSetterHelperImpl(taxTable, TAXTABLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TaxTable" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.TaxTableDocument.TaxTable addNewTaxTable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.TaxTableDocument.TaxTable target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.TaxTableDocument.TaxTable)get_store().add_element_user(TAXTABLE$0);
            return target;
        }
    }
    /**
     * An XML TaxTable(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
     *
     * This is a complex type.
     */
    public static class TaxTableImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0301.oecdStandardAuditFileTaxPT1.TaxTableDocument.TaxTable
    {
        private static final long serialVersionUID = 1L;
        
        public TaxTableImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TAXTABLEENTRY$0 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "TaxTableEntry");
        
        
        /**
         * Gets a List of "TaxTableEntry" elements
         */
        public java.util.List<x0301.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument.TaxTableEntry> getTaxTableEntryList()
        {
            final class TaxTableEntryList extends java.util.AbstractList<x0301.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument.TaxTableEntry>
            {
                @Override
                public x0301.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument.TaxTableEntry get(int i)
                    { return TaxTableImpl.this.getTaxTableEntryArray(i); }
                
                @Override
                public x0301.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument.TaxTableEntry set(int i, x0301.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument.TaxTableEntry o)
                {
                    x0301.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument.TaxTableEntry old = TaxTableImpl.this.getTaxTableEntryArray(i);
                    TaxTableImpl.this.setTaxTableEntryArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, x0301.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument.TaxTableEntry o)
                    { TaxTableImpl.this.insertNewTaxTableEntry(i).set(o); }
                
                @Override
                public x0301.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument.TaxTableEntry remove(int i)
                {
                    x0301.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument.TaxTableEntry old = TaxTableImpl.this.getTaxTableEntryArray(i);
                    TaxTableImpl.this.removeTaxTableEntry(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return TaxTableImpl.this.sizeOfTaxTableEntryArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new TaxTableEntryList();
            }
        }
        
        /**
         * Gets array of all "TaxTableEntry" elements
         * @deprecated
         */
        @Deprecated
        public x0301.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument.TaxTableEntry[] getTaxTableEntryArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<x0301.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument.TaxTableEntry> targetList = new java.util.ArrayList<x0301.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument.TaxTableEntry>();
                get_store().find_all_element_users(TAXTABLEENTRY$0, targetList);
                x0301.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument.TaxTableEntry[] result = new x0301.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument.TaxTableEntry[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "TaxTableEntry" element
         */
        public x0301.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument.TaxTableEntry getTaxTableEntryArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0301.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument.TaxTableEntry target = null;
                target = (x0301.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument.TaxTableEntry)get_store().find_element_user(TAXTABLEENTRY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "TaxTableEntry" element
         */
        public int sizeOfTaxTableEntryArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TAXTABLEENTRY$0);
            }
        }
        
        /**
         * Sets array of all "TaxTableEntry" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setTaxTableEntryArray(x0301.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument.TaxTableEntry[] taxTableEntryArray)
        {
            check_orphaned();
            arraySetterHelper(taxTableEntryArray, TAXTABLEENTRY$0);
        }
        
        /**
         * Sets ith "TaxTableEntry" element
         */
        public void setTaxTableEntryArray(int i, x0301.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument.TaxTableEntry taxTableEntry)
        {
            generatedSetterHelperImpl(taxTableEntry, TAXTABLEENTRY$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "TaxTableEntry" element
         */
        public x0301.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument.TaxTableEntry insertNewTaxTableEntry(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0301.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument.TaxTableEntry target = null;
                target = (x0301.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument.TaxTableEntry)get_store().insert_element_user(TAXTABLEENTRY$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "TaxTableEntry" element
         */
        public x0301.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument.TaxTableEntry addNewTaxTableEntry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0301.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument.TaxTableEntry target = null;
                target = (x0301.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument.TaxTableEntry)get_store().add_element_user(TAXTABLEENTRY$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "TaxTableEntry" element
         */
        public void removeTaxTableEntry(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TAXTABLEENTRY$0, i);
            }
        }
    }
}
