/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package pt.gov.portaldasfinancas.servicos.series.types;

public class AnularSerieType {

	public final String serie;
	public final ClasseDocType classeDoc;
	public final TipoDocType tipoDoc;
	public final String codigoValidacao;
	public final MotivoAnulacaoType motivo;
	public final boolean declaracaoNaoEmissao;

	public AnularSerieType(String serie, ClasseDocType classeDoc, TipoDocType tipoDoc,
			String codigoValidacao, MotivoAnulacaoType motivo, boolean declaracaoNaoEmissao) {
		this.serie=serie;
		this.classeDoc=classeDoc;
		this.tipoDoc=tipoDoc;
		this.codigoValidacao=codigoValidacao;
		this.motivo=motivo;
		this.declaracaoNaoEmissao=declaracaoNaoEmissao;
	}


}
