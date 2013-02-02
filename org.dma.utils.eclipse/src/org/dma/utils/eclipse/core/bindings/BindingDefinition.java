/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.core.bindings;

import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.databinding.observable.value.IObservableValue;

public class BindingDefinition {

	private final IObservableValue targetObservableValue;
	private final IObservableValue modelObservableValue;

	private final IConverter targetToModelConverter;
	private final IConverter modelToTargetConverter;

	private final UpdateValueStrategy targetToModel;
	private final UpdateValueStrategy modelToTarget;

	/**
	 * Bidirectional convertion TARGET <-> MODEL
	 */
	public BindingDefinition(IObservableValue targetObservableValue, IObservableValue modelObservableValue,
			IConverter targetToModelConverter, IConverter modelToTargetConverter) {

		this.targetObservableValue=targetObservableValue;
		this.modelObservableValue=modelObservableValue;

		this.targetToModelConverter=targetToModelConverter;
		this.modelToTargetConverter=modelToTargetConverter;

		this.targetToModel=new UpdateValueStrategy().setConverter(targetToModelConverter);
		this.modelToTarget=new UpdateValueStrategy().setConverter(modelToTargetConverter);

	}

	/**
	 * Unidirectional convertion MODEL -> TARGET
	 */
	public BindingDefinition(IObservableValue targetObservableValue, IObservableValue modelObservableValue,
			IConverter modelToTargetConverter) {

		this(targetObservableValue, modelObservableValue, null, modelToTargetConverter);

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


	public IConverter getTargetToModelConverter() {
		return targetToModelConverter;
	}

	public IConverter getModelToTargetConverter() {
		return modelToTargetConverter;
	}


	public UpdateValueStrategy getTargetToModel() {
		return targetToModel;
	}

	public UpdateValueStrategy getModelToTarget() {
		return modelToTarget;
	}


}
