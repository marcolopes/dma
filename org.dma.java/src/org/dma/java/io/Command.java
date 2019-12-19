/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

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


	/** value=null to remove var */
	public void setVariable(String var, String value) {

		Map<String, String> env=builder.environment();
		env.put(var, value);
		if (value==null || value.isEmpty()) env.remove(var);

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


}
