/*
 * An XML document type.
 * Localname: NetTotal
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.03_01
 * Java type: x0301.oecdStandardAuditFileTaxPT1.NetTotalDocument
 *
 * Automatically generated - do not modify.
 */
package x0301.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one NetTotal(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01) element.
 *
 * This is a complex type.
 */
public class NetTotalDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0301.oecdStandardAuditFileTaxPT1.NetTotalDocument
{
    private static final long serialVersionUID = 1L;
    
    public NetTotalDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NETTOTAL$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "NetTotal");
    
    
    /**
     * Gets the "NetTotal" element
     */
    public java.math.BigDecimal getNetTotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NETTOTAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "NetTotal" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetNetTotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(NETTOTAL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NetTotal" element
     */
    public void setNetTotal(java.math.BigDecimal netTotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NETTOTAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NETTOTAL$0);
            }
            target.setBigDecimalValue(netTotal);
        }
    }
    
    /**
     * Sets (as xml) the "NetTotal" element
     */
    public void xsetNetTotal(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType netTotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(NETTOTAL$0, 0);
            if (target == null)
            {
                target = (x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(NETTOTAL$0);
            }
            target.set(netTotal);
        }
    }
}
