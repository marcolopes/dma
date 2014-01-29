/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.utils.email;

import java.io.File;

public class EmailAttachment extends org.apache.commons.mail.EmailAttachment {

	public EmailAttachment(File file, String description) {

		setDisposition(ATTACHMENT);
		setPath(file.getAbsolutePath());
		setName(file.getName());
		setDescription(description);

	}


}