/*******************************************************************************
 * Copyright 2008-2020 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.java.input;

public interface IFieldProperties {

	public static final int NONE = 0;

	/** Allows DIGITS and SPACES */
	public static final int DIGITS = 1 << 0;

	/** Allows LETTERS and SPACES */
	public static final int LETTERS = 1 << 1;

	/** Allows POSITIVE numbers */
	public static final int POSITIVE = 1 << 2;

	/** Does not allow SPACES */
	public static final int NOSPACES = 1 << 3;

	/** Converts to uppercase */
	public static final int UPPERCASE = 1 << 4;

	/** Converts to lowercase */
	public static final int LOWERCASE = 1 << 5;


}
