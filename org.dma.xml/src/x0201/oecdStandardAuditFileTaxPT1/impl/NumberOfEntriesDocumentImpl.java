/*
 * An XML document type.
 * Localname: NumberOfEntries
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.02_01
 * Java type: x0201.oecdStandardAuditFileTaxPT1.NumberOfEntriesDocument
 *
 * Automatically generated - do not modify.
 */
package x0201.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one NumberOfEntries(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01) element.
 *
 * This is a complex type.
 */
public class NumberOfEntriesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0201.oecdStandardAuditFileTaxPT1.NumberOfEntriesDocument
{
    private static final long serialVersionUID = 1L;
    
    public NumberOfEntriesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMBEROFENTRIES$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "NumberOfEntries");
    
    
    /**
     * Gets the "NumberOfEntries" element
     */
    public java.math.BigInteger getNumberOfEntries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFENTRIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumberOfEntries" element
     */
    public org.apache.xmlbeans.XmlNonNegativeInteger xgetNumberOfEntries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(NUMBEROFENTRIES$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NumberOfEntries" element
     */
    public void setNumberOfEntries(java.math.BigInteger numberOfEntries)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFENTRIES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFENTRIES$0);
            }
            target.setBigIntegerValue(numberOfEntries);
        }
    }
    
    /**
     * Sets (as xml) the "NumberOfEntries" element
     */
    public void xsetNumberOfEntries(org.apache.xmlbeans.XmlNonNegativeInteger numberOfEntries)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(NUMBEROFENTRIES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(NUMBEROFENTRIES$0);
            }
            target.set(numberOfEntries);
        }
    }
}
