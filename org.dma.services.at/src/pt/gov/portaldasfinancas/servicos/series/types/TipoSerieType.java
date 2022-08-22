/*******************************************************************************
 * 2008-2022 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package pt.gov.portaldasfinancas.servicos.series.types;

public enum TipoSerieType {

	/** Normal */ N ("Normal"),
	/** Formação */ F ("Formação"),
	/** Recuperação */ R ("Recuperação");

	public final String descricao;

	private TipoSerieType(String descricao) {
		this.descricao=descricao;
	}

	public static TipoSerieType get(String name) {
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
