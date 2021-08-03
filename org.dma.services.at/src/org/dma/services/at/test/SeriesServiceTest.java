/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.services.at.test;

import java.math.BigInteger;

import org.dma.java.security.JKSCertificate;
import org.dma.java.security.JKSCertificate.CERTIFICATE_TYPE;
import org.dma.java.util.TimeDateUtils;
import org.dma.services.at.proxy.SeriesServiceHandler;
import org.dma.services.at.proxy.SeriesServiceHandler.ENDPOINTS;

import pt.gov.portaldasfinancas.servicos.series.ConsultarSeriesResp;
import pt.gov.portaldasfinancas.servicos.series.SeriesInfo;
import pt.gov.portaldasfinancas.servicos.series.SeriesResp;
import pt.gov.portaldasfinancas.servicos.series.types.AnularSerieType;
import pt.gov.portaldasfinancas.servicos.series.types.ClasseDocType;
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

	public static final Integer RequesterTaxID = 599999993;

	public static final String Serie = "2022";

	public static final TipoSerieType TipoSerie = TipoSerieType.N;

	public static final ClasseDocType ClasseDoc = ClasseDocType.SI;

	public static final TipoDocType TipoDoc = TipoDocType.FT;

	public static final MeioProcessamentoType MeioProcessamento = MeioProcessamentoType.PI;

	public static final MotivoAnulacaoType MotivoAnulacao = MotivoAnulacaoType.ER;

	public static SeriesServiceHandler ServiceHandler = new SeriesServiceHandler(
		//Service Username / Password
		RequesterTaxID+"/0037", "testes1234",
		//Scheme Administrator Certificate
		new JKSCertificate(CERTIFICATE_TYPE.JKS, "certificates/output/ChavePublicaAT.jks", "123456", "sapubkey"),
		//Software Developer Certificate
		new JKSCertificate(CERTIFICATE_TYPE.PKCS12, "certificates/output/TesteWebservices.pfx", "TESTEwebservice"),
		//Trusted Store Certificate
		//new JKSCertificate(CERTIFICATE_TYPE.JKS, "certificates/output/TrustStoreAT.jks", "123456", "portaldasfinancas"),
		//Endpoint address
		ENDPOINTS.TESTES);

	public static String registarSerie() {

		try{
			RegistarSeriesType type=new RegistarSeriesType(Serie, TipoSerie, ClasseDoc, TipoDoc,
					BigInteger.ONE, TimeDateUtils.getCurrentDate(), BigInteger.ZERO, MeioProcessamento);

			SeriesResp response=ServiceHandler.registarSerie(type);

			System.out.print(response.getInfoResultOper().getCodResultOper());
			System.out.print(" - ");
			System.out.println(response.getInfoResultOper().getMsgResultOper());
			if (response.getInfoSerie()!=null){
				System.out.println(response.getInfoSerie().getCodValidacaoSerie());
				return response.getInfoSerie().getCodValidacaoSerie();
			}

		}catch(Exception e){
			e.printStackTrace();
		}return null;

	}

	public static void anularSerie(String CodigoValidacao) {

		try{
			AnularSerieType type=new AnularSerieType(Serie, ClasseDoc, TipoDoc, CodigoValidacao, MotivoAnulacao, true);

			SeriesResp response=ServiceHandler.anularSerie(type);

			System.out.print(response.getInfoResultOper().getCodResultOper());
			System.out.print(" - ");
			System.out.println(response.getInfoResultOper().getMsgResultOper());
			if (response.getInfoSerie()!=null){
				System.out.println(response.getInfoSerie().getCodValidacaoSerie());
			}

		}catch(Exception e){
			e.printStackTrace();
		}

	}

	public static void finalizarSerie(String CodigoValidacao) {

		try{
			FinalizarSerieType type=new FinalizarSerieType(Serie, ClasseDoc, TipoDoc, CodigoValidacao, BigInteger.ONE);

			SeriesResp response=ServiceHandler.finalizarSerie(type);

			System.out.print(response.getInfoResultOper().getCodResultOper());
			System.out.print(" - ");
			System.out.println(response.getInfoResultOper().getMsgResultOper());
			if (response.getInfoSerie()!=null){
				System.out.println(response.getInfoSerie().getCodValidacaoSerie());
			}

		}catch(Exception e){
			e.printStackTrace();
		}

	}


	public static void ConsultarSeries() {

		try{
			ConsultarSeriesType type=new ConsultarSeriesType(TimeDateUtils.getCurrentDate());
			type.setEstado(EstadoSerieType.A);

			ConsultarSeriesResp response=ServiceHandler.consultarSeries(type);

			System.out.print(response.getInfoResultOper().getCodResultOper());
			System.out.print(" - ");
			System.out.println(response.getInfoResultOper().getMsgResultOper());
			for(SeriesInfo info: response.getInfoSerie()){
				System.out.println(info.getCodValidacaoSerie());
			}

		}catch(Exception e){
			e.printStackTrace();
		}

	}


	public static void main(String[] argvs) {

		try{
			anularSerie(registarSerie());
			finalizarSerie(registarSerie());
			ConsultarSeries();

		}catch(Exception e){
			e.printStackTrace();
		}

	}


}
