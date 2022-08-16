/*
 * XML Type:  WithholdingTax
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.02_01
 * Java type: x0201.oecdStandardAuditFileTaxPT1.WithholdingTax
 *
 * Automatically generated - do not modify.
 */
package x0201.oecdStandardAuditFileTaxPT1.impl;
/**
 * An XML WithholdingTax(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01).
 *
 * This is a complex type.
 */
public class WithholdingTaxImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0201.oecdStandardAuditFileTaxPT1.WithholdingTax
{
    private static final long serialVersionUID = 1L;
    
    public WithholdingTaxImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WITHHOLDINGTAXTYPE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "WithholdingTaxType");
    private static final javax.xml.namespace.QName WITHHOLDINGTAXDESCRIPTION$2 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "WithholdingTaxDescription");
    private static final javax.xml.namespace.QName WITHHOLDINGTAXAMOUNT$4 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "WithholdingTaxAmount");
    
    
    /**
     * Gets the "WithholdingTaxType" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.WithholdingTaxTypeDocument.WithholdingTaxType.Enum getWithholdingTaxType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WITHHOLDINGTAXTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (x0201.oecdStandardAuditFileTaxPT1.WithholdingTaxTypeDocument.WithholdingTaxType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "WithholdingTaxType" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.WithholdingTaxTypeDocument.WithholdingTaxType xgetWithholdingTaxType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.WithholdingTaxTypeDocument.WithholdingTaxType target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.WithholdingTaxTypeDocument.WithholdingTaxType)get_store().find_element_user(WITHHOLDINGTAXTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "WithholdingTaxType" element
     */
    public boolean isSetWithholdingTaxType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WITHHOLDINGTAXTYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "WithholdingTaxType" element
     */
    public void setWithholdingTaxType(x0201.oecdStandardAuditFileTaxPT1.WithholdingTaxTypeDocument.WithholdingTaxType.Enum withholdingTaxType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WITHHOLDINGTAXTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WITHHOLDINGTAXTYPE$0);
            }
            target.setEnumValue(withholdingTaxType);
        }
    }
    
    /**
     * Sets (as xml) the "WithholdingTaxType" element
     */
    public void xsetWithholdingTaxType(x0201.oecdStandardAuditFileTaxPT1.WithholdingTaxTypeDocument.WithholdingTaxType withholdingTaxType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.WithholdingTaxTypeDocument.WithholdingTaxType target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.WithholdingTaxTypeDocument.WithholdingTaxType)get_store().find_element_user(WITHHOLDINGTAXTYPE$0, 0);
            if (target == null)
            {
                target = (x0201.oecdStandardAuditFileTaxPT1.WithholdingTaxTypeDocument.WithholdingTaxType)get_store().add_element_user(WITHHOLDINGTAXTYPE$0);
            }
            target.set(withholdingTaxType);
        }
    }
    
    /**
     * Unsets the "WithholdingTaxType" element
     */
    public void unsetWithholdingTaxType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WITHHOLDINGTAXTYPE$0, 0);
        }
    }
    
    /**
     * Gets the "WithholdingTaxDescription" element
     */
    public java.lang.String getWithholdingTaxDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WITHHOLDINGTAXDESCRIPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "WithholdingTaxDescription" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car xgetWithholdingTaxDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(WITHHOLDINGTAXDESCRIPTION$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "WithholdingTaxDescription" element
     */
    public boolean isSetWithholdingTaxDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WITHHOLDINGTAXDESCRIPTION$2) != 0;
        }
    }
    
    /**
     * Sets the "WithholdingTaxDescription" element
     */
    public void setWithholdingTaxDescription(java.lang.String withholdingTaxDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WITHHOLDINGTAXDESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WITHHOLDINGTAXDESCRIPTION$2);
            }
            target.setStringValue(withholdingTaxDescription);
        }
    }
    
    /**
     * Sets (as xml) the "WithholdingTaxDescription" element
     */
    public void xsetWithholdingTaxDescription(x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car withholdingTaxDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(WITHHOLDINGTAXDESCRIPTION$2, 0);
            if (target == null)
            {
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().add_element_user(WITHHOLDINGTAXDESCRIPTION$2);
            }
            target.set(withholdingTaxDescription);
        }
    }
    
    /**
     * Unsets the "WithholdingTaxDescription" element
     */
    public void unsetWithholdingTaxDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WITHHOLDINGTAXDESCRIPTION$2, 0);
        }
    }
    
    /**
     * Gets the "WithholdingTaxAmount" element
     */
    public java.math.BigDecimal getWithholdingTaxAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WITHHOLDINGTAXAMOUNT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "WithholdingTaxAmount" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetWithholdingTaxAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(WITHHOLDINGTAXAMOUNT$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "WithholdingTaxAmount" element
     */
    public void setWithholdingTaxAmount(java.math.BigDecimal withholdingTaxAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WITHHOLDINGTAXAMOUNT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WITHHOLDINGTAXAMOUNT$4);
            }
            target.setBigDecimalValue(withholdingTaxAmount);
        }
    }
    
    /**
     * Sets (as xml) the "WithholdingTaxAmount" element
     */
    public void xsetWithholdingTaxAmount(x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType withholdingTaxAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(WITHHOLDINGTAXAMOUNT$4, 0);
            if (target == null)
            {
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(WITHHOLDINGTAXAMOUNT$4);
            }
            target.set(withholdingTaxAmount);
        }
    }
}
