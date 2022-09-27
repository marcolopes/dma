/*******************************************************************************
 * 2008-2022 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package pt.gov.portaldasfinancas.servicos.documentos.types;

public enum DeleteReasonType {

	/** Anulação por erro de registo */ ER ("Anulação por erro de registo");

	public final String descricao;

	private DeleteReasonType(String descricao) {
		this.descricao=descricao;
	}

	public String value() {
		return descricao;
	}

	@Override
	public String toString() {
		return name() + "-" + descricao;
	}

}
