/*
 * XML Type:  SupplierAddressStructure
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.03_01
 * Java type: x0301.oecdStandardAuditFileTaxPT1.SupplierAddressStructure
 *
 * Automatically generated - do not modify.
 */
package x0301.oecdStandardAuditFileTaxPT1.impl;
/**
 * An XML SupplierAddressStructure(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
 *
 * This is a complex type.
 */
public class SupplierAddressStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0301.oecdStandardAuditFileTaxPT1.SupplierAddressStructure
{
    private static final long serialVersionUID = 1L;
    
    public SupplierAddressStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUILDINGNUMBER$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "BuildingNumber");
    private static final javax.xml.namespace.QName STREETNAME$2 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "StreetName");
    private static final javax.xml.namespace.QName ADDRESSDETAIL$4 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "AddressDetail");
    private static final javax.xml.namespace.QName CITY$6 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "City");
    private static final javax.xml.namespace.QName POSTALCODE$8 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "PostalCode");
    private static final javax.xml.namespace.QName REGION$10 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "Region");
    private static final javax.xml.namespace.QName COUNTRY$12 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "Country");
    
    
    /**
     * Gets the "BuildingNumber" element
     */
    public java.lang.String getBuildingNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUILDINGNUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BuildingNumber" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax10Car xgetBuildingNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax10Car target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax10Car)get_store().find_element_user(BUILDINGNUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "BuildingNumber" element
     */
    public boolean isSetBuildingNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUILDINGNUMBER$0) != 0;
        }
    }
    
    /**
     * Sets the "BuildingNumber" element
     */
    public void setBuildingNumber(java.lang.String buildingNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUILDINGNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUILDINGNUMBER$0);
            }
            target.setStringValue(buildingNumber);
        }
    }
    
    /**
     * Sets (as xml) the "BuildingNumber" element
     */
    public void xsetBuildingNumber(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax10Car buildingNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax10Car target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax10Car)get_store().find_element_user(BUILDINGNUMBER$0, 0);
            if (target == null)
            {
                target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax10Car)get_store().add_element_user(BUILDINGNUMBER$0);
            }
            target.set(buildingNumber);
        }
    }
    
    /**
     * Unsets the "BuildingNumber" element
     */
    public void unsetBuildingNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUILDINGNUMBER$0, 0);
        }
    }
    
    /**
     * Gets the "StreetName" element
     */
    public java.lang.String getStreetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREETNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "StreetName" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax90Car xgetStreetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax90Car target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax90Car)get_store().find_element_user(STREETNAME$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "StreetName" element
     */
    public boolean isSetStreetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STREETNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "StreetName" element
     */
    public void setStreetName(java.lang.String streetName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREETNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STREETNAME$2);
            }
            target.setStringValue(streetName);
        }
    }
    
    /**
     * Sets (as xml) the "StreetName" element
     */
    public void xsetStreetName(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax90Car streetName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax90Car target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax90Car)get_store().find_element_user(STREETNAME$2, 0);
            if (target == null)
            {
                target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax90Car)get_store().add_element_user(STREETNAME$2);
            }
            target.set(streetName);
        }
    }
    
    /**
     * Unsets the "StreetName" element
     */
    public void unsetStreetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STREETNAME$2, 0);
        }
    }
    
    /**
     * Gets the "AddressDetail" element
     */
    public java.lang.String getAddressDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSDETAIL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AddressDetail" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car xgetAddressDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car)get_store().find_element_user(ADDRESSDETAIL$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AddressDetail" element
     */
    public void setAddressDetail(java.lang.String addressDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSDETAIL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESSDETAIL$4);
            }
            target.setStringValue(addressDetail);
        }
    }
    
    /**
     * Sets (as xml) the "AddressDetail" element
     */
    public void xsetAddressDetail(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car addressDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car)get_store().find_element_user(ADDRESSDETAIL$4, 0);
            if (target == null)
            {
                target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car)get_store().add_element_user(ADDRESSDETAIL$4);
            }
            target.set(addressDetail);
        }
    }
    
    /**
     * Gets the "City" element
     */
    public java.lang.String getCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "City" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car xgetCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().find_element_user(CITY$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "City" element
     */
    public void setCity(java.lang.String city)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CITY$6);
            }
            target.setStringValue(city);
        }
    }
    
    /**
     * Sets (as xml) the "City" element
     */
    public void xsetCity(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car city)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().find_element_user(CITY$6, 0);
            if (target == null)
            {
                target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().add_element_user(CITY$6);
            }
            target.set(city);
        }
    }
    
    /**
     * Gets the "PostalCode" element
     */
    public java.lang.String getPostalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTALCODE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PostalCode" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car xgetPostalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().find_element_user(POSTALCODE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PostalCode" element
     */
    public void setPostalCode(java.lang.String postalCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTALCODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTALCODE$8);
            }
            target.setStringValue(postalCode);
        }
    }
    
    /**
     * Sets (as xml) the "PostalCode" element
     */
    public void xsetPostalCode(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car postalCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().find_element_user(POSTALCODE$8, 0);
            if (target == null)
            {
                target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax20Car)get_store().add_element_user(POSTALCODE$8);
            }
            target.set(postalCode);
        }
    }
    
    /**
     * Gets the "Region" element
     */
    public java.lang.String getRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGION$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Region" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car xgetRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().find_element_user(REGION$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "Region" element
     */
    public boolean isSetRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REGION$10) != 0;
        }
    }
    
    /**
     * Sets the "Region" element
     */
    public void setRegion(java.lang.String region)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGION$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REGION$10);
            }
            target.setStringValue(region);
        }
    }
    
    /**
     * Sets (as xml) the "Region" element
     */
    public void xsetRegion(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car region)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().find_element_user(REGION$10, 0);
            if (target == null)
            {
                target = (x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().add_element_user(REGION$10);
            }
            target.set(region);
        }
    }
    
    /**
     * Unsets the "Region" element
     */
    public void unsetRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REGION$10, 0);
        }
    }
    
    /**
     * Gets the "Country" element
     */
    public java.lang.String getCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Country" element
     */
    public x0301.oecdStandardAuditFileTaxPT1.SupplierCountry xgetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SupplierCountry target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SupplierCountry)get_store().find_element_user(COUNTRY$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Country" element
     */
    public void setCountry(java.lang.String country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRY$12);
            }
            target.setStringValue(country);
        }
    }
    
    /**
     * Sets (as xml) the "Country" element
     */
    public void xsetCountry(x0301.oecdStandardAuditFileTaxPT1.SupplierCountry country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0301.oecdStandardAuditFileTaxPT1.SupplierCountry target = null;
            target = (x0301.oecdStandardAuditFileTaxPT1.SupplierCountry)get_store().find_element_user(COUNTRY$12, 0);
            if (target == null)
            {
                target = (x0301.oecdStandardAuditFileTaxPT1.SupplierCountry)get_store().add_element_user(COUNTRY$12);
            }
            target.set(country);
        }
    }
}
