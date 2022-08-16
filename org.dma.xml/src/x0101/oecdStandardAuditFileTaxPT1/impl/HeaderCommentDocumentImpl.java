/*
 * An XML document type.
 * Localname: HeaderComment
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.01_01
 * Java type: x0101.oecdStandardAuditFileTaxPT1.HeaderCommentDocument
 *
 * Automatically generated - do not modify.
 */
package x0101.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one HeaderComment(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01) element.
 *
 * This is a complex type.
 */
public class HeaderCommentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.HeaderCommentDocument
{
    private static final long serialVersionUID = 1L;
    
    public HeaderCommentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEADERCOMMENT$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "HeaderComment");
    
    
    /**
     * Gets the "HeaderComment" element
     */
    public java.lang.String getHeaderComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEADERCOMMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "HeaderComment" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax255Car xgetHeaderComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax255Car target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax255Car)get_store().find_element_user(HEADERCOMMENT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "HeaderComment" element
     */
    public void setHeaderComment(java.lang.String headerComment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEADERCOMMENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HEADERCOMMENT$0);
            }
            target.setStringValue(headerComment);
        }
    }
    
    /**
     * Sets (as xml) the "HeaderComment" element
     */
    public void xsetHeaderComment(x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax255Car headerComment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax255Car target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax255Car)get_store().find_element_user(HEADERCOMMENT$0, 0);
            if (target == null)
            {
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax255Car)get_store().add_element_user(HEADERCOMMENT$0);
            }
            target.set(headerComment);
        }
    }
}
