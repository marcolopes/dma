/*******************************************************************************
 * 2008-2022 Public Domain
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
	 * Getters and setters
	 */
	public EmailAddress getFrom() {
		return from;
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