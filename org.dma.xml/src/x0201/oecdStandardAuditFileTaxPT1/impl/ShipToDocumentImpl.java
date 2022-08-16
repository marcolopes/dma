/*
 * An XML document type.
 * Localname: ShipTo
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.02_01
 * Java type: x0201.oecdStandardAuditFileTaxPT1.ShipToDocument
 *
 * Automatically generated - do not modify.
 */
package x0201.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one ShipTo(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01) element.
 *
 * This is a complex type.
 */
public class ShipToDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0201.oecdStandardAuditFileTaxPT1.ShipToDocument
{
    private static final long serialVersionUID = 1L;
    
    public ShipToDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHIPTO$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "ShipTo");
    
    
    /**
     * Gets the "ShipTo" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.ShippingPointStructure getShipTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.ShippingPointStructure target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.ShippingPointStructure)get_store().find_element_user(SHIPTO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ShipTo" element
     */
    public void setShipTo(x0201.oecdStandardAuditFileTaxPT1.ShippingPointStructure shipTo)
    {
        generatedSetterHelperImpl(shipTo, SHIPTO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ShipTo" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.ShippingPointStructure addNewShipTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.ShippingPointStructure target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.ShippingPointStructure)get_store().add_element_user(SHIPTO$0);
            return target;
        }
    }
}
