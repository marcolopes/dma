/*
 * An XML document type.
 * Localname: TotalCredit
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.01_01
 * Java type: x0101.oecdStandardAuditFileTaxPT1.TotalCreditDocument
 *
 * Automatically generated - do not modify.
 */
package x0101.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one TotalCredit(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01) element.
 *
 * This is a complex type.
 */
public class TotalCreditDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.TotalCreditDocument
{
    private static final long serialVersionUID = 1L;
    
    public TotalCreditDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOTALCREDIT$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "TotalCredit");
    
    
    /**
     * Gets the "TotalCredit" element
     */
    public java.math.BigDecimal getTotalCredit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALCREDIT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "TotalCredit" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetTotalCredit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TOTALCREDIT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TotalCredit" element
     */
    public void setTotalCredit(java.math.BigDecimal totalCredit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALCREDIT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALCREDIT$0);
            }
            target.setBigDecimalValue(totalCredit);
        }
    }
    
    /**
     * Sets (as xml) the "TotalCredit" element
     */
    public void xsetTotalCredit(x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType totalCredit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TOTALCREDIT$0, 0);
            if (target == null)
            {
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(TOTALCREDIT$0);
            }
            target.set(totalCredit);
        }
    }
}
