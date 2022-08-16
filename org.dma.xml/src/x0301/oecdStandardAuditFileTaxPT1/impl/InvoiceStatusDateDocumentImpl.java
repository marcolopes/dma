/*
 * An XML document type.
 * Localname: InvoiceStatusDate
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.03_01
 * Java type: x0301.oecdStandardAuditFileTaxPT1.InvoiceStatusDateDocument
 *
 * Automatically generated - do not modify.
 */
package x0301.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one InvoiceStatusDate(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01) element.
 *
 * This is a complex type.
 */
public class InvoiceStatusDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0301.oecdStandardAuditFileTaxPT1.InvoiceStatusDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public InvoiceStatusDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INVOICESTATUSDATE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "InvoiceStatusDate");
    
    
    /**
     * Gets the "InvoiceStatusDate" element
     */
    public java.util.Calendar getInvoiceStatusDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOICESTATUSDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "InvoiceStatusDate" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType xgetInvoiceStatusDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(INVOICESTATUSDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "InvoiceStatusDate" element
     */
    public void setInvoiceStatusDate(java.util.Calendar invoiceStatusDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOICESTATUSDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INVOICESTATUSDATE$0);
            }
            target.setCalendarValue(invoiceStatusDate);
        }
    }
    
    /**
     * Sets (as xml) the "InvoiceStatusDate" element
     */
    public void xsetInvoiceStatusDate(x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType invoiceStatusDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(INVOICESTATUSDATE$0, 0);
            if (target == null)
            {
                target = (x0301.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().add_element_user(INVOICESTATUSDATE$0);
            }
            target.set(invoiceStatusDate);
        }
    }
}
