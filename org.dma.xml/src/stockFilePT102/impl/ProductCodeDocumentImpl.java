/*
 * An XML document type.
 * Localname: ProductCode
 * Namespace: urn:StockFile:PT_1_02
 * Java type: stockFilePT102.ProductCodeDocument
 *
 * Automatically generated - do not modify.
 */
package stockFilePT102.impl;
/**
 * A document containing one ProductCode(@urn:StockFile:PT_1_02) element.
 *
 * This is a complex type.
 */
public class ProductCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements stockFilePT102.ProductCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProductCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTCODE$0 = 
        new javax.xml.namespace.QName("urn:StockFile:PT_1_02", "ProductCode");
    
    
    /**
     * Gets the "ProductCode" element
     */
    public java.lang.String getProductCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCODE$0, 0);
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
    public stockFilePT102.SAFPTtextTypeMandatoryMax60Car xgetProductCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            stockFilePT102.SAFPTtextTypeMandatoryMax60Car target = null;
            target = (stockFilePT102.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(PRODUCTCODE$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTCODE$0);
            }
            target.setStringValue(productCode);
        }
    }
    
    /**
     * Sets (as xml) the "ProductCode" element
     */
    public void xsetProductCode(stockFilePT102.SAFPTtextTypeMandatoryMax60Car productCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            stockFilePT102.SAFPTtextTypeMandatoryMax60Car target = null;
            target = (stockFilePT102.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(PRODUCTCODE$0, 0);
            if (target == null)
            {
                target = (stockFilePT102.SAFPTtextTypeMandatoryMax60Car)get_store().add_element_user(PRODUCTCODE$0);
            }
            target.set(productCode);
        }
    }
}
