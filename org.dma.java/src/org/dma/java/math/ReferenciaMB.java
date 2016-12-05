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

	/** Maximo VALOR a pagar = 999999.99 */
	public final static BigDecimal VALOR_MAX = new BigDecimal("999999.99");

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
	 * CC: CHECKSUM - 2 digitos de controlo que servem para o terminal validar
	 * se a informacao esta' correta.
	 *
	 * @param entidade - os 5 digitos da entidade (fornecida pela IF THEN)
	 * @param subentidade - os 3 digitos da subentidade (fornecida pela IF THEN)
	 */
	public ReferenciaMB(String entidade, String subentidade) {
		this.entidade=entidade;
		this.subentidade=subentidade;
	}


	private String checksum(String id7, BigDecimal valor) {

		String valor8=StringUtils.right("00000000"+valor.movePointRight(2).intValueExact(), 8);
		System.out.println("valor8: "+valor8);

		String control=entidade + id7 + valor8;
		System.out.println("control: "+control);

		int result=0;
		for(char c: control.toCharArray()){
			result=(result + Character.getNumericValue(c)) * 10 % 97;
		}
		result=98-(result * 10 % 97);

		return StringUtils.right("0"+result, 2);

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
		if (entidade.length()!=5) throw new InvalidParameterException("Entidade "+entidade+" invalida");

		System.out.println("valor: "+valor);
		if (!isValid(valor)) throw new InvalidParameterException("Valor "+valor+" invalido");

		String ref9=ref.replaceAll(" ", "");
		System.out.println("ref9: "+ref9);

		String id7=ref9.substring(0, 7);
		System.out.println("id7: "+id7);

		String checksum=ref9.substring(7, 9);
		System.out.println("checksum: "+checksum);

		return checksum(id7, valor).equals(checksum);

	}


	/**
	 * @param id - ID de pagamento (serao usados os digitos da direita)
	 * @param valor - VALOR a pagar (maximo = {@link #VALOR_MAX})
	 *
	 * @return REFERENCIA MULTIBANCO formatada em grupos de 3 digitos
	 * obtida a partir de ID7 + CHECKSUM
	 *
	 * @throws InvalidParameterException caso a ENTIDADE nao tenha 5 digitos
	 * @throws InvalidParameterException caso o VALOR a pagar seja invalido
	 *
	 * @see ReferenciaMB#isValid(BigDecimal)
	 */
	public String generate(String id, BigDecimal valor) {

		System.out.println("entidade: "+entidade);
		if (entidade.length()!=5) throw new InvalidParameterException("Entidade "+entidade+" invalida");

		System.out.println("valor: "+valor);
		if (!isValid(valor)) throw new InvalidParameterException("Valor "+valor+" invalido");

		String id7=subentidade + StringUtils.right("0000000"+id, 7-subentidade.length());
		System.out.println("id: "+id7);

		String checksum=checksum(id7, valor);
		System.out.println("checksum: "+checksum);

		String ref9=id7 + checksum;
		System.out.println("id7: "+id7);

		return ref9.substring(0,3)+" "+
				ref9.substring(3,6)+" "+
				ref9.substring(6,9);

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

		System.out.println("isValid (999 123 490): "+new ReferenciaMB("11604", "999").
				isValid("999 123 490", new BigDecimal("25.86")));

		System.out.println("generate (999 123 490): "+new ReferenciaMB("11604").
				generate("9991234", new BigDecimal("25.86")));

		System.out.println("generate (164 262 863): "+new ReferenciaMB("11202", "164").
				generate("2628", new BigDecimal("29914.41")));


	}


}