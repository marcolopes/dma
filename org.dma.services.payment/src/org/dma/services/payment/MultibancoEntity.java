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
package org.dma.services.payment;

import java.math.BigDecimal;

import org.dma.java.math.CheckDigits;
import org.dma.java.util.StringUtils;

/**
 * GENERICO (SIBS)
 *<p>
 * A REFERENCIA MULTIBANCO e composta sempre por 9 digitos, e por norma
 * deve ser separada em grupos de 3 digitos para facilitar a visualizacao.
 * (ex: 123 456 789)
 *<p>
 * O formato da REFERENCIA MULTIBANCO no nosso sistema e' o seguinte:
 * DDDDDDDCC
 *<p>
 * DDDDDDD: ID de PAGAMENTO - 7 digitos que identificam o nº do documento
 * a pagar ou o nº do v/cliente (conforme prefiram associar o pagamento a
 * um documento ou a um cliente). Caso o ID tenha mais que 7 digitos irao
 * ser utilizados apenas os 7 mais a direita.
 *<p>
 * CC: CHECKDIGITS - 2 digitos de controlo que servem para o terminal
 * validar se a informacao esta' correta.
 */
public class MultibancoEntity {

	/** Valor MAXIMO a pagar = 999999.99 */
	public static final BigDecimal VALOR_MAX = new BigDecimal("999999.99");

	public static String right(String string, int length) {
		return string.substring(string.length()-length);
	}

	private final String entity;

	/**
	 * @param entity Os 5 digitos da entidade (fornecida pelo provider)
	 */
	public MultibancoEntity(String entity) {
		this.entity=entity;
	}


	/**
	 * @param value O VALOR a pagar
	 *
	 * @throws IllegalArgumentException caso a ENTIDADE seja invalida
	 * @throws IllegalArgumentException caso o VALOR a pagar seja invalido
	 */
	public void validate(BigDecimal value) throws IllegalArgumentException {

		if (entity.length()!=5) throw new IllegalArgumentException("Entidade "+entity+" não tem 5 dígitos");
		if (!StringUtils.isNumeric(entity)) throw new IllegalArgumentException("Entidade "+entity+" não é numérica");

		if (value.signum()<0) throw new IllegalArgumentException("Valor "+value+" inferior a 0 (zero)");
		if (value.compareTo(VALOR_MAX)>0) throw new IllegalArgumentException("Valor "+value+" superior a "+VALOR_MAX);
		try{value.movePointRight(2).intValueExact();
		}catch(Exception e){
			throw new IllegalArgumentException("Valor "+value+" tem mais de 2 decimais");
		}

	}


	/**
	 * @param id7 O ID a processar (primeiros 7 digitos da REFERENCIA)
	 * @param value O VALOR a pagar (serao usados os 8 digitos da direita)
	 * @return Os CHECK DIGITS (2 digitos de controle)
	 * <p>
	 * Utiliza o algoritmo ISO 7064 Mod 97,10 check digit
	 */
	private String checkDigits(String id7, BigDecimal value) {

		String value8=right("00000000"+value.movePointRight(2).intValueExact(), 8);
		String control=entity + id7 + value8;

		return CheckDigits.ISO7064Mod97_10(control);

	}


	/**
	 * @param id O ID de pagamento (serao usados os 7 digitos da direita)
	 * @param value O VALOR a pagar (maximo = {@link #VALOR_MAX})
	 *
	 * @return A REFERENCIA MULTIBANCO formatada em grupos de 3 digitos
	 * obtida a partir de ID7 + CHECKDIGITS
	 *
	 * @throws IllegalArgumentException caso a ENTIDADE seja invalida
	 * @throws IllegalArgumentException caso o VALOR a pagar seja invalido
	 *
	 * @see MultibancoEntity#isValid(String, BigDecimal)
	 */
	public MultibancoRef generate(String id, BigDecimal value) throws IllegalArgumentException {

		validate(value);

		String id7=right("0000000"+id, 7);
		String ref9=id7 + checkDigits(id7, value);

		return new MultibancoRef(entity, ref9, value);

	}


	/**
	 * @param ref A REFERENCIA MULTIBANCO (pode conter espacos)
	 * @param value O VALOR a pagar
	 *
	 * @return true caso a REFERENCIA MULTIBANCO seja valida
	 *
	 * @throws IllegalArgumentException caso a ENTIDADE seja invalida
	 * @throws IllegalArgumentException caso o VALOR a pagar seja invalido
	 */
	public boolean isValid(String ref, BigDecimal value) throws IllegalArgumentException {

		validate(value);

		String ref9=StringUtils.removeChars(ref, ' ');
		String id7=ref9.substring(0, 7);
		String checkDigits=ref9.substring(7, 9);

		return checkDigits(id7, value).equals(checkDigits);

	}


	public static void main(String[] args) throws Exception {

		//GERACAO de NOVA referencia
		System.out.println(new MultibancoEntity("11604").
				generate("***9991234", new BigDecimal("123456.12")).toText());

		System.out.println("isValid (999123490): "+new MultibancoEntity("11604").
				isValid("999 123 483", new BigDecimal("123456.12")));

		final String SEPARATOR = "-----------------------------------";

		//TESTE de REFERENCIA GERADA
		System.out.println(SEPARATOR);
		System.out.println("isValid (112720598): "+new MultibancoEntity("11024").
				isValid("112720598", new BigDecimal("382.66")));

		//TESTE de REFERENCIA GERADA
		System.out.println(SEPARATOR);
		System.out.println("isValid (114150053): "+new MultibancoEntity("11024").
				isValid("114150053", new BigDecimal("84.96")));

		//TESTE referencia EXISTENTE (entidade 1xxxx)
		System.out.println(SEPARATOR);
		System.out.println("isValid (784175012): "+new MultibancoEntity("10297").
				isValid("784175012", new BigDecimal("3.11")));

		//TESTE referencia EXISTENTE (entidade 2xxxx)
		System.out.println(SEPARATOR);
		System.out.println("isValid (189405538): "+new MultibancoEntity("21303").
				isValid("189405538", new BigDecimal("19.95")));

		//TESTE referencia EXISTENTE (entidade 2xxxx)
		System.out.println(SEPARATOR);
		System.out.println("isValid (009721777): "+new MultibancoEntity("20183").
				isValid("009721777", new BigDecimal("104.04")));

	}


}