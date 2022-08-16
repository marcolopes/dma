/*
 * An XML document type.
 * Localname: MovementType
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.02_01
 * Java type: x0201.oecdStandardAuditFileTaxPT1.MovementTypeDocument
 *
 * Automatically generated - do not modify.
 */
package x0201.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one MovementType(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01) element.
 *
 * This is a complex type.
 */
public class MovementTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0201.oecdStandardAuditFileTaxPT1.MovementTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MovementTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MOVEMENTTYPE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "MovementType");
    
    
    /**
     * Gets the "MovementType" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.MovementTypeDocument.MovementType.Enum getMovementType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOVEMENTTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (x0201.oecdStandardAuditFileTaxPT1.MovementTypeDocument.MovementType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "MovementType" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.MovementTypeDocument.MovementType xgetMovementType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.MovementTypeDocument.MovementType target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.MovementTypeDocument.MovementType)get_store().find_element_user(MOVEMENTTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MovementType" element
     */
    public void setMovementType(x0201.oecdStandardAuditFileTaxPT1.MovementTypeDocument.MovementType.Enum movementType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOVEMENTTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOVEMENTTYPE$0);
            }
            target.setEnumValue(movementType);
        }
    }
    
    /**
     * Sets (as xml) the "MovementType" element
     */
    public void xsetMovementType(x0201.oecdStandardAuditFileTaxPT1.MovementTypeDocument.MovementType movementType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.MovementTypeDocument.MovementType target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.MovementTypeDocument.MovementType)get_store().find_element_user(MOVEMENTTYPE$0, 0);
            if (target == null)
            {
                target = (x0201.oecdStandardAuditFileTaxPT1.MovementTypeDocument.MovementType)get_store().add_element_user(MOVEMENTTYPE$0);
            }
            target.set(movementType);
        }
    }
    /**
     * An XML MovementType(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01).
     *
     * This is an atomic type that is a restriction of x0201.oecdStandardAuditFileTaxPT1.MovementTypeDocument$MovementType.
     */
    public static class MovementTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x0201.oecdStandardAuditFileTaxPT1.MovementTypeDocument.MovementType
    {
        private static final long serialVersionUID = 1L;
        
        public MovementTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected MovementTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
