/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Runtime {

	public static int execute(List<String> command) throws IOException, InterruptedException {

		ProcessBuilder pb=new ProcessBuilder(command);
		Process process=pb.redirectErrorStream(true).start();

		BufferedReader in=new BufferedReader(new InputStreamReader(process.getInputStream()));
		String line;
		while((line=in.readLine())!=null) {
			System.out.println(line);
		}

		return process.waitFor();

	}


	public static int execute(String...command) throws IOException, InterruptedException {

		return execute(Arrays.asList(command));

	}


}
