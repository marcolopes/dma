/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.io;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;

public class XMLFileHandler extends FileHandler {

	public XMLFileHandler(String filename) {
		super(filename);
	}

	public XMLFileHandler(File file) {
		super(file);
	}


	/*
	 * Class FileInputStream
	 *
	 * A FileInputStream obtains input bytes from a file in a file system.
	 * What files are available depends on the host environment.
	 *
	 * FileInputStream is meant for reading streams of raw bytes such as image data.
	 * For reading streams of characters, consider using FileReader.
	 */
	public Object read() {

		try{
			BufferedInputStream bis=
					new BufferedInputStream(
							new FileInputStream(file));

			XMLDecoder decoder=new XMLDecoder(bis);

			try{
				return decoder.readObject();

			}finally{
				decoder.close();
				bis.close();
			}

		}catch(FileNotFoundException e){
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}catch(Exception e){
			e.printStackTrace();
		}

		return null;

	}



	/*
	 * Class FileOutputStream
	 *
	 * A file output stream is an output stream for writing data to a File or to a
	 * FileDescriptor. Whether or not a file is available or may be created depends upon
	 * the underlying platform. Some platforms, in particular, allow a file to be opened
	 * for writing by only one FileOutputStream (or other file-writing object) at a time.
	 * In such situations the constructors in this class will fail if the file involved
	 * is already open.
	 *
	 * FileOutputStream is meant for writing streams of raw bytes such as image data.
	 * For writing streams of characters, consider using FileWriter.
	 *
	 */
	public boolean write(Object obj) {

		try{
			BufferedOutputStream bos=
					new BufferedOutputStream(
							new FileOutputStream(file));

			XMLEncoder encoder=new XMLEncoder(bos);

			try{
				encoder.writeObject(obj);

			}finally{
				encoder.close();
				bos.close();
			}

			return true;

		}catch(FileNotFoundException e){
			System.out.println(e);
		}catch(Exception e){
			e.printStackTrace();
		}

		return false;

	}


	/**
	 * Marshalling
	 *<p>
	 * The Marshaller class provides the client application the ability
	 * to convert a Java content tree back into XML data.
	 * There is no difference between marshalling a content tree that is
	 * created manually using the factory methods and marshalling a content
	 * tree that is the result an unmarshal operation.
	 *<p>
	 * Clients can marshal a java content tree back to XML data to a
	 * java.io.OutputStream or a java.io.Writer. The marshalling process can
	 * alternatively produce SAX2 event streams to a registered ContentHandler
	 * or produce a DOM Node object.
	 *<p>
	 * Client applications have control over the output encoding as well as whether
	 * or not to marshal the XML data as a complete document or as a fragment.
	 */
	public static void marshal(Object obj, File file) {

		try{
			JAXBContext context=JAXBContext.newInstance(obj.getClass());
			Marshaller m=context.createMarshaller();
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
