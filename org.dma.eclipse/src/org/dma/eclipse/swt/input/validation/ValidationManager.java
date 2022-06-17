/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.input.validation;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class ValidationManager implements IValidationManager {

	/** Insertion-ordered KEYS */
	private final Map<String, IValidator> validatorMap=new LinkedHashMap();

	public ValidationManager() {}

	/** Isolated validador */
	public ValidationManager(IValidator validator) {
		register(getClass().getName(), validator);
	}


	@Override
	public IValidationManager register(String property, IValidator validator) {

		if (validatorMap.containsKey(property))
			throw new RuntimeException("VALIDATOR ALREADY REGISTERED :"+property);

		validatorMap.put(property, validator);

		return validator.setManager(this);

	}


	/** DOES NOT UNREGISTER associated validador */
	@Override
	public IValidator remove(String property) {

		IValidator validator=validatorMap.remove(property);

		if (validator!=null) validator.clearError();

		return validator;

	}


	@Override
	public void unregister(String property) {

		IValidator validator=remove(property);

		if (validator!=null) validator.unregisterAll();

	}


	@Override
	public void unregisterAll() {

		while(!validatorMap.isEmpty()){
			String property=validatorMap.keySet().iterator().next();
			unregister(property);
		}

	}


	@Override
	public boolean validateAll() {

		for(IValidator validator: validatorMap.values()){
			validator.validateFields();
			validator.validateButtons();
		}

		postError(getErrorMessage());

		return !hasError();

	}



	/*
	 * Errors
	 */
	@Override
	public boolean hasError() {

		for(IValidator validator: validatorMap.values()){
			if (validator.hasError()) return true;
		}return false;

	}


	@Override
	public String getErrorMessage() {

		StringBuilder result=new StringBuilder();
		for(IValidator validator: validatorMap.values()){
			if (validator.hasError()){
				if (result.length()>0) result.append("; ");
				result.append(validator.getErrorMessage());
			}
		}return result.toString();

	}


	@Deprecated
	@Override
	public String getErrorMessage(String property) {

		IValidator validator=validatorMap.get(property);

		return validator==null || !validator.hasError() ? "" : validator.getErrorMessage();

	}


}