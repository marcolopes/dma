/*
 * An XML document type.
 * Localname: BuildingNumber
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.03_01
 * Java type: x0301.oecdStandardAuditFileTaxPT1.BuildingNumberDocument
 *
 * Automatically generated - do not modify.
 */
package x0301.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one BuildingNumber(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01) element.
 *
 * This is a complex type.
 */
public class BuildingNumberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0301.oecdStandardAuditFileTaxPT1.BuildingNumberDocument
{
    private static final long serialVersionUID = 1L;
    
    public BuildingNumberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUILDINGNUMBER$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.03_01", "BuildingNumber");
    
    
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
}
