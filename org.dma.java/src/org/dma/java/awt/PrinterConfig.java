/*******************************************************************************
 * Copyright 2008-2026 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.java.awt;

import java.util.Arrays;

import org.dma.java.util.StringUtils;

public class PrinterConfig {

	private static byte[] val(String...sequence) {
		byte[] val=new byte[sequence.length];
		int index=0;
		for(String code: sequence){
			val[index++]=(byte)StringUtils.val(code);
		}return val;
	}

	public final String name;
	public final byte[] drawer;

	public PrinterConfig(String name, String...sequence) {
		this(name, val(sequence));
	}

	public PrinterConfig(String name, byte[] drawer) {
		this.name=name;
		this.drawer=drawer;
	}

	@Override
	public String toString() {
		return name+" "+Arrays.toString(drawer);
	}

}