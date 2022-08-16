/*
 * An XML document type.
 * Localname: DebitAmount
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.01_01
 * Java type: x0101.oecdStandardAuditFileTaxPT1.DebitAmountDocument
 *
 * Automatically generated - do not modify.
 */
package x0101.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one DebitAmount(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01) element.
 *
 * This is a complex type.
 */
public class DebitAmountDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.DebitAmountDocument
{
    private static final long serialVersionUID = 1L;
    
    public DebitAmountDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEBITAMOUNT$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "DebitAmount");
    
    
    /**
     * Gets the "DebitAmount" element
     */
    public java.math.BigDecimal getDebitAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEBITAMOUNT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "DebitAmount" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetDebitAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(DEBITAMOUNT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DebitAmount" element
     */
    public void setDebitAmount(java.math.BigDecimal debitAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEBITAMOUNT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEBITAMOUNT$0);
            }
            target.setBigDecimalValue(debitAmount);
        }
    }
    
    /**
     * Sets (as xml) the "DebitAmount" element
     */
    public void xsetDebitAmount(x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType debitAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(DEBITAMOUNT$0, 0);
            if (target == null)
            {
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(DEBITAMOUNT$0);
            }
            target.set(debitAmount);
        }
    }
}
