/*
 * An XML document type.
 * Localname: MovementEndTime
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.03_01
 * Java type: x0301.oecdStandardAuditFileTaxPT1.MovementEndTimeDocument
 *
 * Automatically generated - do not modify.
 */
package x0301.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one MovementEndTime(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01) element.
 *
 * This is a complex type.
 */
public class MovementEndTimeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0301.oecdStandardAuditFileTaxPT1.MovementEndTimeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MovementEndTimeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MOVEMENTENDTIME$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "MovementEndTime");
    
    
    /**
     * Gets the "MovementEndTime" element
     */
    public java.util.Calendar getMovementEndTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOVEMENTENDTIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "MovementEndTime" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType xgetMovementEndTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(MOVEMENTENDTIME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MovementEndTime" element
     */
    public void setMovementEndTime(java.util.Calendar movementEndTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOVEMENTENDTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOVEMENTENDTIME$0);
            }
            target.setCalendarValue(movementEndTime);
        }
    }
    
    /**
     * Sets (as xml) the "MovementEndTime" element
     */
    public void xsetMovementEndTime(x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType movementEndTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(MOVEMENTENDTIME$0, 0);
            if (target == null)
            {
                target = (x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().add_element_user(MOVEMENTENDTIME$0);
            }
            target.set(movementEndTime);
        }
    }
}
