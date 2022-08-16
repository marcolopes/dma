/*
 * An XML document type.
 * Localname: ProductCategory
 * Namespace: urn:StockFile:PT_1_01
 * Java type: stockFilePT101.ProductCategoryDocument
 *
 * Automatically generated - do not modify.
 */
package stockFilePT101.impl;
/**
 * A document containing one ProductCategory(@urn:StockFile:PT_1_01) element.
 *
 * This is a complex type.
 */
public class ProductCategoryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements stockFilePT101.ProductCategoryDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProductCategoryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTCATEGORY$0 = 
        new javax.xml.namespace.QName("urn:StockFile:PT_1_01", "ProductCategory");
    
    
    /**
     * Gets the "ProductCategory" element
     */
    public stockFilePT101.ProductCategoryDocument.ProductCategory.Enum getProductCategory()
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
            return (stockFilePT101.ProductCategoryDocument.ProductCategory.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductCategory" element
     */
    public stockFilePT101.ProductCategoryDocument.ProductCategory xgetProductCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            stockFilePT101.ProductCategoryDocument.ProductCategory target = null;
            target = (stockFilePT101.ProductCategoryDocument.ProductCategory)get_store().find_element_user(PRODUCTCATEGORY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ProductCategory" element
     */
    public void setProductCategory(stockFilePT101.ProductCategoryDocument.ProductCategory.Enum productCategory)
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
    public void xsetProductCategory(stockFilePT101.ProductCategoryDocument.ProductCategory productCategory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            stockFilePT101.ProductCategoryDocument.ProductCategory target = null;
            target = (stockFilePT101.ProductCategoryDocument.ProductCategory)get_store().find_element_user(PRODUCTCATEGORY$0, 0);
            if (target == null)
            {
                target = (stockFilePT101.ProductCategoryDocument.ProductCategory)get_store().add_element_user(PRODUCTCATEGORY$0);
            }
            target.set(productCategory);
        }
    }
    /**
     * An XML ProductCategory(@urn:StockFile:PT_1_01).
     *
     * This is an atomic type that is a restriction of stockFilePT101.ProductCategoryDocument$ProductCategory.
     */
    public static class ProductCategoryImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements stockFilePT101.ProductCategoryDocument.ProductCategory
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
