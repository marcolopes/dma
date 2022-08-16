/*
 * An XML document type.
 * Localname: StockFile
 * Namespace: urn:StockFile:PT_1_01
 * Java type: stockFilePT101.StockFileDocument
 *
 * Automatically generated - do not modify.
 */
package stockFilePT101.impl;
/**
 * A document containing one StockFile(@urn:StockFile:PT_1_01) element.
 *
 * This is a complex type.
 */
public class StockFileDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements stockFilePT101.StockFileDocument
{
    private static final long serialVersionUID = 1L;
    
    public StockFileDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STOCKFILE$0 = 
        new javax.xml.namespace.QName("urn:StockFile:PT_1_01", "StockFile");
    
    
    /**
     * Gets the "StockFile" element
     */
    public stockFilePT101.StockFileDocument.StockFile getStockFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            stockFilePT101.StockFileDocument.StockFile target = null;
            target = (stockFilePT101.StockFileDocument.StockFile)get_store().find_element_user(STOCKFILE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StockFile" element
     */
    public void setStockFile(stockFilePT101.StockFileDocument.StockFile stockFile)
    {
        generatedSetterHelperImpl(stockFile, STOCKFILE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "StockFile" element
     */
    public stockFilePT101.StockFileDocument.StockFile addNewStockFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            stockFilePT101.StockFileDocument.StockFile target = null;
            target = (stockFilePT101.StockFileDocument.StockFile)get_store().add_element_user(STOCKFILE$0);
            return target;
        }
    }
    /**
     * An XML StockFile(@urn:StockFile:PT_1_01).
     *
     * This is a complex type.
     */
    public static class StockFileImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements stockFilePT101.StockFileDocument.StockFile
    {
        private static final long serialVersionUID = 1L;
        
        public StockFileImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STOCKHEADER$0 = 
            new javax.xml.namespace.QName("urn:StockFile:PT_1_01", "StockHeader");
        private static final javax.xml.namespace.QName STOCK$2 = 
            new javax.xml.namespace.QName("urn:StockFile:PT_1_01", "Stock");
        
        
        /**
         * Gets the "StockHeader" element
         */
        public stockFilePT101.StockHeaderDocument.StockHeader getStockHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                stockFilePT101.StockHeaderDocument.StockHeader target = null;
                target = (stockFilePT101.StockHeaderDocument.StockHeader)get_store().find_element_user(STOCKHEADER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "StockHeader" element
         */
        public void setStockHeader(stockFilePT101.StockHeaderDocument.StockHeader stockHeader)
        {
            generatedSetterHelperImpl(stockHeader, STOCKHEADER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "StockHeader" element
         */
        public stockFilePT101.StockHeaderDocument.StockHeader addNewStockHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                stockFilePT101.StockHeaderDocument.StockHeader target = null;
                target = (stockFilePT101.StockHeaderDocument.StockHeader)get_store().add_element_user(STOCKHEADER$0);
                return target;
            }
        }
        
        /**
         * Gets a List of "Stock" elements
         */
        public java.util.List<stockFilePT101.StockDocument.Stock> getStockList()
        {
            final class StockList extends java.util.AbstractList<stockFilePT101.StockDocument.Stock>
            {
                @Override
                public stockFilePT101.StockDocument.Stock get(int i)
                    { return StockFileImpl.this.getStockArray(i); }
                
                @Override
                public stockFilePT101.StockDocument.Stock set(int i, stockFilePT101.StockDocument.Stock o)
                {
                    stockFilePT101.StockDocument.Stock old = StockFileImpl.this.getStockArray(i);
                    StockFileImpl.this.setStockArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, stockFilePT101.StockDocument.Stock o)
                    { StockFileImpl.this.insertNewStock(i).set(o); }
                
                @Override
                public stockFilePT101.StockDocument.Stock remove(int i)
                {
                    stockFilePT101.StockDocument.Stock old = StockFileImpl.this.getStockArray(i);
                    StockFileImpl.this.removeStock(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return StockFileImpl.this.sizeOfStockArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new StockList();
            }
        }
        
        /**
         * Gets array of all "Stock" elements
         * @deprecated
         */
        @Deprecated
        public stockFilePT101.StockDocument.Stock[] getStockArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<stockFilePT101.StockDocument.Stock> targetList = new java.util.ArrayList<stockFilePT101.StockDocument.Stock>();
                get_store().find_all_element_users(STOCK$2, targetList);
                stockFilePT101.StockDocument.Stock[] result = new stockFilePT101.StockDocument.Stock[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Stock" element
         */
        public stockFilePT101.StockDocument.Stock getStockArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                stockFilePT101.StockDocument.Stock target = null;
                target = (stockFilePT101.StockDocument.Stock)get_store().find_element_user(STOCK$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Stock" element
         */
        public int sizeOfStockArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STOCK$2);
            }
        }
        
        /**
         * Sets array of all "Stock" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setStockArray(stockFilePT101.StockDocument.Stock[] stockArray)
        {
            check_orphaned();
            arraySetterHelper(stockArray, STOCK$2);
        }
        
        /**
         * Sets ith "Stock" element
         */
        public void setStockArray(int i, stockFilePT101.StockDocument.Stock stock)
        {
            generatedSetterHelperImpl(stock, STOCK$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Stock" element
         */
        public stockFilePT101.StockDocument.Stock insertNewStock(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                stockFilePT101.StockDocument.Stock target = null;
                target = (stockFilePT101.StockDocument.Stock)get_store().insert_element_user(STOCK$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Stock" element
         */
        public stockFilePT101.StockDocument.Stock addNewStock()
        {
            synchronized (monitor())
            {
                check_orphaned();
                stockFilePT101.StockDocument.Stock target = null;
                target = (stockFilePT101.StockDocument.Stock)get_store().add_element_user(STOCK$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "Stock" element
         */
        public void removeStock(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STOCK$2, i);
            }
        }
    }
}
