/*******************************************************************************
 * 2008-2022 Projecto Colibri
 * Marco Lopes (marcolopes@projectocolibri.com)
 *******************************************************************************/
package org.dma.java.io;

import java.io.File;
import java.io.IOException;

import com.csvreader.CsvReader;

public abstract class AbstractCSVReader {

	/** Executed after each record read */
	public abstract void postRead(CsvReader reader) throws Exception;

	private final File file;

	public AbstractCSVReader(File file) {
		this.file=file;
	}

	public void readRecords() throws IOException {
		CsvReader reader=new CsvReader(file.getAbsolutePath());
		try{reader.readHeaders();
			while(reader.readRecord()) try{
				postRead(reader);
			}catch(Exception e){
				throw new IOException(e);
			}
		}finally{
			reader.close();
		}
	}


}