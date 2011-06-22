/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.numeric;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BusinessRules {

	/**
	 *
	 * Devolve o numero mais proximo ao arredondamento;
	 * Podem ser numeros com ou sem casas decimais;
	 * exemplo: 123.56, 2.50 = 122.50
	 *
	 **/
	public static BigDecimal round(BigDecimal valor, BigDecimal arredondamento){

		if (arredondamento.doubleValue()!=0)
			/*
			 * Arredondamento HALF_UP
			 * Rounding mode to round towards "nearest neighbor" unless both neighbors are equidistant,
			 * in which case round up.
			 * Behaves as for RoundingMode.UP if the discarded fraction is >= 0.5;
			 * otherwise, behaves as for RoundingMode.DOWN.
			 * Note that this is the rounding mode commonly taught at school.
			 */
			return (valor.divide(arredondamento,0,RoundingMode.HALF_UP)).multiply(arredondamento);

		return valor;

	}


	/**
	 *
	 * Devolve o PRECO de CUSTO MEDIO PONDERADO;
	 * formula: (existencias * PrecoActual + entradas * precoEntradas) / (existencias + entradas);
	 * exemplo: 100, 10, 100, 20 = 15
	 *
	 **/
	public static BigDecimal getPrecoMedioPonderado(BigDecimal existencias, BigDecimal precoActual, BigDecimal entradas, BigDecimal precoEntradas) {

		if (entradas.doubleValue()>0){
			BigDecimal dividendo=(existencias.abs().multiply(precoActual)).add(entradas.multiply(precoEntradas));
			BigDecimal divisor=existencias.abs().add(entradas);

			//PARA EVITAR: Non-terminating decimal expansion; no exact representable decimal result.
			return dividendo.divide(divisor,RoundingMode.HALF_EVEN);
		}

		return precoActual;

	}


	/**
	 *
	 * Devolve a PERCENTAGEM FINAL;
	 * formula: perc1 + (100 - perc1) * (perc2 / 100);
	 * exemplo: 50% + 25% = 62,5%
	 *
	 **/
	public static BigDecimal getPercentagemFinal(BigDecimal perc1, BigDecimal perc2){

		return perc1.add((BigDecimal.valueOf(100).subtract(perc1)).
				multiply(perc2.divide(BigDecimal.valueOf(100))));

	}


	/**
	 *
	 * Devolve a PERCENTAGEM de lucro;
	 * formula: ((total - valor) / valor) * 100;
	 * exemplo: 200, 10 = 1900%
	 **/
	public static BigDecimal getPercentagemLucro(BigDecimal total, BigDecimal valor){

		if(valor.doubleValue()!=0)
			return ((total.subtract(valor)).
			//PARA EVITAR: Non-terminating decimal expansion; no exact representable decimal result.
			divide(valor,RoundingMode.HALF_EVEN)).multiply(BigDecimal.valueOf(100));

		return BigDecimal.valueOf(0);

	}


	/**
	 *
	 * Devolve a PERCENTAGEM do VALOR;
	 * formula: (valor * 100) / total;
	 * exemplo: 200, 10 = 5%
	 *
	 **/
	public static BigDecimal getPercentagemValor(BigDecimal total, BigDecimal valor){

		if (total.doubleValue()!=0)
			return (valor.multiply(BigDecimal.valueOf(100))).
			//PARA EVITAR: Non-terminating decimal expansion; no exact representable decimal result.
			divide(total,RoundingMode.HALF_EVEN);

		return BigDecimal.valueOf(0);

	}


	/**
	 *
	 * Devolve o VALOR da PERCENTAGEM;
	 * formula: valor * (perc / 100);
	 * exemplo: 200, 10% = 20
	 *
	 **/
	public static BigDecimal getValorPercentagem(BigDecimal valor, BigDecimal perc){

		return valor.multiply(perc.divide(BigDecimal.valueOf(100)));

	}


	/**
	 *
	 * Devolve o VALOR liquido da PERCENTAGEM;
	 * formula: valor * (1 - (perc / 100);
	 * exemplo: 200, 10% = 180
	 *
	 **/
	public static BigDecimal getValorLiquido(BigDecimal valor, BigDecimal perc){

		return valor.
		multiply(BigDecimal.valueOf(1).
		subtract(perc.divide(BigDecimal.valueOf(100))));

	}


	/**
	 *
	 * Devolve o VALOR deduzido da PERCENTAGEM;
	 * formula: valor / (perc / 100) + 1;
	 * exemplo: 130, 30% = 100
	 *
	 **/
	public static BigDecimal getValorDeduzido(BigDecimal valor, BigDecimal perc){

		return valor.
			divide((perc.divide(BigDecimal.valueOf(100)).
			//PARA EVITAR: Non-terminating decimal expansion; no exact representable decimal result.
			add(BigDecimal.valueOf(1))),RoundingMode.HALF_EVEN);

	}


	/**
	 *
	 * Devolve o VALOR acrescido da PERCENTAGEM;
	 * formula: valor * ((perc / 100) + 1);
	 * exemplo: 200, 10% = 220
	 *
	 **/
	public static BigDecimal getValorAcrescido(BigDecimal valor, BigDecimal perc){

		return valor.
		multiply((perc.divide(BigDecimal.valueOf(100))).add(BigDecimal.valueOf(1)));

	}


	/**
	 *
	 * Devolve o VALOR PROPORCIONAL;
	 * formula: (valor * parte) / total;
	 * exemplo: 100, 50, 200 = 25
	 *
	 **/
	public static BigDecimal getValorProporcional(BigDecimal valor, BigDecimal parte, BigDecimal total){

		if (total.doubleValue()!=0)
			return (valor.multiply(parte)).
			//PARA EVITAR: Non-terminating decimal expansion; no exact representable decimal result.
			divide(total,RoundingMode.HALF_EVEN);

		return BigDecimal.valueOf(0);

	}


}
