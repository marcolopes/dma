/*
 * An XML document type.
 * Localname: TaxExpirationDate
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.01_01
 * Java type: x0101.oecdStandardAuditFileTaxPT1.TaxExpirationDateDocument
 *
 * Automatically generated - do not modify.
 */
package x0101.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one TaxExpirationDate(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01) element.
 *
 * This is a complex type.
 */
public class TaxExpirationDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.TaxExpirationDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public TaxExpirationDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TAXEXPIRATIONDATE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "TaxExpirationDate");
    
    
    /**
     * Gets the "TaxExpirationDate" element
     */
    public java.util.Calendar getTaxExpirationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXEXPIRATIONDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "TaxExpirationDate" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.SAFdateType xgetTaxExpirationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(TAXEXPIRATIONDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TaxExpirationDate" element
     */
    public void setTaxExpirationDate(java.util.Calendar taxExpirationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXEXPIRATIONDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXEXPIRATIONDATE$0);
            }
            target.setCalendarValue(taxExpirationDate);
        }
    }
    
    /**
     * Sets (as xml) the "TaxExpirationDate" element
     */
    public void xsetTaxExpirationDate(x0101.oecdStandardAuditFileTaxPT1.SAFdateType taxExpirationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(TAXEXPIRATIONDATE$0, 0);
            if (target == null)
            {
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().add_element_user(TAXEXPIRATIONDATE$0);
            }
            target.set(taxExpirationDate);
        }
    }
}
