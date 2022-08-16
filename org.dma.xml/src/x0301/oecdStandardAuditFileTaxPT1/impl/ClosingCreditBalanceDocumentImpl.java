/*
 * An XML document type.
 * Localname: ClosingCreditBalance
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.03_01
 * Java type: x0301.oecdStandardAuditFileTaxPT1.ClosingCreditBalanceDocument
 *
 * Automatically generated - do not modify.
 */
package x0301.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one ClosingCreditBalance(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01) element.
 *
 * This is a complex type.
 */
public class ClosingCreditBalanceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0301.oecdStandardAuditFileTaxPT1.ClosingCreditBalanceDocument
{
    private static final long serialVersionUID = 1L;
    
    public ClosingCreditBalanceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLOSINGCREDITBALANCE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "ClosingCreditBalance");
    
    
    /**
     * Gets the "ClosingCreditBalance" element
     */
    public java.math.BigDecimal getClosingCreditBalance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSINGCREDITBALANCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "ClosingCreditBalance" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetClosingCreditBalance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(CLOSINGCREDITBALANCE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ClosingCreditBalance" element
     */
    public void setClosingCreditBalance(java.math.BigDecimal closingCreditBalance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSINGCREDITBALANCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLOSINGCREDITBALANCE$0);
            }
            target.setBigDecimalValue(closingCreditBalance);
        }
    }
    
    /**
     * Sets (as xml) the "ClosingCreditBalance" element
     */
    public void xsetClosingCreditBalance(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType closingCreditBalance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(CLOSINGCREDITBALANCE$0, 0);
            if (target == null)
            {
                target = (x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(CLOSINGCREDITBALANCE$0);
            }
            target.set(closingCreditBalance);
        }
    }
}
