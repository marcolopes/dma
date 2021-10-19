/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.payment;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import org.dma.java.util.StringUtils;

public class MultibancoRef {

	public final static MultibancoRef EXAMPLE = new MultibancoRef("123", "123456789", new BigDecimal("123.00"));

	public final static String DECIMAL_PATTERN = "###,##0.00";

	public final String entity;
	public final String ref9;
	public final BigDecimal value;

	public MultibancoRef() {
		this("000", "000000000", BigDecimal.ZERO);
	}

	public MultibancoRef(String entity, String ref9, BigDecimal value) {
		this.entity=entity;
		this.ref9=ref9;
		this.value=value;
	}

	/** Devolve {@link MultibancoRef#entity} */
	public String getEntidade() {
		return entity;
	}

	/** Devolve {@link MultibancoRef#ref9} formatado */
	public String getReferencia() {
		return ref9.substring(0,3)+" "+ref9.substring(3,6)+" "+ref9.substring(6,9);
	}

	/** Devolve {@link MultibancoRef#value} formatado */
	public String getMontante() {
		DecimalFormatSymbols symbols=new DecimalFormatSymbols();
		symbols.setDecimalSeparator(',');
		symbols.setGroupingSeparator('.');
		DecimalFormat df = new DecimalFormat(DECIMAL_PATTERN, symbols);
		return df.format(value)+"€";
	}

	public String toText() {
		return "PAGAMENTO MULTIBANCO" +"\n"+
			StringUtils.replicas("─",10+13) +"\n"+
			"ENTIDADE  " + StringUtils.padLeft(getEntidade(),13,' ') +"\n"+
			"REFERENCIA" + StringUtils.padLeft(getReferencia(),13,' ') +"\n"+
			"MONTANTE  " + StringUtils.padLeft(getMontante(),13,' ') +"\n"+
			StringUtils.replicas("─",10+13);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() +
				" [entity=" + entity +
				", ref9=" + ref9 +
				", value=" + value + "]";
	}

}