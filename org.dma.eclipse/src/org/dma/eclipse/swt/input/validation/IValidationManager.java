/*******************************************************************************
 * Copyright 2008-2021 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.eclipse.swt.input.validation;

public interface IValidationManager {

	public IValidationManager register(String property, IValidator validator);

	public IValidator remove(String property);

	public void unregister(String property);

	public void unregisterAll();

	public boolean validateAll();

	public boolean hasError();

	public String getErrorMessage();

	public void postError(String message);

	@Deprecated
	public String getErrorMessage(String property);


}
