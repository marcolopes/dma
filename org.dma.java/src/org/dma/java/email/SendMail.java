/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.email;

import java.io.File;

import javax.mail.PasswordAuthentication;

import org.apache.commons.mail.EmailConstants;
import org.apache.commons.mail.MultiPartEmail;
import org.dma.java.email.ServerParameters.SECURITY;
import org.dma.java.util.Debug;

public class SendMail extends MultiPartEmail {

	private final ServerParameters server;

	public SendMail(ServerParameters server) {
		this.server=server;
	}


	public String send(EmailAddress from, EmailAddress to, String subject, String message, EmailAttachment attachment) throws Exception {

		server.debug();
		if (!from.isValid()) throw new Exception("Invalid email address (from): "+from);
		if (!to.isValid()) throw new Exception("Invalid email address (to): "+to);

		MultiPartEmail email=new MultiPartEmail();
		email.setCharset(EmailConstants.UTF_8);
		email.setDebug(Debug.STATUS);

		email.setHostName(server.getHostName());
		email.setSmtpPort(server.getSmtpPort());

		//Authentication
		if (server.getAuthentication()!=null) email.setAuthentication(
			server.getAuthentication().getUserName(),
			server.getAuthentication().getPassword());

		//Security
		email.setStartTLSEnabled(server.getSecurity()==SECURITY.STARTTLS);
		email.setSSLOnConnect(server.getSecurity()==SECURITY.SSLTLS);

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

			mail.send(from, to, "SUBJECT: Simple Mail Test", "MESSAGE: Simple Mail Test");
			mail.send(from, to, "SUBJECT: Attachment Mail Test", "MESSAGE: Attachment Mail Test",
				new EmailAttachment(new File("email.txt"), "Attachment Description"));

		}catch(Exception e){
			e.printStackTrace();
		}

	}


}