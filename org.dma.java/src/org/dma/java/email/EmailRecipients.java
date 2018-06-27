/*******************************************************************************
 * 2008-2018 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.email;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class EmailRecipients {

	private final Collection<EmailAddress> to=new ArrayList();
	private final Collection<EmailAddress> cc=new ArrayList();
	private final Collection<EmailAddress> bcc=new ArrayList();

	public EmailRecipients(EmailAddress to) {
		addTo(to);
	}


	public EmailRecipients addTo(EmailAddress...address) {
		return addTo(Arrays.asList(address));
	}

	public EmailRecipients addTo(Collection<EmailAddress> address) {
		to.addAll(address);
		return this;
	}


	public EmailRecipients addCc(EmailAddress...address) {
		return addCc(Arrays.asList(address));
	}

	public EmailRecipients addCc(Collection<EmailAddress> address) {
		cc.addAll(address);
		return this;
	}


	public EmailRecipients addBcc(EmailAddress...address) {
		return addBcc(Arrays.asList(address));
	}

	public EmailRecipients addBcc(Collection<EmailAddress> address) {
		bcc.addAll(address);
		return this;
	}


	public Collection<EmailAddress> getTo() {
		return to;
	}

	public Collection<EmailAddress> getCc() {
		return cc;
	}

	public Collection<EmailAddress> getBcc() {
		return bcc;
	}

}
