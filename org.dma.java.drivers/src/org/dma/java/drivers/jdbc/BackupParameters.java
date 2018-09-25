/*******************************************************************************
 * 2008-2018 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.drivers.jdbc;

import java.util.ArrayList;
import java.util.List;

import org.dma.java.io.Command;
import org.dma.java.io.FileParameters;
import org.dma.java.util.CollectionUtils;

public class BackupParameters {

	public static class Arguments extends ArrayList<String> {

		private static final long serialVersionUID=1L;

		public static final String USER = "[user]";
		public static final String PASSWORD = "[password]";
		public static final String DATABASE = "[database]";
		public static final String DUMP = "[dump]";

		public Arguments() {
			super();
		}

		/** Arguments separated by comma */
		public Arguments(String arguments) {
			this(arguments.split(","));
		}

		public Arguments(String...arguments) {
			for(String element: arguments) add(element);
		}

		@Override
		public boolean add(String element) {
			return element.isEmpty() ? false : super.add(element);
		}

		@Override
		public String toString() {
			return CollectionUtils.concat(this, ", ");
		}

	}

	public final String folder;
	public final String command;
	public final Arguments arguments;

	public BackupParameters() {
		this(null, null, null);
	}

	public BackupParameters(String folder, String command, Arguments arguments) {
		this.folder=folder==null ? "" : folder;
		this.command=command==null ? "" : command;
		this.arguments=arguments==null ? new Arguments() : arguments;
	}

	public Command buildCommand(String database, String user, String password, FileParameters dump) {

		List<String> command=new ArrayList();
		command.add(this.command);

		for(String arg: arguments){
			for(String[] value: new String[][]{
				{Arguments.USER, user},
				{Arguments.PASSWORD, password},
				{Arguments.DATABASE, database},
				{Arguments.DUMP, dump.toString()}}){
				arg=arg.replace(value[0], value[1]);
			}
			command.add(arg.trim());
		}

		return new Command(command);

	}

	public boolean isEmpty() {
		return folder.isEmpty() &&
				command.isEmpty() &&
				arguments.isEmpty();
	}

}