/*
 * An XML document type.
 * Localname: InvoiceType
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one InvoiceType(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class InvoiceTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public InvoiceTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INVOICETYPE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "InvoiceType");
    
    
    /**
     * Gets the "InvoiceType" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType.Enum getInvoiceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOICETYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (x0401.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "InvoiceType" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType xgetInvoiceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType)get_store().find_element_user(INVOICETYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "InvoiceType" element
     */
    public void setInvoiceType(x0401.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType.Enum invoiceType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOICETYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INVOICETYPE$0);
            }
            target.setEnumValue(invoiceType);
        }
    }
    
    /**
     * Sets (as xml) the "InvoiceType" element
     */
    public void xsetInvoiceType(x0401.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType invoiceType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType)get_store().find_element_user(INVOICETYPE$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType)get_store().add_element_user(INVOICETYPE$0);
            }
            target.set(invoiceType);
        }
    }
    /**
     * An XML InvoiceType(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
     *
     * This is an atomic type that is a restriction of x0401.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument$InvoiceType.
     */
    public static class InvoiceTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x0401.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType
    {
        private static final long serialVersionUID = 1L;
        
        public InvoiceTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected InvoiceTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
