/*
 * An XML document type.
 * Localname: Supplier
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.SupplierDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one Supplier(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public class SupplierDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.SupplierDocument
{
    private static final long serialVersionUID = 1L;
    
    public SupplierDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUPPLIER$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Supplier");
    
    
    /**
     * Gets the "Supplier" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier getSupplier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier)get_store().find_element_user(SUPPLIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Supplier" element
     */
    public void setSupplier(x0401.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier supplier)
    {
        generatedSetterHelperImpl(supplier, SUPPLIER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Supplier" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier addNewSupplier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier)get_store().add_element_user(SUPPLIER$0);
            return target;
        }
    }
    /**
     * An XML Supplier(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
     *
     * This is a complex type.
     */
    public static class SupplierImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.SupplierDocument.Supplier
    {
        private static final long serialVersionUID = 1L;
        
        public SupplierImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SUPPLIERID$0 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "SupplierID");
        private static final javax.xml.namespace.QName ACCOUNTID$2 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "AccountID");
        private static final javax.xml.namespace.QName SUPPLIERTAXID$4 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "SupplierTaxID");
        private static final javax.xml.namespace.QName COMPANYNAME$6 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "CompanyName");
        private static final javax.xml.namespace.QName CONTACT$8 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Contact");
        private static final javax.xml.namespace.QName BILLINGADDRESS$10 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "BillingAddress");
        private static final javax.xml.namespace.QName SHIPFROMADDRESS$12 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "ShipFromAddress");
        private static final javax.xml.namespace.QName TELEPHONE$14 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Telephone");
        private static final javax.xml.namespace.QName FAX$16 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Fax");
        private static final javax.xml.namespace.QName EMAIL$18 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Email");
        private static final javax.xml.namespace.QName WEBSITE$20 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "Website");
        private static final javax.xml.namespace.QName SELFBILLINGINDICATOR$22 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "SelfBillingIndicator");
        
        
        /**
         * Gets the "SupplierID" element
         */
        public java.lang.String getSupplierID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPLIERID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SupplierID" element
         */
        public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetSupplierID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(SUPPLIERID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "SupplierID" element
         */
        public void setSupplierID(java.lang.String supplierID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPLIERID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUPPLIERID$0);
                }
                target.setStringValue(supplierID);
            }
        }
        
        /**
         * Sets (as xml) the "SupplierID" element
         */
        public void xsetSupplierID(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car supplierID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(SUPPLIERID$0, 0);
                if (target == null)
                {
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().add_element_user(SUPPLIERID$0);
                }
                target.set(supplierID);
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
        public x0401.oecdStandardAuditFileTaxPT1.AccountIDDocument.AccountID xgetAccountID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.AccountIDDocument.AccountID target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.AccountIDDocument.AccountID)get_store().find_element_user(ACCOUNTID$2, 0);
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
        public void xsetAccountID(x0401.oecdStandardAuditFileTaxPT1.AccountIDDocument.AccountID accountID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.AccountIDDocument.AccountID target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.AccountIDDocument.AccountID)get_store().find_element_user(ACCOUNTID$2, 0);
                if (target == null)
                {
                    target = (x0401.oecdStandardAuditFileTaxPT1.AccountIDDocument.AccountID)get_store().add_element_user(ACCOUNTID$2);
                }
                target.set(accountID);
            }
        }
        
        /**
         * Gets the "SupplierTaxID" element
         */
        public java.lang.String getSupplierTaxID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPLIERTAXID$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SupplierTaxID" element
         */
        public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetSupplierTaxID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(SUPPLIERTAXID$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "SupplierTaxID" element
         */
        public void setSupplierTaxID(java.lang.String supplierTaxID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPLIERTAXID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUPPLIERTAXID$4);
                }
                target.setStringValue(supplierTaxID);
            }
        }
        
        /**
         * Sets (as xml) the "SupplierTaxID" element
         */
        public void xsetSupplierTaxID(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car supplierTaxID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(SUPPLIERTAXID$4, 0);
                if (target == null)
                {
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().add_element_user(SUPPLIERTAXID$4);
                }
                target.set(supplierTaxID);
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
        public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car xgetCompanyName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car)get_store().find_element_user(COMPANYNAME$6, 0);
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
        public void xsetCompanyName(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car companyName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car)get_store().find_element_user(COMPANYNAME$6, 0);
                if (target == null)
                {
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car)get_store().add_element_user(COMPANYNAME$6);
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
        public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car xgetContact()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().find_element_user(CONTACT$8, 0);
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
        public void xsetContact(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car contact)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().find_element_user(CONTACT$8, 0);
                if (target == null)
                {
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().add_element_user(CONTACT$8);
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
        public x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure getBillingAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure)get_store().find_element_user(BILLINGADDRESS$10, 0);
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
        public void setBillingAddress(x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure billingAddress)
        {
            generatedSetterHelperImpl(billingAddress, BILLINGADDRESS$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "BillingAddress" element
         */
        public x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure addNewBillingAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure)get_store().add_element_user(BILLINGADDRESS$10);
                return target;
            }
        }
        
        /**
         * Gets a List of "ShipFromAddress" elements
         */
        public java.util.List<x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure> getShipFromAddressList()
        {
            final class ShipFromAddressList extends java.util.AbstractList<x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure>
            {
                @Override
                public x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure get(int i)
                    { return SupplierImpl.this.getShipFromAddressArray(i); }
                
                @Override
                public x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure set(int i, x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure o)
                {
                    x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure old = SupplierImpl.this.getShipFromAddressArray(i);
                    SupplierImpl.this.setShipFromAddressArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure o)
                    { SupplierImpl.this.insertNewShipFromAddress(i).set(o); }
                
                @Override
                public x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure remove(int i)
                {
                    x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure old = SupplierImpl.this.getShipFromAddressArray(i);
                    SupplierImpl.this.removeShipFromAddress(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return SupplierImpl.this.sizeOfShipFromAddressArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ShipFromAddressList();
            }
        }
        
        /**
         * Gets array of all "ShipFromAddress" elements
         * @deprecated
         */
        @Deprecated
        public x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure[] getShipFromAddressArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure> targetList = new java.util.ArrayList<x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure>();
                get_store().find_all_element_users(SHIPFROMADDRESS$12, targetList);
                x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure[] result = new x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ShipFromAddress" element
         */
        public x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure getShipFromAddressArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure)get_store().find_element_user(SHIPFROMADDRESS$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ShipFromAddress" element
         */
        public int sizeOfShipFromAddressArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SHIPFROMADDRESS$12);
            }
        }
        
        /**
         * Sets array of all "ShipFromAddress" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setShipFromAddressArray(x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure[] shipFromAddressArray)
        {
            check_orphaned();
            arraySetterHelper(shipFromAddressArray, SHIPFROMADDRESS$12);
        }
        
        /**
         * Sets ith "ShipFromAddress" element
         */
        public void setShipFromAddressArray(int i, x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure shipFromAddress)
        {
            generatedSetterHelperImpl(shipFromAddress, SHIPFROMADDRESS$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ShipFromAddress" element
         */
        public x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure insertNewShipFromAddress(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure)get_store().insert_element_user(SHIPFROMADDRESS$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ShipFromAddress" element
         */
        public x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure addNewShipFromAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SupplierAddressStructure)get_store().add_element_user(SHIPFROMADDRESS$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "ShipFromAddress" element
         */
        public void removeShipFromAddress(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SHIPFROMADDRESS$12, i);
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
        public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car xgetTelephone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().find_element_user(TELEPHONE$14, 0);
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
        public void xsetTelephone(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car telephone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().find_element_user(TELEPHONE$14, 0);
                if (target == null)
                {
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().add_element_user(TELEPHONE$14);
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
        public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car xgetFax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().find_element_user(FAX$16, 0);
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
        public void xsetFax(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car fax)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().find_element_user(FAX$16, 0);
                if (target == null)
                {
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().add_element_user(FAX$16);
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
        public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax254Car xgetEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax254Car target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax254Car)get_store().find_element_user(EMAIL$18, 0);
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
        public void xsetEmail(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax254Car email)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax254Car target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax254Car)get_store().find_element_user(EMAIL$18, 0);
                if (target == null)
                {
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax254Car)get_store().add_element_user(EMAIL$18);
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
        public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car xgetWebsite()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(WEBSITE$20, 0);
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
        public void xsetWebsite(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car website)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(WEBSITE$20, 0);
                if (target == null)
                {
                    target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().add_element_user(WEBSITE$20);
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
        public x0401.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator xgetSelfBillingIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator)get_store().find_element_user(SELFBILLINGINDICATOR$22, 0);
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
        public void xsetSelfBillingIndicator(x0401.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator selfBillingIndicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0401.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator target = null;
                target = (x0401.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator)get_store().find_element_user(SELFBILLINGINDICATOR$22, 0);
                if (target == null)
                {
                    target = (x0401.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator)get_store().add_element_user(SELFBILLINGINDICATOR$22);
                }
                target.set(selfBillingIndicator);
            }
        }
    }
}
