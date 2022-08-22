/*******************************************************************************
 * 2008-2022 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package pt.gov.portaldasfinancas.servicos.series.types;

public enum MotivoAnulacaoType {

	/** Anulação por erro de registo */ ER ("Anulação por erro de registo");

	public final String descricao;

	private MotivoAnulacaoType(String descricao) {
		this.descricao=descricao;
	}

	public static MotivoAnulacaoType get(String name) {
		try{return valueOf(name);
		}catch(Exception e){}
		return null;
	}

	public String value() {
		return name();
	}

	@Override
	public String toString() {
		return name() + "-" + descricao;
	}

}
