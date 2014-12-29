/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.file;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;

public class XMLUtils {

	public static void xmlWriter(Object obj, File file){

		try{
			JAXBContext context = JAXBContext.newInstance(obj.getClass());
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			System.out.println("### XML BEGIN ###");
			m.marshal(obj, System.out);
			System.out.println("### XML END ###");

		}catch(PropertyException e){
			e.printStackTrace();
		}catch(JAXBException e){
			e.printStackTrace();
		}

	}


}