/*
 * An XML document type.
 * Localname: Stock
 * Namespace: urn:StockFile:PT_1_01
 * Java type: stockFilePT101.StockDocument
 *
 * Automatically generated - do not modify.
 */
package stockFilePT101.impl;
/**
 * A document containing one Stock(@urn:StockFile:PT_1_01) element.
 *
 * This is a complex type.
 */
public class StockDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements stockFilePT101.StockDocument
{
    private static final long serialVersionUID = 1L;
    
    public StockDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STOCK$0 = 
        new javax.xml.namespace.QName("urn:StockFile:PT_1_01", "Stock");
    
    
    /**
     * Gets the "Stock" element
     */
    public stockFilePT101.StockDocument.Stock getStock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            stockFilePT101.StockDocument.Stock target = null;
            target = (stockFilePT101.StockDocument.Stock)get_store().find_element_user(STOCK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Stock" element
     */
    public void setStock(stockFilePT101.StockDocument.Stock stock)
    {
        generatedSetterHelperImpl(stock, STOCK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Stock" element
     */
    public stockFilePT101.StockDocument.Stock addNewStock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            stockFilePT101.StockDocument.Stock target = null;
            target = (stockFilePT101.StockDocument.Stock)get_store().add_element_user(STOCK$0);
            return target;
        }
    }
    /**
     * An XML Stock(@urn:StockFile:PT_1_01).
     *
     * This is a complex type.
     */
    public static class StockImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements stockFilePT101.StockDocument.Stock
    {
        private static final long serialVersionUID = 1L;
        
        public StockImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PRODUCTCATEGORY$0 = 
            new javax.xml.namespace.QName("urn:StockFile:PT_1_01", "ProductCategory");
        private static final javax.xml.namespace.QName PRODUCTCODE$2 = 
            new javax.xml.namespace.QName("urn:StockFile:PT_1_01", "ProductCode");
        private static final javax.xml.namespace.QName PRODUCTDESCRIPTION$4 = 
            new javax.xml.namespace.QName("urn:StockFile:PT_1_01", "ProductDescription");
        private static final javax.xml.namespace.QName PRODUCTNUMBERCODE$6 = 
            new javax.xml.namespace.QName("urn:StockFile:PT_1_01", "ProductNumberCode");
        private static final javax.xml.namespace.QName CLOSINGSTOCKQUANTITY$8 = 
            new javax.xml.namespace.QName("urn:StockFile:PT_1_01", "ClosingStockQuantity");
        private static final javax.xml.namespace.QName UNITOFMEASURE$10 = 
            new javax.xml.namespace.QName("urn:StockFile:PT_1_01", "UnitOfMeasure");
        
        
        /**
         * Gets the "ProductCategory" element
         */
        public stockFilePT101.ProductCategoryDocument.ProductCategory.Enum getProductCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCATEGORY$0, 0);
                if (target == null)
                {
                    return null;
                }
                return (stockFilePT101.ProductCategoryDocument.ProductCategory.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "ProductCategory" element
         */
        public stockFilePT101.ProductCategoryDocument.ProductCategory xgetProductCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                stockFilePT101.ProductCategoryDocument.ProductCategory target = null;
                target = (stockFilePT101.ProductCategoryDocument.ProductCategory)get_store().find_element_user(PRODUCTCATEGORY$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ProductCategory" element
         */
        public void setProductCategory(stockFilePT101.ProductCategoryDocument.ProductCategory.Enum productCategory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCATEGORY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTCATEGORY$0);
                }
                target.setEnumValue(productCategory);
            }
        }
        
        /**
         * Sets (as xml) the "ProductCategory" element
         */
        public void xsetProductCategory(stockFilePT101.ProductCategoryDocument.ProductCategory productCategory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                stockFilePT101.ProductCategoryDocument.ProductCategory target = null;
                target = (stockFilePT101.ProductCategoryDocument.ProductCategory)get_store().find_element_user(PRODUCTCATEGORY$0, 0);
                if (target == null)
                {
                    target = (stockFilePT101.ProductCategoryDocument.ProductCategory)get_store().add_element_user(PRODUCTCATEGORY$0);
                }
                target.set(productCategory);
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
        public stockFilePT101.SAFPTtextTypeMandatoryMax60Car xgetProductCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                stockFilePT101.SAFPTtextTypeMandatoryMax60Car target = null;
                target = (stockFilePT101.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(PRODUCTCODE$2, 0);
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
        public void xsetProductCode(stockFilePT101.SAFPTtextTypeMandatoryMax60Car productCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                stockFilePT101.SAFPTtextTypeMandatoryMax60Car target = null;
                target = (stockFilePT101.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(PRODUCTCODE$2, 0);
                if (target == null)
                {
                    target = (stockFilePT101.SAFPTtextTypeMandatoryMax60Car)get_store().add_element_user(PRODUCTCODE$2);
                }
                target.set(productCode);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTDESCRIPTION$4, 0);
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
        public stockFilePT101.SAFPTtextTypeMandatoryMax200Car xgetProductDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                stockFilePT101.SAFPTtextTypeMandatoryMax200Car target = null;
                target = (stockFilePT101.SAFPTtextTypeMandatoryMax200Car)get_store().find_element_user(PRODUCTDESCRIPTION$4, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTDESCRIPTION$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTDESCRIPTION$4);
                }
                target.setStringValue(productDescription);
            }
        }
        
        /**
         * Sets (as xml) the "ProductDescription" element
         */
        public void xsetProductDescription(stockFilePT101.SAFPTtextTypeMandatoryMax200Car productDescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                stockFilePT101.SAFPTtextTypeMandatoryMax200Car target = null;
                target = (stockFilePT101.SAFPTtextTypeMandatoryMax200Car)get_store().find_element_user(PRODUCTDESCRIPTION$4, 0);
                if (target == null)
                {
                    target = (stockFilePT101.SAFPTtextTypeMandatoryMax200Car)get_store().add_element_user(PRODUCTDESCRIPTION$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTNUMBERCODE$6, 0);
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
        public stockFilePT101.SAFPTtextTypeMandatoryMax60Car xgetProductNumberCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                stockFilePT101.SAFPTtextTypeMandatoryMax60Car target = null;
                target = (stockFilePT101.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(PRODUCTNUMBERCODE$6, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTNUMBERCODE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTNUMBERCODE$6);
                }
                target.setStringValue(productNumberCode);
            }
        }
        
        /**
         * Sets (as xml) the "ProductNumberCode" element
         */
        public void xsetProductNumberCode(stockFilePT101.SAFPTtextTypeMandatoryMax60Car productNumberCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                stockFilePT101.SAFPTtextTypeMandatoryMax60Car target = null;
                target = (stockFilePT101.SAFPTtextTypeMandatoryMax60Car)get_store().find_element_user(PRODUCTNUMBERCODE$6, 0);
                if (target == null)
                {
                    target = (stockFilePT101.SAFPTtextTypeMandatoryMax60Car)get_store().add_element_user(PRODUCTNUMBERCODE$6);
                }
                target.set(productNumberCode);
            }
        }
        
        /**
         * Gets the "ClosingStockQuantity" element
         */
        public java.math.BigDecimal getClosingStockQuantity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSINGSTOCKQUANTITY$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "ClosingStockQuantity" element
         */
        public stockFilePT101.SAFdecimalType xgetClosingStockQuantity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                stockFilePT101.SAFdecimalType target = null;
                target = (stockFilePT101.SAFdecimalType)get_store().find_element_user(CLOSINGSTOCKQUANTITY$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ClosingStockQuantity" element
         */
        public void setClosingStockQuantity(java.math.BigDecimal closingStockQuantity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSINGSTOCKQUANTITY$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLOSINGSTOCKQUANTITY$8);
                }
                target.setBigDecimalValue(closingStockQuantity);
            }
        }
        
        /**
         * Sets (as xml) the "ClosingStockQuantity" element
         */
        public void xsetClosingStockQuantity(stockFilePT101.SAFdecimalType closingStockQuantity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                stockFilePT101.SAFdecimalType target = null;
                target = (stockFilePT101.SAFdecimalType)get_store().find_element_user(CLOSINGSTOCKQUANTITY$8, 0);
                if (target == null)
                {
                    target = (stockFilePT101.SAFdecimalType)get_store().add_element_user(CLOSINGSTOCKQUANTITY$8);
                }
                target.set(closingStockQuantity);
            }
        }
        
        /**
         * Gets the "UnitOfMeasure" element
         */
        public java.lang.String getUnitOfMeasure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITOFMEASURE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "UnitOfMeasure" element
         */
        public stockFilePT101.SAFPTtextTypeMandatoryMax20Car xgetUnitOfMeasure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                stockFilePT101.SAFPTtextTypeMandatoryMax20Car target = null;
                target = (stockFilePT101.SAFPTtextTypeMandatoryMax20Car)get_store().find_element_user(UNITOFMEASURE$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "UnitOfMeasure" element
         */
        public void setUnitOfMeasure(java.lang.String unitOfMeasure)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITOFMEASURE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNITOFMEASURE$10);
                }
                target.setStringValue(unitOfMeasure);
            }
        }
        
        /**
         * Sets (as xml) the "UnitOfMeasure" element
         */
        public void xsetUnitOfMeasure(stockFilePT101.SAFPTtextTypeMandatoryMax20Car unitOfMeasure)
        {
            synchronized (monitor())
            {
                check_orphaned();
                stockFilePT101.SAFPTtextTypeMandatoryMax20Car target = null;
                target = (stockFilePT101.SAFPTtextTypeMandatoryMax20Car)get_store().find_element_user(UNITOFMEASURE$10, 0);
                if (target == null)
                {
                    target = (stockFilePT101.SAFPTtextTypeMandatoryMax20Car)get_store().add_element_user(UNITOFMEASURE$10);
                }
                target.set(unitOfMeasure);
            }
        }
    }
}
