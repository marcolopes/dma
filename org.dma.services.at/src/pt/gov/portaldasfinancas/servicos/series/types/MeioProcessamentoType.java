/*******************************************************************************
 * 2008-2022 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package pt.gov.portaldasfinancas.servicos.series.types;

import pt.gov.portaldasfinancas.servicos.series.SeriesInfo;

public enum MeioProcessamentoType {

	/** Programa Informático de Faturação */ PI ("Programa Informático de Faturação"),
	/** Portal das Finanças */ PF ("Portal das Finanças"),
	/** Outros Meios Eletrónicos */ OM ("Outros Meios Eletrónicos");

	public final String descricao;

	private MeioProcessamentoType(String descricao) {
		this.descricao=descricao;
	}

	public static MeioProcessamentoType get(SeriesInfo info) {
		try{return valueOf(info.getMeioProcessamento());
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
