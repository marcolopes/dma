/*
 * An XML document type.
 * Localname: Header
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.HeaderDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one Header(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class HeaderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.HeaderDocument
{
    private static final long serialVersionUID = 1L;
    
    public HeaderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEADER$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Header");
    
    
    /**
     * Gets the "Header" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.HeaderDocument.Header getHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.HeaderDocument.Header target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.HeaderDocument.Header)get_store().find_element_user(HEADER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Header" element
     */
    public void setHeader(x0401.oecdStandardAuditFileTaxPT1.HeaderDocument.Header header)
    {
        generatedSetterHelperImpl(header, HEADER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Header" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.HeaderDocument.Header addNewHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.HeaderDocument.Header target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.HeaderDocument.Header)get_store().add_element_user(HEADER$0);
            return target;
        }
    }
    /**
     * An XML Header(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
     *
     * This is a complex type.
     */
    public static class HeaderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.HeaderDocument.Header
    {
        private static final long serialVersionUID = 1L;
        
        public HeaderImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName AUDITFILEVERSION$0 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "AuditFileVersion");
        private static final javax.xml.namespace.QName COMPANYID$2 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "CompanyID");
        private static final javax.xml.namespace.QName TAXREGISTRATIONNUMBER$4 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TaxRegistrationNumber");
        private static final javax.xml.namespace.QName TAXACCOUNTINGBASIS$6 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TaxAccountingBasis");
        private static final javax.xml.namespace.QName COMPANYNAME$8 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "CompanyName");
        private static final javax.xml.namespace.QName BUSINESSNAME$10 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "BusinessName");
        private static final javax.xml.namespace.QName COMPANYADDRESS$12 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "CompanyAddress");
        private static final javax.xml.namespace.QName FISCALYEAR$14 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "FiscalYear");
        private static final javax.xml.namespace.QName STARTDATE$16 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "StartDate");
        private static final javax.xml.namespace.QName ENDDATE$18 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "EndDate");
        private static final javax.xml.namespace.QName CURRENCYCODE$20 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "CurrencyCode");
        private static final javax.xml.namespace.QName DATECREATED$22 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "DateCreated");
        private static final javax.xml.namespace.QName TAXENTITY$24 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "TaxEntity");
        private static final javax.xml.namespace.QName PRODUCTCOMPANYTAXID$26 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "ProductCompanyTaxID");
        private static final javax.xml.namespace.QName SOFTWARECERTIFICATENUMBER$28 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "SoftwareCertificateNumber");
        private static final javax.xml.namespace.QName PRODUCTID$30 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "ProductID");
        private static final javax.xml.namespace.QName PRODUCTVERSION$32 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "ProductVersion");
        private static final javax.xml.namespace.QName HEADERCOMMENT$34 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "HeaderComment");
        private static final javax.xml.namespace.QName TELEPHONE$36 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Telephone");
        private static final javax.xml.namespace.QName FAX$38 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Fax");
        private static final javax.xml.namespace.QName EMAIL$40 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Email");
        private static final javax.xml.namespace.QName WEBSITE$42 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Website");
        
        
        /**
         * Gets the "AuditFileVersion" element
         */
        public java.lang.String getAuditFileVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUDITFILEVERSION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "AuditFileVersion" element
         */
        public x0401.oecdStandardAuditFileTaxPT1.AuditFileVersionDocument.AuditFileVersion xgetAuditFileVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.AuditFileVersionDocument.AuditFileVersion target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.AuditFileVersionDocument.AuditFileVersion)get_store().find_element_user(AUDITFILEVERSION$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "AuditFileVersion" element
         */
        public void setAuditFileVersion(java.lang.String auditFileVersion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUDITFILEVERSION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUDITFILEVERSION$0);
                }
                target.setStringValue(auditFileVersion);
            }
        }
        
        /**
         * Sets (as xml) the "AuditFileVersion" element
         */
        public void xsetAuditFileVersion(x0401.oecdStandardAuditFileTaxPT1.AuditFileVersionDocument.AuditFileVersion auditFileVersion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.AuditFileVersionDocument.AuditFileVersion target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.AuditFileVersionDocument.AuditFileVersion)get_store().find_element_user(AUDITFILEVERSION$0, 0);
                if (target == null)
                {
                    target = (x0401.oecdStandardAuditFileTaxPT1.AuditFileVersionDocument.AuditFileVersion)get_store().add_element_user(AUDITFILEVERSION$0);
                }
                target.set(auditFileVersion);
            }
        }
        
        /**
         * Gets the "CompanyID" element
         */
        public java.lang.String getCompanyID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPANYID$2, 0);
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
        public x0401.oecdStandardAuditFileTaxPT1.CompanyIDDocument.CompanyID xgetCompanyID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.CompanyIDDocument.CompanyID target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.CompanyIDDocument.CompanyID)get_store().find_element_user(COMPANYID$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPANYID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPANYID$2);
                }
                target.setStringValue(companyID);
            }
        }
        
        /**
         * Sets (as xml) the "CompanyID" element
         */
        public void xsetCompanyID(x0401.oecdStandardAuditFileTaxPT1.CompanyIDDocument.CompanyID companyID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.CompanyIDDocument.CompanyID target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.CompanyIDDocument.CompanyID)get_store().find_element_user(COMPANYID$2, 0);
                if (target == null)
                {
                    target = (x0401.oecdStandardAuditFileTaxPT1.CompanyIDDocument.CompanyID)get_store().add_element_user(COMPANYID$2);
                }
                target.set(companyID);
            }
        }
        
        /**
         * Gets the "TaxRegistrationNumber" element
         */
        public int getTaxRegistrationNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXREGISTRATIONNUMBER$4, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "TaxRegistrationNumber" element
         */
        public x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseVatNumber xgetTaxRegistrationNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseVatNumber target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseVatNumber)get_store().find_element_user(TAXREGISTRATIONNUMBER$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "TaxRegistrationNumber" element
         */
        public void setTaxRegistrationNumber(int taxRegistrationNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXREGISTRATIONNUMBER$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXREGISTRATIONNUMBER$4);
                }
                target.setIntValue(taxRegistrationNumber);
            }
        }
        
        /**
         * Sets (as xml) the "TaxRegistrationNumber" element
         */
        public void xsetTaxRegistrationNumber(x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseVatNumber taxRegistrationNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseVatNumber target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseVatNumber)get_store().find_element_user(TAXREGISTRATIONNUMBER$4, 0);
                if (target == null)
                {
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTPortugueseVatNumber)get_store().add_element_user(TAXREGISTRATIONNUMBER$4);
                }
                target.set(taxRegistrationNumber);
            }
        }
        
        /**
         * Gets the "TaxAccountingBasis" element
         */
        public x0401.oecdStandardAuditFileTaxPT1.TaxAccountingBasisDocument.TaxAccountingBasis.Enum getTaxAccountingBasis()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXACCOUNTINGBASIS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return (x0401.oecdStandardAuditFileTaxPT1.TaxAccountingBasisDocument.TaxAccountingBasis.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "TaxAccountingBasis" element
         */
        public x0401.oecdStandardAuditFileTaxPT1.TaxAccountingBasisDocument.TaxAccountingBasis xgetTaxAccountingBasis()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.TaxAccountingBasisDocument.TaxAccountingBasis target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.TaxAccountingBasisDocument.TaxAccountingBasis)get_store().find_element_user(TAXACCOUNTINGBASIS$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "TaxAccountingBasis" element
         */
        public void setTaxAccountingBasis(x0401.oecdStandardAuditFileTaxPT1.TaxAccountingBasisDocument.TaxAccountingBasis.Enum taxAccountingBasis)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXACCOUNTINGBASIS$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXACCOUNTINGBASIS$6);
                }
                target.setEnumValue(taxAccountingBasis);
            }
        }
        
        /**
         * Sets (as xml) the "TaxAccountingBasis" element
         */
        public void xsetTaxAccountingBasis(x0401.oecdStandardAuditFileTaxPT1.TaxAccountingBasisDocument.TaxAccountingBasis taxAccountingBasis)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.TaxAccountingBasisDocument.TaxAccountingBasis target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.TaxAccountingBasisDocument.TaxAccountingBasis)get_store().find_element_user(TAXACCOUNTINGBASIS$6, 0);
                if (target == null)
                {
                    target = (x0401.oecdStandardAuditFileTaxPT1.TaxAccountingBasisDocument.TaxAccountingBasis)get_store().add_element_user(TAXACCOUNTINGBASIS$6);
                }
                target.set(taxAccountingBasis);
            }
        }
        
        /**
         * Gets the "CompanyName" element
         */
        public java.lang.String getCompanyName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPANYNAME$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CompanyName" element
         */
        public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car xgetCompanyName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car)get_store().find_element_user(COMPANYNAME$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CompanyName" element
         */
        public void setCompanyName(java.lang.String companyName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPANYNAME$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPANYNAME$8);
                }
                target.setStringValue(companyName);
            }
        }
        
        /**
         * Sets (as xml) the "CompanyName" element
         */
        public void xsetCompanyName(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car companyName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car)get_store().find_element_user(COMPANYNAME$8, 0);
                if (target == null)
                {
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car)get_store().add_element_user(COMPANYNAME$8);
                }
                target.set(companyName);
            }
        }
        
        /**
         * Gets the "BusinessName" element
         */
        public java.lang.String getBusinessName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUSINESSNAME$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "BusinessName" element
         */
        public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car xgetBusinessName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(BUSINESSNAME$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "BusinessName" element
         */
        public boolean isSetBusinessName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BUSINESSNAME$10) != 0;
            }
        }
        
        /**
         * Sets the "BusinessName" element
         */
        public void setBusinessName(java.lang.String businessName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUSINESSNAME$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUSINESSNAME$10);
                }
                target.setStringValue(businessName);
            }
        }
        
        /**
         * Sets (as xml) the "BusinessName" element
         */
        public void xsetBusinessName(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car businessName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(BUSINESSNAME$10, 0);
                if (target == null)
                {
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().add_element_user(BUSINESSNAME$10);
                }
                target.set(businessName);
            }
        }
        
        /**
         * Unsets the "BusinessName" element
         */
        public void unsetBusinessName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BUSINESSNAME$10, 0);
            }
        }
        
        /**
         * Gets the "CompanyAddress" element
         */
        public x0401.oecdStandardAuditFileTaxPT1.AddressStructurePT getCompanyAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.AddressStructurePT target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.AddressStructurePT)get_store().find_element_user(COMPANYADDRESS$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "CompanyAddress" element
         */
        public void setCompanyAddress(x0401.oecdStandardAuditFileTaxPT1.AddressStructurePT companyAddress)
        {
            generatedSetterHelperImpl(companyAddress, COMPANYADDRESS$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "CompanyAddress" element
         */
        public x0401.oecdStandardAuditFileTaxPT1.AddressStructurePT addNewCompanyAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.AddressStructurePT target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.AddressStructurePT)get_store().add_element_user(COMPANYADDRESS$12);
                return target;
            }
        }
        
        /**
         * Gets the "FiscalYear" element
         */
        public int getFiscalYear()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FISCALYEAR$14, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "FiscalYear" element
         */
        public x0401.oecdStandardAuditFileTaxPT1.FiscalYearDocument.FiscalYear xgetFiscalYear()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.FiscalYearDocument.FiscalYear target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.FiscalYearDocument.FiscalYear)get_store().find_element_user(FISCALYEAR$14, 0);
                return target;
            }
        }
        
        /**
         * Sets the "FiscalYear" element
         */
        public void setFiscalYear(int fiscalYear)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FISCALYEAR$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FISCALYEAR$14);
                }
                target.setIntValue(fiscalYear);
            }
        }
        
        /**
         * Sets (as xml) the "FiscalYear" element
         */
        public void xsetFiscalYear(x0401.oecdStandardAuditFileTaxPT1.FiscalYearDocument.FiscalYear fiscalYear)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.FiscalYearDocument.FiscalYear target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.FiscalYearDocument.FiscalYear)get_store().find_element_user(FISCALYEAR$14, 0);
                if (target == null)
                {
                    target = (x0401.oecdStandardAuditFileTaxPT1.FiscalYearDocument.FiscalYear)get_store().add_element_user(FISCALYEAR$14);
                }
                target.set(fiscalYear);
            }
        }
        
        /**
         * Gets the "StartDate" element
         */
        public java.util.Calendar getStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "StartDate" element
         */
        public x0401.oecdStandardAuditFileTaxPT1.SAFPTDateSpan xgetStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTDateSpan target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTDateSpan)get_store().find_element_user(STARTDATE$16, 0);
                return target;
            }
        }
        
        /**
         * Sets the "StartDate" element
         */
        public void setStartDate(java.util.Calendar startDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATE$16);
                }
                target.setCalendarValue(startDate);
            }
        }
        
        /**
         * Sets (as xml) the "StartDate" element
         */
        public void xsetStartDate(x0401.oecdStandardAuditFileTaxPT1.SAFPTDateSpan startDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTDateSpan target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTDateSpan)get_store().find_element_user(STARTDATE$16, 0);
                if (target == null)
                {
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTDateSpan)get_store().add_element_user(STARTDATE$16);
                }
                target.set(startDate);
            }
        }
        
        /**
         * Gets the "EndDate" element
         */
        public java.util.Calendar getEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "EndDate" element
         */
        public x0401.oecdStandardAuditFileTaxPT1.SAFPTDateSpan xgetEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTDateSpan target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTDateSpan)get_store().find_element_user(ENDDATE$18, 0);
                return target;
            }
        }
        
        /**
         * Sets the "EndDate" element
         */
        public void setEndDate(java.util.Calendar endDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDDATE$18);
                }
                target.setCalendarValue(endDate);
            }
        }
        
        /**
         * Sets (as xml) the "EndDate" element
         */
        public void xsetEndDate(x0401.oecdStandardAuditFileTaxPT1.SAFPTDateSpan endDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTDateSpan target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTDateSpan)get_store().find_element_user(ENDDATE$18, 0);
                if (target == null)
                {
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTDateSpan)get_store().add_element_user(ENDDATE$18);
                }
                target.set(endDate);
            }
        }
        
        /**
         * Gets the "CurrencyCode" element
         */
        public org.apache.xmlbeans.XmlObject getCurrencyCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(CURRENCYCODE$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "CurrencyCode" element
         */
        public void setCurrencyCode(org.apache.xmlbeans.XmlObject currencyCode)
        {
            generatedSetterHelperImpl(currencyCode, CURRENCYCODE$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "CurrencyCode" element
         */
        public org.apache.xmlbeans.XmlObject addNewCurrencyCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(CURRENCYCODE$20);
                return target;
            }
        }
        
        /**
         * Gets the "DateCreated" element
         */
        public java.util.Calendar getDateCreated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATECREATED$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "DateCreated" element
         */
        public x0401.oecdStandardAuditFileTaxPT1.SAFPTDateSpan xgetDateCreated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTDateSpan target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTDateSpan)get_store().find_element_user(DATECREATED$22, 0);
                return target;
            }
        }
        
        /**
         * Sets the "DateCreated" element
         */
        public void setDateCreated(java.util.Calendar dateCreated)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATECREATED$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATECREATED$22);
                }
                target.setCalendarValue(dateCreated);
            }
        }
        
        /**
         * Sets (as xml) the "DateCreated" element
         */
        public void xsetDateCreated(x0401.oecdStandardAuditFileTaxPT1.SAFPTDateSpan dateCreated)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTDateSpan target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTDateSpan)get_store().find_element_user(DATECREATED$22, 0);
                if (target == null)
                {
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTDateSpan)get_store().add_element_user(DATECREATED$22);
                }
                target.set(dateCreated);
            }
        }
        
        /**
         * Gets the "TaxEntity" element
         */
        public java.lang.String getTaxEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXENTITY$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "TaxEntity" element
         */
        public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car xgetTaxEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().find_element_user(TAXENTITY$24, 0);
                return target;
            }
        }
        
        /**
         * Sets the "TaxEntity" element
         */
        public void setTaxEntity(java.lang.String taxEntity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXENTITY$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXENTITY$24);
                }
                target.setStringValue(taxEntity);
            }
        }
        
        /**
         * Sets (as xml) the "TaxEntity" element
         */
        public void xsetTaxEntity(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car taxEntity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().find_element_user(TAXENTITY$24, 0);
                if (target == null)
                {
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().add_element_user(TAXENTITY$24);
                }
                target.set(taxEntity);
            }
        }
        
        /**
         * Gets the "ProductCompanyTaxID" element
         */
        public java.lang.String getProductCompanyTaxID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCOMPANYTAXID$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ProductCompanyTaxID" element
         */
        public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car xgetProductCompanyTaxID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().find_element_user(PRODUCTCOMPANYTAXID$26, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ProductCompanyTaxID" element
         */
        public void setProductCompanyTaxID(java.lang.String productCompanyTaxID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCOMPANYTAXID$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTCOMPANYTAXID$26);
                }
                target.setStringValue(productCompanyTaxID);
            }
        }
        
        /**
         * Sets (as xml) the "ProductCompanyTaxID" element
         */
        public void xsetProductCompanyTaxID(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car productCompanyTaxID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().find_element_user(PRODUCTCOMPANYTAXID$26, 0);
                if (target == null)
                {
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().add_element_user(PRODUCTCOMPANYTAXID$26);
                }
                target.set(productCompanyTaxID);
            }
        }
        
        /**
         * Gets the "SoftwareCertificateNumber" element
         */
        public java.math.BigInteger getSoftwareCertificateNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOFTWARECERTIFICATENUMBER$28, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "SoftwareCertificateNumber" element
         */
        public org.apache.xmlbeans.XmlNonNegativeInteger xgetSoftwareCertificateNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(SOFTWARECERTIFICATENUMBER$28, 0);
                return target;
            }
        }
        
        /**
         * Sets the "SoftwareCertificateNumber" element
         */
        public void setSoftwareCertificateNumber(java.math.BigInteger softwareCertificateNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOFTWARECERTIFICATENUMBER$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOFTWARECERTIFICATENUMBER$28);
                }
                target.setBigIntegerValue(softwareCertificateNumber);
            }
        }
        
        /**
         * Sets (as xml) the "SoftwareCertificateNumber" element
         */
        public void xsetSoftwareCertificateNumber(org.apache.xmlbeans.XmlNonNegativeInteger softwareCertificateNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(SOFTWARECERTIFICATENUMBER$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(SOFTWARECERTIFICATENUMBER$28);
                }
                target.set(softwareCertificateNumber);
            }
        }
        
        /**
         * Gets the "ProductID" element
         */
        public java.lang.String getProductID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTID$30, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ProductID" element
         */
        public x0401.oecdStandardAuditFileTaxPT1.SAFPTProductID xgetProductID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTProductID target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTProductID)get_store().find_element_user(PRODUCTID$30, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ProductID" element
         */
        public void setProductID(java.lang.String productID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTID$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTID$30);
                }
                target.setStringValue(productID);
            }
        }
        
        /**
         * Sets (as xml) the "ProductID" element
         */
        public void xsetProductID(x0401.oecdStandardAuditFileTaxPT1.SAFPTProductID productID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTProductID target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTProductID)get_store().find_element_user(PRODUCTID$30, 0);
                if (target == null)
                {
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTProductID)get_store().add_element_user(PRODUCTID$30);
                }
                target.set(productID);
            }
        }
        
        /**
         * Gets the "ProductVersion" element
         */
        public java.lang.String getProductVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTVERSION$32, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ProductVersion" element
         */
        public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetProductVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(PRODUCTVERSION$32, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ProductVersion" element
         */
        public void setProductVersion(java.lang.String productVersion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTVERSION$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTVERSION$32);
                }
                target.setStringValue(productVersion);
            }
        }
        
        /**
         * Sets (as xml) the "ProductVersion" element
         */
        public void xsetProductVersion(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car productVersion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(PRODUCTVERSION$32, 0);
                if (target == null)
                {
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().add_element_user(PRODUCTVERSION$32);
                }
                target.set(productVersion);
            }
        }
        
        /**
         * Gets the "HeaderComment" element
         */
        public java.lang.String getHeaderComment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEADERCOMMENT$34, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "HeaderComment" element
         */
        public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax255Car xgetHeaderComment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax255Car target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax255Car)get_store().find_element_user(HEADERCOMMENT$34, 0);
                return target;
            }
        }
        
        /**
         * True if has "HeaderComment" element
         */
        public boolean isSetHeaderComment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HEADERCOMMENT$34) != 0;
            }
        }
        
        /**
         * Sets the "HeaderComment" element
         */
        public void setHeaderComment(java.lang.String headerComment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEADERCOMMENT$34, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HEADERCOMMENT$34);
                }
                target.setStringValue(headerComment);
            }
        }
        
        /**
         * Sets (as xml) the "HeaderComment" element
         */
        public void xsetHeaderComment(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax255Car headerComment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax255Car target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax255Car)get_store().find_element_user(HEADERCOMMENT$34, 0);
                if (target == null)
                {
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax255Car)get_store().add_element_user(HEADERCOMMENT$34);
                }
                target.set(headerComment);
            }
        }
        
        /**
         * Unsets the "HeaderComment" element
         */
        public void unsetHeaderComment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HEADERCOMMENT$34, 0);
            }
        }
        
        /**
         * Gets the "Telephone" element
         */
        public java.lang.String getTelephone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONE$36, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Telephone" element
         */
        public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car xgetTelephone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().find_element_user(TELEPHONE$36, 0);
                return target;
            }
        }
        
        /**
         * True if has "Telephone" element
         */
        public boolean isSetTelephone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TELEPHONE$36) != 0;
            }
        }
        
        /**
         * Sets the "Telephone" element
         */
        public void setTelephone(java.lang.String telephone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONE$36, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TELEPHONE$36);
                }
                target.setStringValue(telephone);
            }
        }
        
        /**
         * Sets (as xml) the "Telephone" element
         */
        public void xsetTelephone(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car telephone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().find_element_user(TELEPHONE$36, 0);
                if (target == null)
                {
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().add_element_user(TELEPHONE$36);
                }
                target.set(telephone);
            }
        }
        
        /**
         * Unsets the "Telephone" element
         */
        public void unsetTelephone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TELEPHONE$36, 0);
            }
        }
        
        /**
         * Gets the "Fax" element
         */
        public java.lang.String getFax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAX$38, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Fax" element
         */
        public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car xgetFax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().find_element_user(FAX$38, 0);
                return target;
            }
        }
        
        /**
         * True if has "Fax" element
         */
        public boolean isSetFax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FAX$38) != 0;
            }
        }
        
        /**
         * Sets the "Fax" element
         */
        public void setFax(java.lang.String fax)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAX$38, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAX$38);
                }
                target.setStringValue(fax);
            }
        }
        
        /**
         * Sets (as xml) the "Fax" element
         */
        public void xsetFax(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car fax)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().find_element_user(FAX$38, 0);
                if (target == null)
                {
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().add_element_user(FAX$38);
                }
                target.set(fax);
            }
        }
        
        /**
         * Unsets the "Fax" element
         */
        public void unsetFax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FAX$38, 0);
            }
        }
        
        /**
         * Gets the "Email" element
         */
        public java.lang.String getEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$40, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Email" element
         */
        public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax254Car xgetEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax254Car target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax254Car)get_store().find_element_user(EMAIL$40, 0);
                return target;
            }
        }
        
        /**
         * True if has "Email" element
         */
        public boolean isSetEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMAIL$40) != 0;
            }
        }
        
        /**
         * Sets the "Email" element
         */
        public void setEmail(java.lang.String email)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$40, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAIL$40);
                }
                target.setStringValue(email);
            }
        }
        
        /**
         * Sets (as xml) the "Email" element
         */
        public void xsetEmail(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax254Car email)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax254Car target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax254Car)get_store().find_element_user(EMAIL$40, 0);
                if (target == null)
                {
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax254Car)get_store().add_element_user(EMAIL$40);
                }
                target.set(email);
            }
        }
        
        /**
         * Unsets the "Email" element
         */
        public void unsetEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMAIL$40, 0);
            }
        }
        
        /**
         * Gets the "Website" element
         */
        public java.lang.String getWebsite()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEBSITE$42, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Website" element
         */
        public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car xgetWebsite()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(WEBSITE$42, 0);
                return target;
            }
        }
        
        /**
         * True if has "Website" element
         */
        public boolean isSetWebsite()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WEBSITE$42) != 0;
            }
        }
        
        /**
         * Sets the "Website" element
         */
        public void setWebsite(java.lang.String website)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEBSITE$42, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WEBSITE$42);
                }
                target.setStringValue(website);
            }
        }
        
        /**
         * Sets (as xml) the "Website" element
         */
        public void xsetWebsite(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car website)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(WEBSITE$42, 0);
                if (target == null)
                {
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().add_element_user(WEBSITE$42);
                }
                target.set(website);
            }
        }
        
        /**
         * Unsets the "Website" element
         */
        public void unsetWebsite()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WEBSITE$42, 0);
            }
        }
    }
}
