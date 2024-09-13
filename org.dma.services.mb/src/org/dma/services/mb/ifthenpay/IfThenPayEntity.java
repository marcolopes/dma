/*******************************************************************************
 * Copyright 2008-2021 Marco Lopes (marcolopespt@gmail.com)
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

import java.math.BigDecimal;

import org.dma.services.mb.MultibancoEntity;
import org.dma.services.mb.MultibancoRef;

/**
 * IF THEN PAY
 *<p>
 * A REFERENCIA MULTIBANCO e composta sempre por 9 digitos, e por norma
 * deve ser separada em grupos de 3 digitos para facilitar a visualizacao.
 * (ex: 123 456 789)
 *<p>
 * O formato da REFERENCIA MULTIBANCO no nosso sistema e' o seguinte:
 * SSSDDDDCC
 *<p>
 * SSS: SUB-ENTIDADE - 3 digitos que identificam a sub-entidade (o vendedor).
 * Este codigo e' atribuido pela IFTHEN e ira' ocupar os PRIMEIROS DIGITOS
 * da ID de PAGAMENTO, que de outra forma teria o tamanho de 7 digitos.
 *<p>
 * DDDD: ID de PAGAMENTO - 4 digitos que identificam o nº do documento
 * a pagar ou o nº do v/cliente (conforme prefiram associar o pagamento
 * a um documento ou a um cliente). Caso o ID tenha mais que 4 digitos
 * irao ser utilizados apenas os 4 mais a direita.
 *<p>
 * CC: CHECKDIGITS - 2 digitos de controlo que servem para o terminal
 * validar se a informacao esta' correta.
 */
public class IfThenPayEntity extends MultibancoEntity {

	public final String subentity;

	/**
	 * @param entity Os 5 digitos da entidade (fornecida pela IF THEN)
	 * @param subentity Os 3 digitos da subentidade (fornecida pela IF THEN)
	 */
	public IfThenPayEntity(String entity, String subentity) {
		super(entity);
		this.subentity=subentity;
	}


	/**
	 * @param value O VALOR a pagar
	 *
	 * @throws IllegalArgumentException caso a ENTIDADE seja invalida
	 * @throws IllegalArgumentException caso a SUB-ENTIDADE seja invalida
	 * @throws IllegalArgumentException caso o VALOR a pagar seja invalido
	 */
	public void validate(BigDecimal value) throws IllegalArgumentException {

		if (subentity.length()!=3) throw new IllegalArgumentException("Subentidade "+subentity+" não tem 3 dígitos");

		super.validate(value);

	}


	/**
	 * @param id Os 4 digitos que identificam o nº do documento
	 * a pagar ou o nº do v/cliente (conforme prefiram associar o pagamento
	 * a um documento ou a um cliente). Caso o ID tenha mais que 4 digitos
	 * irao ser utilizados apenas os 4 mais a direita.
	 */
	@Override
	public MultibancoRef generate(String id, BigDecimal value) throws IllegalArgumentException {

		validate(value);

		String id7=subentity + right("0000"+id, 4);

		return super.generate(id7, value);

	}


	public static void main(String[] args) throws Exception {

		//GERACAO de NOVA referencia
		System.out.println("generate (164262863): "+new IfThenPayEntity("11202", "164").
				generate("***2628", new BigDecimal("29914.41")));

		System.out.println("isValid (164262863): "+new IfThenPayEntity("11202", "164").
				isValid("164262863", new BigDecimal("29914.41")));

	}


}