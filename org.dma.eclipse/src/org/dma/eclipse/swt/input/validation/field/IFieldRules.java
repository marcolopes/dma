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

public interface IFieldRules {

	/** No automatic validation */
	public static final int DEFAULT = 0;

	/** Field will be disabled */
	public static final int READONLY = 1 << 0;

	/** Field cannot be edited */
	public static final int NOTEDITABLE = 1 << 1;

	@Deprecated
	public static final int NOTZERO = 1 << 2;

	/** Field cannot be empty / must have selection */
	public static final int NOTEMPTY = 1 << 3;

	/** Field length must be exact */
	public static final int LIMITMATCH = 1 << 4;


}