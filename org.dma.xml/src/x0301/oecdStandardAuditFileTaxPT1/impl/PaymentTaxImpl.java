/*
 * XML Type:  PaymentTax
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.03_01
 * Java type: x0301.oecdStandardAuditFileTaxPT1.PaymentTax
 *
 * Automatically generated - do not modify.
 */
package x0301.oecdStandardAuditFileTaxPT1.impl;
/**
 * An XML PaymentTax(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
 *
 * This is a complex type.
 */
public class PaymentTaxImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0301.oecdStandardAuditFileTaxPT1.PaymentTax
{
    private static final long serialVersionUID = 1L;
    
    public PaymentTaxImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TAXTYPE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "TaxType");
    private static final javax.xml.namespace.QName TAXCOUNTRYREGION$2 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "TaxCountryRegion");
    private static final javax.xml.namespace.QName TAXCODE$4 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "TaxCode");
    private static final javax.xml.namespace.QName TAXPERCENTAGE$6 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "TaxPercentage");
    private static final javax.xml.namespace.QName TAXAMOUNT$8 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "TaxAmount");
    
    
    /**
     * Gets the "TaxType" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.TaxTypeDocument.TaxType.Enum getTaxType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (x0301.oecdStandardAuditFileTaxPT1.TaxTypeDocument.TaxType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "TaxType" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.TaxTypeDocument.TaxType xgetTaxType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.TaxTypeDocument.TaxType target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.TaxTypeDocument.TaxType)get_store().find_element_user(TAXTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TaxType" element
     */
    public void setTaxType(x0301.oecdStandardAuditFileTaxPT1.TaxTypeDocument.TaxType.Enum taxType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXTYPE$0);
            }
            target.setEnumValue(taxType);
        }
    }
    
    /**
     * Sets (as xml) the "TaxType" element
     */
    public void xsetTaxType(x0301.oecdStandardAuditFileTaxPT1.TaxTypeDocument.TaxType taxType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.TaxTypeDocument.TaxType target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.TaxTypeDocument.TaxType)get_store().find_element_user(TAXTYPE$0, 0);
            if (target == null)
            {
                target = (x0301.oecdStandardAuditFileTaxPT1.TaxTypeDocument.TaxType)get_store().add_element_user(TAXTYPE$0);
            }
            target.set(taxType);
        }
    }
    
    /**
     * Gets the "TaxCountryRegion" element
     */
    public java.lang.String getTaxCountryRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXCOUNTRYREGION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TaxCountryRegion" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.TaxCountryRegionDocument.TaxCountryRegion xgetTaxCountryRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.TaxCountryRegionDocument.TaxCountryRegion target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.TaxCountryRegionDocument.TaxCountryRegion)get_store().find_element_user(TAXCOUNTRYREGION$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TaxCountryRegion" element
     */
    public void setTaxCountryRegion(java.lang.String taxCountryRegion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXCOUNTRYREGION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXCOUNTRYREGION$2);
            }
            target.setStringValue(taxCountryRegion);
        }
    }
    
    /**
     * Sets (as xml) the "TaxCountryRegion" element
     */
    public void xsetTaxCountryRegion(x0301.oecdStandardAuditFileTaxPT1.TaxCountryRegionDocument.TaxCountryRegion taxCountryRegion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.TaxCountryRegionDocument.TaxCountryRegion target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.TaxCountryRegionDocument.TaxCountryRegion)get_store().find_element_user(TAXCOUNTRYREGION$2, 0);
            if (target == null)
            {
                target = (x0301.oecdStandardAuditFileTaxPT1.TaxCountryRegionDocument.TaxCountryRegion)get_store().add_element_user(TAXCOUNTRYREGION$2);
            }
            target.set(taxCountryRegion);
        }
    }
    
    /**
     * Gets the "TaxCode" element
     */
    public java.lang.String getTaxCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXCODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TaxCode" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.PaymentTaxCode xgetTaxCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.PaymentTaxCode target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.PaymentTaxCode)get_store().find_element_user(TAXCODE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TaxCode" element
     */
    public void setTaxCode(java.lang.String taxCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXCODE$4);
            }
            target.setStringValue(taxCode);
        }
    }
    
    /**
     * Sets (as xml) the "TaxCode" element
     */
    public void xsetTaxCode(x0301.oecdStandardAuditFileTaxPT1.PaymentTaxCode taxCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.PaymentTaxCode target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.PaymentTaxCode)get_store().find_element_user(TAXCODE$4, 0);
            if (target == null)
            {
                target = (x0301.oecdStandardAuditFileTaxPT1.PaymentTaxCode)get_store().add_element_user(TAXCODE$4);
            }
            target.set(taxCode);
        }
    }
    
    /**
     * Gets the "TaxPercentage" element
     */
    public java.math.BigDecimal getTaxPercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXPERCENTAGE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "TaxPercentage" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.SAFdecimalType xgetTaxPercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFdecimalType target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFdecimalType)get_store().find_element_user(TAXPERCENTAGE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "TaxPercentage" element
     */
    public boolean isSetTaxPercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TAXPERCENTAGE$6) != 0;
        }
    }
    
    /**
     * Sets the "TaxPercentage" element
     */
    public void setTaxPercentage(java.math.BigDecimal taxPercentage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXPERCENTAGE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXPERCENTAGE$6);
            }
            target.setBigDecimalValue(taxPercentage);
        }
    }
    
    /**
     * Sets (as xml) the "TaxPercentage" element
     */
    public void xsetTaxPercentage(x0301.oecdStandardAuditFileTaxPT1.SAFdecimalType taxPercentage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFdecimalType target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFdecimalType)get_store().find_element_user(TAXPERCENTAGE$6, 0);
            if (target == null)
            {
                target = (x0301.oecdStandardAuditFileTaxPT1.SAFdecimalType)get_store().add_element_user(TAXPERCENTAGE$6);
            }
            target.set(taxPercentage);
        }
    }
    
    /**
     * Unsets the "TaxPercentage" element
     */
    public void unsetTaxPercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TAXPERCENTAGE$6, 0);
        }
    }
    
    /**
     * Gets the "TaxAmount" element
     */
    public java.math.BigDecimal getTaxAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXAMOUNT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "TaxAmount" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetTaxAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TAXAMOUNT$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "TaxAmount" element
     */
    public boolean isSetTaxAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TAXAMOUNT$8) != 0;
        }
    }
    
    /**
     * Sets the "TaxAmount" element
     */
    public void setTaxAmount(java.math.BigDecimal taxAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXAMOUNT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXAMOUNT$8);
            }
            target.setBigDecimalValue(taxAmount);
        }
    }
    
    /**
     * Sets (as xml) the "TaxAmount" element
     */
    public void xsetTaxAmount(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType taxAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TAXAMOUNT$8, 0);
            if (target == null)
            {
                target = (x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(TAXAMOUNT$8);
            }
            target.set(taxAmount);
        }
    }
    
    /**
     * Unsets the "TaxAmount" element
     */
    public void unsetTaxAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TAXAMOUNT$8, 0);
        }
    }
}
