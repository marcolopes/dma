/*******************************************************************************
 * 2008-2022 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.services.broker.proxy;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceException;

import com.softlimits.clarinet.ArrayOfMessageOutputData;
import com.softlimits.clarinet.IMessageService;
import com.softlimits.clarinet.MessageService;

import org.dma.java.net.HttpURLHandler;
import org.dma.java.security.JKSCertificate;
import org.dma.java.security.ServiceCertificates;
import org.dma.services.broker.SOAPMessageHandler;

/**
 * PROXY para ligacao ao endpoint do webservice
 *
 * https://www.espap.gov.pt/spfin/Paginas/spfin.aspx#maintab5
 */
public class EspapServiceHandler extends SOAPMessageHandler {

	public enum ENDPOINTS {

		PROD ("https://ws.netdocs.com.pt/TradeHttp/CTMessageService.svc/ssl"),
		TEST ("https://www-qa.netdocs.com.pt/TradeHttpQa/CTMessageService.svc/ssl");

		public final HttpURLHandler url;

		private ENDPOINTS(String urlname) {
			this.url = new HttpURLHandler(urlname);
		}

	}

	private final IMessageService service = new MessageService().getCustomBindingIMessageService();

	private IMessageService getService() throws WebServiceException {
		initialize((BindingProvider)service, endpoint.url);
		return service;
	}

	private final ENDPOINTS endpoint;

	public EspapServiceHandler(String username, String password, JKSCertificate swCertificate, ENDPOINTS endpoint) {
		super(username, password, new ServiceCertificates(null, swCertificate));
		this.endpoint = endpoint;
	}


	public ArrayOfMessageOutputData processMessage(byte[] message) throws WebServiceException {
		return getService().processMessage(message);
	}


}