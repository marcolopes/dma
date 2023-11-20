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

import java.util.Arrays;
import java.util.Collection;

public class EmailParameters extends EmailRecipients {

	private static final long serialVersionUID = 1L;

	private final ServerParameters server;
	private final EmailAddress from;

	public EmailAddress getFrom() {return from;}

	public EmailParameters(ServerParameters server, EmailAddress from, EmailAddress...to) {
		this(server, from, Arrays.asList(to));
	}

	public EmailParameters(ServerParameters server, EmailAddress from, Collection<EmailAddress> to) {
		this.server=server;
		this.from=from;
		addAll(to);
	}


	public MailSender sender() {
		return new MailSender(server);
	}

	public boolean send(int retries, EmailMessage message, EmailAttachment...attachment) {
		MailSender sender=sender();
		for(int i=0; i<=retries; i++) try{
			sender.send(message, from, this, attachment);
			return true;
		}catch(Exception e){
			System.err.println(e);
		}return false;
	}


	/*
	 * (non-Javadoc)
	 * @see java.lang.Object
	 */
	@Override
	public String toString() {
		return getClass().getSimpleName() +
				" [server=" + server +
				", from=" + from +
				", to=" + super.toString() + "]";
	}


}