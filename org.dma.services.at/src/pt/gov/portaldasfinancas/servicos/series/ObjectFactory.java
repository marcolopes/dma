
package pt.gov.portaldasfinancas.servicos.series;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the pt.gov.portaldasfinancas.servicos.series package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AnularSerie_QNAME = new QName("http://at.gov.pt/", "anularSerie");
    private final static QName _ConsultarSeries_QNAME = new QName("http://at.gov.pt/", "consultarSeries");
    private final static QName _ConsultarSeriesResponse_QNAME = new QName("http://at.gov.pt/", "consultarSeriesResponse");
    private final static QName _AnularSerieResponse_QNAME = new QName("http://at.gov.pt/", "anularSerieResponse");
    private final static QName _FinalizarSerieResponse_QNAME = new QName("http://at.gov.pt/", "finalizarSerieResponse");
    private final static QName _RegistarSerie_QNAME = new QName("http://at.gov.pt/", "registarSerie");
    private final static QName _RegistarSerieResponse_QNAME = new QName("http://at.gov.pt/", "registarSerieResponse");
    private final static QName _FinalizarSerie_QNAME = new QName("http://at.gov.pt/", "finalizarSerie");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pt.gov.portaldasfinancas.servicos.series
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FinalizarSerie }
     *
     */
    public FinalizarSerie createFinalizarSerie() {
        return new FinalizarSerie();
    }

    /**
     * Create an instance of {@link RegistarSerieResponse }
     *
     */
    public RegistarSerieResponse createRegistarSerieResponse() {
        return new RegistarSerieResponse();
    }

    /**
     * Create an instance of {@link FinalizarSerieResponse }
     *
     */
    public FinalizarSerieResponse createFinalizarSerieResponse() {
        return new FinalizarSerieResponse();
    }

    /**
     * Create an instance of {@link AnularSerieResponse }
     *
     */
    public AnularSerieResponse createAnularSerieResponse() {
        return new AnularSerieResponse();
    }

    /**
     * Create an instance of {@link RegistarSerie }
     *
     */
    public RegistarSerie createRegistarSerie() {
        return new RegistarSerie();
    }

    /**
     * Create an instance of {@link AnularSerie }
     *
     */
    public AnularSerie createAnularSerie() {
        return new AnularSerie();
    }

    /**
     * Create an instance of {@link ConsultarSeriesResponse }
     *
     */
    public ConsultarSeriesResponse createConsultarSeriesResponse() {
        return new ConsultarSeriesResponse();
    }

    /**
     * Create an instance of {@link ConsultarSeries }
     *
     */
    public ConsultarSeries createConsultarSeries() {
        return new ConsultarSeries();
    }

    /**
     * Create an instance of {@link OperationResultInfo }
     *
     */
    public OperationResultInfo createOperationResultInfo() {
        return new OperationResultInfo();
    }

    /**
     * Create an instance of {@link SeriesResp }
     *
     */
    public SeriesResp createSeriesResp() {
        return new SeriesResp();
    }

    /**
     * Create an instance of {@link SeriesInfo }
     *
     */
    public SeriesInfo createSeriesInfo() {
        return new SeriesInfo();
    }

    /**
     * Create an instance of {@link ConsultarSeriesResp }
     *
     */
    public ConsultarSeriesResp createConsultSeriesResp() {
        return new ConsultarSeriesResp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnularSerie }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://at.gov.pt/", name = "anularSerie")
    public JAXBElement<AnularSerie> createAnularSerie(AnularSerie value) {
        return new JAXBElement<AnularSerie>(_AnularSerie_QNAME, AnularSerie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarSeries }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://at.gov.pt/", name = "consultarSeries")
    public JAXBElement<ConsultarSeries> createConsultarSeries(ConsultarSeries value) {
        return new JAXBElement<ConsultarSeries>(_ConsultarSeries_QNAME, ConsultarSeries.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarSeriesResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://at.gov.pt/", name = "consultarSeriesResponse")
    public JAXBElement<ConsultarSeriesResponse> createConsultarSeriesResponse(ConsultarSeriesResponse value) {
        return new JAXBElement<ConsultarSeriesResponse>(_ConsultarSeriesResponse_QNAME, ConsultarSeriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnularSerieResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://at.gov.pt/", name = "anularSerieResponse")
    public JAXBElement<AnularSerieResponse> createAnularSerieResponse(AnularSerieResponse value) {
        return new JAXBElement<AnularSerieResponse>(_AnularSerieResponse_QNAME, AnularSerieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinalizarSerieResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://at.gov.pt/", name = "finalizarSerieResponse")
    public JAXBElement<FinalizarSerieResponse> createFinalizarSerieResponse(FinalizarSerieResponse value) {
        return new JAXBElement<FinalizarSerieResponse>(_FinalizarSerieResponse_QNAME, FinalizarSerieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistarSerie }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://at.gov.pt/", name = "registarSerie")
    public JAXBElement<RegistarSerie> createRegistarSerie(RegistarSerie value) {
        return new JAXBElement<RegistarSerie>(_RegistarSerie_QNAME, RegistarSerie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistarSerieResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://at.gov.pt/", name = "registarSerieResponse")
    public JAXBElement<RegistarSerieResponse> createRegistarSerieResponse(RegistarSerieResponse value) {
        return new JAXBElement<RegistarSerieResponse>(_RegistarSerieResponse_QNAME, RegistarSerieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinalizarSerie }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://at.gov.pt/", name = "finalizarSerie")
    public JAXBElement<FinalizarSerie> createFinalizarSerie(FinalizarSerie value) {
        return new JAXBElement<FinalizarSerie>(_FinalizarSerie_QNAME, FinalizarSerie.class, null, value);
    }

}
