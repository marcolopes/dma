/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package pt.gov.portaldasfinancas.servicos.series.types;

public enum TipoDocType {

	/** Fatura */
	FT (ClasseDocType.SI),
	/** Fatura simplificada */
	FS (ClasseDocType.SI),
	/** Fatura-recibo */
	FR (ClasseDocType.SI),
	/** Nota de débito */
	ND (ClasseDocType.SI),
	/** Nota de crédito */
	NC (ClasseDocType.SI),
	/** Guia de remessa */
	GR (ClasseDocType.MG),
	/** Guia de transporte */
	GT (ClasseDocType.MG),
	/** Guia de movimentação de ativos fixos próprios */
	GA (ClasseDocType.MG),
	/** Guia de consignação */
	GC (ClasseDocType.MG),
	/** Guia ou nota de devolução */
	GD (ClasseDocType.MG),
	/** Consultas de mesa */
	CM (ClasseDocType.WD),
	/** Crédito de consignação */
	CC (ClasseDocType.WD),
	/** Fatura de consignação */
	FC (ClasseDocType.WD),
	/** Folhas de obra */
	FO (ClasseDocType.WD),
	/** Nota de encomenda */
	NE (ClasseDocType.WD),
	/** Outros */
	OU (ClasseDocType.WD),
	/** Orçamentos */
	OR (ClasseDocType.WD),
	/** Pró-forma */
	PF (ClasseDocType.WD),
	/** Prémio ou recibo de prémio */
	RP (ClasseDocType.WD),
	/** Estorno ou recibo de estorno */
	RE (ClasseDocType.WD),
	/** Imputação a cosseguradoras */
	CS (ClasseDocType.WD),
	/** Imputação a cosseguradora líder */
	LD (ClasseDocType.WD),
	/** Resseguro aceite */
	RA (ClasseDocType.WD),
	/** Recibo emitido no âmbito do regime de IVA de Caixa */
	RC (ClasseDocType.PY),
	/** Outros recibos emitidos */
	RG (ClasseDocType.PY);

	public final ClasseDocType classeDoc;

	private TipoDocType(ClasseDocType classeDoc) {
		this.classeDoc=classeDoc;
	}

	public String value() {
		return name();
	}

}
