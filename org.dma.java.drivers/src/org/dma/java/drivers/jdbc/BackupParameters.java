/*******************************************************************************
 * 2008-2022 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.drivers.jdbc;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.dma.java.io.Command;
import org.dma.java.util.StringList;

public class BackupParameters {

	public static class Arguments extends ArrayList<String> {

		private static final long serialVersionUID = 1L;

		public static final String USER = "[user]";
		public static final String PASSWORD = "[password]";
		public static final String DATABASE = "[database]";
		public static final String DUMP = "[dump]";

		/** Arguments separated by comma */
		public Arguments(String arguments) {
			this(arguments.split(","));
		}

		public Arguments(String...arguments) {
			this();
			for(String element: arguments) add(element);
		}

		public Arguments() {
			super();
		}

		@Override
		public boolean add(String element) {
			return element.isEmpty() ? false : super.add(element);
		}

		@Override
		public String toString() {
			return new StringList(this).concat(", ");
		}

	}

	public final String folder;
	public final String command;
	public final Arguments arguments;

	public BackupParameters() {
		this("", "", null);
	}

	public BackupParameters(String folder, String command, Arguments arguments) {
		this.folder=folder;
		this.command=command;
		this.arguments=arguments==null ? new Arguments() : arguments;
	}

	public Command buildCommand(String database, String user, String password, File dump) {

		List<String> args=new ArrayList();

		for(String arg: arguments){
			for(String[] value: new String[][]{
				{Arguments.USER, user},
				{Arguments.PASSWORD, password},
				{Arguments.DATABASE, database},
				{Arguments.DUMP, dump.getAbsolutePath()}}){
				arg=arg.replace(value[0], value[1]);
			}args.add(arg.trim());
		}

		return new Command(command, args);

	}

	public boolean isEmpty() {
		return folder.isEmpty() &&
				command.isEmpty() &&
				arguments.isEmpty();
	}

}