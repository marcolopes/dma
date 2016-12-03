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
	public final String id7;

	/**
	 * IF THEN PAY
	 *<p>
	 * A referencia e composta sempre por 9 digitos (em grupos de 3 facilita
	 * a visualizacao) e no nosso sistema e composta do seguinte modo:
	 * SSSDDDDCC
	 *<p>
	 * SSS: tres digitos que identificam a sub-entidade (o vendedor).
	 * Este codigo e atribuido pela IFTHEN.
	 *<p>
	 * DDDD: quatro digitos que identificam o nº do documento/encomenda a pagar
	 * ou o nº do v/cliente (conforme prefiram associar o pagamento a um documento
	 * ou a um cliente). Este ID tera que ter obrigatoriamente 4 digitos, pelo que
	 * caso o nº do documento/encomenda ou o nº do cliente tenha mais que 4 digitos
	 * tera que utilizar apenas os 4 mais a direita, caso tenha menos de 4 digitos
	 * devera preencher os restantes com zeros a esquerda.
	 *<p>
	 * CC: dois digitos de controlo (check-digits). Serve para o terminal validar
	 * se a informacao esta correta. Se o digito de controlo so tiver um algarismo
	 * tera que formata-lo para 2 algarismos colocando 0 (zero) a esquerda.
	 *<p>
	 * @param entidade - os 5 digitos da entidade (fornecida pela IF THEN)
	 * @param subentidade - os 3 digitos da subentidade (fornecida pela IF THEN)
	 * @param id4 - referencia do pagamento (serao usados os 4 digitos da direita)
	 */
	public ReferenciaMB(String entidade, String subentidade, String id4) {
		this(entidade, StringUtils.right("???"+subentidade, 3) +
				StringUtils.right("0000"+id4, 4));
	}

	/**
	 * SIBS
	 *
	 * @param entidade - os 5 digitos da entidade (fornecida pelo provider)
	 * @param id7 - referencia do pagamento (serao usados os 7 digitos da direita)
	 */
	public ReferenciaMB(String entidade, String id7) {
		this.entidade=entidade;
		this.id7=StringUtils.right("0000000"+id7, 7);
	}


	/**
	 * @param valor - valor a pagar (maximo 8 digitos ou 9 com casa decimal)
	 * @return referencia MULTIBANCO (ou 0 caso VALOR > 999 999.99)
	 * @throws InvalidParameterException caso a ENTIDADE seja invalida
	 */
	public String plain(BigDecimal valor) {

		if (entidade.length()!=5) throw new InvalidParameterException("Entidade "+entidade+" invalida");
		if (valor.compareTo(VALOR_MAX)>0) return "0";

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
	 * @param valor - valor a pagar (maximo 8 digitos ou 9 com casa decimal)
	 * @return referencia MULTIBANCO em grupos de 3 digitos
	 * (ou 0 caso VALOR > 999 999.99)
	 * @throws InvalidParameterException caso a ENTIDADE seja invalida
	 */
	public String formatted(BigDecimal valor) {

		String ref=plain(valor);

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
		System.out.println("generate (999123490): "+
				new ReferenciaMB("11604", "999", "00001234").
					plain(new BigDecimal("25.86")));

		System.out.println("generate (164262863): "+
				new ReferenciaMB("11202", "164", "2628").
					formatted(new BigDecimal("29914.41")));

		System.out.println("generate (?): "+
				new ReferenciaMB("11202", "164", "2628").
					formatted(new BigDecimal("999999.99")));

	}


}