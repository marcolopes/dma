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

import pt.gov.portaldasfinancas.servicos.series.SeriesInfo;
import pt.gov.portaldasfinancas.servicos.series.types.MotivoAnulacaoType;
import pt.gov.portaldasfinancas.servicos.series.types.TipoDocType;

public class AnularSerieType {

	public final String serie;
	public final TipoDocType tipoDoc;
	public final String codigoValidacao;
	public final MotivoAnulacaoType motivo;
	public final boolean declaracaoNaoEmissao;

	public AnularSerieType(SeriesInfo info, MotivoAnulacaoType motivo, boolean declaracaoNaoEmissao) {
		this(info.getSerie(), TipoDocType.valueOf(info.getTipoDoc()), info.getCodValidacaoSerie(), motivo, declaracaoNaoEmissao);
	}

	public AnularSerieType(String serie, TipoDocType tipoDoc, String codigoValidacao, MotivoAnulacaoType motivo, boolean declaracaoNaoEmissao) {
		this.serie=serie;
		this.tipoDoc=tipoDoc;
		this.codigoValidacao=codigoValidacao;
		this.motivo=motivo;
		this.declaracaoNaoEmissao=declaracaoNaoEmissao;
	}


}
