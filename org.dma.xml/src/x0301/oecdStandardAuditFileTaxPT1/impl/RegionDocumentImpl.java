/*
 * An XML document type.
 * Localname: Region
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.03_01
 * Java type: x0301.oecdStandardAuditFileTaxPT1.RegionDocument
 *
 * Automatically generated - do not modify.
 */
package x0301.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one Region(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01) element.
 *
 * This is a complex type.
 */
public class RegionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0301.oecdStandardAuditFileTaxPT1.RegionDocument
{
    private static final long serialVersionUID = 1L;
    
    public RegionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REGION$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "Region");
    
    
    /**
     * Gets the "Region" element
     */
    public java.lang.String getRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Region" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car xgetRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().find_element_user(REGION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Region" element
     */
    public void setRegion(java.lang.String region)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REGION$0);
            }
            target.setStringValue(region);
        }
    }
    
    /**
     * Sets (as xml) the "Region" element
     */
    public void xsetRegion(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car region)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().find_element_user(REGION$0, 0);
            if (target == null)
            {
                target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().add_element_user(REGION$0);
            }
            target.set(region);
        }
    }
}
