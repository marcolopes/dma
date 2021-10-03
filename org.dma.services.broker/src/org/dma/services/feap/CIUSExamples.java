/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.services.feap;

import org.dma.java.io.ByteFile;

public class CIUSExamples {

	/** Exemplo da ESPAP */
	public static final byte[] FATURA = new ByteFile("CIUS/Fatura CIUS-PT_UBL2.1_V1.0.0.xml").read();

	/** Exemplo da ESPAP */
	public static final byte[] NOTA_CREDITO = new ByteFile("CIUS/Nota de Credito CIUS-PT_UBL2.1_V1.0.0.xml").read();

}

