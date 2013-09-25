package pt.at.webservices.sgdt.model.adapter;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public final class DateAdapter {
	static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'Z'");

	private DateAdapter() {
	}

	public static String printCalendar(XMLGregorianCalendar cal) {
		return dateFormat.format(cal.toGregorianCalendar().getTime());
	}

	public static XMLGregorianCalendar parseCalendar(String cal) {
		Calendar date = Calendar.getInstance();
		try {
			date.setTime(dateFormat.parse(cal));
			return DatatypeFactory.newInstance().newXMLGregorianCalendarDate(date.get(Calendar.YEAR), date.get(Calendar.MONTH), date.get(Calendar.DAY_OF_MONTH), 0);
		} catch (Exception ex) {
			return null;
		}
	}
}