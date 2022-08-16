/*
 * An XML document type.
 * Localname: DocArchivalNumber
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.01_01
 * Java type: x0101.oecdStandardAuditFileTaxPT1.DocArchivalNumberDocument
 *
 * Automatically generated - do not modify.
 */
package x0101.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one DocArchivalNumber(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01) element.
 *
 * This is a complex type.
 */
public class DocArchivalNumberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.DocArchivalNumberDocument
{
    private static final long serialVersionUID = 1L;
    
    public DocArchivalNumberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOCARCHIVALNUMBER$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "DocArchivalNumber");
    
    
    /**
     * Gets the "DocArchivalNumber" element
     */
    public java.lang.String getDocArchivalNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCARCHIVALNUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DocArchivalNumber" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.SAFTPTDocArchivalNumber xgetDocArchivalNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.SAFTPTDocArchivalNumber target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.SAFTPTDocArchivalNumber)get_store().find_element_user(DOCARCHIVALNUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DocArchivalNumber" element
     */
    public void setDocArchivalNumber(java.lang.String docArchivalNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCARCHIVALNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCARCHIVALNUMBER$0);
            }
            target.setStringValue(docArchivalNumber);
        }
    }
    
    /**
     * Sets (as xml) the "DocArchivalNumber" element
     */
    public void xsetDocArchivalNumber(x0101.oecdStandardAuditFileTaxPT1.SAFTPTDocArchivalNumber docArchivalNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.SAFTPTDocArchivalNumber target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.SAFTPTDocArchivalNumber)get_store().find_element_user(DOCARCHIVALNUMBER$0, 0);
            if (target == null)
            {
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFTPTDocArchivalNumber)get_store().add_element_user(DOCARCHIVALNUMBER$0);
            }
            target.set(docArchivalNumber);
        }
    }
}
