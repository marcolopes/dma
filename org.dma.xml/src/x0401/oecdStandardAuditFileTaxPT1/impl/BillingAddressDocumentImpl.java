/*
 * An XML document type.
 * Localname: BillingAddress
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.BillingAddressDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one BillingAddress(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class BillingAddressDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.BillingAddressDocument
{
    private static final long serialVersionUID = 1L;
    
    public BillingAddressDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BILLINGADDRESS$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "BillingAddress");
    
    
    /**
     * Gets the "BillingAddress" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.AddressStructure getBillingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.AddressStructure target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.AddressStructure)get_store().find_element_user(BILLINGADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BillingAddress" element
     */
    public void setBillingAddress(x0401.oecdStandardAuditFileTaxPT1.AddressStructure billingAddress)
    {
        generatedSetterHelperImpl(billingAddress, BILLINGADDRESS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BillingAddress" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.AddressStructure addNewBillingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.AddressStructure target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.AddressStructure)get_store().add_element_user(BILLINGADDRESS$0);
            return target;
        }
    }
}
