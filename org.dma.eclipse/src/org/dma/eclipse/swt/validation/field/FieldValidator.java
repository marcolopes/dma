/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.validation.field;

import java.util.LinkedHashMap;
import java.util.Map;

import org.dma.eclipse.swt.validation.IValidationManager;
import org.dma.eclipse.swt.validation.IValidator;
import org.dma.eclipse.swt.validation.ValidationManager;
import org.dma.eclipse.swt.validation.field.FieldError.ERRORS;
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
	public abstract String processMessage(ERRORS error, String message, String label);

	/** Insertion-ordered KEYS */
	private final Map<String, FieldValidationBinding> validatorMap=new LinkedHashMap();

	private IValidationManager validationManager=new ValidationManager(this);

	/** Text / combo (with regex) */
	public FieldValidationBinding register(String property, Label label, Control control, FieldFormat fieldFormat, int rules) {

		FieldValidationBinding binding=new FieldValidationBinding(label, control, fieldFormat, rules){
			@Override
			public String processMessage(ERRORS error, String message, String label) {
				return FieldValidator.this.processMessage(error, message, label);
			}
		};
		register(property, binding);
		return binding;

	}

	/** Text / combo / list / button (no regex) */
	public FieldValidationBinding register(String property, Label label, Control control, int rules) {

		FieldValidationBinding binding=new FieldValidationBinding(label, control, rules){
			@Override
			public String processMessage(ERRORS error, String message, String label) {
				return FieldValidator.this.processMessage(error, message, label);
			}
		};
		register(property, binding);
		return binding;

	}

	/** Generic (no regex) */
	public FieldValidationBinding register(String property, Control control, int rules) {

		FieldValidationBinding binding=new FieldValidationBinding(control, rules){
			@Override
			public String processMessage(ERRORS error, String message, String label) {
				return FieldValidator.this.processMessage(error, message, label);
			}
		};
		register(property, binding);
		return binding;

	}


	protected void register(String property, FieldValidationBinding binding) {

		if(validatorMap.containsKey(property))
			throw new Error("VALIDATOR ALREADY REGISTERED :"+property);

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
			}
		});

		binding.addSelectionListener(new Listener() {
			@Override
			public void handleEvent(Event event) {
				Debug.out();
				validationManager.processValidators();
			}
		});

		validatorMap.put(property, binding);

	}


	public void unregister(String property) {

		FieldValidationBinding binding=validatorMap.remove(property);
		if(binding!=null) binding.dispose();

	}



	/*
	 * Validation
	 */
	private void resetBindings() {

		for(FieldValidationBinding binding: validatorMap.values()){
			binding.reset();
		}

	}


	private void validateBindings() {

		for(FieldValidationBinding binding: validatorMap.values()){
			binding.validate(isEdited());
		}

	}


	private void updateBindings() {

		for(FieldValidationBinding binding: validatorMap.values()){
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

		for(FieldValidationBinding binding: validatorMap.values()){
			binding.clearError();
		}

	}


	@Override
	public boolean hasError() {

		for(FieldValidationBinding binding: validatorMap.values()){
			if(binding.hasError()) return true;
		}

		return false;

	}


	@Override
	public String getErrorMessage() {

		String errorMessage="";

		for(FieldValidationBinding binding: validatorMap.values()){
			if(binding.hasError())
				errorMessage=StringUtils.addIfNotEmpy(errorMessage,"; ")+binding.getMessage();
		}

		return errorMessage;

	}



	/*
	 * Getters and setters
	 */
	public FieldValidationBinding getProperty(String property) {
		return validatorMap.get(property);
	}


	public IValidationManager getValidationManager(){
		return validationManager;
	}


}
