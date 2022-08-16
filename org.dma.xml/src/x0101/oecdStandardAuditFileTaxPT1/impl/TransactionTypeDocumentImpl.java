/*
 * An XML document type.
 * Localname: TransactionType
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.01_01
 * Java type: x0101.oecdStandardAuditFileTaxPT1.TransactionTypeDocument
 *
 * Automatically generated - do not modify.
 */
package x0101.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one TransactionType(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01) element.
 *
 * This is a complex type.
 */
public class TransactionTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.TransactionTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public TransactionTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRANSACTIONTYPE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "TransactionType");
    
    
    /**
     * Gets the "TransactionType" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.TransactionTypeDocument.TransactionType.Enum getTransactionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (x0101.oecdStandardAuditFileTaxPT1.TransactionTypeDocument.TransactionType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "TransactionType" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.TransactionTypeDocument.TransactionType xgetTransactionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.TransactionTypeDocument.TransactionType target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.TransactionTypeDocument.TransactionType)get_store().find_element_user(TRANSACTIONTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TransactionType" element
     */
    public void setTransactionType(x0101.oecdStandardAuditFileTaxPT1.TransactionTypeDocument.TransactionType.Enum transactionType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSACTIONTYPE$0);
            }
            target.setEnumValue(transactionType);
        }
    }
    
    /**
     * Sets (as xml) the "TransactionType" element
     */
    public void xsetTransactionType(x0101.oecdStandardAuditFileTaxPT1.TransactionTypeDocument.TransactionType transactionType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.TransactionTypeDocument.TransactionType target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.TransactionTypeDocument.TransactionType)get_store().find_element_user(TRANSACTIONTYPE$0, 0);
            if (target == null)
            {
                target = (x0101.oecdStandardAuditFileTaxPT1.TransactionTypeDocument.TransactionType)get_store().add_element_user(TRANSACTIONTYPE$0);
            }
            target.set(transactionType);
        }
    }
    /**
     * An XML TransactionType(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01).
     *
     * This is an atomic type that is a restriction of x0101.oecdStandardAuditFileTaxPT1.TransactionTypeDocument$TransactionType.
     */
    public static class TransactionTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x0101.oecdStandardAuditFileTaxPT1.TransactionTypeDocument.TransactionType
    {
        private static final long serialVersionUID = 1L;
        
        public TransactionTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected TransactionTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
