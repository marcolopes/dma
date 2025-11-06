/*******************************************************************************
 * Copyright 2008-2025 Marco Lopes (marcolopespt@gmail.com)
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
 *******************************************************************************/
package org.dma.xml.beans;

import java.io.File;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

import oasisNamesSpecificationUblSchemaXsdCommonAggregateComponents2.InvoiceLineType;
import oasisNamesSpecificationUblSchemaXsdCommonAggregateComponents2.ItemIdentificationType;
import oasisNamesSpecificationUblSchemaXsdCommonAggregateComponents2.ItemType;
import oasisNamesSpecificationUblSchemaXsdCommonAggregateComponents2.PriceType;
import oasisNamesSpecificationUblSchemaXsdCommonAggregateComponents2.TaxCategoryType;
import oasisNamesSpecificationUblSchemaXsdCommonBasicComponents2.CustomizationIDType;
import oasisNamesSpecificationUblSchemaXsdCommonBasicComponents2.DocumentCurrencyCodeType;
import oasisNamesSpecificationUblSchemaXsdCommonBasicComponents2.DueDateType;
import oasisNamesSpecificationUblSchemaXsdCommonBasicComponents2.IDType;
import oasisNamesSpecificationUblSchemaXsdCommonBasicComponents2.InvoiceTypeCodeType;
import oasisNamesSpecificationUblSchemaXsdCommonBasicComponents2.InvoicedQuantityType;
import oasisNamesSpecificationUblSchemaXsdCommonBasicComponents2.IssueDateType;
import oasisNamesSpecificationUblSchemaXsdCommonBasicComponents2.LineExtensionAmountType;
import oasisNamesSpecificationUblSchemaXsdCommonBasicComponents2.NameType;
import oasisNamesSpecificationUblSchemaXsdCommonBasicComponents2.PercentType;
import oasisNamesSpecificationUblSchemaXsdCommonBasicComponents2.PriceAmountType;
import oasisNamesSpecificationUblSchemaXsdInvoice2.InvoiceDocument;
import oasisNamesSpecificationUblSchemaXsdInvoice2.InvoiceType;

import org.apache.xmlbeans.XmlOptions;

import org.dma.java.io.CustomFile;
import org.dma.java.io.FileParameters;
import org.dma.java.io.Folder;
import org.dma.java.util.TimeDateUtils;
import org.dma.xml.IXMLExport;

public class InvoiceExport implements IXMLExport {

	public static final String VERSAO = "2.1";

	public static final String NIF = "999999990";

	/*
	 * ESTRUTURA (Invoice):
	 *
	 * - CustomizationID;
	 * - ID;
	 * - IssueDate;
	 * - DueDate;
	 * - InvoiceTypeCode;
	 * - Note (Assunto);
	 * - Note (Mensagem);
	 * - DocumentCurrencyCode;
	 * - InvoicePeriod;
	 * - AdditionalDocumentReference;
	 * - AccountingSupplierParty;
	 * - AccountingCustomerParty;
	 * - Delivery;
	 * - TaxTotal;
	 * - LegalMonetaryTotal;
	 * - InvoiceLine;
	 *
	 * CARDINALIDADE:
	 *
	 * Para efeitos da Norma, serve para indicar se um campo ou grupo de campos é obrigatório,
	 * opcional ou condicionado e se permite repetição, assumindo o seguinte formato (X..Y):
	 * - X: Obrigatório (1) ou Facultativo (0);
	 * - Y: Valor único (1) ou Repetição (0);
	 *
	 * TIPO (Descrição do campo segundo o seu género):
	 *
	 * - A Amount
	 * - B Binary object
	 * - C Code
	 * - D Data
	 * - I Identifier
	 * - O Document reference identifier
	 * - P Percentage
	 * - Q Quantity
	 * - T Text
	 * - U Unit price amount
	 */
	private final InvoiceDocument invoiceDocument = InvoiceDocument.Factory.newInstance();

	/*
	 * <cac:Invoice>
	 * Name: Invoice;
	 * ID: -;
	 * Tipo de Dados: CAC;
	 * Cardinalidade: 1..1;
	 * Designação: -
	 */
	private final InvoiceType invoice = invoiceDocument.addNewInvoice();

	public InvoiceExport() {}

	public FileParameters getFileParameters(Folder folder) {
		String prefix = NIF + "_CIUS-PT_" + TimeDateUtils.getDateFormatted("yyyy-MM-dd");
		return new FileParameters(prefix, "xml", folder);
	}

	@Override
	public boolean save(File file) {

		if (!file.isDirectory()) try{

			XmlOptions options = new XmlOptions();
			options.setSavePrettyPrint();
			options.setUseDefaultNamespace();
			options.setSaveAggressiveNamespaces();

			Map<String, String> prefixes = new LinkedHashMap();
			prefixes.put("urn:oasis:names:specification:ubl:schema:xsd:Invoice-2", "");
			prefixes.put("http://www.w3.org/2001/XMLSchema-instance", "xsi");
			prefixes.put("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "cbc");
			prefixes.put("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "cac");
			options.setSaveSuggestedPrefixes(prefixes);
			options.setCharacterEncoding(CustomFile.UTF8_CHARSET.name());

			invoiceDocument.save(file, options);

			return true;

		}catch(Exception e){
			e.printStackTrace();
		}else return save(getFileParameters(new Folder(file)).toFile());

		return false;

	}

	@Override
	public boolean isEmpty() {
		return invoice.getInvoiceLineList().isEmpty();
	}

	@Override
	public boolean isValid() {
		return invoice.validate();
	}


	public void process() {

		createCustomizationID();
		createInvoiceLines();

	}


	private void createCustomizationID() {

		createCustomizationID(
				invoice.addNewCustomizationID(),
				invoice.addNewID(),
				invoice.addNewIssueDate(),
				invoice.addNewDocumentCurrencyCode());

		/*
		 * <cbc:InvoiceTypeCode>
		 * Name: InvoiceTypeCode;
		 * Id: BT-3;
		 * Tipo de Dados: C - Code;
		 * Formato: Lista de códigos UNCL1001;
		 * Tamanho: -;
		 * Cardinalidade: 1..1;
		 * Designação: Código que identifica o tipo funcional do documento;
		 */
		InvoiceTypeCodeType invoiceTypeCodeType = invoice.addNewInvoiceTypeCode();
		invoiceTypeCodeType.setListID("UNCL1001");
		invoiceTypeCodeType.setStringValue("380");

		/*
		 * <cbc:DueDate>
		 * Id: BT-9;
		 * Name: Due Date;
		 * Tipo de Dados: D - Data;
		 * Formato: AAAA-MM-DD;
		 * Tamanho: -;
		 * Cardinalidade: 0..1;
		 * Designação: Data de vencimento do documento;
		 */
		DueDateType dueDateType = invoice.addNewDueDate();
		dueDateType.setCalendarValue(TimeDateUtils.getCalendarWithoutTimezone());

	}


	/*
	 * <cbc:CustomizationID>
	 * Name: CustomizationID;
	 * ID: BT-24;
	 * Tipo de Dados: I - Identifier;
	 * Cardinalidade: 1..1;
	 * Valor admitido: urn:cen.eu:en16931:2017#compliant#urn:feap.gov.pt:CIUS-PT: + VERSAO;
	 * Designação: Nome da customização CIUS-PT. Permite ao recetor aplicar a validação do documento de acordo com as regras da sua customização;
	 * Regras:
	 * - valor com o seguinte formato (regex): /^(.{1,50})$/
	 * Exemplo: valor alfanumérico com tamanho entre 1 e 50.
	 */
	private void createCustomizationID(CustomizationIDType customizationIDType, IDType IDType, IssueDateType issueDateType, DocumentCurrencyCodeType documentCurrencyCodeType) {

		customizationIDType.setStringValue("urn:cen.eu:en16931:2017#compliant#urn:feap.gov.pt:CIUS-PT:"+ VERSAO);

		/*
		 * <cbc:ID>
		 * Name: ID;
		 * ID: BT-1;
		 * Tipo de Dados: I - Identifier;
		 * Formato: Alfanumérico;
		 * Tamanho: 50;
		 * Cardinalidade: 1..1;
		 * Designação: Número de referência do documento, emitido pelo fornecedor;
		 */
		IDType.setStringValue(DESCONHECIDO);

		/*
		 * <cbc:IssueDate>
		 * Name: IssueDate;
		 * ID: BT-2;
		 * Tipo de Dados: D - Data;
		 * Formato: AAAA-MM-DD;
		 * Tamanho: -;
		 * Cardinalidade: 1..1;
		 * Designação: Data de emissão do documento;
		 */
		issueDateType.setCalendarValue(TimeDateUtils.getCalendarWithoutTimezone());

		/*
		 * <cbc:DocumentCurrencyCode>
		 * Name: DocumentCurrencyCode;
		 * Id: BT-5;
		 * Tipo de Dados: C - Code;
		 * Formato: Lista de Códigos ISO4217;
		 * Tamanho: -;
		 * Cardinalidade: 1..1;
		 * Descrição: Moeda na qual os montantes constantes no documento estão indicados.
		 */
		documentCurrencyCodeType.setListID("ISO4217");
		documentCurrencyCodeType.setStringValue("PT");

	}


	/*
	 * <cac:InvoiceLine>
	 * Name: InvoiceLine;
	 * ID: BG-25;
	 * Tipo de Dados: CAC;
	 * Cardinalidade: 1..N;
	 * Designação: Linha do Documento de Faturação;
	 */
	private void createInvoiceLines() {

		InvoiceLineType invoiceLineType = invoice.addNewInvoiceLine();

		/*
		 * <cbc:ID>
		 * Name: ID;
		 * Id: BT-126;
		 * Tipo de Dados: I - Identifier;
		 * Formato: Alfanumérico;
		 * Tamanho: 50;
		 * Cardinalidade: 1..1;
		 * Designação: Identificador único da linha do documento, atribuído pelo fornecedor.
		 * Regras:
		 * - valor com o seguinte formato (regex): /^(.{1,50})$/
		 * Exemplo: valor alfanumérico com tamanho entre 1 e 50.
		 */
		IDType IDType = invoiceLineType.addNewID();
		IDType.setStringValue("1");

		/*
		 * <cbc:InvoicedQuantity>
		 * Name: InvoicedQuantity;
		 * Id: BT-129;
		 * Tipo de Dados: Q - Quantity;
		 * Formato: Lista de códigos UNECERec20;
		 * Tamanho: 13 digitos e 3 casas decimais;
		 * Cardinalidade: 1..1;
		 * Designação: Quantidade, do bem ou serviço, faturada.
		 * Regras:
		 * - o valor pode ser negativo.
		 * - o montante é um numérico (13,3), respeitando o seguinte formato (regex): /^(-?\d{1,13}\.\d{2,3})$/
		 */
		InvoicedQuantityType invoicedQuantityType = invoiceLineType.addNewInvoicedQuantity();
		invoicedQuantityType.setBigDecimalValue(BigDecimal.ONE);
		invoicedQuantityType.setUnitCode("ZZ");

		/*
		 * <cbc:LineExtensionAmount>
		 * Name: LineExtensionAmount;
		 * Id: BT-131;
		 * Tipo de Dados: A - Amount;
		 * Formato: Numérico (UnitCode: lista UNECERec20);
		 * Tamanho: 13 digitos e 3 casas decimais;
		 * Cardinalidade: 1..1;
		 * Designação: Montante da linha (s/imposto).
		 *			   O valor deve incluir os respetivos encargos ou descontos aplicados à linha, desprovidos de imposto e outras taxas (que não sejam de IVA).
		 * Regras:
		 * - o valor pode ser negativo.
		 * - o montante é um numérico (13,8), respeitando o seguinte formato (regex): /^(-?\d{1,13}\.\d{2,8})$/
		 * - valor = montante do item sem imposto + montante de encargos sem imposto - montante de descontos sem imposto + outras taxas aplicáveis (s/IVA).
		 * - tolerância de 0,04€ para o documento de faturação entrar em sistema (não significa que esta tolerância seja aceite pel cliente).
		 */
		LineExtensionAmountType lineExtensionAmountType = invoiceLineType.addNewLineExtensionAmount();
		lineExtensionAmountType.setBigDecimalValue(BigDecimal.ONE);
		lineExtensionAmountType.setCurrencyID("EUR");

		createItem(invoiceLineType);
		createPrice(invoiceLineType);

	}


	/*
	 * <cac:Item>
	 * Name: Item;
	 * ID: BG-31;
	 * Tipo de Dados: CAC;
	 * Cardinalidade: 1..1;
	 * Designação: Linha do Documento de Faturação - Detalhe do Bem/Serviço;
	 */
	private void createItem(InvoiceLineType invoiceLineType) {

		ItemType itemType = invoiceLineType.addNewItem();

		/*
		 * <cbc:Name>
		 * Name: Name;
		 * Id: BT-153;
		 * Tipo de Dados: T - Text;
		 * Formato: Alfanumérico;
		 * Tamanho: 200;
		 * Cardinalidade: 1..1;
		 * Designação: Nome do item da linha do documento.
		 * Regras:
		 * - valor com o seguinte formato (regex): /^(.{1,200})$/
		 * Exemplo: valor alfanumérico com tamanho entre 1 e 200.
		 */
		NameType nameType = itemType.addNewName();
		nameType.setStringValue(DESCONHECIDO);

		/*
		 * <cac:SellersItemIdentification>
		 * Name: SellersItemIdentification;
		 * Id: BT-155;
		 * Tipo de Dados: I - Identifier;
		 * Formato: Alfanumérico;
		 * Tamanho: 50;
		 * Cardinalidade: 0..1;
		 * Designação: Código de material usado pelo fornecedor, partner number, para identificar univocamente o item da linha do documento.
		 * Regras:
		 * - valor com o seguinte formato (regex): /^(.{1,50})$/
		 * Exemplo: valor alfanumérico com tamanho entre 1 e 50.
		 */
		ItemIdentificationType itemSellersIdentificationType = itemType.addNewSellersItemIdentification();
		IDType IDType = itemSellersIdentificationType.addNewID();
		IDType.setStringValue(DESCONHECIDO);

		createTaxCategory(itemType);

	}


	/*
	 * <cac:ClassifiedTaxCategory>
	 * Name: ClassifiedTaxCategory;
	 * ID: BG-30;
	 * Tipo de Dados: CAC;
	 * Cardinalidade: 1..1;
	 * Designação: Linha do Documento de Faturação - Impostos.
	 */
	private void createTaxCategory(ItemType itemType) {

		TaxCategoryType taxCategoryType = itemType.addNewClassifiedTaxCategory();

		/*
		 * <cbc:ID>
		 * Name: ID;
		 * Id: BT-151;
		 * Tipo de Dados: C - Code;
		 * Formato: Lista de códigos UNTDID5305[6];
		 * Tamanho: -;
		 * Cardinalidade: 1..1;
		 * Designação: Código de imposto respeitante à taxa aplicada no item da linha do documento.
		 */
		IDType IDType = taxCategoryType.addNewID();
		IDType.setStringValue(DESCONHECIDO);

		/*
		 * <cbc:Percent>
		 * Name: Percent;
		 * Id: BT-152;
		 * Tipo de Dados: A - Amount;
		 * Formato: Numérico;
		 * Tamanho: 3 digitos e 2 casas decimais;
		 * Cardinalidade: 1..1;
		 * Designação: Percentagem de imposto respeitante à taxa aplicada no item da linha do documento.
		 * Regras:
		 * - o montante não pode ser negativo.
		 * - o montante é um numérico (3,2), respeitando o seguinte formato (regex): /^(\d{1,3}\.\d{2})$/
		 */
		PercentType percentType = taxCategoryType.addNewPercent();
		percentType.setBigDecimalValue(BigDecimal.ONE);

	}


	/*
	 * <cac:Price>
	 * Name: Price;
	 * ID: BG-29;
	 * Tipo de Dados: CAC;
	 * Cardinalidade: 1..1;
	 * Designação: Linha do Documento de Faturação – Preço.
	 */
	private void createPrice(InvoiceLineType invoiceLineType) {

		PriceType priceType = invoiceLineType.addNewPrice();

		/*
		 * <cbc:PriceAmount>
		 * Name: PriceAmount;
		 * Id: BT-146;
		 * Tipo de Dados: A - Amount;
		 * Formato: Numérico;
		 * Tamanho: 13 digitos e entre 2 e 8 casas decimais;
		 * Cardinalidade: 1..1;
		 * Designação: Montante do item após aplicação do desconto.
		 * Regras:
		 * Estrutura que guarda a informação de preço do item por quantidade base.
		 * A possibilidade deste montante ter até 8 casas decimais deve-se ao facto de algumas áreas de negócios,
		 * nomeadamente nas “Utilities”, ser necessário trabalhar com este grau de precisão por questões de arredondamentos.
		 * Para as restantes áreas de negócio recomenda-se o envio de apenas 2 casas decimais.
		 * - o montante não pode ser negativo.
		 * - o montante é um numérico (13,8), respeitando o seguinte formato (regex): /^(\d{1,13}\.\d{2,8})$/
		 * - valor = montante base, do preço do item da linha do documento, onde incidirá o desconto - montante do desconto sobre o preço do item da linha do documento.
		 * - tolerância de 0,04€ para o documento de faturação entrar em sistema (não significa que esta tolerância seja aceite pelo cliente).
		 */
		PriceAmountType priceAmountType = priceType.addNewPriceAmount();
		priceAmountType.setBigDecimalValue(BigDecimal.ONE);
		priceAmountType.setCurrencyID("EUR");

	}


}
