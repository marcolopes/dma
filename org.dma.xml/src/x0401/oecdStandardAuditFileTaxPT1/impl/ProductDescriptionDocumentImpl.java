/*
 * An XML document type.
 * Localname: ProductDescription
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.ProductDescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one ProductDescription(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class ProductDescriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.ProductDescriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProductDescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTDESCRIPTION$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "ProductDescription");
    
    
    /**
     * Gets the "ProductDescription" element
     */
    public java.lang.String getProductDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductDescription" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFPTProductDescription xgetProductDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTProductDescription target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTProductDescription)get_store().find_element_user(PRODUCTDESCRIPTION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ProductDescription" element
     */
    public void setProductDescription(java.lang.String productDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTDESCRIPTION$0);
            }
            target.setStringValue(productDescription);
        }
    }
    
    /**
     * Sets (as xml) the "ProductDescription" element
     */
    public void xsetProductDescription(x0401.oecdStandardAuditFileTaxPT1.SAFPTProductDescription productDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTProductDescription target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTProductDescription)get_store().find_element_user(PRODUCTDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTProductDescription)get_store().add_element_user(PRODUCTDESCRIPTION$0);
            }
            target.set(productDescription);
        }
    }
}
