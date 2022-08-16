/*
 * An XML document type.
 * Localname: MovementDate
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.02_01
 * Java type: x0201.oecdStandardAuditFileTaxPT1.MovementDateDocument
 *
 * Automatically generated - do not modify.
 */
package x0201.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one MovementDate(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01) element.
 *
 * This is a complex type.
 */
public class MovementDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0201.oecdStandardAuditFileTaxPT1.MovementDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public MovementDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MOVEMENTDATE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "MovementDate");
    
    
    /**
     * Gets the "MovementDate" element
     */
    public java.util.Calendar getMovementDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOVEMENTDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "MovementDate" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.SAFdateType xgetMovementDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(MOVEMENTDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MovementDate" element
     */
    public void setMovementDate(java.util.Calendar movementDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOVEMENTDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOVEMENTDATE$0);
            }
            target.setCalendarValue(movementDate);
        }
    }
    
    /**
     * Sets (as xml) the "MovementDate" element
     */
    public void xsetMovementDate(x0201.oecdStandardAuditFileTaxPT1.SAFdateType movementDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(MOVEMENTDATE$0, 0);
            if (target == null)
            {
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().add_element_user(MOVEMENTDATE$0);
            }
            target.set(movementDate);
        }
    }
}
