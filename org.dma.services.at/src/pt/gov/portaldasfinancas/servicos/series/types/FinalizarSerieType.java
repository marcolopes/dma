/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package pt.gov.portaldasfinancas.servicos.series.types;

import java.math.BigInteger;

import pt.gov.portaldasfinancas.servicos.series.SeriesInfo;

public class FinalizarSerieType {

	public final String serie;
	public final TipoDocType tipoDoc;
	public final String codValidacaoSerie;
	public final BigInteger seqUltimoDocEmitido;
	/** Factultativo */
	public final String justificacao;

	public FinalizarSerieType(SeriesInfo info) {
		this(info.getSerie(), TipoDocType.valueOf(info.getTipoDoc()), info.getCodValidacaoSerie(), info.getSeqUltimoDocEmitido(), null);
	}

	public FinalizarSerieType(String serie, TipoDocType tipoDoc, String codValidacaoSerie, int seqUltimoDocEmitido) {
		this(serie, tipoDoc, codValidacaoSerie, BigInteger.valueOf(seqUltimoDocEmitido), null);
	}

	public FinalizarSerieType(String serie, TipoDocType tipoDoc, String codValidacaoSerie, BigInteger seqUltimoDocEmitido, String justificacao) {
		this.serie=serie;
		this.tipoDoc=tipoDoc;
		this.codValidacaoSerie=codValidacaoSerie;
		this.seqUltimoDocEmitido=seqUltimoDocEmitido;
		this.justificacao=justificacao;
	}


}
