/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.math;

import java.math.BigDecimal;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.dma.java.util.Debug;

public class MathFormula {

	public static class FormulaSymbol {

		public String name;
		public BigDecimal value;

		public FormulaSymbol(String var, BigDecimal value){
			this.name=var;
			this.value=value;
		}

		public boolean isEmpty(){
			return name==null || name.trim().isEmpty() || value==null;
		}

		public String toString(){
			return name+"="+value;
		}

	}

	private final String formula;
	private final boolean ignoreCase;

	private final ScriptEngine interpreter=new ScriptEngineManager().getEngineByName("JavaScript");

	public MathFormula(String formula, boolean ignoreCase){
		this.formula=ignoreCase ? formula.toLowerCase() : formula;
		this.ignoreCase=ignoreCase;
	}


	public BigDecimal eval(FormulaSymbol...symbols) {

		Debug.out("formula", formula);

		int index=0;
		String enumeration=formula;
		for(FormulaSymbol symbol: symbols){

			if(symbol!=null && !symbol.isEmpty()){
				String name=ignoreCase ? symbol.name.toLowerCase() : symbol.name;
				enumeration=enumeration.replace(name, String.valueOf(symbol.value));
				Debug.out("symbol #"+index, symbol);
				Debug.out("enumeration #"+index, enumeration);
				index++;
			}

		}

		Debug.out("formula", formula);
		Debug.out("enumeration", enumeration);

		if(!enumeration.equals(formula)) try{

			Object value=interpreter.eval("result="+enumeration);
			Debug.out("value",interpreter.get("result"));

			BigDecimal result=new BigDecimal(value.toString());
			Debug.out("result",result);

			return result;

		}catch(ScriptException e){
			System.out.println(e);
		}catch(Exception e){
			e.printStackTrace();
		}

		return null;

	}


	public boolean isValid(String...vars) {

		FormulaSymbol[] symbols=new FormulaSymbol[vars.length];
		for(int i=0; i<vars.length; i++){
			symbols[i]=new FormulaSymbol(vars[i], BigDecimal.valueOf(i+1));
		}

		return eval(symbols)!=null;

	}


	public static void main(String[] argvs) {

		MathFormula mf=new MathFormula("x * y", true);

		BigDecimal result=mf.eval(
			new FormulaSymbol("x", new BigDecimal("10.01")),
			new FormulaSymbol("y", new BigDecimal("10.02")));

		System.out.println(result);

	}

}
