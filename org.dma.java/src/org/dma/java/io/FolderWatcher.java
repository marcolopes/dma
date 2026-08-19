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

import java.io.File;
import java.nio.file.ClosedWatchServiceException;
import java.nio.file.FileSystems;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public abstract class FolderWatcher {

	public abstract void onChange(STATUS status);
	/** Returns false if interrupted */
	public abstract boolean onChange(File[] files);

	public enum STATUS {RUNNING, STOPPED}

	private volatile STATUS status=STATUS.STOPPED;
	public STATUS getStatus() {return status;}

	private WatchService watcher;

	private final Folder folder;

	public FolderWatcher(Folder folder) {
		this.folder=folder;
	}

	private void changeStatus() {
		switch(status){
		case STOPPED: status=STATUS.RUNNING; break;
		case RUNNING: status=STATUS.STOPPED; break;
		}onChange(status);
	}

	public File[] listFiles() {
		File[] files=folder.listFiles();
		return files==null ? new File[0] : files;
	}

	public synchronized void start() throws Exception {

		if (status==STATUS.STOPPED){

			watcher=FileSystems.getDefault().newWatchService();
			Paths.get(folder.getPath()).register(watcher, StandardWatchEventKinds.ENTRY_CREATE);

			changeStatus();

			Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
				public void run() {
					stop();
				}
			}));

			new Thread(new Runnable(){
				@Override
				public void run() {
					while(status==STATUS.RUNNING) try{
						WatchKey key=watcher.take();
						Thread.sleep(1000);
						if (!key.pollEvents().isEmpty() && !onChange(listFiles())) throw new InterruptedException();
						if (!key.reset()) new InterruptedException();

					}catch(ClosedWatchServiceException e){
					}catch(InterruptedException e){
					}catch(Exception e){
						System.err.println(e);
					}stop();
				}
			}).start();

		}

	}

	public synchronized void stop() {

		if (status==STATUS.RUNNING) try{

			watcher.close();

			changeStatus();

		}catch(Exception e){
			System.err.println(e);
		}

	}

}