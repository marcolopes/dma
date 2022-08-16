/*
 * An XML document type.
 * Localname: CreditAmount
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.03_01
 * Java type: x0301.oecdStandardAuditFileTaxPT1.CreditAmountDocument
 *
 * Automatically generated - do not modify.
 */
package x0301.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one CreditAmount(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01) element.
 *
 * This is a complex type.
 */
public class CreditAmountDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0301.oecdStandardAuditFileTaxPT1.CreditAmountDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreditAmountDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREDITAMOUNT$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "CreditAmount");
    
    
    /**
     * Gets the "CreditAmount" element
     */
    public java.math.BigDecimal getCreditAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREDITAMOUNT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "CreditAmount" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetCreditAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(CREDITAMOUNT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CreditAmount" element
     */
    public void setCreditAmount(java.math.BigDecimal creditAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREDITAMOUNT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREDITAMOUNT$0);
            }
            target.setBigDecimalValue(creditAmount);
        }
    }
    
    /**
     * Sets (as xml) the "CreditAmount" element
     */
    public void xsetCreditAmount(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType creditAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(CREDITAMOUNT$0, 0);
            if (target == null)
            {
                target = (x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(CREDITAMOUNT$0);
            }
            target.set(creditAmount);
        }
    }
}
