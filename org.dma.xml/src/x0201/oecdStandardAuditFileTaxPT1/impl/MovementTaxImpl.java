/*
 * XML Type:  MovementTax
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.02_01
 * Java type: x0201.oecdStandardAuditFileTaxPT1.MovementTax
 *
 * Automatically generated - do not modify.
 */
package x0201.oecdStandardAuditFileTaxPT1.impl;
/**
 * An XML MovementTax(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01).
 *
 * This is a complex type.
 */
public class MovementTaxImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0201.oecdStandardAuditFileTaxPT1.MovementTax
{
    private static final long serialVersionUID = 1L;
    
    public MovementTaxImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TAXTYPE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "TaxType");
    private static final javax.xml.namespace.QName TAXCOUNTRYREGION$2 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "TaxCountryRegion");
    private static final javax.xml.namespace.QName TAXCODE$4 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "TaxCode");
    private static final javax.xml.namespace.QName TAXPERCENTAGE$6 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "TaxPercentage");
    
    
    /**
     * Gets the "TaxType" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.SAFTPTMovementTaxType.Enum getTaxType()
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
            return (x0201.oecdStandardAuditFileTaxPT1.SAFTPTMovementTaxType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "TaxType" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.SAFTPTMovementTaxType xgetTaxType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFTPTMovementTaxType target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFTPTMovementTaxType)get_store().find_element_user(TAXTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TaxType" element
     */
    public void setTaxType(x0201.oecdStandardAuditFileTaxPT1.SAFTPTMovementTaxType.Enum taxType)
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
    public void xsetTaxType(x0201.oecdStandardAuditFileTaxPT1.SAFTPTMovementTaxType taxType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFTPTMovementTaxType target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFTPTMovementTaxType)get_store().find_element_user(TAXTYPE$0, 0);
            if (target == null)
            {
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFTPTMovementTaxType)get_store().add_element_user(TAXTYPE$0);
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
    public x0201.oecdStandardAuditFileTaxPT1.TaxCountryRegionDocument.TaxCountryRegion xgetTaxCountryRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.TaxCountryRegionDocument.TaxCountryRegion target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.TaxCountryRegionDocument.TaxCountryRegion)get_store().find_element_user(TAXCOUNTRYREGION$2, 0);
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
    public void xsetTaxCountryRegion(x0201.oecdStandardAuditFileTaxPT1.TaxCountryRegionDocument.TaxCountryRegion taxCountryRegion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.TaxCountryRegionDocument.TaxCountryRegion target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.TaxCountryRegionDocument.TaxCountryRegion)get_store().find_element_user(TAXCOUNTRYREGION$2, 0);
            if (target == null)
            {
                target = (x0201.oecdStandardAuditFileTaxPT1.TaxCountryRegionDocument.TaxCountryRegion)get_store().add_element_user(TAXCOUNTRYREGION$2);
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
    public x0201.oecdStandardAuditFileTaxPT1.SAFTPTMovementTaxCode xgetTaxCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFTPTMovementTaxCode target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFTPTMovementTaxCode)get_store().find_element_user(TAXCODE$4, 0);
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
    public void xsetTaxCode(x0201.oecdStandardAuditFileTaxPT1.SAFTPTMovementTaxCode taxCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFTPTMovementTaxCode target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFTPTMovementTaxCode)get_store().find_element_user(TAXCODE$4, 0);
            if (target == null)
            {
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFTPTMovementTaxCode)get_store().add_element_user(TAXCODE$4);
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
    public x0201.oecdStandardAuditFileTaxPT1.SAFdecimalType xgetTaxPercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFdecimalType target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFdecimalType)get_store().find_element_user(TAXPERCENTAGE$6, 0);
            return target;
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
    public void xsetTaxPercentage(x0201.oecdStandardAuditFileTaxPT1.SAFdecimalType taxPercentage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFdecimalType target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFdecimalType)get_store().find_element_user(TAXPERCENTAGE$6, 0);
            if (target == null)
            {
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFdecimalType)get_store().add_element_user(TAXPERCENTAGE$6);
            }
            target.set(taxPercentage);
        }
    }
}
