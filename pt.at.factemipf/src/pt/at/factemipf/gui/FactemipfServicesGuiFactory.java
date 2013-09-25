package pt.at.factemipf.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import pt.at.factemipf.core.webservices.client.factemiws.RegisterInvoiceType;
import pt.at.factemipf.core.webservices.proxy.FaturasWSProxy;
import pt.at.factemipf.core.webservices.proxy.SOAPClientMessageHeaderHandler.CERTIFICATE;

public final class FactemipfServicesGuiFactory {

	private static final String A10_QUALIDADE_ENDPOINT = "https://servicos.portaldasfinancas.gov.pt:700/fews/faturas";

	private static final String[] ENDPOINTS = {A10_QUALIDADE_ENDPOINT};

	private static final String REGISTER_INVOICE_OPERATION = "RegisterInvoice";
	private static final String[] OPERATIONS = {REGISTER_INVOICE_OPERATION};

	private static final String DEFAULT_NIFUSER = "599999993/0037";
	private static final String DEFAULT_PASSWORD = "testes1234";

	private FactemipfServicesGuiFactory(){}

	/**
	 * Cria o GUI panel para invocacao do teste ao webservice.
	 * Inicia tambem o Listener para a accao de clique no botao 'test', que
	 * efetua a invocacao ao webservice.
	 *
	 * @param loggerName
	 * @return
	 */
	public static FactemipfServicesPanel createFactemipfServicesGuiPanel(String loggerName, String nif, String password) {
		final FactemipfServicesPanel panel = new FactemipfServicesPanel();
		if(nif == null || nif.length() == 0){
			panel.getUserTf().setText(DEFAULT_NIFUSER);
		}else{
			panel.getUserTf().setText(nif);
		}
		if(password == null || password.length() == 0){
			panel.getPasswordTf().setText(DEFAULT_PASSWORD);
		}else{
			panel.getPasswordTf().setText(password);
		}
		panel.getEndpointCb().setModel(new DefaultComboBoxModel(ENDPOINTS));
		panel.getOperationCb().setModel(new DefaultComboBoxModel(OPERATIONS));

		final Logger logger = Logger.getLogger(loggerName);
		panel.getLogTa().setLineWrap(true);
		panel.getLogTa().setWrapStyleWord(true);
		// log handler para escrita na textarea da UI
		logger.addHandler(new JTextAreaLoggerHandler(panel.getLogTa()));

		addActionListeners(panel, logger);

		panel.setVisible(true);

		return panel;
	}

	private static void addActionListeners(final FactemipfServicesPanel panel, final Logger logger) {

		panel.getTestBt().addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				try{
					String endpoint = String.valueOf(panel.getEndpointCb().getSelectedItem());
					String operation = String.valueOf(panel.getOperationCb().getSelectedItem());
					String user = panel.getUserTf().getText();
					String pass = panel.getPasswordTf().getText();

					if(endpoint == null || endpoint.equals("")){
						JOptionPane.showMessageDialog(panel, "Invalid Endpoint", "Error", JOptionPane.ERROR_MESSAGE);
						return;
					}
					if(operation == null || operation.equals("")){
						JOptionPane.showMessageDialog(panel, "Invalid Operation", "Error", JOptionPane.ERROR_MESSAGE);
						return;
					}
					if(user == null || user.equals("")){
						JOptionPane.showMessageDialog(panel, "Invalid User", "Error", JOptionPane.ERROR_MESSAGE);
						return;
					}
					if(pass == null || pass.equals("")){
						JOptionPane.showMessageDialog(panel, "Invalid Password", "Error", JOptionPane.ERROR_MESSAGE);
						return;
					}

					// constroi um request para invoacao
					RegisterInvoiceType registerInvoiceRequest = RequestBuilder.buildRegisterInvoiceRequest();
					// cria um proxy endpoint onde vai invocar o webservice
					FaturasWSProxy faturasWSProxy = new FaturasWSProxy(logger, endpoint, user, pass, CERTIFICATE.PROD);

					if(REGISTER_INVOICE_OPERATION.equals(operation)){
						// efetua a accao de invocacao
						faturasWSProxy.registerInvoice(registerInvoiceRequest);
					}else{
						// Servico desconhecido
						JOptionPane.showMessageDialog(panel, "Invalid Service", "Error", JOptionPane.ERROR_MESSAGE);
						return;
					}

				}catch(Exception ex){
					StringWriter sw = new StringWriter();
					ex.printStackTrace(new PrintWriter(sw));
					String stacktrace = sw.toString();
					logger.severe(">>>STACKTRACE<<<\n" + stacktrace);
					JOptionPane.showMessageDialog(panel, "Erro", "Erro", JOptionPane.ERROR_MESSAGE);
					return;
				}
				JOptionPane.showMessageDialog(panel, "Sucesso", "Info", JOptionPane.INFORMATION_MESSAGE);
			}
		});
	}

}
