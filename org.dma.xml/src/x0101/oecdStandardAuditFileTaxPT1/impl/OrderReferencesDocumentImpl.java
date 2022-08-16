/*
 * An XML document type.
 * Localname: OrderReferences
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.01_01
 * Java type: x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument
 *
 * Automatically generated - do not modify.
 */
package x0101.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one OrderReferences(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01) element.
 *
 * This is a complex type.
 */
public class OrderReferencesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrderReferencesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERREFERENCES$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "OrderReferences");
    
    
    /**
     * Gets the "OrderReferences" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument.OrderReferences getOrderReferences()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument.OrderReferences target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument.OrderReferences)get_store().find_element_user(ORDERREFERENCES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OrderReferences" element
     */
    public void setOrderReferences(x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument.OrderReferences orderReferences)
    {
        generatedSetterHelperImpl(orderReferences, ORDERREFERENCES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrderReferences" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument.OrderReferences addNewOrderReferences()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument.OrderReferences target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument.OrderReferences)get_store().add_element_user(ORDERREFERENCES$0);
            return target;
        }
    }
    /**
     * An XML OrderReferences(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01).
     *
     * This is a complex type.
     */
    public static class OrderReferencesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.OrderReferencesDocument.OrderReferences
    {
        private static final long serialVersionUID = 1L;
        
        public OrderReferencesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ORIGINATINGON$0 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "OriginatingON");
        private static final javax.xml.namespace.QName ORDERDATE$2 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "OrderDate");
        
        
        /**
         * Gets the "OriginatingON" element
         */
        public java.lang.String getOriginatingON()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINATINGON$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OriginatingON" element
         */
        public x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetOriginatingON()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(ORIGINATINGON$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "OriginatingON" element
         */
        public boolean isSetOriginatingON()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORIGINATINGON$0) != 0;
            }
        }
        
        /**
         * Sets the "OriginatingON" element
         */
        public void setOriginatingON(java.lang.String originatingON)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINATINGON$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORIGINATINGON$0);
                }
                target.setStringValue(originatingON);
            }
        }
        
        /**
         * Sets (as xml) the "OriginatingON" element
         */
        public void xsetOriginatingON(x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car originatingON)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(ORIGINATINGON$0, 0);
                if (target == null)
                {
                    target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().add_element_user(ORIGINATINGON$0);
                }
                target.set(originatingON);
            }
        }
        
        /**
         * Unsets the "OriginatingON" element
         */
        public void unsetOriginatingON()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORIGINATINGON$0, 0);
            }
        }
        
        /**
         * Gets the "OrderDate" element
         */
        public java.util.Calendar getOrderDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERDATE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "OrderDate" element
         */
        public x0101.oecdStandardAuditFileTaxPT1.SAFdateType xgetOrderDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(ORDERDATE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "OrderDate" element
         */
        public boolean isSetOrderDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORDERDATE$2) != 0;
            }
        }
        
        /**
         * Sets the "OrderDate" element
         */
        public void setOrderDate(java.util.Calendar orderDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERDATE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERDATE$2);
                }
                target.setCalendarValue(orderDate);
            }
        }
        
        /**
         * Sets (as xml) the "OrderDate" element
         */
        public void xsetOrderDate(x0101.oecdStandardAuditFileTaxPT1.SAFdateType orderDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFdateType target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().find_element_user(ORDERDATE$2, 0);
                if (target == null)
                {
                    target = (x0101.oecdStandardAuditFileTaxPT1.SAFdateType)get_store().add_element_user(ORDERDATE$2);
                }
                target.set(orderDate);
            }
        }
        
        /**
         * Unsets the "OrderDate" element
         */
        public void unsetOrderDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORDERDATE$2, 0);
            }
        }
    }
}
