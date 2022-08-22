/*******************************************************************************
 * 2008-2022 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package pt.gov.portaldasfinancas.servicos.series.types;

public enum ClasseDocType {

	/** Faturas e documentos retificativos */ SI ("Faturas e documentos retificativos"),
	/** Documentos de Transporte */ MG ("Documentos de Transporte"),
	/** Documentos de Conferência */ WD ("Documentos de Conferência"),
	/** Recibos */ PY ("Recibos");

	public final String descricao;

	private ClasseDocType(String descricao) {
		this.descricao=descricao;
	}

	public static ClasseDocType get(String name) {
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
