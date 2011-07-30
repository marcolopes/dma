/*******************************************************************************
 * 2008-2011 Projecto Colibri
 * Marco Lopes (marcolopes@projectocolibri.com)
 *******************************************************************************/
package org.dma.utils.eclipse.core.bindings;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.viewers.IViewerObservableValue;

public class BindingDefinition {

	private IObservableValue observeObject;
	private IViewerObservableValue observeWidget;

	private UpdateValueStrategy objectToWidget;
	private UpdateValueStrategy widgetToObject;

	private Binding bind;


	public IObservableValue getObserveObject() {
		return observeObject;
	}


	public void dispose() {

		observeObject.dispose();
		observeWidget.dispose();

		bind.dispose();

	}


	//getters and setters
	public void setObserveObject(IObservableValue observeObject) {
		this.observeObject=observeObject;
	}

	public IViewerObservableValue getObserveWidget() {
		return observeWidget;
	}

	public void setObserveWidget(IViewerObservableValue observeWidget) {
		this.observeWidget=observeWidget;
	}

	public UpdateValueStrategy getObjectToWidget() {
		return objectToWidget;
	}

	public void setObjectToWidget(UpdateValueStrategy objectToWidget) {
		this.objectToWidget=objectToWidget;
	}

	public UpdateValueStrategy getWidgetToObject() {
		return widgetToObject;
	}

	public void setWidgetToObject(UpdateValueStrategy widgetToObject) {
		this.widgetToObject=widgetToObject;
	}

	public Binding getBind() {
		return bind;
	}

	public void setBind(Binding bind) {
		this.bind=bind;
	}


}
