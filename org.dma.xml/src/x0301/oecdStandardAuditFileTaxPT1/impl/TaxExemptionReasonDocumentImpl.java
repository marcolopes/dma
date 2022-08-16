/*
 * An XML document type.
 * Localname: TaxExemptionReason
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.03_01
 * Java type: x0301.oecdStandardAuditFileTaxPT1.TaxExemptionReasonDocument
 *
 * Automatically generated - do not modify.
 */
package x0301.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one TaxExemptionReason(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01) element.
 *
 * This is a complex type.
 */
public class TaxExemptionReasonDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0301.oecdStandardAuditFileTaxPT1.TaxExemptionReasonDocument
{
    private static final long serialVersionUID = 1L;
    
    public TaxExemptionReasonDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TAXEXEMPTIONREASON$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "TaxExemptionReason");
    
    
    /**
     * Gets the "TaxExemptionReason" element
     */
    public java.lang.String getTaxExemptionReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXEXEMPTIONREASON$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TaxExemptionReason" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemption xgetTaxExemptionReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemption target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemption)get_store().find_element_user(TAXEXEMPTIONREASON$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TaxExemptionReason" element
     */
    public void setTaxExemptionReason(java.lang.String taxExemptionReason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXEXEMPTIONREASON$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXEXEMPTIONREASON$0);
            }
            target.setStringValue(taxExemptionReason);
        }
    }
    
    /**
     * Sets (as xml) the "TaxExemptionReason" element
     */
    public void xsetTaxExemptionReason(x0301.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemption taxExemptionReason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemption target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemption)get_store().find_element_user(TAXEXEMPTIONREASON$0, 0);
            if (target == null)
            {
                target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTPortugueseTaxExemption)get_store().add_element_user(TAXEXEMPTIONREASON$0);
            }
            target.set(taxExemptionReason);
        }
    }
}
