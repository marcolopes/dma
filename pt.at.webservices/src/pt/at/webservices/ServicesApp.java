package pt.at.webservices;

import javax.swing.JFrame;

import pt.at.webservices.gui.ServicesGuiFactory;
import pt.at.webservices.gui.ServicesPanel;


/**
 * Class na iniciar aplicacao offline de testes de webservice.
 * 
 * @author ricardo
 *
 */
public final class ServicesApp {
	
	private ServicesApp(){}

	public static void main(String[] args) {
		startApp();
	}

	public static void startApp() {
		
		System.setProperty("javax.net.debug", "ssl,handshake");
		
		final JFrame frame = new JFrame("factemipf services");
	    
		ServicesPanel panel = ServicesGuiFactory.createFactemipfServicesGuiPanel(ServicesApp.class.getSimpleName(), null, null);
		
	    frame.getContentPane().add(panel);

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.pack();
	    frame.setVisible(true);

	}
	
}
