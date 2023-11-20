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

import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.databinding.observable.value.IObservableValue;

public class ValueBindingDefinition {

	private final IObservableValue targetObservableValue;
	private final IObservableValue modelObservableValue;

	private final UpdateValueStrategy targetToModelUpdate=new UpdateValueStrategy();
	private final UpdateValueStrategy modelToTargetUpdate=new UpdateValueStrategy();

	public IObservableValue getTargetObservableValue() {return targetObservableValue;}
	public IObservableValue getModelObservableValue() {return modelObservableValue;}

	public UpdateValueStrategy getTargetToModelUpdate() {return targetToModelUpdate;}
	public UpdateValueStrategy getModelToTargetUpdate() {return modelToTargetUpdate;}

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


}