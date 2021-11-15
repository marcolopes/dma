/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.payment;

import java.math.BigDecimal;
import java.util.Date;

import org.dma.java.util.RandomValue;
import org.dma.java.util.StringUtils;
import org.dma.java.util.TimeDateUtils;

/*
 * Entidade – entidade utilizada no pagamento (5 digitos)
 * Referencia – referencia multibanco paga (9 digitos)
 * Valor – valor pago em euros
 * Id – id utilizado na geracao da referencia multibanco (4 digitos)
 * DtHrPagamento – data/hora do pagamento em formato dd/MM/yyyy HH:mm:ss
 * Processamento – data de processamento yyyyMMdd
 * Terminal – terminal utilizado no pagamento
 * Tarifa – tarifa do servico
 * ValorLiquido – valor pago deduzido da tarifa
 * CodigoErro – codigo de erro
 * MensagemErro – mensagem de erro
 *
 * Codigos Erro:
 * 0 - Sucesso.
 * 1 - Nao existem pagamentos.
 * 2 - Erro nas Datas/Horas.
 * 3 - Chave invalida.
 * 9 - Erro desconhecido.
 */
public class IfThenPayServiceResponseType {

	public final String entidade;
	public final String referencia;
	public final BigDecimal valor;
	public final Integer id;
	public final Date dtHrPagamento;
	public final Date processamento;
	public final String terminal;
	public final BigDecimal tarifa;
	public final BigDecimal valorLiquido;
	public final Integer codigoErro;
	public final String mensagemErro;

	/** Debug */
	public IfThenPayServiceResponseType() {
		this(new RandomValue().numbers(5),
			new RandomValue().numbers(9),
			new RandomValue().Decimal(3,2),
			new RandomValue().Integer(4),
			TimeDateUtils.getCurrentDate(),
			TimeDateUtils.getCurrentDate(),
			new RandomValue().string(10),
			new RandomValue().Decimal(0,2),
			new RandomValue().Decimal(3,2),
			new RandomValue().Integer(4),
			new RandomValue().string(50));
	}

	public IfThenPayServiceResponseType(String entidade, String referencia, String valor, String id,
			String dtHrPagamento, String processamento, String terminal, String tarifa, String valorLiquido,
			String codigoErro, String mensagemErro) {
		this(entidade, referencia,
				valor.isEmpty() ? BigDecimal.ZERO : new BigDecimal(valor.replace(',','.')),
				id.isEmpty() ? 0 : Integer.valueOf(id),
				TimeDateUtils.getDate(dtHrPagamento, "dd/MM/yyyy HH:mm:ss"),
				TimeDateUtils.getDate(processamento, "yyyyMMdd"), terminal,
				tarifa.isEmpty() ? BigDecimal.ZERO : new BigDecimal(tarifa.replace(',','.')),
				valorLiquido.isEmpty() ? BigDecimal.ZERO : new BigDecimal(valorLiquido.replace(',','.')),
				StringUtils.val(codigoErro), mensagemErro);
	}

	public IfThenPayServiceResponseType(String entidade, String referencia, BigDecimal valor, Integer id,
			Date dtHrPagamento, Date processamento, String terminal, BigDecimal tarifa, BigDecimal valorLiquido,
			Integer codigoErro, String mensagemErro) {
		this.entidade=entidade;
		this.referencia=referencia;
		this.valor=valor;
		this.id=id;
		this.dtHrPagamento=dtHrPagamento==null ? TimeDateUtils.getCurrentDate() : dtHrPagamento;
		this.processamento=processamento==null ? TimeDateUtils.getCurrentDate() : processamento;
		this.terminal=terminal;
		this.tarifa=tarifa;
		this.valorLiquido=valorLiquido;
		this.codigoErro=codigoErro;
		this.mensagemErro=mensagemErro;
	}


	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getClass().getSimpleName() +
				" [entidade=" + entidade +
				", referencia=" + referencia +
				", valor=" + valor + "]";
	}

}