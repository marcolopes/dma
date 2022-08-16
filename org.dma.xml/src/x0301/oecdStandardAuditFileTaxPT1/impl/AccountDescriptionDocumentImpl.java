/*
 * An XML document type.
 * Localname: AccountDescription
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.03_01
 * Java type: x0301.oecdStandardAuditFileTaxPT1.AccountDescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package x0301.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one AccountDescription(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01) element.
 *
 * This is a complex type.
 */
public class AccountDescriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0301.oecdStandardAuditFileTaxPT1.AccountDescriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public AccountDescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCOUNTDESCRIPTION$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "AccountDescription");
    
    
    /**
     * Gets the "AccountDescription" element
     */
    public java.lang.String getAccountDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AccountDescription" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car xgetAccountDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(ACCOUNTDESCRIPTION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AccountDescription" element
     */
    public void setAccountDescription(java.lang.String accountDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCOUNTDESCRIPTION$0);
            }
            target.setStringValue(accountDescription);
        }
    }
    
    /**
     * Sets (as xml) the "AccountDescription" element
     */
    public void xsetAccountDescription(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car accountDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(ACCOUNTDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().add_element_user(ACCOUNTDESCRIPTION$0);
            }
            target.set(accountDescription);
        }
    }
}
