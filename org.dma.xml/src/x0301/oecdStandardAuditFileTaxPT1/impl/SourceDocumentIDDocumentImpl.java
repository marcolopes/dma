/*
 * An XML document type.
 * Localname: SourceDocumentID
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.03_01
 * Java type: x0301.oecdStandardAuditFileTaxPT1.SourceDocumentIDDocument
 *
 * Automatically generated - do not modify.
 */
package x0301.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one SourceDocumentID(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01) element.
 *
 * This is a complex type.
 */
public class SourceDocumentIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0301.oecdStandardAuditFileTaxPT1.SourceDocumentIDDocument
{
    private static final long serialVersionUID = 1L;
    
    public SourceDocumentIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCEDOCUMENTID$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "SourceDocumentID");
    
    
    /**
     * Gets the "SourceDocumentID" element
     */
    public java.lang.String getSourceDocumentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEDOCUMENTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SourceDocumentID" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetSourceDocumentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(SOURCEDOCUMENTID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SourceDocumentID" element
     */
    public void setSourceDocumentID(java.lang.String sourceDocumentID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEDOCUMENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEDOCUMENTID$0);
            }
            target.setStringValue(sourceDocumentID);
        }
    }
    
    /**
     * Sets (as xml) the "SourceDocumentID" element
     */
    public void xsetSourceDocumentID(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car sourceDocumentID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(SOURCEDOCUMENTID$0, 0);
            if (target == null)
            {
                target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().add_element_user(SOURCEDOCUMENTID$0);
            }
            target.set(sourceDocumentID);
        }
    }
}
