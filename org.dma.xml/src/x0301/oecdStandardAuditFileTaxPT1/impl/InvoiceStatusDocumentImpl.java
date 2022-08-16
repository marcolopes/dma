/*
 * An XML document type.
 * Localname: InvoiceStatus
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.03_01
 * Java type: x0301.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument
 *
 * Automatically generated - do not modify.
 */
package x0301.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one InvoiceStatus(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01) element.
 *
 * This is a complex type.
 */
public class InvoiceStatusDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0301.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument
{
    private static final long serialVersionUID = 1L;
    
    public InvoiceStatusDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INVOICESTATUS$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "InvoiceStatus");
    
    
    /**
     * Gets the "InvoiceStatus" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument.InvoiceStatus.Enum getInvoiceStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOICESTATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return (x0301.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument.InvoiceStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "InvoiceStatus" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument.InvoiceStatus xgetInvoiceStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument.InvoiceStatus target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument.InvoiceStatus)get_store().find_element_user(INVOICESTATUS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "InvoiceStatus" element
     */
    public void setInvoiceStatus(x0301.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument.InvoiceStatus.Enum invoiceStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOICESTATUS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INVOICESTATUS$0);
            }
            target.setEnumValue(invoiceStatus);
        }
    }
    
    /**
     * Sets (as xml) the "InvoiceStatus" element
     */
    public void xsetInvoiceStatus(x0301.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument.InvoiceStatus invoiceStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument.InvoiceStatus target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument.InvoiceStatus)get_store().find_element_user(INVOICESTATUS$0, 0);
            if (target == null)
            {
                target = (x0301.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument.InvoiceStatus)get_store().add_element_user(INVOICESTATUS$0);
            }
            target.set(invoiceStatus);
        }
    }
    /**
     * An XML InvoiceStatus(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
     *
     * This is an atomic type that is a restriction of x0301.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument$InvoiceStatus.
     */
    public static class InvoiceStatusImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x0301.oecdStandardAuditFileTaxPT1.InvoiceStatusDocument.InvoiceStatus
    {
        private static final long serialVersionUID = 1L;
        
        public InvoiceStatusImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected InvoiceStatusImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
