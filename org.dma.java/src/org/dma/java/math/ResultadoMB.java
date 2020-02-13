/*******************************************************************************
 * 2008-2020 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.math;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import org.dma.java.util.StringUtils;

public class ResultadoMB {

	public final static String DECIMAL_PATTERN = "###,##0.00";

	public final String entidade;
	public final String referencia;
	public final String montante;

	public ResultadoMB() {
		this("000", "000000000", BigDecimal.ZERO);
	}

	public ResultadoMB(String entidade, String ref9, BigDecimal valor) {
		this.entidade=entidade;
		this.referencia=ref9.substring(0,3)+" "+ref9.substring(3,6)+" "+ref9.substring(6,9);

		DecimalFormatSymbols symbols = new DecimalFormatSymbols();
		symbols.setDecimalSeparator(',');
		symbols.setGroupingSeparator('.');
		DecimalFormat df = new DecimalFormat(DECIMAL_PATTERN, symbols);
		montante=df.format(valor)+"€";
	}

	public String toText() {
		return "PAGAMENTO MULTIBANCO" +"\n"+
			StringUtils.replicate('─',10+13) +"\n"+
			"ENTIDADE  " + StringUtils.padLeft(entidade,13,' ') +"\n"+
			"REFERENCIA" + StringUtils.padLeft(referencia,13,' ') +"\n"+
			"MONTANTE  " + StringUtils.padLeft(montante,13,' ') +"\n"+
			StringUtils.replicate('─',10+13);
	}

}