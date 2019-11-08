/*******************************************************************************
 * 2008-2019 Public Domain
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
package org.dma.java.math;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import org.dma.java.util.Debug;

public class WordNumerals {

	public static class NumeralsUnit {

		public String[] integer;
		public String[] decimal;

		/**
		 * @param integer singular, plural
		 * @param decimal singular, plural
		 */
		public NumeralsUnit(String[] integer, String[] decimal){
			this.integer=integer;
			this.decimal=decimal;
		}

	}

	public static final NumeralsUnit UNIT_EURO = new NumeralsUnit(
		new String[]{"Euro", "Euros"}, new String[]{"Cêntimo", "Cêntimos"});

	public static final NumeralsUnit UNIT_METER = new NumeralsUnit(
		new String[]{"Metro", "Metros"}, new String[]{"Centímetro", "Centímetros"});

	public enum CONJUNCTIONS {

		AND ("e"),
		OF ("de");

		public String name;

		CONJUNCTIONS(String name) {
			this.name=name;
		}

	}

	public enum QUALIFIERS {

		SINGULAR (new String[]{
			"mil", "milhão", "bilião", "trilião", "quatrilião",
			"quintilião", "sextilião", "septilião", "octilião", "nonilião"}),

		PLURAL (new String[]{
			"mil", "milhões", "biliões", "triliões", "quatriliões",
			"quintiliões", "sextiliões", "septiliões", "octiliões", "noniliões"});

		public String[] names;

		QUALIFIERS(String[] names) {
			this.names=names;
		}

		/** Creates qualifier string */
		public String toString(int index, int previous, int value999) {
			//NO qualifier below 999
			if (index==0) return "";
			//avoids overflow
			String qualifier=index>names.length ? "???" : names[index-1];
			/*
			 * ordem actual >= MILHOES?
			 * ordem anterior = CENTENAS?
			 * nao existem centenas?
			 * (MILHOES DE; BILIOES DE; etc)
			 */
			if (index>=2 && previous==0 && value999==0)
				return qualifier+" "+CONJUNCTIONS.OF.name;
			/*
			 * ordem anterior = CENTENAS?
			 * existem centenas? (EVITA MIL E ?)
			 * centenas inferiores a 100? (E UM; E DOIS; etc)
			 * centenas multiplas de 100? (E CEM; E DUZENTOS; etc)
			 */
			if (previous==0 && value999>0 && (value999<100 || value999%100==0))
				return qualifier+" "+CONJUNCTIONS.AND.name;
			/*
			 * ordem actual >= MILHOES?
			 * (SEPARA MILHOES, BILIOES, etc)
			 */
			if (index>=2) return qualifier+",";
			return qualifier;
		}

		public static QUALIFIERS get(int value) {
			return value==1 ? SINGULAR : PLURAL;
		}

	}

	public enum NUMERALS {

		GROUP0_19 (1, new String[]{"zero",
			"um", "dois", "três", "quatro", "cinco",
			"seis", "sete", "oito", "nove", "dez",
			"onze", "doze", "treze", "catorze", "quinze",
			"dezasseis", "dezassete", "dezoito", "dezanove"}),

		GROUP20_90 (10, new String[]{
			"vinte", "trinta", "quarenta", "cinquenta",
			"sessenta",	"setenta", "oitenta", "noventa"}),

		GROUP100 (100, new String[]{"cem"}),

		GROUP101_900 (100, new String[]{
			"cento", "duzentos", "trezentos", "quatrocentos", "quinhentos",
			"seiscentos", "setecentos", "oitocentos", "novecentos"});

		public String[] names;
		public int divisor;

		NUMERALS(int divisor, String[] names) {
			this.divisor=divisor;
			this.names=names;
		}

		public String name(int value) {
			switch(this){
			case GROUP0_19: return names[value];
			case GROUP20_90: return names[value/divisor-2];
			case GROUP100:
			case GROUP101_900: return names[value/divisor-1];
			}return null;
		}

		public static NUMERALS get(int value) {
			if (value<20) return GROUP0_19;
			if (value<100) return GROUP20_90;
			if (value==100) return GROUP100;
			if (value<1000) return GROUP101_900;
			throw new IllegalArgumentException(String.valueOf(value));
		}

		/** Creates order string */
		public static String toString(int value) {
			NUMERALS numeral=get(value);
			int remainder=value%numeral.divisor;
			return remainder==0 ? numeral.name(value) :
				numeral.name(value)+" "+CONJUNCTIONS.AND.name+" "+toString(remainder);
		}

	}

	//number of decimals
	private final int scale;
	//unit label
	private final NumeralsUnit unit;

	/** EURO by default */
	public WordNumerals(int scale) {
		this(scale, UNIT_EURO);
	}

	public WordNumerals(int scale, NumeralsUnit unit) {
		this.scale=scale;
		this.unit=unit;
	}


	public String toString(BigDecimal value) {

		String str="";

		BigDecimal scaled=value.abs().setScale(scale, RoundingMode.HALF_EVEN);

		//processes ZERO
		if (scaled.signum()==0) str+=NUMERALS.toString(0)+" "+unit.integer[1];
		else{
			//processes INTEGER
			BigInteger integer=scaled.abs().toBigInteger();
			if (integer.signum()>0) str+=ordersToString(getOrders(integer), unit.integer);

			//processes DECIMAL
			//BigInteger decimal=(scaled.subtract(new BigDecimal(integer))).multiply(new BigDecimal(100)).toBigInteger();
			BigInteger decimal=scaled.remainder(BigDecimal.ONE).multiply(BigDecimal.valueOf(100)).toBigInteger();
			if (decimal.signum()>0){
				if (integer.signum()>0) str+=" "+CONJUNCTIONS.AND.name+" ";
				str+=ordersToString(getOrders(decimal), unit.decimal);
			}
		}

		//capitalize
		return str.substring(0,1).toUpperCase() + str.substring(1);

	}


	/** Dismembers value into orders */
	private List<Integer> getOrders(BigInteger value) {

		List<Integer> orders=new ArrayList();

		//from low to high order
		while(value.compareTo(BigInteger.valueOf(1000))>=0){
			orders.add(value.remainder(BigInteger.valueOf(1000)).intValue());
			value=value.divide(BigInteger.valueOf(1000));
		}orders.add(value.intValue());

		return orders;

	}


	/** Concatenates all the orders */
	private String ordersToString(List<Integer> orders, String[] unit) {

		StringBuilder sb=new StringBuilder();

		//hundreds order value
		int value999=orders.get(0);

		//previous order index
		int previous=0;

		for (int index=0; index<orders.size(); index++) try{

			int value=orders.get(index);

			//NOT ZERO?
			if (value>0){

				String qualifier=QUALIFIERS.get(value).toString(index, previous, value999);
				//evita "UM MIL"
				String numeral=index==1 && value==1 ? "" : NUMERALS.toString(value);
				//inserts qualifier
				if (!qualifier.isEmpty()) sb.insert(0, " ");
				sb.insert(0, qualifier);
				//inserts numeral
				if (!numeral.isEmpty()) sb.insert(0, " ");
				sb.insert(0, numeral);

				previous=index;

			}

		}catch(Exception e){
			Debug.err(e);
		}

		//evita "UM" + PLURAL da unidade
		sb.append(unit[orders.size()==1 && value999==1 ? 0 : 1]);

		return sb.toString();

	}


	/** Test Case */
	public static void main(String[] argvs) {

		WordNumerals numerals=new WordNumerals(2);

		//teste de "overflow"
		BigDecimal overflow=new BigDecimal("123456789000000000000000000000000000");
		System.out.println("===OVERFLOW===");
		System.out.println(String.format(
				"%-14s", overflow.toPlainString())+": "+numerals.toString(overflow));

		//teste de intervalos
		final double[][] INTERVALS=new double[][]{
			{.0,.09,.01},
			{.90,.99,.01},
			{1,1.99,.01},
			{2,2.99,.1},
			{3,200,1},
			{999,1001,1},
			{2000,2001,1},
			{1230,1231,1},
			{9999,10001,1},
			{101100,101101,1},
			{123450,123451,1},
			{999999,1000001,1},
			{10010099,10010101,1},
			{12345670,12345671,1},
			{999999999,1000000001,1},
			{1000567099,1000567101,1},
			{1000010000,1000010002,1},
			{1001000000,1001000002,1},
			{1010010000,1010010002,1},
			{1234567890,1234567891,1}};

		int index=0;
		for(double[] interval: INTERVALS){
			System.out.println();
			System.out.println("===INTERVALO #"+(index++)+"===");
			for(BigDecimal value=BigDecimal.valueOf(interval[0]);
					value.doubleValue()<=interval[1]; value=value.add(BigDecimal.valueOf(interval[2]))){
				System.out.println(String.format(
						"%-14s", value.toPlainString())+": "+numerals.toString(value));
			}
		}

		//teste "Nova Gramatica do Portugues Contemporaneo"
		final BigDecimal[] VALUES={
			new BigDecimal("999"),
			new BigDecimal("1230"),
			new BigDecimal("1200"),
			new BigDecimal("293572"),
			new BigDecimal("332415741211")};

		System.out.println();
		System.out.println("===Nova Gramatica do Portugues Contemporaneo===");
		for(BigDecimal value: VALUES){
			System.out.println(String.format(
					"%-14s", value.toPlainString())+": "+numerals.toString(value));
		}

	}


}