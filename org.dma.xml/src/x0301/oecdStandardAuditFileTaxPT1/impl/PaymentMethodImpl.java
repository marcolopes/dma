/*
 * XML Type:  PaymentMethod
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.03_01
 * Java type: x0301.oecdStandardAuditFileTaxPT1.PaymentMethod
 *
 * Automatically generated - do not modify.
 */
package x0301.oecdStandardAuditFileTaxPT1.impl;
/**
 * An XML PaymentMethod(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
 *
 * This is a complex type.
 */
public class PaymentMethodImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0301.oecdStandardAuditFileTaxPT1.PaymentMethod
{
    private static final long serialVersionUID = 1L;
    
    public PaymentMethodImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PAYMENTMECHANISM$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "PaymentMechanism");
    private static final javax.xml.namespace.QName PAYMENTAMOUNT$2 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "PaymentAmount");
    private static final javax.xml.namespace.QName PAYMENTDATE$4 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "PaymentDate");
    
    
    /**
     * Gets the "PaymentMechanism" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism.Enum getPaymentMechanism()
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
            return (x0301.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "PaymentMechanism" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism xgetPaymentMechanism()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism)get_store().find_element_user(PAYMENTMECHANISM$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PaymentMechanism" element
     */
    public void setPaymentMechanism(x0301.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism.Enum paymentMechanism)
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
    public void xsetPaymentMechanism(x0301.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism paymentMechanism)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism)get_store().find_element_user(PAYMENTMECHANISM$0, 0);
            if (target == null)
            {
                target = (x0301.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism)get_store().add_element_user(PAYMENTMECHANISM$0);
            }
            target.set(paymentMechanism);
        }
    }
    
    /**
     * Gets the "PaymentAmount" element
     */
    public java.math.BigDecimal getPaymentAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTAMOUNT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "PaymentAmount" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetPaymentAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(PAYMENTAMOUNT$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PaymentAmount" element
     */
    public void setPaymentAmount(java.math.BigDecimal paymentAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTAMOUNT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAYMENTAMOUNT$2);
            }
            target.setBigDecimalValue(paymentAmount);
        }
    }
    
    /**
     * Sets (as xml) the "PaymentAmount" element
     */
    public void xsetPaymentAmount(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType paymentAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(PAYMENTAMOUNT$2, 0);
            if (target == null)
            {
                target = (x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(PAYMENTAMOUNT$2);
            }
            target.set(paymentAmount);
        }
    }
    
    /**
     * Gets the "PaymentDate" element
     */
    public java.util.Calendar getPaymentDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTDATE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "PaymentDate" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.SAFdateType xgetPaymentDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(PAYMENTDATE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PaymentDate" element
     */
    public void setPaymentDate(java.util.Calendar paymentDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAYMENTDATE$4);
            }
            target.setCalendarValue(paymentDate);
        }
    }
    
    /**
     * Sets (as xml) the "PaymentDate" element
     */
    public void xsetPaymentDate(x0301.oecdStandardAuditFileTaxPT1.SAFdateType paymentDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(PAYMENTDATE$4, 0);
            if (target == null)
            {
                target = (x0301.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().add_element_user(PAYMENTDATE$4);
            }
            target.set(paymentDate);
        }
    }
}
