/*******************************************************************************
 * Copyright 2008-2021 Marco Lopes (marcolopespt@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
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

		public boolean isEmpty() {
			return name==null || name.trim().isEmpty() || value==null;
		}

		public String toString() {
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

			Debug.out("symbol #"+index, symbol);

			if (symbol!=null && !symbol.isEmpty()){
				String name=ignoreCase ? symbol.name.toLowerCase() : symbol.name;
				enumeration=enumeration.replace(name, String.valueOf(symbol.value));
				index++;
			}

		}

		Debug.out("enumeration", enumeration);

		if (!enumeration.equals(formula)) try{

			Object value=interpreter.eval("result="+enumeration);
			Debug.out(interpreter.get("result").toString());
			Debug.out(value);

			return value instanceof Double ?
					new BigDecimal((Double)value) : new BigDecimal(value.toString());

		}catch(NumberFormatException e){
		}catch(ScriptException e){
			System.out.println(e);
		}catch(Exception e){
			e.printStackTrace();
		}return BigDecimal.ZERO;

	}


	public boolean isValid(String...vars) {

		FormulaSymbol[] symbols=new FormulaSymbol[vars.length];
		for(int i=0; i<vars.length; i++){
			symbols[i]=new FormulaSymbol(vars[i], BigDecimal.valueOf(i+1));
		}return eval(symbols).signum()!=0;

	}


	public static void main(String[] args) {

		BigDecimal x = new BigDecimal("10.01");
		BigDecimal y = new BigDecimal("10.02");
		System.out.println(x.multiply(y));

		MathFormula mf=new MathFormula("x * y", true);
		System.out.println(mf.isValid("x"));
		System.out.println(mf.isValid("x", "y"));
		BigDecimal result=mf.eval(new FormulaSymbol("x", x), new FormulaSymbol("y", y));
		System.out.println(result);

	}

}
