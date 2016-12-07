/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.math;

import java.math.BigDecimal;
import java.security.InvalidParameterException;

public class ReferenciaMB {

	/** Maximo VALOR a pagar = 999999.99 */
	public final static BigDecimal VALOR_MAX = new BigDecimal("999999.99");

	public final String entidade;
	public final String subentidade;


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
	 *
	 * @param entidade - os 5 digitos da entidade (fornecida pelo provider)
	 */
	public ReferenciaMB(String entidade) {
		this(entidade, "");
	}

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
	 *
	 * @param entidade - os 5 digitos da entidade (fornecida pela IF THEN)
	 * @param subentidade - os 3 digitos da subentidade (fornecida pela IF THEN)
	 */
	public ReferenciaMB(String entidade, String subentidade) {
		this.entidade=entidade;
		this.subentidade=subentidade;
	}


	public static String right(String string, int lenght) {

		return string.substring(string.length()-lenght);

	}


	private String checkDigits(String id7, BigDecimal valor) {

		String valor8=right("00000000"+valor.movePointRight(2).intValueExact(), 8);
		String control=entidade + id7 + valor8;

		System.out.println("valor8: "+valor8);
		System.out.println("control: "+control);

		int checksum=0;
		for(char c: control.toCharArray()){
			checksum=(checksum + Character.getNumericValue(c)) * 10 % 97;
		}
		checksum=98-(checksum * 10 % 97);

		return right("0"+checksum, 2);

	}


	/**
	 * @param valor - VALOR a pagar
	 *
	 * @return true caso o VALOR a pagar seja valido
	 * <p>
	 * O VALOR a pagar e' considerado valido quando:<br>
	 * - Nao ultrapasse o valor maximo permitido: {@link #VALOR_MAX}<br>
	 * - A parte fraccionaria nao necessite de mais de 2 digitos<br>
	 */
	public boolean isValid(BigDecimal valor) {

		if (valor.compareTo(VALOR_MAX)<=0) try{
			valor.movePointRight(2).intValueExact();

		}catch(Exception e){
			return false;
		}

		return true;

	}


	/**
	 * @param ref - REFERENCIA MULTIBANCO (pode conter espacos)
	 * @param valor - VALOR a pagar
	 *
	 * @return true caso a REFERENCIA MULTIBANCO seja valida
	 *
	 * @throws InvalidParameterException caso a ENTIDADE nao tenha 5 digitos
	 * @throws InvalidParameterException caso o VALOR a pagar seja invalido
	 */
	public boolean isValid(String ref, BigDecimal valor) {

		System.out.println("entidade: "+entidade);
		System.out.println("valor: "+valor);

		if (entidade.length()!=5) throw new InvalidParameterException("Entidade "+entidade+" invalida");
		if (!isValid(valor)) throw new InvalidParameterException("Valor "+valor+" invalido");

		String ref9=ref.replaceAll(" ", "");
		String id7=ref9.substring(0, 7);
		String checkDigits=ref9.substring(7, 9);

		System.out.println("ref9: "+ref9);
		System.out.println("id7: "+id7);
		System.out.println("checkDigits: "+checkDigits);

		return checkDigits(id7, valor).equals(checkDigits);

	}


	/**
	 * @param id - ID de pagamento (serao usados os digitos da direita)
	 * @param valor - VALOR a pagar (maximo = {@link #VALOR_MAX})
	 *
	 * @return REFERENCIA MULTIBANCO formatada em grupos de 3 digitos
	 * obtida a partir de ID7 + CHECKDIGITS
	 *
	 * @throws InvalidParameterException caso a ENTIDADE nao tenha 5 digitos
	 * @throws InvalidParameterException caso o VALOR a pagar seja invalido
	 *
	 * @see ReferenciaMB#isValid(BigDecimal)
	 */
	public String generate(String id, BigDecimal valor) {

		System.out.println("entidade: "+entidade);
		System.out.println("valor: "+valor);

		if (entidade.length()!=5) throw new InvalidParameterException("Entidade "+entidade+" invalida");
		if (!isValid(valor)) throw new InvalidParameterException("Valor "+valor+" invalido");

		String id7=subentidade + right("0000000"+id, 7-subentidade.length());
		String checkDigits=checkDigits(id7, valor);
		String ref9=id7 + checkDigits;

		System.out.println("id: "+id);
		System.out.println("id7: "+id7);
		System.out.println("checkDigits: "+checkDigits);

		return ref9.substring(0,3)+" "+
				ref9.substring(3,6)+" "+
				ref9.substring(6,9);

	}


	public static void main(String[] argvs) throws Exception {

		final String SEPARATOR = "------------------------------";

		//GERACAO de NOVA referencia COM sub-entidade
		System.out.println("generate (164 262 863): "+new ReferenciaMB("11202", "164").
				generate("***2628", new BigDecimal("29914.41")));

		System.out.println(SEPARATOR);
		System.out.println("isValid (164 262 863): "+new ReferenciaMB("11202", "164").
				isValid("164 262 863", new BigDecimal("29914.41")));

		//GERACAO de NOVA referencia SEM sub-entidade
		System.out.println(SEPARATOR);
		System.out.println("generate (999 123 490): "+new ReferenciaMB("11604").
				generate("***9991234", new BigDecimal("25.86")));

		System.out.println(SEPARATOR);
		System.out.println("isValid (999 123 490): "+new ReferenciaMB("11604").
				isValid("999 123 490", new BigDecimal("25.86")));

		//TESTE de REFERENCIA GERADA
		System.out.println(SEPARATOR);
		System.out.println("isValid (112 720 598): "+new ReferenciaMB("11024").
				isValid("112720598", new BigDecimal("382.66")));

		//TESTE de REFERENCIA GERADA
		System.out.println(SEPARATOR);
		System.out.println("isValid (114 150 053): "+new ReferenciaMB("11024").
				isValid("114150053", new BigDecimal("84.96")));

		//TESTE referencia EXISTENTE (SEM data limite de pagamento)
		System.out.println(SEPARATOR);
		System.out.println("isValid (784 175 012): "+new ReferenciaMB("10297").
				isValid("784 175 012", new BigDecimal("3.11")));

		//TESTE referencia EXISTENTE (COM data limite de pagamento)
		System.out.println(SEPARATOR);
		System.out.println("isValid (189 405 538): "+new ReferenciaMB("21303").
				isValid("189 405 538", new BigDecimal("19.95")));

		//TESTE referencia EXISTENTE (COM data limite de pagamento)
		System.out.println(SEPARATOR);
		System.out.println("isValid (009 721 777): "+new ReferenciaMB("20183").
				isValid("009 721 777", new BigDecimal("104.04")));

	}


}