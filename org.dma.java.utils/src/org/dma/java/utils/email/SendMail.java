/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.utils.email;

import java.io.File;

import org.apache.commons.mail.MultiPartEmail;
import org.dma.java.utils.Debug;

public class SendMail {

	public static void send(ServerParameters server, EmailAddress from, EmailAddress to, String subject, String message, EmailAttachment attachment) throws Exception {

		server.debug();
		Debug.out("from", from);
		Debug.out("to", to);
		Debug.out("subject", subject);
		Debug.out("message", message);

		MultiPartEmail email = new MultiPartEmail();
		email.setDebug(Debug.STATUS);

		email.setHostName(server.getHostname());
		email.setSmtpPort(server.getSmtpport());

		//Authentication
		if (server.isAuth()){
			email.setAuthentication(server.getUsername(), server.getPassword());
		}

		//Security
		email.setStartTLSEnabled(server.getSecurity()==ServerParameters.SECURITY_STARTTLS);
		email.setSSLOnConnect(server.getSecurity()==ServerParameters.SECURITY_SSLTLS);

		email.setFrom(from.getEmail(), from.getName());
		email.addTo(to.getEmail(), to.getName());
		email.setSubject(subject);
		email.setMsg(message);
		if (attachment!=null){
			email.attach(attachment);
		}

		email.send();

	}


	public static void send(ServerParameters server, EmailAddress from, EmailAddress to, String subject, String message) throws Exception {

		send(server, from, to, subject, message, null);

	}


	public static void main(String arg[]) {

		try{
			ServerParameters server=new ServerParameters("mail.projectocolibri.com", 25,
					true, "marcolopes@projectocolibri.com", "***", ServerParameters.SECURITY_STARTTLS);

			EmailAddress from=new EmailAddress("suporte@projectocolibri.com", "FROM: Projecto Colibri");
			EmailAddress to=new EmailAddress("marcolopes@projectocolibri.com", "TO: Marco Lopes");

			send(server, from, to, "SUBJECT: Simple Mail Test", "MESSAGE: Simple Mail Test");
			send(server,from, to, "SUBJECT: Attachment Mail Test", "MESSAGE: Attachment Mail Test",
				new EmailAttachment(new File("email.txt"), "Attachment Description"));

		}catch(Exception e){
			e.printStackTrace();
		}

	}


}