/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.snippets;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;

public class PrintRawData {

	public enum ESCAPE {

		EPSON (27,112,0,50,200),
		SAMSUNG (27,112,30),
		STAR (28),
		IBM (27,7);

		public final byte[] sequence;

		ESCAPE(int...sequence) {
			this.sequence=new byte[sequence.length];
			for(int i=0; i<sequence.length; i++){
				this.sequence[i]=(byte)sequence[i];
			}
		}

	}

	public static void main(String[] argvs) {

		try{
			DocPrintJob job=PrintServiceLookup.lookupDefaultPrintService().createPrintJob();
			Doc doc=new SimpleDoc(ESCAPE.EPSON.sequence, DocFlavor.BYTE_ARRAY.AUTOSENSE, null);
			job.print(doc, null);

		}catch(Exception e){
			e.printStackTrace();
		}

	}


}