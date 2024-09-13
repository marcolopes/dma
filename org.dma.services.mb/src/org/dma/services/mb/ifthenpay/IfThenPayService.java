/*******************************************************************************
 * Copyright 2008-2024 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.services.mb.ifthenpay;

import ifthenpay.mbws.ArrayOfIfmb;
import ifthenpay.mbws.Ifmb;
import ifthenpay.mbws.IfmbWS;

import java.util.ArrayList;
import java.util.Collection;

import org.dma.java.time.DatePeriod;

/*
 * https://www.ifthensoftware.com/IfmbWS/IfmbWS.asmx?op=getPayments
 *
 * Os parametros a passar na chamada do metodo sao:
 *
 * Chavebackoffice: Chave fornecida pela IFTHEN na assinatura do contrato.
 * Obrigatorio.
 * Entidade: Entidade (5 digitos) fornecida pela IFTHEN na assinatura do contrato.
 * Obrigatorio.
 * Subentidade: Sub-Entidade (3 digitos) fornecida pela IFTHEN na assinatura do contrato.
 * Obrigatorio.
 * dtHrInicio: Data/Hora inicial dos pagamentos pretendidos no formato dd-MM-yyyy HH:mm:ss.
 * Facultativo.
 * dtHrFim: Data/Hora final dos pagamentos pretendidos no formato dd-MM-yyyy HH:mm:ss.
 * Facultativo.
 * Referencia: Referencia multibanco (9 digitos) sobre a qual se pretende saber a informacao do pagamento.
 * Facultativo.
 * Valor: Valor em euros dos pagamentos que se pretende obter informacao.
 * Facultativo.
 */
public class IfThenPayService {

	private static Collection<IfThenPayServiceResponseType> get(ArrayOfIfmb array) throws Exception {
		Collection<IfThenPayServiceResponseType> col=new ArrayList();
		for(Ifmb element: array.getIfmb()){
			IfThenPayServiceResponseType response=new IfThenPayServiceResponseType(element);
			if (response.codigoErro!=0) throw new Exception(response.mensagemErro);
			col.add(response);
		}return col;
	}

	public final String entidade;
	public final String subentidade;
	public final String chavebackoffice;

	public IfThenPayService(String entidade, String subentidade, String chavebackoffice) {
		this.entidade=entidade;
		this.subentidade=subentidade;
		this.chavebackoffice=chavebackoffice;
	}

	public Collection<IfThenPayServiceResponseType> getPayments() throws Exception {
		return get(new IfmbWS().getIfmbWSSoap().getPayments(chavebackoffice, entidade, subentidade, null, null, null, null));
	}

	public Collection<IfThenPayServiceResponseType> getPayments(String referencia, String valor) throws Exception {
		return get(new IfmbWS().getIfmbWSSoap().getPayments(chavebackoffice, entidade, subentidade, null, null, referencia, valor));
	}

	public Collection<IfThenPayServiceResponseType> getPayments(DatePeriod periodo) throws Exception {
		return get(new IfmbWS().getIfmbWSSoap().getPayments(chavebackoffice, entidade, subentidade,
				periodo.getStartDate("dd-MM-yyyy").concat(" ").concat("00:00:00"),
				periodo.getEndDate("dd-MM-yyyy").concat(" ").concat("23:59:59"), null, null));
	}

	public static void main(String[] args) throws Exception {

		System.out.println("Getting Payments...");
		for(IfThenPayServiceResponseType response: new IfThenPayService("11604", "999", "0000-0000-0000-0000").getPayments()){
			System.out.println(response);
		}

	}

}