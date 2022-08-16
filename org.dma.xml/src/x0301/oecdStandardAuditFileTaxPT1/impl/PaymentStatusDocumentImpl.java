/*
 * An XML document type.
 * Localname: PaymentStatus
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.03_01
 * Java type: x0301.oecdStandardAuditFileTaxPT1.PaymentStatusDocument
 *
 * Automatically generated - do not modify.
 */
package x0301.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one PaymentStatus(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01) element.
 *
 * This is a complex type.
 */
public class PaymentStatusDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0301.oecdStandardAuditFileTaxPT1.PaymentStatusDocument
{
    private static final long serialVersionUID = 1L;
    
    public PaymentStatusDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PAYMENTSTATUS$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "PaymentStatus");
    
    
    /**
     * Gets the "PaymentStatus" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.PaymentStatusDocument.PaymentStatus.Enum getPaymentStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTSTATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return (x0301.oecdStandardAuditFileTaxPT1.PaymentStatusDocument.PaymentStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "PaymentStatus" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.PaymentStatusDocument.PaymentStatus xgetPaymentStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.PaymentStatusDocument.PaymentStatus target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.PaymentStatusDocument.PaymentStatus)get_store().find_element_user(PAYMENTSTATUS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PaymentStatus" element
     */
    public void setPaymentStatus(x0301.oecdStandardAuditFileTaxPT1.PaymentStatusDocument.PaymentStatus.Enum paymentStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTSTATUS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAYMENTSTATUS$0);
            }
            target.setEnumValue(paymentStatus);
        }
    }
    
    /**
     * Sets (as xml) the "PaymentStatus" element
     */
    public void xsetPaymentStatus(x0301.oecdStandardAuditFileTaxPT1.PaymentStatusDocument.PaymentStatus paymentStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.PaymentStatusDocument.PaymentStatus target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.PaymentStatusDocument.PaymentStatus)get_store().find_element_user(PAYMENTSTATUS$0, 0);
            if (target == null)
            {
                target = (x0301.oecdStandardAuditFileTaxPT1.PaymentStatusDocument.PaymentStatus)get_store().add_element_user(PAYMENTSTATUS$0);
            }
            target.set(paymentStatus);
        }
    }
    /**
     * An XML PaymentStatus(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
     *
     * This is an atomic type that is a restriction of x0301.oecdStandardAuditFileTaxPT1.PaymentStatusDocument$PaymentStatus.
     */
    public static class PaymentStatusImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x0301.oecdStandardAuditFileTaxPT1.PaymentStatusDocument.PaymentStatus
    {
        private static final long serialVersionUID = 1L;
        
        public PaymentStatusImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected PaymentStatusImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
