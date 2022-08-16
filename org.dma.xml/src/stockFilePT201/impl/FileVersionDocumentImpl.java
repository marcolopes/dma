/*
 * An XML document type.
 * Localname: FileVersion
 * Namespace: urn:StockFile:PT_2_01
 * Java type: stockFilePT201.FileVersionDocument
 *
 * Automatically generated - do not modify.
 */
package stockFilePT201.impl;
/**
 * A document containing one FileVersion(@urn:StockFile:PT_2_01) element.
 *
 * This is a complex type.
 */
public class FileVersionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements stockFilePT201.FileVersionDocument
{
    private static final long serialVersionUID = 1L;
    
    public FileVersionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILEVERSION$0 = 
        new javax.xml.namespace.QName("urn:StockFile:PT_2_01", "FileVersion");
    
    
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
    public stockFilePT201.FileVersionDocument.FileVersion xgetFileVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            stockFilePT201.FileVersionDocument.FileVersion target = null;
            target = (stockFilePT201.FileVersionDocument.FileVersion)get_store().find_element_user(FILEVERSION$0, 0);
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
    public void xsetFileVersion(stockFilePT201.FileVersionDocument.FileVersion fileVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            stockFilePT201.FileVersionDocument.FileVersion target = null;
            target = (stockFilePT201.FileVersionDocument.FileVersion)get_store().find_element_user(FILEVERSION$0, 0);
            if (target == null)
            {
                target = (stockFilePT201.FileVersionDocument.FileVersion)get_store().add_element_user(FILEVERSION$0);
            }
            target.set(fileVersion);
        }
    }
    /**
     * An XML FileVersion(@urn:StockFile:PT_2_01).
     *
     * This is an atomic type that is a restriction of stockFilePT201.FileVersionDocument$FileVersion.
     */
    public static class FileVersionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements stockFilePT201.FileVersionDocument.FileVersion
    {
        private static final long serialVersionUID = 1L;
        
        public FileVersionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected FileVersionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
