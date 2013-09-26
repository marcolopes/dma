package pt.at.webservices;

import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JApplet;
import javax.swing.SwingUtilities;

import pt.at.webservices.gui.ServicesGuiFactory;
import pt.at.webservices.gui.ServicesPanel;


/**
 * Classe na iniciar applet de testes de webservice.
 *
 * @author ricardo
 *
 */
public final class ServicesApplet extends JApplet {

	private static final long serialVersionUID = 3180126021885570986L;

	@Override
	public void init() {
		try {
			CookieManager cm = new CookieManager(null, CookiePolicy.ACCEPT_NONE);
			CookieHandler.setDefault(cm);

			SwingUtilities.invokeAndWait(new Runnable() {
				@Override
				public void run() {
					swingGUI(getParameter("nif"), getParameter("password"));
				}
			});
		} catch (Exception e) {
			Logger.getLogger(ServicesApp.class.getSimpleName()).log(Level.SEVERE, "Erro GRAVE", e);
		}
	}

	private void swingGUI(String nif, String password) {

		ServicesPanel panel = ServicesGuiFactory.createFactemipfServicesGuiPanel(
				ServicesApp.class.getSimpleName(), nif, password);

		add(panel);
	}
}
