/*******************************************************************************
 * Copyright 2008-2015 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.eclipse.core.bindings.converters;

import org.eclipse.core.databinding.conversion.IConverter;

public abstract class CustomConverter implements IConverter {

	private final Class fromType, toType;

	public CustomConverter(Class fromType, Class toType) {
		this.fromType=fromType;
		this.toType=toType;
	}

	@Override
	public Class getFromType() {
		return fromType;
	}


	@Override
	public Class getToType() {
		return toType;
	}


}