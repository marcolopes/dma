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
package org.dma.java.io;

import java.nio.charset.Charset;

import org.apache.commons.configuration.HierarchicalINIConfiguration;

public class UTF8INIConfiguration extends HierarchicalINIConfiguration {

	private static final long serialVersionUID = 1L;

	public UTF8INIConfiguration() {
		super();
		setEncoding(charset().name());
	}

	public Charset charset() {
		return CustomFile.UTF8_CHARSET;
	}

}
