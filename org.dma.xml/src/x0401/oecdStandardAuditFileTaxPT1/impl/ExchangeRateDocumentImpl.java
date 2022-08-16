/*
 * An XML document type.
 * Localname: ExchangeRate
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.ExchangeRateDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one ExchangeRate(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class ExchangeRateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.ExchangeRateDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExchangeRateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXCHANGERATE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "ExchangeRate");
    
    
    /**
     * Gets the "ExchangeRate" element
     */
    public java.math.BigDecimal getExchangeRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXCHANGERATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExchangeRate" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType xgetExchangeRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType)get_store().find_element_user(EXCHANGERATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ExchangeRate" element
     */
    public void setExchangeRate(java.math.BigDecimal exchangeRate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXCHANGERATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXCHANGERATE$0);
            }
            target.setBigDecimalValue(exchangeRate);
        }
    }
    
    /**
     * Sets (as xml) the "ExchangeRate" element
     */
    public void xsetExchangeRate(x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType exchangeRate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType)get_store().find_element_user(EXCHANGERATE$0, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFdecimalType)get_store().add_element_user(EXCHANGERATE$0);
            }
            target.set(exchangeRate);
        }
    }
}
