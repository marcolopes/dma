/*
 * An XML document type.
 * Localname: TaxPercentage
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.01_01
 * Java type: x0101.oecdStandardAuditFileTaxPT1.TaxPercentageDocument
 *
 * Automatically generated - do not modify.
 */
package x0101.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one TaxPercentage(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01) element.
 *
 * This is a complex type.
 */
public class TaxPercentageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.TaxPercentageDocument
{
    private static final long serialVersionUID = 1L;
    
    public TaxPercentageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TAXPERCENTAGE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "TaxPercentage");
    
    
    /**
     * Gets the "TaxPercentage" element
     */
    public java.math.BigDecimal getTaxPercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXPERCENTAGE$0, 0);
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
    public x0101.oecdStandardAuditFileTaxPT1.SAFdecimalType xgetTaxPercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.SAFdecimalType target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.SAFdecimalType)get_store().find_element_user(TAXPERCENTAGE$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXPERCENTAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXPERCENTAGE$0);
            }
            target.setBigDecimalValue(taxPercentage);
        }
    }
    
    /**
     * Sets (as xml) the "TaxPercentage" element
     */
    public void xsetTaxPercentage(x0101.oecdStandardAuditFileTaxPT1.SAFdecimalType taxPercentage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.SAFdecimalType target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.SAFdecimalType)get_store().find_element_user(TAXPERCENTAGE$0, 0);
            if (target == null)
            {
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFdecimalType)get_store().add_element_user(TAXPERCENTAGE$0);
            }
            target.set(taxPercentage);
        }
    }
}
