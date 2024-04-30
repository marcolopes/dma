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
package org.dma.java.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.PdfCopy;
import com.lowagie.text.pdf.PdfReader;

import org.dma.java.time.Chronograph;

public class PdfFile extends AbstractPdfFile {

	/** @see AbstractPdfFile#AbstractPdfFile(File, String...) */
	public PdfFile(File file, String...more) {
		super(file, more);
	}

	/** @see AbstractPdfFile#AbstractPdfFile(String, String...) */
	public PdfFile(String pathname, String...more) {
		super(pathname, more);
	}

	/** @see AbstractPdfFile#AbstractPdfFile(File) */
	public PdfFile(File file) {
		super(file);
	}


	@Override
	public PdfReader getPdfReader(byte[] ownerPassword) throws IOException {
		return new PdfReader(getAbsolutePath(), ownerPassword);
	}


	/**
	 * {@link PdfFile} will be used as OUTPUT
	 */
	public void merge(Collection<File> files) throws DocumentException, IOException {

		if (files.isEmpty()) return;

		FileOutputStream out=asOutputStream();
		try{Document document=new Document();
			PdfCopy copy=new PdfCopy(document, out);
			document.open();
			for(File file: files){
				PdfReader reader=new PdfReader(file.getAbsolutePath());
				for(int pageNumber=0; pageNumber<reader.getNumberOfPages();){
					copy.addPage(copy.getImportedPage(reader, ++pageNumber));
				}copy.freeReader(reader);
				reader.close();
			}document.close();
			copy.close();
		}finally{
			out.close();
		}

	}


	public static void main(String[] args) {

		CustomFile source=new CustomFile(Folder.temporary(), "source.pdf");
		Chronograph time=new Chronograph().start();
		Collection<File> col=new ArrayList(5);
		for(int i=0; i<5; i++){
			File file=new PdfFile(Folder.temporary(), "append"+i+".pdf");
			if (!file.exists()){
				System.out.println(file);
				source.copyTo(file);
			}col.add(file);
		}System.out.println("COPY time="+time);

		time.reset();
		PdfFile output=new PdfFile(Folder.temporary(), "output.pdf");
		try{output.merge(new ArrayList());
			output.merge(col);
		}catch(Exception e){
			e.printStackTrace();
		}System.out.println("MERGE time="+time);

		time.reset();
		//output.addScript("script");
		System.out.println("ADD SCRIPT time="+time);

		time.reset();
		try{//output.stamp(null);
		}catch(NullPointerException e){
		}System.out.println("STAMP time="+time);

	}


}