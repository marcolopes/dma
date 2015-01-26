/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.core.bindings;

import java.util.HashMap;

import org.dma.java.util.Debug;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.Realm;

public class BindingSupport extends HashMap<String, BindingDefinition> {

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

		Debug.out(property, keySet());

	}


	public void unregister(String property) {

		BindingDefinition binding=remove(property);
		if (binding!=null){
			Debug.out(property, keySet());
			binding.dispose();
		}

	}


	public void unregisterAll() {

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
