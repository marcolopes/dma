/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.input.validation;

public interface IValidator {

	public void setValidationManager(ValidationManager validationManager);

	public void unregisterAll();

	public void validateFields();

	public void validateToolBar();

	public void clearError();

	public boolean hasError();

	public String getErrorMessage();

	public void postError(String message);

}
