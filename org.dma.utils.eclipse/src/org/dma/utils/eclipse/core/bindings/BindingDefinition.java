/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.core.bindings;

import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.IObservableValue;

public class BindingDefinition {

	private final IObservableValue targetObservableValue;
	private final IObservableValue modelObservableValue;

	private final UpdateValueStrategy targetToModel;
	private final UpdateValueStrategy modelToTarget;

	/**
	 * Bidirectional convertion TARGET <-> MODEL
	 */
	public BindingDefinition(IObservableValue targetObservableValue, IObservableValue modelObservableValue,
			UpdateValueStrategy targetToModel, UpdateValueStrategy modelToTarget) {

		this.targetObservableValue=targetObservableValue;
		this.modelObservableValue=modelObservableValue;

		this.targetToModel=targetToModel;
		this.modelToTarget=modelToTarget;

	}

	/**
	 * Unidirectional convertion MODEL -> TARGET
	 */
	public BindingDefinition(IObservableValue targetObservableValue, IObservableValue modelObservableValue,
			UpdateValueStrategy modelToTarget) {

		this(targetObservableValue, modelObservableValue, null, modelToTarget);

	}

	/**
	 * NO convertion
	 */
	public BindingDefinition(IObservableValue targetObservableValue, IObservableValue modelObservableValue) {

		this(targetObservableValue, modelObservableValue, null);

	}


	public void dispose() {

		targetObservableValue.dispose();
		modelObservableValue.dispose();

	}




	/*
	 * Getters and setters
	 */
	public IObservableValue getTargetObservableValue() {
		return targetObservableValue;
	}

	public IObservableValue getModelObservableValue() {
		return modelObservableValue;
	}

	public UpdateValueStrategy getTargetToModel() {
		return targetToModel;
	}

	public UpdateValueStrategy getModelToTarget() {
		return modelToTarget;
	}


}
