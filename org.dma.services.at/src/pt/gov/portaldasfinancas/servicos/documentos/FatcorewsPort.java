
package pt.gov.portaldasfinancas.servicos.documentos;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "fatcorewsPort", targetNamespace = "http://factemi.at.min_financas.pt/documents")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FatcorewsPort {


    /**
     * 
     * @param registerInvoiceRequest
     * @return
     *     returns pt.min_financas.at.factemi.documents.RegisterInvoiceResponse
     */
    @WebMethod(operationName = "RegisterInvoice")
    @WebResult(name = "RegisterInvoiceResponse", targetNamespace = "http://factemi.at.min_financas.pt/documents", partName = "RegisterInvoiceResponse")
    public RegisterInvoiceResponse registerInvoice(
        @WebParam(name = "RegisterInvoiceRequest", targetNamespace = "http://factemi.at.min_financas.pt/documents", partName = "RegisterInvoiceRequest")
        RegisterInvoiceRequest registerInvoiceRequest);

    /**
     * 
     * @param changeInvoiceStatusRequest
     * @return
     *     returns pt.min_financas.at.factemi.documents.ChangeInvoiceStatusResponse
     */
    @WebMethod(operationName = "ChangeInvoiceStatus")
    @WebResult(name = "ChangeInvoiceStatusResponse", targetNamespace = "http://factemi.at.min_financas.pt/documents", partName = "ChangeInvoiceStatusResponse")
    public ChangeInvoiceStatusResponse changeInvoiceStatus(
        @WebParam(name = "ChangeInvoiceStatusRequest", targetNamespace = "http://factemi.at.min_financas.pt/documents", partName = "ChangeInvoiceStatusRequest")
        ChangeInvoiceStatusRequest changeInvoiceStatusRequest);

    /**
     * 
     * @param deleteInvoiceRequest
     * @return
     *     returns pt.min_financas.at.factemi.documents.DeleteInvoiceResponse
     */
    @WebMethod(operationName = "DeleteInvoice")
    @WebResult(name = "DeleteInvoiceResponse", targetNamespace = "http://factemi.at.min_financas.pt/documents", partName = "DeleteInvoiceResponse")
    public DeleteInvoiceResponse deleteInvoice(
        @WebParam(name = "DeleteInvoiceRequest", targetNamespace = "http://factemi.at.min_financas.pt/documents", partName = "DeleteInvoiceRequest")
        DeleteInvoiceRequest deleteInvoiceRequest);

    /**
     * 
     * @param registerWorkRequest
     * @return
     *     returns pt.min_financas.at.factemi.documents.RegisterWorkResponse
     */
    @WebMethod(operationName = "RegisterWork")
    @WebResult(name = "RegisterWorkResponse", targetNamespace = "http://factemi.at.min_financas.pt/documents", partName = "RegisterWorkResponse")
    public RegisterWorkResponse registerWork(
        @WebParam(name = "RegisterWorkRequest", targetNamespace = "http://factemi.at.min_financas.pt/documents", partName = "RegisterWorkRequest")
        RegisterWorkRequest registerWorkRequest);

    /**
     * 
     * @param changeWorkStatusRequest
     * @return
     *     returns pt.min_financas.at.factemi.documents.ChangeWorkStatusResponse
     */
    @WebMethod(operationName = "ChangeWorkStatus")
    @WebResult(name = "ChangeWorkStatusResponse", targetNamespace = "http://factemi.at.min_financas.pt/documents", partName = "ChangeWorkStatusResponse")
    public ChangeWorkStatusResponse changeWorkStatus(
        @WebParam(name = "ChangeWorkStatusRequest", targetNamespace = "http://factemi.at.min_financas.pt/documents", partName = "ChangeWorkStatusRequest")
        ChangeWorkStatusRequest changeWorkStatusRequest);

    /**
     * 
     * @param deleteWorkRequest
     * @return
     *     returns pt.min_financas.at.factemi.documents.DeleteWorkResponse
     */
    @WebMethod(operationName = "DeleteWork")
    @WebResult(name = "DeleteWorkResponse", targetNamespace = "http://factemi.at.min_financas.pt/documents", partName = "DeleteWorkResponse")
    public DeleteWorkResponse deleteWork(
        @WebParam(name = "DeleteWorkRequest", targetNamespace = "http://factemi.at.min_financas.pt/documents", partName = "DeleteWorkRequest")
        DeleteWorkRequest deleteWorkRequest);

    /**
     * 
     * @param registerPaymentRequest
     * @return
     *     returns pt.min_financas.at.factemi.documents.RegisterPaymentResponse
     */
    @WebMethod(operationName = "RegisterPayment")
    @WebResult(name = "RegisterPaymentResponse", targetNamespace = "http://factemi.at.min_financas.pt/documents", partName = "RegisterPaymentResponse")
    public RegisterPaymentResponse registerPayment(
        @WebParam(name = "RegisterPaymentRequest", targetNamespace = "http://factemi.at.min_financas.pt/documents", partName = "RegisterPaymentRequest")
        RegisterPaymentRequest registerPaymentRequest);

    /**
     * 
     * @param changePaymentStatusRequest
     * @return
     *     returns pt.min_financas.at.factemi.documents.ChangePaymentStatusResponse
     */
    @WebMethod(operationName = "ChangePaymentStatus")
    @WebResult(name = "ChangePaymentStatusResponse", targetNamespace = "http://factemi.at.min_financas.pt/documents", partName = "ChangePaymentStatusResponse")
    public ChangePaymentStatusResponse changePaymentStatus(
        @WebParam(name = "ChangePaymentStatusRequest", targetNamespace = "http://factemi.at.min_financas.pt/documents", partName = "ChangePaymentStatusRequest")
        ChangePaymentStatusRequest changePaymentStatusRequest);

    /**
     * 
     * @param deletePaymentRequest
     * @return
     *     returns pt.min_financas.at.factemi.documents.DeletePaymentResponse
     */
    @WebMethod(operationName = "DeletePayment")
    @WebResult(name = "DeletePaymentResponse", targetNamespace = "http://factemi.at.min_financas.pt/documents", partName = "DeletePaymentResponse")
    public DeletePaymentResponse deletePayment(
        @WebParam(name = "DeletePaymentRequest", targetNamespace = "http://factemi.at.min_financas.pt/documents", partName = "DeletePaymentRequest")
        DeletePaymentRequest deletePaymentRequest);

}
