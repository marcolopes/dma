/*
 * An XML document type.
 * Localname: InvoiceType
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.03_01
 * Java type: x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument
 *
 * Automatically generated - do not modify.
 */
package x0301.oecdStandardAuditFileTaxPT1;


/**
 * A document containing one InvoiceType(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01) element.
 *
 * This is a complex type.
 */
public interface InvoiceTypeDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InvoiceTypeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB56920DEA176B941910A868497F4EE85").resolveHandle("invoicetype898fdoctype");
    
    /**
     * Gets the "InvoiceType" element
     */
    x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType.Enum getInvoiceType();
    
    /**
     * Gets (as xml) the "InvoiceType" element
     */
    x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType xgetInvoiceType();
    
    /**
     * Sets the "InvoiceType" element
     */
    void setInvoiceType(x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType.Enum invoiceType);
    
    /**
     * Sets (as xml) the "InvoiceType" element
     */
    void xsetInvoiceType(x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType invoiceType);
    
    /**
     * An XML InvoiceType(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
     *
     * This is an atomic type that is a restriction of x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument$InvoiceType.
     */
    public interface InvoiceType extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InvoiceType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB56920DEA176B941910A868497F4EE85").resolveHandle("invoicetype2ce2elemtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum FT = Enum.forString("FT");
        static final Enum FS = Enum.forString("FS");
        static final Enum FR = Enum.forString("FR");
        static final Enum ND = Enum.forString("ND");
        static final Enum NC = Enum.forString("NC");
        static final Enum VD = Enum.forString("VD");
        static final Enum TV = Enum.forString("TV");
        static final Enum TD = Enum.forString("TD");
        static final Enum AA = Enum.forString("AA");
        static final Enum DA = Enum.forString("DA");
        static final Enum RP = Enum.forString("RP");
        static final Enum RE = Enum.forString("RE");
        static final Enum CS = Enum.forString("CS");
        static final Enum LD = Enum.forString("LD");
        static final Enum RA = Enum.forString("RA");
        
        static final int INT_FT = Enum.INT_FT;
        static final int INT_FS = Enum.INT_FS;
        static final int INT_FR = Enum.INT_FR;
        static final int INT_ND = Enum.INT_ND;
        static final int INT_NC = Enum.INT_NC;
        static final int INT_VD = Enum.INT_VD;
        static final int INT_TV = Enum.INT_TV;
        static final int INT_TD = Enum.INT_TD;
        static final int INT_AA = Enum.INT_AA;
        static final int INT_DA = Enum.INT_DA;
        static final int INT_RP = Enum.INT_RP;
        static final int INT_RE = Enum.INT_RE;
        static final int INT_CS = Enum.INT_CS;
        static final int INT_LD = Enum.INT_LD;
        static final int INT_RA = Enum.INT_RA;
        
        /**
         * Enumeration value class for x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument$InvoiceType.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_FT
         * Enum.forString(s); // returns the enum value for a string
         * Enum.forInt(i); // returns the enum value for an int
         * </pre>
         * Enumeration objects are immutable singleton objects that
         * can be compared using == object equality. They have no
         * public constructor. See the constants defined within this
         * class for all the valid values.
         */
        static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
        {
            /**
             * Returns the enum value for a string, or null if none.
             */
            public static Enum forString(java.lang.String s)
                { return (Enum)table.forString(s); }
            /**
             * Returns the enum value corresponding to an int, or null if none.
             */
            public static Enum forInt(int i)
                { return (Enum)table.forInt(i); }
            
            private Enum(java.lang.String s, int i)
                { super(s, i); }
            
            static final int INT_FT = 1;
            static final int INT_FS = 2;
            static final int INT_FR = 3;
            static final int INT_ND = 4;
            static final int INT_NC = 5;
            static final int INT_VD = 6;
            static final int INT_TV = 7;
            static final int INT_TD = 8;
            static final int INT_AA = 9;
            static final int INT_DA = 10;
            static final int INT_RP = 11;
            static final int INT_RE = 12;
            static final int INT_CS = 13;
            static final int INT_LD = 14;
            static final int INT_RA = 15;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("FT", INT_FT),
                    new Enum("FS", INT_FS),
                    new Enum("FR", INT_FR),
                    new Enum("ND", INT_ND),
                    new Enum("NC", INT_NC),
                    new Enum("VD", INT_VD),
                    new Enum("TV", INT_TV),
                    new Enum("TD", INT_TD),
                    new Enum("AA", INT_AA),
                    new Enum("DA", INT_DA),
                    new Enum("RP", INT_RP),
                    new Enum("RE", INT_RE),
                    new Enum("CS", INT_CS),
                    new Enum("LD", INT_LD),
                    new Enum("RA", INT_RA),
                }
            );
            private static final long serialVersionUID = 1L;
            private java.lang.Object readResolve() { return forInt(intValue()); } 
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType newValue(java.lang.Object obj) {
              return (x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType) type.newValue( obj ); }
            
            public static x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType newInstance() {
              return (x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument.InvoiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument newInstance() {
          return (x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0301.oecdStandardAuditFileTaxPT1.InvoiceTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
