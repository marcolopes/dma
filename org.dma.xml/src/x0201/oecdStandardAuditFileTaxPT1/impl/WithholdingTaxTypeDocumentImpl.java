/*
 * An XML document type.
 * Localname: WithholdingTaxType
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.02_01
 * Java type: x0201.oecdStandardAuditFileTaxPT1.WithholdingTaxTypeDocument
 *
 * Automatically generated - do not modify.
 */
package x0201.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one WithholdingTaxType(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01) element.
 *
 * This is a complex type.
 */
public class WithholdingTaxTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0201.oecdStandardAuditFileTaxPT1.WithholdingTaxTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public WithholdingTaxTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WITHHOLDINGTAXTYPE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "WithholdingTaxType");
    
    
    /**
     * Gets the "WithholdingTaxType" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.WithholdingTaxTypeDocument.WithholdingTaxType.Enum getWithholdingTaxType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WITHHOLDINGTAXTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (x0201.oecdStandardAuditFileTaxPT1.WithholdingTaxTypeDocument.WithholdingTaxType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "WithholdingTaxType" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.WithholdingTaxTypeDocument.WithholdingTaxType xgetWithholdingTaxType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.WithholdingTaxTypeDocument.WithholdingTaxType target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.WithholdingTaxTypeDocument.WithholdingTaxType)get_store().find_element_user(WITHHOLDINGTAXTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "WithholdingTaxType" element
     */
    public void setWithholdingTaxType(x0201.oecdStandardAuditFileTaxPT1.WithholdingTaxTypeDocument.WithholdingTaxType.Enum withholdingTaxType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WITHHOLDINGTAXTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WITHHOLDINGTAXTYPE$0);
            }
            target.setEnumValue(withholdingTaxType);
        }
    }
    
    /**
     * Sets (as xml) the "WithholdingTaxType" element
     */
    public void xsetWithholdingTaxType(x0201.oecdStandardAuditFileTaxPT1.WithholdingTaxTypeDocument.WithholdingTaxType withholdingTaxType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.WithholdingTaxTypeDocument.WithholdingTaxType target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.WithholdingTaxTypeDocument.WithholdingTaxType)get_store().find_element_user(WITHHOLDINGTAXTYPE$0, 0);
            if (target == null)
            {
                target = (x0201.oecdStandardAuditFileTaxPT1.WithholdingTaxTypeDocument.WithholdingTaxType)get_store().add_element_user(WITHHOLDINGTAXTYPE$0);
            }
            target.set(withholdingTaxType);
        }
    }
    /**
     * An XML WithholdingTaxType(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01).
     *
     * This is an atomic type that is a restriction of x0201.oecdStandardAuditFileTaxPT1.WithholdingTaxTypeDocument$WithholdingTaxType.
     */
    public static class WithholdingTaxTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x0201.oecdStandardAuditFileTaxPT1.WithholdingTaxTypeDocument.WithholdingTaxType
    {
        private static final long serialVersionUID = 1L;
        
        public WithholdingTaxTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected WithholdingTaxTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
