/*
 * An XML document type.
 * Localname: SoftwareCertificateNumber
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.01_01
 * Java type: x0101.oecdStandardAuditFileTaxPT1.SoftwareCertificateNumberDocument
 *
 * Automatically generated - do not modify.
 */
package x0101.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one SoftwareCertificateNumber(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01) element.
 *
 * This is a complex type.
 */
public class SoftwareCertificateNumberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.SoftwareCertificateNumberDocument
{
    private static final long serialVersionUID = 1L;
    
    public SoftwareCertificateNumberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOFTWARECERTIFICATENUMBER$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "SoftwareCertificateNumber");
    
    
    /**
     * Gets the "SoftwareCertificateNumber" element
     */
    public java.lang.String getSoftwareCertificateNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOFTWARECERTIFICATENUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SoftwareCertificateNumber" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car xgetSoftwareCertificateNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().find_element_user(SOFTWARECERTIFICATENUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SoftwareCertificateNumber" element
     */
    public void setSoftwareCertificateNumber(java.lang.String softwareCertificateNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOFTWARECERTIFICATENUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOFTWARECERTIFICATENUMBER$0);
            }
            target.setStringValue(softwareCertificateNumber);
        }
    }
    
    /**
     * Sets (as xml) the "SoftwareCertificateNumber" element
     */
    public void xsetSoftwareCertificateNumber(x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car softwareCertificateNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().find_element_user(SOFTWARECERTIFICATENUMBER$0, 0);
            if (target == null)
            {
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().add_element_user(SOFTWARECERTIFICATENUMBER$0);
            }
            target.set(softwareCertificateNumber);
        }
    }
}
