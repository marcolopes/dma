/*
 * An XML document type.
 * Localname: ClosingStockValue
 * Namespace: urn:StockFile:PT_2_01
 * Java type: stockFilePT201.ClosingStockValueDocument
 *
 * Automatically generated - do not modify.
 */
package stockFilePT201.impl;
/**
 * A document containing one ClosingStockValue(@urn:StockFile:PT_2_01) element.
 *
 * This is a complex type.
 */
public class ClosingStockValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements stockFilePT201.ClosingStockValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public ClosingStockValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLOSINGSTOCKVALUE$0 = 
        new javax.xml.namespace.QName("urn:StockFile:PT_2_01", "ClosingStockValue");
    
    
    /**
     * Gets the "ClosingStockValue" element
     */
    public java.math.BigDecimal getClosingStockValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSINGSTOCKVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "ClosingStockValue" element
     */
    public stockFilePT201.SAFdecimalType xgetClosingStockValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            stockFilePT201.SAFdecimalType target = null;
            target = (stockFilePT201.SAFdecimalType)get_store().find_element_user(CLOSINGSTOCKVALUE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ClosingStockValue" element
     */
    public void setClosingStockValue(java.math.BigDecimal closingStockValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSINGSTOCKVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLOSINGSTOCKVALUE$0);
            }
            target.setBigDecimalValue(closingStockValue);
        }
    }
    
    /**
     * Sets (as xml) the "ClosingStockValue" element
     */
    public void xsetClosingStockValue(stockFilePT201.SAFdecimalType closingStockValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            stockFilePT201.SAFdecimalType target = null;
            target = (stockFilePT201.SAFdecimalType)get_store().find_element_user(CLOSINGSTOCKVALUE$0, 0);
            if (target == null)
            {
                target = (stockFilePT201.SAFdecimalType)get_store().add_element_user(CLOSINGSTOCKVALUE$0);
            }
            target.set(closingStockValue);
        }
    }
}
