/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.email;

import java.io.File;

public class EmailAttachment extends org.apache.commons.mail.EmailAttachment {

	public EmailAttachment(File file) {
		this(file, "");
	}

	public EmailAttachment(File file, String description) {
		setDisposition(ATTACHMENT);
		setName(file.getName());
		setPath(file.getAbsolutePath());
		setDescription(description);
	}


	/*
	 * (non-Javadoc)
	 * @see java.lang.Object
	 */
	@Override
	public String toString() {
		return "Name: "+getName()+
				"\nPath: "+getPath()+
				"\nDescription:" +getDescription();
	}


}