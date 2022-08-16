/*
 * An XML document type.
 * Localname: CNCode
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.CNCodeDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one CNCode(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class CNCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.CNCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public CNCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CNCODE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "CNCode");
    
    
    /**
     * Gets the "CNCode" element
     */
    public java.lang.String getCNCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CNCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CNCode" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode xgetCNCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode)get_store().find_element_user(CNCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CNCode" element
     */
    public void setCNCode(java.lang.String cnCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CNCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CNCODE$0);
            }
            target.setStringValue(cnCode);
        }
    }
    
    /**
     * Sets (as xml) the "CNCode" element
     */
    public void xsetCNCode(x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode cnCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode)get_store().find_element_user(CNCODE$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode)get_store().add_element_user(CNCODE$0);
            }
            target.set(cnCode);
        }
    }
}
