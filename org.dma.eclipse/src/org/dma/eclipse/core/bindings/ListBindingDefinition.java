/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.core.bindings;

import org.eclipse.core.databinding.UpdateListStrategy;
import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.databinding.observable.list.IObservableList;

public class ListBindingDefinition {

	private final IObservableList targetObservableList;
	private final IObservableList modelObservableList;

	private final UpdateListStrategy targetToModelUpdate=new UpdateListStrategy();
	private final UpdateListStrategy modelToTargetUpdate=new UpdateListStrategy();

	/** NO convertion */
	public ListBindingDefinition(IObservableList targetObservableList, IObservableList modelObservableList) {

		this(targetObservableList, modelObservableList, null);

	}

	/** Unidirectional convertion MODEL -> TARGET */
	public ListBindingDefinition(IObservableList targetObservableList, IObservableList modelObservableList,
			IConverter modelToTargetConverter) {

		this(targetObservableList, modelObservableList, null, modelToTargetConverter);

	}

	/** Bidirectional convertion TARGET <-> MODEL */
	public ListBindingDefinition(IObservableList targetObservableList, IObservableList modelObservableList,
			IConverter targetToModelConverter, IConverter modelToTargetConverter) {

		this.targetObservableList=targetObservableList;
		this.modelObservableList=modelObservableList;

		this.targetToModelUpdate.setConverter(targetToModelConverter);
		this.modelToTargetUpdate.setConverter(modelToTargetConverter);

	}



	/*
	 * Getters and setters
	 */
	public IObservableList getTargetObservableList() {
		return targetObservableList;
	}

	public IObservableList getModelObservableList() {
		return modelObservableList;
	}


	public UpdateListStrategy getTargetToModelUpdate() {
		return targetToModelUpdate;
	}

	public UpdateListStrategy getModelToTargetUpdate() {
		return modelToTargetUpdate;
	}


}