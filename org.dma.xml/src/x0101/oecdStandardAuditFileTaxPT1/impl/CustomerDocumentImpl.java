/*
 * An XML document type.
 * Localname: Customer
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.01_01
 * Java type: x0101.oecdStandardAuditFileTaxPT1.CustomerDocument
 *
 * Automatically generated - do not modify.
 */
package x0101.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one Customer(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01) element.
 *
 * This is a complex type.
 */
public class CustomerDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.CustomerDocument
{
    private static final long serialVersionUID = 1L;
    
    public CustomerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CUSTOMER$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "Customer");
    
    
    /**
     * Gets the "Customer" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer getCustomer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer)get_store().find_element_user(CUSTOMER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Customer" element
     */
    public void setCustomer(x0101.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer customer)
    {
        generatedSetterHelperImpl(customer, CUSTOMER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Customer" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer addNewCustomer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer)get_store().add_element_user(CUSTOMER$0);
            return target;
        }
    }
    /**
     * An XML Customer(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01).
     *
     * This is a complex type.
     */
    public static class CustomerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.CustomerDocument.Customer
    {
        private static final long serialVersionUID = 1L;
        
        public CustomerImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CUSTOMERID$0 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "CustomerID");
        private static final javax.xml.namespace.QName ACCOUNTID$2 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "AccountID");
        private static final javax.xml.namespace.QName CUSTOMERTAXID$4 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "CustomerTaxID");
        private static final javax.xml.namespace.QName COMPANYNAME$6 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "CompanyName");
        private static final javax.xml.namespace.QName CONTACT$8 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "Contact");
        private static final javax.xml.namespace.QName BILLINGADDRESS$10 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "BillingAddress");
        private static final javax.xml.namespace.QName SHIPTOADDRESS$12 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "ShipToAddress");
        private static final javax.xml.namespace.QName TELEPHONE$14 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "Telephone");
        private static final javax.xml.namespace.QName FAX$16 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "Fax");
        private static final javax.xml.namespace.QName EMAIL$18 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "Email");
        private static final javax.xml.namespace.QName WEBSITE$20 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "Website");
        private static final javax.xml.namespace.QName SELFBILLINGINDICATOR$22 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "SelfBillingIndicator");
        
        
        /**
         * Gets the "CustomerID" element
         */
        public java.lang.String getCustomerID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CustomerID" element
         */
        public x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetCustomerID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(CUSTOMERID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CustomerID" element
         */
        public void setCustomerID(java.lang.String customerID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTOMERID$0);
                }
                target.setStringValue(customerID);
            }
        }
        
        /**
         * Sets (as xml) the "CustomerID" element
         */
        public void xsetCustomerID(x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car customerID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(CUSTOMERID$0, 0);
                if (target == null)
                {
                    target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().add_element_user(CUSTOMERID$0);
                }
                target.set(customerID);
            }
        }
        
        /**
         * Gets the "AccountID" element
         */
        public java.lang.String getAccountID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "AccountID" element
         */
        public x0101.oecdStandardAuditFileTaxPT1.AccountIDDocument.AccountID xgetAccountID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.AccountIDDocument.AccountID target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.AccountIDDocument.AccountID)get_store().find_element_user(ACCOUNTID$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "AccountID" element
         */
        public void setAccountID(java.lang.String accountID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCOUNTID$2);
                }
                target.setStringValue(accountID);
            }
        }
        
        /**
         * Sets (as xml) the "AccountID" element
         */
        public void xsetAccountID(x0101.oecdStandardAuditFileTaxPT1.AccountIDDocument.AccountID accountID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.AccountIDDocument.AccountID target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.AccountIDDocument.AccountID)get_store().find_element_user(ACCOUNTID$2, 0);
                if (target == null)
                {
                    target = (x0101.oecdStandardAuditFileTaxPT1.AccountIDDocument.AccountID)get_store().add_element_user(ACCOUNTID$2);
                }
                target.set(accountID);
            }
        }
        
        /**
         * Gets the "CustomerTaxID" element
         */
        public java.lang.String getCustomerTaxID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERTAXID$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CustomerTaxID" element
         */
        public x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car xgetCustomerTaxID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().find_element_user(CUSTOMERTAXID$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CustomerTaxID" element
         */
        public void setCustomerTaxID(java.lang.String customerTaxID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERTAXID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTOMERTAXID$4);
                }
                target.setStringValue(customerTaxID);
            }
        }
        
        /**
         * Sets (as xml) the "CustomerTaxID" element
         */
        public void xsetCustomerTaxID(x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car customerTaxID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().find_element_user(CUSTOMERTAXID$4, 0);
                if (target == null)
                {
                    target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().add_element_user(CUSTOMERTAXID$4);
                }
                target.set(customerTaxID);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPANYNAME$6, 0);
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
        public x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car xgetCompanyName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(COMPANYNAME$6, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPANYNAME$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPANYNAME$6);
                }
                target.setStringValue(companyName);
            }
        }
        
        /**
         * Sets (as xml) the "CompanyName" element
         */
        public void xsetCompanyName(x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car companyName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(COMPANYNAME$6, 0);
                if (target == null)
                {
                    target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().add_element_user(COMPANYNAME$6);
                }
                target.set(companyName);
            }
        }
        
        /**
         * Gets the "Contact" element
         */
        public java.lang.String getContact()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Contact" element
         */
        public x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car xgetContact()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().find_element_user(CONTACT$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "Contact" element
         */
        public boolean isSetContact()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTACT$8) != 0;
            }
        }
        
        /**
         * Sets the "Contact" element
         */
        public void setContact(java.lang.String contact)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACT$8);
                }
                target.setStringValue(contact);
            }
        }
        
        /**
         * Sets (as xml) the "Contact" element
         */
        public void xsetContact(x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car contact)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().find_element_user(CONTACT$8, 0);
                if (target == null)
                {
                    target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().add_element_user(CONTACT$8);
                }
                target.set(contact);
            }
        }
        
        /**
         * Unsets the "Contact" element
         */
        public void unsetContact()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTACT$8, 0);
            }
        }
        
        /**
         * Gets the "BillingAddress" element
         */
        public x0101.oecdStandardAuditFileTaxPT1.AddressStructure getBillingAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.AddressStructure target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.AddressStructure)get_store().find_element_user(BILLINGADDRESS$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "BillingAddress" element
         */
        public void setBillingAddress(x0101.oecdStandardAuditFileTaxPT1.AddressStructure billingAddress)
        {
            generatedSetterHelperImpl(billingAddress, BILLINGADDRESS$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "BillingAddress" element
         */
        public x0101.oecdStandardAuditFileTaxPT1.AddressStructure addNewBillingAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.AddressStructure target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.AddressStructure)get_store().add_element_user(BILLINGADDRESS$10);
                return target;
            }
        }
        
        /**
         * Gets the "ShipToAddress" element
         */
        public x0101.oecdStandardAuditFileTaxPT1.AddressStructure getShipToAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.AddressStructure target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.AddressStructure)get_store().find_element_user(SHIPTOADDRESS$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ShipToAddress" element
         */
        public boolean isSetShipToAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SHIPTOADDRESS$12) != 0;
            }
        }
        
        /**
         * Sets the "ShipToAddress" element
         */
        public void setShipToAddress(x0101.oecdStandardAuditFileTaxPT1.AddressStructure shipToAddress)
        {
            generatedSetterHelperImpl(shipToAddress, SHIPTOADDRESS$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "ShipToAddress" element
         */
        public x0101.oecdStandardAuditFileTaxPT1.AddressStructure addNewShipToAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.AddressStructure target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.AddressStructure)get_store().add_element_user(SHIPTOADDRESS$12);
                return target;
            }
        }
        
        /**
         * Unsets the "ShipToAddress" element
         */
        public void unsetShipToAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SHIPTOADDRESS$12, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONE$14, 0);
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
        public x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car xgetTelephone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().find_element_user(TELEPHONE$14, 0);
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
                return get_store().count_elements(TELEPHONE$14) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONE$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TELEPHONE$14);
                }
                target.setStringValue(telephone);
            }
        }
        
        /**
         * Sets (as xml) the "Telephone" element
         */
        public void xsetTelephone(x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car telephone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().find_element_user(TELEPHONE$14, 0);
                if (target == null)
                {
                    target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().add_element_user(TELEPHONE$14);
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
                get_store().remove_element(TELEPHONE$14, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAX$16, 0);
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
        public x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car xgetFax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().find_element_user(FAX$16, 0);
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
                return get_store().count_elements(FAX$16) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAX$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAX$16);
                }
                target.setStringValue(fax);
            }
        }
        
        /**
         * Sets (as xml) the "Fax" element
         */
        public void xsetFax(x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car fax)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().find_element_user(FAX$16, 0);
                if (target == null)
                {
                    target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().add_element_user(FAX$16);
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
                get_store().remove_element(FAX$16, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$18, 0);
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
        public x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car xgetEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(EMAIL$18, 0);
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
                return get_store().count_elements(EMAIL$18) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAIL$18);
                }
                target.setStringValue(email);
            }
        }
        
        /**
         * Sets (as xml) the "Email" element
         */
        public void xsetEmail(x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car email)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(EMAIL$18, 0);
                if (target == null)
                {
                    target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().add_element_user(EMAIL$18);
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
                get_store().remove_element(EMAIL$18, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEBSITE$20, 0);
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
        public x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car xgetWebsite()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(WEBSITE$20, 0);
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
                return get_store().count_elements(WEBSITE$20) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEBSITE$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WEBSITE$20);
                }
                target.setStringValue(website);
            }
        }
        
        /**
         * Sets (as xml) the "Website" element
         */
        public void xsetWebsite(x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car website)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(WEBSITE$20, 0);
                if (target == null)
                {
                    target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().add_element_user(WEBSITE$20);
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
                get_store().remove_element(WEBSITE$20, 0);
            }
        }
        
        /**
         * Gets the "SelfBillingIndicator" element
         */
        public int getSelfBillingIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELFBILLINGINDICATOR$22, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "SelfBillingIndicator" element
         */
        public x0101.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator xgetSelfBillingIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator)get_store().find_element_user(SELFBILLINGINDICATOR$22, 0);
                return target;
            }
        }
        
        /**
         * Sets the "SelfBillingIndicator" element
         */
        public void setSelfBillingIndicator(int selfBillingIndicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELFBILLINGINDICATOR$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SELFBILLINGINDICATOR$22);
                }
                target.setIntValue(selfBillingIndicator);
            }
        }
        
        /**
         * Sets (as xml) the "SelfBillingIndicator" element
         */
        public void xsetSelfBillingIndicator(x0101.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator selfBillingIndicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator)get_store().find_element_user(SELFBILLINGINDICATOR$22, 0);
                if (target == null)
                {
                    target = (x0101.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator)get_store().add_element_user(SELFBILLINGINDICATOR$22);
                }
                target.set(selfBillingIndicator);
            }
        }
    }
}
