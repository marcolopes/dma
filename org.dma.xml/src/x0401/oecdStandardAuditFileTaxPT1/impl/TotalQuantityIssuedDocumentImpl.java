/*
 * An XML document type.
 * Localname: TotalQuantityIssued
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.TotalQuantityIssuedDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one TotalQuantityIssued(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class TotalQuantityIssuedDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.TotalQuantityIssuedDocument
{
    private static final long serialVersionUID = 1L;
    
    public TotalQuantityIssuedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOTALQUANTITYISSUED$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TotalQuantityIssued");
    
    
    /**
     * Gets the "TotalQuantityIssued" element
     */
    public java.math.BigDecimal getTotalQuantityIssued()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALQUANTITYISSUED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "TotalQuantityIssued" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType xgetTotalQuantityIssued()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType)get_store().find_element_user(TOTALQUANTITYISSUED$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TotalQuantityIssued" element
     */
    public void setTotalQuantityIssued(java.math.BigDecimal totalQuantityIssued)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALQUANTITYISSUED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALQUANTITYISSUED$0);
            }
            target.setBigDecimalValue(totalQuantityIssued);
        }
    }
    
    /**
     * Sets (as xml) the "TotalQuantityIssued" element
     */
    public void xsetTotalQuantityIssued(x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType totalQuantityIssued)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType)get_store().find_element_user(TOTALQUANTITYISSUED$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType)get_store().add_element_user(TOTALQUANTITYISSUED$0);
            }
            target.set(totalQuantityIssued);
        }
    }
}
