/*
 * An XML document type.
 * Localname: Telephone
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.03_01
 * Java type: x0301.oecdStandardAuditFileTaxPT1.TelephoneDocument
 *
 * Automatically generated - do not modify.
 */
package x0301.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one Telephone(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01) element.
 *
 * This is a complex type.
 */
public class TelephoneDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0301.oecdStandardAuditFileTaxPT1.TelephoneDocument
{
    private static final long serialVersionUID = 1L;
    
    public TelephoneDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TELEPHONE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "Telephone");
    
    
    /**
     * Gets the "Telephone" element
     */
    public java.lang.String getTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Telephone" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car xgetTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().find_element_user(TELEPHONE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Telephone" element
     */
    public void setTelephone(java.lang.String telephone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TELEPHONE$0);
            }
            target.setStringValue(telephone);
        }
    }
    
    /**
     * Sets (as xml) the "Telephone" element
     */
    public void xsetTelephone(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car telephone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().find_element_user(TELEPHONE$0, 0);
            if (target == null)
            {
                target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().add_element_user(TELEPHONE$0);
            }
            target.set(telephone);
        }
    }
}
