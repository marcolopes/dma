package pt.at.factemipf;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JApplet;
import javax.swing.SwingUtilities;

import pt.at.factemipf.gui.FactemipfServicesGuiFactory;
import pt.at.factemipf.gui.FactemipfServicesPanel;

/**
 * Classe na iniciar applet de testes de webservice.
 * 
 * @author ricardo
 * 
 */
public final class FactemipfServicesApplet extends JApplet {

	private static final long serialVersionUID = 3180126021885570986L;

	public void init() {
		try{
			SwingUtilities.invokeAndWait(
					new Runnable(){
						public void run() {

							swingGUI(getParameter("nif"), getParameter("password"));
						}
					});
		}catch(Exception e){
			Logger.getLogger(FactemipfServicesApp.class.getSimpleName()).log(Level.SEVERE, "Erro GRAVE", e);
		}
	}

	private void swingGUI(String nif, String password) {

		FactemipfServicesPanel panel = FactemipfServicesGuiFactory.createFactemipfServicesGuiPanel(FactemipfServicesApp.class.getSimpleName(),
				nif, password);

		add(panel);
	}
}
