/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.email;

public class EmailMessage {

	private final String subject;
	private final String body;

	public EmailMessage(String subject, String body) {
		this.subject=subject;
		this.body=body;
	}


	/** True if body is html */
	public boolean isHtml() {
		return false;
	}

	/** True if body is empty */
	public boolean isEmpty() {
		return body.isEmpty();
	}


	/*
	 * Getters and setters
	 */
	public String getSubject() {
		return subject;
	}

	public String getBody() {
		return body;
	}


	/*
	 * (non-Javadoc)
	 * @see java.lang.Object
	 */
	@Override
	public String toString() {
		return getClass().getSimpleName() +
				" [subject=" + subject +
				", body (size)=" + body.length() + "]";
	}

}
