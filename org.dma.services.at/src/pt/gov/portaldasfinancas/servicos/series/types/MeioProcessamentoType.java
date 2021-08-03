/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package pt.gov.portaldasfinancas.servicos.series.types;

public enum MeioProcessamentoType {

	/** Programa Informático de Faturação */ PI,
	/** Portal das Finanças */ PF,
	/** Outros Meios Eletrónicos */ OM;

	public String value() {
		return name();
	}

}
