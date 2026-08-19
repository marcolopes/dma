/*******************************************************************************
 * Copyright 2008-2026 Marco Lopes (marcolopespt@gmail.com)
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
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public abstract class AbstractZipExtract extends AbstractStreamCopy {

	public final File src;
	private final Charset charset;

	public AbstractZipExtract(File src, Charset charset) {
		this.src=src;
		this.charset=charset;
	}

	public boolean to(Folder folder, Collection<File> files) {

		try{create(folder);

			ZipInputStream in=new ZipInputStream(new BufferedInputStream(new FileInputStream(src)), charset);
			try{ZipEntry entry;
				while((entry=in.getNextEntry())!=null){
					File dst=new CustomFile(folder, entry.getName());
					if (entry.isDirectory()){
						create(dst);
					}else{
						create(dst.getParentFile());
						BufferedOutputStream out=new BufferedOutputStream(new FileOutputStream(dst));
						try{copy(in, out);
						}finally{
							out.close();
						}files.add(dst);
					}in.closeEntry();
				}
			}finally{
				in.close();
			}return true;

		}catch(InterruptedException e){
			System.out.println(e);
		}catch(Exception e){
			System.err.println(e);
		}return false;

	}

	private void create(File folder) throws IOException {
		if (folder!=null && !folder.exists()){
			create(folder.getParentFile());
			if (!folder.mkdir() && !folder.exists()) throw new IOException("Could not create: "+folder);
		}
	}


}