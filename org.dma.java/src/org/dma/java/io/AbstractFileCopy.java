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

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public abstract class AbstractFileCopy extends AbstractStreamCopy {

	public final File src;

	public AbstractFileCopy(File src) {
		this.src=src;
	}


	/**
	 * Copies SOURCE file to DESTINATION file
	 * @return
	 * true if copy was completed<br>
	 * false if canceled or error
	 */
	public boolean to(File dst) {

		//avoid self copy!
		if (new CustomFile(src).equals(dst)) return true;

		try{BufferedInputStream in=new BufferedInputStream(new FileInputStream(src));

			BufferedOutputStream out=new BufferedOutputStream(new FileOutputStream(dst));

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


	public boolean to(String dst) {

		return to(new File(dst));

	}


}
