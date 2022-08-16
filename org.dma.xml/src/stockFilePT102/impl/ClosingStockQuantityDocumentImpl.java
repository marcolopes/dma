/*
 * An XML document type.
 * Localname: ClosingStockQuantity
 * Namespace: urn:StockFile:PT_1_02
 * Java type: stockFilePT102.ClosingStockQuantityDocument
 *
 * Automatically generated - do not modify.
 */
package stockFilePT102.impl;
/**
 * A document containing one ClosingStockQuantity(@urn:StockFile:PT_1_02) element.
 *
 * This is a complex type.
 */
public class ClosingStockQuantityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements stockFilePT102.ClosingStockQuantityDocument
{
    private static final long serialVersionUID = 1L;
    
    public ClosingStockQuantityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLOSINGSTOCKQUANTITY$0 = 
        new javax.xml.namespace.QName("urn:StockFile:PT_1_02", "ClosingStockQuantity");
    
    
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
    public stockFilePT102.SAFdecimalType xgetClosingStockQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            stockFilePT102.SAFdecimalType target = null;
            target = (stockFilePT102.SAFdecimalType)get_store().find_element_user(CLOSINGSTOCKQUANTITY$0, 0);
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
    public void xsetClosingStockQuantity(stockFilePT102.SAFdecimalType closingStockQuantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            stockFilePT102.SAFdecimalType target = null;
            target = (stockFilePT102.SAFdecimalType)get_store().find_element_user(CLOSINGSTOCKQUANTITY$0, 0);
            if (target == null)
            {
                target = (stockFilePT102.SAFdecimalType)get_store().add_element_user(CLOSINGSTOCKQUANTITY$0);
            }
            target.set(closingStockQuantity);
        }
    }
}
