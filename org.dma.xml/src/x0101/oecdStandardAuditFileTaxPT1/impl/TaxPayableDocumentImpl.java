/*
 * An XML document type.
 * Localname: TaxPayable
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.01_01
 * Java type: x0101.oecdStandardAuditFileTaxPT1.TaxPayableDocument
 *
 * Automatically generated - do not modify.
 */
package x0101.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one TaxPayable(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01) element.
 *
 * This is a complex type.
 */
public class TaxPayableDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.TaxPayableDocument
{
    private static final long serialVersionUID = 1L;
    
    public TaxPayableDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TAXPAYABLE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "TaxPayable");
    
    
    /**
     * Gets the "TaxPayable" element
     */
    public java.math.BigDecimal getTaxPayable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXPAYABLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "TaxPayable" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetTaxPayable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TAXPAYABLE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TaxPayable" element
     */
    public void setTaxPayable(java.math.BigDecimal taxPayable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXPAYABLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXPAYABLE$0);
            }
            target.setBigDecimalValue(taxPayable);
        }
    }
    
    /**
     * Sets (as xml) the "TaxPayable" element
     */
    public void xsetTaxPayable(x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType taxPayable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TAXPAYABLE$0, 0);
            if (target == null)
            {
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(TAXPAYABLE$0);
            }
            target.set(taxPayable);
        }
    }
}
