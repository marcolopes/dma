/*******************************************************************************
 * 2008-2021 Public Domain
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
