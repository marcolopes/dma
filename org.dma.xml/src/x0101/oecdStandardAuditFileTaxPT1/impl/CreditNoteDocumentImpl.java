/*
 * An XML document type.
 * Localname: CreditNote
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.01_01
 * Java type: x0101.oecdStandardAuditFileTaxPT1.CreditNoteDocument
 *
 * Automatically generated - do not modify.
 */
package x0101.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one CreditNote(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01) element.
 *
 * This is a complex type.
 */
public class CreditNoteDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.CreditNoteDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreditNoteDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
     * An XML CreditNote(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01).
     *
     * This is a complex type.
     */
    public static class CreditNoteImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.CreditNoteDocument.CreditNote
    {
        private static final long serialVersionUID = 1L;
        
        public CreditNoteImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REFERENCE$0 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "Reference");
        private static final javax.xml.namespace.QName REASON$2 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "Reason");
        
        
        /**
         * Gets the "Reference" element
         */
        public java.lang.String getReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Reference" element
         */
        public x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car xgetReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(REFERENCE$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "Reference" element
         */
        public boolean isSetReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REFERENCE$0) != 0;
            }
        }
        
        /**
         * Sets the "Reference" element
         */
        public void setReference(java.lang.String reference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERENCE$0);
                }
                target.setStringValue(reference);
            }
        }
        
        /**
         * Sets (as xml) the "Reference" element
         */
        public void xsetReference(x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car reference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(REFERENCE$0, 0);
                if (target == null)
                {
                    target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().add_element_user(REFERENCE$0);
                }
                target.set(reference);
            }
        }
        
        /**
         * Unsets the "Reference" element
         */
        public void unsetReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REFERENCE$0, 0);
            }
        }
        
        /**
         * Gets the "Reason" element
         */
        public java.lang.String getReason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASON$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Reason" element
         */
        public x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car xgetReason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().find_element_user(REASON$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "Reason" element
         */
        public boolean isSetReason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REASON$2) != 0;
            }
        }
        
        /**
         * Sets the "Reason" element
         */
        public void setReason(java.lang.String reason)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASON$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REASON$2);
                }
                target.setStringValue(reason);
            }
        }
        
        /**
         * Sets (as xml) the "Reason" element
         */
        public void xsetReason(x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car reason)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().find_element_user(REASON$2, 0);
                if (target == null)
                {
                    target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().add_element_user(REASON$2);
                }
                target.set(reason);
            }
        }
        
        /**
         * Unsets the "Reason" element
         */
        public void unsetReason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REASON$2, 0);
            }
        }
    }
}
