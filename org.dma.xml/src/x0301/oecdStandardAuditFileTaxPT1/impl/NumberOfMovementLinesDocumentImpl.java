/*
 * An XML document type.
 * Localname: NumberOfMovementLines
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.03_01
 * Java type: x0301.oecdStandardAuditFileTaxPT1.NumberOfMovementLinesDocument
 *
 * Automatically generated - do not modify.
 */
package x0301.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one NumberOfMovementLines(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01) element.
 *
 * This is a complex type.
 */
public class NumberOfMovementLinesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0301.oecdStandardAuditFileTaxPT1.NumberOfMovementLinesDocument
{
    private static final long serialVersionUID = 1L;
    
    public NumberOfMovementLinesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMBEROFMOVEMENTLINES$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "NumberOfMovementLines");
    
    
    /**
     * Gets the "NumberOfMovementLines" element
     */
    public java.math.BigInteger getNumberOfMovementLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFMOVEMENTLINES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumberOfMovementLines" element
     */
    public org.apache.xmlbeans.XmlNonNegativeInteger xgetNumberOfMovementLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(NUMBEROFMOVEMENTLINES$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NumberOfMovementLines" element
     */
    public void setNumberOfMovementLines(java.math.BigInteger numberOfMovementLines)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFMOVEMENTLINES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFMOVEMENTLINES$0);
            }
            target.setBigIntegerValue(numberOfMovementLines);
        }
    }
    
    /**
     * Sets (as xml) the "NumberOfMovementLines" element
     */
    public void xsetNumberOfMovementLines(org.apache.xmlbeans.XmlNonNegativeInteger numberOfMovementLines)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(NUMBEROFMOVEMENTLINES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(NUMBEROFMOVEMENTLINES$0);
            }
            target.set(numberOfMovementLines);
        }
    }
}
