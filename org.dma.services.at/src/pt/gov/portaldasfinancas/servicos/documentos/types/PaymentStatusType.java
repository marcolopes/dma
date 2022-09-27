/*******************************************************************************
 * 2008-2022 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package pt.gov.portaldasfinancas.servicos.documentos.types;

import pt.gov.portaldasfinancas.servicos.documentos.PaymentStatus;

public enum PaymentStatusType {

	/** Normal */ N ("Normal"),
	/** Anulado */ A ("Anulado");

	public final String descricao;

	private PaymentStatusType(String descricao) {
		this.descricao=descricao;
	}

	public static PaymentStatusType get(PaymentStatus status) {
		try{return valueOf(status.getPaymentStatus());
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
