/*
 * An XML document type.
 * Localname: ShipFrom
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.ShipFromDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one ShipFrom(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class ShipFromDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.ShipFromDocument
{
    private static final long serialVersionUID = 1L;
    
    public ShipFromDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHIPFROM$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "ShipFrom");
    
    
    /**
     * Gets the "ShipFrom" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.ShippingPointStructure getShipFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.ShippingPointStructure target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.ShippingPointStructure)get_store().find_element_user(SHIPFROM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ShipFrom" element
     */
    public void setShipFrom(x0401.oecdStandardAuditFileTaxPT1.ShippingPointStructure shipFrom)
    {
        generatedSetterHelperImpl(shipFrom, SHIPFROM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ShipFrom" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.ShippingPointStructure addNewShipFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.ShippingPointStructure target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.ShippingPointStructure)get_store().add_element_user(SHIPFROM$0);
            return target;
        }
    }
}
