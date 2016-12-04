/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.math;

import java.math.BigDecimal;
import java.security.InvalidParameterException;

import org.dma.java.util.StringUtils;

public class ReferenciaMB {

	public final static BigDecimal VALOR_MAX = new BigDecimal("999999.99");

	public final String entidade;
	public final String subentidade;


	/**
	 * SIBS
	 *<p>
	 * A referencia e composta sempre por 9 digitos (em grupos de 3 facilita
	 * a visualizacao) e no nosso sistema e composta do seguinte modo:
	 * DDDDDDDCC
	 *<p>
	 * DDDDDDD: ID - 7 digitos que identificam o nº do documento/encomenda a pagar
	 * ou o nº do v/cliente (conforme prefiram associar o pagamento a um documento
	 * ou a um cliente). Este ID tera que ter obrigatoriamente 7 digitos, pelo que
	 * caso o nº do documento/encomenda ou o nº do cliente tenha mais que 7 digitos
	 * ira utilizar apenas os 7 mais a direita.
	 *<p>
	 * CC: 2 digitos de controlo (check-digits). Serve para o terminal validar
	 * se a informacao esta correta. Se o digito de controlo so tiver um algarismo
	 * tera que formata-lo para 2 algarismos colocando 0 (zero) a esquerda.
	 *<p>
	 * @param entidade - os 5 digitos da entidade (fornecida pelo provider)
	 */
	public ReferenciaMB(String entidade) {
		this(entidade, null);
	}

	/**
	 * IF THEN PAY
	 *<p>
	 * A referencia e composta sempre por 9 digitos (em grupos de 3 facilita
	 * a visualizacao) e no nosso sistema e composta do seguinte modo:
	 * SSSDDDDCC
	 *<p>
	 * SSS: 3 digitos que identificam a sub-entidade (o vendedor).
	 * Este codigo e atribuido pela IFTHEN. Neste caso o ID de pagamento a
	 * fornecer na geracao da REFERENCIA estara limitado a 4 digitos.
	 *<p>
	 * DDDD: ID - 4 digitos que identificam o nº do documento/encomenda a pagar
	 * ou o nº do v/cliente (conforme prefiram associar o pagamento a um documento
	 * ou a um cliente). Este ID tera que ter obrigatoriamente 4 digitos, pelo que
	 * caso o nº do documento/encomenda ou o nº do cliente tenha mais que 4 digitos
	 * ira utilizar apenas os 4 mais a direita.
	 *<p>
	 * CC: 2 digitos de controlo (check-digits). Serve para o terminal validar
	 * se a informacao esta correta. Se o digito de controlo so tiver um algarismo
	 * tera que formata-lo para 2 algarismos colocando 0 (zero) a esquerda.
	 *<p>
	 * @param entidade - os 5 digitos da entidade (fornecida pela IF THEN)
	 * @param subentidade - os 3 digitos da subentidade (fornecida pela IF THEN)
	 */
	public ReferenciaMB(String entidade, String subentidade) {
		this.entidade=entidade;
		this.subentidade=subentidade==null ?
				null : StringUtils.right("???"+subentidade, 3);
	}


	/**
	 * @param id - referencia do pagamento (serao usados os digitos da direita)
	 * @param valor - valor a pagar (maximo 8 digitos ou 9 com casa decimal)
	 * @return referencia MULTIBANCO (ou 0 caso VALOR > 999 999.99)
	 * @throws InvalidParameterException caso a ENTIDADE seja invalida
	 */
	public String plain(String id, BigDecimal valor) {

		if (entidade.length()!=5) throw new InvalidParameterException("Entidade "+entidade+" invalida");
		if (valor.compareTo(VALOR_MAX)>0) return "0";

		String id7=subentidade==null ? StringUtils.right("0000000"+id, 7) :
				subentidade + StringUtils.right("0000"+id, 4);
		String valor8=StringUtils.right("00000000"+
				valor.multiply(new BigDecimal("100")).intValueExact(), 8);
		String control=entidade + id7 + valor8;

		System.out.println("entidade: "+entidade);
		System.out.println("id: "+id7);
		System.out.println("valor: "+valor8);
		System.out.println("control: "+control);

		int result=0;
		for(char c: control.toCharArray()){
			result=(result + Character.getNumericValue(c)) * 10 % 97;
		}
		result=98-(result * 10 % 97);
		String checksum=StringUtils.right("0"+result, 2);
		String ref=id7 + checksum;

		return ref;

	}


	/**
	 * @param id - referencia do pagamento (maximo consoante o provider)
	 * @param valor - valor a pagar (maximo 8 digitos ou 9 com casa decimal)
	 * @return referencia MULTIBANCO em grupos de 3 digitos
	 * (ou 0 caso VALOR > 999 999.99)
	 * @throws InvalidParameterException caso a ENTIDADE seja invalida
	 */
	public String formatted(String id, BigDecimal valor) {

		String ref=plain(id, valor);

		return ref.substring(0,3)+" "+
				ref.substring(3,6)+" "+
				ref.substring(6,9);

	}


	public static void main(String[] argvs) throws Exception {

		/*
		 * 11604 e o codigo da entidade;
		 * 999 e o codigo da sub-entidade;
		 * 1234 e o ID - nº do documento/encomenda ou o nº do v/cliente;
		 * 25,86 € e o valor a pagar.
		 */
		System.out.println("generate (999123490): "+new ReferenciaMB("11604", "999").
				formatted("00001234", new BigDecimal("25.86")));

		System.out.println("generate (999123490): "+new ReferenciaMB("11604").
				formatted("9991234", new BigDecimal("25.86")));

		System.out.println("generate (164262863): "+new ReferenciaMB("11202", "164").
				formatted("2628", new BigDecimal("29914.41")));

	}


}