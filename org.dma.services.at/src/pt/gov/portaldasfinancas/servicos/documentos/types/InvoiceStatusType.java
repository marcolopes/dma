/*******************************************************************************
 * 2008-2022 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package pt.gov.portaldasfinancas.servicos.documentos.types;

import pt.gov.portaldasfinancas.servicos.documentos.InvoiceStatus;

public enum InvoiceStatusType {

	/** Normal */ N ("Normal"),
	/** Anulado */ A ("Anulado"),
	/** Faturado */ F ("Faturado"),
	/** Autofaturado */ S ("Autofaturado");

	public final String descricao;

	private InvoiceStatusType(String descricao) {
		this.descricao=descricao;
	}

	public static InvoiceStatusType get(InvoiceStatus status) {
		try{return valueOf(status.getInvoiceStatus());
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
