/*******************************************************************************
 * 2008-2021 Public Domain
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
import org.dma.java.util.StringUtils;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;

public abstract class TableValidator<T> implements IValidator {

	public abstract void validateLine(T element);

	private final SelectionListener selectionListener=new SelectionListener() {
		@Override
		public void widgetSelected(SelectionEvent e) {
			Debug.err("TABLE");
			if (!viewer.isCellEditorActive()) validateTable();
		}
		@Override
		public void widgetDefaultSelected(SelectionEvent e) {}
	};

	private final FocusListener focusListener=new FocusListener(){
		@Override
		public void focusGained(FocusEvent e) {}
		@Override
		public void focusLost(FocusEvent e) {
			Debug.out("TABLE");
			if (!viewer.isCellEditorActive()) validateTable();
		}
	};

	/** Insertion-ordered KEYS */
	private final Map<String, ColumnBinding> validatorMap=new LinkedHashMap();

	private IValidationManager validationManager=new ValidationManager(this){
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

		return validationManager.processValidators();

	}



	/*
	 * (non-Javadoc)
	 * @see org.dma.eclipse.swt.validation.IValidator
	 */
	@Override
	public void setValidationManager(IValidationManager validationManager) {
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

		String message="";

		for(ColumnBinding binding: validatorMap.values()){
			if (binding.hasError()) message=StringUtils.addIfNotEmpy(message,"; ")+binding.getErrorMessage();
		}

		return message;

	}



	/*
	 * Getters and setters
	 */
	public ColumnBinding getProperty(String property) {
		return validatorMap.get(property);
	}


}
