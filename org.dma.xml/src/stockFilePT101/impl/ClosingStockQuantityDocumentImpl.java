/*
 * An XML document type.
 * Localname: ClosingStockQuantity
 * Namespace: urn:StockFile:PT_1_01
 * Java type: stockFilePT101.ClosingStockQuantityDocument
 *
 * Automatically generated - do not modify.
 */
package stockFilePT101.impl;
/**
 * A document containing one ClosingStockQuantity(@urn:StockFile:PT_1_01) element.
 *
 * This is a complex type.
 */
public class ClosingStockQuantityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements stockFilePT101.ClosingStockQuantityDocument
{
    private static final long serialVersionUID = 1L;
    
    public ClosingStockQuantityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLOSINGSTOCKQUANTITY$0 = 
        new javax.xml.namespace.QName("urn:StockFile:PT_1_01", "ClosingStockQuantity");
    
    
    /**
     * Gets the "ClosingStockQuantity" element
     */
    public java.math.BigDecimal getClosingStockQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSINGSTOCKQUANTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "ClosingStockQuantity" element
     */
    public stockFilePT101.SAFdecimalType xgetClosingStockQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            stockFilePT101.SAFdecimalType target = null;
            target = (stockFilePT101.SAFdecimalType)get_store().find_element_user(CLOSINGSTOCKQUANTITY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ClosingStockQuantity" element
     */
    public void setClosingStockQuantity(java.math.BigDecimal closingStockQuantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSINGSTOCKQUANTITY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLOSINGSTOCKQUANTITY$0);
            }
            target.setBigDecimalValue(closingStockQuantity);
        }
    }
    
    /**
     * Sets (as xml) the "ClosingStockQuantity" element
     */
    public void xsetClosingStockQuantity(stockFilePT101.SAFdecimalType closingStockQuantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            stockFilePT101.SAFdecimalType target = null;
            target = (stockFilePT101.SAFdecimalType)get_store().find_element_user(CLOSINGSTOCKQUANTITY$0, 0);
            if (target == null)
            {
                target = (stockFilePT101.SAFdecimalType)get_store().add_element_user(CLOSINGSTOCKQUANTITY$0);
            }
            target.set(closingStockQuantity);
        }
    }
}
