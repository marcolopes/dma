/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.services.at.test;

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

	public static final String Serie = "2022";
	public static final TipoSerieType TipoSerie = TipoSerieType.N;
	public static final TipoDocType TipoDoc = TipoDocType.FT;
	public static final int NumCertSWFatur = 9999;
	public static final MeioProcessamentoType MeioProcessamento = MeioProcessamentoType.PI;
	public static final MotivoAnulacaoType MotivoAnulacao = MotivoAnulacaoType.ER;

	public static final String ServiceUsername = "599999993/0037";
	public static final String ServicePassword = "testes1234";

	public static SeriesServiceHandler ServiceHandler = new SeriesServiceHandler(
			ServiceUsername, ServicePassword, Certificates.ChavePublicaAT, Certificates.TesteWebservices, ENDPOINTS.TESTES);

	/** Devolve o Codigo de Validacao */
	public static String registarSerie() {

		RegistarSeriesType type=new RegistarSeriesType(Serie, TipoSerie, TipoDoc,
				1, TimeDateUtils.getCurrentDate(), NumCertSWFatur, MeioProcessamento);

		try{print(ServiceHandler.registarSerie(type));
		}catch(Exception e){
			e.printStackTrace();
		}return "ZZZZZZZZ";

	}

	public static void anularSerie(String codValidacaoSerie) {

		AnularSerieType type=new AnularSerieType(Serie, TipoDoc, codValidacaoSerie, MotivoAnulacao);

		try{print(ServiceHandler.anularSerie(type));
		}catch(Exception e){
			e.printStackTrace();
		}

	}

	public static void finalizarSerie(String codValidacaoSerie) {

		FinalizarSerieType type=new FinalizarSerieType(Serie, TipoDoc, codValidacaoSerie, 1);

		try{print(ServiceHandler.finalizarSerie(type));
		}catch(Exception e){
			e.printStackTrace();
		}

	}


	public static void ConsultarSeries() {

		ConsultarSeriesType type=new ConsultarSeriesType(TimeDateUtils.getCurrentDate());
		type.setEstado(EstadoSerieType.A);

		try{print(ServiceHandler.consultarSeries(type));
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
			}

		}catch(Exception e){
			e.printStackTrace();
		}

	}


	public static void print(OperationResultInfo info) {

		if (info!=null) try{

			System.out.print(info.getCodResultOper());
			System.out.print(" - ");
			System.out.println(info.getMsgResultOper());

		}catch(Exception e){
			e.printStackTrace();
		}

	}


	public static void print(SeriesInfo info) {

		if (info!=null) try{

			System.out.print("Doc/Serie/Numero: ");
			System.out.print(info.getTipoDoc());
			System.out.print("/");
			System.out.print(info.getSerie());
			System.out.print("/");
			System.out.println(info.getNumFinalSeq());

			System.out.print("Codigo Validacao: "); System.out.println(info.getCodValidacaoSerie());
			System.out.print("Tipo Serie: "); System.out.println(info.getTipoSerie());
			System.out.print("Classe Doc: "); System.out.println(info.getClasseDoc());
			System.out.print("Justificacao: "); System.out.println(info.getJustificacao());
			System.out.print("Motivo Estado: "); System.out.println(info.getMotivoEstado());
			System.out.print("Data Estado: "); System.out.println(info.getDataEstado());
			System.out.print("Data Registo: "); System.out.println(info.getDataRegisto());
			System.out.print("Data Utilizacao: "); System.out.println(info.getDataInicioPrevUtiliz());
			System.out.print("Meio Processamento: "); System.out.println(info.getMeioProcessamento());
			System.out.print("Nif Comunicou: "); System.out.println(info.getNifComunicou());

		}catch(Exception e){
			e.printStackTrace();
		}

	}


	public static void main(String[] argvs) {

		registarSerie();
		anularSerie(registarSerie());
		finalizarSerie(registarSerie());
		ConsultarSeries();

	}


}
