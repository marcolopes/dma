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

public abstract class FileWatcher extends FolderWatcher {

	/** Returns false if interrupted */
	public abstract boolean onChange(File file);

	private final File file;

	public FileWatcher(File file) {
		super(new Folder(file.getParent()));
		this.file=file;
	}

	@Override
	public boolean onChange(File[] files) {
		for(File file: files){
			if (file.equals(this.file)) return onChange(file);
		}return true;
	}


}
