/*
 * XML Type:  SpecialRegimes
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.SpecialRegimes
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * An XML SpecialRegimes(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
 *
 * This is a complex type.
 */
public class SpecialRegimesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.SpecialRegimes
{
    private static final long serialVersionUID = 1L;
    
    public SpecialRegimesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SELFBILLINGINDICATOR$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "SelfBillingIndicator");
    private static final javax.xml.namespace.QName CASHVATSCHEMEINDICATOR$2 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "CashVATSchemeIndicator");
    private static final javax.xml.namespace.QName THIRDPARTIESBILLINGINDICATOR$4 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "ThirdPartiesBillingIndicator");
    
    
    /**
     * Gets the "SelfBillingIndicator" element
     */
    public int getSelfBillingIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELFBILLINGINDICATOR$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "SelfBillingIndicator" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator xgetSelfBillingIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator)get_store().find_element_user(SELFBILLINGINDICATOR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SelfBillingIndicator" element
     */
    public void setSelfBillingIndicator(int selfBillingIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELFBILLINGINDICATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SELFBILLINGINDICATOR$0);
            }
            target.setIntValue(selfBillingIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "SelfBillingIndicator" element
     */
    public void xsetSelfBillingIndicator(x0401.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator selfBillingIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator)get_store().find_element_user(SELFBILLINGINDICATOR$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator)get_store().add_element_user(SELFBILLINGINDICATOR$0);
            }
            target.set(selfBillingIndicator);
        }
    }
    
    /**
     * Gets the "CashVATSchemeIndicator" element
     */
    public int getCashVATSchemeIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CASHVATSCHEMEINDICATOR$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "CashVATSchemeIndicator" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.CashVATSchemeIndicatorDocument.CashVATSchemeIndicator xgetCashVATSchemeIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.CashVATSchemeIndicatorDocument.CashVATSchemeIndicator target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.CashVATSchemeIndicatorDocument.CashVATSchemeIndicator)get_store().find_element_user(CASHVATSCHEMEINDICATOR$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CashVATSchemeIndicator" element
     */
    public void setCashVATSchemeIndicator(int cashVATSchemeIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CASHVATSCHEMEINDICATOR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CASHVATSCHEMEINDICATOR$2);
            }
            target.setIntValue(cashVATSchemeIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "CashVATSchemeIndicator" element
     */
    public void xsetCashVATSchemeIndicator(x0401.oecdStandardAuditFileTaxPT1.CashVATSchemeIndicatorDocument.CashVATSchemeIndicator cashVATSchemeIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.CashVATSchemeIndicatorDocument.CashVATSchemeIndicator target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.CashVATSchemeIndicatorDocument.CashVATSchemeIndicator)get_store().find_element_user(CASHVATSCHEMEINDICATOR$2, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.CashVATSchemeIndicatorDocument.CashVATSchemeIndicator)get_store().add_element_user(CASHVATSCHEMEINDICATOR$2);
            }
            target.set(cashVATSchemeIndicator);
        }
    }
    
    /**
     * Gets the "ThirdPartiesBillingIndicator" element
     */
    public int getThirdPartiesBillingIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(THIRDPARTIESBILLINGINDICATOR$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ThirdPartiesBillingIndicator" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.ThirdPartiesBillingIndicatorDocument.ThirdPartiesBillingIndicator xgetThirdPartiesBillingIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.ThirdPartiesBillingIndicatorDocument.ThirdPartiesBillingIndicator target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.ThirdPartiesBillingIndicatorDocument.ThirdPartiesBillingIndicator)get_store().find_element_user(THIRDPARTIESBILLINGINDICATOR$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ThirdPartiesBillingIndicator" element
     */
    public void setThirdPartiesBillingIndicator(int thirdPartiesBillingIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(THIRDPARTIESBILLINGINDICATOR$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(THIRDPARTIESBILLINGINDICATOR$4);
            }
            target.setIntValue(thirdPartiesBillingIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "ThirdPartiesBillingIndicator" element
     */
    public void xsetThirdPartiesBillingIndicator(x0401.oecdStandardAuditFileTaxPT1.ThirdPartiesBillingIndicatorDocument.ThirdPartiesBillingIndicator thirdPartiesBillingIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.ThirdPartiesBillingIndicatorDocument.ThirdPartiesBillingIndicator target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.ThirdPartiesBillingIndicatorDocument.ThirdPartiesBillingIndicator)get_store().find_element_user(THIRDPARTIESBILLINGINDICATOR$4, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.ThirdPartiesBillingIndicatorDocument.ThirdPartiesBillingIndicator)get_store().add_element_user(THIRDPARTIESBILLINGINDICATOR$4);
            }
            target.set(thirdPartiesBillingIndicator);
        }
    }
}
