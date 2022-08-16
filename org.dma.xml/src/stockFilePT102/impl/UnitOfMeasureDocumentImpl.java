/*
 * An XML document type.
 * Localname: UnitOfMeasure
 * Namespace: urn:StockFile:PT_1_02
 * Java type: stockFilePT102.UnitOfMeasureDocument
 *
 * Automatically generated - do not modify.
 */
package stockFilePT102.impl;
/**
 * A document containing one UnitOfMeasure(@urn:StockFile:PT_1_02) element.
 *
 * This is a complex type.
 */
public class UnitOfMeasureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements stockFilePT102.UnitOfMeasureDocument
{
    private static final long serialVersionUID = 1L;
    
    public UnitOfMeasureDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNITOFMEASURE$0 = 
        new javax.xml.namespace.QName("urn:StockFile:PT_1_02", "UnitOfMeasure");
    
    
    /**
     * Gets the "UnitOfMeasure" element
     */
    public java.lang.String getUnitOfMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITOFMEASURE$0, 0);
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
    public stockFilePT102.SAFPTtextTypeMandatoryMax20Car xgetUnitOfMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            stockFilePT102.SAFPTtextTypeMandatoryMax20Car target = null;
            target = (stockFilePT102.SAFPTtextTypeMandatoryMax20Car)get_store().find_element_user(UNITOFMEASURE$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITOFMEASURE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNITOFMEASURE$0);
            }
            target.setStringValue(unitOfMeasure);
        }
    }
    
    /**
     * Sets (as xml) the "UnitOfMeasure" element
     */
    public void xsetUnitOfMeasure(stockFilePT102.SAFPTtextTypeMandatoryMax20Car unitOfMeasure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            stockFilePT102.SAFPTtextTypeMandatoryMax20Car target = null;
            target = (stockFilePT102.SAFPTtextTypeMandatoryMax20Car)get_store().find_element_user(UNITOFMEASURE$0, 0);
            if (target == null)
            {
                target = (stockFilePT102.SAFPTtextTypeMandatoryMax20Car)get_store().add_element_user(UNITOFMEASURE$0);
            }
            target.set(unitOfMeasure);
        }
    }
}
