/*
 * An XML document type.
 * Localname: MovementStatus
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.03_01
 * Java type: x0301.oecdStandardAuditFileTaxPT1.MovementStatusDocument
 *
 * Automatically generated - do not modify.
 */
package x0301.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one MovementStatus(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01) element.
 *
 * This is a complex type.
 */
public class MovementStatusDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0301.oecdStandardAuditFileTaxPT1.MovementStatusDocument
{
    private static final long serialVersionUID = 1L;
    
    public MovementStatusDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MOVEMENTSTATUS$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "MovementStatus");
    
    
    /**
     * Gets the "MovementStatus" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.MovementStatusDocument.MovementStatus.Enum getMovementStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOVEMENTSTATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return (x0301.oecdStandardAuditFileTaxPT1.MovementStatusDocument.MovementStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "MovementStatus" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.MovementStatusDocument.MovementStatus xgetMovementStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.MovementStatusDocument.MovementStatus target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.MovementStatusDocument.MovementStatus)get_store().find_element_user(MOVEMENTSTATUS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MovementStatus" element
     */
    public void setMovementStatus(x0301.oecdStandardAuditFileTaxPT1.MovementStatusDocument.MovementStatus.Enum movementStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOVEMENTSTATUS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOVEMENTSTATUS$0);
            }
            target.setEnumValue(movementStatus);
        }
    }
    
    /**
     * Sets (as xml) the "MovementStatus" element
     */
    public void xsetMovementStatus(x0301.oecdStandardAuditFileTaxPT1.MovementStatusDocument.MovementStatus movementStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.MovementStatusDocument.MovementStatus target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.MovementStatusDocument.MovementStatus)get_store().find_element_user(MOVEMENTSTATUS$0, 0);
            if (target == null)
            {
                target = (x0301.oecdStandardAuditFileTaxPT1.MovementStatusDocument.MovementStatus)get_store().add_element_user(MOVEMENTSTATUS$0);
            }
            target.set(movementStatus);
        }
    }
    /**
     * An XML MovementStatus(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
     *
     * This is an atomic type that is a restriction of x0301.oecdStandardAuditFileTaxPT1.MovementStatusDocument$MovementStatus.
     */
    public static class MovementStatusImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x0301.oecdStandardAuditFileTaxPT1.MovementStatusDocument.MovementStatus
    {
        private static final long serialVersionUID = 1L;
        
        public MovementStatusImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected MovementStatusImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
