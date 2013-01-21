/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.snippets;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;

public class PrintRawData {

	private static enum ESCAPE {

		EPSON ("27,112,0,50,200"),
		SAMSUNG ("27,112,30"),
		STAR ("28"),
		IBM ("27,7");

		public final byte[] sequence;

		ESCAPE(String sequence) {
			String[] split=sequence.split(",");
			this.sequence=new byte[split.length];
			for(int i=0; i<split.length; i++){
				this.sequence[i]=(byte)((int)Integer.valueOf(split[i]));
			}
	    }

	}

	public static void main(String[] argvs){

		try{
			DocPrintJob job=PrintServiceLookup.lookupDefaultPrintService().createPrintJob();
			Doc doc=new SimpleDoc(ESCAPE.EPSON.sequence, DocFlavor.BYTE_ARRAY.AUTOSENSE, null);
			job.print(doc, null);

		}catch(PrintException e){
			e.printStackTrace();
		}

	}


}