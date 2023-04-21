/*******************************************************************************
 * Copyright 2008-2021 Marco Lopes (marcolopespt@gmail.com)
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

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public abstract class AbstractURLFileCopy extends AbstractStreamCopy {

	private final URLFile file;

	public AbstractURLFileCopy(URLFile file) {
		this.file=file;
	}

	/**
	 * Downloads the file to DESTINATION
	 * @return
	 * true if download was completed<br>
	 * false if canceled or error
	 */
	public boolean to(File dst) {

		try{File output=new File(dst+".tmp");

			BufferedInputStream in=new BufferedInputStream(file.asInputStream());

			OutputStream out=new BufferedOutputStream(new FileOutputStream(output));

			try{copy(in, out);
			}finally{
				out.close();
				in.close();
			}dst.delete();

			return output.renameTo(dst);

		}catch(InterruptedException e){
			System.out.println(e);
		}catch(Exception e){
			System.err.println(e);
		}return false;

	}


	/**
	 * Uploads the file from SOURCE
	 * @return
	 * true if download was completed<br>
	 * false if canceled or error
	 */
	public boolean from(File src) {

		try{BufferedInputStream in=new BufferedInputStream(new FileInputStream(src));

			OutputStream out=new BufferedOutputStream(file.asOutputStream());

			try{copy(in, out);
			}finally{
				out.close();
				in.close();
			}return true;

		}catch(InterruptedException e){
			System.out.println(e);
		}catch(Exception e){
			System.err.println(e);
		}return false;

	}


}
