/*
 * An XML document type.
 * Localname: SoftwareCertificateNumber
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.03_01
 * Java type: x0301.oecdStandardAuditFileTaxPT1.SoftwareCertificateNumberDocument
 *
 * Automatically generated - do not modify.
 */
package x0301.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one SoftwareCertificateNumber(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01) element.
 *
 * This is a complex type.
 */
public class SoftwareCertificateNumberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0301.oecdStandardAuditFileTaxPT1.SoftwareCertificateNumberDocument
{
    private static final long serialVersionUID = 1L;
    
    public SoftwareCertificateNumberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOFTWARECERTIFICATENUMBER$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "SoftwareCertificateNumber");
    
    
    /**
     * Gets the "SoftwareCertificateNumber" element
     */
    public java.math.BigInteger getSoftwareCertificateNumber()
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
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "SoftwareCertificateNumber" element
     */
    public org.apache.xmlbeans.XmlNonNegativeInteger xgetSoftwareCertificateNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(SOFTWARECERTIFICATENUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SoftwareCertificateNumber" element
     */
    public void setSoftwareCertificateNumber(java.math.BigInteger softwareCertificateNumber)
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
            target.setBigIntegerValue(softwareCertificateNumber);
        }
    }
    
    /**
     * Sets (as xml) the "SoftwareCertificateNumber" element
     */
    public void xsetSoftwareCertificateNumber(org.apache.xmlbeans.XmlNonNegativeInteger softwareCertificateNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(SOFTWARECERTIFICATENUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(SOFTWARECERTIFICATENUMBER$0);
            }
            target.set(softwareCertificateNumber);
        }
    }
}
