package pt.at.webservices.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import pt.at.webservices.core.SOAPClientMessageHeaderHandler.CERTIFICATE;
import pt.at.webservices.core.factemipf.client.RegisterInvoiceType;
import pt.at.webservices.core.factemipf.proxy.FaturasWSProxy;
import pt.at.webservices.core.sgdt.client.StockMovement;
import pt.at.webservices.core.sgdt.proxy.DocumentoTransporteWSProxy;

public final class ServicesGuiFactory {

	private static final String A10_QUALIDADE_ENDPOINT = "https://servicos.portaldasfinancas.gov.pt:700/fews/faturas";
	private static final String A10_QUALIDADE_SGDT_ENDPOINT = "https://servicos.portaldasfinancas.gov.pt:701/sgdtws/documentosTransporte";

	private static final String[] ENDPOINTS = { A10_QUALIDADE_ENDPOINT, A10_QUALIDADE_SGDT_ENDPOINT };

	private static final String REGISTER_INVOICE_OPERATION = "RegisterInvoice";
	private static final String ENVIO_DOCUMENTO_OPERATION = "envioDocumentoTransporte";
	private static final String[] OPERATIONS_FACTURAS = { REGISTER_INVOICE_OPERATION };
	private static final String[] OPERATIONS_SGDT = { ENVIO_DOCUMENTO_OPERATION };

	private static final String DEFAULT_NIFUSER = "599999993/0037";
	private static final String DEFAULT_PASSWORD = "testes1234";

	private ServicesGuiFactory() {
	}

	/**
	 * Cria o GUI panel para invocação do teste ao webservice. Inicia também o Listener para a acção de clique no botão
	 * 'test', que efetua a invocação ao webservice.
	 *
	 * @param loggerName
	 * @return
	 */
	public static ServicesPanel createFactemipfServicesGuiPanel(String loggerName, String nif, String password) {
		final ServicesPanel panel = new ServicesPanel();
		if ((nif == null) || (nif.length() == 0)) {
			panel.getUserTf().setText(DEFAULT_NIFUSER);
		} else {
			panel.getUserTf().setText(nif);
		}
		if ((password == null) || (password.length() == 0)) {
			panel.getPasswordTf().setText(DEFAULT_PASSWORD);
		} else {
			panel.getPasswordTf().setText(password);
		}
		panel.getEndpointCb().setModel(new DefaultComboBoxModel(ENDPOINTS));
		panel.getOperationCb().setModel(new DefaultComboBoxModel(OPERATIONS_FACTURAS));

		final Logger logger = Logger.getLogger(loggerName);
		panel.getLogTa().setLineWrap(true);
		panel.getLogTa().setWrapStyleWord(true);
		// log handler para escrita na textarea da UI
		logger.addHandler(new JTextAreaLoggerHandler(panel.getLogTa()));

		addActionListeners(panel, logger);

		panel.setVisible(true);

		return panel;
	}

	private static void addActionListeners(final ServicesPanel panel, final Logger logger) {

		panel.getEndpointCb().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String endpoint = String.valueOf(panel.getEndpointCb().getSelectedItem());

				if ((endpoint == null) || endpoint.equals("")) {
					JOptionPane.showMessageDialog(panel, "Invalid Endpoint", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				}

				if (A10_QUALIDADE_ENDPOINT.equals(endpoint)) {
					panel.getOperationCb().setModel(new DefaultComboBoxModel(OPERATIONS_FACTURAS));
				} else if (A10_QUALIDADE_SGDT_ENDPOINT.equals(endpoint)) {
					panel.getOperationCb().setModel(new DefaultComboBoxModel(OPERATIONS_SGDT));
				} else {
					// Serviço desconhecido
					JOptionPane.showMessageDialog(panel, "Invalid Service", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
			}
		});

		panel.getTestBt().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String endpoint = String.valueOf(panel.getEndpointCb().getSelectedItem());
					String operation = String.valueOf(panel.getOperationCb().getSelectedItem());
					String user = panel.getUserTf().getText();
					String pass = panel.getPasswordTf().getText();

					if ((endpoint == null) || endpoint.equals("")) {
						JOptionPane.showMessageDialog(panel, "Invalid Endpoint", "Error", JOptionPane.ERROR_MESSAGE);
						return;
					}
					if ((operation == null) || operation.equals("")) {
						JOptionPane.showMessageDialog(panel, "Invalid Operation", "Error", JOptionPane.ERROR_MESSAGE);
						return;
					}
					if ((user == null) || user.equals("")) {
						JOptionPane.showMessageDialog(panel, "Invalid User", "Error", JOptionPane.ERROR_MESSAGE);
						return;
					}
					if ((pass == null) || pass.equals("")) {
						JOptionPane.showMessageDialog(panel, "Invalid Password", "Error", JOptionPane.ERROR_MESSAGE);
						return;
					}

					if (A10_QUALIDADE_ENDPOINT.equals(endpoint)) {
						// constroi um request para invoacao
						RegisterInvoiceType registerInvoiceRequest = RequestBuilder.buildRegisterInvoiceRequest();
						// cria um proxy endpoint onde vai invocar o webservice
						FaturasWSProxy faturasWSProxy = new FaturasWSProxy(logger, endpoint, user, pass,
								CERTIFICATE.PROD);

						if (REGISTER_INVOICE_OPERATION.equals(operation)) {
							// efetua a accao de invocacao
							faturasWSProxy.registerInvoice(registerInvoiceRequest);
						} else {
							// Serviço desconhecido
							JOptionPane.showMessageDialog(panel, "Invalid Service", "Error", JOptionPane.ERROR_MESSAGE);
							return;
						}
					} else if (A10_QUALIDADE_SGDT_ENDPOINT.equals(endpoint)) {
						// constroi um request para invoacao
						StockMovement envioDocumentoTransporteRequest = RequestBuilder
								.buildEnvioDocumentoTransporteRequest(user);
						// cria um proxy endpoint onde vai invocar o webservice
						DocumentoTransporteWSProxy documentoTransporteWSProxy = new DocumentoTransporteWSProxy(
								logger, endpoint, user, pass, CERTIFICATE.PROD, null, null);

						if (ENVIO_DOCUMENTO_OPERATION.equals(operation)) {
							// efetua a accao de invocacao
							documentoTransporteWSProxy.envioDocumentoTransporte(envioDocumentoTransporteRequest);
						} else {
							// Serviço desconhecido
							JOptionPane.showMessageDialog(panel, "Invalid Service", "Error", JOptionPane.ERROR_MESSAGE);
							return;
						}
					} else {
						// Serviço desconhecido
						JOptionPane.showMessageDialog(panel, "Invalid Service", "Error", JOptionPane.ERROR_MESSAGE);
						return;
					}
				} catch (Exception ex) {
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
