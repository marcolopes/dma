/*******************************************************************************
 * 2008-2022 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package pt.gov.portaldasfinancas.servicos.documentos.types;

import pt.gov.portaldasfinancas.servicos.documentos.WorkStatus;

public enum WorkStatusType {

	/** Normal */ N ("Normal"),
	/** Anulado */ A ("Anulado"),
	/** Faturado */ F ("Faturado");

	public final String descricao;

	private WorkStatusType(String descricao) {
		this.descricao=descricao;
	}

	public static WorkStatusType get(WorkStatus status) {
		try{return valueOf(status.getWorkStatus());
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
