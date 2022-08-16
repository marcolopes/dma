/*
 * An XML document type.
 * Localname: MovementStartTime
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.MovementStartTimeDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one MovementStartTime(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class MovementStartTimeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.MovementStartTimeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MovementStartTimeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MOVEMENTSTARTTIME$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "MovementStartTime");
    
    
    /**
     * Gets the "MovementStartTime" element
     */
    public java.util.Calendar getMovementStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOVEMENTSTARTTIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "MovementStartTime" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType xgetMovementStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(MOVEMENTSTARTTIME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MovementStartTime" element
     */
    public void setMovementStartTime(java.util.Calendar movementStartTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOVEMENTSTARTTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOVEMENTSTARTTIME$0);
            }
            target.setCalendarValue(movementStartTime);
        }
    }
    
    /**
     * Sets (as xml) the "MovementStartTime" element
     */
    public void xsetMovementStartTime(x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType movementStartTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(MOVEMENTSTARTTIME$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().add_element_user(MOVEMENTSTARTTIME$0);
            }
            target.set(movementStartTime);
        }
    }
}
