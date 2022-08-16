/*
 * An XML document type.
 * Localname: EndDate
 * Namespace: urn:StockFile:PT_2_01
 * Java type: stockFilePT201.EndDateDocument
 *
 * Automatically generated - do not modify.
 */
package stockFilePT201.impl;
/**
 * A document containing one EndDate(@urn:StockFile:PT_2_01) element.
 *
 * This is a complex type.
 */
public class EndDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements stockFilePT201.EndDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public EndDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENDDATE$0 = 
        new javax.xml.namespace.QName("urn:StockFile:PT_2_01", "EndDate");
    
    
    /**
     * Gets the "EndDate" element
     */
    public java.util.Calendar getEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "EndDate" element
     */
    public stockFilePT201.SAFPTDateSpan xgetEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            stockFilePT201.SAFPTDateSpan target = null;
            target = (stockFilePT201.SAFPTDateSpan)get_store().find_element_user(ENDDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "EndDate" element
     */
    public void setEndDate(java.util.Calendar endDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDDATE$0);
            }
            target.setCalendarValue(endDate);
        }
    }
    
    /**
     * Sets (as xml) the "EndDate" element
     */
    public void xsetEndDate(stockFilePT201.SAFPTDateSpan endDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            stockFilePT201.SAFPTDateSpan target = null;
            target = (stockFilePT201.SAFPTDateSpan)get_store().find_element_user(ENDDATE$0, 0);
            if (target == null)
            {
                target = (stockFilePT201.SAFPTDateSpan)get_store().add_element_user(ENDDATE$0);
            }
            target.set(endDate);
        }
    }
}
