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
import java.util.zip.ZipOutputStream;

public abstract class AbstractZipAppend extends AbstractStreamCopy {

	public final File dst;
	private final Charset charset;

	public AbstractZipAppend(File dst, Charset charset) {
		this.dst=dst;
		this.charset=charset;
	}

	public boolean from(Collection<File> files, int method) {

		try{ZipOutputStream out=new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(dst)), charset);
			try{for(File file: files){
					ZipEntry entry=new ZipEntry(file.getName());
					entry.setMethod(method);
					append(file, entry, out);
				}
			}finally{
				out.close();
			}return true;

		}catch(InterruptedException e){
			System.out.println(e);
		}catch(Exception e){
			System.err.println(e);
		}return false;

	}

	private void append(File file, ZipEntry entry, ZipOutputStream out) throws IOException, InterruptedException {

		if (file.isDirectory()){
			File[] children=file.listFiles();
			if (children!=null && children.length>0){
				for(File child: children){
					ZipEntry nextEntry=nextEntry(entry, entry.getName()+"/"+child.getName());
					append(child, nextEntry, out);
				}
			}else{
				ZipEntry nextEntry=nextEntry(entry, entry.getName()+"/");
				out.putNextEntry(nextEntry);
				out.closeEntry();
			}
		}else{
			out.putNextEntry(entry);
			BufferedInputStream in=new BufferedInputStream(new FileInputStream(file));
			try{copy(in, out);
			}finally{
				in.close();
			}out.closeEntry();
		}

	}

	private ZipEntry nextEntry(ZipEntry entry, String name) {
		ZipEntry nextEntry=new ZipEntry(name);
		nextEntry.setMethod(entry.getMethod());
		return nextEntry;
	}


}