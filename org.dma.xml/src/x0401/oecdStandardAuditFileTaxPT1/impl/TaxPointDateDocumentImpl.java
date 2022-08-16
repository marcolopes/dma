/*
 * An XML document type.
 * Localname: TaxPointDate
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.TaxPointDateDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one TaxPointDate(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class TaxPointDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.TaxPointDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public TaxPointDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TAXPOINTDATE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TaxPointDate");
    
    
    /**
     * Gets the "TaxPointDate" element
     */
    public java.util.Calendar getTaxPointDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXPOINTDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "TaxPointDate" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFdateType xgetTaxPointDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(TAXPOINTDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TaxPointDate" element
     */
    public void setTaxPointDate(java.util.Calendar taxPointDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXPOINTDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXPOINTDATE$0);
            }
            target.setCalendarValue(taxPointDate);
        }
    }
    
    /**
     * Sets (as xml) the "TaxPointDate" element
     */
    public void xsetTaxPointDate(x0401.oecdStandardAuditFileTaxPT1.SAFdateType taxPointDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(TAXPOINTDATE$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().add_element_user(TAXPOINTDATE$0);
            }
            target.set(taxPointDate);
        }
    }
}
