/*******************************************************************************
 * 2008-2020 Public Domain
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
import java.util.Collections;
import java.util.List;

public class Command {

	/** Build command list */
	public static List<String> buildCommand(String program, List<String> args) {
		List<String> command=new ArrayList(args.size()+1);
		command.add(program);
		command.addAll(args);
		return Collections.unmodifiableList(command);
	}

	private final ProcessBuilder builder;

	public Command(String program, String...args) {
		this(program, Arrays.asList(args));
	}

	public Command(String program, List<String> args) {
		this(buildCommand(program, args));
	}

	public Command(List<String> command) {
		builder=new ProcessBuilder(command);
		//redirect errors to standard output
		builder.redirectErrorStream(true);
	}


	/** @see ProcessBuilder#directory(File) */
	public void setDirectory(File directory) {

		builder.directory(directory);

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

		BufferedReader in=new BufferedReader(
				new InputStreamReader(process.getInputStream()));
		try{
			String line;
			while((line=in.readLine())!=null){
				System.out.println(line);
			}
		}finally{
			in.close();
		}

		return process;

	}


	/** @see Process#waitFor() */
	public int startAndWait() throws IOException, InterruptedException {

		return start().waitFor();

	}


	@Override
	public String toString() {
		return builder.command().toString();
	}


	public static void main(String[] argvs) throws Exception {

		FileParameters parameters=new FileParameters("new image", "jpg", "c:\\tmp");
		//create working folder
		new FolderHandler(parameters.folder).create();
		//create empty image
		new ByteFileHandler(parameters.toFile()).write(new byte[0]);

		Command cmd=new Command("mspaint", parameters.filename);
		cmd.setDirectory(parameters.folder);
		cmd.setVariable("VAR", "value");
		//execute command
		if (cmd.startAndWait()!=0) throw new Exception(cmd.toString());

	}


}
