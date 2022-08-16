/*
 * An XML document type.
 * Localname: ProductCompanyTaxID
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.ProductCompanyTaxIDDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one ProductCompanyTaxID(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class ProductCompanyTaxIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.ProductCompanyTaxIDDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProductCompanyTaxIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTCOMPANYTAXID$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "ProductCompanyTaxID");
    
    
    /**
     * Gets the "ProductCompanyTaxID" element
     */
    public java.lang.String getProductCompanyTaxID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCOMPANYTAXID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductCompanyTaxID" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car xgetProductCompanyTaxID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().find_element_user(PRODUCTCOMPANYTAXID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ProductCompanyTaxID" element
     */
    public void setProductCompanyTaxID(java.lang.String productCompanyTaxID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCOMPANYTAXID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTCOMPANYTAXID$0);
            }
            target.setStringValue(productCompanyTaxID);
        }
    }
    
    /**
     * Sets (as xml) the "ProductCompanyTaxID" element
     */
    public void xsetProductCompanyTaxID(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car productCompanyTaxID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().find_element_user(PRODUCTCOMPANYTAXID$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().add_element_user(PRODUCTCOMPANYTAXID$0);
            }
            target.set(productCompanyTaxID);
        }
    }
}
