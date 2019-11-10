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

		/** ZERO based index */
		public String name(int index) {
			//avoids overflow
			return index>=names.length ? "???" : names[index];
		}

		public static QUALIFIERS get(int value) {
			return value==1 ? SINGULAR : PLURAL;
		}

	}

	public enum NUMERALS {

		GROUP0 (new String[]{"zero"}),

		GROUP1_19 (new String[]{
			"um", "dois", "três", "quatro", "cinco",
			"seis", "sete", "oito", "nove", "dez",
			"onze", "doze", "treze", "catorze", "quinze",
			"dezasseis", "dezassete", "dezoito", "dezanove"}),

		GROUP20_90 (new String[]{
			"vinte", "trinta", "quarenta", "cinquenta",
			"sessenta",	"setenta", "oitenta", "noventa"}),

		GROUP100 (new String[]{"cem"}),

		GROUP101_900 (new String[]{
			"cento", "duzentos", "trezentos", "quatrocentos", "quinhentos",
			"seiscentos", "setecentos", "oitocentos", "novecentos"});

		public String[] names;

		NUMERALS(String[] names) {
			this.names=names;
		}

		private static String toString(int value, String str) {
			if (value<=0 || value>999) return str;
			if (!str.isEmpty()) str+=" "+CONJUNCTIONS.AND.name+" ";
			if (value<20) return str+GROUP1_19.names[value-1];
			if (value<100) return str+toString(value%10, GROUP20_90.names[value/10-2]);
			if (value==100) return str+GROUP100.names[0];
			return toString(value%100, GROUP101_900.names[value/100-1]);
		}

		/** Creates order string */
		public static String toString(int value) {
			return value==0 ? GROUP0.names[0] : toString(value, "");
		}

		public static void debug() {
			for(int[] interval: new int[][]{{0,201,1}, {999,1001,1}}){
				for(int value=interval[0]; value<=interval[1]; value+=interval[2]){
					System.out.println(String.format("%-14s", value)+": "+toString(value));
				}
			}
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
			BigInteger decimal=(scaled.subtract(new BigDecimal(integer))).multiply(new BigDecimal(100)).toBigInteger();
			//BigInteger decimal=scaled.remainder(BigDecimal.ONE).multiply(BigDecimal.valueOf(100)).toBigInteger();
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

		//previous order index
		int previous=0;

		for (int index=0; index<orders.size(); index++) try{

			int value=orders.get(index);

			//NOT ZERO?
			if (value>0){

				//inserts qualifier (NO qualifier for hundreds)
				String qualifier=index==0 ? "" : QUALIFIERS.get(value).name(index-1);
				if (!qualifier.isEmpty()){
					/*
					 * ordem actual >= MILHOES?
					 * ordem anterior = CENTENAS?
					 * nao existem centenas?
					 * (MILHOES DE; BILIOES DE; etc)
					 */
					if (index>=2 && previous==0 && orders.get(0)==0)
						sb.insert(0, qualifier+" "+CONJUNCTIONS.OF.name+" ");
					/*
					 * ordem anterior = CENTENAS?
					 * existem centenas? (EVITA MIL E ?)
					 * centenas inferiores a 100? (E UM; E DOIS; etc)
					 * centenas multiplas de 100? (E CEM; E DUZENTOS; etc)
					 */
					else if (previous==0 && orders.get(0)>0 &&
							(orders.get(0)<100 || orders.get(0)%100==0))
						sb.insert(0, qualifier+" "+CONJUNCTIONS.AND.name+" ");
					/*
					 * ordem actual >= MILHOES?
					 * (SEPARA MILHOES, BILIOES, etc)
					 */
					else if (index>=2) sb.insert(0, qualifier+", ");
					else sb.insert(0, qualifier+" ");
				}

				//inserts numeral (evita "UM MIL")
				String numeral=index==1 && value==1 ? "" : NUMERALS.toString(value);
				if (!numeral.isEmpty()) sb.insert(0, numeral+" ");

				previous=index;

			}

		}catch(Exception e){
			Debug.err(e);
		}

		//evita "UM" + PLURAL da unidade
		sb.append(unit[orders.size()==1 && orders.get(0)==1 ? 0 : 1]);

		return sb.toString();

	}


	/** Test Case */
	public static void main(String[] argvs) {

		//NUMERALS.debug();

		//teste de "overflow"
		BigDecimal overflow=new BigDecimal("123456789000000000000000000000000000");
		System.out.println("=== OVERFLOW ===");
		System.out.println(overflow);
		System.out.println(new WordNumerals(0).toString(overflow));

		WordNumerals numerals=new WordNumerals(2);

		//teste de intervalos
		int index=0;
		for(double[] interval: new double[][]{
			{.0,.09,.01},
			{.90,.99,.01},
			{1,1.99,.01},
			{2,2.99,.1},
			{3,200,1},
			{999,1001,1},
			{1229,1231,1},
			{1999,2001,1},
			{9999,10001,1},
			{101099,101101,1},
			{123449,123451,1},
			{999999,1000001,1},
			{10010099,10010101,1},
			{12345669,12345671,1},
			{999999999,1000000001,1},
			{1000567099,1000567101,1},
			{1000010000,1000010002,1},
			{1001000000,1001000002,1},
			{1010010000,1010010002,1},
			{1234567889,1234567891,1}}){
			System.out.println();
			System.out.println("=== INTERVALO #"+(index++)+" ===");
			for(BigDecimal value=BigDecimal.valueOf(interval[0]); value.doubleValue()<=interval[1];
					value=value.add(BigDecimal.valueOf(interval[2]))){
				System.out.println(String.format("%-14s",
						value.toPlainString())+": "+numerals.toString(value));
			}
		}

		//teste "Nova Gramatica do Portugues Contemporaneo"
		System.out.println();
		System.out.println("=== Nova Gramatica do Portugues Contemporaneo ===");
		for(BigDecimal value: new BigDecimal[]{
			new BigDecimal("999"),
			new BigDecimal("1230"),
			new BigDecimal("1200"),
			new BigDecimal("293572"),
			new BigDecimal("332415741211")}){
			System.out.println(String.format("%-14s",
					value.toPlainString())+": "+numerals.toString(value));
		}

	}


}