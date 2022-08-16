/*
 * An XML document type.
 * Localname: ProductNumberCode
 * Namespace: urn:StockFile:PT_1_02
 * Java type: stockFilePT102.ProductNumberCodeDocument
 *
 * Automatically generated - do not modify.
 */
package stockFilePT102.impl;
/**
 * A document containing one ProductNumberCode(@urn:StockFile:PT_1_02) element.
 *
 * This is a complex type.
 */
public class ProductNumberCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements stockFilePT102.ProductNumberCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProductNumberCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTNUMBERCODE$0 = 
        new javax.xml.namespace.QName("urn:StockFile:PT_1_02", "ProductNumberCode");
    
    
    /**
     * Gets the "ProductNumberCode" element
     */
    public java.lang.String getProductNumberCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTNUMBERCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductNumberCode" element
     */
    public stockFilePT102.SAFPTtextTypeMandatoryMax60Car xgetProductNumberCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            stockFilePT102.SAFPTtextTypeMandatoryMax60Car target = null;
            target = (stockFilePT102.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(PRODUCTNUMBERCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ProductNumberCode" element
     */
    public void setProductNumberCode(java.lang.String productNumberCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTNUMBERCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTNUMBERCODE$0);
            }
            target.setStringValue(productNumberCode);
        }
    }
    
    /**
     * Sets (as xml) the "ProductNumberCode" element
     */
    public void xsetProductNumberCode(stockFilePT102.SAFPTtextTypeMandatoryMax60Car productNumberCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            stockFilePT102.SAFPTtextTypeMandatoryMax60Car target = null;
            target = (stockFilePT102.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(PRODUCTNUMBERCODE$0, 0);
            if (target == null)
            {
                target = (stockFilePT102.SAFPTtextTypeMandatoryMax60Car)get_store().add_element_user(PRODUCTNUMBERCODE$0);
            }
            target.set(productNumberCode);
        }
    }
}
