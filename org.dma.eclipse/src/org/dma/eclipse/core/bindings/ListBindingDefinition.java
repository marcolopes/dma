/*******************************************************************************
 * Copyright 2008-2016 Marco Lopes (marcolopespt@gmail.com)
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