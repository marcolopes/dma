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
package org.dma.java.email;

public class EmailMessage {

	private final String subject;
	private final String body;

	public String getSubject() {return subject;}
	public String getBody() {return body;}

	/** True if body is html */
	public boolean isHtml() {return false;}
	/** True if body is empty */
	public boolean isEmpty() {return body.isEmpty();}

	public EmailMessage(String subject, String body) {
		this.subject=subject;
		this.body=body;
	}


	/*
	 * (non-Javadoc)
	 * @see java.lang.Object
	 */
	@Override
	public String toString() {
		return getClass().getSimpleName() +
				" [subject=" + subject +
				", body (size)=" + body.length() + "]";
	}

}
