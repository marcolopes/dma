/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.validation.table;

import java.util.LinkedHashMap;
import java.util.Map;

import org.dma.eclipse.swt.validation.IValidationManager;
import org.dma.eclipse.swt.validation.IValidator;
import org.dma.eclipse.swt.validation.ValidationManager;
import org.dma.eclipse.swt.validation.field.FieldFormat;
import org.dma.eclipse.swt.viewers.TableViewerContainer;
import org.dma.java.util.Debug;
import org.dma.java.util.StringUtils;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;

public abstract class TableValidator<T> implements IValidator {

	public abstract void validateLine(T element);
	public abstract String processMessage(String message, String label);

	private final SelectionListener selectionListener=new SelectionListener() {
		@Override
		public void widgetSelected(SelectionEvent e) {
			Debug.out("TABLE");
			if(!viewer.isCellEditorActive()) validateTable();
		}
		@Override
		public void widgetDefaultSelected(SelectionEvent e) {}
	};

	private final FocusListener focusListener=new FocusListener(){
		@Override
		public void focusGained(FocusEvent event) {}
		@Override
		public void focusLost(FocusEvent event) {
			Debug.out("TABLE");
			if(!viewer.isCellEditorActive()) validateTable();
		}
	};

	/** Insertion-ordered KEYS */
	private final Map<String, ColumnValidationBinding> validatorMap=new LinkedHashMap();

	private IValidationManager validationManager=new ValidationManager(this);

	protected final TableViewerContainer<T> tableContainer;
	protected final TableViewer viewer;
	protected final Table table;

	public TableValidator(TableViewerContainer tableContainer) {
		this.tableContainer=tableContainer;
		this.viewer=tableContainer.getViewer();
		this.table=viewer.getTable();
		table.addSelectionListener(selectionListener);
		table.addFocusListener(focusListener);
	}


	public void dispose() {
		table.removeSelectionListener(selectionListener);
		table.removeFocusListener(focusListener);
		unregisterAll();
	}

	/** Text / combo (with regex) */
	public ColumnValidationBinding register(String property, Control inputControl, FieldFormat fieldFormat, String fieldLabel) {

		ColumnValidationBinding binding=new ColumnValidationBinding(inputControl, fieldFormat, fieldLabel){
			@Override
			public String processMessage(String message, String label) {
				return TableValidator.this.processMessage(message, label);
			}
		};
		register(property, binding);
		return binding;

	}

	/** Generic (no regex) */
	public ColumnValidationBinding register(String property, Control inputControl, String fieldLabel) {

		ColumnValidationBinding binding=new ColumnValidationBinding(inputControl, fieldLabel){
			@Override
			public String processMessage(String message, String label) {
				return TableValidator.this.processMessage(message, label);
			}
		};
		register(property, binding);
		return binding;

	}


	private void register(String property, ColumnValidationBinding binding) {

		if(validatorMap.containsKey(property))
			throw new Error("VALIDATOR ALREADY REGISTERED :"+property);

		validatorMap.put(property, binding);

	}


	public void unregister(String property) {

		ColumnValidationBinding binding=validatorMap.remove(property);
		if(binding!=null) binding.dispose();

	}



	/*
	 * Validation
	 */
	public void validateTable() {

		validationManager.processValidators();

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

		clearError();

		for(TableItem item: table.getItems()){
			validateLine((T)item.getData());
		}

	}


	@Override
	public void clearError() {

		for(ColumnValidationBinding binding: validatorMap.values()){
			binding.clearError();
		}

	}


	@Override
	public boolean hasError() {

		for(ColumnValidationBinding binding: validatorMap.values()){
			if(binding.hasError()) return true;
		}

		return false;

	}


	@Override
	public String getErrorMessage() {

		String errorMessage="";

		for(ColumnValidationBinding binding: validatorMap.values()){
			if(binding.hasError())
				errorMessage=StringUtils.addIfNotEmpy(errorMessage,"; ")+binding.getMessage();
		}

		return errorMessage;

	}



	/*
	 * Getters and setters
	 */
	public ColumnValidationBinding getProperty(String property) {
		return validatorMap.get(property);
	}


}
