/*
 * An XML document type.
 * Localname: GrossTotal
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.GrossTotalDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one GrossTotal(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class GrossTotalDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.GrossTotalDocument
{
    private static final long serialVersionUID = 1L;
    
    public GrossTotalDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROSSTOTAL$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "GrossTotal");
    
    
    /**
     * Gets the "GrossTotal" element
     */
    public java.math.BigDecimal getGrossTotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROSSTOTAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "GrossTotal" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetGrossTotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(GROSSTOTAL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "GrossTotal" element
     */
    public void setGrossTotal(java.math.BigDecimal grossTotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROSSTOTAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GROSSTOTAL$0);
            }
            target.setBigDecimalValue(grossTotal);
        }
    }
    
    /**
     * Sets (as xml) the "GrossTotal" element
     */
    public void xsetGrossTotal(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType grossTotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(GROSSTOTAL$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(GROSSTOTAL$0);
            }
            target.set(grossTotal);
        }
    }
}
