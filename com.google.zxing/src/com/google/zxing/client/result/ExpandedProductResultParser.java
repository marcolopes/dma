/*
 * Copyright (C) 2010 ZXing authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * These authors would like to acknowledge the Spanish Ministry of Industry,
 * Tourism and Trade, for the support in the project TSI020301-2008-2
 * "PIRAmIDE: Personalizable Interactions with Resources on AmI-enabled
 * Mobile Dynamic Environments", led by Treelogic
 * ( http://www.treelogic.com/ ):
 *
 *   http://www.piramidepse.com/
 */

package com.google.zxing.client.result;

import java.util.HashMap;
import java.util.Map;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;

/**
 * Parses strings of digits that represent a RSS Extended code.
 * 
 * @author Antonio Manuel Benjumea Conde, Servinform, S.A.
 * @author Agustín Delgado, Servinform, S.A.
 */
public final class ExpandedProductResultParser extends ResultParser {

  @Override
  public ExpandedProductParsedResult parse(Result result) {
    BarcodeFormat format = result.getBarcodeFormat();
    if (format != BarcodeFormat.RSS_EXPANDED) {
      // ExtendedProductParsedResult NOT created. Not a RSS Expanded barcode
      return null;
    }
    String rawText = getMassagedText(result);

    String productID = null;
    String sscc = null;
    String lotNumber = null;
    String productionDate = null;
    String packagingDate = null;
    String bestBeforeDate = null;
    String expirationDate = null;
    String weight = null;
    String weightType = null;
    String weightIncrement = null;
    String price = null;
    String priceIncrement = null;
    String priceCurrency = null;
    Map<String,String> uncommonAIs = new HashMap<String, String>();

    int i = 0;

    while (i < rawText.length()) {
      String ai = findAIvalue(i, rawText);
      if (ai == null) {
        // Error. Code doesn't match with RSS expanded pattern
        // ExtendedProductParsedResult NOT created. Not match with RSS Expanded pattern
        return null;
      }
      i += ai.length() + 2;
      String value = findValue(i, rawText);
      i += value.length();

        if (ai == "00") {
            sscc = value;
        } else if (ai == "01") {
            productID = value;
        } else if (ai == "10") {
            lotNumber = value;
        } else if (ai == "11") {
            productionDate = value;
        } else if (ai == "13") {
            packagingDate = value;
        } else if (ai == "15") {
            bestBeforeDate = value;
        } else if (ai == "17") {
            expirationDate = value;
        } else if (ai == "3100" || ai == "3101" || ai == "3102" || ai == "3103"
                || ai == "3104" || ai == "3105" || ai == "3106" || ai == "3107"
                || ai == "3108" || ai == "3109") {
            weight = value;
            weightType = ExpandedProductParsedResult.KILOGRAM;
            weightIncrement = ai.substring(3);
        } else if (ai == "3200" || ai == "3201" || ai == "3202" || ai == "3203"
                || ai == "3204" || ai == "3205" || ai == "3206" || ai == "3207"
                || ai == "3208" || ai == "3209") {
            weight = value;
            weightType = ExpandedProductParsedResult.POUND;
            weightIncrement = ai.substring(3);
        } else if (ai == "3920" || ai == "3921" || ai == "3922" || ai == "3923") {
            price = value;
            priceIncrement = ai.substring(3);
        } else if (ai == "3930" || ai == "3931" || ai == "3932" || ai == "3933") {
            if (value.length() < 4) {
            // The value must have more of 3 symbols (3 for currency and
                // 1 at least for the price)
                // ExtendedProductParsedResult NOT created. Not match with RSS Expanded pattern
                return null;
            }
            price = value.substring(3);
            priceCurrency = value.substring(0, 3);
            priceIncrement = ai.substring(3);
        } else {
            // No match with common AIs
            uncommonAIs.put(ai, value);
        }
    }

    return new ExpandedProductParsedResult(rawText,
                                           productID,
                                           sscc,
                                           lotNumber,
                                           productionDate,
                                           packagingDate,
                                           bestBeforeDate,
                                           expirationDate,
                                           weight,
                                           weightType,
                                           weightIncrement,
                                           price,
                                           priceIncrement,
                                           priceCurrency,
                                           uncommonAIs);
  }

  private static String findAIvalue(int i, String rawText) {
    char c = rawText.charAt(i);
    // First character must be a open parenthesis.If not, ERROR
    if (c != '(') {
      return null;
    }

    CharSequence rawTextAux = rawText.substring(i + 1);

    StringBuilder buf = new StringBuilder();
    for (int index = 0; index < rawTextAux.length(); index++) {
      char currentChar = rawTextAux.charAt(index);
      if (currentChar == ')') {
        return buf.toString();
      } else if (currentChar >= '0' && currentChar <= '9') {
        buf.append(currentChar);
      } else {
        return null;
      }
    }
    return buf.toString();
  }

  private static String findValue(int i, String rawText) {
    StringBuilder buf = new StringBuilder();
    String rawTextAux = rawText.substring(i);

    for (int index = 0; index < rawTextAux.length(); index++) {
      char c = rawTextAux.charAt(index);
      if (c == '(') {
        // We look for a new AI. If it doesn't exist (ERROR), we coninue
        // with the iteration
        if (findAIvalue(index, rawTextAux) == null) {
          buf.append('(');
        } else {
          break;
        }
      } else {
        buf.append(c);
      }
    }
    return buf.toString();
  }
}
