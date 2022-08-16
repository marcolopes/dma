/*
 * XML Type:  ProductSerialNumber
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.ProductSerialNumber
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * An XML ProductSerialNumber(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
 *
 * This is a complex type.
 */
public class ProductSerialNumberImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.ProductSerialNumber
{
    private static final long serialVersionUID = 1L;
    
    public ProductSerialNumberImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERIALNUMBER$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "SerialNumber");
    
    
    /**
     * Gets a List of "SerialNumber" elements
     */
    public java.util.List<java.lang.String> getSerialNumberList()
    {
        final class SerialNumberList extends java.util.AbstractList<java.lang.String>
        {
            @Override
            public java.lang.String get(int i)
                { return ProductSerialNumberImpl.this.getSerialNumberArray(i); }
            
            @Override
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = ProductSerialNumberImpl.this.getSerialNumberArray(i);
                ProductSerialNumberImpl.this.setSerialNumberArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, java.lang.String o)
                { ProductSerialNumberImpl.this.insertSerialNumber(i, o); }
            
            @Override
            public java.lang.String remove(int i)
            {
                java.lang.String old = ProductSerialNumberImpl.this.getSerialNumberArray(i);
                ProductSerialNumberImpl.this.removeSerialNumber(i);
                return old;
            }
            
            @Override
            public int size()
                { return ProductSerialNumberImpl.this.sizeOfSerialNumberArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SerialNumberList();
        }
    }
    
    /**
     * Gets array of all "SerialNumber" elements
     * @deprecated
     */
    @Deprecated
    public java.lang.String[] getSerialNumberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car> targetList = new java.util.ArrayList<x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car>();
            get_store().find_all_element_users(SERIALNUMBER$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "SerialNumber" element
     */
    public java.lang.String getSerialNumberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERIALNUMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "SerialNumber" elements
     */
    public java.util.List<x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car> xgetSerialNumberList()
    {
        final class SerialNumberList extends java.util.AbstractList<x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car>
        {
            @Override
            public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car get(int i)
                { return ProductSerialNumberImpl.this.xgetSerialNumberArray(i); }
            
            @Override
            public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car set(int i, x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car o)
            {
                x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car old = ProductSerialNumberImpl.this.xgetSerialNumberArray(i);
                ProductSerialNumberImpl.this.xsetSerialNumberArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car o)
                { ProductSerialNumberImpl.this.insertNewSerialNumber(i).set(o); }
            
            @Override
            public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car remove(int i)
            {
                x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car old = ProductSerialNumberImpl.this.xgetSerialNumberArray(i);
                ProductSerialNumberImpl.this.removeSerialNumber(i);
                return old;
            }
            
            @Override
            public int size()
                { return ProductSerialNumberImpl.this.sizeOfSerialNumberArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SerialNumberList();
        }
    }
    
    /**
     * Gets array of all "SerialNumber" elements
     * @deprecated
     */
    @Deprecated
    public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car[] xgetSerialNumberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car> targetList = new java.util.ArrayList<x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car>();
            get_store().find_all_element_users(SERIALNUMBER$0, targetList);
            x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car[] result = new x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "SerialNumber" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car xgetSerialNumberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car)get_store().find_element_user(SERIALNUMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SerialNumber" element
     */
    public int sizeOfSerialNumberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERIALNUMBER$0);
        }
    }
    
    /**
     * Sets array of all "SerialNumber" element
     */
    public void setSerialNumberArray(java.lang.String[] serialNumberArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(serialNumberArray, SERIALNUMBER$0);
        }
    }
    
    /**
     * Sets ith "SerialNumber" element
     */
    public void setSerialNumberArray(int i, java.lang.String serialNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERIALNUMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(serialNumber);
        }
    }
    
    /**
     * Sets (as xml) array of all "SerialNumber" element
     */
    public void xsetSerialNumberArray(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car[]serialNumberArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(serialNumberArray, SERIALNUMBER$0);
        }
    }
    
    /**
     * Sets (as xml) ith "SerialNumber" element
     */
    public void xsetSerialNumberArray(int i, x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car serialNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car)get_store().find_element_user(SERIALNUMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(serialNumber);
        }
    }
    
    /**
     * Inserts the value as the ith "SerialNumber" element
     */
    public void insertSerialNumber(int i, java.lang.String serialNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SERIALNUMBER$0, i);
            target.setStringValue(serialNumber);
        }
    }
    
    /**
     * Appends the value as the last "SerialNumber" element
     */
    public void addSerialNumber(java.lang.String serialNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERIALNUMBER$0);
            target.setStringValue(serialNumber);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SerialNumber" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car insertNewSerialNumber(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car)get_store().insert_element_user(SERIALNUMBER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SerialNumber" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car addNewSerialNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car)get_store().add_element_user(SERIALNUMBER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "SerialNumber" element
     */
    public void removeSerialNumber(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERIALNUMBER$0, i);
        }
    }
}
