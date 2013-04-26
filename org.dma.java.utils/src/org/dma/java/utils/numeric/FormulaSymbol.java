/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.utils.numeric;

import java.math.BigDecimal;

public final class FormulaSymbol {

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
