/*
 * An XML document type.
 * Localname: OrderDate
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.01_01
 * Java type: x0101.oecdStandardAuditFileTaxPT1.OrderDateDocument
 *
 * Automatically generated - do not modify.
 */
package x0101.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one OrderDate(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01) element.
 *
 * This is a complex type.
 */
public class OrderDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.OrderDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrderDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERDATE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "OrderDate");
    
    
    /**
     * Gets the "OrderDate" element
     */
    public java.util.Calendar getOrderDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrderDate" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.SAFdateType xgetOrderDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(ORDERDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OrderDate" element
     */
    public void setOrderDate(java.util.Calendar orderDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERDATE$0);
            }
            target.setCalendarValue(orderDate);
        }
    }
    
    /**
     * Sets (as xml) the "OrderDate" element
     */
    public void xsetOrderDate(x0101.oecdStandardAuditFileTaxPT1.SAFdateType orderDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(ORDERDATE$0, 0);
            if (target == null)
            {
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().add_element_user(ORDERDATE$0);
            }
            target.set(orderDate);
        }
    }
}
