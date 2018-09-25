/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.core.bindings;

import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.databinding.observable.value.IObservableValue;

public class ValueBindingDefinition {

	private final IObservableValue targetObservableValue;
	private final IObservableValue modelObservableValue;

	private final UpdateValueStrategy targetToModelUpdate=new UpdateValueStrategy();
	private final UpdateValueStrategy modelToTargetUpdate=new UpdateValueStrategy();

	/** NO convertion */
	public ValueBindingDefinition(IObservableValue targetObservableValue, IObservableValue modelObservableValue) {

		this(targetObservableValue, modelObservableValue, null);

	}

	/** Unidirectional convertion MODEL -> TARGET */
	public ValueBindingDefinition(IObservableValue targetObservableValue, IObservableValue modelObservableValue,
			IConverter modelToTargetConverter) {

		this(targetObservableValue, modelObservableValue, null, modelToTargetConverter);

	}

	/** Bidirectional convertion TARGET <-> MODEL */
	public ValueBindingDefinition(IObservableValue targetObservableValue, IObservableValue modelObservableValue,
			IConverter targetToModelConverter, IConverter modelToTargetConverter) {

		this.targetObservableValue=targetObservableValue;
		this.modelObservableValue=modelObservableValue;

		this.targetToModelUpdate.setConverter(targetToModelConverter);
		this.modelToTargetUpdate.setConverter(modelToTargetConverter);

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


	public UpdateValueStrategy getTargetToModelUpdate() {
		return targetToModelUpdate;
	}

	public UpdateValueStrategy getModelToTargetUpdate() {
		return modelToTargetUpdate;
	}


}