/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.services.feap.test;

import java.io.ByteArrayOutputStream;

import oasisNamesSpecificationUblSchemaXsdCommonBasicComponents2.CustomizationIDType;
import oasisNamesSpecificationUblSchemaXsdCommonBasicComponents2.IDType;
import oasisNamesSpecificationUblSchemaXsdCommonBasicComponents2.ProfileIDType;
import oasisNamesSpecificationUblSchemaXsdCommonBasicComponents2.UBLVersionIDType;
import oasisNamesSpecificationUblSchemaXsdInvoice2.InvoiceDocument;
import oasisNamesSpecificationUblSchemaXsdInvoice2.InvoiceType;

import org.apache.commons.codec.binary.Base64;

import com.generixgroup.pt.messaging.webservice.Credentials;
import com.generixgroup.pt.messaging.webservice.RoutingInfo;
import com.generixgroup.pt.messaging.webservice.UploadDocResponse;

import org.dma.java.security.JKSCertificate;
import org.dma.java.security.JKSCertificate.CERTIFICATE_TYPE;
import org.dma.services.feap.proxy.GenerixServiceHandler;
import org.dma.services.feap.proxy.GenerixServiceHandler.ENDPOINTS;

public class GenerixServiceTest {

	public static byte[] buildMessage() throws Exception {

		/*
		 * Id: n.a.
		 * Nome: Invoice
		 * Cardinalidade: 1..1
		 * Tipo: Tag
		 * Formato: n.a.
		 * Predefinição: n.a.
		 * Ordenação: 00
		 * Descrição: Tag inicial Invoice.
		 * Regras: Componentes Básicos Comuns (cbc), Componentes Agregadores Comuns (cac),
		 * Componentes Básicos eSPap (ebc) e Componentes Agregadores eSPap (eac).
		 * Exemplo: n.a.
		 */
		InvoiceDocument document=InvoiceDocument.Factory.newInstance();
		InvoiceType invoice=document.addNewInvoice();
		/*
		 * Id: 001
		 * Nome: UBLVersionID
		 * Cardinalidade: 1..1
		 * Tipo: Alfanumérico (50)
		 * Formato: n.a.
		 * Predefinição: 2.1
		 * Ordenação: 02
		 * Descrição: Versão do UBL utilizado. O template eSPap será sobre a versão 2.1.
		 * Regras: n.a.
		 * Exemplo: n.a.
		 */
		UBLVersionIDType UBLVersionID=invoice.addNewUBLVersionID();
		UBLVersionID.setStringValue("2.1");
		/*
		 * Id: 002
		 * Nome: CustomizationID
		 * Cardinalidade: 1..1
		 * Tipo: Alfanumérico (50)
		 * Formato: n.a.
		 * Predefinição: UBL-2.1-eSPap
		 * Ordenação: 03
		 * Descrição: Nome da customização UBL referente ao template da eSPap. Permite ao
		 * recetor aplicar a validação do documento de acordo com as regras da sua customização.
		 * Regras: n.a.
		 * Exemplo: n.a.
		 */
		CustomizationIDType customizationID=invoice.addNewCustomizationID();
		customizationID.setStringValue("UBL-2.1-eSPap");
		/*
		 * Id: 003
		 * Nome: ProfileID
		 * Cardinalidade: 1..1
		 * Tipo: Alfanumérico (100)
		 * Formato: n.a.
		 * Predefinição: urn:www:espap:pt:profiles:profile1:ver1.0
		 * Ordenação: 04
		 * Descrição: Perfil onde se enquadra a customização associada ao Template UBL 2.1 da
		 * eSPap.
		 * Regras: n.a.
		 * Exemplo: n.a.
		 */
		ProfileIDType profileID=invoice.addNewProfileID();
		profileID.setStringValue("urn:www:espap:pt:profiles:profile1:ver1.0");
		/*
		 * Id: 004
		 * Nome: ID
		 * Cardinalidade: 1..1
		 * Tipo: Alfanumérico (40)
		 * Formato: n.a.
		 * Predefinição: n.a.
		 * Ordenação: 06
		 * Descrição: Número de referência do documento, emitida pelo fornecedor.
		 * Regras: n.a.
		 * Exemplo: n.a.
		 */
		IDType id=invoice.addNewID();
		id.setStringValue("CFA 2018/1");

		ByteArrayOutputStream out=new ByteArrayOutputStream();
		document.save(out);

		return out.toByteArray();

	}


	public static void main(String[] argvs) {

		try{//ambiente de testes
			GenerixServiceHandler handler=new GenerixServiceHandler(
				//Service Username / Password
				"Username", "Password",
				//Scheme Administrator Certificate
				new JKSCertificate(CERTIFICATE_TYPE.JKS, "certificates/saphetydoc.jks", "123456"),
				//Software Developer Certificate
				new JKSCertificate(CERTIFICATE_TYPE.PKCS12, "certificates/TesteWebservices.pfx", "TESTEwebservice"),
				//Endpoint address
				ENDPOINTS.TESTES);

			//Credentials
			Credentials credentials=new Credentials();
			credentials.setUsername("USER");
			credentials.setPassword("PASS");
			//Routing Info
			RoutingInfo info=new RoutingInfo();
			info.setDocumentType("type");
			info.setReceiver("receiver");
			info.setSender("sender");
			//Document
			String document=new Base64().encodeToString(buildMessage());

			UploadDocResponse response=handler.uploadDocument("teste.txt", credentials, info, document);
			System.out.println(response.getStatusCode());

		}catch(Exception e){
			e.printStackTrace();
		}

	}

}