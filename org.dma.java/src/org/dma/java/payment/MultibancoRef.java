/*******************************************************************************
 * Copyright 2008-2023 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.java.payment;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import org.dma.java.util.MessageList;
import org.dma.java.util.StringUtils;

@Deprecated
public class MultibancoRef {

	public static final MultibancoRef DEFAULT = new MultibancoRef("999", "999999999", new BigDecimal("999999.99"));

	public static final String DECIMAL_PATTERN = "###,##0.00";

	private final String entity;
	private final String ref9;
	private final BigDecimal value;

	/** 123 */
	public String getEntity() {return entity;}
	/** 123 */
	public String getEntityToText() {return entity;}
	/** 123456789 */
	public String getRef9() {return ref9;}
	/** 123 456 789 */
	public String getRef9ToText() {return ref9.substring(0,3)+" "+ref9.substring(3,6)+" "+ref9.substring(6,9);}
	/** 123456.78 */
	public BigDecimal getValue() {return value;}
	/** 123.456,78€ */
	public String getValueToText() {
		DecimalFormatSymbols symbols=new DecimalFormatSymbols();
		symbols.setDecimalSeparator(',');
		symbols.setGroupingSeparator('.');
		DecimalFormat df=new DecimalFormat(DECIMAL_PATTERN, symbols);
		return df.format(value)+"€";
	}

	public MultibancoRef(String entity, String ref9, BigDecimal value) {
		this.entity=entity;
		this.ref9=ref9;
		this.value=value;
	}

	public String toText() {
		return new MessageList(
				"PAGAMENTO MULTIBANCO",
				StringUtils.replicas("─", 10+13),
				StringUtils.padRight("ENTIDADE",10,' ') + StringUtils.padLeft(getEntityToText(),13,' '),
				StringUtils.padRight("REFERENCIA",10,' ') + StringUtils.padLeft(getRef9ToText(),13,' '),
				StringUtils.padRight("MONTANTE",10,' ') + StringUtils.padLeft(getValueToText(),13,' '),
				StringUtils.replicas("─", 10+13)).toString();
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() +
				" [entity=" + entity +
				", ref9=" + ref9 +
				", value=" + value + "]";
	}

}