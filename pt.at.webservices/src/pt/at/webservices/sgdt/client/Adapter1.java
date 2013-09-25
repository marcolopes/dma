package pt.at.webservices.sgdt.client;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.datatype.XMLGregorianCalendar;

public class Adapter1
    extends XmlAdapter<String, XMLGregorianCalendar>
{


    public XMLGregorianCalendar unmarshal(String value) {
        return (pt.at.webservices.sgdt.model.adapter.DateAdapter.parseCalendar(value));
    }

    public String marshal(XMLGregorianCalendar value) {
        return (pt.at.webservices.sgdt.model.adapter.DateAdapter.printCalendar(value));
    }

}
