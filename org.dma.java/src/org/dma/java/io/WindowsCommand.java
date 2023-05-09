/*******************************************************************************
 * Copyright 2008-2023 Marco Lopes (marcolopespt@gmail.com)
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

public class WindowsCommand extends Command {

	/** @see WindowsCommand#WindowsCommand(File, String) */
	public WindowsCommand(String command) {
		this(null, command);
	}

	/**
	 * https://ss64.com/nt/cmd.html
	 *
	 * @param directory The WORKING directory (will be LOCKED!)
	 * @param command The command, program or batch script to be run.
	 * This can even be several commands separated with '&'
	 * (the whole should also be surrounded by "quotes")
	 *
	 * @see Command#Command(File, String, String...)
	 */
	public WindowsCommand(File directory, String command) {
		super(directory, "cmd", "/C", command);
	}


}
