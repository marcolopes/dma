/*
 * An XML document type.
 * Localname: ClosingDebitBalance
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.ClosingDebitBalanceDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one ClosingDebitBalance(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class ClosingDebitBalanceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.ClosingDebitBalanceDocument
{
    private static final long serialVersionUID = 1L;
    
    public ClosingDebitBalanceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLOSINGDEBITBALANCE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "ClosingDebitBalance");
    
    
    /**
     * Gets the "ClosingDebitBalance" element
     */
    public java.math.BigDecimal getClosingDebitBalance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSINGDEBITBALANCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "ClosingDebitBalance" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetClosingDebitBalance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(CLOSINGDEBITBALANCE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ClosingDebitBalance" element
     */
    public void setClosingDebitBalance(java.math.BigDecimal closingDebitBalance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSINGDEBITBALANCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLOSINGDEBITBALANCE$0);
            }
            target.setBigDecimalValue(closingDebitBalance);
        }
    }
    
    /**
     * Sets (as xml) the "ClosingDebitBalance" element
     */
    public void xsetClosingDebitBalance(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType closingDebitBalance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(CLOSINGDEBITBALANCE$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(CLOSINGDEBITBALANCE$0);
            }
            target.set(closingDebitBalance);
        }
    }
}
