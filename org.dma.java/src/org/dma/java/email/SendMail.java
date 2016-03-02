/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.email;

import java.io.File;
import java.util.Date;

import javax.mail.PasswordAuthentication;

import org.apache.commons.mail.EmailConstants;
import org.apache.commons.mail.MultiPartEmail;
import org.dma.java.email.ServerParameters.SECURITY;
import org.dma.java.io.FileParameters;
import org.dma.java.io.UTF8TextFileHandler;
import org.dma.java.util.Debug;

public class SendMail extends MultiPartEmail {

	private final ServerParameters server;

	public SendMail(ServerParameters server) {
		this.server=server;
	}


	public String send(EmailAddress from, EmailAddress to, String subject, String message, EmailAttachment attachment) throws Exception {

		Debug.out(server);

		if (!from.isValid()) throw new Exception("Invalid email address (from): "+from);
		if (!to.isValid()) throw new Exception("Invalid email address (to): "+to);

		MultiPartEmail email=new MultiPartEmail();
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
		email.setMsg(message);
		if (attachment!=null){
			email.attach(attachment);
			email.setBoolHasAttachments(true);
		}

		return email.send();

	}


	public String send(EmailAddress from, EmailAddress to, String subject, String message) throws Exception {

		return send(from, to, subject, message, null);

	}


	public static void main(String arg[]) {

		try{
			SendMail mail=new SendMail(new ServerParameters(
					"mail.projectocolibri.com", 25, SECURITY.STARTTLS,
					new PasswordAuthentication("marcolopes@projectocolibri.com", "***")));

			EmailAddress from=new EmailAddress("suporte@projectocolibri.com", "FROM: Projecto Colibri");
			EmailAddress to=new EmailAddress("marcolopes@projectocolibri.com", "TO: Marco Lopes");

			//attachment file
			File file=new FileParameters("attachment", "txt").createTempFile();
			Debug.out("file", file);
			new UTF8TextFileHandler(file).write("Email attachment created "+new Date());

			//attachment mail
			mail.send(from, to, "SUBJECT: Attachment Mail Test", "MESSAGE: Attachment Mail Test",
				new EmailAttachment(file, "Attachment Description"));

			//simple mail
			mail.send(from, to, "SUBJECT: Simple Mail Test", "MESSAGE: Simple Mail Test");

		}catch(Exception e){
			e.printStackTrace();
		}

	}


}