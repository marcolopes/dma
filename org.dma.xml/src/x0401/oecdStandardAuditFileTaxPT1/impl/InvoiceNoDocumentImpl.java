/*
 * An XML document type.
 * Localname: InvoiceNo
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.InvoiceNoDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one InvoiceNo(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class InvoiceNoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.InvoiceNoDocument
{
    private static final long serialVersionUID = 1L;
    
    public InvoiceNoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INVOICENO$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "InvoiceNo");
    
    
    /**
     * Gets the "InvoiceNo" element
     */
    public java.lang.String getInvoiceNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOICENO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "InvoiceNo" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.InvoiceNoDocument.InvoiceNo xgetInvoiceNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.InvoiceNoDocument.InvoiceNo target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.InvoiceNoDocument.InvoiceNo)get_store().find_element_user(INVOICENO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "InvoiceNo" element
     */
    public void setInvoiceNo(java.lang.String invoiceNo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOICENO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INVOICENO$0);
            }
            target.setStringValue(invoiceNo);
        }
    }
    
    /**
     * Sets (as xml) the "InvoiceNo" element
     */
    public void xsetInvoiceNo(x0401.oecdStandardAuditFileTaxPT1.InvoiceNoDocument.InvoiceNo invoiceNo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.InvoiceNoDocument.InvoiceNo target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.InvoiceNoDocument.InvoiceNo)get_store().find_element_user(INVOICENO$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.InvoiceNoDocument.InvoiceNo)get_store().add_element_user(INVOICENO$0);
            }
            target.set(invoiceNo);
        }
    }
    /**
     * An XML InvoiceNo(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
     *
     * This is an atomic type that is a restriction of x0401.oecdStandardAuditFileTaxPT1.InvoiceNoDocument$InvoiceNo.
     */
    public static class InvoiceNoImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements x0401.oecdStandardAuditFileTaxPT1.InvoiceNoDocument.InvoiceNo
    {
        private static final long serialVersionUID = 1L;
        
        public InvoiceNoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected InvoiceNoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
