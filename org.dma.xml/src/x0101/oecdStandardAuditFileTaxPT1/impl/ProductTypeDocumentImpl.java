/*
 * An XML document type.
 * Localname: ProductType
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.01_01
 * Java type: x0101.oecdStandardAuditFileTaxPT1.ProductTypeDocument
 *
 * Automatically generated - do not modify.
 */
package x0101.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one ProductType(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01) element.
 *
 * This is a complex type.
 */
public class ProductTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.ProductTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProductTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTTYPE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "ProductType");
    
    
    /**
     * Gets the "ProductType" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.ProductTypeDocument.ProductType.Enum getProductType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (x0101.oecdStandardAuditFileTaxPT1.ProductTypeDocument.ProductType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductType" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.ProductTypeDocument.ProductType xgetProductType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.ProductTypeDocument.ProductType target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.ProductTypeDocument.ProductType)get_store().find_element_user(PRODUCTTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ProductType" element
     */
    public void setProductType(x0101.oecdStandardAuditFileTaxPT1.ProductTypeDocument.ProductType.Enum productType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTTYPE$0);
            }
            target.setEnumValue(productType);
        }
    }
    
    /**
     * Sets (as xml) the "ProductType" element
     */
    public void xsetProductType(x0101.oecdStandardAuditFileTaxPT1.ProductTypeDocument.ProductType productType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.ProductTypeDocument.ProductType target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.ProductTypeDocument.ProductType)get_store().find_element_user(PRODUCTTYPE$0, 0);
            if (target == null)
            {
                target = (x0101.oecdStandardAuditFileTaxPT1.ProductTypeDocument.ProductType)get_store().add_element_user(PRODUCTTYPE$0);
            }
            target.set(productType);
        }
    }
    /**
     * An XML ProductType(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01).
     *
     * This is an atomic type that is a restriction of x0101.oecdStandardAuditFileTaxPT1.ProductTypeDocument$ProductType.
     */
    public static class ProductTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x0101.oecdStandardAuditFileTaxPT1.ProductTypeDocument.ProductType
    {
        private static final long serialVersionUID = 1L;
        
        public ProductTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ProductTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
