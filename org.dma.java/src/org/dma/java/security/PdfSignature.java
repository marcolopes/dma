/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.security;

import java.io.IOException;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.util.Calendar;
import java.util.GregorianCalendar;

import com.lowagie.text.DocumentException;
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

	public void stampWith(PdfStamper stamper) throws DocumentException, IOException {
		PdfSignatureAppearance signature=stamper.getSignatureAppearance();
		signature.setCrypto(privateKey, certChain, null, PdfSignatureAppearance.SELF_SIGNED);
		signature.setSignDate(signDate==null ? new GregorianCalendar() : signDate);
		signature.setReason(reason);
		signature.setLocation(location);
		signature.setContact(contact);
		if (visible!=null) signature.setVisibleSignature(visible.pageRect, visible.page, visible.fieldName);
		stamper.close(); //apply signature
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
