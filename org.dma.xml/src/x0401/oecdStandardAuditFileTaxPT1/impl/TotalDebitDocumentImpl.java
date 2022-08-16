/*
 * An XML document type.
 * Localname: TotalDebit
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.TotalDebitDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one TotalDebit(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class TotalDebitDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.TotalDebitDocument
{
    private static final long serialVersionUID = 1L;
    
    public TotalDebitDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOTALDEBIT$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TotalDebit");
    
    
    /**
     * Gets the "TotalDebit" element
     */
    public java.math.BigDecimal getTotalDebit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALDEBIT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "TotalDebit" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetTotalDebit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TOTALDEBIT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TotalDebit" element
     */
    public void setTotalDebit(java.math.BigDecimal totalDebit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALDEBIT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALDEBIT$0);
            }
            target.setBigDecimalValue(totalDebit);
        }
    }
    
    /**
     * Sets (as xml) the "TotalDebit" element
     */
    public void xsetTotalDebit(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType totalDebit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TOTALDEBIT$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(TOTALDEBIT$0);
            }
            target.set(totalDebit);
        }
    }
}
