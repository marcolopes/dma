/*
 * An XML document type.
 * Localname: Product
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.01_01
 * Java type: x0101.oecdStandardAuditFileTaxPT1.ProductDocument
 *
 * Automatically generated - do not modify.
 */
package x0101.oecdStandardAuditFileTaxPT1.impl;
/**
 * A document containing one Product(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01) element.
 *
 * This is a complex type.
 */
public class ProductDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.ProductDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProductDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCT$0 = 
        new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "Product");
    
    
    /**
     * Gets the "Product" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.ProductDocument.Product getProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.ProductDocument.Product target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.ProductDocument.Product)get_store().find_element_user(PRODUCT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Product" element
     */
    public void setProduct(x0101.oecdStandardAuditFileTaxPT1.ProductDocument.Product product)
    {
        generatedSetterHelperImpl(product, PRODUCT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Product" element
     */
    public x0101.oecdStandardAuditFileTaxPT1.ProductDocument.Product addNewProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0101.oecdStandardAuditFileTaxPT1.ProductDocument.Product target = null;
            target = (x0101.oecdStandardAuditFileTaxPT1.ProductDocument.Product)get_store().add_element_user(PRODUCT$0);
            return target;
        }
    }
    /**
     * An XML Product(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01).
     *
     * This is a complex type.
     */
    public static class ProductImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0101.oecdStandardAuditFileTaxPT1.ProductDocument.Product
    {
        private static final long serialVersionUID = 1L;
        
        public ProductImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PRODUCTTYPE$0 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "ProductType");
        private static final javax.xml.namespace.QName PRODUCTCODE$2 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "ProductCode");
        private static final javax.xml.namespace.QName PRODUCTGROUP$4 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "ProductGroup");
        private static final javax.xml.namespace.QName PRODUCTDESCRIPTION$6 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "ProductDescription");
        private static final javax.xml.namespace.QName PRODUCTNUMBERCODE$8 = 
            new javax.xml.namespace.QName("urn:OECD:StandardAuditFile-Tax:PT_1.01_01", "ProductNumberCode");
        
        
        /**
         * Gets the "ProductType" element
         */
        public x0101.oecdStandardAuditFileTaxPT1.ProductTypeDocument.ProductType.Enum getProductType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTTYPE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return (x0101.oecdStandardAuditFileTaxPT1.ProductTypeDocument.ProductType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "ProductType" element
         */
        public x0101.oecdStandardAuditFileTaxPT1.ProductTypeDocument.ProductType xgetProductType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.ProductTypeDocument.ProductType target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.ProductTypeDocument.ProductType)get_store().find_element_user(PRODUCTTYPE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ProductType" element
         */
        public void setProductType(x0101.oecdStandardAuditFileTaxPT1.ProductTypeDocument.ProductType.Enum productType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTTYPE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTTYPE$0);
                }
                target.setEnumValue(productType);
            }
        }
        
        /**
         * Sets (as xml) the "ProductType" element
         */
        public void xsetProductType(x0101.oecdStandardAuditFileTaxPT1.ProductTypeDocument.ProductType productType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.ProductTypeDocument.ProductType target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.ProductTypeDocument.ProductType)get_store().find_element_user(PRODUCTTYPE$0, 0);
                if (target == null)
                {
                    target = (x0101.oecdStandardAuditFileTaxPT1.ProductTypeDocument.ProductType)get_store().add_element_user(PRODUCTTYPE$0);
                }
                target.set(productType);
            }
        }
        
        /**
         * Gets the "ProductCode" element
         */
        public java.lang.String getProductCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCODE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ProductCode" element
         */
        public x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetProductCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(PRODUCTCODE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ProductCode" element
         */
        public void setProductCode(java.lang.String productCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCODE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTCODE$2);
                }
                target.setStringValue(productCode);
            }
        }
        
        /**
         * Sets (as xml) the "ProductCode" element
         */
        public void xsetProductCode(x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car productCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().find_element_user(PRODUCTCODE$2, 0);
                if (target == null)
                {
                    target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car)get_store().add_element_user(PRODUCTCODE$2);
                }
                target.set(productCode);
            }
        }
        
        /**
         * Gets the "ProductGroup" element
         */
        public java.lang.String getProductGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTGROUP$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ProductGroup" element
         */
        public x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car xgetProductGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().find_element_user(PRODUCTGROUP$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "ProductGroup" element
         */
        public boolean isSetProductGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PRODUCTGROUP$4) != 0;
            }
        }
        
        /**
         * Sets the "ProductGroup" element
         */
        public void setProductGroup(java.lang.String productGroup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTGROUP$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTGROUP$4);
                }
                target.setStringValue(productGroup);
            }
        }
        
        /**
         * Sets (as xml) the "ProductGroup" element
         */
        public void xsetProductGroup(x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car productGroup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().find_element_user(PRODUCTGROUP$4, 0);
                if (target == null)
                {
                    target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().add_element_user(PRODUCTGROUP$4);
                }
                target.set(productGroup);
            }
        }
        
        /**
         * Unsets the "ProductGroup" element
         */
        public void unsetProductGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PRODUCTGROUP$4, 0);
            }
        }
        
        /**
         * Gets the "ProductDescription" element
         */
        public java.lang.String getProductDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTDESCRIPTION$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ProductDescription" element
         */
        public x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car xgetProductDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(PRODUCTDESCRIPTION$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ProductDescription" element
         */
        public void setProductDescription(java.lang.String productDescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTDESCRIPTION$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTDESCRIPTION$6);
                }
                target.setStringValue(productDescription);
            }
        }
        
        /**
         * Sets (as xml) the "ProductDescription" element
         */
        public void xsetProductDescription(x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car productDescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(PRODUCTDESCRIPTION$6, 0);
                if (target == null)
                {
                    target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax60Car)get_store().add_element_user(PRODUCTDESCRIPTION$6);
                }
                target.set(productDescription);
            }
        }
        
        /**
         * Gets the "ProductNumberCode" element
         */
        public java.lang.String getProductNumberCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTNUMBERCODE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ProductNumberCode" element
         */
        public x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car xgetProductNumberCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().find_element_user(PRODUCTNUMBERCODE$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ProductNumberCode" element
         */
        public void setProductNumberCode(java.lang.String productNumberCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTNUMBERCODE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTNUMBERCODE$8);
                }
                target.setStringValue(productNumberCode);
            }
        }
        
        /**
         * Sets (as xml) the "ProductNumberCode" element
         */
        public void xsetProductNumberCode(x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car productNumberCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car target = null;
                target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().find_element_user(PRODUCTNUMBERCODE$8, 0);
                if (target == null)
                {
                    target = (x0101.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car)get_store().add_element_user(PRODUCTNUMBERCODE$8);
                }
                target.set(productNumberCode);
            }
        }
    }
}
