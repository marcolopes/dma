
package ifthenpay.mbws;

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
@WebService(name = "IfmbWSHttpGet", targetNamespace = "https://www.ifthenpay.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IfmbWSHttpGet {


    /**
     * 
     * @param chavebackoffice
     * @param dtHrInicio
     * @param valor
     * @param dtHrFim
     * @param subentidade
     * @param entidade
     * @param referencia
     * @return
     *     returns https.www_ifthenpay.ArrayOfIfmb
     */
    @WebMethod
    @WebResult(name = "Body", partName = "Body")
    public ArrayOfIfmb getPayments(
        @WebParam(name = "chavebackoffice", partName = "chavebackoffice")
        String chavebackoffice,
        @WebParam(name = "entidade", partName = "entidade")
        String entidade,
        @WebParam(name = "subentidade", partName = "subentidade")
        String subentidade,
        @WebParam(name = "dtHrInicio", partName = "dtHrInicio")
        String dtHrInicio,
        @WebParam(name = "dtHrFim", partName = "dtHrFim")
        String dtHrFim,
        @WebParam(name = "referencia", partName = "referencia")
        String referencia,
        @WebParam(name = "valor", partName = "valor")
        String valor);

    /**
     * 
     * @param chavebackoffice
     * @param dtHrInicio
     * @param valor
     * @param sandbox
     * @param dtHrFim
     * @param subentidade
     * @param entidade
     * @param referencia
     * @return
     *     returns https.www_ifthenpay.ArrayOfIfmb
     */
    @WebMethod
    @WebResult(name = "Body", partName = "Body")
    public ArrayOfIfmb getPaymentsWithSandBox(
        @WebParam(name = "chavebackoffice", partName = "chavebackoffice")
        String chavebackoffice,
        @WebParam(name = "entidade", partName = "entidade")
        String entidade,
        @WebParam(name = "subentidade", partName = "subentidade")
        String subentidade,
        @WebParam(name = "dtHrInicio", partName = "dtHrInicio")
        String dtHrInicio,
        @WebParam(name = "dtHrFim", partName = "dtHrFim")
        String dtHrFim,
        @WebParam(name = "referencia", partName = "referencia")
        String referencia,
        @WebParam(name = "valor", partName = "valor")
        String valor,
        @WebParam(name = "sandbox", partName = "sandbox")
        String sandbox);

    /**
     * 
     * @param chavebackoffice
     * @param dtHrInicio
     * @param valor
     * @param dtHrFim
     * @param subentidade
     * @param entidade
     * @param referencia
     * @return
     *     returns https.www_ifthenpay.ArrayOfIfmb
     */
    @WebMethod
    @WebResult(name = "Body", partName = "Body")
    public ArrayOfIfmb getPaymentsXml(
        @WebParam(name = "chavebackoffice", partName = "chavebackoffice")
        String chavebackoffice,
        @WebParam(name = "entidade", partName = "entidade")
        String entidade,
        @WebParam(name = "subentidade", partName = "subentidade")
        String subentidade,
        @WebParam(name = "dtHrInicio", partName = "dtHrInicio")
        String dtHrInicio,
        @WebParam(name = "dtHrFim", partName = "dtHrFim")
        String dtHrFim,
        @WebParam(name = "referencia", partName = "referencia")
        String referencia,
        @WebParam(name = "valor", partName = "valor")
        String valor);

    /**
     * 
     * @param chavebackoffice
     * @param dtHrInicio
     * @param valor
     * @param sandbox
     * @param dtHrFim
     * @param subentidade
     * @param entidade
     * @param referencia
     * @return
     *     returns https.www_ifthenpay.ArrayOfIfmb
     */
    @WebMethod
    @WebResult(name = "Body", partName = "Body")
    public ArrayOfIfmb getPaymentsXmlWithSandBox(
        @WebParam(name = "chavebackoffice", partName = "chavebackoffice")
        String chavebackoffice,
        @WebParam(name = "entidade", partName = "entidade")
        String entidade,
        @WebParam(name = "subentidade", partName = "subentidade")
        String subentidade,
        @WebParam(name = "dtHrInicio", partName = "dtHrInicio")
        String dtHrInicio,
        @WebParam(name = "dtHrFim", partName = "dtHrFim")
        String dtHrFim,
        @WebParam(name = "referencia", partName = "referencia")
        String referencia,
        @WebParam(name = "valor", partName = "valor")
        String valor,
        @WebParam(name = "sandbox", partName = "sandbox")
        String sandbox);

    /**
     * 
     * @param chavebackoffice
     * @param dtHrInicio
     * @param valor
     * @param dtHrFim
     * @param subentidade
     * @param entidade
     * @param referencia
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "Body", partName = "Body")
    public String getPaymentsJson(
        @WebParam(name = "chavebackoffice", partName = "chavebackoffice")
        String chavebackoffice,
        @WebParam(name = "entidade", partName = "entidade")
        String entidade,
        @WebParam(name = "subentidade", partName = "subentidade")
        String subentidade,
        @WebParam(name = "dtHrInicio", partName = "dtHrInicio")
        String dtHrInicio,
        @WebParam(name = "dtHrFim", partName = "dtHrFim")
        String dtHrFim,
        @WebParam(name = "referencia", partName = "referencia")
        String referencia,
        @WebParam(name = "valor", partName = "valor")
        String valor);

    /**
     * 
     * @param chavebackoffice
     * @param dtHrInicio
     * @param valor
     * @param sandbox
     * @param dtHrFim
     * @param subentidade
     * @param entidade
     * @param referencia
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "Body", partName = "Body")
    public String getPaymentsJsonWithSandBox(
        @WebParam(name = "chavebackoffice", partName = "chavebackoffice")
        String chavebackoffice,
        @WebParam(name = "entidade", partName = "entidade")
        String entidade,
        @WebParam(name = "subentidade", partName = "subentidade")
        String subentidade,
        @WebParam(name = "dtHrInicio", partName = "dtHrInicio")
        String dtHrInicio,
        @WebParam(name = "dtHrFim", partName = "dtHrFim")
        String dtHrFim,
        @WebParam(name = "referencia", partName = "referencia")
        String referencia,
        @WebParam(name = "valor", partName = "valor")
        String valor,
        @WebParam(name = "sandbox", partName = "sandbox")
        String sandbox);

    /**
     * 
     * @param chavebackoffice
     * @return
     *     returns https.www_ifthenpay.ArrayOfIfmb
     */
    @WebMethod
    @WebResult(name = "Body", partName = "Body")
    public ArrayOfIfmb getEntidadeSubentidade(
        @WebParam(name = "chavebackoffice", partName = "chavebackoffice")
        String chavebackoffice);

    /**
     * 
     * @param chavebackoffice
     * @return
     *     returns https.www_ifthenpay.ArrayOfIfmb
     */
    @WebMethod
    @WebResult(name = "Body", partName = "Body")
    public ArrayOfIfmb getEntidadeSubentidadeXml(
        @WebParam(name = "chavebackoffice", partName = "chavebackoffice")
        String chavebackoffice);

    /**
     * 
     * @param chavebackoffice
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "Body", partName = "Body")
    public String getEntidadeSubentidadeJson(
        @WebParam(name = "chavebackoffice", partName = "chavebackoffice")
        String chavebackoffice);

    /**
     * 
     * @param chavebackoffice
     */
    @WebMethod
    public void getEntidadeSubentidadeJsonV2(
        @WebParam(name = "chavebackoffice", partName = "chavebackoffice")
        String chavebackoffice);

    /**
     * 
     * @param chavebackoffice
     * @param dtHrInicio
     * @param valor
     * @param sandbox
     * @param dtHrFim
     * @param subentidade
     * @param entidade
     * @param referencia
     */
    @WebMethod
    public void getPaymentsJsonV2(
        @WebParam(name = "chavebackoffice", partName = "chavebackoffice")
        String chavebackoffice,
        @WebParam(name = "entidade", partName = "entidade")
        String entidade,
        @WebParam(name = "subentidade", partName = "subentidade")
        String subentidade,
        @WebParam(name = "dtHrInicio", partName = "dtHrInicio")
        String dtHrInicio,
        @WebParam(name = "dtHrFim", partName = "dtHrFim")
        String dtHrFim,
        @WebParam(name = "referencia", partName = "referencia")
        String referencia,
        @WebParam(name = "valor", partName = "valor")
        String valor,
        @WebParam(name = "sandbox", partName = "sandbox")
        String sandbox);

    /**
     * 
     * @param chavebackoffice
     * @param dtHrInicio
     * @param valor
     * @param sandbox
     * @param dtHrFim
     * @param subentidade
     * @param entidade
     * @param referencia
     */
    @WebMethod
    public void getPaymentsJsonWithSandBoxV2(
        @WebParam(name = "chavebackoffice", partName = "chavebackoffice")
        String chavebackoffice,
        @WebParam(name = "entidade", partName = "entidade")
        String entidade,
        @WebParam(name = "subentidade", partName = "subentidade")
        String subentidade,
        @WebParam(name = "dtHrInicio", partName = "dtHrInicio")
        String dtHrInicio,
        @WebParam(name = "dtHrFim", partName = "dtHrFim")
        String dtHrFim,
        @WebParam(name = "referencia", partName = "referencia")
        String referencia,
        @WebParam(name = "valor", partName = "valor")
        String valor,
        @WebParam(name = "sandbox", partName = "sandbox")
        String sandbox);

}
