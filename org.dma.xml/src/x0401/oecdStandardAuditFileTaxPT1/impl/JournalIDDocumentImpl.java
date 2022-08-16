/*
 * An XML document type.
 * Localname: JournalID
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.JournalIDDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one JournalID(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class JournalIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.JournalIDDocument
{
    private static final long serialVersionUID = 1L;
    
    public JournalIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JOURNALID$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "JournalID");
    
    
    /**
     * Gets the "JournalID" element
     */
    public java.lang.String getJournalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOURNALID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "JournalID" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFPTJournalID xgetJournalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTJournalID target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTJournalID)get_store().find_element_user(JOURNALID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "JournalID" element
     */
    public void setJournalID(java.lang.String journalID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOURNALID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOURNALID$0);
            }
            target.setStringValue(journalID);
        }
    }
    
    /**
     * Sets (as xml) the "JournalID" element
     */
    public void xsetJournalID(x0401.oecdStandardAuditFileTaxPT1.SAFPTJournalID journalID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTJournalID target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTJournalID)get_store().find_element_user(JOURNALID$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTJournalID)get_store().add_element_user(JOURNALID$0);
            }
            target.set(journalID);
        }
    }
}
