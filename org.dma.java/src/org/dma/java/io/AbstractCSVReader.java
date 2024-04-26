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
