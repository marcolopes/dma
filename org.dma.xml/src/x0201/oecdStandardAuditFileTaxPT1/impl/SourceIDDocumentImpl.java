/*
 * An XML document type.
 * Localname: SourceID
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.02_01
 * Java type: x0201.oecdStandardAuditFileTaxPT1.SourceIDDocument
 *
 * Automatically generated - do not modify.
 */
package x0201.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one SourceID(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01) element.
 *
 * This is a complex type.
 */
public class SourceIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0201.oecdStandardAuditFileTaxPT1.SourceIDDocument
{
    private static final long serialVersionUID = 1L;
    
    public SourceIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCEID$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "SourceID");
    
    
    /**
     * Gets the "SourceID" element
     */
    public java.lang.String getSourceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SourceID" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetSourceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(SOURCEID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SourceID" element
     */
    public void setSourceID(java.lang.String sourceID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEID$0);
            }
            target.setStringValue(sourceID);
        }
    }
    
    /**
     * Sets (as xml) the "SourceID" element
     */
    public void xsetSourceID(x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car sourceID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(SOURCEID$0, 0);
            if (target == null)
            {
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().add_element_user(SOURCEID$0);
            }
            target.set(sourceID);
        }
    }
}
