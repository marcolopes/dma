/*******************************************************************************
 * Copyright 2008-2022 Marco Lopes (marcolopespt@gmail.com)
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
 * Sergio Gomes (s.miguelgomes@gmail.com)
 *******************************************************************************/
package org.dma.jetty;

import java.awt.Desktop;
import java.net.URI;

import org.dma.eclipse.swt.graphics.FontManager;
import org.dma.eclipse.swt.widgets.CustomShell;

import org.eclipse.jetty.io.EndPoint;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseTrackAdapter;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;

public class JettyShell extends CustomShell {

	private Label label_ip;
	private Label label_port;
	private Label label_status;
	private Label label_link;
	private List list_connections;
	private Button button_server;

	private final JettyServer server;

	public JettyShell(Shell parent, JettyServer server) {
		super(parent, STYLE_RESIZABLE);

		this.server=server;

		setText("Jetty Server");
		setImage(Activator.getBufferedImage("icons/server.png"));

		createComposite(this);

		setCenteredLocation();
	}

	@Override
	public void open() {
		updateStatus();
		super.open();
	}


	public void createComposite(final Composite parent) {

		parent.setLayout(new GridLayout(2, false));

		Label label = new Label(parent, SWT.NONE);
		label.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
		label.setImage(Activator.getImage("icons/powered-by-jetty.gif"));

		/*
		 * Button
		 */
		Group group = new Group(parent, SWT.NONE);
		group.setLayout(new GridLayout(2, true));
		group.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		group.setFont(FontManager.SYSTEM_FONT_BOLD);
		group.setText("Server Actions");

		button_server = new Button(group, SWT.NONE);
		button_server.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		button_server.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				server.startStop();
				updateStatus();
			}
		});

		Button button = new Button(group, SWT.NONE);
		button.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		button.setImage(Activator.getImage("icons/refresh.png"));
		button.setText("Refresh Connections");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				updateConnections();
			}
		});

		/*
		 * Server
		 */
		group = new Group(parent, SWT.NONE);
		group.setLayout(new GridLayout(2, false));
		group.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
		group.setFont(FontManager.SYSTEM_FONT_BOLD);
		group.setText("Server Configuration");

		label = new Label(group, SWT.NONE);
		label.setLayoutData(new GridData(SWT.RIGHT, SWT.FILL, false, false, 1, 1));
		label.setText("IP");

		label_ip = new Label(group, SWT.NONE);
		label_ip.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));

		label = new Label(group, SWT.NONE);
		label.setLayoutData(new GridData(SWT.RIGHT, SWT.FILL, false, false, 1, 1));
		label.setText("Port");

		label_port = new Label(group, SWT.NONE);
		label_port.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));

		label = new Label(group, SWT.NONE);
		label.setLayoutData(new GridData(SWT.RIGHT, SWT.FILL, false, false, 1, 1));
		label.setText("Status");

		label_status = new Label(group, SWT.NONE);
		label_status.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		new Label(group, SWT.NONE);

		label_link = new Label(group, SWT.NONE);
		label_link.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		label_link.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent event) {
				if (server.isRunning()){
					try{URI uri=new URI(server.getParameters().getURL());
						Desktop.getDesktop().browse(uri);
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}
		});
		label_link.addMouseTrackListener(new MouseTrackAdapter() {
			@Override
			public void mouseEnter(MouseEvent e) {
				if (server.isRunning()){
					Cursor cursor = new Cursor(getDisplay(), SWT.CURSOR_HAND);
					label_link.setCursor(cursor);
				}
			}
		});

		/*
		 * Connections
		 */
		group = new Group(parent, SWT.NONE);
		group.setLayout(new GridLayout(2, false));
		group.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		group.setFont(FontManager.SYSTEM_FONT_BOLD);
		group.setText("Active Connections");

		list_connections = new List(group, SWT.BORDER | SWT.V_SCROLL);
		list_connections.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));

	}

	private void updateStatus() {

		if (server.isRunning()){
			label_ip.setText(server.getParameters().host);
			label_port.setText(String.valueOf(server.getParameters().port));
			label_status.setText("Running");
			label_link.setText("@"+server.getParameters().getURL());
			button_server.setImage(Activator.getImage("icons/stop16.png"));
			button_server.setText("Stop Server");
		}else{
			label_ip.setText("...");
			label_port.setText("...");
			label_status.setText("Stopped");
			label_link.setText("...");
			button_server.setImage(Activator.getImage("icons/play16.png"));
			button_server.setText("Start Server");
		}updateConnections();

	}

	private void updateConnections() {

		list_connections.removeAll();
		for(EndPoint endPoint: server.getConnectedEndPoints()){
			list_connections.add("IP: "+endPoint.getRemoteAddress().getHostString());
		}list_connections.update();

	}


}
