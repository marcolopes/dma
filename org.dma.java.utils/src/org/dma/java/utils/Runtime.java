/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runtime {

	public static int execute(String...command) throws IOException, InterruptedException {

		ProcessBuilder pb=new ProcessBuilder(command);
		pb.redirectErrorStream(true);
		Process process=pb.start();

		BufferedReader in=new BufferedReader(new InputStreamReader(process.getInputStream()));
		String line;
		while((line=in.readLine())!=null) {
			System.out.println(line);
		}

		return process.waitFor();

	}


}
