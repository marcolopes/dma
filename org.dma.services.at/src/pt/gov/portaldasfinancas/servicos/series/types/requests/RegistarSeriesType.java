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

import java.math.BigInteger;
import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

import org.dma.java.util.TimeDateUtils;

import pt.gov.portaldasfinancas.servicos.series.SeriesInfo;
import pt.gov.portaldasfinancas.servicos.series.types.MeioProcessamentoType;
import pt.gov.portaldasfinancas.servicos.series.types.TipoDocType;
import pt.gov.portaldasfinancas.servicos.series.types.TipoSerieType;

public class RegistarSeriesType {

	private static final String DATE_PATTERN = "yyyy-MM-dd";

	public final String serie;
	public final TipoSerieType tipoSerie;
	public final TipoDocType tipoDoc;
	public final BigInteger numInicialSeq;
	public final XMLGregorianCalendar dataInicioPrevUtiliz;
	public final BigInteger numCertSWFatur;
	public final MeioProcessamentoType meioProcessamento;

	public RegistarSeriesType(SeriesInfo info) {
		this(info.getSerie(), TipoSerieType.valueOf(info.getTipoSerie()), TipoDocType.valueOf(info.getTipoDoc()),
				info.getNumInicialSeq(), info.getDataInicioPrevUtiliz(), info.getNumCertSWFatur(),
				MeioProcessamentoType.valueOf(info.getMeioProcessamento()));
	}

	public RegistarSeriesType(String serie, TipoSerieType tipoSerie, TipoDocType tipoDoc,
			int numInicialSeq, int numCertSWFatur, MeioProcessamentoType meioProcessamento) {
		this(serie, tipoSerie, tipoDoc, numInicialSeq, TimeDateUtils.getCurrentDate(), numCertSWFatur, meioProcessamento);
	}

	public RegistarSeriesType(String serie, TipoSerieType tipoSerie, TipoDocType tipoDoc,
			int numInicialSeq, Date dataInicioPrevUtiliz, int numCertSWFatur, MeioProcessamentoType meioProcessamento) {
		this(serie, tipoSerie, tipoDoc, BigInteger.valueOf(numInicialSeq),
				TimeDateUtils.getXMLGregorianCalendar(TimeDateUtils.getDateFormatted(dataInicioPrevUtiliz, DATE_PATTERN)),
				BigInteger.valueOf(numCertSWFatur), meioProcessamento);
	}

	public RegistarSeriesType(String serie, TipoSerieType tipoSerie, TipoDocType tipoDoc,
			BigInteger numInicialSeq, XMLGregorianCalendar dataInicioPrevUtiliz, BigInteger numCertSWFatur, MeioProcessamentoType meioProcessamento) {
		this.serie=serie;
		this.tipoSerie=tipoSerie;
		this.tipoDoc=tipoDoc;
		this.numInicialSeq=numInicialSeq;
		this.dataInicioPrevUtiliz=dataInicioPrevUtiliz;
		this.numCertSWFatur=numCertSWFatur;
		this.meioProcessamento=meioProcessamento;
	}


}
