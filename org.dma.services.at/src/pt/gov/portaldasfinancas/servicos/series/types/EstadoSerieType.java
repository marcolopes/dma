/*******************************************************************************
 * 2008-2022 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package pt.gov.portaldasfinancas.servicos.series.types;

public enum EstadoSerieType {

	/** Ativa */ A ("Ativa"),
	/** Anulada */ N ("Anulada"),
	/** Finalizada */ F ("Finalizada");

	public final String descricao;

	private EstadoSerieType(String descricao) {
		this.descricao=descricao;
	}

	public static EstadoSerieType get(String name) {
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
