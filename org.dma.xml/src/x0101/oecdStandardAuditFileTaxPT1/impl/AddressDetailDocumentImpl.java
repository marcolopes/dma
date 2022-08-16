/*
 * An XML document type.
 * Localname: AddressDetail
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.01_01
 * Java type: x0101.oecdStandardAuditFileTaxPT1.AddressDetailDocument
 *
 * Automatically generated - do not modify.
 */
package x0101.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one AddressDetail(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01) element.
 *
 * This is a complex type.
 */
public class AddressDetailDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.AddressDetailDocument
{
    private static final long serialVersionUID = 1L;
    
    public AddressDetailDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESSDETAIL$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "AddressDetail");
    
    
    /**
     * Gets the "AddressDetail" element
     */
    public java.lang.String getAddressDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSDETAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AddressDetail" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car xgetAddressDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(ADDRESSDETAIL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AddressDetail" element
     */
    public void setAddressDetail(java.lang.String addressDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSDETAIL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESSDETAIL$0);
            }
            target.setStringValue(addressDetail);
        }
    }
    
    /**
     * Sets (as xml) the "AddressDetail" element
     */
    public void xsetAddressDetail(x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car addressDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(ADDRESSDETAIL$0, 0);
            if (target == null)
            {
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().add_element_user(ADDRESSDETAIL$0);
            }
            target.set(addressDetail);
        }
    }
}
