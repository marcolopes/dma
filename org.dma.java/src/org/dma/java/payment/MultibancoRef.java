/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.payment;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import org.dma.java.util.StringList;
import org.dma.java.util.StringUtils;

public class MultibancoRef {

	public final static MultibancoRef EXAMPLE = new MultibancoRef("123", "123456789", new BigDecimal("123456.12"));

	public final static String DECIMAL_PATTERN = "###,##0.00";

	private final String entity;
	private final String ref9;
	private final BigDecimal value;

	public MultibancoRef() {
		this(EXAMPLE.entity, EXAMPLE.ref9, EXAMPLE.value);
	}

	public MultibancoRef(String entity, String ref9, BigDecimal value) {
		this.entity=entity;
		this.ref9=ref9;
		this.value=value;
	}

	public String getEntity() {
		return entity;
	}

	/** 123 */
	public String getEntityToText() {
		return entity;
	}


	public String getRef9() {
		return ref9;
	}

	/** 123 456 789 */
	public String getRef9ToText() {
		return ref9.substring(0,3)+" "+ref9.substring(3,6)+" "+ref9.substring(6,9);
	}


	public BigDecimal getValue() {
		return value;
	}

	/** 123.456,78€ */
	public String getValueToText() {
		DecimalFormatSymbols symbols=new DecimalFormatSymbols();
		symbols.setDecimalSeparator(',');
		symbols.setGroupingSeparator('.');
		DecimalFormat df=new DecimalFormat(DECIMAL_PATTERN, symbols);
		return df.format(value)+"€";
	}

	public String toText() {
		StringList list=new StringList();
		list.add("PAGAMENTO MULTIBANCO");
		list.add(StringUtils.replicas("─", 10+13));
		list.add(StringUtils.padRight("ENTIDADE",10,' ') + StringUtils.padLeft(getEntityToText(),13,' '));
		list.add(StringUtils.padRight("REFERENCIA",10,' ') + StringUtils.padLeft(getRef9ToText(),13,' '));
		list.add(StringUtils.padRight("MONTANTE",10,' ') + StringUtils.padLeft(getValueToText(),13,' '));
		list.add(StringUtils.replicas("─", 10+13));
		return list.concat("\n");
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() +
				" [entity=" + entity +
				", ref9=" + ref9 +
				", value=" + value + "]";
	}

}