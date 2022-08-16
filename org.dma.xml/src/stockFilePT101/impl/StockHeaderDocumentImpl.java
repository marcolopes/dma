/*
 * An XML document type.
 * Localname: StockHeader
 * Namespace: urn:StockFile:PT_1_01
 * Java type: stockFilePT101.StockHeaderDocument
 *
 * Automatically generated - do not modify.
 */
package stockFilePT101.impl;
/**
 * A document containing one StockHeader(@urn:StockFile:PT_1_01) element.
 *
 * This is a complex type.
 */
public class StockHeaderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements stockFilePT101.StockHeaderDocument
{
    private static final long serialVersionUID = 1L;
    
    public StockHeaderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STOCKHEADER$0 = 
        new javax.xml.namespace.QName("urn:StockFile:PT_1_01", "StockHeader");
    
    
    /**
     * Gets the "StockHeader" element
     */
    public stockFilePT101.StockHeaderDocument.StockHeader getStockHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            stockFilePT101.StockHeaderDocument.StockHeader target = null;
            target = (stockFilePT101.StockHeaderDocument.StockHeader)get_store().find_element_user(STOCKHEADER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StockHeader" element
     */
    public void setStockHeader(stockFilePT101.StockHeaderDocument.StockHeader stockHeader)
    {
        generatedSetterHelperImpl(stockHeader, STOCKHEADER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "StockHeader" element
     */
    public stockFilePT101.StockHeaderDocument.StockHeader addNewStockHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            stockFilePT101.StockHeaderDocument.StockHeader target = null;
            target = (stockFilePT101.StockHeaderDocument.StockHeader)get_store().add_element_user(STOCKHEADER$0);
            return target;
        }
    }
    /**
     * An XML StockHeader(@urn:StockFile:PT_1_01).
     *
     * This is a complex type.
     */
    public static class StockHeaderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements stockFilePT101.StockHeaderDocument.StockHeader
    {
        private static final long serialVersionUID = 1L;
        
        public StockHeaderImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FILEVERSION$0 = 
            new javax.xml.namespace.QName("urn:StockFile:PT_1_01", "FileVersion");
        private static final javax.xml.namespace.QName TAXREGISTRATIONNUMBER$2 = 
            new javax.xml.namespace.QName("urn:StockFile:PT_1_01", "TaxRegistrationNumber");
        private static final javax.xml.namespace.QName FISCALYEAR$4 = 
            new javax.xml.namespace.QName("urn:StockFile:PT_1_01", "FiscalYear");
        private static final javax.xml.namespace.QName ENDDATE$6 = 
            new javax.xml.namespace.QName("urn:StockFile:PT_1_01", "EndDate");
        private static final javax.xml.namespace.QName NOSTOCK$8 = 
            new javax.xml.namespace.QName("urn:StockFile:PT_1_01", "NoStock");
        
        
        /**
         * Gets the "FileVersion" element
         */
        public java.lang.String getFileVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILEVERSION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "FileVersion" element
         */
        public stockFilePT101.FileVersionDocument.FileVersion xgetFileVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                stockFilePT101.FileVersionDocument.FileVersion target = null;
                target = (stockFilePT101.FileVersionDocument.FileVersion)get_store().find_element_user(FILEVERSION$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "FileVersion" element
         */
        public void setFileVersion(java.lang.String fileVersion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILEVERSION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILEVERSION$0);
                }
                target.setStringValue(fileVersion);
            }
        }
        
        /**
         * Sets (as xml) the "FileVersion" element
         */
        public void xsetFileVersion(stockFilePT101.FileVersionDocument.FileVersion fileVersion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                stockFilePT101.FileVersionDocument.FileVersion target = null;
                target = (stockFilePT101.FileVersionDocument.FileVersion)get_store().find_element_user(FILEVERSION$0, 0);
                if (target == null)
                {
                    target = (stockFilePT101.FileVersionDocument.FileVersion)get_store().add_element_user(FILEVERSION$0);
                }
                target.set(fileVersion);
            }
        }
        
        /**
         * Gets the "TaxRegistrationNumber" element
         */
        public int getTaxRegistrationNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXREGISTRATIONNUMBER$2, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "TaxRegistrationNumber" element
         */
        public stockFilePT101.SAFPTPortugueseVatNumber xgetTaxRegistrationNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                stockFilePT101.SAFPTPortugueseVatNumber target = null;
                target = (stockFilePT101.SAFPTPortugueseVatNumber)get_store().find_element_user(TAXREGISTRATIONNUMBER$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "TaxRegistrationNumber" element
         */
        public void setTaxRegistrationNumber(int taxRegistrationNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXREGISTRATIONNUMBER$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXREGISTRATIONNUMBER$2);
                }
                target.setIntValue(taxRegistrationNumber);
            }
        }
        
        /**
         * Sets (as xml) the "TaxRegistrationNumber" element
         */
        public void xsetTaxRegistrationNumber(stockFilePT101.SAFPTPortugueseVatNumber taxRegistrationNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                stockFilePT101.SAFPTPortugueseVatNumber target = null;
                target = (stockFilePT101.SAFPTPortugueseVatNumber)get_store().find_element_user(TAXREGISTRATIONNUMBER$2, 0);
                if (target == null)
                {
                    target = (stockFilePT101.SAFPTPortugueseVatNumber)get_store().add_element_user(TAXREGISTRATIONNUMBER$2);
                }
                target.set(taxRegistrationNumber);
            }
        }
        
        /**
         * Gets the "FiscalYear" element
         */
        public int getFiscalYear()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FISCALYEAR$4, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "FiscalYear" element
         */
        public stockFilePT101.FiscalYearDocument.FiscalYear xgetFiscalYear()
        {
            synchronized (monitor())
            {
                check_orphaned();
                stockFilePT101.FiscalYearDocument.FiscalYear target = null;
                target = (stockFilePT101.FiscalYearDocument.FiscalYear)get_store().find_element_user(FISCALYEAR$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "FiscalYear" element
         */
        public void setFiscalYear(int fiscalYear)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FISCALYEAR$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FISCALYEAR$4);
                }
                target.setIntValue(fiscalYear);
            }
        }
        
        /**
         * Sets (as xml) the "FiscalYear" element
         */
        public void xsetFiscalYear(stockFilePT101.FiscalYearDocument.FiscalYear fiscalYear)
        {
            synchronized (monitor())
            {
                check_orphaned();
                stockFilePT101.FiscalYearDocument.FiscalYear target = null;
                target = (stockFilePT101.FiscalYearDocument.FiscalYear)get_store().find_element_user(FISCALYEAR$4, 0);
                if (target == null)
                {
                    target = (stockFilePT101.FiscalYearDocument.FiscalYear)get_store().add_element_user(FISCALYEAR$4);
                }
                target.set(fiscalYear);
            }
        }
        
        /**
         * Gets the "EndDate" element
         */
        public java.util.Calendar getEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "EndDate" element
         */
        public stockFilePT101.SAFPTDateSpan xgetEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                stockFilePT101.SAFPTDateSpan target = null;
                target = (stockFilePT101.SAFPTDateSpan)get_store().find_element_user(ENDDATE$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "EndDate" element
         */
        public void setEndDate(java.util.Calendar endDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDDATE$6);
                }
                target.setCalendarValue(endDate);
            }
        }
        
        /**
         * Sets (as xml) the "EndDate" element
         */
        public void xsetEndDate(stockFilePT101.SAFPTDateSpan endDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                stockFilePT101.SAFPTDateSpan target = null;
                target = (stockFilePT101.SAFPTDateSpan)get_store().find_element_user(ENDDATE$6, 0);
                if (target == null)
                {
                    target = (stockFilePT101.SAFPTDateSpan)get_store().add_element_user(ENDDATE$6);
                }
                target.set(endDate);
            }
        }
        
        /**
         * Gets the "NoStock" element
         */
        public boolean getNoStock()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOSTOCK$8, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "NoStock" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetNoStock()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(NOSTOCK$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "NoStock" element
         */
        public void setNoStock(boolean noStock)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOSTOCK$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOSTOCK$8);
                }
                target.setBooleanValue(noStock);
            }
        }
        
        /**
         * Sets (as xml) the "NoStock" element
         */
        public void xsetNoStock(org.apache.xmlbeans.XmlBoolean noStock)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(NOSTOCK$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(NOSTOCK$8);
                }
                target.set(noStock);
            }
        }
    }
}
