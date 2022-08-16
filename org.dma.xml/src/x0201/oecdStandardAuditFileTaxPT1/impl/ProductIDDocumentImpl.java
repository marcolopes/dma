/*
 * An XML document type.
 * Localname: ProductID
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.02_01
 * Java type: x0201.oecdStandardAuditFileTaxPT1.ProductIDDocument
 *
 * Automatically generated - do not modify.
 */
package x0201.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one ProductID(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01) element.
 *
 * This is a complex type.
 */
public class ProductIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0201.oecdStandardAuditFileTaxPT1.ProductIDDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProductIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTID$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "ProductID");
    
    
    /**
     * Gets the "ProductID" element
     */
    public java.lang.String getProductID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductID" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.SAFPTProductID xgetProductID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFPTProductID target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTProductID)get_store().find_element_user(PRODUCTID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ProductID" element
     */
    public void setProductID(java.lang.String productID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTID$0);
            }
            target.setStringValue(productID);
        }
    }
    
    /**
     * Sets (as xml) the "ProductID" element
     */
    public void xsetProductID(x0201.oecdStandardAuditFileTaxPT1.SAFPTProductID productID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFPTProductID target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTProductID)get_store().find_element_user(PRODUCTID$0, 0);
            if (target == null)
            {
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTProductID)get_store().add_element_user(PRODUCTID$0);
            }
            target.set(productID);
        }
    }
}
