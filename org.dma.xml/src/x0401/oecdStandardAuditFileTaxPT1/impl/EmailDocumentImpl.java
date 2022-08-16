/*
 * An XML document type.
 * Localname: Email
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.EmailDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one Email(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class EmailDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.EmailDocument
{
    private static final long serialVersionUID = 1L;
    
    public EmailDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMAIL$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Email");
    
    
    /**
     * Gets the "Email" element
     */
    public java.lang.String getEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Email" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax254Car xgetEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax254Car target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax254Car)get_store().find_element_user(EMAIL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Email" element
     */
    public void setEmail(java.lang.String email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAIL$0);
            }
            target.setStringValue(email);
        }
    }
    
    /**
     * Sets (as xml) the "Email" element
     */
    public void xsetEmail(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax254Car email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax254Car target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax254Car)get_store().find_element_user(EMAIL$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax254Car)get_store().add_element_user(EMAIL$0);
            }
            target.set(email);
        }
    }
}
