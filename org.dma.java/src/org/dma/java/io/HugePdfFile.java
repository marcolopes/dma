/*******************************************************************************
 * Copyright 2008-2022 Marco Lopes (marcolopespt@gmail.com)
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
import java.io.IOException;

import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.RandomAccessFileOrArray;

/**
 * https://stackoverflow.com/questions/1260895/merging-1000-pdf-thru-itext-throws-java-lang-outofmemoryerror-java-heap-space
 * <br>
 * https://stackoverflow.com/questions/30449348/signing-pdf-memory-consumption
 * <br>
 * https://stackoverflow.com/questions/62164906/use-of-randomaccessfileorarray
 */
public class HugePdfFile extends AbstractPdfFile {

	/** @see AbstractPdfFile#AbstractPdfFile(File, String...) */
	public HugePdfFile(File path, String...more) {
		super(path, more);
	}

	/** @see AbstractPdfFile#AbstractPdfFile(String, String...) */
	public HugePdfFile(String pathname, String...more) {
		super(pathname, more);
	}

	/** @see AbstractPdfFile#AbstractPdfFile(File) */
	public HugePdfFile(File path) {
		super(path);
	}


	/** Only parts of the pdf are read as needed */
	@Override
	public PdfReader getPdfReader(byte[] ownerPassword) throws IOException {
		return new PdfReader(new RandomAccessFileOrArray(getAbsolutePath(), false, true), ownerPassword);
	}


}