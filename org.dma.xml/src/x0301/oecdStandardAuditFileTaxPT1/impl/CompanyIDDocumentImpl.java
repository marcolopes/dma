/*
 * An XML document type.
 * Localname: CompanyID
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.03_01
 * Java type: x0301.oecdStandardAuditFileTaxPT1.CompanyIDDocument
 *
 * Automatically generated - do not modify.
 */
package x0301.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one CompanyID(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01) element.
 *
 * This is a complex type.
 */
public class CompanyIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0301.oecdStandardAuditFileTaxPT1.CompanyIDDocument
{
    private static final long serialVersionUID = 1L;
    
    public CompanyIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPANYID$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "CompanyID");
    
    
    /**
     * Gets the "CompanyID" element
     */
    public java.lang.String getCompanyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPANYID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CompanyID" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.CompanyIDDocument.CompanyID xgetCompanyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.CompanyIDDocument.CompanyID target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.CompanyIDDocument.CompanyID)get_store().find_element_user(COMPANYID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CompanyID" element
     */
    public void setCompanyID(java.lang.String companyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPANYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPANYID$0);
            }
            target.setStringValue(companyID);
        }
    }
    
    /**
     * Sets (as xml) the "CompanyID" element
     */
    public void xsetCompanyID(x0301.oecdStandardAuditFileTaxPT1.CompanyIDDocument.CompanyID companyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.CompanyIDDocument.CompanyID target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.CompanyIDDocument.CompanyID)get_store().find_element_user(COMPANYID$0, 0);
            if (target == null)
            {
                target = (x0301.oecdStandardAuditFileTaxPT1.CompanyIDDocument.CompanyID)get_store().add_element_user(COMPANYID$0);
            }
            target.set(companyID);
        }
    }
    /**
     * An XML CompanyID(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
     *
     * This is an atomic type that is a restriction of x0301.oecdStandardAuditFileTaxPT1.CompanyIDDocument$CompanyID.
     */
    public static class CompanyIDImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements x0301.oecdStandardAuditFileTaxPT1.CompanyIDDocument.CompanyID
    {
        private static final long serialVersionUID = 1L;
        
        public CompanyIDImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected CompanyIDImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
