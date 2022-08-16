/*
 * An XML document type.
 * Localname: ProductCategory
 * Namespace: urn:StockFile:PT_1_02
 * Java type: stockFilePT102.ProductCategoryDocument
 *
 * Automatically generated - do not modify.
 */
package stockFilePT102.impl;
/**
 * A document containing one ProductCategory(@urn:StockFile:PT_1_02) element.
 *
 * This is a complex type.
 */
public class ProductCategoryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements stockFilePT102.ProductCategoryDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProductCategoryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTCATEGORY$0 = 
        new javax.xml.namespace.QName("urn:StockFile:PT_1_02", "ProductCategory");
    
    
    /**
     * Gets the "ProductCategory" element
     */
    public stockFilePT102.ProductCategoryDocument.ProductCategory.Enum getProductCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCATEGORY$0, 0);
            if (target == null)
            {
                return null;
            }
            return (stockFilePT102.ProductCategoryDocument.ProductCategory.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductCategory" element
     */
    public stockFilePT102.ProductCategoryDocument.ProductCategory xgetProductCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            stockFilePT102.ProductCategoryDocument.ProductCategory target = null;
            target = (stockFilePT102.ProductCategoryDocument.ProductCategory)get_store().find_element_user(PRODUCTCATEGORY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ProductCategory" element
     */
    public void setProductCategory(stockFilePT102.ProductCategoryDocument.ProductCategory.Enum productCategory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCATEGORY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTCATEGORY$0);
            }
            target.setEnumValue(productCategory);
        }
    }
    
    /**
     * Sets (as xml) the "ProductCategory" element
     */
    public void xsetProductCategory(stockFilePT102.ProductCategoryDocument.ProductCategory productCategory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            stockFilePT102.ProductCategoryDocument.ProductCategory target = null;
            target = (stockFilePT102.ProductCategoryDocument.ProductCategory)get_store().find_element_user(PRODUCTCATEGORY$0, 0);
            if (target == null)
            {
                target = (stockFilePT102.ProductCategoryDocument.ProductCategory)get_store().add_element_user(PRODUCTCATEGORY$0);
            }
            target.set(productCategory);
        }
    }
    /**
     * An XML ProductCategory(@urn:StockFile:PT_1_02).
     *
     * This is an atomic type that is a restriction of stockFilePT102.ProductCategoryDocument$ProductCategory.
     */
    public static class ProductCategoryImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements stockFilePT102.ProductCategoryDocument.ProductCategory
    {
        private static final long serialVersionUID = 1L;
        
        public ProductCategoryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ProductCategoryImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
