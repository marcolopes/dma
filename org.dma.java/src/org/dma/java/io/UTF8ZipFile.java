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
package org.dma.java.io;

import java.io.File;

public class UTF8ZipFile extends ZipFile {

	public UTF8ZipFile(File file, String...more) {
		super(UTF8_CHARSET, file, more);
	}

	public UTF8ZipFile(String pathname, String...more) {
		super(UTF8_CHARSET, pathname, more);
	}

	public UTF8ZipFile(File file) {
		super(UTF8_CHARSET, file);
	}


}