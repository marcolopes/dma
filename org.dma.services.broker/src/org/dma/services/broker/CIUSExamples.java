/*******************************************************************************
 * Copyright 2008-2021 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.services.broker;

import org.dma.java.io.ByteFile;

public class CIUSExamples {

	/** Exemplo da ESPAP */
	public static final byte[] FATURA = new ByteFile("CIUS/Fatura CIUS-PT_UBL2.1_V1.0.0.xml").read();

	/** Exemplo da ESPAP */
	public static final byte[] NOTA_CREDITO = new ByteFile("CIUS/Nota de Credito CIUS-PT_UBL2.1_V1.0.0.xml").read();

}

