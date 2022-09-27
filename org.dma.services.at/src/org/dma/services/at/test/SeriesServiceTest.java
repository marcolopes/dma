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
package org.dma.services.at.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.dma.java.security.ServiceCertificates;
import org.dma.java.util.RandomValue;
import org.dma.java.util.TimeDateUtils;
import org.dma.services.at.proxy.SeriesServiceHandler;

import pt.gov.portaldasfinancas.servicos.series.ConsultarSeriesResp;
import pt.gov.portaldasfinancas.servicos.series.OperationResultInfo;
import pt.gov.portaldasfinancas.servicos.series.SeriesInfo;
import pt.gov.portaldasfinancas.servicos.series.SeriesResp;
import pt.gov.portaldasfinancas.servicos.series.types.EstadoSerieType;
import pt.gov.portaldasfinancas.servicos.series.types.MeioProcessamentoType;
import pt.gov.portaldasfinancas.servicos.series.types.MotivoAnulacaoType;
import pt.gov.portaldasfinancas.servicos.series.types.TipoDocType;
import pt.gov.portaldasfinancas.servicos.series.types.TipoSerieType;
import pt.gov.portaldasfinancas.servicos.series.types.requests.AnularSerieType;
import pt.gov.portaldasfinancas.servicos.series.types.requests.ConsultarSeriesType;
import pt.gov.portaldasfinancas.servicos.series.types.requests.FinalizarSerieType;
import pt.gov.portaldasfinancas.servicos.series.types.requests.RegistarSeriesType;

/**
 * Teste de comunicacao de SERIES
 */
public class SeriesServiceTest extends SeriesServiceHandler {

	public static final int SeriemaxLength = 35;

	public static final TipoSerieType TipoSerie = TipoSerieType.N;

	public static final TipoDocType TipoDoc = TipoDocType.FT;

	public static final int NumCertSWFatur = 0;

	public static final MeioProcessamentoType MeioProcessamento = MeioProcessamentoType.PI;

	public static final MotivoAnulacaoType MotivoAnulacao = MotivoAnulacaoType.ER;

	public static final ServiceCertificates ServiceCertificates = new ServiceCertificates(Certificates.ChavePublicaAT, Certificates.TesteWebservices);

	private enum PRINT {NONE, INFO, ID}

	public SeriesServiceTest() {
		super("599999993/0037", "testes1234", ServiceCertificates, ENDPOINTS.TEST);
	}

	public SeriesInfo registar(RegistarSeriesType request) {

		if (request!=null) try{

			info("Registar série: " + request.serie);

			SeriesResp response=registarSerie(request);
			print(response);

			return response.getInfoSerie();

		}catch(Exception e){
			e.printStackTrace();
		}return null;

	}

	public SeriesInfo registar(SeriesInfo info) {

		if (info!=null) try{

			info("Registar série: " + info.getSerie());

			RegistarSeriesType request=new RegistarSeriesType(info);

			return registar(request);

		}catch(Exception e){
			e.printStackTrace();
		}return null;

	}

	public SeriesInfo registar() {

		String serie=new RandomValue().numbers(SeriemaxLength);

		RegistarSeriesType request=new RegistarSeriesType(serie, TipoSerie, TipoDoc,
				1, TimeDateUtils.getCurrentDate(), NumCertSWFatur, MeioProcessamento);

		return registar(request);

	}

	public SeriesInfo anular(SeriesInfo info) {

		if (info!=null) try{

			info("Anular série: " + info.getSerie());

			AnularSerieType request=new AnularSerieType(info, MotivoAnulacao, true);

			SeriesResp response=anularSerie(request);
			print(response);

			return response.getInfoSerie();

		}catch(Exception e){
			e.printStackTrace();
		}return null;

	}

	public void anular() {

		info("Anular todas as séries ACTIVAS");

		for(SeriesInfo info: consultar(EstadoSerieType.A).getInfoSerie()) try{

			anular(info);

		}catch(Exception e){
			e.printStackTrace();
		}

	}

	public SeriesInfo finalizar(SeriesInfo info) {

		if (info!=null) try{

			info("Finalizar série: " + info.getSerie());

			FinalizarSerieType request=new FinalizarSerieType(info);

			SeriesResp response=finalizarSerie(request);
			print(response);

			return response.getInfoSerie();

		}catch(Exception e){
			e.printStackTrace();
		}return null;

	}

	public void finalizar() {

		info("Finalizar todas as séries ACTIVAS");

		for(SeriesInfo info: consultar(EstadoSerieType.A).getInfoSerie()) try{

			finalizar(info);

		}catch(Exception e){
			e.printStackTrace();
		}

	}

	public ConsultarSeriesResp consultar() {

		try{
			info("Consultar todas as séries");

			ConsultarSeriesType request=new ConsultarSeriesType();

			return consultarSeries(request);

		}catch(Exception e){
			e.printStackTrace();
		}return null;

	}

	public ConsultarSeriesResp consultar(EstadoSerieType estado) {

		if (estado!=null) try{

			switch(estado){
			case A: info("Consultar todas as séries ACTIVAS"); break;
			case N: info("Consultar todas as séries ANULADAS"); break;
			case F: info("Consultar todas as séries FINALIZADAS"); break;
			}ConsultarSeriesType request=new ConsultarSeriesType(estado);

			return consultarSeries(request);

		}catch(Exception e){
			e.printStackTrace();
		}return consultar();

	}

	public Collection<ConsultarSeriesResp> consultar(EstadoSerieType...estados) {

		if (estados.length==0) return Arrays.asList(consultar());

		Collection<ConsultarSeriesResp> col=new ArrayList();
		for(EstadoSerieType estado: estados){
			col.add(consultar(estado));
		}return col;

	}

	public void consultar(PRINT print, EstadoSerieType...estados) {

		for(ConsultarSeriesResp response: consultar(estados)){

			switch(print){
			case NONE: break;
			case INFO: print(response); break;
			case ID: printID(response); break;
			}
		}

	}

	/*
	 * Print
	 */
	public static void print(SeriesResp response) {

		if (response!=null) try{

			print(response.getInfoResultOper());

			print(response.getInfoSerie());

		}catch(Exception e){
			e.printStackTrace();
		}

	}

	public static void print(ConsultarSeriesResp response) {

		if (response!=null) try{

			print(response.getInfoResultOper());

			for(SeriesInfo info: response.getInfoSerie()){
				print(info);
			}System.out.println();

		}catch(Exception e){
			e.printStackTrace();
		}

	}

	public static void printID(ConsultarSeriesResp response) {

		if (response!=null) try{

			print(response.getInfoResultOper());

			for(SeriesInfo info: response.getInfoSerie()){
				printID(info);
			}System.out.println();


		}catch(Exception e){
			e.printStackTrace();
		}

	}

	public static void print(OperationResultInfo info) {

		if (info!=null) try{

			System.out.print(info.getCodResultOper());
			System.out.print(" - ");
			System.out.println(info.getMsgResultOper());
			System.out.println();

		}catch(Exception e){
			e.printStackTrace();
		}

	}

	public static void print(SeriesInfo info) {

		if (printID(info)) System.out.println();

		if (info!=null) try{

			System.out.print("Estado: "); System.out.println(info.getEstado());
			System.out.print("Tipo Série: "); System.out.println(info.getTipoSerie());
			System.out.print("Tipo Documento: "); System.out.println(info.getTipoDoc());
			System.out.print("Classe Documento: "); System.out.println(info.getClasseDoc());
			System.out.print("Data Registo: "); System.out.println(info.getDataRegisto());
			System.out.print("Data Utilização: "); System.out.println(info.getDataInicioPrevUtiliz());
			System.out.print("Número Inicial Sequência: "); System.out.println(info.getNumInicialSeq());
			System.out.print("Último Documento Emitido: "); System.out.println(info.getSeqUltimoDocEmitido());
			System.out.print("Justificação Finalização: "); System.out.println(info.getJustificacao());
			System.out.print("Data Estado (Alteração): "); System.out.println(info.getDataEstado());
			System.out.print("Motivo Estado (Anulação): "); System.out.println(info.getMotivoEstado());
			System.out.print("Número Final Sequência: "); System.out.println(info.getNumFinalSeq());
			System.out.print("Código Validação: "); System.out.println(info.getCodValidacaoSerie());
			System.out.print("NIF Comunicou: "); System.out.println(info.getNifComunicou());
			System.out.print("Meio Processamento: "); System.out.println(info.getMeioProcessamento());
			System.out.print("Número Certificado Software: "); System.out.println(info.getNumCertSWFatur());
			System.out.println();

		}catch(Exception e){
			e.printStackTrace();
		}

	}

	public static boolean printID(SeriesInfo info) {

		if (info!=null) try{

			System.out.print("Nif/Doc/Serie: ");
			System.out.print(info.getNifComunicou());
			System.out.print("/");
			System.out.print(info.getTipoDoc());
			System.out.print("/");
			System.out.println(info.getSerie());
			return true;

		}catch(Exception e){
			e.printStackTrace();
		}return false;

	}

	public static void info(String text) {

		String separator="========================================";
		System.out.println(separator);
		System.out.println(text);
		System.out.println(separator);

	}


	public static void main(String[] argvs) {

		SeriesServiceTest service=new SeriesServiceTest();

		//service.anular();
		//service.finalizar();

		/** Situações ACEITES */
		//Registar
		service.registar();
		//Registar -> Anular
		service.anular(service.registar());
		//Registar -> Finalizar
		service.finalizar(service.registar());

		/** Situações NÃO ACEITES */
		//Registar -> Registar
		service.registar(service.registar());
		//Registar -> Anular -> Registar
		service.registar(service.anular(service.registar()));
		//Registar -> Finalizar -> Registar
		service.registar(service.finalizar(service.registar()));
		//Registar -> Anular -> Finalizar
		service.finalizar(service.anular(service.registar()));
		//Registar -> Finalizar -> Anular
		service.anular(service.finalizar(service.registar()));

		PRINT print=PRINT.ID;
		service.consultar(print);
		service.consultar(print, EstadoSerieType.A);
		service.consultar(print, EstadoSerieType.N);
		service.consultar(print, EstadoSerieType.F);

	}


}
