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

	/** Valor maximo a pagar = 999 999.99 */
	public final static BigDecimal VALOR_MAX = new BigDecimal("999999.99");
	public static final BigDecimal BD100 = BigDecimal.valueOf(100);

	public final String entidade;
	public final String subentidade;


	/**
	 * SIBS
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
	 * CC: CHECKSUM - 2 digitos de controlo que servem para o terminal validar
	 * se a informacao esta' correta.
	 *<p>
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
	 * CC: CHECKSUM - 2 digitos de controlo que servem para o terminal validar
	 * se a informacao esta' correta.
	 *<p>
	 * @param entidade - os 5 digitos da entidade (fornecida pela IF THEN)
	 * @param subentidade - os 3 digitos da subentidade (fornecida pela IF THEN)
	 */
	public ReferenciaMB(String entidade, String subentidade) {
		this.entidade=entidade;
		this.subentidade=subentidade;
	}


	/**
	 * @param id - ID de pagamento (serao usados os digitos da direita)
	 * @param valor - valor a pagar (maximo = {@link #VALOR_MAX})
	 * @return referencia MULTIBANCO (ou "0" caso VALOR > maximo)
	 * @throws InvalidParameterException caso a ENTIDADE seja invalida
	 * @throws ArithmeticException caso a parte fraccionaria do VALOR > 99
	 */
	public String generate(String id, BigDecimal valor) {

		if (entidade.length()!=5) throw new InvalidParameterException("Entidade "+entidade+" invalida");
		if (valor.compareTo(VALOR_MAX)>0) return "0";

		String id7=subentidade + StringUtils.right("0000000"+id, 7-subentidade.length());
		String valor8=StringUtils.right("00000000"+valor.multiply(BD100).intValueExact(), 8);
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

		return ref.substring(0,3)+" "+
				ref.substring(3,6)+" "+
				ref.substring(6,9);

	}


	/**
	 * @param id - ID de pagamento (serao usados os digitos da direita)
	 * @param valor - valor a pagar com PONTO decimal (ex: "123456.99")
	 * @see ReferenciaMB#generate(String, BigDecimal)
	 */
	public String generate(String id, String valor) {

		return generate(id, new BigDecimal(valor));

	}


	public static void main(String[] argvs) throws Exception {

		/*
		 * 11604 e o codigo da entidade;
		 * 999 e o codigo da sub-entidade;
		 * 1234 e o ID - nº do documento/encomenda ou o nº do v/cliente;
		 * 25,86 € e o valor a pagar.
		 */
		System.out.println("generate (999 123 490): "+new ReferenciaMB("11604", "999").
				generate("00001234", new BigDecimal("25.86")));

		System.out.println("generate (999 123 490): "+new ReferenciaMB("11604").
				generate("9991234", new BigDecimal("25.86")));

		System.out.println("generate (164 262 863): "+new ReferenciaMB("11202", "164").
				generate("2628", "29914.41"));

	}


}