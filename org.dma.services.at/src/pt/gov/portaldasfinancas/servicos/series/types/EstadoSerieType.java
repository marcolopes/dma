/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package pt.gov.portaldasfinancas.servicos.series.types;

public enum EstadoSerieType {

	/** Ativa */ A,
	/** Anulada */ N,
	/** Finalizada */ F;

	public String value() {
		return name();
	}

}
