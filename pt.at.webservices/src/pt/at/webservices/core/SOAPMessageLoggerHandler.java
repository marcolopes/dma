package pt.at.webservices.core;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.Set;
import java.util.logging.Logger;

/**
 * Logger handler para mensagem SOAP, wue intercepta comunicações e insere os envelopes enviados e recebidos na UI.
 *
 * @author ricardo
 */
public class SOAPMessageLoggerHandler implements SOAPHandler<SOAPMessageContext> {

    private Logger logger;

    public SOAPMessageLoggerHandler(Logger logger) {
        this.logger = logger;
    }

    public Set<QName> getHeaders() {
        return null;
    }

    public boolean handleMessage(SOAPMessageContext smc) {
        interceptAndRecordSoapMessageContext(smc);
        return true;
    }

    public boolean handleFault(SOAPMessageContext smc) {
        interceptAndRecordSoapMessageContext(smc);
        return true;
    }

    // nothing to clean up
    public void close(MessageContext messageContext) {
    }

    private void interceptAndRecordSoapMessageContext(SOAPMessageContext smc) {
        Logger messageLogger = this.logger;
        SOAPMessage message = smc.getMessage();
        try {
            SOAPPart soapPart = message.getSOAPPart();
            Source source = soapPart.getContent();
            messageLogger.info(((Boolean) smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY) ? "\n>>>SENT<<<\n" : "\n>>>RECEIVED<<<\n")
                    + sourceToXMLString(source));
        } catch (Exception e) {
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            String stacktrace = sw.toString();
            logger.severe("Could not intercept and log soap message\n\n" + stacktrace);
        }
    }

    private String sourceToXMLString(Source result) throws TransformerConfigurationException, TransformerException, UnsupportedEncodingException {

        String xmlResult = null;
        try {
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer();
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty(OutputKeys.ENCODING, "utf-8");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            transformer.transform(result, new StreamResult(out));
            xmlResult = out.toString("UTF-8");
        } catch (TransformerException e) {
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            String stacktrace = sw.toString();
            logger.severe("Could not intercept and log soap message\n\n" + stacktrace);
        }
        return xmlResult;
    }
}

