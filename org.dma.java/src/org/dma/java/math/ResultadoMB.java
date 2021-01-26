/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.math;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import org.dma.java.util.StringUtils;

public class ResultadoMB {

	public final static ResultadoMB EXEMPLO = new ResultadoMB("123", "123456789", new BigDecimal("123.00"));

	public final static String DECIMAL_PATTERN = "###,##0.00";

	public final String entidade;
	public final String ref9;
	public final BigDecimal valor;

	public ResultadoMB() {
		this("000", "000000000", BigDecimal.ZERO);
	}

	public ResultadoMB(String entidade, String ref9, BigDecimal valor) {
		this.entidade=entidade;
		this.ref9=ref9;
		this.valor=valor;
	}

	/** Devolve {@link ResultadoMB#entidade} */
	public String getEntidade() {
		return entidade;
	}

	/** Devolve {@link ResultadoMB#ref9} formatado */
	public String getReferencia() {
		return ref9.substring(0,3)+" "+ref9.substring(3,6)+" "+ref9.substring(6,9);
	}

	/** Devolve {@link ResultadoMB#valor} formatado */
	public String getMontante() {
		DecimalFormatSymbols symbols=new DecimalFormatSymbols();
		symbols.setDecimalSeparator(',');
		symbols.setGroupingSeparator('.');
		DecimalFormat df = new DecimalFormat(DECIMAL_PATTERN, symbols);
		return df.format(valor)+"€";
	}

	public String toText() {
		return "PAGAMENTO MULTIBANCO" +"\n"+
			StringUtils.replicate('─',10+13) +"\n"+
			"ENTIDADE  " + StringUtils.padLeft(getEntidade(),13,' ') +"\n"+
			"REFERENCIA" + StringUtils.padLeft(getReferencia(),13,' ') +"\n"+
			"MONTANTE  " + StringUtils.padLeft(getMontante(),13,' ') +"\n"+
			StringUtils.replicate('─',10+13);
	}

}