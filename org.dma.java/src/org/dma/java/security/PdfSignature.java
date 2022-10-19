/*******************************************************************************
 * Copyright 2008-2021 Marco Lopes (marcolopespt@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.security;

import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.util.Calendar;
import java.util.GregorianCalendar;

import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.PdfSignatureAppearance;
import com.lowagie.text.pdf.PdfStamper;

public class PdfSignature {

	public class VisibleSignature {

		public final Rectangle pageRect;
		public final int page;
		public final String fieldName;

		/** Place on page 1 */
		public VisibleSignature(Rectangle pageRect) {
			this(pageRect, 1);
		}

		public VisibleSignature(Rectangle pageRect, int page) {
			this(pageRect, page, null);
		}

		public VisibleSignature(Rectangle pageRect, int page, String fieldName) {
			this.pageRect=pageRect;
			this.page=page;
			this.fieldName=fieldName;
		}

	}

	private Calendar signDate;
	private String reason;
	private String location;
	private String contact;
	private VisibleSignature visible;

	private final PrivateKey privateKey;
	private final Certificate[] certChain;

	public PdfSignature(JKSCertificate cert) throws Exception {
		this(cert.getPrivateKey(), cert.getCertificateChain());
	}

	public PdfSignature(PrivateKey privateKey, Certificate[] certChain) {
		this.privateKey=privateKey;
		this.certChain=certChain;
	}

	/** Close stamper to apply signature */
	public void stampWith(PdfStamper stamper) {
		PdfSignatureAppearance signature=stamper.getSignatureAppearance();
		signature.setCrypto(privateKey, certChain, null, PdfSignatureAppearance.SELF_SIGNED);
		signature.setSignDate(signDate==null ? new GregorianCalendar() : signDate);
		signature.setReason(reason);
		signature.setLocation(location);
		signature.setContact(contact);
		if (visible!=null) signature.setVisibleSignature(visible.pageRect, visible.page, visible.fieldName);
	}

	/** @see PdfSignatureAppearance#setSignDate(Calendar) */
	public void setSignDate(Calendar signDate) {
		this.signDate=signDate;
	}

	/** @see PdfSignatureAppearance#setReason(String) */
	public void setReason(String reason) {
		this.reason=reason;
	}

	/** @see PdfSignatureAppearance#setLocation(String) */
	public void setLocation(String location) {
		this.location=location;
	}

	/** @see PdfSignatureAppearance#setContact(String) */
	public void setContact(String contact) {
		this.contact=contact;
	}

	/** @see PdfSignatureAppearance#setVisibleSignature(Rectangle, int, String) */
	public void setVisibleSignature(VisibleSignature visible) {
		this.visible=visible;
	}


}
