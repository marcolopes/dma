/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.apache.mail;

import org.apache.commons.mail.MultiPartEmail;
import org.dma.utils.java.Debug;

public class SendMail {

	public static void send(ServerParameters server, EmailAddress from, EmailAddress to, String subject, String message) throws Exception {

		send(server, from, to, subject, message, null);

	}


	public static void send(ServerParameters server, EmailAddress from, EmailAddress to, String subject, String message, EmailAttachment attachment) throws Exception {

		server.debug();
		Debug.info("from", from.getName()+": "+from.getEmail());
		Debug.info("to", to.getName()+": "+to.getEmail());
		Debug.info("subject", subject);
		Debug.info("message", message);

		MultiPartEmail email = new MultiPartEmail();
		email.setDebug(true);

		email.setHostName(server.getHostname());
		email.setSmtpPort(server.getSmtpport());

		//Authentication
		if (server.isAuth()) email.setAuthentication(server.getUsername(), server.getPassword());

		//Security
		email.setTLS(server.getSecurity()==ServerParameters.SECURITY_SSLTLS || server.getSecurity()==ServerParameters.SECURITY_SSLTLS);
		email.setSSL(server.getSecurity()==ServerParameters.SECURITY_SSLTLS);

		email.setFrom(from.getEmail(), from.getName());
		email.addTo(to.getEmail(), to.getName());
		email.setSubject(subject);
		email.setMsg(message);
		if (attachment!=null) email.attach(attachment);

		email.send();

	}


	public static void main(String arg[]) {

		try{
			ServerParameters server=new ServerParameters("mail.projectocolibri.com", 25,
					true, "marcolopes@projectocolibri.com", "***", ServerParameters.SECURITY_NONE);
			EmailAddress from=new EmailAddress("suporte@projectocolibri.com", "FROM: Projecto Colibri");
			EmailAddress to=new EmailAddress("marcolopes@projectocolibri.com", "TO: Marco Lopes");

			send(server, from, to, "SUBJECT: Teste Email Simples", "MESSAGE: Teste Email Simples");

			send(server,from, to, "SUBJECT: Teste Email Simples", "MESSAGE: Teste Email com Attachment",
				new EmailAttachment("/colibri/email.txt", "EMAIL", "TEXT: Texto do Attachment"));

		}catch(Exception e){
			e.printStackTrace();
		}

	}


}