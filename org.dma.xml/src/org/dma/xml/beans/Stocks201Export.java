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
import java.util.Calendar;

import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlOptions;

import org.dma.java.io.CustomFile;
import org.dma.java.io.FileParameters;
import org.dma.java.io.Folder;
import org.dma.java.util.TimeDateUtils;
import org.dma.xml.IXMLExport;

import stockFilePT201.ProductCategoryDocument.ProductCategory;
import stockFilePT201.StockDocument.Stock;
import stockFilePT201.StockFileDocument;
import stockFilePT201.StockFileDocument.StockFile;
import stockFilePT201.StockHeaderDocument.StockHeader;

/*
 * Empresas sem existencias
 *
 * As empresas sem existencias e obrigadas por a lei a comunicar o Inventario,
 * declararao no portal e-fatura que nao tem existencias.
 * Nao precisam, portanto, de construir ficheiro vazio.
 *
 * Artigos fora de stock
 *
 * Os artigos que na data do inventario nao existem em stock (ex: esgotados)
 * nao devem constar dos ficheiros que sao comunicados a AT.
 *
 * Dispensa
 *
 * Estao dispensadas de efetuar a comunicacao dos inventarios as empresas
 * com um volume de negocios do exercicio anterior ao da comunicacao
 * que nao exceda €100 000.
 */
public class Stocks201Export implements IXMLExport {

	public static final String VERSAO = "2_01";

	public static final String NIF = "999999990";

	/*
	 * Este ficheiro devera conter as seguintes tabelas:
	 *
	 * 1 - Cabecalho (StockHeader)
	 * 2 - Tabela de Inventario (Stock)
	 */
	private final StockFileDocument stockFileDocument=StockFileDocument.Factory.newInstance();
	private final StockFile stockFile=stockFileDocument.addNewStockFile();
	private final StockHeader header=stockFile.addNewStockHeader();

	private final Calendar endDate;

	public Stocks201Export(Calendar endDate) {
		this.endDate=endDate;
	}

	public FileParameters getFileParameters(Folder folder) {
		String prefix = NIF + "_STOCKS_" + TimeDateUtils.getDateFormatted(endDate, "yyyy-MM-dd");
		return new FileParameters(prefix, "xml", folder);
	}

	@Override
	public boolean save(File file) {

		if (!file.isDirectory()) try{

			XmlOptions options=new XmlOptions();
			options.setSavePrettyPrint();
			options.setUseDefaultNamespace();
			options.setCharacterEncoding(CustomFile.UTF8_CHARSET.name());

			stockFileDocument.save(file, options);

		}catch(Exception e){
			e.printStackTrace();
		}else return save(getFileParameters(new Folder(file)).toFile());

		return false;

	}

	@Override
	public boolean isEmpty() {
		return stockFile.getStockList().isEmpty();
	}

	@Override
	public boolean isValid() {
		return stockFile.validate();
	}


	public void process() {

		XmlCursor cursor=stockFile.newCursor();
		cursor.toFirstContentToken();
		cursor.insertNamespace("xsi", "http://www.w3.org/2001/XMLSchema-instance");
		cursor.dispose();

		createHeader();
		createStock();

	}

	private void createHeader() {

		header.setFileVersion(VERSAO);

		header.setTaxRegistrationNumber(Integer.valueOf(NIF));
		/*
		 * Ano a que se refere o Inventario,
		 * utilizando as regras do Codigo do IRC,
		 * no caso de periodos contabilisticos nao coincidentes com o ano civil
		 */
		header.setFiscalYear(TimeDateUtils.getYear(endDate));
		/*
		 * Data do Inventario
		 * Data de referencia do inventario.
		 * Correspondente ao fim do periodo de tributacao.
		 */
		header.setEndDate(TimeDateUtils.getCalendarWithoutTimezone(endDate));

		header.setNoStock(false);

	}


	private void createStock() {

		Stock stock=stockFile.addNewStock();
		/*
		 * Tipo (ProductCategory)
		 * TEXTO 1
		 * Identificador do tipo de produto.
		 */
		stock.setProductCategory(ProductCategory.M);

		/*
		 * Identificador do Produto (ProductCode)
		 * TEXTO 60
		 * Codigo unico do produto na lista de produtos,
		 * que so devera aparecer uma vez em cada ficheiro.
		 * Este codigo devera corresponder ao mesmo codigo utilizado
		 * no ficheiro SAF-T (PT) da faturacao, quando aplicavel.
		 * No caso de tipos de produtos nao transacionaveis e que sejam
		 * inexistentes ao nivel da tabela de Produtos do SAF-T (PT),
		 * devera garantir-se uma codificacao unica para cada produto.
		 */
		stock.setProductCode(DESCONHECIDO);

		/*
		 * Descricao (ProductDescription)
		 * TEXTO 200
		 * Descricao do produto
		 */
		stock.setProductDescription(DESCONHECIDO);

		/*
		 * Codigo do produto (ProductNumberCode)
		 * TEXTO 60
		 * Deve ser utilizado o codigo EAN (codigo de barras) do produto.
		 * Quando este nao existir, preencher com o valor do campo
		 * "Identificador do Produto"
		 */
		stock.setProductNumberCode("0");

		/*
		 * Unidade (UnitOfMeasure)
		 * TEXTO 20
		 * Unidade de medida usada (exemplo: Kg, Cm, M3, Unidades)
		 */
		stock.setUnitOfMeasure("UN");

		/*
		 * Quantidade (ClosingStockQuantity)
		 * DECIMAL
		 * Quantidade de existencia final relativa ao periodo a que reporta.
		 */
		stock.setClosingStockQuantity(BigDecimal.ONE);

		/*
		 * Valor (ClosingStockValue)
		 * DECIMAL
		 * Valor da existencia final relativa ao periodo a que reporta.
		 * (Valor total relativo a quantidade indicada.)
		 */
		stock.setClosingStockValue(BigDecimal.ONE);

	}


}