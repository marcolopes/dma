/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.core.bindings;

import java.util.HashMap;
import java.util.Map;

import org.dma.utils.java.Debug;
import org.eclipse.core.databinding.DataBindingContext;

public class BindingSupport {

	private final DataBindingContext bindingContext=new DataBindingContext();

	private final Map<String, BindingDefinition> bindingMap=new HashMap();

	public BindingSupport() {
	}


	public void register(String property, BindingDefinition definition) {

		bindingMap.put(property, definition);

		definition.createBinding(bindingContext);

		Debug.info(property, bindingMap.keySet());

	}


	public void unregister(String property) {

		if (bindingMap.containsKey(property)){

			Debug.info(property, bindingMap.keySet());

			bindingMap.get(property).dispose();
			bindingMap.remove(property);

		}

	}


	public void unregisterAll() {

		Debug.info("UNREGISTERING", bindingMap.size());

		while(bindingMap.size()>0){
			String property=bindingMap.keySet().iterator().next();
			unregister(property);
		}

		bindingContext.dispose();

	}




	//getters and setters
	public DataBindingContext getBindingContext() {
		return bindingContext;
	}


}
