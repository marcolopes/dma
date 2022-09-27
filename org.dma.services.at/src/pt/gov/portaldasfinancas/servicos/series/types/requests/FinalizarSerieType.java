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
package pt.gov.portaldasfinancas.servicos.series.types.requests;

import java.math.BigInteger;

import pt.gov.portaldasfinancas.servicos.series.SeriesInfo;
import pt.gov.portaldasfinancas.servicos.series.types.TipoDocType;

public class FinalizarSerieType {

	public final String serie;
	public final TipoDocType tipoDoc;
	public final String codValidacaoSerie;
	public final BigInteger seqUltimoDocEmitido;
	/** Factultativo */
	public final String justificacao;

	public FinalizarSerieType(SeriesInfo info) {
		this(info.getSerie(), TipoDocType.valueOf(info.getTipoDoc()), info.getCodValidacaoSerie(), info.getNumInicialSeq(), null);
	}

	public FinalizarSerieType(String serie, TipoDocType tipoDoc, String codValidacaoSerie, int seqUltimoDocEmitido) {
		this(serie, tipoDoc, codValidacaoSerie, BigInteger.valueOf(seqUltimoDocEmitido), null);
	}

	public FinalizarSerieType(String serie, TipoDocType tipoDoc, String codValidacaoSerie, BigInteger seqUltimoDocEmitido, String justificacao) {
		this.serie=serie;
		this.tipoDoc=tipoDoc;
		this.codValidacaoSerie=codValidacaoSerie;
		this.seqUltimoDocEmitido=seqUltimoDocEmitido;
		this.justificacao=justificacao;
	}


}
