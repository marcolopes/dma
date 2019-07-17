/*******************************************************************************
 * 2008-2013 Public Domain
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

public class Numerals {

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
		new String[]{"Euro","Euros"}, new String[]{"Cêntimo","Cêntimos"});

	public static final NumeralsUnit UNIT_METER = new NumeralsUnit(
		new String[]{"Metro","Metros"}, new String[]{"Centímetro","Centímetros"});

	private enum QUALIFIERS {

		SINGULAR (new String[]{
			"mil", "milhão", "bilião", "trilião", "quatrilião",
			"quintilião", "sextilião", "septilião", "octilião", "nonilião"}),

		PLURAL (new String[]{
			"mil", "milhões", "biliões", "triliões", "quatriliões",
			"quintiliões", "sextiliões", "septiliões", "octiliões", "noniliões"});

		public String[] names;

		QUALIFIERS(String[] names){
			this.names=names;
		}

	}

	private enum NUMERALS {

		GROUP0_19 (new String[]{"zero",
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

		NUMERALS(String[] names){
			this.names=names;
		}

	}

	private enum CONJUNCTION {

		AND ("e"),
		OF ("de");

		public String name;

		CONJUNCTION(String name){
			this.name=name;
		}

	}

	//number of decimals
	private final int scale;
	//unit label
	private final NumeralsUnit unit;

	/** EURO by default */
	public Numerals(int scale) {
		this(scale,UNIT_EURO);
	}

	public Numerals(int scale, NumeralsUnit unit) {
		this.scale=scale;
		this.unit=unit;
	}


	public String toString(BigDecimal value) {

		String s="";

		value=value.abs().setScale(scale, RoundingMode.HALF_EVEN);

		//retrieves integer and decimal
		BigInteger integer=value.abs().toBigInteger();
		/*
		BigInteger decimal=value.remainder(BigDecimal.ONE).
			multiply(BigDecimal.valueOf(100)).toBigInteger();
		*/
		BigInteger decimal=(value.subtract(new BigDecimal(integer))).
				multiply(new BigDecimal(100)).toBigInteger();

		//processes ZERO
		if (value.signum()==0){
			s+=orderToString(0)+unit.integer[1];
		}
		//processes integer
		else if (integer.signum()>0){
			s+=ordersToString(getOrders(integer), unit.integer);
		}
		//processes decimal
		if (decimal.signum()>0){
			s+=s.isEmpty() ? "" : " "+CONJUNCTION.AND.name+" ";
			s+=ordersToString(getOrders(decimal), unit.decimal);
		}

		//capitalize
		return s.substring(0,1).toUpperCase() + s.substring(1);

	}


	/** Dismembers value into orders */
	private List<Integer> getOrders(BigInteger value) {

		List<Integer> orders=new ArrayList();

		while(value.compareTo(BigInteger.valueOf(1000))>=0) {
			orders.add(value.remainder(BigInteger.valueOf(1000)).intValue());
			value=value.divide(BigInteger.valueOf(1000));
		}
		orders.add(value.intValue());

		return orders;

	}

	/** Concatenates all the orders */
	private String ordersToString(List<Integer> orders, String[] unit) {

		String s="";

		try{
			//last order index
			int last=0;
			//first order value
			Integer order0=orders.get(0);
			//processes below 999
			s+=order0>0 ? orderToString(order0) : "";
			//processes above 999
			for (int i=1; i<orders.size(); i++){

				Integer value=orders.get(i);

				if (value!=0){

					String q=value==1 ?
						QUALIFIERS.SINGULAR.names[i-1] :
						QUALIFIERS.PLURAL.names[i-1];
					/*
					 * ordem actual >= MILHOES
					 * ordem anterior = CENTENAS
					 * nao existem centenas
					 * (MILHOES DE; BILIOES DE; etc)
					 */
					if (i>=2 && last==0 && order0==0){
						q+=" "+CONJUNCTION.OF.name+" ";
					}
					/*
					 * ordem anterior = CENTENAS
					 * existem centenas (EVITA MIL E ?)
					 * centenas inferiores a 100 (E UM; E DOIS; etc)
					 * centenas multiplas de 100 (E CEM; E DUZENTOS; etc)
					 */
					else if (last==0 && order0>0 && (order0<100 || order0%100==0)){
						q+=" "+CONJUNCTION.AND.name+" ";
					}
					/*
					 * ordem actual >= MILHOES
					 * (SEPARA MILHOES, BILIOES, etc)
					 */
					else if (i>=2){
						q+=", ";
					}
					else q+=" ";

					/*
					 * ordem actual = MILHARES
					 * milhares = 1
					 * (EVITA "UM MIL")
					 */
					if (i==1 && value==1){
						s=q+s;
					}else{
						s=orderToString(value)+q+s;
					}

					last=i;

				}

			}

			//para evitar "UM" + PLURAL da moeda
			if (orders.size()==1 && order0==1)
				s+=unit[0];
			else
				s+=unit[1];

		}catch(Exception e){
			Debug.err(e);
		}

		return s;

	}


	/** Creates order string */
	private String orderToString(Integer value) {

		String s="";

		if (value<20){
			s+=NUMERALS.GROUP0_19.names[value]+" ";
		}
		else if (value<100){
			s+=NUMERALS.GROUP20_90.names[value/10-2]+" ";
			s+=value%10!=0 ? CONJUNCTION.AND.name+" "+orderToString(value%10) : "";
		}
		else if (value==100){
			s+=NUMERALS.GROUP100.names[0]+" ";
		}
		else if (value<1000){
			s+=NUMERALS.GROUP101_900.names[value/100-1]+" ";
			s+=value%100!=0 ? CONJUNCTION.AND.name+" "+orderToString(value%100) : "";
		}

		return s;

	}


	/** Test Case */
	public static void main(String[] argvs) {

		Numerals numerals=new Numerals(2);

		//TESTE dos EXEMPLOS apresentados em "Nova Gramatica do Portugues Contemporaneo"
		final BigDecimal[] VALUES={
			new BigDecimal("999"),
			new BigDecimal("1230"),
			new BigDecimal("1200"),
			new BigDecimal("293572"),
			new BigDecimal("332415741211")};

		for(BigDecimal value: VALUES){
			System.out.println(String.format(
					"%-14s", value.toPlainString())+": "+numerals.toString(value));
		}

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
			for(BigDecimal j=BigDecimal.valueOf(interval[0]);
					j.doubleValue()<=interval[1]; j=j.add(BigDecimal.valueOf(interval[2]))){
				System.out.println(String.format(
						"%-14s", j.toPlainString())+": "+numerals.toString(j));
			}
		}

	}


}