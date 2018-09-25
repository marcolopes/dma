/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.email;

import java.util.Arrays;
import java.util.Collection;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailConstants;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.MultiPartEmail;
import org.dma.java.email.ServerParameters.SECURITY;
import org.dma.java.util.Debug;

public class CustomHtmlEmail extends HtmlEmail {

	/** Charset UTF-8 */
	public CustomHtmlEmail(ServerParameters server) {
		Debug.err(server);

		setDebug(Debug.STATUS);
		setCharset(EmailConstants.UTF_8);

		setHostName(server.getHostName());
		setSmtpPort(server.getSmtpPort());

		//Security
		setStartTLSEnabled(server.getSecurity()==SECURITY.STARTTLS);
		setSSLOnConnect(server.getSecurity()==SECURITY.SSLTLS);

		//Authentication
		if (server.getAuthentication()!=null) setAuthentication(
			server.getAuthentication().getUserName(),
			server.getAuthentication().getPassword());
	}


	/** see {@link Email#setFrom} */
	public Email setFrom(EmailAddress address) throws EmailException {
		if (!address.isValid()) throw new EmailException("Invalid email address (from): "+address);
		return setFrom(address.getEmail(), address.getName());
	}


	/** see {@link Email#addTo} */
	public Email addTo(Collection<EmailAddress> address) throws EmailException {
		for (EmailAddress element: address){
			if (!element.isValid()) throw new EmailException("Invalid email address (to): "+address);
			addTo(element.getEmail(), element.getName());
		}
		return this;
	}

	/** see {@link Email#addTo} */
	public Email addTo(EmailAddress...address) throws EmailException {
		return addTo(Arrays.asList(address));
	}


	/** see {@link Email#addCc} */
	public Email addCc(Collection<EmailAddress> address) throws EmailException {
		for (EmailAddress element: address){
			if (!element.isValid()) throw new EmailException("Invalid email address (cc): "+address);
			addCc(element.getEmail(), element.getName());
		}
		return this;
	}

	/** see {@link Email#addCc} */
	public Email addCc(EmailAddress...address) throws EmailException {
		return addCc(Arrays.asList(address));
	}


	/** see {@link Email#addBcc} */
	public Email addBcc(Collection<EmailAddress> address) throws EmailException {
		for (EmailAddress element: address){
			if (!element.isValid()) throw new EmailException("Invalid email address (bcc): "+address);
			addBcc(element.getEmail(), element.getName());
		}
		return this;
	}

	/** see {@link Email#addBcc} */
	public Email addBcc(EmailAddress...address) throws EmailException {
		return addBcc(Arrays.asList(address));
	}


	/** see {@link MultiPartEmail#attach} */
	public void attach(Collection<EmailAttachment> attachment) throws EmailException {
		for (EmailAttachment element: attachment){
			Debug.err(element);
			super.attach(element);
		}
		setBoolHasAttachments(true);
	}


	public void attach(EmailAttachment...attachment) throws EmailException {
		attach(Arrays.asList(attachment));
	}


}