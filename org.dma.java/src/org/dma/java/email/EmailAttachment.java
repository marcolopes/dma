/*******************************************************************************
 * Copyright 2008-2018 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.java.email;

import java.io.File;

public class EmailAttachment extends org.apache.commons.mail.EmailAttachment {

	public EmailAttachment(File file) {
		this(file, file.getName());
	}

	public EmailAttachment(File file, String description) {
		setDisposition(ATTACHMENT);
		setName(file.getName());
		setPath(file.getAbsolutePath());
		setDescription(description);
	}


	/*
	 * (non-Javadoc)
	 * @see java.lang.Object
	 */
	@Override
	public String toString() {
		return getClass().getSimpleName() +
				" [name=" + getName() +
				", path=" + getPath() +
				", description=" + getDescription() + "]";
	}


}