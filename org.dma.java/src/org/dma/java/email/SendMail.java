/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.email;

import java.io.File;
import java.util.Date;

import javax.mail.PasswordAuthentication;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailConstants;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.MultiPartEmail;
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
	private String send(Email email, EmailAddress from, EmailAddress to, String subject, String message) throws EmailException {

		Debug.err(server);
		Debug.err(from);
		Debug.err(to);
		Debug.err(subject);

		if (!from.isValid()) throw new EmailException("Invalid email address (from): "+from);
		if (!to.isValid()) throw new EmailException("Invalid email address (to): "+to);

		email.setCharset(EmailConstants.UTF_8);
		email.setDebug(Debug.STATUS);

		email.setHostName(server.getHostName());
		email.setSmtpPort(server.getSmtpPort());

		//Security
		email.setStartTLSEnabled(server.getSecurity()==SECURITY.STARTTLS);
		email.setSSLOnConnect(server.getSecurity()==SECURITY.SSLTLS);

		//Authentication
		if (server.getAuthentication()!=null) email.setAuthentication(
			server.getAuthentication().getUserName(),
			server.getAuthentication().getPassword());

		email.setFrom(from.getEmail(), from.getName());
		email.addTo(to.getEmail(), to.getName());
		email.setSubject(subject);

		return email.send();

	}


	/** @see HtmlEmail#send */
	public String sendHtml(EmailAddress from, EmailAddress to, String subject, String message, EmailAttachment...attachment) throws EmailException {

		HtmlEmail email=new HtmlEmail();

		email.setHtmlMsg(message);

		for (EmailAttachment element: attachment){
			Debug.err(element);
			email.attach(element);
			email.setBoolHasAttachments(true);
		}

		return send(email, from, to, subject, message);

	}


	/** @see MultiPartEmail#send */
	public String send(EmailAddress from, EmailAddress to, String subject, String message, EmailAttachment...attachment) throws EmailException {

		MultiPartEmail email=new MultiPartEmail();

		email.setMsg(message);

		for (EmailAttachment element: attachment){
			Debug.err(element);
			email.attach(element);
			email.setBoolHasAttachments(true);
		}

		return send(email, from, to, subject, message);

	}


	public static void main(String arg[]) {

		try{
			SendMail mail=new SendMail(new ServerParameters(
					"mail.projectocolibri.com", 25, SECURITY.STARTTLS,
					new PasswordAuthentication("marcolopes@projectocolibri.com", "***REMOVED***")));

			EmailAddress from=new EmailAddress("suporte@projectocolibri.com", "FROM: Projecto Colibri");
			EmailAddress to=new EmailAddress("marcolopes@projectocolibri.com", "TO: Marco Lopes");

			//attachment file
			File file=new FileParameters("attachment", "txt").createTempFile();
			new UTF8TextFileHandler(file).write("Email attachment created "+new Date());

			//simple mail
			mail.send(from, to, "SUBJECT: Simple Mail Test", "MESSAGE: Simple Mail Test");
			mail.send(from, to, "SUBJECT: Simple Mail Test", "MESSAGE: Simple Mail Test",
					new EmailAttachment(file, "Attachment Description"));

			//html mail
			mail.sendHtml(from, to, "SUBJECT: HTML Mail Test", "MESSAGE: <a href=\"http://marcolopes.eu\">HTML Mail Test</a>");
			mail.sendHtml(from, to, "SUBJECT: HTML Mail Test", "MESSAGE: <a href=\"http://marcolopes.eu\">HTML Mail Test</a>",
					new EmailAttachment(file, "Attachment Description"));

		}catch(Exception e){
			e.printStackTrace();
		}

	}


}