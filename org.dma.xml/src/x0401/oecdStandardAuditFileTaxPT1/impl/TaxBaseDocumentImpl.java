/*
 * An XML document type.
 * Localname: TaxBase
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.TaxBaseDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one TaxBase(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class TaxBaseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.TaxBaseDocument
{
    private static final long serialVersionUID = 1L;
    
    public TaxBaseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TAXBASE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TaxBase");
    
    
    /**
     * Gets the "TaxBase" element
     */
    public java.math.BigDecimal getTaxBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXBASE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "TaxBase" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetTaxBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TAXBASE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TaxBase" element
     */
    public void setTaxBase(java.math.BigDecimal taxBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXBASE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXBASE$0);
            }
            target.setBigDecimalValue(taxBase);
        }
    }
    
    /**
     * Sets (as xml) the "TaxBase" element
     */
    public void xsetTaxBase(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType taxBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TAXBASE$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(TAXBASE$0);
            }
            target.set(taxBase);
        }
    }
}
