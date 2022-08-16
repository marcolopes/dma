/*
 * An XML document type.
 * Localname: OpeningCreditBalance
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.03_01
 * Java type: x0301.oecdStandardAuditFileTaxPT1.OpeningCreditBalanceDocument
 *
 * Automatically generated - do not modify.
 */
package x0301.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one OpeningCreditBalance(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01) element.
 *
 * This is a complex type.
 */
public class OpeningCreditBalanceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0301.oecdStandardAuditFileTaxPT1.OpeningCreditBalanceDocument
{
    private static final long serialVersionUID = 1L;
    
    public OpeningCreditBalanceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPENINGCREDITBALANCE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "OpeningCreditBalance");
    
    
    /**
     * Gets the "OpeningCreditBalance" element
     */
    public java.math.BigDecimal getOpeningCreditBalance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPENINGCREDITBALANCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "OpeningCreditBalance" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetOpeningCreditBalance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(OPENINGCREDITBALANCE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OpeningCreditBalance" element
     */
    public void setOpeningCreditBalance(java.math.BigDecimal openingCreditBalance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPENINGCREDITBALANCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPENINGCREDITBALANCE$0);
            }
            target.setBigDecimalValue(openingCreditBalance);
        }
    }
    
    /**
     * Sets (as xml) the "OpeningCreditBalance" element
     */
    public void xsetOpeningCreditBalance(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType openingCreditBalance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(OPENINGCREDITBALANCE$0, 0);
            if (target == null)
            {
                target = (x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(OPENINGCREDITBALANCE$0);
            }
            target.set(openingCreditBalance);
        }
    }
}
