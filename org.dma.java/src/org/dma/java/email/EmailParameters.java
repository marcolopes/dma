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
package org.dma.java.email;

import java.util.Arrays;

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
			error.warnings().add(send(message, attachment));

		}catch(Exception e){
			error.errors().add(e);
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
				", recipients=" + super.toString() + "]";
	}


	public static void main(String arg[]) {

		//attachment file
		UTF8TextFile file=new UTF8TextFile(new FileParameters("attachment", "txt").createTempFile());
		file.write("The quick brown fox jumps over the lazy dog");

		ServerParameters server=new ServerParameters("mail.xxxxxx.com", 25,
				SECURITY.NONE, new PasswordAuthentication("mail@xxxxxx.com", "***"));
		EmailAddress from=new EmailAddress("from@xxxxxx.com", "From Name");
		EmailAddress to=new EmailAddress("to@xxxxxx.com", "To Name");

		for(EmailMessage message: Arrays.asList(
				new EmailMessage("Simple Mail Test", "http://marcolopes.pages.dev"),
				new HtmlEmailMessage("HTML Mail Test", "<a href=\"http://marcolopes.pages.dev\">HTML Link</a>"))) try{

			EmailParameters email=new EmailParameters(server, from, new EmailRecipients(to).
					addBcc(new EmailAddress("bcc1@xxxxxx.com", "Bcc One"),
							new EmailAddress("bcc2@xxxxxx.com", "Bcc Two")));

			email.send(message, new EmailAttachment(file, "Attachment Description"));

		}catch(Exception e){
			e.printStackTrace();
		}

	}


}