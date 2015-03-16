package org.dma.services.at;

import java.security.cert.X509Certificate;

import javax.net.ssl.X509TrustManager;

public class PermissiveTrustStore implements X509TrustManager {

	@Override
	public void checkClientTrusted(X509Certificate[] chain, String authType) {
		//do nothing, you're the client
	}

	@Override
	public X509Certificate[] getAcceptedIssuers() {
		//also only relevant for servers
		return null;
	}

	@Override
	public void checkServerTrusted(X509Certificate[] chain, String authType) {
		//do nothing, accept all
	}

}
