/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.math;

import java.math.BigDecimal;

import org.dma.java.util.StringUtils;

public class ReferenciaMB {

	private final String entidade;
	private final String id;
	private final BigDecimal valor;

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
	 * ou o nºdo v/ cliente (conforme prefiram associar o pagamento a um documento
	 * ou a um cliente). Este ID tera que ter obrigatoriamente 4 digitos, pelo que
	 * caso o nº do documento/encomenda ou o nº do cliente tenha mais que 4 digitos
	 * tera que utilizar apenas os 4 mais a direita, caso tenha menos de 4 digitos
	 * devera preencher os restantes com zeros a esquerda.
	 *<p>
	 * CC: dois digitos de controlo (check-digits). Serve para o terminal validar
	 * se a informacao esta correta. Se o digito de controlo so tiver um algarismo
	 * tera que formata-lo para 2 algarismos colocando 0 (zero) a esquerda.
	 *<p>
	 * No exemplo de cima:<br>
	 * 11604 e o codigo da entidade;<br>
	 * 999 e o codigo da sub-entidade;<br>
	 * 1234 e o ID - nº do documento/encomenda ou o numero do v/cliente;<br>
	 * 90 sao os digitos de controlo;<br>
	 * 25,86 € e o valor a pagar.
	 *<p>
	 * @param entidade - os 5 digitos da entidade (fornecida pela IF THEN)
	 * @param subentidade - os 3 digitos da subentidade (fornecida pela IF THEN)
	 * @param id - referencia do pagamento (serao usados os 4 digitos da direita)
	 * @param valor - valor a pagar (maximo 8 digitos ou 9 com casa decimal)
	 */
	public ReferenciaMB(String entidade, String subentidade, String id, BigDecimal valor) {
		this(entidade, subentidade + StringUtils.right("0000"+id, 4), valor);
	}

	/**
	 * SIBS
	 *
	 * @param entidade - os 5 digitos da entidade (fornecida pelo provider)
	 * @param id - referencia do pagamento (serao usados os 7 digitos da direita)
	 * @param valor - valor a pagar (maximo 8 digitos ou 9 com casa decimal)
	 */
	public ReferenciaMB(String entidade, String id, BigDecimal valor) {
		this.entidade=entidade;
		this.id=StringUtils.right("0000000"+id, 7);
		this.valor=valor;
	}


	/**
	 * @param formatted - separa a referencia em grupos de 3 digitos
	 * @return referencia MULTIBANCO
	 */
	public String generate(boolean formatted) throws Exception {

		if (entidade.length()!=5) throw new Exception("entidade "+entidade+" invalida");
		if (valor.compareTo(new BigDecimal("999999.99"))>0) throw new Exception("valor "+valor+" invalido");

		String valor8=StringUtils.right("00000000"+
				valor.multiply(new BigDecimal("100")).intValueExact(), 8);
		String control=entidade + id + valor8;

		System.out.println("entidade: "+entidade);
		System.out.println("id: "+id);
		System.out.println("valor: "+valor8);
		System.out.println("control: "+control);

		int result=0;
		for(char c: control.toCharArray()){
			result=(result + Character.getNumericValue(c)) * 10 % 97;
		}
		result=98-(result * 10 % 97);
		String checksum=StringUtils.right("0"+result, 2);
		String ref=id + checksum;

		return formatted ?
				ref.substring(0,3)+" "+
				ref.substring(3,6)+" "+
				ref.substring(6,9) : ref;

	}


	public static void main(String[] argvs) throws Exception {

		/*
		 * 11604 e o codigo da entidade;
		 * 999 e o codigo da sub-entidade;
		 * 1234 e o ID - nº do documento/encomenda a ser pago ou o numero do v/ cliente;
		 * 25,86 € e o valor a pagar.
		 */
		System.out.println("generate (999123490): "+
				new ReferenciaMB("11604", "999", "00001234",
						new BigDecimal("25.86")).generate(false));

		System.out.println("generate (164262863): "+
				new ReferenciaMB("11202", "164", "2628",
						new BigDecimal("29914.41")).generate(true));

		System.out.println("generate (?): "+
				new ReferenciaMB("11202", "164", "2628",
						new BigDecimal("999999.99")).generate(false));

	}


}