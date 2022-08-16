/*
 * XML Type:  CustomsDetails
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.CustomsDetails
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1.impl;
/**
 * An XML CustomsDetails(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
 *
 * This is a complex type.
 */
public class CustomsDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0401.oecdStandardAuditFileTaxPT1.CustomsDetails
{
    private static final long serialVersionUID = 1L;
    
    public CustomsDetailsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CNCODE$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "CNCode");
    private static final javax.xml.namespace.QName UNNUMBER$2 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.04_01", "UNNumber");
    
    
    /**
     * Gets a List of "CNCode" elements
     */
    public java.util.List<java.lang.String> getCNCodeList()
    {
        final class CNCodeList extends java.util.AbstractList<java.lang.String>
        {
            @Override
            public java.lang.String get(int i)
                { return CustomsDetailsImpl.this.getCNCodeArray(i); }
            
            @Override
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = CustomsDetailsImpl.this.getCNCodeArray(i);
                CustomsDetailsImpl.this.setCNCodeArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, java.lang.String o)
                { CustomsDetailsImpl.this.insertCNCode(i, o); }
            
            @Override
            public java.lang.String remove(int i)
            {
                java.lang.String old = CustomsDetailsImpl.this.getCNCodeArray(i);
                CustomsDetailsImpl.this.removeCNCode(i);
                return old;
            }
            
            @Override
            public int size()
                { return CustomsDetailsImpl.this.sizeOfCNCodeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CNCodeList();
        }
    }
    
    /**
     * Gets array of all "CNCode" elements
     * @deprecated
     */
    @Deprecated
    public java.lang.String[] getCNCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode> targetList = new java.util.ArrayList<x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode>();
            get_store().find_all_element_users(CNCODE$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "CNCode" element
     */
    public java.lang.String getCNCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CNCODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "CNCode" elements
     */
    public java.util.List<x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode> xgetCNCodeList()
    {
        final class CNCodeList extends java.util.AbstractList<x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode>
        {
            @Override
            public x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode get(int i)
                { return CustomsDetailsImpl.this.xgetCNCodeArray(i); }
            
            @Override
            public x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode set(int i, x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode o)
            {
                x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode old = CustomsDetailsImpl.this.xgetCNCodeArray(i);
                CustomsDetailsImpl.this.xsetCNCodeArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode o)
                { CustomsDetailsImpl.this.insertNewCNCode(i).set(o); }
            
            @Override
            public x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode remove(int i)
            {
                x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode old = CustomsDetailsImpl.this.xgetCNCodeArray(i);
                CustomsDetailsImpl.this.removeCNCode(i);
                return old;
            }
            
            @Override
            public int size()
                { return CustomsDetailsImpl.this.sizeOfCNCodeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CNCodeList();
        }
    }
    
    /**
     * Gets array of all "CNCode" elements
     * @deprecated
     */
    @Deprecated
    public x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode[] xgetCNCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode> targetList = new java.util.ArrayList<x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode>();
            get_store().find_all_element_users(CNCODE$0, targetList);
            x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode[] result = new x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "CNCode" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode xgetCNCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode)get_store().find_element_user(CNCODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "CNCode" element
     */
    public int sizeOfCNCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CNCODE$0);
        }
    }
    
    /**
     * Sets array of all "CNCode" element
     */
    public void setCNCodeArray(java.lang.String[] cnCodeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(cnCodeArray, CNCODE$0);
        }
    }
    
    /**
     * Sets ith "CNCode" element
     */
    public void setCNCodeArray(int i, java.lang.String cnCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CNCODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(cnCode);
        }
    }
    
    /**
     * Sets (as xml) array of all "CNCode" element
     */
    public void xsetCNCodeArray(x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode[]cnCodeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(cnCodeArray, CNCODE$0);
        }
    }
    
    /**
     * Sets (as xml) ith "CNCode" element
     */
    public void xsetCNCodeArray(int i, x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode cnCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode)get_store().find_element_user(CNCODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cnCode);
        }
    }
    
    /**
     * Inserts the value as the ith "CNCode" element
     */
    public void insertCNCode(int i, java.lang.String cnCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CNCODE$0, i);
            target.setStringValue(cnCode);
        }
    }
    
    /**
     * Appends the value as the last "CNCode" element
     */
    public void addCNCode(java.lang.String cnCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CNCODE$0);
            target.setStringValue(cnCode);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CNCode" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode insertNewCNCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode)get_store().insert_element_user(CNCODE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CNCode" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode addNewCNCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode)get_store().add_element_user(CNCODE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "CNCode" element
     */
    public void removeCNCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CNCODE$0, i);
        }
    }
    
    /**
     * Gets a List of "UNNumber" elements
     */
    public java.util.List<java.lang.String> getUNNumberList()
    {
        final class UNNumberList extends java.util.AbstractList<java.lang.String>
        {
            @Override
            public java.lang.String get(int i)
                { return CustomsDetailsImpl.this.getUNNumberArray(i); }
            
            @Override
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = CustomsDetailsImpl.this.getUNNumberArray(i);
                CustomsDetailsImpl.this.setUNNumberArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, java.lang.String o)
                { CustomsDetailsImpl.this.insertUNNumber(i, o); }
            
            @Override
            public java.lang.String remove(int i)
            {
                java.lang.String old = CustomsDetailsImpl.this.getUNNumberArray(i);
                CustomsDetailsImpl.this.removeUNNumber(i);
                return old;
            }
            
            @Override
            public int size()
                { return CustomsDetailsImpl.this.sizeOfUNNumberArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new UNNumberList();
        }
    }
    
    /**
     * Gets array of all "UNNumber" elements
     * @deprecated
     */
    @Deprecated
    public java.lang.String[] getUNNumberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber> targetList = new java.util.ArrayList<x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber>();
            get_store().find_all_element_users(UNNUMBER$2, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "UNNumber" element
     */
    public java.lang.String getUNNumberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNNUMBER$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "UNNumber" elements
     */
    public java.util.List<x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber> xgetUNNumberList()
    {
        final class UNNumberList extends java.util.AbstractList<x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber>
        {
            @Override
            public x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber get(int i)
                { return CustomsDetailsImpl.this.xgetUNNumberArray(i); }
            
            @Override
            public x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber set(int i, x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber o)
            {
                x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber old = CustomsDetailsImpl.this.xgetUNNumberArray(i);
                CustomsDetailsImpl.this.xsetUNNumberArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber o)
                { CustomsDetailsImpl.this.insertNewUNNumber(i).set(o); }
            
            @Override
            public x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber remove(int i)
            {
                x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber old = CustomsDetailsImpl.this.xgetUNNumberArray(i);
                CustomsDetailsImpl.this.removeUNNumber(i);
                return old;
            }
            
            @Override
            public int size()
                { return CustomsDetailsImpl.this.sizeOfUNNumberArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new UNNumberList();
        }
    }
    
    /**
     * Gets array of all "UNNumber" elements
     * @deprecated
     */
    @Deprecated
    public x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber[] xgetUNNumberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber> targetList = new java.util.ArrayList<x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber>();
            get_store().find_all_element_users(UNNUMBER$2, targetList);
            x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber[] result = new x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "UNNumber" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber xgetUNNumberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber)get_store().find_element_user(UNNUMBER$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "UNNumber" element
     */
    public int sizeOfUNNumberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNNUMBER$2);
        }
    }
    
    /**
     * Sets array of all "UNNumber" element
     */
    public void setUNNumberArray(java.lang.String[] unNumberArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(unNumberArray, UNNUMBER$2);
        }
    }
    
    /**
     * Sets ith "UNNumber" element
     */
    public void setUNNumberArray(int i, java.lang.String unNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNNUMBER$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(unNumber);
        }
    }
    
    /**
     * Sets (as xml) array of all "UNNumber" element
     */
    public void xsetUNNumberArray(x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber[]unNumberArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(unNumberArray, UNNUMBER$2);
        }
    }
    
    /**
     * Sets (as xml) ith "UNNumber" element
     */
    public void xsetUNNumberArray(int i, x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber unNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber)get_store().find_element_user(UNNUMBER$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(unNumber);
        }
    }
    
    /**
     * Inserts the value as the ith "UNNumber" element
     */
    public void insertUNNumber(int i, java.lang.String unNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(UNNUMBER$2, i);
            target.setStringValue(unNumber);
        }
    }
    
    /**
     * Appends the value as the last "UNNumber" element
     */
    public void addUNNumber(java.lang.String unNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNNUMBER$2);
            target.setStringValue(unNumber);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "UNNumber" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber insertNewUNNumber(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber)get_store().insert_element_user(UNNUMBER$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "UNNumber" element
     */
    public x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber addNewUNNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber target = null;
            target = (x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber)get_store().add_element_user(UNNUMBER$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "UNNumber" element
     */
    public void removeUNNumber(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNNUMBER$2, i);
        }
    }
}
