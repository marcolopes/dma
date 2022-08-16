/*
 * An XML document type.
 * Localname: EndDate
 * Namespace: urn:StockFile:PT_1_02
 * Java type: stockFilePT102.EndDateDocument
 *
 * Automatically generated - do not modify.
 */
package stockFilePT102.impl;
/**
 * A document containing one EndDate(@urn:StockFile:PT_1_02) element.
 *
 * This is a complex type.
 */
public class EndDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements stockFilePT102.EndDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public EndDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENDDATE$0 = 
        new javax.xml.namespace.QName("urn:StockFile:PT_1_02", "EndDate");
    
    
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
    public stockFilePT102.SAFPTDateSpan xgetEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            stockFilePT102.SAFPTDateSpan target = null;
            target = (stockFilePT102.SAFPTDateSpan)get_store().find_element_user(ENDDATE$0, 0);
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
    public void xsetEndDate(stockFilePT102.SAFPTDateSpan endDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            stockFilePT102.SAFPTDateSpan target = null;
            target = (stockFilePT102.SAFPTDateSpan)get_store().find_element_user(ENDDATE$0, 0);
            if (target == null)
            {
                target = (stockFilePT102.SAFPTDateSpan)get_store().add_element_user(ENDDATE$0);
            }
            target.set(endDate);
        }
    }
}
