/*******************************************************************************
 * Copyright 2008-2022 Marco Lopes (marcolopespt@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package pt.gov.portaldasfinancas.servicos.series.types;

import pt.gov.portaldasfinancas.servicos.series.SeriesInfo;

public enum TipoDocType {

	/** Fatura */ FT (ClasseDocType.SI, "Fatura"),
	/** Fatura simplificada */ FS (ClasseDocType.SI, "Fatura simplificada"),
	/** Fatura-recibo */ FR (ClasseDocType.SI, "Fatura-recibo"),
	/** Nota de débito */ ND (ClasseDocType.SI, "Nota de débito"),
	/** Nota de crédito */ NC (ClasseDocType.SI, "Nota de crédito"),
	/** Guia de remessa */ GR (ClasseDocType.MG, "Guia de remessa"),
	/** Guia de transporte */ GT (ClasseDocType.MG, "Guia de transporte"),
	/** Guia de movimentação de ativos fixos próprios */ GA (ClasseDocType.MG, "Guia de movimentação"),
	/** Guia de consignação */ GC (ClasseDocType.MG, "Guia de consignação"),
	/** Guia ou nota de devolução */ GD (ClasseDocType.MG, "Guia ou nota de devolução"),
	/** Consultas de mesa */ CM (ClasseDocType.WD, "Consultas de mesa"),
	/** Crédito de consignação */ CC (ClasseDocType.WD, "Crédito de consignação"),
	/** Fatura de consignação */ FC (ClasseDocType.WD, "Fatura de consignação"),
	/** Folhas de obra */ FO (ClasseDocType.WD, "Folhas de obra"),
	/** Nota de encomenda */ NE (ClasseDocType.WD, "Nota de encomenda"),
	/** Outros */ OU (ClasseDocType.WD, "Outros"),
	/** Orçamentos */ OR (ClasseDocType.WD, "Orçamentos"),
	/** Pró-forma */ PF (ClasseDocType.WD, "Pró-forma"),
	/** Prémio ou recibo de prémio */ RP (ClasseDocType.WD, "Prémio ou recibo de prémio"),
	/** Estorno ou recibo de estorno */ RE (ClasseDocType.WD, "Estorno ou recibo de estorno"),
	/** Imputação a cosseguradoras */ CS (ClasseDocType.WD, "Imputação a cosseguradoras"),
	/** Imputação a cosseguradora líder */ LD (ClasseDocType.WD, "Imputação a cosseguradora líder"),
	/** Resseguro aceite */ RA (ClasseDocType.WD, "Resseguro aceite"),
	/** Recibo emitido no âmbito do regime de IVA de Caixa */ RC (ClasseDocType.PY, "Recibo regime de IVA de Caixa"),
	/** Outros recibos emitidos */ RG (ClasseDocType.PY, "Outros recibos emitidos");

	public final ClasseDocType classeDoc;
	public final String descricao;

	private TipoDocType(ClasseDocType classeDoc, String descricao) {
		this.classeDoc=classeDoc;
		this.descricao=descricao;
	}

	public static TipoDocType get(SeriesInfo info) {
		try{return valueOf(info.getTipoDoc());
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
