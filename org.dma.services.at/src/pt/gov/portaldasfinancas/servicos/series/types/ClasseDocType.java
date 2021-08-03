/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package pt.gov.portaldasfinancas.servicos.series.types;

public enum ClasseDocType {

	/** Faturas e documentos retificativos */ SI,
	/** Documentos de Transporte */ MG,
	/** Documentos de Conferência */ WD,
	/** Recibos */ PY;

	public String value() {
		return name();
	}

}
