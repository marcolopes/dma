/*
 * An XML document type.
 * Localname: MovementComments
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.MovementCommentsDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one MovementComments(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class MovementCommentsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.MovementCommentsDocument
{
    private static final long serialVersionUID = 1L;
    
    public MovementCommentsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MOVEMENTCOMMENTS$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "MovementComments");
    
    
    /**
     * Gets the "MovementComments" element
     */
    public java.lang.String getMovementComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOVEMENTCOMMENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MovementComments" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car xgetMovementComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(MOVEMENTCOMMENTS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MovementComments" element
     */
    public void setMovementComments(java.lang.String movementComments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOVEMENTCOMMENTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOVEMENTCOMMENTS$0);
            }
            target.setStringValue(movementComments);
        }
    }
    
    /**
     * Sets (as xml) the "MovementComments" element
     */
    public void xsetMovementComments(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car movementComments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(MOVEMENTCOMMENTS$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().add_element_user(MOVEMENTCOMMENTS$0);
            }
            target.set(movementComments);
        }
    }
}
