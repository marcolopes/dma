/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.email;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

import javax.mail.PasswordAuthentication;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;

import org.dma.java.email.ServerParameters.SECURITY;
import org.dma.java.io.FileParameters;
import org.dma.java.io.UTF8TextFile;

public class MailSender {

	private final ServerParameters server;

	public MailSender(ServerParameters server) {
		this.server=server;
	}


	/** @see Email#send */
	public String send(EmailMessage message, EmailAddress from, EmailRecipients recipients, EmailAttachment...attachment) throws EmailException {

		CustomHtmlEmail email=new CustomHtmlEmail(server, attachment.length==0);

		email.setSubject(message.getSubject());
		if (message.isHtml()) email.setHtmlMsg(message.getBody());
		else email.setTextMsg(message.getBody());

		email.setFrom(from);
		email.addTo(recipients.getTo());
		email.addCc(recipients.getCc());
		email.addBcc(recipients.getBcc());

		email.attach(attachment);

		return email.send();

	}


	public static void main(String arg[]) {

		try{
			EmailAddress from=new EmailAddress("suporte@xxxxxx.com", "FROM: xxxxxx");
			EmailAddress to=new EmailAddress("marcolopes@xxxxxx.com", "TO: Marco Lopes");

			//attachment file
			File file=new FileParameters("attachment", "txt").createTempFile();
			new UTF8TextFile(file).write("Email attachment created "+new Date());

			MailSender sender=new MailSender(new ServerParameters("mail.xxxxxx.com", 25,
					SECURITY.NONE, new PasswordAuthentication("marcolopes@xxxxxx.com", "***")));

			for(EmailMessage message: Arrays.asList(
					new EmailMessage("SUBJECT: Simple Mail Test", "BODY: http://marcolopes.eu"),
					new HtmlEmailMessage("SUBJECT: HTML Mail Test", "BODY: <a href=\"http://marcolopes.eu\">HTML Link</a>"))){

				sender.send(message, from, new EmailRecipients(to));
				sender.send(message, from, new EmailRecipients(to).addBcc(
						new EmailAddress("bcc1@xxxxxx.com", "TO: First Last"),
						new EmailAddress("bcc2@xxxxxx.com", "TO: First Last")),
						new EmailAttachment(file, "Attachment Description"));

			}

		}catch(Exception e){
			e.printStackTrace();
		}

	}


}