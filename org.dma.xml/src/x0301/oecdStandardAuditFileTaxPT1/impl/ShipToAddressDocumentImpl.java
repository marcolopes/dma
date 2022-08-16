/*
 * An XML document type.
 * Localname: ShipToAddress
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.03_01
 * Java type: x0301.oecdStandardAuditFileTaxPT1.ShipToAddressDocument
 *
 * Automatically generated - do not modify.
 */
package x0301.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one ShipToAddress(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01) element.
 *
 * This is a complex type.
 */
public class ShipToAddressDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0301.oecdStandardAuditFileTaxPT1.ShipToAddressDocument
{
    private static final long serialVersionUID = 1L;
    
    public ShipToAddressDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHIPTOADDRESS$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "ShipToAddress");
    
    
    /**
     * Gets the "ShipToAddress" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.AddressStructure getShipToAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.AddressStructure target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.AddressStructure)get_store().find_element_user(SHIPTOADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ShipToAddress" element
     */
    public void setShipToAddress(x0301.oecdStandardAuditFileTaxPT1.AddressStructure shipToAddress)
    {
        generatedSetterHelperImpl(shipToAddress, SHIPTOADDRESS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ShipToAddress" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.AddressStructure addNewShipToAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.AddressStructure target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.AddressStructure)get_store().add_element_user(SHIPTOADDRESS$0);
            return target;
        }
    }
}
