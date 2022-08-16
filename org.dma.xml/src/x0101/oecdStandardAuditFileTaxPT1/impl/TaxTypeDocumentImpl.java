/*
 * An XML document type.
 * Localname: TaxType
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.01_01
 * Java type: x0101.oecdStandardAuditFileTaxPT1.TaxTypeDocument
 *
 * Automatically generated - do not modify.
 */
package x0101.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one TaxType(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01) element.
 *
 * This is a complex type.
 */
public class TaxTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.TaxTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public TaxTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TAXTYPE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "TaxType");
    
    
    /**
     * Gets the "TaxType" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.TaxTypeDocument.TaxType.Enum getTaxType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (x0101.oecdStandardAuditFileTaxPT1.TaxTypeDocument.TaxType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "TaxType" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.TaxTypeDocument.TaxType xgetTaxType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.TaxTypeDocument.TaxType target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.TaxTypeDocument.TaxType)get_store().find_element_user(TAXTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TaxType" element
     */
    public void setTaxType(x0101.oecdStandardAuditFileTaxPT1.TaxTypeDocument.TaxType.Enum taxType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXTYPE$0);
            }
            target.setEnumValue(taxType);
        }
    }
    
    /**
     * Sets (as xml) the "TaxType" element
     */
    public void xsetTaxType(x0101.oecdStandardAuditFileTaxPT1.TaxTypeDocument.TaxType taxType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.TaxTypeDocument.TaxType target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.TaxTypeDocument.TaxType)get_store().find_element_user(TAXTYPE$0, 0);
            if (target == null)
            {
                target = (x0101.oecdStandardAuditFileTaxPT1.TaxTypeDocument.TaxType)get_store().add_element_user(TAXTYPE$0);
            }
            target.set(taxType);
        }
    }
    /**
     * An XML TaxType(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01).
     *
     * This is an atomic type that is a restriction of x0101.oecdStandardAuditFileTaxPT1.TaxTypeDocument$TaxType.
     */
    public static class TaxTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x0101.oecdStandardAuditFileTaxPT1.TaxTypeDocument.TaxType
    {
        private static final long serialVersionUID = 1L;
        
        public TaxTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected TaxTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
