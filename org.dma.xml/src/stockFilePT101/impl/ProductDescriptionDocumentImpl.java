/*
 * An XML document type.
 * Localname: ProductDescription
 * Namespace: urn:StockFile:PT_1_01
 * Java type: stockFilePT101.ProductDescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package stockFilePT101.impl;
/**
 * A document containing one ProductDescription(@urn:StockFile:PT_1_01) element.
 *
 * This is a complex type.
 */
public class ProductDescriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements stockFilePT101.ProductDescriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProductDescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTDESCRIPTION$0 = 
        new javax.xml.namespace.QName("urn:StockFile:PT_1_01", "ProductDescription");
    
    
    /**
     * Gets the "ProductDescription" element
     */
    public java.lang.String getProductDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTDESCRIPTION$0, 0);
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
    public stockFilePT101.SAFPTtextTypeMandatoryMax200Car xgetProductDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            stockFilePT101.SAFPTtextTypeMandatoryMax200Car target = null;
            target = (stockFilePT101.SAFPTtextTypeMandatoryMax200Car)get_store().find_element_user(PRODUCTDESCRIPTION$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTDESCRIPTION$0);
            }
            target.setStringValue(productDescription);
        }
    }
    
    /**
     * Sets (as xml) the "ProductDescription" element
     */
    public void xsetProductDescription(stockFilePT101.SAFPTtextTypeMandatoryMax200Car productDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            stockFilePT101.SAFPTtextTypeMandatoryMax200Car target = null;
            target = (stockFilePT101.SAFPTtextTypeMandatoryMax200Car)get_store().find_element_user(PRODUCTDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (stockFilePT101.SAFPTtextTypeMandatoryMax200Car)get_store().add_element_user(PRODUCTDESCRIPTION$0);
            }
            target.set(productDescription);
        }
    }
}
