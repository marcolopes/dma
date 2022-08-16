/*
 * An XML document type.
 * Localname: TaxonomyReference
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.TaxonomyReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one TaxonomyReference(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class TaxonomyReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.TaxonomyReferenceDocument
{
    private static final long serialVersionUID = 1L;
    
    public TaxonomyReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TAXONOMYREFERENCE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TaxonomyReference");
    
    
    /**
     * Gets the "TaxonomyReference" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.TaxonomyReferenceDocument.TaxonomyReference.Enum getTaxonomyReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXONOMYREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (x0401.oecdStandardAuditFileTaxPT1.TaxonomyReferenceDocument.TaxonomyReference.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "TaxonomyReference" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.TaxonomyReferenceDocument.TaxonomyReference xgetTaxonomyReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.TaxonomyReferenceDocument.TaxonomyReference target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.TaxonomyReferenceDocument.TaxonomyReference)get_store().find_element_user(TAXONOMYREFERENCE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TaxonomyReference" element
     */
    public void setTaxonomyReference(x0401.oecdStandardAuditFileTaxPT1.TaxonomyReferenceDocument.TaxonomyReference.Enum taxonomyReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXONOMYREFERENCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXONOMYREFERENCE$0);
            }
            target.setEnumValue(taxonomyReference);
        }
    }
    
    /**
     * Sets (as xml) the "TaxonomyReference" element
     */
    public void xsetTaxonomyReference(x0401.oecdStandardAuditFileTaxPT1.TaxonomyReferenceDocument.TaxonomyReference taxonomyReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.TaxonomyReferenceDocument.TaxonomyReference target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.TaxonomyReferenceDocument.TaxonomyReference)get_store().find_element_user(TAXONOMYREFERENCE$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.TaxonomyReferenceDocument.TaxonomyReference)get_store().add_element_user(TAXONOMYREFERENCE$0);
            }
            target.set(taxonomyReference);
        }
    }
    /**
     * An XML TaxonomyReference(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
     *
     * This is an atomic type that is a restriction of x0401.oecdStandardAuditFileTaxPT1.TaxonomyReferenceDocument$TaxonomyReference.
     */
    public static class TaxonomyReferenceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x0401.oecdStandardAuditFileTaxPT1.TaxonomyReferenceDocument.TaxonomyReference
    {
        private static final long serialVersionUID = 1L;
        
        public TaxonomyReferenceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected TaxonomyReferenceImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
