/*******************************************************************************
 * 2008-2022 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.email;

public class HtmlEmailMessage extends EmailMessage {

	public HtmlEmailMessage(String subject, String body) {
		super(subject, body);
	}


	@Override
	public boolean isHtml() {
		return true;
	}

}
