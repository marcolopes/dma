/*
 * XML Type:  ShippingPointStructure
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.02_01
 * Java type: x0201.oecdStandardAuditFileTaxPT1.ShippingPointStructure
 *
 * Automatically generated - do not modify.
 */
package x0201.oecdStandardAuditFileTaxPT1.impl;
/**
 * An XML ShippingPointStructure(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01).
 *
 * This is a complex type.
 */
public class ShippingPointStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0201.oecdStandardAuditFileTaxPT1.ShippingPointStructure
{
    private static final long serialVersionUID = 1L;
    
    public ShippingPointStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELIVERYID$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "DeliveryID");
    private static final javax.xml.namespace.QName DELIVERYDATE$2 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "DeliveryDate");
    private static final javax.xml.namespace.QName WAREHOUSEID$4 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "WarehouseID");
    private static final javax.xml.namespace.QName LOCATIONID$6 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "LocationID");
    private static final javax.xml.namespace.QName ADDRESS$8 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.02_01", "Address");
    
    
    /**
     * Gets a List of "DeliveryID" elements
     */
    public java.util.List<java.lang.String> getDeliveryIDList()
    {
        final class DeliveryIDList extends java.util.AbstractList<java.lang.String>
        {
            @Override
            public java.lang.String get(int i)
                { return ShippingPointStructureImpl.this.getDeliveryIDArray(i); }
            
            @Override
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = ShippingPointStructureImpl.this.getDeliveryIDArray(i);
                ShippingPointStructureImpl.this.setDeliveryIDArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, java.lang.String o)
                { ShippingPointStructureImpl.this.insertDeliveryID(i, o); }
            
            @Override
            public java.lang.String remove(int i)
            {
                java.lang.String old = ShippingPointStructureImpl.this.getDeliveryIDArray(i);
                ShippingPointStructureImpl.this.removeDeliveryID(i);
                return old;
            }
            
            @Override
            public int size()
                { return ShippingPointStructureImpl.this.sizeOfDeliveryIDArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DeliveryIDList();
        }
    }
    
    /**
     * Gets array of all "DeliveryID" elements
     * @deprecated
     */
    @Deprecated
    public java.lang.String[] getDeliveryIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car> targetList = new java.util.ArrayList<x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car>();
            get_store().find_all_element_users(DELIVERYID$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "DeliveryID" element
     */
    public java.lang.String getDeliveryIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIVERYID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "DeliveryID" elements
     */
    public java.util.List<x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car> xgetDeliveryIDList()
    {
        final class DeliveryIDList extends java.util.AbstractList<x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car>
        {
            @Override
            public x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car get(int i)
                { return ShippingPointStructureImpl.this.xgetDeliveryIDArray(i); }
            
            @Override
            public x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car set(int i, x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car o)
            {
                x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car old = ShippingPointStructureImpl.this.xgetDeliveryIDArray(i);
                ShippingPointStructureImpl.this.xsetDeliveryIDArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car o)
                { ShippingPointStructureImpl.this.insertNewDeliveryID(i).set(o); }
            
            @Override
            public x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car remove(int i)
            {
                x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car old = ShippingPointStructureImpl.this.xgetDeliveryIDArray(i);
                ShippingPointStructureImpl.this.removeDeliveryID(i);
                return old;
            }
            
            @Override
            public int size()
                { return ShippingPointStructureImpl.this.sizeOfDeliveryIDArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DeliveryIDList();
        }
    }
    
    /**
     * Gets array of all "DeliveryID" elements
     * @deprecated
     */
    @Deprecated
    public x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car[] xgetDeliveryIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car> targetList = new java.util.ArrayList<x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car>();
            get_store().find_all_element_users(DELIVERYID$0, targetList);
            x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car[] result = new x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "DeliveryID" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetDeliveryIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(DELIVERYID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DeliveryID" element
     */
    public int sizeOfDeliveryIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELIVERYID$0);
        }
    }
    
    /**
     * Sets array of all "DeliveryID" element
     */
    public void setDeliveryIDArray(java.lang.String[] deliveryIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(deliveryIDArray, DELIVERYID$0);
        }
    }
    
    /**
     * Sets ith "DeliveryID" element
     */
    public void setDeliveryIDArray(int i, java.lang.String deliveryID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIVERYID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(deliveryID);
        }
    }
    
    /**
     * Sets (as xml) array of all "DeliveryID" element
     */
    public void xsetDeliveryIDArray(x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car[]deliveryIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(deliveryIDArray, DELIVERYID$0);
        }
    }
    
    /**
     * Sets (as xml) ith "DeliveryID" element
     */
    public void xsetDeliveryIDArray(int i, x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car deliveryID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(DELIVERYID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(deliveryID);
        }
    }
    
    /**
     * Inserts the value as the ith "DeliveryID" element
     */
    public void insertDeliveryID(int i, java.lang.String deliveryID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DELIVERYID$0, i);
            target.setStringValue(deliveryID);
        }
    }
    
    /**
     * Appends the value as the last "DeliveryID" element
     */
    public void addDeliveryID(java.lang.String deliveryID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELIVERYID$0);
            target.setStringValue(deliveryID);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DeliveryID" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car insertNewDeliveryID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().insert_element_user(DELIVERYID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DeliveryID" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car addNewDeliveryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().add_element_user(DELIVERYID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "DeliveryID" element
     */
    public void removeDeliveryID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELIVERYID$0, i);
        }
    }
    
    /**
     * Gets the "DeliveryDate" element
     */
    public java.util.Calendar getDeliveryDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIVERYDATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DeliveryDate" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.SAFdateType xgetDeliveryDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(DELIVERYDATE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "DeliveryDate" element
     */
    public boolean isSetDeliveryDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELIVERYDATE$2) != 0;
        }
    }
    
    /**
     * Sets the "DeliveryDate" element
     */
    public void setDeliveryDate(java.util.Calendar deliveryDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIVERYDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELIVERYDATE$2);
            }
            target.setCalendarValue(deliveryDate);
        }
    }
    
    /**
     * Sets (as xml) the "DeliveryDate" element
     */
    public void xsetDeliveryDate(x0201.oecdStandardAuditFileTaxPT1.SAFdateType deliveryDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(DELIVERYDATE$2, 0);
            if (target == null)
            {
                target = (x0201.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().add_element_user(DELIVERYDATE$2);
            }
            target.set(deliveryDate);
        }
    }
    
    /**
     * Unsets the "DeliveryDate" element
     */
    public void unsetDeliveryDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELIVERYDATE$2, 0);
        }
    }
    
    /**
     * Gets a List of "WarehouseID" elements
     */
    public java.util.List<java.lang.String> getWarehouseIDList()
    {
        final class WarehouseIDList extends java.util.AbstractList<java.lang.String>
        {
            @Override
            public java.lang.String get(int i)
                { return ShippingPointStructureImpl.this.getWarehouseIDArray(i); }
            
            @Override
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = ShippingPointStructureImpl.this.getWarehouseIDArray(i);
                ShippingPointStructureImpl.this.setWarehouseIDArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, java.lang.String o)
                { ShippingPointStructureImpl.this.insertWarehouseID(i, o); }
            
            @Override
            public java.lang.String remove(int i)
            {
                java.lang.String old = ShippingPointStructureImpl.this.getWarehouseIDArray(i);
                ShippingPointStructureImpl.this.removeWarehouseID(i);
                return old;
            }
            
            @Override
            public int size()
                { return ShippingPointStructureImpl.this.sizeOfWarehouseIDArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new WarehouseIDList();
        }
    }
    
    /**
     * Gets array of all "WarehouseID" elements
     * @deprecated
     */
    @Deprecated
    public java.lang.String[] getWarehouseIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car> targetList = new java.util.ArrayList<x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car>();
            get_store().find_all_element_users(WAREHOUSEID$4, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "WarehouseID" element
     */
    public java.lang.String getWarehouseIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WAREHOUSEID$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "WarehouseID" elements
     */
    public java.util.List<x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car> xgetWarehouseIDList()
    {
        final class WarehouseIDList extends java.util.AbstractList<x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car>
        {
            @Override
            public x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car get(int i)
                { return ShippingPointStructureImpl.this.xgetWarehouseIDArray(i); }
            
            @Override
            public x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car set(int i, x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car o)
            {
                x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car old = ShippingPointStructureImpl.this.xgetWarehouseIDArray(i);
                ShippingPointStructureImpl.this.xsetWarehouseIDArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car o)
                { ShippingPointStructureImpl.this.insertNewWarehouseID(i).set(o); }
            
            @Override
            public x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car remove(int i)
            {
                x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car old = ShippingPointStructureImpl.this.xgetWarehouseIDArray(i);
                ShippingPointStructureImpl.this.removeWarehouseID(i);
                return old;
            }
            
            @Override
            public int size()
                { return ShippingPointStructureImpl.this.sizeOfWarehouseIDArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new WarehouseIDList();
        }
    }
    
    /**
     * Gets array of all "WarehouseID" elements
     * @deprecated
     */
    @Deprecated
    public x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car[] xgetWarehouseIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car> targetList = new java.util.ArrayList<x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car>();
            get_store().find_all_element_users(WAREHOUSEID$4, targetList);
            x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car[] result = new x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "WarehouseID" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car xgetWarehouseIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().find_element_user(WAREHOUSEID$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "WarehouseID" element
     */
    public int sizeOfWarehouseIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WAREHOUSEID$4);
        }
    }
    
    /**
     * Sets array of all "WarehouseID" element
     */
    public void setWarehouseIDArray(java.lang.String[] warehouseIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(warehouseIDArray, WAREHOUSEID$4);
        }
    }
    
    /**
     * Sets ith "WarehouseID" element
     */
    public void setWarehouseIDArray(int i, java.lang.String warehouseID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WAREHOUSEID$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(warehouseID);
        }
    }
    
    /**
     * Sets (as xml) array of all "WarehouseID" element
     */
    public void xsetWarehouseIDArray(x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car[]warehouseIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(warehouseIDArray, WAREHOUSEID$4);
        }
    }
    
    /**
     * Sets (as xml) ith "WarehouseID" element
     */
    public void xsetWarehouseIDArray(int i, x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car warehouseID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().find_element_user(WAREHOUSEID$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(warehouseID);
        }
    }
    
    /**
     * Inserts the value as the ith "WarehouseID" element
     */
    public void insertWarehouseID(int i, java.lang.String warehouseID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(WAREHOUSEID$4, i);
            target.setStringValue(warehouseID);
        }
    }
    
    /**
     * Appends the value as the last "WarehouseID" element
     */
    public void addWarehouseID(java.lang.String warehouseID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WAREHOUSEID$4);
            target.setStringValue(warehouseID);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "WarehouseID" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car insertNewWarehouseID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().insert_element_user(WAREHOUSEID$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "WarehouseID" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car addNewWarehouseID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().add_element_user(WAREHOUSEID$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "WarehouseID" element
     */
    public void removeWarehouseID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WAREHOUSEID$4, i);
        }
    }
    
    /**
     * Gets a List of "LocationID" elements
     */
    public java.util.List<java.lang.String> getLocationIDList()
    {
        final class LocationIDList extends java.util.AbstractList<java.lang.String>
        {
            @Override
            public java.lang.String get(int i)
                { return ShippingPointStructureImpl.this.getLocationIDArray(i); }
            
            @Override
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = ShippingPointStructureImpl.this.getLocationIDArray(i);
                ShippingPointStructureImpl.this.setLocationIDArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, java.lang.String o)
                { ShippingPointStructureImpl.this.insertLocationID(i, o); }
            
            @Override
            public java.lang.String remove(int i)
            {
                java.lang.String old = ShippingPointStructureImpl.this.getLocationIDArray(i);
                ShippingPointStructureImpl.this.removeLocationID(i);
                return old;
            }
            
            @Override
            public int size()
                { return ShippingPointStructureImpl.this.sizeOfLocationIDArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LocationIDList();
        }
    }
    
    /**
     * Gets array of all "LocationID" elements
     * @deprecated
     */
    @Deprecated
    public java.lang.String[] getLocationIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car> targetList = new java.util.ArrayList<x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car>();
            get_store().find_all_element_users(LOCATIONID$6, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "LocationID" element
     */
    public java.lang.String getLocationIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATIONID$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "LocationID" elements
     */
    public java.util.List<x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car> xgetLocationIDList()
    {
        final class LocationIDList extends java.util.AbstractList<x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car>
        {
            @Override
            public x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car get(int i)
                { return ShippingPointStructureImpl.this.xgetLocationIDArray(i); }
            
            @Override
            public x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car set(int i, x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car o)
            {
                x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car old = ShippingPointStructureImpl.this.xgetLocationIDArray(i);
                ShippingPointStructureImpl.this.xsetLocationIDArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car o)
                { ShippingPointStructureImpl.this.insertNewLocationID(i).set(o); }
            
            @Override
            public x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car remove(int i)
            {
                x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car old = ShippingPointStructureImpl.this.xgetLocationIDArray(i);
                ShippingPointStructureImpl.this.removeLocationID(i);
                return old;
            }
            
            @Override
            public int size()
                { return ShippingPointStructureImpl.this.sizeOfLocationIDArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LocationIDList();
        }
    }
    
    /**
     * Gets array of all "LocationID" elements
     * @deprecated
     */
    @Deprecated
    public x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car[] xgetLocationIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car> targetList = new java.util.ArrayList<x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car>();
            get_store().find_all_element_users(LOCATIONID$6, targetList);
            x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car[] result = new x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "LocationID" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetLocationIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(LOCATIONID$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "LocationID" element
     */
    public int sizeOfLocationIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATIONID$6);
        }
    }
    
    /**
     * Sets array of all "LocationID" element
     */
    public void setLocationIDArray(java.lang.String[] locationIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(locationIDArray, LOCATIONID$6);
        }
    }
    
    /**
     * Sets ith "LocationID" element
     */
    public void setLocationIDArray(int i, java.lang.String locationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATIONID$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(locationID);
        }
    }
    
    /**
     * Sets (as xml) array of all "LocationID" element
     */
    public void xsetLocationIDArray(x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car[]locationIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(locationIDArray, LOCATIONID$6);
        }
    }
    
    /**
     * Sets (as xml) ith "LocationID" element
     */
    public void xsetLocationIDArray(int i, x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car locationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(LOCATIONID$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(locationID);
        }
    }
    
    /**
     * Inserts the value as the ith "LocationID" element
     */
    public void insertLocationID(int i, java.lang.String locationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(LOCATIONID$6, i);
            target.setStringValue(locationID);
        }
    }
    
    /**
     * Appends the value as the last "LocationID" element
     */
    public void addLocationID(java.lang.String locationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCATIONID$6);
            target.setStringValue(locationID);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LocationID" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car insertNewLocationID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().insert_element_user(LOCATIONID$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LocationID" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car addNewLocationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().add_element_user(LOCATIONID$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "LocationID" element
     */
    public void removeLocationID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATIONID$6, i);
        }
    }
    
    /**
     * Gets the "Address" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.AddressStructure getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.AddressStructure target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.AddressStructure)get_store().find_element_user(ADDRESS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Address" element
     */
    public boolean isSetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS$8) != 0;
        }
    }
    
    /**
     * Sets the "Address" element
     */
    public void setAddress(x0201.oecdStandardAuditFileTaxPT1.AddressStructure address)
    {
        generatedSetterHelperImpl(address, ADDRESS$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Address" element
     */
    public x0201.oecdStandardAuditFileTaxPT1.AddressStructure addNewAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0201.oecdStandardAuditFileTaxPT1.AddressStructure target = null;
            target = (x0201.oecdStandardAuditFileTaxPT1.AddressStructure)get_store().add_element_user(ADDRESS$8);
            return target;
        }
    }
    
    /**
     * Unsets the "Address" element
     */
    public void unsetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS$8, 0);
        }
    }
}
