/*******************************************************************************
 * 2008-2022 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *
 * Writing of numerals in Portuguese Language
 * Implemented according to the Portuguese grammar
 * Supports any unit and any decimal precision
 *
 * Portuguese Gramar Rules:
 * i) A conjuncao "e" e' sempre intercalada entre as centenas, as dezenas e as unidades:
 * a) novecentos e noventa e nove Euros.
 *
 * ii) Nao se emprega a conjuncao entre os milhares e as centenas, salvo quando o numero
 * terminar numa centena com dois zeros:
 * a) mil duzentos e trinta euros;
 * b) mil e duzentos.
 *
 * iii) Em numeros muito grandes (acima do milhao?), a conjuncao "e" emprega-se entre os membros
 * da mesma ordem de unidades, e omite-se quando se passa de uma ordem a outra:
 * a) duzentos e noventa e tres mil quinhentos e setenta e dois;
 * b) trezentos e trinta e dois bilioes, quatrocentos e quinze milhões, setecentos e quarenta e um mil duzentos e onze.
 *
 * Nova Gramatica do Portugues Contemporaneo, Edicoes Joao Sa da Costa
 *
 *******************************************************************************/
package org.dma.java.numerals;

import java.util.Locale;

public class PTWordNumerals extends WordNumerals {

	public static final NumeralUnit UNIT_EURO = new NumeralUnit("Euros", "Cêntimos");

	public static final NumeralUnit UNIT_METER = new NumeralUnit("Metros", "Centímetros");

	/** EURO by default */
	public PTWordNumerals(int scale) {
		this(scale, UNIT_EURO);
	}

	public PTWordNumerals(int scale, NumeralUnit unit) {
		super(new Locale("PT"), scale, unit);
	}


}