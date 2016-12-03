/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.math;

import java.math.BigDecimal;

public class ReferenciaMB {

	public static String right(String string, int lenght) {
		return string.length()<lenght ?
				string : string.substring(string.length()-lenght);
	}


	/**
	 * @param entidade - os 5 digitos da entidade (fornecida pelo provider)
	 * @param id - referencia do pagamento (serao usados os 7 digitos da direita)
	 * @param valor - valor a pagar (maximo 8 digitos ou 9 com casa decimal)
	 * @return A referencia Multibanco
	 * @throws Exception
	 */
	public static String generico(String entidade, String id, BigDecimal valor) throws Exception {

		if (entidade.length()!=5) throw new Exception("entidade "+entidade+" invalida");
		if (valor.compareTo(new BigDecimal("999999.99"))>0) throw new Exception("valor "+valor+" invalido");

		String id7=right("0000000"+id, 7);
		String valor8=right("00000000"+valor.multiply(new BigDecimal("100")).intValueExact(), 8);
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
		String checksum=right("0"+result, 2);

		return id7 + checksum;

	}


	/**
	 * A referencia e composta sempre por 9 digitos (em grupos de 3 facilita a visualizacao)
	 * e no nosso sistema e composta do seguinte modo:
	 * SSSDDDDCC
	 *<p>
	 * SSS: tres digitos que identificam a sub-entidade (o vendedor).
	 * Este codigo e atribuido pela IFTHEN.
	 *<p>
	 * DDDD: ID - quatro digitos que identificam o nº do documento/encomenda a pagar
	 * ou o nºdo v/ cliente (conforme prefiram associar o pagamento a um documento
	 * ou a um cliente). Este ID tera que ter obrigatoriamente 4 digitos, pelo que
	 * caso o nº do documento/encomenda ou o nº do cliente tenha mais que 4 digitos
	 * tera que utilizar apenas os 4 mais a direita, caso tenha menos de 4 digitos
	 * devera preencher os restantes com zeros a esquerda.
	 *<p>
	 * CC: dois digitos de controlo (check-digits). Serve para o terminal validar
	 * se a informacao esta correta.
	 * Nota: Se o digito de controlo so tiver um algarismo tera que formata-lo
	 * para 2 algarismos colocando 0 (zero) a esquerda.
	 *<p>
	 * No exemplo de cima:<br>
	 * 11604 e o codigo da entidade;<br>
	 * 999 e o codigo da sub-entidade;<br>
	 * 1234 e o ID - nº do documento/encomenda a ser pago ou o numero do v/ cliente;<br>
	 * 90 sao os digitos de controlo;<br>
	 * 25,86 € e o valor a pagar.
	 *<p>
	 * @param entidade - os 5 digitos da entidade (fornecida pela IF THEN)
	 * @param subentidade - os 3 digitos da subentidade (fornecida pela IF THEN)
	 * @param id - referencia do pagamento (serao usados os 4 digitos da direita)
	 * @param valor - valor a pagar (maximo 8 digitos ou 9 com casa decimal)
	 * @return A referencia Multibanco
	 * @throws Exception
	 */
	public static String ifThenPay(String entidade, String subentidade, String id, BigDecimal valor) throws Exception {

		if (subentidade.length()!=3) throw new Exception("subentidade "+subentidade+" invalida");

		String id4=right("0000"+id, 4);

		return generico(entidade, subentidade+id4, valor);

	}


	public static void main(String[] argvs) throws Exception {

		/*
		 * 11604 e o codigo da entidade;
		 * 999 e o codigo da sub-entidade;
		 * 1234 e o ID - nº do documento/encomenda a ser pago ou o numero do v/ cliente;
		 * 25,86 € e o valor a pagar.
		 */
		System.out.println("ifThenPay (999123490): "+
				ifThenPay("11604", "999", "00001234", new BigDecimal("25.86")));

		System.out.println("ifThenPay (164262863): "+
				ifThenPay("11202", "164", "2628", new BigDecimal("29914.41")));

		System.out.println("ifThenPay (?): "+
				ifThenPay("11202", "164", "2628", new BigDecimal("999999.99")));

	}


}