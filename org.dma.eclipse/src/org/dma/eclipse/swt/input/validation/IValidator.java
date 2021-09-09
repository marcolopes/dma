/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.input.validation;

public interface IValidator {

	public IValidationManager setManager(IValidationManager manager);

	public void unregisterAll();

	public void validateFields();

	public void validateButtons();

	public void clearError();

	public boolean hasError();

	public String getErrorMessage();

}
