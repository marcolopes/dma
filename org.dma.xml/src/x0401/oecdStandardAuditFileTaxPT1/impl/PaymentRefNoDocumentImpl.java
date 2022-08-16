/*
 * An XML document type.
 * Localname: PaymentRefNo
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.PaymentRefNoDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one PaymentRefNo(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class PaymentRefNoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.PaymentRefNoDocument
{
    private static final long serialVersionUID = 1L;
    
    public PaymentRefNoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PAYMENTREFNO$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "PaymentRefNo");
    
    
    /**
     * Gets the "PaymentRefNo" element
     */
    public java.lang.String getPaymentRefNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTREFNO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PaymentRefNo" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.PaymentRefNoDocument.PaymentRefNo xgetPaymentRefNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.PaymentRefNoDocument.PaymentRefNo target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.PaymentRefNoDocument.PaymentRefNo)get_store().find_element_user(PAYMENTREFNO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PaymentRefNo" element
     */
    public void setPaymentRefNo(java.lang.String paymentRefNo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTREFNO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAYMENTREFNO$0);
            }
            target.setStringValue(paymentRefNo);
        }
    }
    
    /**
     * Sets (as xml) the "PaymentRefNo" element
     */
    public void xsetPaymentRefNo(x0401.oecdStandardAuditFileTaxPT1.PaymentRefNoDocument.PaymentRefNo paymentRefNo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.PaymentRefNoDocument.PaymentRefNo target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.PaymentRefNoDocument.PaymentRefNo)get_store().find_element_user(PAYMENTREFNO$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.PaymentRefNoDocument.PaymentRefNo)get_store().add_element_user(PAYMENTREFNO$0);
            }
            target.set(paymentRefNo);
        }
    }
    /**
     * An XML PaymentRefNo(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
     *
     * This is an atomic type that is a restriction of x0401.oecdStandardAuditFileTaxPT1.PaymentRefNoDocument$PaymentRefNo.
     */
    public static class PaymentRefNoImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements x0401.oecdStandardAuditFileTaxPT1.PaymentRefNoDocument.PaymentRefNo
    {
        private static final long serialVersionUID = 1L;
        
        public PaymentRefNoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected PaymentRefNoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
