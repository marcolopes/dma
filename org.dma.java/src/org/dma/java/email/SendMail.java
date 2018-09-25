/*******************************************************************************
 * 2008-2018 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.email;

import java.io.File;
import java.util.Date;

import javax.mail.PasswordAuthentication;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.dma.java.email.ServerParameters.SECURITY;
import org.dma.java.io.FileParameters;
import org.dma.java.io.UTF8TextFileHandler;
import org.dma.java.util.Debug;

public class SendMail {

	private final ServerParameters server;

	public SendMail(ServerParameters server) {
		this.server=server;
	}


	/** @see Email#send */
	public String sendHtml(EmailAddress from, EmailRecipients recipients, String subject, String message, EmailAttachment...attachment) throws EmailException {

		Debug.err(from);
		Debug.err(recipients.getTo());
		Debug.err(subject);

		CustomHtmlEmail email=new CustomHtmlEmail(server);

		email.setFrom(from);
		email.addTo(recipients.getTo());
		email.addCc(recipients.getCc());
		email.addBcc(recipients.getBcc());
		email.setSubject(subject);

		email.setHtmlMsg(message);
		email.attach(attachment);

		return email.send();

	}


	public String sendHtml(EmailAddress from, EmailAddress to, String subject, String message, EmailAttachment...attachment) throws EmailException {

		return sendHtml(from, new EmailRecipients(to), subject, message, attachment);

	}


	/** @see Email#send */
	public String send(EmailAddress from, EmailRecipients recipients, String subject, String message, EmailAttachment...attachment) throws EmailException {

		Debug.err(from);
		Debug.err(recipients.getTo());
		Debug.err(subject);

		CustomHtmlEmail email=new CustomHtmlEmail(server);

		email.setFrom(from);
		email.addTo(recipients.getTo());
		email.addCc(recipients.getCc());
		email.addBcc(recipients.getBcc());
		email.setSubject(subject);

		email.setTextMsg(message);
		email.attach(attachment);

		return email.send();

	}


	public String send(EmailAddress from, EmailAddress to, String subject, String message, EmailAttachment...attachment) throws EmailException {

		return send(from, new EmailRecipients(to), subject, message, attachment);

	}


	public static void main(String arg[]) {

		try{
			SendMail mail=new SendMail(new ServerParameters(
					"mail.projectocolibri.com", 25, SECURITY.STARTTLS,
					new PasswordAuthentication("marcolopes@projectocolibri.com", "***")));

			EmailAddress from=new EmailAddress("suporte@projectocolibri.com", "FROM: Projecto Colibri");
			EmailAddress to=new EmailAddress("marcolopes@projectocolibri.com", "TO: Marco Lopes");
			EmailAddress[] bcc=new EmailAddress[]{
					new EmailAddress("sergiogomes@projectocolibri.com", "TO: Sérgio Gomes"),
					new EmailAddress("antonioferreira@projectocolibri.com", "TO: António Ferreira")};

			//attachment file
			File file=new FileParameters("attachment", "txt").createTempFile();
			new UTF8TextFileHandler(file).write("Email attachment created "+new Date());

			//simple mail
			mail.send(from, to, "SUBJECT: Simple Mail Test", "MESSAGE: Plain Text");
			mail.send(from, new EmailRecipients(to).addBcc(bcc), "SUBJECT: Simple Mail Test", "MESSAGE: Plain Text",
					new EmailAttachment(file, "Attachment Description"));

			//html mail
			mail.sendHtml(from, to, "SUBJECT: HTML Mail Test", "MESSAGE: <a href=\"http://marcolopes.eu\">HTML Link</a>");
			mail.sendHtml(from, new EmailRecipients(to).addBcc(bcc), "SUBJECT: HTML Mail Test", "MESSAGE: <a href=\"http://marcolopes.eu\">HTML Link</a>",
					new EmailAttachment(file, "Attachment Description"));

		}catch(Exception e){
			e.printStackTrace();
		}

	}


}