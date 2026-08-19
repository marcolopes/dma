/*******************************************************************************
 * Copyright 2008-2026 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.java.awt;

import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;
import java.awt.image.DataBufferDouble;
import java.awt.image.DataBufferFloat;
import java.awt.image.DataBufferInt;
import java.awt.image.DataBufferShort;
import java.awt.image.DataBufferUShort;
import java.util.Arrays;

public enum ImageDataBufferType {

	BYTE (DataBufferByte.class) {
		int hash(DataBuffer dataBuffer, int bank) {return Arrays.hashCode(((DataBufferByte)dataBuffer).getData(bank));}
	},
	USHORT (DataBufferUShort.class) {
		int hash(DataBuffer dataBuffer, int bank) {return Arrays.hashCode(((DataBufferUShort)dataBuffer).getData(bank));}
	},
	SHORT (DataBufferShort.class) {
		int hash(DataBuffer dataBuffer, int bank) {return Arrays.hashCode(((DataBufferShort)dataBuffer).getData(bank));}
	},
	INT (DataBufferInt.class) {
		int hash(DataBuffer dataBuffer, int bank) {return Arrays.hashCode(((DataBufferInt)dataBuffer).getData(bank));}
	},
	FLOAT (DataBufferFloat.class) {
		int hash(DataBuffer dataBuffer, int bank) {return Arrays.hashCode(((DataBufferFloat)dataBuffer).getData(bank));}
	},
	DOUBLE (DataBufferDouble.class) {
		int hash(DataBuffer dataBuffer, int bank) {return Arrays.hashCode(((DataBufferDouble)dataBuffer).getData(bank));}
	};

	abstract int hash(DataBuffer dataBuffer, int bank);

	private final Class<? extends DataBuffer> klass;

	ImageDataBufferType(Class<? extends DataBuffer> klass) {
		this.klass=klass;
	}

	public static int hashCode(DataBuffer dataBuffer) {
		int h=1;
		int numBanks=dataBuffer.getNumBanks();
		for(ImageDataBufferType type: values()){
			if (type.klass.isInstance(dataBuffer)){
				for(int bank=0; bank<numBanks; bank++){
					h=31*h+type.hash(dataBuffer, bank);
				}return h;
			}
		}
		int size=dataBuffer.getSize();
		for(int bank=0; bank<numBanks; bank++){
			for(int i=0; i<size; i++){
				h=31*h+dataBuffer.getElem(bank, i);
			}
		}return h;
	}

}