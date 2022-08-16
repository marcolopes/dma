/*
 * An XML document type.
 * Localname: DocumentNumber
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.DocumentNumberDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one DocumentNumber(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class DocumentNumberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.DocumentNumberDocument
{
    private static final long serialVersionUID = 1L;
    
    public DocumentNumberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOCUMENTNUMBER$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "DocumentNumber");
    
    
    /**
     * Gets the "DocumentNumber" element
     */
    public java.lang.String getDocumentNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTNUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DocumentNumber" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.DocumentNumberDocument.DocumentNumber xgetDocumentNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.DocumentNumberDocument.DocumentNumber target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.DocumentNumberDocument.DocumentNumber)get_store().find_element_user(DOCUMENTNUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DocumentNumber" element
     */
    public void setDocumentNumber(java.lang.String documentNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCUMENTNUMBER$0);
            }
            target.setStringValue(documentNumber);
        }
    }
    
    /**
     * Sets (as xml) the "DocumentNumber" element
     */
    public void xsetDocumentNumber(x0401.oecdStandardAuditFileTaxPT1.DocumentNumberDocument.DocumentNumber documentNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.DocumentNumberDocument.DocumentNumber target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.DocumentNumberDocument.DocumentNumber)get_store().find_element_user(DOCUMENTNUMBER$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.DocumentNumberDocument.DocumentNumber)get_store().add_element_user(DOCUMENTNUMBER$0);
            }
            target.set(documentNumber);
        }
    }
    /**
     * An XML DocumentNumber(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
     *
     * This is an atomic type that is a restriction of x0401.oecdStandardAuditFileTaxPT1.DocumentNumberDocument$DocumentNumber.
     */
    public static class DocumentNumberImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements x0401.oecdStandardAuditFileTaxPT1.DocumentNumberDocument.DocumentNumber
    {
        private static final long serialVersionUID = 1L;
        
        public DocumentNumberImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected DocumentNumberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
