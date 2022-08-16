/*
 * An XML document type.
 * Localname: ProductVersion
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.ProductVersionDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one ProductVersion(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class ProductVersionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.ProductVersionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProductVersionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTVERSION$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "ProductVersion");
    
    
    /**
     * Gets the "ProductVersion" element
     */
    public java.lang.String getProductVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTVERSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductVersion" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetProductVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(PRODUCTVERSION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ProductVersion" element
     */
    public void setProductVersion(java.lang.String productVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTVERSION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTVERSION$0);
            }
            target.setStringValue(productVersion);
        }
    }
    
    /**
     * Sets (as xml) the "ProductVersion" element
     */
    public void xsetProductVersion(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car productVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(PRODUCTVERSION$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().add_element_user(PRODUCTVERSION$0);
            }
            target.set(productVersion);
        }
    }
}
