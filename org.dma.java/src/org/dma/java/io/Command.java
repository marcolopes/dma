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

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Command {

	private final ProcessBuilder builder;

	/** @see Command#Command(String, List) */
	public Command(String program, String...args) {
		this(program, Arrays.asList(args));
	}

	/**
	 * The WORKING directory will be the current directory
	 * @see Command#Command(File, String, List)
	 */
	public Command(String program, List<String> args) {
		this(null, program, args);
	}

	/** @see Command#Command(File, String, List) */
	public Command(File directory, String program, String...args) {
		this(directory, program, Arrays.asList(args));
	}

	/**
	 * @param directory The WORKING directory (will be LOCKED under Windows!)
	 * The argument may be null (this means to use the working directory of the current Java process)
	 * @param program The program to execute (may include full path)
	 * @param args The program arguments (as many as necessary)
	 */
	public Command(File directory, String program, List<String> args) {
		List<String> command=new ArrayList(args.size()+1);
		command.add(program);
		command.addAll(args);
		builder=new ProcessBuilder(command).
				redirectErrorStream(true).
				directory(directory);
	}


	public String removeVariable(String name) {
		return builder.environment().remove(name);
	}


	/** value=null to remove var */
	public String setVariable(String name, String value) {
		return value==null ? removeVariable(name) : builder.environment().put(name, value);
	}


	public Process start() throws IOException {
		Process process=builder.start();
		BufferedReader in=new BufferedReader(new InputStreamReader(process.getInputStream()));
		try{String line;
			while((line=in.readLine())!=null){
				System.out.println(line);
			}
		}finally{
			in.close();
		}return process;
	}


	/** @see Process#waitFor() */
	public int startAndWait() throws IOException, InterruptedException {
		return start().waitFor();
	}


	@Override
	public String toString() {
		return builder.command().toString();
	}


	public static void main(String[] args) throws Exception {

		FileParameters parameters=new FileParameters("image", "jpg", Folder.temporary());
		//create working folder
		new Folder(parameters.folder).create();
		//create empty image
		new ByteFile(parameters.toFile()).write(new byte[0]);

		Command cmd=new Command(parameters.folder, "mspaint", parameters.filename);
		cmd.setVariable("VAR", "value");
		//execute command
		if (cmd.startAndWait()!=0) throw new Exception(cmd.toString());

	}


}
