/*
 * An XML document type.
 * Localname: EACCode
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.EACCodeDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one EACCode(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class EACCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.EACCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public EACCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EACCODE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "EACCode");
    
    
    /**
     * Gets the "EACCode" element
     */
    public java.lang.String getEACCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EACCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EACCode" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.EACCodeDocument.EACCode xgetEACCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.EACCodeDocument.EACCode target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.EACCodeDocument.EACCode)get_store().find_element_user(EACCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "EACCode" element
     */
    public void setEACCode(java.lang.String eacCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EACCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EACCODE$0);
            }
            target.setStringValue(eacCode);
        }
    }
    
    /**
     * Sets (as xml) the "EACCode" element
     */
    public void xsetEACCode(x0401.oecdStandardAuditFileTaxPT1.EACCodeDocument.EACCode eacCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.EACCodeDocument.EACCode target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.EACCodeDocument.EACCode)get_store().find_element_user(EACCODE$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.EACCodeDocument.EACCode)get_store().add_element_user(EACCODE$0);
            }
            target.set(eacCode);
        }
    }
    /**
     * An XML EACCode(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
     *
     * This is an atomic type that is a restriction of x0401.oecdStandardAuditFileTaxPT1.EACCodeDocument$EACCode.
     */
    public static class EACCodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements x0401.oecdStandardAuditFileTaxPT1.EACCodeDocument.EACCode
    {
        private static final long serialVersionUID = 1L;
        
        public EACCodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected EACCodeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
