/*******************************************************************************
 * Copyright 2008-2024 Marco Lopes (marcolopespt@gmail.com)
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

import javax.mail.PasswordAuthentication;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;

import org.dma.java.email.ServerParameters.SECURITY;
import org.dma.java.io.FileParameters;
import org.dma.java.io.UTF8TextFile;
import org.dma.java.util.Debug;
import org.dma.java.util.ErrorList;

public class EmailParameters extends EmailRecipients {

	private static final long serialVersionUID = 1L;

	private final ServerParameters server;
	private final EmailAddress from;

	public ServerParameters getServer() {return server;}
	public EmailAddress getFrom() {return from;}

	public EmailParameters(ServerParameters server, EmailAddress from, EmailAddress...to) {
		this(server, from, Arrays.asList(to));
	}

	public EmailParameters(ServerParameters server, EmailAddress from, Collection<EmailAddress> to) {
		this(server, from, new EmailRecipients());
	}

	public EmailParameters(ServerParameters server, EmailAddress from, EmailRecipients recipients) {
		this.server=server;
		this.from=from;
		addAll(recipients);
	}


	/** @see Email#send() */
	public String send(EmailMessage message, EmailAttachment...attachment) throws EmailException {

		CustomHtmlEmail email=new CustomHtmlEmail(server, Debug.STATUS);

		email.setSubject(message.getSubject());
		if (message.isHtml()) email.setHtmlMsg(message.getBody());
		else email.setTextMsg(message.getBody());

		email.setFrom(from);
		email.addTo(getTo());
		email.addCc(getCc());
		email.addBcc(getBcc());

		email.attach(attachment);

		return email.send();

	}

	public ErrorList send(int retries, EmailMessage message, EmailAttachment...attachment) {

		ErrorList error=new ErrorList();

		while(error.warnings().isEmpty() && retries-->=0) try{
			error.addWarning(send(message, attachment));

		}catch(Exception e){
			error.addError(e);
		}return error;

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


	public static void main(String arg[]) {

		ServerParameters server=new ServerParameters("mail.xxxxxx.com", 25,
				SECURITY.NONE, new PasswordAuthentication("marcolopes@xxxxxx.com", "***"));
		EmailAddress from=new EmailAddress("suporte@xxxxxx.com", "FROM: xxxxxx");
		EmailRecipients recipients=new EmailRecipients(new EmailAddress("marcolopes@xxxxxx.com", "TO: Marco Lopes"));

		//attachment file
		UTF8TextFile file=new UTF8TextFile(new FileParameters("attachment", "txt").createTempFile());
		file.write("The quick brown fox jumps over the lazy dog");

		for(EmailMessage message: Arrays.asList(
				new EmailMessage("SUBJECT: Simple Mail Test", "BODY: http://marcolopes.eu"),
				new HtmlEmailMessage("SUBJECT: HTML Mail Test", "BODY: <a href=\"http://marcolopes.eu\">HTML Link</a>"))) try{

			EmailParameters email=new EmailParameters(server, from, recipients.
					addBcc(new EmailAddress("bcc1@xxxxxx.com", "TO: First Last"),
							new EmailAddress("bcc2@xxxxxx.com", "TO: First Last")));

			email.send(message, new EmailAttachment(file, "Attachment Description"));

		}catch(Exception e){
			e.printStackTrace();
		}

	}


}