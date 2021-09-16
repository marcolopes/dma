/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.services.at.test;

import org.dma.java.util.RandomValue;
import org.dma.java.util.TimeDateUtils;
import org.dma.services.at.Certificates;
import org.dma.services.at.proxy.SeriesServiceHandler;
import org.dma.services.at.proxy.SeriesServiceHandler.ENDPOINTS;

import pt.gov.portaldasfinancas.servicos.series.ConsultarSeriesResp;
import pt.gov.portaldasfinancas.servicos.series.OperationResultInfo;
import pt.gov.portaldasfinancas.servicos.series.SeriesInfo;
import pt.gov.portaldasfinancas.servicos.series.SeriesResp;
import pt.gov.portaldasfinancas.servicos.series.types.AnularSerieType;
import pt.gov.portaldasfinancas.servicos.series.types.ConsultarSeriesType;
import pt.gov.portaldasfinancas.servicos.series.types.EstadoSerieType;
import pt.gov.portaldasfinancas.servicos.series.types.FinalizarSerieType;
import pt.gov.portaldasfinancas.servicos.series.types.MeioProcessamentoType;
import pt.gov.portaldasfinancas.servicos.series.types.MotivoAnulacaoType;
import pt.gov.portaldasfinancas.servicos.series.types.RegistarSeriesType;
import pt.gov.portaldasfinancas.servicos.series.types.TipoDocType;
import pt.gov.portaldasfinancas.servicos.series.types.TipoSerieType;

/**
 * Teste de comunicacao de SERIES
 */
public class SeriesServiceTest {

	/** A documentacao indica maxLength = 35 */
	public static final int SeriemaxLength = 20;

	public static final TipoSerieType TipoSerie = TipoSerieType.N;

	public static final TipoDocType TipoDoc = TipoDocType.FT;

	public static final int NumCertSWFatur = 0;

	public static final MeioProcessamentoType MeioProcessamento = MeioProcessamentoType.PI;

	public static final MotivoAnulacaoType MotivoAnulacao = MotivoAnulacaoType.ER;

	public static SeriesServiceHandler ServiceHandler = new SeriesServiceHandler(
			"599999993/0037", "testes1234", Certificates.ChavePublicaAT, Certificates.TesteWebservices, ENDPOINTS.TESTES);

	private enum PRINT {NONE, INFO, ID}

	public static SeriesInfo registarSerie() {

		String serie=new RandomValue().numbers(SeriemaxLength);

		RegistarSeriesType type=new RegistarSeriesType(serie, TipoSerie, TipoDoc,
				1, TimeDateUtils.getCurrentDate(), NumCertSWFatur, MeioProcessamento);

		return registarSerie(type);

	}

	public static SeriesInfo registarSerie(RegistarSeriesType type) {

		if (type!=null) try{

			info("Registar série: " + type.serie);

			SeriesResp response=ServiceHandler.registarSerie(type);
			print(response);

			return response.getInfoSerie();

		}catch(Exception e){
			e.printStackTrace();
		}return null;

	}

	public static SeriesInfo registarSerie(SeriesInfo info) {

		if (info!=null) try{

			RegistarSeriesType type=new RegistarSeriesType(info);

			return registarSerie(type);

		}catch(Exception e){
			e.printStackTrace();
		}return null;

	}

	public static SeriesInfo anularSerie(SeriesInfo info) {

		if (info!=null) try{

			info("Anular série: " + info.getSerie());

			AnularSerieType type=new AnularSerieType(info, MotivoAnulacao);

			SeriesResp response=ServiceHandler.anularSerie(type);
			print(response);

			return response.getInfoSerie();

		}catch(Exception e){
			e.printStackTrace();
		}return null;

	}

	public static SeriesInfo finalizarSerie(SeriesInfo info) {

		if (info!=null) try{

			info("Finalizar série: " + info.getSerie());

			FinalizarSerieType type=new FinalizarSerieType(info);

			SeriesResp response=ServiceHandler.finalizarSerie(type);
			print(response);

			return response.getInfoSerie();

		}catch(Exception e){
			e.printStackTrace();
		}return null;

	}


	public static ConsultarSeriesResp consultarSeries(EstadoSerieType estado) {

		if (estado!=null) try{

			ConsultarSeriesType type=new ConsultarSeriesType(estado);

			return ServiceHandler.consultarSeries(type);

		}catch(Exception e){
			e.printStackTrace();
		}return null;

	}


	public static void consultarSeries(PRINT print, EstadoSerieType...estados) {

		for(EstadoSerieType estado: estados){

			switch(estado){
			case A: info("Consultar todas as séries ACTIVAS"); break;
			case N: info("Consultar todas as séries ANULADAS"); break;
			case F: info("Consultar todas as séries FINALIZADAS"); break;
			}

			ConsultarSeriesResp response=consultarSeries(estado);

			switch(print){
			case NONE: break;
			case INFO: print(response); break;
			case ID: printID(response); break;
			}
		}

	}


	public static void anularSeries() {

		info("Anular todas as séries ACTIVAS");

		for(SeriesInfo info: consultarSeries(EstadoSerieType.A).getInfoSerie()) try{

			anularSerie(info);

		}catch(Exception e){
			e.printStackTrace();
		}

	}


	public static void finalizarSeries() {

		info("Finalizar todas as séries ACTIVAS");

		for(SeriesInfo info: consultarSeries(EstadoSerieType.A).getInfoSerie()) try{

			finalizarSerie(info);

		}catch(Exception e){
			e.printStackTrace();
		}

	}


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

			System.out.print("Tipo Série: "); System.out.println(info.getTipoSerie());
			System.out.print("Tipo Documento: "); System.out.println(info.getTipoDoc());
			System.out.print("Classe Documento: "); System.out.println(info.getClasseDoc());
			System.out.print("NIF Comunicou: "); System.out.println(info.getNifComunicou());
			System.out.print("Data Registo: "); System.out.println(info.getDataRegisto());
			System.out.print("Data Utilização: "); System.out.println(info.getDataInicioPrevUtiliz());
			System.out.print("Data Estado (Alteração): "); System.out.println(info.getDataEstado());
			System.out.print("Número Inicial Sequência: "); System.out.println(info.getNumInicialSeq());
			System.out.print("Último Documento Emitido: "); System.out.println(info.getSeqUltimoDocEmitido());
			System.out.print("Número Final Sequência: "); System.out.println(info.getNumFinalSeq());
			System.out.print("Código Validação: "); System.out.println(info.getCodValidacaoSerie());
			System.out.print("Meio Processamento: "); System.out.println(info.getMeioProcessamento());
			System.out.print("Número Certificado Software: "); System.out.println(info.getNumCertSWFatur());
			System.out.print("Justificação Finalização: "); System.out.println(info.getJustificacao());
			System.out.print("Motivo Estado (Anulação): "); System.out.println(info.getMotivoEstado());
			System.out.print("Estado: "); System.out.println(info.getEstado());
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

		//anularSeries();
		//finalizarSeries();

		/** Situações ACEITES */
		//Registar
		registarSerie();
		//Registar -> Anular
		anularSerie(registarSerie());
		//Registar -> Finalizar
		finalizarSerie(registarSerie());
		//Registar -> Anular -> Registar
		registarSerie(anularSerie(registarSerie()));

		/** Situações NÃO ACEITES */
		//Registar -> Registar
		registarSerie(registarSerie());
		//Registar -> Anular -> Finalizar
 		finalizarSerie(anularSerie(registarSerie()));
		//Registar -> Finalizar -> Anular
		anularSerie(finalizarSerie(registarSerie()));

		PRINT print=PRINT.ID;
		//consultarSeries(print, EstadoSerieType.A);
		//consultarSeries(print, EstadoSerieType.N);
		//consultarSeries(print, EstadoSerieType.F);

	}


}
