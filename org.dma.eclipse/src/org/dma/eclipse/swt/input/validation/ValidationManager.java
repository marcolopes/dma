/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.input.validation;

import java.util.LinkedHashMap;
import java.util.Map;

import org.dma.java.util.StringUtils;

public class ValidationManager implements IValidationManager {

	/** Insertion-ordered KEYS */
	private final Map<String, IValidator> validatorMap=new LinkedHashMap();

	public ValidationManager() {}

	/** Isolated validador */
	public ValidationManager(IValidator validator) {
		register(getClass().getName(), validator);
	}


	@Override
	public void register(String property, IValidator validator) {

		if(validatorMap.containsKey(property))
			throw new RuntimeException("VALIDATOR ALREADY REGISTERED :"+property);

		validator.setValidationManager(this);
		validatorMap.put(property, validator);

	}


	/** DOES NOT UNREGISTER associated validador */
	@Override
	public IValidator remove(String property) {

		IValidator validator=validatorMap.remove(property);
		if(validator!=null) validator.clearError();

		return validator;

	}


	@Override
	public void unregister(String property) {

		IValidator validator=remove(property);
		if(validator!=null) validator.unregisterAll();

	}


	@Override
	public void unregisterAll() {

		while(!validatorMap.isEmpty()){
			String property=validatorMap.keySet().iterator().next();
			unregister(property);
		}

	}


	@Override
	public void processValidators() {

		for(IValidator validator: validatorMap.values()){
			validator.validateFields();
			validator.validateButtons();
			validator.postError(getErrorMessage());
		}

	}



	/*
	 * Errors
	 */
	@Override
	public boolean hasError() {

		for(IValidator validator: validatorMap.values()){
			if(validator.hasError()) return true;
		}

		return false;

	}


	@Override
	public String getErrorMessage(String property) {

		IValidator validator=validatorMap.get(property);

		return validator==null || !validator.hasError() ? "" : validator.getErrorMessage();

	}


	@Override
	public String getErrorMessage() {

		String errorMessage="";

		for(String property: validatorMap.keySet()){
			String propertyError=getErrorMessage(property);
			if(!propertyError.isEmpty())
				errorMessage=StringUtils.addIfNotEmpy(errorMessage,"; ")+propertyError;
		}

		return errorMessage;

	}


}