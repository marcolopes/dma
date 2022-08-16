/*
 * An XML document type.
 * Localname: RecordID
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.RecordIDDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one RecordID(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class RecordIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.RecordIDDocument
{
    private static final long serialVersionUID = 1L;
    
    public RecordIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECORDID$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "RecordID");
    
    
    /**
     * Gets the "RecordID" element
     */
    public java.lang.String getRecordID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECORDID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RecordID" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetRecordID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(RECORDID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RecordID" element
     */
    public void setRecordID(java.lang.String recordID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECORDID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECORDID$0);
            }
            target.setStringValue(recordID);
        }
    }
    
    /**
     * Sets (as xml) the "RecordID" element
     */
    public void xsetRecordID(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car recordID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(RECORDID$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().add_element_user(RECORDID$0);
            }
            target.set(recordID);
        }
    }
}
