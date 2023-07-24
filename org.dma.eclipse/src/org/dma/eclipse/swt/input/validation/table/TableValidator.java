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
package org.dma.eclipse.swt.input.validation.table;

import java.util.LinkedHashMap;
import java.util.Map;

import org.dma.eclipse.swt.input.validation.IValidationManager;
import org.dma.eclipse.swt.input.validation.IValidator;
import org.dma.eclipse.swt.input.validation.ValidationManager;
import org.dma.java.util.Debug;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;

public abstract class TableValidator<T> implements IValidator {

	public abstract void validateLine(T element);

	private final SelectionListener selectionListener=new SelectionAdapter() {
		@Override
		public void widgetSelected(SelectionEvent e) {
			Debug.err("TABLE");
			if (!viewer.isCellEditorActive()) validateTable();
		}
	};

	private final FocusListener focusListener=new FocusAdapter() {
		@Override
		public void focusLost(FocusEvent e) {
			Debug.out("TABLE");
			if (!viewer.isCellEditorActive()) validateTable();
		}
	};

	/** Insertion-ordered KEYS */
	private final Map<String, ColumnBinding> validatorMap=new LinkedHashMap();

	private IValidationManager manager=new ValidationManager(this){
		@Override
		public void postError(String message) {}
	};

	protected final TableViewer viewer;
	protected final Table table;

	public TableValidator(TableViewer viewer) {
		this.viewer=viewer;
		this.table=viewer.getTable();
		table.addSelectionListener(selectionListener);
		table.addFocusListener(focusListener);
	}


	public void dispose() {
		table.removeFocusListener(focusListener);
		table.removeSelectionListener(selectionListener);
		unregisterAll();
	}


	public ColumnBinding register(String property, ColumnBinding binding) {

		if (validatorMap.containsKey(property))	throw new RuntimeException("VALIDATOR ALREADY REGISTERED :"+property);

		validatorMap.put(property, binding);

		return binding;

	}


	public void unregister(String property) {

		ColumnBinding binding=validatorMap.remove(property);

		if (binding!=null) binding.dispose();

	}



	/*
	 * Validation
	 */
	public boolean validateTable() {

		Debug.err("VALIDATING", validatorMap.keySet());

		return manager.validateAll();

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

		clearError();

		for(TableItem item: table.getItems()){
			validateLine((T)item.getData());
		}

	}


	@Override
	public void clearError() {

		for(ColumnBinding binding: validatorMap.values()){
			binding.clearError();
		}

	}


	@Override
	public boolean hasError() {

		for(ColumnBinding binding: validatorMap.values()){
			if (binding.hasError()) return true;
		}return false;

	}


	@Override
	public String getErrorMessage() {

		StringBuilder result=new StringBuilder();
		for(ColumnBinding binding: validatorMap.values()){
			if (binding.hasError()){
				if (result.length()>0) result.append("; ");
				result.append(binding.getErrorMessage());
			}
		}return result.toString();

	}



	/*
	 * Getters and setters
	 */
	public ColumnBinding getProperty(String property) {
		return validatorMap.get(property);
	}


}
