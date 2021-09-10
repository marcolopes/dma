/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package pt.gov.portaldasfinancas.servicos.series.types;

import pt.gov.portaldasfinancas.servicos.series.SeriesInfo;

public class AnularSerieType {

	public final String serie;
	public final TipoDocType tipoDoc;
	public final String codigoValidacao;
	public final MotivoAnulacaoType motivo;
	public final boolean declaracaoNaoEmissao;

	public AnularSerieType(SeriesInfo info, MotivoAnulacaoType motivo) {
		this(info.getSerie(), TipoDocType.valueOf(info.getTipoDoc()), info.getCodValidacaoSerie(), motivo);
	}

	public AnularSerieType(String serie, TipoDocType tipoDoc, String codigoValidacao, MotivoAnulacaoType motivo) {
		this.serie=serie;
		this.tipoDoc=tipoDoc;
		this.codigoValidacao=codigoValidacao;
		this.motivo=motivo;
		this.declaracaoNaoEmissao=true;
	}


}
