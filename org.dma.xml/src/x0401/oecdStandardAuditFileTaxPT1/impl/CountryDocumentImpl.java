/*
 * An XML document type.
 * Localname: Country
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.CountryDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one Country(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class CountryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.CountryDocument
{
    private static final long serialVersionUID = 1L;
    
    public CountryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COUNTRY$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Country");
    
    
    /**
     * Gets the "Country" element
     */
    public java.lang.String getCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Country" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.CountryDocument.Country xgetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.CountryDocument.Country target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.CountryDocument.Country)get_store().find_element_user(COUNTRY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Country" element
     */
    public void setCountry(java.lang.String country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRY$0);
            }
            target.setStringValue(country);
        }
    }
    
    /**
     * Sets (as xml) the "Country" element
     */
    public void xsetCountry(x0401.oecdStandardAuditFileTaxPT1.CountryDocument.Country country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.CountryDocument.Country target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.CountryDocument.Country)get_store().find_element_user(COUNTRY$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.CountryDocument.Country)get_store().add_element_user(COUNTRY$0);
            }
            target.set(country);
        }
    }
    /**
     * An XML Country(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
     *
     * This is an atomic type that is a restriction of x0401.oecdStandardAuditFileTaxPT1.CountryDocument$Country.
     */
    public static class CountryImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements x0401.oecdStandardAuditFileTaxPT1.CountryDocument.Country
    {
        private static final long serialVersionUID = 1L;
        
        public CountryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected CountryImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
