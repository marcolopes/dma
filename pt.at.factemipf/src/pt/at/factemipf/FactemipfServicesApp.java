package pt.at.factemipf;

import javax.swing.JFrame;

import pt.at.factemipf.gui.FactemipfServicesGuiFactory;
import pt.at.factemipf.gui.FactemipfServicesPanel;

/**
 * Class na iniciar aplicacao offline de testes de webservice.
 * 
 * @author ricardo
 * 
 */
public final class FactemipfServicesApp {

	private FactemipfServicesApp(){}

	public static void main(String[] args) {
		startApp();
	}

	public static void startApp() {
		System.setProperty("javax.net.debug", "ssl,handshake");

		final JFrame frame = new JFrame("factemipf services");

		FactemipfServicesPanel panel = FactemipfServicesGuiFactory.createFactemipfServicesGuiPanel(FactemipfServicesApp.class.getSimpleName(), null, null);

		frame.getContentPane().add(panel);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

	}

}
