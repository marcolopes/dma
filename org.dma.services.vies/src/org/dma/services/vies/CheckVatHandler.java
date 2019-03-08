/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.services.vies;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.ws.Holder;

import eu.europa.ec.taxud.vies.services.checkvat.CheckVatPortType;
import eu.europa.ec.taxud.vies.services.checkvat.CheckVatService;

/**
 * VAT Information Exchange System
 * <p>
 * http://ec.europa.eu/taxation_customs/vies
 */
public class CheckVatHandler {

	/**
	 * http://ec.europa.eu/taxation_customs/vies/faq.html<br>
	 * http://i18napis.appspot.com/address/data/PT (replace PT for other country codes)<br>
	 * http://stackoverflow.com/questions/578406/what-is-the-ultimate-postal-code-and-zip-regex
	 */
	public enum COUNTRIES {

		/* 01/01/1958 */
		BE ("Belgium", "\\d{4}"),
		FR ("France", "\\d{2} ?\\d{3}"),
		DE ("Germany", "\\d{5}"),
		IT ("Italy", "\\d{5}"),
		LU ("Luxembourg", "\\d{4}"),
		NL ("Netherlands", "\\d{4} ?[A-Z]{2}"),
		/* 01/01/1973 */
		DK ("Denmark", "\\d{4}"),
		IE ("Ireland", "[\\dA-Z]{3} ?[\\dA-Z]{4}"),
		GB ("United Kingdom", "GIR ?0AA|((AB|AL|B|BA|BB|BD|BH|BL|BN|BR|BS|BT|BX|CA|CB|CF|CH|CM|CO|CR|CT|CV|CW|DA|DD|DE|DG|DH|DL|DN|DT|DY|E|EC|EH|EN|EX|FK|FY|G|GL|GY|GU|HA|HD|HG|HP|HR|HS|HU|HX|IG|IM|IP|IV|JE|KA|KT|KW|KY|L|LA|LD|LE|LL|LN|LS|LU|M|ME|MK|ML|N|NE|NG|NN|NP|NR|NW|OL|OX|PA|PE|PH|PL|PO|PR|RG|RH|RM|S|SA|SE|SG|SK|SL|SM|SN|SO|SP|SR|SS|ST|SW|SY|TA|TD|TF|TN|TQ|TR|TS|TW|UB|W|WA|WC|WD|WF|WN|WR|WS|WV|YO|ZE)(\\d[\\dA-Z]? ?\\d[ABD-HJLN-UW-Z]{2}))|BFPO ?\\d{1,4}"),
		/* 01/01/1981 */
		/** NOT ISO 3166 */
		EL ("Greece", "\\d{3} ?\\d{2}"),
		/* 01/01/1986 */
		PT ("Portugal", "\\d{4}-\\d{3}"),
		ES ("Spain", "\\d{5}"),
		/* 01/01/1995 */
		AT ("Austria", "AT-\\d{4}"),
		FI ("Finland", "\\d{5}"),
		SE ("Sweden", "\\d{3} ?\\d{2}"),
		/* 01/05/2004 */
		CY ("Cyprus", "\\d{4}"),
		CZ ("Czech Republic", "\\d{3} ?\\d{2}"),
		EE ("Estonia", "\\d{5}"),
		HU ("Hungary", "\\d{4}"),
		LV ("Latvia", "LV-\\d{4}"),
		LT ("Lithuania", "\\d{5}"),
		MT ("Malta", "[A-Z]{3} ?\\d{2,4}"),
		PL ("Poland", "\\d{2}-\\d{3}"),
		SK ("Slovakia", "\\d{3} ?\\d{2}"),
		SI ("Slovenia", "\\d{4}"),
		/* 01/01/2007 */
		BG ("Bulgaria", "\\d{4}"),
		RO ("Romania", "\\d{6}"),
		/* 01/07/2013 */
		HR ("Croatia", "\\d{5}");

		/**
		 * https://joinup.ec.europa.eu/asset/core_location/issue/european-use-uk-and-el-cf-iso-3166-codes-gb-and-gr
		 */
		private enum ISO3166 {

			GR (EL);

			/** Returns NULL if not found */
			public static COUNTRIES get(String countryCode) {
				try{
					return valueOf(countryCode.toUpperCase()).country;
				}catch(Exception e){}
				return null;
			}

			public final COUNTRIES country;

			private ISO3166(COUNTRIES country) {
				this.country=country;
			}

		}

		/** Returns NULL if not found */
		public static COUNTRIES get(String countryCode) {
			try{
				return valueOf(countryCode.toUpperCase());
			}catch(Exception e){}
			/* try ISO countries */
			return ISO3166.get(countryCode);
		}

		/** Country name */
		public final String name;
		/** ZIP CODE pattern */
		public final Pattern zipcode;

		private COUNTRIES(String name, String regex) {
			this.name=name;
			this.zipcode=regex==null ? null : Pattern.compile(regex);
		}

		/** Queries VIES service */
		public CheckVatResult queryVatNumber(String vatNumber) {

			try{
				CheckVatService service=new CheckVatService();

				System.out.println("Please read disclaimer from service provider at:");
				System.out.println(service.getWSDLDocumentLocation());
				System.out.println("Querying VAT Information Exchange System (VIES) via web service...");
				System.out.println("Country: "+this);
				System.out.println("Vat Number: "+vatNumber);

				Holder<Boolean> valid=new Holder(new Boolean(true));
				Holder<String> name=new Holder(new String());
				Holder<String> address=new Holder(new String());

				CheckVatPortType servicePort=service.getCheckVatPort();
				servicePort.checkVat(
						new Holder(name()),
						new Holder(vatNumber),
						new Holder(DatatypeFactory.newInstance().newXMLGregorianCalendar()),
						valid, name, address);

				return new CheckVatResult(valid.value, name.value, parse(address.value));

			}catch(Exception e){
				System.err.println(e);
			}

			return null;
		}

		/** Parses VIES address */
		public CheckVatAddress parse(String address) {

			try{
				Matcher matcher=zipcode.matcher(address);
				matcher.find();

				/* STREET (before ZIPCODE) */
				String street=address.substring(0, matcher.start());
				/* ZIPCODE */
				String zipcode=address.substring(matcher.start(), matcher.end());
				/* CITY (after ZIPCODE) */
				String city=address.substring(matcher.end());

				return new CheckVatAddress(street, zipcode, city);

			}catch(Exception e){
				System.err.println(e);
			}

			return new CheckVatAddress(address);

		}

		public boolean checkZipcode(String zipcode) {
			return this.zipcode.matcher(zipcode).matches();
		}

	}

	private final COUNTRIES country;

	/** Country can be VIES or ISO */
	public CheckVatHandler(String countryCode) {
		this(COUNTRIES.get(countryCode));
	}

	/** @see VatNumber Want to work with a specific VAT NUMBER? */
	public CheckVatHandler(COUNTRIES country) {
		if (country==null) throw new IllegalArgumentException("Invalid Country");
		this.country=country;
	}

	public CheckVatResult query(String vatNumber) {
		return country.queryVatNumber(vatNumber);
	}


	public static void main(String[] args) {

		COUNTRIES.PT.queryVatNumber("199415250");

		CheckVatHandler handler=new CheckVatHandler(COUNTRIES.ES);
		System.out.println(handler.query("A28250777"));
		System.out.println(handler.query("A39000013"));
		System.out.println(handler.query("B94123908"));
		System.out.println(handler.query("J98725286"));

		handler=new CheckVatHandler(COUNTRIES.DE);
		System.out.println(handler.query("115055014"));
		System.out.println(handler.query("129274202"));
		System.out.println(handler.query("136563568"));
		System.out.println(handler.query("258071573"));

		handler=new CheckVatHandler(COUNTRIES.GB);
		System.out.println(handler.query("157577371"));
		System.out.println(handler.query("180982579"));
		System.out.println(handler.query("239354938"));
		System.out.println(handler.query("644307352"));
		System.out.println(handler.query("924049335"));

		handler=new CheckVatHandler(COUNTRIES.FR);
		System.out.println(handler.query("20410409460"));
		System.out.println(handler.query("63775661390"));

		handler=new CheckVatHandler(COUNTRIES.IT);
		System.out.println(handler.query("01459531214"));
		System.out.println(handler.query("05023760969"));

		handler=new CheckVatHandler(COUNTRIES.PT);
		System.out.println(handler.query("502011475"));
		System.out.println(handler.query("505636700"));

		handler=new CheckVatHandler(COUNTRIES.AT);
		System.out.println(handler.query("U15447005"));
		System.out.println(handler.query("U65711802"));

		handler=new CheckVatHandler(COUNTRIES.DK);
		System.out.println(handler.query("27215556"));
		System.out.println(handler.query("47458714"));

		System.out.println(new CheckVatHandler("GR").query("064806395"));
		System.out.println(COUNTRIES.EL.queryVatNumber("094543092"));

		System.out.println(new CheckVatHandler("XX").query("1234567890"));

	}


}