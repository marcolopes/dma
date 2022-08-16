/*
 * XML Type:  Settlement
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.Settlement
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * An XML Settlement(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
 *
 * This is a complex type.
 */
public class SettlementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.Settlement
{
    private static final long serialVersionUID = 1L;
    
    public SettlementImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SETTLEMENTDISCOUNT$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "SettlementDiscount");
    private static final javax.xml.namespace.QName SETTLEMENTAMOUNT$2 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "SettlementAmount");
    private static final javax.xml.namespace.QName SETTLEMENTDATE$4 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "SettlementDate");
    private static final javax.xml.namespace.QName PAYMENTTERMS$6 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "PaymentTerms");
    
    
    /**
     * Gets the "SettlementDiscount" element
     */
    public java.lang.String getSettlementDiscount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SETTLEMENTDISCOUNT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SettlementDiscount" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetSettlementDiscount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(SETTLEMENTDISCOUNT$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "SettlementDiscount" element
     */
    public boolean isSetSettlementDiscount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SETTLEMENTDISCOUNT$0) != 0;
        }
    }
    
    /**
     * Sets the "SettlementDiscount" element
     */
    public void setSettlementDiscount(java.lang.String settlementDiscount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SETTLEMENTDISCOUNT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SETTLEMENTDISCOUNT$0);
            }
            target.setStringValue(settlementDiscount);
        }
    }
    
    /**
     * Sets (as xml) the "SettlementDiscount" element
     */
    public void xsetSettlementDiscount(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car settlementDiscount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(SETTLEMENTDISCOUNT$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().add_element_user(SETTLEMENTDISCOUNT$0);
            }
            target.set(settlementDiscount);
        }
    }
    
    /**
     * Unsets the "SettlementDiscount" element
     */
    public void unsetSettlementDiscount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SETTLEMENTDISCOUNT$0, 0);
        }
    }
    
    /**
     * Gets the "SettlementAmount" element
     */
    public java.math.BigDecimal getSettlementAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SETTLEMENTAMOUNT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "SettlementAmount" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetSettlementAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(SETTLEMENTAMOUNT$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "SettlementAmount" element
     */
    public boolean isSetSettlementAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SETTLEMENTAMOUNT$2) != 0;
        }
    }
    
    /**
     * Sets the "SettlementAmount" element
     */
    public void setSettlementAmount(java.math.BigDecimal settlementAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SETTLEMENTAMOUNT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SETTLEMENTAMOUNT$2);
            }
            target.setBigDecimalValue(settlementAmount);
        }
    }
    
    /**
     * Sets (as xml) the "SettlementAmount" element
     */
    public void xsetSettlementAmount(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType settlementAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(SETTLEMENTAMOUNT$2, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(SETTLEMENTAMOUNT$2);
            }
            target.set(settlementAmount);
        }
    }
    
    /**
     * Unsets the "SettlementAmount" element
     */
    public void unsetSettlementAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SETTLEMENTAMOUNT$2, 0);
        }
    }
    
    /**
     * Gets the "SettlementDate" element
     */
    public java.util.Calendar getSettlementDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SETTLEMENTDATE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "SettlementDate" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFdateType xgetSettlementDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(SETTLEMENTDATE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "SettlementDate" element
     */
    public boolean isSetSettlementDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SETTLEMENTDATE$4) != 0;
        }
    }
    
    /**
     * Sets the "SettlementDate" element
     */
    public void setSettlementDate(java.util.Calendar settlementDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SETTLEMENTDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SETTLEMENTDATE$4);
            }
            target.setCalendarValue(settlementDate);
        }
    }
    
    /**
     * Sets (as xml) the "SettlementDate" element
     */
    public void xsetSettlementDate(x0401.oecdStandardAuditFileTaxPT1.SAFdateType settlementDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(SETTLEMENTDATE$4, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().add_element_user(SETTLEMENTDATE$4);
            }
            target.set(settlementDate);
        }
    }
    
    /**
     * Unsets the "SettlementDate" element
     */
    public void unsetSettlementDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SETTLEMENTDATE$4, 0);
        }
    }
    
    /**
     * Gets the "PaymentTerms" element
     */
    public java.lang.String getPaymentTerms()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTTERMS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PaymentTerms" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car xgetPaymentTerms()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car)get_store().find_element_user(PAYMENTTERMS$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "PaymentTerms" element
     */
    public boolean isSetPaymentTerms()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAYMENTTERMS$6) != 0;
        }
    }
    
    /**
     * Sets the "PaymentTerms" element
     */
    public void setPaymentTerms(java.lang.String paymentTerms)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTTERMS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAYMENTTERMS$6);
            }
            target.setStringValue(paymentTerms);
        }
    }
    
    /**
     * Sets (as xml) the "PaymentTerms" element
     */
    public void xsetPaymentTerms(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car paymentTerms)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car)get_store().find_element_user(PAYMENTTERMS$6, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car)get_store().add_element_user(PAYMENTTERMS$6);
            }
            target.set(paymentTerms);
        }
    }
    
    /**
     * Unsets the "PaymentTerms" element
     */
    public void unsetPaymentTerms()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAYMENTTERMS$6, 0);
        }
    }
}
