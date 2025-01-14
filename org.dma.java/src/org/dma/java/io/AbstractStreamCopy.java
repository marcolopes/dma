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
import java.io.IOException;

public abstract class AbstractStreamCopy {

	public abstract boolean cancel();

	/** Streams must be closed by caller */
	public void copy(BufferedInputStream in, BufferedOutputStream out) throws IOException, InterruptedException {

		byte[] buffer=new byte[1024];

		int len;
		// Transfer bytes from input to output
		while(!cancel() && (len=in.read(buffer)) > 0){
			out.write(buffer, 0, len);
		}

		if (cancel()) throw new InterruptedException();

	}


}
