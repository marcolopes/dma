/*
 * An XML document type.
 * Localname: TaxExemptionCode
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.TaxExemptionCodeDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one TaxExemptionCode(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class TaxExemptionCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.TaxExemptionCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public TaxExemptionCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TAXEXEMPTIONCODE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TaxExemptionCode");
    
    
    /**
     * Gets the "TaxExemptionCode" element
     */
    public java.lang.String getTaxExemptionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXEXEMPTIONCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TaxExemptionCode" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionCode xgetTaxExemptionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionCode target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionCode)get_store().find_element_user(TAXEXEMPTIONCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TaxExemptionCode" element
     */
    public void setTaxExemptionCode(java.lang.String taxExemptionCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXEXEMPTIONCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXEXEMPTIONCODE$0);
            }
            target.setStringValue(taxExemptionCode);
        }
    }
    
    /**
     * Sets (as xml) the "TaxExemptionCode" element
     */
    public void xsetTaxExemptionCode(x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionCode taxExemptionCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionCode target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionCode)get_store().find_element_user(TAXEXEMPTIONCODE$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemptionCode)get_store().add_element_user(TAXEXEMPTIONCODE$0);
            }
            target.set(taxExemptionCode);
        }
    }
}
