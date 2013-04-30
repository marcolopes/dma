/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.utils.numeric;

import java.math.BigDecimal;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.dma.java.utils.Debug;

public class MathFormula {

	public static class FormulaSymbol {

		public String name;
		public BigDecimal value;

		public FormulaSymbol(String var, BigDecimal value){
			this.name = var;
			this.value = value;
		}

		public boolean isEmpty(){
			return name==null || name.trim().isEmpty() || value==null;
		}

		public String toString(){
			return name+"="+value;
		}

	}

	private final String formula;
	private final boolean lowercase;

	private final ScriptEngine interpreter=new ScriptEngineManager().getEngineByName("JavaScript");

	public MathFormula(String formula, boolean lowercase){
		this.formula=lowercase ? formula.toLowerCase() : formula;
		this.lowercase=lowercase;
	}


	public BigDecimal eval(FormulaSymbol...symbols) {

		BigDecimal result=null;

		try{
			Debug.out("formula",formula);

			String enumeration=formula;
			for (int i=0; i<symbols.length; i++){

				if (symbols[i]!=null && !symbols[i].isEmpty()){
					Debug.out("symbol #"+i,symbols[i]);
					String name=lowercase ? symbols[i].name.toLowerCase() : symbols[i].name;

					enumeration=enumeration.replace(name, String.valueOf(symbols[i].value));
					Debug.out("enumeration #"+i,enumeration);
				}

			}

			Debug.out("formula",formula);
			Debug.out("enumeration",enumeration);

			if (!enumeration.equals(formula)){

				Object value=interpreter.eval("result="+enumeration);
				Debug.out("value",interpreter.get("result"));

				result=BigDecimal.valueOf((Double)value);
				Debug.out("result",result);
			}

		}catch(ScriptException e){
		}catch(Exception e){
			e.printStackTrace();
		}

		return result;

	}


	public boolean isValid(String...vars) {

		FormulaSymbol[] symbols=new FormulaSymbol[vars.length];
		for (int i=0; i<vars.length; i++){
			symbols[i]=new FormulaSymbol(vars[i], BigDecimal.valueOf(i+1));
		}

		return eval(symbols)!=null;

	}


}
