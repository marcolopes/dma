/*
 * An XML document type.
 * Localname: TaxAccountingBasis
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.02_01
 * Java type: x0201.oecdStandardAuditFileTaxPT1.TaxAccountingBasisDocument
 *
 * Automatically generated - do not modify.
 */
package x0201.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one TaxAccountingBasis(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01) element.
 *
 * This is a complex type.
 */
public class TaxAccountingBasisDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0201.oecdStandardAuditFileTaxPT1.TaxAccountingBasisDocument
{
    private static final long serialVersionUID = 1L;
    
    public TaxAccountingBasisDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TAXACCOUNTINGBASIS$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "TaxAccountingBasis");
    
    
    /**
     * Gets the "TaxAccountingBasis" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.TaxAccountingBasisDocument.TaxAccountingBasis.Enum getTaxAccountingBasis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXACCOUNTINGBASIS$0, 0);
            if (target == null)
            {
                return null;
            }
            return (x0201.oecdStandardAuditFileTaxPT1.TaxAccountingBasisDocument.TaxAccountingBasis.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "TaxAccountingBasis" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.TaxAccountingBasisDocument.TaxAccountingBasis xgetTaxAccountingBasis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.TaxAccountingBasisDocument.TaxAccountingBasis target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.TaxAccountingBasisDocument.TaxAccountingBasis)get_store().find_element_user(TAXACCOUNTINGBASIS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TaxAccountingBasis" element
     */
    public void setTaxAccountingBasis(x0201.oecdStandardAuditFileTaxPT1.TaxAccountingBasisDocument.TaxAccountingBasis.Enum taxAccountingBasis)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXACCOUNTINGBASIS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXACCOUNTINGBASIS$0);
            }
            target.setEnumValue(taxAccountingBasis);
        }
    }
    
    /**
     * Sets (as xml) the "TaxAccountingBasis" element
     */
    public void xsetTaxAccountingBasis(x0201.oecdStandardAuditFileTaxPT1.TaxAccountingBasisDocument.TaxAccountingBasis taxAccountingBasis)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.TaxAccountingBasisDocument.TaxAccountingBasis target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.TaxAccountingBasisDocument.TaxAccountingBasis)get_store().find_element_user(TAXACCOUNTINGBASIS$0, 0);
            if (target == null)
            {
                target = (x0201.oecdStandardAuditFileTaxPT1.TaxAccountingBasisDocument.TaxAccountingBasis)get_store().add_element_user(TAXACCOUNTINGBASIS$0);
            }
            target.set(taxAccountingBasis);
        }
    }
    /**
     * An XML TaxAccountingBasis(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01).
     *
     * This is an atomic type that is a restriction of x0201.oecdStandardAuditFileTaxPT1.TaxAccountingBasisDocument$TaxAccountingBasis.
     */
    public static class TaxAccountingBasisImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x0201.oecdStandardAuditFileTaxPT1.TaxAccountingBasisDocument.TaxAccountingBasis
    {
        private static final long serialVersionUID = 1L;
        
        public TaxAccountingBasisImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected TaxAccountingBasisImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
