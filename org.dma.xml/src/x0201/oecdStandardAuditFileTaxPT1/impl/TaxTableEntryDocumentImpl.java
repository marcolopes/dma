/*
 * An XML document type.
 * Localname: TaxTableEntry
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.02_01
 * Java type: x0201.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument
 *
 * Automatically generated - do not modify.
 */
package x0201.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one TaxTableEntry(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01) element.
 *
 * This is a complex type.
 */
public class TaxTableEntryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0201.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument
{
    private static final long serialVersionUID = 1L;
    
    public TaxTableEntryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TAXTABLEENTRY$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "TaxTableEntry");
    
    
    /**
     * Gets the "TaxTableEntry" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument.TaxTableEntry getTaxTableEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument.TaxTableEntry target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument.TaxTableEntry)get_store().find_element_user(TAXTABLEENTRY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TaxTableEntry" element
     */
    public void setTaxTableEntry(x0201.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument.TaxTableEntry taxTableEntry)
    {
        generatedSetterHelperImpl(taxTableEntry, TAXTABLEENTRY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TaxTableEntry" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument.TaxTableEntry addNewTaxTableEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument.TaxTableEntry target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument.TaxTableEntry)get_store().add_element_user(TAXTABLEENTRY$0);
            return target;
        }
    }
    /**
     * An XML TaxTableEntry(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01).
     *
     * This is a complex type.
     */
    public static class TaxTableEntryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0201.oecdStandardAuditFileTaxPT1.TaxTableEntryDocument.TaxTableEntry
    {
        private static final long serialVersionUID = 1L;
        
        public TaxTableEntryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TAXTYPE$0 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "TaxType");
        private static final javax.xml.namespace.QName TAXCOUNTRYREGION$2 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "TaxCountryRegion");
        private static final javax.xml.namespace.QName TAXCODE$4 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "TaxCode");
        private static final javax.xml.namespace.QName DESCRIPTION$6 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "Description");
        private static final javax.xml.namespace.QName TAXEXPIRATIONDATE$8 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "TaxExpirationDate");
        private static final javax.xml.namespace.QName TAXPERCENTAGE$10 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "TaxPercentage");
        private static final javax.xml.namespace.QName TAXAMOUNT$12 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "TaxAmount");
        
        
        /**
         * Gets the "TaxType" element
         */
        public x0201.oecdStandardAuditFileTaxPT1.TaxTypeDocument.TaxType.Enum getTaxType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXTYPE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return (x0201.oecdStandardAuditFileTaxPT1.TaxTypeDocument.TaxType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "TaxType" element
         */
        public x0201.oecdStandardAuditFileTaxPT1.TaxTypeDocument.TaxType xgetTaxType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0201.oecdStandardAuditFileTaxPT1.TaxTypeDocument.TaxType target = null;
                target = (x0201.oecdStandardAuditFileTaxPT1.TaxTypeDocument.TaxType)get_store().find_element_user(TAXTYPE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "TaxType" element
         */
        public void setTaxType(x0201.oecdStandardAuditFileTaxPT1.TaxTypeDocument.TaxType.Enum taxType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXTYPE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXTYPE$0);
                }
                target.setEnumValue(taxType);
            }
        }
        
        /**
         * Sets (as xml) the "TaxType" element
         */
        public void xsetTaxType(x0201.oecdStandardAuditFileTaxPT1.TaxTypeDocument.TaxType taxType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0201.oecdStandardAuditFileTaxPT1.TaxTypeDocument.TaxType target = null;
                target = (x0201.oecdStandardAuditFileTaxPT1.TaxTypeDocument.TaxType)get_store().find_element_user(TAXTYPE$0, 0);
                if (target == null)
                {
                    target = (x0201.oecdStandardAuditFileTaxPT1.TaxTypeDocument.TaxType)get_store().add_element_user(TAXTYPE$0);
                }
                target.set(taxType);
            }
        }
        
        /**
         * Gets the "TaxCountryRegion" element
         */
        public java.lang.String getTaxCountryRegion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXCOUNTRYREGION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "TaxCountryRegion" element
         */
        public x0201.oecdStandardAuditFileTaxPT1.TaxCountryRegionDocument.TaxCountryRegion xgetTaxCountryRegion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0201.oecdStandardAuditFileTaxPT1.TaxCountryRegionDocument.TaxCountryRegion target = null;
                target = (x0201.oecdStandardAuditFileTaxPT1.TaxCountryRegionDocument.TaxCountryRegion)get_store().find_element_user(TAXCOUNTRYREGION$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "TaxCountryRegion" element
         */
        public void setTaxCountryRegion(java.lang.String taxCountryRegion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXCOUNTRYREGION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXCOUNTRYREGION$2);
                }
                target.setStringValue(taxCountryRegion);
            }
        }
        
        /**
         * Sets (as xml) the "TaxCountryRegion" element
         */
        public void xsetTaxCountryRegion(x0201.oecdStandardAuditFileTaxPT1.TaxCountryRegionDocument.TaxCountryRegion taxCountryRegion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0201.oecdStandardAuditFileTaxPT1.TaxCountryRegionDocument.TaxCountryRegion target = null;
                target = (x0201.oecdStandardAuditFileTaxPT1.TaxCountryRegionDocument.TaxCountryRegion)get_store().find_element_user(TAXCOUNTRYREGION$2, 0);
                if (target == null)
                {
                    target = (x0201.oecdStandardAuditFileTaxPT1.TaxCountryRegionDocument.TaxCountryRegion)get_store().add_element_user(TAXCOUNTRYREGION$2);
                }
                target.set(taxCountryRegion);
            }
        }
        
        /**
         * Gets the "TaxCode" element
         */
        public java.lang.String getTaxCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXCODE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "TaxCode" element
         */
        public x0201.oecdStandardAuditFileTaxPT1.TaxCodeDocument.TaxCode xgetTaxCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0201.oecdStandardAuditFileTaxPT1.TaxCodeDocument.TaxCode target = null;
                target = (x0201.oecdStandardAuditFileTaxPT1.TaxCodeDocument.TaxCode)get_store().find_element_user(TAXCODE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "TaxCode" element
         */
        public void setTaxCode(java.lang.String taxCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXCODE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXCODE$4);
                }
                target.setStringValue(taxCode);
            }
        }
        
        /**
         * Sets (as xml) the "TaxCode" element
         */
        public void xsetTaxCode(x0201.oecdStandardAuditFileTaxPT1.TaxCodeDocument.TaxCode taxCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0201.oecdStandardAuditFileTaxPT1.TaxCodeDocument.TaxCode target = null;
                target = (x0201.oecdStandardAuditFileTaxPT1.TaxCodeDocument.TaxCode)get_store().find_element_user(TAXCODE$4, 0);
                if (target == null)
                {
                    target = (x0201.oecdStandardAuditFileTaxPT1.TaxCodeDocument.TaxCode)get_store().add_element_user(TAXCODE$4);
                }
                target.set(taxCode);
            }
        }
        
        /**
         * Gets the "Description" element
         */
        public java.lang.String getDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Description" element
         */
        public x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax255Car xgetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax255Car target = null;
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax255Car)get_store().find_element_user(DESCRIPTION$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Description" element
         */
        public void setDescription(java.lang.String description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$6);
                }
                target.setStringValue(description);
            }
        }
        
        /**
         * Sets (as xml) the "Description" element
         */
        public void xsetDescription(x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax255Car description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax255Car target = null;
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax255Car)get_store().find_element_user(DESCRIPTION$6, 0);
                if (target == null)
                {
                    target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax255Car)get_store().add_element_user(DESCRIPTION$6);
                }
                target.set(description);
            }
        }
        
        /**
         * Gets the "TaxExpirationDate" element
         */
        public java.util.Calendar getTaxExpirationDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXEXPIRATIONDATE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "TaxExpirationDate" element
         */
        public x0201.oecdStandardAuditFileTaxPT1.SAFdateType xgetTaxExpirationDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0201.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(TAXEXPIRATIONDATE$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "TaxExpirationDate" element
         */
        public boolean isSetTaxExpirationDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TAXEXPIRATIONDATE$8) != 0;
            }
        }
        
        /**
         * Sets the "TaxExpirationDate" element
         */
        public void setTaxExpirationDate(java.util.Calendar taxExpirationDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXEXPIRATIONDATE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXEXPIRATIONDATE$8);
                }
                target.setCalendarValue(taxExpirationDate);
            }
        }
        
        /**
         * Sets (as xml) the "TaxExpirationDate" element
         */
        public void xsetTaxExpirationDate(x0201.oecdStandardAuditFileTaxPT1.SAFdateType taxExpirationDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0201.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(TAXEXPIRATIONDATE$8, 0);
                if (target == null)
                {
                    target = (x0201.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().add_element_user(TAXEXPIRATIONDATE$8);
                }
                target.set(taxExpirationDate);
            }
        }
        
        /**
         * Unsets the "TaxExpirationDate" element
         */
        public void unsetTaxExpirationDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TAXEXPIRATIONDATE$8, 0);
            }
        }
        
        /**
         * Gets the "TaxPercentage" element
         */
        public java.math.BigDecimal getTaxPercentage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXPERCENTAGE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "TaxPercentage" element
         */
        public x0201.oecdStandardAuditFileTaxPT1.SAFdecimalType xgetTaxPercentage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0201.oecdStandardAuditFileTaxPT1.SAFdecimalType target = null;
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFdecimalType)get_store().find_element_user(TAXPERCENTAGE$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "TaxPercentage" element
         */
        public boolean isSetTaxPercentage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TAXPERCENTAGE$10) != 0;
            }
        }
        
        /**
         * Sets the "TaxPercentage" element
         */
        public void setTaxPercentage(java.math.BigDecimal taxPercentage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXPERCENTAGE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXPERCENTAGE$10);
                }
                target.setBigDecimalValue(taxPercentage);
            }
        }
        
        /**
         * Sets (as xml) the "TaxPercentage" element
         */
        public void xsetTaxPercentage(x0201.oecdStandardAuditFileTaxPT1.SAFdecimalType taxPercentage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0201.oecdStandardAuditFileTaxPT1.SAFdecimalType target = null;
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFdecimalType)get_store().find_element_user(TAXPERCENTAGE$10, 0);
                if (target == null)
                {
                    target = (x0201.oecdStandardAuditFileTaxPT1.SAFdecimalType)get_store().add_element_user(TAXPERCENTAGE$10);
                }
                target.set(taxPercentage);
            }
        }
        
        /**
         * Unsets the "TaxPercentage" element
         */
        public void unsetTaxPercentage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TAXPERCENTAGE$10, 0);
            }
        }
        
        /**
         * Gets the "TaxAmount" element
         */
        public java.math.BigDecimal getTaxAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXAMOUNT$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "TaxAmount" element
         */
        public x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetTaxAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TAXAMOUNT$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "TaxAmount" element
         */
        public boolean isSetTaxAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TAXAMOUNT$12) != 0;
            }
        }
        
        /**
         * Sets the "TaxAmount" element
         */
        public void setTaxAmount(java.math.BigDecimal taxAmount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXAMOUNT$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXAMOUNT$12);
                }
                target.setBigDecimalValue(taxAmount);
            }
        }
        
        /**
         * Sets (as xml) the "TaxAmount" element
         */
        public void xsetTaxAmount(x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType taxAmount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(TAXAMOUNT$12, 0);
                if (target == null)
                {
                    target = (x0201.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(TAXAMOUNT$12);
                }
                target.set(taxAmount);
            }
        }
        
        /**
         * Unsets the "TaxAmount" element
         */
        public void unsetTaxAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TAXAMOUNT$12, 0);
            }
        }
    }
}
