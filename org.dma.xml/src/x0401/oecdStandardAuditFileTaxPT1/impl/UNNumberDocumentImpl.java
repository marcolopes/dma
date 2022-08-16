/*
 * An XML document type.
 * Localname: UNNumber
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.UNNumberDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one UNNumber(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class UNNumberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.UNNumberDocument
{
    private static final long serialVersionUID = 1L;
    
    public UNNumberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNNUMBER$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "UNNumber");
    
    
    /**
     * Gets the "UNNumber" element
     */
    public java.lang.String getUNNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNNUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "UNNumber" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber xgetUNNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber)get_store().find_element_user(UNNUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "UNNumber" element
     */
    public void setUNNumber(java.lang.String unNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNNUMBER$0);
            }
            target.setStringValue(unNumber);
        }
    }
    
    /**
     * Sets (as xml) the "UNNumber" element
     */
    public void xsetUNNumber(x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber unNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber)get_store().find_element_user(UNNUMBER$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber)get_store().add_element_user(UNNUMBER$0);
            }
            target.set(unNumber);
        }
    }
}
