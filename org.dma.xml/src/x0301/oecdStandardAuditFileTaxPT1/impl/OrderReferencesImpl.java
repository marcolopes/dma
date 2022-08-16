/*
 * XML Type:  OrderReferences
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.03_01
 * Java type: x0301.oecdStandardAuditFileTaxPT1.OrderReferences
 *
 * Automatically generated - do not modify.
 */
package x0301.oecdStandardAuditFileTaxPT1.impl;
/**
 * An XML OrderReferences(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
 *
 * This is a complex type.
 */
public class OrderReferencesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0301.oecdStandardAuditFileTaxPT1.OrderReferences
{
    private static final long serialVersionUID = 1L;
    
    public OrderReferencesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORIGINATINGON$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "OriginatingON");
    private static final javax.xml.namespace.QName ORDERDATE$2 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "OrderDate");
    
    
    /**
     * Gets the "OriginatingON" element
     */
    public java.lang.String getOriginatingON()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINATINGON$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OriginatingON" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car xgetOriginatingON()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(ORIGINATINGON$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "OriginatingON" element
     */
    public boolean isSetOriginatingON()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORIGINATINGON$0) != 0;
        }
    }
    
    /**
     * Sets the "OriginatingON" element
     */
    public void setOriginatingON(java.lang.String originatingON)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINATINGON$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORIGINATINGON$0);
            }
            target.setStringValue(originatingON);
        }
    }
    
    /**
     * Sets (as xml) the "OriginatingON" element
     */
    public void xsetOriginatingON(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car originatingON)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(ORIGINATINGON$0, 0);
            if (target == null)
            {
                target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().add_element_user(ORIGINATINGON$0);
            }
            target.set(originatingON);
        }
    }
    
    /**
     * Unsets the "OriginatingON" element
     */
    public void unsetOriginatingON()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORIGINATINGON$0, 0);
        }
    }
    
    /**
     * Gets the "OrderDate" element
     */
    public java.util.Calendar getOrderDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERDATE$2, 0);
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
    public x0301.oecdStandardAuditFileTaxPT1.SAFdateType xgetOrderDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(ORDERDATE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "OrderDate" element
     */
    public boolean isSetOrderDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERDATE$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERDATE$2);
            }
            target.setCalendarValue(orderDate);
        }
    }
    
    /**
     * Sets (as xml) the "OrderDate" element
     */
    public void xsetOrderDate(x0301.oecdStandardAuditFileTaxPT1.SAFdateType orderDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(ORDERDATE$2, 0);
            if (target == null)
            {
                target = (x0301.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().add_element_user(ORDERDATE$2);
            }
            target.set(orderDate);
        }
    }
    
    /**
     * Unsets the "OrderDate" element
     */
    public void unsetOrderDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERDATE$2, 0);
        }
    }
}
