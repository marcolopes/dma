/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package dma.utils.eclipse.core.bindings;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.databinding.DataBindingContext;

import dma.utils.java.Debug;

public class BindingSupport {

	private final Map<String, BindingDefinition> bindingMap=new HashMap();

	private final DataBindingContext bindingContext=new DataBindingContext();

	public BindingSupport() {
	}


	public void register(String property, BindingDefinition definition) {

		if (!bindingMap.containsKey(property)) {

			bindingMap.put(property, definition);

			bindingContext.bindValue(
				definition.getTargetObservableValue(), definition.getModelObservableValue(),
				definition.getTargetToModel(), definition.getModelToTarget());

			Debug.info(property, bindingMap.keySet());

		}else{
			Debug.warning("BINDING ALREADY REGISTERED", property);
		}

	}


	public void unregister(String property) {

		if (bindingMap.containsKey(property)) {

			Debug.info(property, bindingMap.keySet());

			bindingMap.get(property).dispose();
			bindingMap.remove(property);

		}

	}


	public void unregisterAll() {

		Debug.info("UNREGISTERING", bindingMap.size());

		while (bindingMap.size()>0) {
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
