/*
 * An XML document type.
 * Localname: Reason
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.03_01
 * Java type: x0301.oecdStandardAuditFileTaxPT1.ReasonDocument
 *
 * Automatically generated - do not modify.
 */
package x0301.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one Reason(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01) element.
 *
 * This is a complex type.
 */
public class ReasonDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0301.oecdStandardAuditFileTaxPT1.ReasonDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReasonDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REASON$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "Reason");
    
    
    /**
     * Gets the "Reason" element
     */
    public java.lang.String getReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASON$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Reason" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car xgetReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().find_element_user(REASON$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Reason" element
     */
    public void setReason(java.lang.String reason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASON$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REASON$0);
            }
            target.setStringValue(reason);
        }
    }
    
    /**
     * Sets (as xml) the "Reason" element
     */
    public void xsetReason(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car reason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().find_element_user(REASON$0, 0);
            if (target == null)
            {
                target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().add_element_user(REASON$0);
            }
            target.set(reason);
        }
    }
}
