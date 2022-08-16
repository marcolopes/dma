/*
 * An XML document type.
 * Localname: SettlementAmount
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.03_01
 * Java type: x0301.oecdStandardAuditFileTaxPT1.SettlementAmountDocument
 *
 * Automatically generated - do not modify.
 */
package x0301.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one SettlementAmount(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01) element.
 *
 * This is a complex type.
 */
public class SettlementAmountDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0301.oecdStandardAuditFileTaxPT1.SettlementAmountDocument
{
    private static final long serialVersionUID = 1L;
    
    public SettlementAmountDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SETTLEMENTAMOUNT$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "SettlementAmount");
    
    
    /**
     * Gets the "SettlementAmount" element
     */
    public java.math.BigDecimal getSettlementAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SETTLEMENTAMOUNT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "SettlementAmount" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetSettlementAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(SETTLEMENTAMOUNT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SettlementAmount" element
     */
    public void setSettlementAmount(java.math.BigDecimal settlementAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SETTLEMENTAMOUNT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SETTLEMENTAMOUNT$0);
            }
            target.setBigDecimalValue(settlementAmount);
        }
    }
    
    /**
     * Sets (as xml) the "SettlementAmount" element
     */
    public void xsetSettlementAmount(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType settlementAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(SETTLEMENTAMOUNT$0, 0);
            if (target == null)
            {
                target = (x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(SETTLEMENTAMOUNT$0);
            }
            target.set(settlementAmount);
        }
    }
}
