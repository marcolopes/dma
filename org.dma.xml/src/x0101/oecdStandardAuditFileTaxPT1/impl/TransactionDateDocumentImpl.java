/*
 * An XML document type.
 * Localname: TransactionDate
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.01_01
 * Java type: x0101.oecdStandardAuditFileTaxPT1.TransactionDateDocument
 *
 * Automatically generated - do not modify.
 */
package x0101.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one TransactionDate(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01) element.
 *
 * This is a complex type.
 */
public class TransactionDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.TransactionDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public TransactionDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRANSACTIONDATE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "TransactionDate");
    
    
    /**
     * Gets the "TransactionDate" element
     */
    public java.util.Calendar getTransactionDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "TransactionDate" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.SAFdateType xgetTransactionDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(TRANSACTIONDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TransactionDate" element
     */
    public void setTransactionDate(java.util.Calendar transactionDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSACTIONDATE$0);
            }
            target.setCalendarValue(transactionDate);
        }
    }
    
    /**
     * Sets (as xml) the "TransactionDate" element
     */
    public void xsetTransactionDate(x0101.oecdStandardAuditFileTaxPT1.SAFdateType transactionDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(TRANSACTIONDATE$0, 0);
            if (target == null)
            {
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().add_element_user(TRANSACTIONDATE$0);
            }
            target.set(transactionDate);
        }
    }
}
