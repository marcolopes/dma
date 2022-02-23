/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.email;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class EmailRecipients extends ArrayList<EmailAddress> {

	private final Collection<EmailAddress> cc=new ArrayList();
	private final Collection<EmailAddress> bcc=new ArrayList();

	public EmailRecipients() {}

	public EmailRecipients(EmailAddress to) {
		addTo(to);
	}


	/*
	 * To
	 */
	public Collection<EmailAddress> getTo() {
		return this;
	}

	public EmailRecipients addTo(EmailAddress...address) {
		return addTo(Arrays.asList(address));
	}

	public EmailRecipients addTo(Collection<EmailAddress> address) {
		addAll(address);
		return this;
	}


	/*
	 * Carbon Copy
	 */
	public Collection<EmailAddress> getCc() {
		return cc;
	}

	public EmailRecipients addCc(EmailAddress...address) {
		return addCc(Arrays.asList(address));
	}

	public EmailRecipients addCc(Collection<EmailAddress> address) {
		cc.addAll(address);
		return this;
	}


	/*
	 * Blind Carbon Copy
	 */
	public Collection<EmailAddress> getBcc() {
		return bcc;
	}

	public EmailRecipients addBcc(EmailAddress...address) {
		return addBcc(Arrays.asList(address));
	}

	public EmailRecipients addBcc(Collection<EmailAddress> address) {
		bcc.addAll(address);
		return this;
	}


}
