/*******************************************************************************
 * Copyright 2008-2022 Marco Lopes (marcolopespt@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package pt.gov.portaldasfinancas.servicos.series.types.requests;

import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

import org.dma.java.util.TimeDateUtils;

import pt.gov.portaldasfinancas.servicos.series.types.ClasseDocType;
import pt.gov.portaldasfinancas.servicos.series.types.EstadoSerieType;
import pt.gov.portaldasfinancas.servicos.series.types.MeioProcessamentoType;
import pt.gov.portaldasfinancas.servicos.series.types.TipoDocType;
import pt.gov.portaldasfinancas.servicos.series.types.TipoSerieType;

/**
 * Todos os campos são facultativos
 */
public class ConsultarSeriesType {

	private static final String DATE_PATTERN = "yyyy-MM-dd";

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

	/** Parametros necessarios para garantir unicidade da resposta */
	public ConsultarSeriesType(String serie, TipoSerieType tipoSerie, TipoDocType tipoDoc) {
		this.serie=serie;
		this.tipoSerie=tipoSerie;
		this.tipoDoc=tipoDoc;
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

	public void setDataRegistoDe(Date dataRegistoDe) {
		this.dataRegistoDe=TimeDateUtils.getXMLGregorianCalendar(
				TimeDateUtils.getDateFormatted(dataRegistoDe, DATE_PATTERN));
	}


	public XMLGregorianCalendar getDataRegistoAte() {
		return dataRegistoAte;
	}

	public void setDataRegistoAte(Date dataRegistoAte) {
		this.dataRegistoAte=TimeDateUtils.getXMLGregorianCalendar(
				TimeDateUtils.getDateFormatted(dataRegistoAte, DATE_PATTERN));
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
