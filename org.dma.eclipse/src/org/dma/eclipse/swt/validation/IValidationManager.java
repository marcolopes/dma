/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.validation;

public interface IValidationManager {

	public void register(String property, IValidator validator);

	public IValidator remove(String property);

	public void unregister(String property);

	public void unregisterAll();

	public void processValidators();

	public boolean hasError();

	public String getErrorMessage(String property);

	public String getErrorMessage();


}
