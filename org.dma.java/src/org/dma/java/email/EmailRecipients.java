/*******************************************************************************
 * Copyright 2008-2022 Marco Lopes (marcolopespt@gmail.com)
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class EmailRecipients extends ArrayList<EmailAddress> {

	private final Collection<EmailAddress> cc=new ArrayList();
	private final Collection<EmailAddress> bcc=new ArrayList();

	public Collection<EmailAddress> getCc() {return cc;}
	public Collection<EmailAddress> getBcc() {return bcc;}

	public EmailRecipients() {}

	public EmailRecipients(EmailAddress to) {
		addTo(to);
	}

	public EmailRecipients addAll(EmailRecipients recipients) {
		addTo(recipients);
		addCc(recipients.getCc());
		addBcc(recipients.getBcc());
		return this;
	}


	/*
	 * To
	 */
	public Collection<EmailAddress> getTo() {
		return this;
	}

	public EmailRecipients addTo(EmailAddress...address) {
		return addTo(Arrays.asList(address));
	}

	public EmailRecipients addTo(Collection<EmailAddress> address) {
		addAll(address);
		return this;
	}


	/*
	 * Carbon Copy
	 */
	public EmailRecipients addCc(EmailAddress...address) {
		return addCc(Arrays.asList(address));
	}

	public EmailRecipients addCc(Collection<EmailAddress> address) {
		cc.addAll(address);
		return this;
	}


	/*
	 * Blind Carbon Copy
	 */
	public EmailRecipients addBcc(EmailAddress...address) {
		return addBcc(Arrays.asList(address));
	}

	public EmailRecipients addBcc(Collection<EmailAddress> address) {
		bcc.addAll(address);
		return this;
	}


}
