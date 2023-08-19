/*******************************************************************************
 * Copyright 2008-2022 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.eclipse.swt.input.validation.field;

import java.util.LinkedHashMap;
import java.util.Map;

import org.dma.eclipse.swt.input.validation.IValidationManager;
import org.dma.eclipse.swt.input.validation.IValidator;
import org.dma.eclipse.swt.input.validation.ValidationManager;
import org.dma.java.util.Debug;
import org.dma.java.util.SystemUtils;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

public abstract class FieldValidator implements IValidator {

	public abstract boolean isEdited();
	public abstract void validateInput();

	/** Insertion-ordered KEYS */
	private final Map<String, FieldBinding> validatorMap=new LinkedHashMap();

	private IValidationManager manager=new ValidationManager(this){
		@Override
		public void postError(String message) {}
	};

	public FieldBinding register(String property, FieldBinding binding) {

		if (validatorMap.containsKey(property))
			throw new RuntimeException("VALIDATOR ALREADY REGISTERED: "+property);

		if (SystemUtils.IS_OS_MAC){
			binding.reset();
			binding.validate(isEdited());
		}binding.update();

		//listeners
		binding.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				Debug.out(manager.validateAll());
			}
		});

		binding.addSelectionListener(new Listener() {
			@Override
			public void handleEvent(Event e) {
				Debug.out(manager.validateAll());
			}
		});

		validatorMap.put(property, binding);

		return binding;

	}


	public void unregister(String property) {

		FieldBinding binding=validatorMap.remove(property);

		if (binding!=null) binding.dispose();

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
	public IValidationManager setManager(IValidationManager manager) {
		return this.manager=manager;
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

		Debug.out("VALIDATING", validatorMap.keySet());

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
			if (binding.hasError()) return true;
		}return false;

	}


	@Override
	public String getErrorMessage() {

		StringBuilder result=new StringBuilder();
		for(FieldBinding binding: validatorMap.values()){
			if (binding.hasError()){
				if (result.length()>0) result.append("; ");
				result.append(binding.getErrorMessage());
			}
		}return result.toString();

	}



	/*
	 * Getters and setters
	 */
	public FieldBinding getProperty(String property) {
		return validatorMap.get(property);
	}


	public IValidationManager getManager() {
		return manager;
	}


}
