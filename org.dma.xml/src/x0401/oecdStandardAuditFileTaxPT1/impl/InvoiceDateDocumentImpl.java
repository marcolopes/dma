/*
 * An XML document type.
 * Localname: InvoiceDate
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.InvoiceDateDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one InvoiceDate(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class InvoiceDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.InvoiceDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public InvoiceDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INVOICEDATE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "InvoiceDate");
    
    
    /**
     * Gets the "InvoiceDate" element
     */
    public java.util.Calendar getInvoiceDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOICEDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "InvoiceDate" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFdateType xgetInvoiceDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(INVOICEDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "InvoiceDate" element
     */
    public void setInvoiceDate(java.util.Calendar invoiceDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOICEDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INVOICEDATE$0);
            }
            target.setCalendarValue(invoiceDate);
        }
    }
    
    /**
     * Sets (as xml) the "InvoiceDate" element
     */
    public void xsetInvoiceDate(x0401.oecdStandardAuditFileTaxPT1.SAFdateType invoiceDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(INVOICEDATE$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().add_element_user(INVOICEDATE$0);
            }
            target.set(invoiceDate);
        }
    }
}
