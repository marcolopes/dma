/*
 * XML Type:  CustomsInformation
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.CustomsInformation
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * An XML CustomsInformation(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
 *
 * This is a complex type.
 */
public class CustomsInformationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.CustomsInformation
{
    private static final long serialVersionUID = 1L;
    
    public CustomsInformationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARCNO$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "ARCNo");
    private static final javax.xml.namespace.QName IECAMOUNT$2 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "IECAmount");
    
    
    /**
     * Gets a List of "ARCNo" elements
     */
    public java.util.List<java.lang.String> getARCNoList()
    {
        final class ARCNoList extends java.util.AbstractList<java.lang.String>
        {
            @Override
            public java.lang.String get(int i)
                { return CustomsInformationImpl.this.getARCNoArray(i); }
            
            @Override
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = CustomsInformationImpl.this.getARCNoArray(i);
                CustomsInformationImpl.this.setARCNoArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, java.lang.String o)
                { CustomsInformationImpl.this.insertARCNo(i, o); }
            
            @Override
            public java.lang.String remove(int i)
            {
                java.lang.String old = CustomsInformationImpl.this.getARCNoArray(i);
                CustomsInformationImpl.this.removeARCNo(i);
                return old;
            }
            
            @Override
            public int size()
                { return CustomsInformationImpl.this.sizeOfARCNoArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ARCNoList();
        }
    }
    
    /**
     * Gets array of all "ARCNo" elements
     * @deprecated
     */
    @Deprecated
    public java.lang.String[] getARCNoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax21Car> targetList = new java.util.ArrayList<x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax21Car>();
            get_store().find_all_element_users(ARCNO$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "ARCNo" element
     */
    public java.lang.String getARCNoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARCNO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "ARCNo" elements
     */
    public java.util.List<x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax21Car> xgetARCNoList()
    {
        final class ARCNoList extends java.util.AbstractList<x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax21Car>
        {
            @Override
            public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax21Car get(int i)
                { return CustomsInformationImpl.this.xgetARCNoArray(i); }
            
            @Override
            public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax21Car set(int i, x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax21Car o)
            {
                x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax21Car old = CustomsInformationImpl.this.xgetARCNoArray(i);
                CustomsInformationImpl.this.xsetARCNoArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax21Car o)
                { CustomsInformationImpl.this.insertNewARCNo(i).set(o); }
            
            @Override
            public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax21Car remove(int i)
            {
                x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax21Car old = CustomsInformationImpl.this.xgetARCNoArray(i);
                CustomsInformationImpl.this.removeARCNo(i);
                return old;
            }
            
            @Override
            public int size()
                { return CustomsInformationImpl.this.sizeOfARCNoArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ARCNoList();
        }
    }
    
    /**
     * Gets array of all "ARCNo" elements
     * @deprecated
     */
    @Deprecated
    public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax21Car[] xgetARCNoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax21Car> targetList = new java.util.ArrayList<x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax21Car>();
            get_store().find_all_element_users(ARCNO$0, targetList);
            x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax21Car[] result = new x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax21Car[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "ARCNo" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax21Car xgetARCNoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax21Car target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax21Car)get_store().find_element_user(ARCNO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ARCNo" element
     */
    public int sizeOfARCNoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARCNO$0);
        }
    }
    
    /**
     * Sets array of all "ARCNo" element
     */
    public void setARCNoArray(java.lang.String[] arcNoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(arcNoArray, ARCNO$0);
        }
    }
    
    /**
     * Sets ith "ARCNo" element
     */
    public void setARCNoArray(int i, java.lang.String arcNo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARCNO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(arcNo);
        }
    }
    
    /**
     * Sets (as xml) array of all "ARCNo" element
     */
    public void xsetARCNoArray(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax21Car[]arcNoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(arcNoArray, ARCNO$0);
        }
    }
    
    /**
     * Sets (as xml) ith "ARCNo" element
     */
    public void xsetARCNoArray(int i, x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax21Car arcNo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax21Car target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax21Car)get_store().find_element_user(ARCNO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arcNo);
        }
    }
    
    /**
     * Inserts the value as the ith "ARCNo" element
     */
    public void insertARCNo(int i, java.lang.String arcNo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ARCNO$0, i);
            target.setStringValue(arcNo);
        }
    }
    
    /**
     * Appends the value as the last "ARCNo" element
     */
    public void addARCNo(java.lang.String arcNo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARCNO$0);
            target.setStringValue(arcNo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ARCNo" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax21Car insertNewARCNo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax21Car target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax21Car)get_store().insert_element_user(ARCNO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ARCNo" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax21Car addNewARCNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax21Car target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax21Car)get_store().add_element_user(ARCNO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ARCNo" element
     */
    public void removeARCNo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARCNO$0, i);
        }
    }
    
    /**
     * Gets the "IECAmount" element
     */
    public java.math.BigDecimal getIECAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IECAMOUNT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "IECAmount" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetIECAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(IECAMOUNT$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "IECAmount" element
     */
    public boolean isSetIECAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IECAMOUNT$2) != 0;
        }
    }
    
    /**
     * Sets the "IECAmount" element
     */
    public void setIECAmount(java.math.BigDecimal iecAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IECAMOUNT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IECAMOUNT$2);
            }
            target.setBigDecimalValue(iecAmount);
        }
    }
    
    /**
     * Sets (as xml) the "IECAmount" element
     */
    public void xsetIECAmount(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType iecAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().find_element_user(IECAMOUNT$2, 0);
            if (target == null)
            {
                target = (x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType)get_store().add_element_user(IECAMOUNT$2);
            }
            target.set(iecAmount);
        }
    }
    
    /**
     * Unsets the "IECAmount" element
     */
    public void unsetIECAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IECAMOUNT$2, 0);
        }
    }
}
