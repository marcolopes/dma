/*
 * An XML document type.
 * Localname: OpeningDebitBalance
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.OpeningDebitBalanceDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one OpeningDebitBalance(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class OpeningDebitBalanceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.OpeningDebitBalanceDocument
{
    private static final long serialVersionUID = 1L;
    
    public OpeningDebitBalanceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPENINGDEBITBALANCE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "OpeningDebitBalance");
    
    
    /**
     * Gets the "OpeningDebitBalance" element
     */
    public java.math.BigDecimal getOpeningDebitBalance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPENINGDEBITBALANCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "OpeningDebitBalance" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetOpeningDebitBalance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(OPENINGDEBITBALANCE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OpeningDebitBalance" element
     */
    public void setOpeningDebitBalance(java.math.BigDecimal openingDebitBalance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPENINGDEBITBALANCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPENINGDEBITBALANCE$0);
            }
            target.setBigDecimalValue(openingDebitBalance);
        }
    }
    
    /**
     * Sets (as xml) the "OpeningDebitBalance" element
     */
    public void xsetOpeningDebitBalance(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType openingDebitBalance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(OPENINGDEBITBALANCE$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(OPENINGDEBITBALANCE$0);
            }
            target.set(openingDebitBalance);
        }
    }
}
