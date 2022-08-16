/*
 * An XML document type.
 * Localname: GroupingCategory
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.02_01
 * Java type: x0201.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument
 *
 * Automatically generated - do not modify.
 */
package x0201.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one GroupingCategory(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01) element.
 *
 * This is a complex type.
 */
public class GroupingCategoryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0201.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument
{
    private static final long serialVersionUID = 1L;
    
    public GroupingCategoryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUPINGCATEGORY$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "GroupingCategory");
    
    
    /**
     * Gets the "GroupingCategory" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument.GroupingCategory.Enum getGroupingCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUPINGCATEGORY$0, 0);
            if (target == null)
            {
                return null;
            }
            return (x0201.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument.GroupingCategory.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "GroupingCategory" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument.GroupingCategory xgetGroupingCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument.GroupingCategory target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument.GroupingCategory)get_store().find_element_user(GROUPINGCATEGORY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "GroupingCategory" element
     */
    public void setGroupingCategory(x0201.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument.GroupingCategory.Enum groupingCategory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUPINGCATEGORY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GROUPINGCATEGORY$0);
            }
            target.setEnumValue(groupingCategory);
        }
    }
    
    /**
     * Sets (as xml) the "GroupingCategory" element
     */
    public void xsetGroupingCategory(x0201.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument.GroupingCategory groupingCategory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument.GroupingCategory target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument.GroupingCategory)get_store().find_element_user(GROUPINGCATEGORY$0, 0);
            if (target == null)
            {
                target = (x0201.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument.GroupingCategory)get_store().add_element_user(GROUPINGCATEGORY$0);
            }
            target.set(groupingCategory);
        }
    }
    /**
     * An XML GroupingCategory(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01).
     *
     * This is an atomic type that is a restriction of x0201.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument$GroupingCategory.
     */
    public static class GroupingCategoryImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x0201.oecdStandardAuditFileTaxPT1.GroupingCategoryDocument.GroupingCategory
    {
        private static final long serialVersionUID = 1L;
        
        public GroupingCategoryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected GroupingCategoryImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
