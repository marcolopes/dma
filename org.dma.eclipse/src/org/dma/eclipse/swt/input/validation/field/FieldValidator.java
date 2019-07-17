/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.input.validation.field;

import java.util.LinkedHashMap;
import java.util.Map;

import org.dma.eclipse.swt.input.validation.IValidationManager;
import org.dma.eclipse.swt.input.validation.IValidator;
import org.dma.eclipse.swt.input.validation.ValidationManager;
import org.dma.eclipse.swt.input.validation.field.FieldError.ERRORS;
import org.dma.java.input.FieldFormat;
import org.dma.java.util.Debug;
import org.dma.java.util.StringUtils;

import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;

public abstract class FieldValidator implements IValidator {

	public abstract boolean isEdited();
	public abstract void validateInput();
	public abstract String processError(ERRORS error, String message, String label);

	/** Insertion-ordered KEYS */
	private final Map<String, FieldBinding> validatorMap=new LinkedHashMap();

	private IValidationManager validationManager=new ValidationManager(this);

	/** Text / combo (with regex) */
	public FieldBinding register(String property, Label label, Control control, FieldFormat fieldFormat, int rules) {

		return register(property, new FieldBinding(label, control, fieldFormat, rules){
			@Override
			public String processError(ERRORS error, String message, String label) {
				return FieldValidator.this.processError(error, message, label);
			}
		});

	}

	/** Text / combo / list / button (no regex) */
	public FieldBinding register(String property, Label label, Control control, int rules) {

		return register(property, new FieldBinding(label, control, rules){
			@Override
			public String processError(ERRORS error, String message, String label) {
				return FieldValidator.this.processError(error, message, label);
			}
		});

	}

	/** Generic (no regex) */
	public FieldBinding register(String property, Control control, int rules) {

		return register(property, new FieldBinding(control, rules){
			@Override
			public String processError(ERRORS error, String message, String label) {
				return FieldValidator.this.processError(error, message, label);
			}
		});

	}


	protected FieldBinding register(String property, FieldBinding binding) {

		if(validatorMap.containsKey(property))
			throw new RuntimeException("VALIDATOR ALREADY REGISTERED :"+property);

		//needed in MAC
		binding.reset();
		binding.validate(isEdited());
		binding.update();

		//listeners
		binding.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				Debug.out();
				validationManager.processValidators();
			}
			@Override
			public void focusLost(FocusEvent e) {
				Debug.out();
				//validationManager.processValidators();
			}
		});

		binding.addSelectionListener(new Listener() {
			@Override
			public void handleEvent(Event e) {
				Debug.out();
				validationManager.processValidators();
			}
		});

		validatorMap.put(property, binding);

		return binding;

	}


	public void unregister(String property) {

		FieldBinding binding=validatorMap.remove(property);
		if(binding!=null) binding.dispose();

	}



	/*
	 * Validation
	 */
	private void resetBindings() {

		for(FieldBinding binding: validatorMap.values()){
			binding.reset();
		}

	}


	private void validateBindings() {

		for(FieldBinding binding: validatorMap.values()){
			binding.validate(isEdited());
		}

	}


	private void updateBindings() {

		for(FieldBinding binding: validatorMap.values()){
			binding.update();
		}

	}



	/*
	 * (non-Javadoc)
	 * @see org.dma.eclipse.swt.validation.IValidator
	 */
	@Override
	public void setValidationManager(ValidationManager validationManager) {
		this.validationManager=validationManager;
	}


	@Override
	public void unregisterAll() {

		Debug.out(validatorMap.keySet());

		while(!validatorMap.isEmpty()){
			String property=validatorMap.keySet().iterator().next();
			unregister(property);
		}

	}


	@Override
	public void validateFields() {

		resetBindings();
		validateBindings();
		validateInput();
		updateBindings();

	}


	@Override
	public void clearError() {

		for(FieldBinding binding: validatorMap.values()){
			binding.clearError();
		}

	}


	@Override
	public boolean hasError() {

		for(FieldBinding binding: validatorMap.values()){
			if(binding.hasError()) return true;
		}

		return false;

	}


	@Override
	public String getErrorMessage() {

		String errorMessage="";

		for(FieldBinding binding: validatorMap.values()){
			if(binding.hasError()) errorMessage=StringUtils.addIfNotEmpy(errorMessage,"; ")+binding.getMessage();
		}

		return errorMessage;

	}



	/*
	 * Getters and setters
	 */
	public FieldBinding getProperty(String property) {
		return validatorMap.get(property);
	}


	public IValidationManager getValidationManager() {
		return validationManager;
	}


}
