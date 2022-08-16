/*
 * An XML document type.
 * Localname: UnitPrice
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.UnitPriceDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one UnitPrice(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class UnitPriceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.UnitPriceDocument
{
    private static final long serialVersionUID = 1L;
    
    public UnitPriceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNITPRICE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "UnitPrice");
    
    
    /**
     * Gets the "UnitPrice" element
     */
    public java.math.BigDecimal getUnitPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITPRICE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "UnitPrice" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetUnitPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(UNITPRICE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "UnitPrice" element
     */
    public void setUnitPrice(java.math.BigDecimal unitPrice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITPRICE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNITPRICE$0);
            }
            target.setBigDecimalValue(unitPrice);
        }
    }
    
    /**
     * Sets (as xml) the "UnitPrice" element
     */
    public void xsetUnitPrice(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType unitPrice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(UNITPRICE$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(UNITPRICE$0);
            }
            target.set(unitPrice);
        }
    }
}
