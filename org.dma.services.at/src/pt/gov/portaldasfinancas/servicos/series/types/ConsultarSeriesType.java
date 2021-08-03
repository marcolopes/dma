/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package pt.gov.portaldasfinancas.servicos.series.types;

import java.util.Calendar;

import javax.xml.datatype.XMLGregorianCalendar;

import org.dma.java.util.TimeDateUtils;

/**
 * Todos os campos são facultativos
 */
public class ConsultarSeriesType {

	private String serie;
	private TipoSerieType tipoSerie;
	private ClasseDocType classeDoc;
	private TipoDocType tipoDoc;
	private String codValidacaoSerie;
	private XMLGregorianCalendar dataRegistoDe;
	private XMLGregorianCalendar dataRegistoAte;
	private EstadoSerieType estado;
	private MeioProcessamentoType meioProcessamento;

	public ConsultarSeriesType() {}

	public ConsultarSeriesType(Calendar dataRegistoDe) {
		setDataRegistoDe(dataRegistoDe);
	}

	public ConsultarSeriesType(Calendar dataRegistoDe, Calendar dataRegistoAte) {
		setDataRegistoDe(dataRegistoDe);
		setDataRegistoAte(dataRegistoAte);
	}


	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie=serie;
	}


	public TipoSerieType getTipoSerie() {
		return tipoSerie;
	}

	public void setTipoSerie(TipoSerieType tipoSerie) {
		this.tipoSerie=tipoSerie;
	}


	public ClasseDocType getClasseDoc() {
		return classeDoc;
	}

	public void setClasseDoc(ClasseDocType classeDoc) {
		this.classeDoc=classeDoc;
	}


	public TipoDocType getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(TipoDocType tipoDoc) {
		this.tipoDoc=tipoDoc;
	}


	public String getCodValidacaoSerie() {
		return codValidacaoSerie;
	}

	public void setCodValidacaoSerie(String codValidacaoSerie) {
		this.codValidacaoSerie=codValidacaoSerie;
	}


	public XMLGregorianCalendar getDataRegistoDe() {
		return dataRegistoDe;
	}

	public void setDataRegistoDe(Calendar dataRegistoDe) {
		this.dataRegistoDe=TimeDateUtils.getXMLGregorianCalendar(dataRegistoDe);
	}


	public XMLGregorianCalendar getDataRegistoAte() {
		return dataRegistoAte;
	}

	public void setDataRegistoAte(Calendar dataRegistoAte) {
		this.dataRegistoAte=TimeDateUtils.getXMLGregorianCalendar(dataRegistoAte);
	}


	public EstadoSerieType getEstado() {
		return estado;
	}

	public void setEstado(EstadoSerieType estado) {
		this.estado=estado;
	}


	public MeioProcessamentoType getMeioProcessamento() {
		return meioProcessamento;
	}

	public void setMeioProcessamento(MeioProcessamentoType meioProcessamento) {
		this.meioProcessamento=meioProcessamento;
	}

}
