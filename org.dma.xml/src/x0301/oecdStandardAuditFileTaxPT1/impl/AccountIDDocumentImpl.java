/*
 * An XML document type.
 * Localname: AccountID
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.03_01
 * Java type: x0301.oecdStandardAuditFileTaxPT1.AccountIDDocument
 *
 * Automatically generated - do not modify.
 */
package x0301.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one AccountID(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01) element.
 *
 * This is a complex type.
 */
public class AccountIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0301.oecdStandardAuditFileTaxPT1.AccountIDDocument
{
    private static final long serialVersionUID = 1L;
    
    public AccountIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCOUNTID$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "AccountID");
    
    
    /**
     * Gets the "AccountID" element
     */
    public java.lang.String getAccountID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AccountID" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.AccountIDDocument.AccountID xgetAccountID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.AccountIDDocument.AccountID target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.AccountIDDocument.AccountID)get_store().find_element_user(ACCOUNTID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AccountID" element
     */
    public void setAccountID(java.lang.String accountID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCOUNTID$0);
            }
            target.setStringValue(accountID);
        }
    }
    
    /**
     * Sets (as xml) the "AccountID" element
     */
    public void xsetAccountID(x0301.oecdStandardAuditFileTaxPT1.AccountIDDocument.AccountID accountID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.AccountIDDocument.AccountID target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.AccountIDDocument.AccountID)get_store().find_element_user(ACCOUNTID$0, 0);
            if (target == null)
            {
                target = (x0301.oecdStandardAuditFileTaxPT1.AccountIDDocument.AccountID)get_store().add_element_user(ACCOUNTID$0);
            }
            target.set(accountID);
        }
    }
    /**
     * An XML AccountID(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
     *
     * This is an atomic type that is a restriction of x0301.oecdStandardAuditFileTaxPT1.AccountIDDocument$AccountID.
     */
    public static class AccountIDImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements x0301.oecdStandardAuditFileTaxPT1.AccountIDDocument.AccountID
    {
        private static final long serialVersionUID = 1L;
        
        public AccountIDImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected AccountIDImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
