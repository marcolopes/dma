/*
 * An XML document type.
 * Localname: ATDocCodeID
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.02_01
 * Java type: x0201.oecdStandardAuditFileTaxPT1.ATDocCodeIDDocument
 *
 * Automatically generated - do not modify.
 */
package x0201.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one ATDocCodeID(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01) element.
 *
 * This is a complex type.
 */
public class ATDocCodeIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0201.oecdStandardAuditFileTaxPT1.ATDocCodeIDDocument
{
    private static final long serialVersionUID = 1L;
    
    public ATDocCodeIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATDOCCODEID$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "ATDocCodeID");
    
    
    /**
     * Gets the "ATDocCodeID" element
     */
    public java.lang.String getATDocCodeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATDOCCODEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ATDocCodeID" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car xgetATDocCodeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car)get_store().find_element_user(ATDOCCODEID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ATDocCodeID" element
     */
    public void setATDocCodeID(java.lang.String atDocCodeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATDOCCODEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATDOCCODEID$0);
            }
            target.setStringValue(atDocCodeID);
        }
    }
    
    /**
     * Sets (as xml) the "ATDocCodeID" element
     */
    public void xsetATDocCodeID(x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car atDocCodeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car)get_store().find_element_user(ATDOCCODEID$0, 0);
            if (target == null)
            {
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax200Car)get_store().add_element_user(ATDOCCODEID$0);
            }
            target.set(atDocCodeID);
        }
    }
}
