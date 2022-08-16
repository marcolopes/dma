/*
 * An XML document type.
 * Localname: PaymentStatusDate
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.PaymentStatusDateDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one PaymentStatusDate(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class PaymentStatusDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.PaymentStatusDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public PaymentStatusDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PAYMENTSTATUSDATE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "PaymentStatusDate");
    
    
    /**
     * Gets the "PaymentStatusDate" element
     */
    public java.util.Calendar getPaymentStatusDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTSTATUSDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "PaymentStatusDate" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType xgetPaymentStatusDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(PAYMENTSTATUSDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PaymentStatusDate" element
     */
    public void setPaymentStatusDate(java.util.Calendar paymentStatusDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTSTATUSDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAYMENTSTATUSDATE$0);
            }
            target.setCalendarValue(paymentStatusDate);
        }
    }
    
    /**
     * Sets (as xml) the "PaymentStatusDate" element
     */
    public void xsetPaymentStatusDate(x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType paymentStatusDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().find_element_user(PAYMENTSTATUSDATE$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateTimeType)get_store().add_element_user(PAYMENTSTATUSDATE$0);
            }
            target.set(paymentStatusDate);
        }
    }
}
