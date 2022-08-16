/*
 * An XML document type.
 * Localname: TransactionID
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.TransactionIDDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one TransactionID(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class TransactionIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.TransactionIDDocument
{
    private static final long serialVersionUID = 1L;
    
    public TransactionIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRANSACTIONID$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TransactionID");
    
    
    /**
     * Gets the "TransactionID" element
     */
    public java.lang.String getTransactionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TransactionID" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFPTTransactionID xgetTransactionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTTransactionID target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTTransactionID)get_store().find_element_user(TRANSACTIONID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TransactionID" element
     */
    public void setTransactionID(java.lang.String transactionID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSACTIONID$0);
            }
            target.setStringValue(transactionID);
        }
    }
    
    /**
     * Sets (as xml) the "TransactionID" element
     */
    public void xsetTransactionID(x0401.oecdStandardAuditFileTaxPT1.SAFPTTransactionID transactionID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTTransactionID target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTTransactionID)get_store().find_element_user(TRANSACTIONID$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTTransactionID)get_store().add_element_user(TRANSACTIONID$0);
            }
            target.set(transactionID);
        }
    }
}
