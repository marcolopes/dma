/*
 * An XML document type.
 * Localname: PaymentMechanism
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one PaymentMechanism(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class PaymentMechanismDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument
{
    private static final long serialVersionUID = 1L;
    
    public PaymentMechanismDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PAYMENTMECHANISM$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "PaymentMechanism");
    
    
    /**
     * Gets the "PaymentMechanism" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism.Enum getPaymentMechanism()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTMECHANISM$0, 0);
            if (target == null)
            {
                return null;
            }
            return (x0401.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "PaymentMechanism" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism xgetPaymentMechanism()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism)get_store().find_element_user(PAYMENTMECHANISM$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PaymentMechanism" element
     */
    public void setPaymentMechanism(x0401.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism.Enum paymentMechanism)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTMECHANISM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAYMENTMECHANISM$0);
            }
            target.setEnumValue(paymentMechanism);
        }
    }
    
    /**
     * Sets (as xml) the "PaymentMechanism" element
     */
    public void xsetPaymentMechanism(x0401.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism paymentMechanism)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism)get_store().find_element_user(PAYMENTMECHANISM$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism)get_store().add_element_user(PAYMENTMECHANISM$0);
            }
            target.set(paymentMechanism);
        }
    }
    /**
     * An XML PaymentMechanism(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
     *
     * This is an atomic type that is a restriction of x0401.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument$PaymentMechanism.
     */
    public static class PaymentMechanismImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x0401.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism
    {
        private static final long serialVersionUID = 1L;
        
        public PaymentMechanismImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected PaymentMechanismImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
