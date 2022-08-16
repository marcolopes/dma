/*
 * An XML document type.
 * Localname: EndDate
 * Namespace: urn:StockFile:PT_1_01
 * Java type: stockFilePT101.EndDateDocument
 *
 * Automatically generated - do not modify.
 */
package stockFilePT101.impl;
/**
 * A document containing one EndDate(@urn:StockFile:PT_1_01) element.
 *
 * This is a complex type.
 */
public class EndDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements stockFilePT101.EndDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public EndDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENDDATE$0 = 
        new javax.xml.namespace.QName("urn:StockFile:PT_1_01", "EndDate");
    
    
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
    public stockFilePT101.SAFPTDateSpan xgetEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            stockFilePT101.SAFPTDateSpan target = null;
            target = (stockFilePT101.SAFPTDateSpan)get_store().find_element_user(ENDDATE$0, 0);
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
    public void xsetEndDate(stockFilePT101.SAFPTDateSpan endDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            stockFilePT101.SAFPTDateSpan target = null;
            target = (stockFilePT101.SAFPTDateSpan)get_store().find_element_user(ENDDATE$0, 0);
            if (target == null)
            {
                target = (stockFilePT101.SAFPTDateSpan)get_store().add_element_user(ENDDATE$0);
            }
            target.set(endDate);
        }
    }
}
