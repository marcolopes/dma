/*
 * An XML document type.
 * Localname: Settlement
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.01_01
 * Java type: x0101.oecdStandardAuditFileTaxPT1.SettlementDocument
 *
 * Automatically generated - do not modify.
 */
package x0101.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one Settlement(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01) element.
 *
 * This is a complex type.
 */
public class SettlementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.SettlementDocument
{
    private static final long serialVersionUID = 1L;
    
    public SettlementDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SETTLEMENT$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "Settlement");
    
    
    /**
     * Gets the "Settlement" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.SettlementDocument.Settlement getSettlement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.SettlementDocument.Settlement target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.SettlementDocument.Settlement)get_store().find_element_user(SETTLEMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Settlement" element
     */
    public void setSettlement(x0101.oecdStandardAuditFileTaxPT1.SettlementDocument.Settlement settlement)
    {
        generatedSetterHelperImpl(settlement, SETTLEMENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Settlement" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.SettlementDocument.Settlement addNewSettlement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.SettlementDocument.Settlement target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.SettlementDocument.Settlement)get_store().add_element_user(SETTLEMENT$0);
            return target;
        }
    }
    /**
     * An XML Settlement(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01).
     *
     * This is a complex type.
     */
    public static class SettlementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.SettlementDocument.Settlement
    {
        private static final long serialVersionUID = 1L;
        
        public SettlementImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SETTLEMENTDISCOUNT$0 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "SettlementDiscount");
        private static final javax.xml.namespace.QName SETTLEMENTAMOUNT$2 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "SettlementAmount");
        private static final javax.xml.namespace.QName SETTLEMENTDATE$4 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "SettlementDate");
        private static final javax.xml.namespace.QName PAYMENTMECHANISM$6 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "PaymentMechanism");
        
        
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
        public x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetSettlementDiscount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(SETTLEMENTDISCOUNT$0, 0);
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
        public void xsetSettlementDiscount(x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car settlementDiscount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(SETTLEMENTDISCOUNT$0, 0);
                if (target == null)
                {
                    target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().add_element_user(SETTLEMENTDISCOUNT$0);
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
        public x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetSettlementAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(SETTLEMENTAMOUNT$2, 0);
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
        public void xsetSettlementAmount(x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType settlementAmount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(SETTLEMENTAMOUNT$2, 0);
                if (target == null)
                {
                    target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(SETTLEMENTAMOUNT$2);
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
        public x0101.oecdStandardAuditFileTaxPT1.SAFdateType xgetSettlementDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(SETTLEMENTDATE$4, 0);
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
        public void xsetSettlementDate(x0101.oecdStandardAuditFileTaxPT1.SAFdateType settlementDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(SETTLEMENTDATE$4, 0);
                if (target == null)
                {
                    target = (x0101.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().add_element_user(SETTLEMENTDATE$4);
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
         * Gets the "PaymentMechanism" element
         */
        public x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism.Enum getPaymentMechanism()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTMECHANISM$6, 0);
                if (target == null)
                {
                    return null;
                }
                return (x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "PaymentMechanism" element
         */
        public x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism xgetPaymentMechanism()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism)get_store().find_element_user(PAYMENTMECHANISM$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "PaymentMechanism" element
         */
        public boolean isSetPaymentMechanism()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PAYMENTMECHANISM$6) != 0;
            }
        }
        
        /**
         * Sets the "PaymentMechanism" element
         */
        public void setPaymentMechanism(x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism.Enum paymentMechanism)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTMECHANISM$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAYMENTMECHANISM$6);
                }
                target.setEnumValue(paymentMechanism);
            }
        }
        
        /**
         * Sets (as xml) the "PaymentMechanism" element
         */
        public void xsetPaymentMechanism(x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism paymentMechanism)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism)get_store().find_element_user(PAYMENTMECHANISM$6, 0);
                if (target == null)
                {
                    target = (x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism)get_store().add_element_user(PAYMENTMECHANISM$6);
                }
                target.set(paymentMechanism);
            }
        }
        
        /**
         * Unsets the "PaymentMechanism" element
         */
        public void unsetPaymentMechanism()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PAYMENTMECHANISM$6, 0);
            }
        }
    }
}
