/*
 * An XML document type.
 * Localname: References
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.01_01
 * Java type: x0101.oecdStandardAuditFileTaxPT1.ReferencesDocument
 *
 * Automatically generated - do not modify.
 */
package x0101.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one References(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01) element.
 *
 * This is a complex type.
 */
public class ReferencesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.ReferencesDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReferencesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFERENCES$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "References");
    
    
    /**
     * Gets the "References" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.ReferencesDocument.References getReferences()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.ReferencesDocument.References target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.ReferencesDocument.References)get_store().find_element_user(REFERENCES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "References" element
     */
    public void setReferences(x0101.oecdStandardAuditFileTaxPT1.ReferencesDocument.References references)
    {
        generatedSetterHelperImpl(references, REFERENCES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "References" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.ReferencesDocument.References addNewReferences()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.ReferencesDocument.References target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.ReferencesDocument.References)get_store().add_element_user(REFERENCES$0);
            return target;
        }
    }
    /**
     * An XML References(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01).
     *
     * This is a complex type.
     */
    public static class ReferencesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.ReferencesDocument.References
    {
        private static final long serialVersionUID = 1L;
        
        public ReferencesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CREDITNOTE$0 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "CreditNote");
        
        
        /**
         * Gets the "CreditNote" element
         */
        public x0101.oecdStandardAuditFileTaxPT1.CreditNoteDocument.CreditNote getCreditNote()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.CreditNoteDocument.CreditNote target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.CreditNoteDocument.CreditNote)get_store().find_element_user(CREDITNOTE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "CreditNote" element
         */
        public boolean isSetCreditNote()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CREDITNOTE$0) != 0;
            }
        }
        
        /**
         * Sets the "CreditNote" element
         */
        public void setCreditNote(x0101.oecdStandardAuditFileTaxPT1.CreditNoteDocument.CreditNote creditNote)
        {
            generatedSetterHelperImpl(creditNote, CREDITNOTE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "CreditNote" element
         */
        public x0101.oecdStandardAuditFileTaxPT1.CreditNoteDocument.CreditNote addNewCreditNote()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.CreditNoteDocument.CreditNote target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.CreditNoteDocument.CreditNote)get_store().add_element_user(CREDITNOTE$0);
                return target;
            }
        }
        
        /**
         * Unsets the "CreditNote" element
         */
        public void unsetCreditNote()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CREDITNOTE$0, 0);
            }
        }
    }
}
