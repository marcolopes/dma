/*
 * An XML document type.
 * Localname: ShipFromAddress
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.ShipFromAddressDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one ShipFromAddress(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class ShipFromAddressDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.ShipFromAddressDocument
{
    private static final long serialVersionUID = 1L;
    
    public ShipFromAddressDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHIPFROMADDRESS$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "ShipFromAddress");
    
    
    /**
     * Gets the "ShipFromAddress" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.AddressStructure getShipFromAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.AddressStructure target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.AddressStructure)get_store().find_element_user(SHIPFROMADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ShipFromAddress" element
     */
    public void setShipFromAddress(x0401.oecdStandardAuditFileTaxPT1.AddressStructure shipFromAddress)
    {
        generatedSetterHelperImpl(shipFromAddress, SHIPFROMADDRESS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ShipFromAddress" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.AddressStructure addNewShipFromAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.AddressStructure target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.AddressStructure)get_store().add_element_user(SHIPFROMADDRESS$0);
            return target;
        }
    }
}
