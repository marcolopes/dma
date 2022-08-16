/*
 * An XML document type.
 * Localname: TaxCountryRegion
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.TaxCountryRegionDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one TaxCountryRegion(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class TaxCountryRegionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.TaxCountryRegionDocument
{
    private static final long serialVersionUID = 1L;
    
    public TaxCountryRegionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TAXCOUNTRYREGION$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TaxCountryRegion");
    
    
    /**
     * Gets the "TaxCountryRegion" element
     */
    public java.lang.String getTaxCountryRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXCOUNTRYREGION$0, 0);
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
    public x0401.oecdStandardAuditFileTaxPT1.TaxCountryRegionDocument.TaxCountryRegion xgetTaxCountryRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.TaxCountryRegionDocument.TaxCountryRegion target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.TaxCountryRegionDocument.TaxCountryRegion)get_store().find_element_user(TAXCOUNTRYREGION$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXCOUNTRYREGION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXCOUNTRYREGION$0);
            }
            target.setStringValue(taxCountryRegion);
        }
    }
    
    /**
     * Sets (as xml) the "TaxCountryRegion" element
     */
    public void xsetTaxCountryRegion(x0401.oecdStandardAuditFileTaxPT1.TaxCountryRegionDocument.TaxCountryRegion taxCountryRegion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.TaxCountryRegionDocument.TaxCountryRegion target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.TaxCountryRegionDocument.TaxCountryRegion)get_store().find_element_user(TAXCOUNTRYREGION$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.TaxCountryRegionDocument.TaxCountryRegion)get_store().add_element_user(TAXCOUNTRYREGION$0);
            }
            target.set(taxCountryRegion);
        }
    }
    /**
     * An XML TaxCountryRegion(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
     *
     * This is an atomic type that is a restriction of x0401.oecdStandardAuditFileTaxPT1.TaxCountryRegionDocument$TaxCountryRegion.
     */
    public static class TaxCountryRegionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements x0401.oecdStandardAuditFileTaxPT1.TaxCountryRegionDocument.TaxCountryRegion
    {
        private static final long serialVersionUID = 1L;
        
        public TaxCountryRegionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected TaxCountryRegionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
