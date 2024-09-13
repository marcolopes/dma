/*******************************************************************************
 * Copyright 2008-2024 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.services.vies;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
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
	 * http://stackoverflow.com/questions/578406/what-is-the-ultimate-postal-code-and-zip-regex<br>
	 * https://joinup.ec.europa.eu/asset/core_location/issue/european-use-uk-and-el-cf-iso-3166-codes-gb-and-gr
	 */
	public enum COUNTRIES {

		/*01/01/1958*/
		BE ("Belgium", "\\d{4}"),
		FR ("France", "\\d{2} ?\\d{3}"),
		DE ("Germany", "\\d{5}"),
		IT ("Italy", "\\d{5}"),
		LU ("Luxembourg", "\\d{4}"),
		NL ("Netherlands", "\\d{4} ?[A-Z]{2}"),
		/*01/01/1973*/
		DK ("Denmark", "\\d{4}"),
		IE ("Ireland", "[\\dA-Z]{3} ?[\\dA-Z]{4}"),
		@Deprecated
		GB ("United Kingdom", "GIR ?0AA|((AB|AL|B|BA|BB|BD|BH|BL|BN|BR|BS|BT|BX|CA|CB|CF|CH|CM|CO|CR|CT|CV|CW|DA|DD|DE|DG|DH|DL|DN|DT|DY|E|EC|EH|EN|EX|FK|FY|G|GL|GY|GU|HA|HD|HG|HP|HR|HS|HU|HX|IG|IM|IP|IV|JE|KA|KT|KW|KY|L|LA|LD|LE|LL|LN|LS|LU|M|ME|MK|ML|N|NE|NG|NN|NP|NR|NW|OL|OX|PA|PE|PH|PL|PO|PR|RG|RH|RM|S|SA|SE|SG|SK|SL|SM|SN|SO|SP|SR|SS|ST|SW|SY|TA|TD|TF|TN|TQ|TR|TS|TW|UB|W|WA|WC|WD|WF|WN|WR|WS|WV|YO|ZE)(\\d[\\dA-Z]? ?\\d[ABD-HJLN-UW-Z]{2}))|BFPO ?\\d{1,4}"),
		/*01/01/1981*/
		EL ("GR"/*ISO 3166*/, "Greece", "\\d{3} ?\\d{2}"),
		/*01/01/1986*/
		PT ("Portugal", "\\d{4}-\\d{3}"),
		ES ("Spain", "\\d{5}"),
		/*01/01/1995*/
		AT ("Austria", "AT-\\d{4}"),
		FI ("Finland", "\\d{5}"),
		SE ("Sweden", "\\d{3} ?\\d{2}"),
		/*01/05/2004*/
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
		/*01/01/2007*/
		BG ("Bulgaria", "\\d{4}"),
		RO ("Romania", "\\d{6}"),
		/*01/07/2013*/
		HR ("Croatia", "\\d{5}");

		/** ISO3166 code */
		public final String code;
		/** Country name */
		public final String name;
		/** ZIP CODE pattern */
		public final Pattern zipcode;

		COUNTRIES(String name, String regex) {
			this(null, name, regex);
		}

		COUNTRIES(String code, String name, String regex) {
			this.code=code==null ? name() : code;
			this.name=name;
			this.zipcode=regex==null ? null : Pattern.compile(regex);
		}

		/** Queries VIES service */
		public CheckVatResult queryVatNumber(String vatNumber) throws Exception {

			CheckVatService service=new CheckVatService();

			System.out.print("Please read disclaimer from service provider at: ");
			System.out.println(service.getWSDLDocumentLocation());
			System.out.print("Querying VAT Information Exchange System: ");
			System.out.println(vatNumber);

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

		}

		/** Parses VIES address */
		public CheckVatAddress parse(String address) {

			if (zipcode!=null) try{
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
			}return new CheckVatAddress(address);

		}

		public boolean checkZipcode(String zipcode) {
			return this.zipcode.matcher(zipcode).matches();
		}

		/** Returns NULL if not found */
		public static COUNTRIES get(String countryCode) {
			try{return valueOf(countryCode.toUpperCase());
			}catch(Exception e){}
			/* try ISO countries */
			for(COUNTRIES country: values()){
				if (country.code.equals(countryCode)) return country;
			}return null;
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

	public CheckVatResult query(String vatNumber) throws Exception {
		return country.queryVatNumber(vatNumber);
	}


	public static void main(String[] args) throws Exception {

		System.setProperty("https.protocols", "SSLv3,TLSv1,TLSv1.1,TLSv1.2");

		Map<COUNTRIES, Collection<String>> map=new LinkedHashMap();
		map.put(COUNTRIES.ES, Arrays.asList("A39000013", "A-39000013", "A28015865", "A-28015865"));
		map.put(COUNTRIES.PT, Arrays.asList("505636700", "502011475"));
		map.put(COUNTRIES.FR, Arrays.asList("20410409460", "63775661390"));
		map.put(COUNTRIES.IT, Arrays.asList("01459531214", "05023760969"));
		map.put(COUNTRIES.AT, Arrays.asList("U15447005", "U65711802"));
		map.put(COUNTRIES.DK, Arrays.asList("27215556", "47458714"));
		map.put(COUNTRIES.EL, Arrays.asList("094543092"));
		//MS_UNAVAILABLE
		map.put(COUNTRIES.DE, Arrays.asList("115055014", "129274202", "136563568", "258071573"));
		//INVALID_INPUT
		map.put(COUNTRIES.GB, Arrays.asList("157577371", "180982579", "239354938", "644307352", "924049335"));

		for(COUNTRIES country: map.keySet()){
			System.out.println("==============");
			System.out.println(country.name);
			System.out.println("==============");
			for(String vatNumber: map.get(country)) try{
				CheckVatResult result=country.queryVatNumber(vatNumber);
				if (result.isValid()) System.out.println(result);
				System.out.println();
			}catch(Exception e){
				System.err.println(e);
			}
		}

		/*Greece ISO 3166*/
		System.out.println(new CheckVatHandler("GR").query("094543092"));
		System.out.println();

		/*Invalid Country*/
		System.out.println(new CheckVatHandler("XX").query("1234567890"));


	}

}