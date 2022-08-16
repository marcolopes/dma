/*
 * An XML document type.
 * Localname: Contact
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.02_01
 * Java type: x0201.oecdStandardAuditFileTaxPT1.ContactDocument
 *
 * Automatically generated - do not modify.
 */
package x0201.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one Contact(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01) element.
 *
 * This is a complex type.
 */
public class ContactDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0201.oecdStandardAuditFileTaxPT1.ContactDocument
{
    private static final long serialVersionUID = 1L;
    
    public ContactDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACT$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "Contact");
    
    
    /**
     * Gets the "Contact" element
     */
    public java.lang.String getContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Contact" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car xgetContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().find_element_user(CONTACT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Contact" element
     */
    public void setContact(java.lang.String contact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACT$0);
            }
            target.setStringValue(contact);
        }
    }
    
    /**
     * Sets (as xml) the "Contact" element
     */
    public void xsetContact(x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car contact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().find_element_user(CONTACT$0, 0);
            if (target == null)
            {
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().add_element_user(CONTACT$0);
            }
            target.set(contact);
        }
    }
}
