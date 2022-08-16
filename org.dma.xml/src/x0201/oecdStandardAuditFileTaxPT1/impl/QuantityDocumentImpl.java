/*
 * An XML document type.
 * Localname: Quantity
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.02_01
 * Java type: x0201.oecdStandardAuditFileTaxPT1.QuantityDocument
 *
 * Automatically generated - do not modify.
 */
package x0201.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one Quantity(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01) element.
 *
 * This is a complex type.
 */
public class QuantityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0201.oecdStandardAuditFileTaxPT1.QuantityDocument
{
    private static final long serialVersionUID = 1L;
    
    public QuantityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUANTITY$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "Quantity");
    
    
    /**
     * Gets the "Quantity" element
     */
    public java.math.BigDecimal getQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "Quantity" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.SAFdecimalType xgetQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFdecimalType target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFdecimalType)get_store().find_element_user(QUANTITY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Quantity" element
     */
    public void setQuantity(java.math.BigDecimal quantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTITY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUANTITY$0);
            }
            target.setBigDecimalValue(quantity);
        }
    }
    
    /**
     * Sets (as xml) the "Quantity" element
     */
    public void xsetQuantity(x0201.oecdStandardAuditFileTaxPT1.SAFdecimalType quantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFdecimalType target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFdecimalType)get_store().find_element_user(QUANTITY$0, 0);
            if (target == null)
            {
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFdecimalType)get_store().add_element_user(QUANTITY$0);
            }
            target.set(quantity);
        }
    }
}
