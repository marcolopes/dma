/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.apache;

public class EmailAttachment extends org.apache.commons.mail.EmailAttachment {

	public EmailAttachment(String file, String name, String description) {

		setDisposition(ATTACHMENT);
		setPath(file);
		setName(name);
		setDescription(description);

	}


}