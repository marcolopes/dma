/*
 * An XML document type.
 * Localname: TaxVerificationDate
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.03_01
 * Java type: x0301.oecdStandardAuditFileTaxPT1.TaxVerificationDateDocument
 *
 * Automatically generated - do not modify.
 */
package x0301.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one TaxVerificationDate(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01) element.
 *
 * This is a complex type.
 */
public class TaxVerificationDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0301.oecdStandardAuditFileTaxPT1.TaxVerificationDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public TaxVerificationDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TAXVERIFICATIONDATE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "TaxVerificationDate");
    
    
    /**
     * Gets the "TaxVerificationDate" element
     */
    public java.util.Calendar getTaxVerificationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXVERIFICATIONDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "TaxVerificationDate" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.SAFdateType xgetTaxVerificationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(TAXVERIFICATIONDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TaxVerificationDate" element
     */
    public void setTaxVerificationDate(java.util.Calendar taxVerificationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXVERIFICATIONDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXVERIFICATIONDATE$0);
            }
            target.setCalendarValue(taxVerificationDate);
        }
    }
    
    /**
     * Sets (as xml) the "TaxVerificationDate" element
     */
    public void xsetTaxVerificationDate(x0301.oecdStandardAuditFileTaxPT1.SAFdateType taxVerificationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(TAXVERIFICATIONDATE$0, 0);
            if (target == null)
            {
                target = (x0301.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().add_element_user(TAXVERIFICATIONDATE$0);
            }
            target.set(taxVerificationDate);
        }
    }
}
