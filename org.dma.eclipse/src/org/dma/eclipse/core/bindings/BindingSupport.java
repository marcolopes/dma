/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.core.bindings;

import java.util.LinkedHashMap;

import org.dma.java.util.Debug;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.Realm;

public class BindingSupport extends LinkedHashMap<String, BindingDefinition> {

	private static final long serialVersionUID = 1L;

	private final DataBindingContext bindingContext;

	public BindingSupport() {
		this(Realm.getDefault());
	}

	public BindingSupport(Realm realm) {
		bindingContext=new DataBindingContext(realm);
	}


	public void register(String property, BindingDefinition definition) {

		if (containsKey(property)) throw new Error("BINDING ALREADY REGISTERED: "+property);

		put(property, definition);

		bindingContext.bindValue(
			definition.getTargetObservableValue(),
			definition.getModelObservableValue(),
			definition.getTargetToModelUpdate(),
			definition.getModelToTargetUpdate());

	}


	public void unregister(String property) {

		BindingDefinition binding=remove(property);
		if (binding!=null) binding.dispose();

	}


	public void unregisterAll() {

		Debug.out(keySet());

		while(!isEmpty()){
			String property=keySet().iterator().next();
			unregister(property);
		}

		bindingContext.dispose();

	}




	/*
	 * Getters and setters
	 */
	public DataBindingContext getBindingContext() {
		return bindingContext;
	}


}
