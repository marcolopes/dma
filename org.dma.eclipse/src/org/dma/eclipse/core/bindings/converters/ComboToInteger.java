/*******************************************************************************
 * Copyright 2008-2017 Marco Lopes (marcolopespt@gmail.com)
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

public class ComboToInteger extends CustomConverter {

	private final String[] elements;

	public ComboToInteger(String[] elements) {
		super(String.class, Integer.class);
		this.elements=elements;
	}


	@Override
	public Integer convert(Object fromObject) {
		for(int i=0; i<elements.length; i++){
			if(elements[i].equals(fromObject)) return i;
		}return 0;
	}


}
