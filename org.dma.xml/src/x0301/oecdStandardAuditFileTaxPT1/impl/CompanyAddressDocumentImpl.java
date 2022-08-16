/*
 * An XML document type.
 * Localname: CompanyAddress
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.03_01
 * Java type: x0301.oecdStandardAuditFileTaxPT1.CompanyAddressDocument
 *
 * Automatically generated - do not modify.
 */
package x0301.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one CompanyAddress(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01) element.
 *
 * This is a complex type.
 */
public class CompanyAddressDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0301.oecdStandardAuditFileTaxPT1.CompanyAddressDocument
{
    private static final long serialVersionUID = 1L;
    
    public CompanyAddressDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPANYADDRESS$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "CompanyAddress");
    
    
    /**
     * Gets the "CompanyAddress" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.AddressStructurePT getCompanyAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.AddressStructurePT target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.AddressStructurePT)get_store().find_element_user(COMPANYADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CompanyAddress" element
     */
    public void setCompanyAddress(x0301.oecdStandardAuditFileTaxPT1.AddressStructurePT companyAddress)
    {
        generatedSetterHelperImpl(companyAddress, COMPANYADDRESS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CompanyAddress" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.AddressStructurePT addNewCompanyAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.AddressStructurePT target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.AddressStructurePT)get_store().add_element_user(COMPANYADDRESS$0);
            return target;
        }
    }
}
