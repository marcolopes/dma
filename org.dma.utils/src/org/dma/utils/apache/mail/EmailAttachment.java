/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.apache.mail;

import org.dma.utils.eclipse.Debug;

public class EmailAttachment extends org.apache.commons.mail.EmailAttachment {

	public EmailAttachment(String filepath, String filename, String description) {

		setDisposition(ATTACHMENT);
		setPath(filepath);
		setName(filename);
		setDescription(description);

	}


	public void debug() {

		Debug.info("filepath", getPath());
		Debug.info("filename", getName());
		Debug.info("description", getDescription());

	}


}