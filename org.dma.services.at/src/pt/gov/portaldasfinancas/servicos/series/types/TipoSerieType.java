/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package pt.gov.portaldasfinancas.servicos.series.types;

public enum TipoSerieType {

	/** Normal */ N,
	/** Formação */ F,
	/** Recuperação */ R;

	public String value() {
		return name();
	}

}
