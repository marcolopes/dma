/*
 * An XML document type.
 * Localname: MovementStatusDate
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.MovementStatusDateDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one MovementStatusDate(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class MovementStatusDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.MovementStatusDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public MovementStatusDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MOVEMENTSTATUSDATE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "MovementStatusDate");
    
    
    /**
     * Gets the "MovementStatusDate" element
     */
    public java.util.Calendar getMovementStatusDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOVEMENTSTATUSDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "MovementStatusDate" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType xgetMovementStatusDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(MOVEMENTSTATUSDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MovementStatusDate" element
     */
    public void setMovementStatusDate(java.util.Calendar movementStatusDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOVEMENTSTATUSDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOVEMENTSTATUSDATE$0);
            }
            target.setCalendarValue(movementStatusDate);
        }
    }
    
    /**
     * Sets (as xml) the "MovementStatusDate" element
     */
    public void xsetMovementStatusDate(x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType movementStatusDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(MOVEMENTSTATUSDATE$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().add_element_user(MOVEMENTSTATUSDATE$0);
            }
            target.set(movementStatusDate);
        }
    }
}
