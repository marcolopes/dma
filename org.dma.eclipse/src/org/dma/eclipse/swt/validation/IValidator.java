/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.validation;

public interface IValidator {

	public void setValidationManager(ValidationManager validationManager);

	public void unregisterAll();

	public void validateFields();

	public void validateToolBar();

	public void clearError();

	public boolean hasError();

	public String getErrorMessage();

	public void postErrorMessage(String message);

}
