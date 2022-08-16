/*
 * An XML document type.
 * Localname: TransactionType
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1;


/**
 * A document containing one TransactionType(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public interface TransactionTypeDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TransactionTypeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25593249777A7B590168EB7C07CF83EB").resolveHandle("transactiontypee45fdoctype");
    
    /**
     * Gets the "TransactionType" element
     */
    x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument.TransactionType.Enum getTransactionType();
    
    /**
     * Gets (as xml) the "TransactionType" element
     */
    x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument.TransactionType xgetTransactionType();
    
    /**
     * Sets the "TransactionType" element
     */
    void setTransactionType(x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument.TransactionType.Enum transactionType);
    
    /**
     * Sets (as xml) the "TransactionType" element
     */
    void xsetTransactionType(x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument.TransactionType transactionType);
    
    /**
     * An XML TransactionType(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
     *
     * This is an atomic type that is a restriction of x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument$TransactionType.
     */
    public interface TransactionType extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TransactionType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25593249777A7B590168EB7C07CF83EB").resolveHandle("transactiontypec9e3elemtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum N = Enum.forString("N");
        static final Enum R = Enum.forString("R");
        static final Enum A = Enum.forString("A");
        static final Enum J = Enum.forString("J");
        
        static final int INT_N = Enum.INT_N;
        static final int INT_R = Enum.INT_R;
        static final int INT_A = Enum.INT_A;
        static final int INT_J = Enum.INT_J;
        
        /**
         * Enumeration value class for x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument$TransactionType.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_N
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
            
            static final int INT_N = 1;
            static final int INT_R = 2;
            static final int INT_A = 3;
            static final int INT_J = 4;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("N", INT_N),
                    new Enum("R", INT_R),
                    new Enum("A", INT_A),
                    new Enum("J", INT_J),
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
            public static x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument.TransactionType newValue(java.lang.Object obj) {
              return (x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument.TransactionType) type.newValue( obj ); }
            
            public static x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument.TransactionType newInstance() {
              return (x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument.TransactionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument.TransactionType newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument.TransactionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument newInstance() {
          return (x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0401.oecdStandardAuditFileTaxPT1.TransactionTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
