/*
 * An XML document type.
 * Localname: TaxCode
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.02_01
 * Java type: x0201.oecdStandardAuditFileTaxPT1.TaxCodeDocument
 *
 * Automatically generated - do not modify.
 */
package x0201.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one TaxCode(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01) element.
 *
 * This is a complex type.
 */
public class TaxCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0201.oecdStandardAuditFileTaxPT1.TaxCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public TaxCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TAXCODE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "TaxCode");
    
    
    /**
     * Gets the "TaxCode" element
     */
    public java.lang.String getTaxCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TaxCode" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.TaxCodeDocument.TaxCode xgetTaxCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.TaxCodeDocument.TaxCode target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.TaxCodeDocument.TaxCode)get_store().find_element_user(TAXCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TaxCode" element
     */
    public void setTaxCode(java.lang.String taxCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXCODE$0);
            }
            target.setStringValue(taxCode);
        }
    }
    
    /**
     * Sets (as xml) the "TaxCode" element
     */
    public void xsetTaxCode(x0201.oecdStandardAuditFileTaxPT1.TaxCodeDocument.TaxCode taxCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.TaxCodeDocument.TaxCode target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.TaxCodeDocument.TaxCode)get_store().find_element_user(TAXCODE$0, 0);
            if (target == null)
            {
                target = (x0201.oecdStandardAuditFileTaxPT1.TaxCodeDocument.TaxCode)get_store().add_element_user(TAXCODE$0);
            }
            target.set(taxCode);
        }
    }
    /**
     * An XML TaxCode(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01).
     *
     * This is an atomic type that is a restriction of x0201.oecdStandardAuditFileTaxPT1.TaxCodeDocument$TaxCode.
     */
    public static class TaxCodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements x0201.oecdStandardAuditFileTaxPT1.TaxCodeDocument.TaxCode
    {
        private static final long serialVersionUID = 1L;
        
        public TaxCodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected TaxCodeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
