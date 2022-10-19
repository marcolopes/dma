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
package org.dma.eclipse.swt.input.validation.field;

import org.dma.java.math.NumericUtils;

public class FieldRules implements IFieldRules {

	public final int rules;

	public FieldRules(int rules) {
		this.rules=rules;
	}

	public boolean is(int rules) {
		return NumericUtils.bit(this.rules, rules);
	}

	public boolean isReadOnly() {
		return is(READONLY);
	}

	public boolean isNotEditable(boolean edited) {
		return edited && is(NOTEDITABLE);
	}

	@Deprecated
	public boolean isNotZero() {
		return is(NOTZERO);
	}

	public boolean isNotEmpty() {
		return is(NOTEMPTY) || isNotZero();
	}

	public boolean isLimitMatch() {
		return is(LIMITMATCH);
	}

}