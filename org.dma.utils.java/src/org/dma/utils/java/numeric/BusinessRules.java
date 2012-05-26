/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.numeric;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BusinessRules {

	/**
	 * Rounds the number to the nearest<br>
	 * Numbers can be with or without decimals<br>
	 * Example: 123.56, 2.50 = 122.50
	 *
	 */
	public static BigDecimal round(BigDecimal value, BigDecimal rounding){
		/*
		 * HALF_UP
		 * Rounding mode to round towards "nearest neighbor" unless both neighbors are equidistant,
		 * in which case round up.
		 * Behaves as for RoundingMode.UP if the discarded fraction is >= 0.5;
		 * otherwise, behaves as for RoundingMode.DOWN.
		 * Note that this is the rounding mode commonly taught at school.
		 */
		return rounding.doubleValue()==0 ? value :
			(value.divide(rounding,0,RoundingMode.HALF_UP)).multiply(rounding);

	}


	/**
	 * Proportional Value<br>
	 * Rule of three: a -> b; c -> x<br>
	 * Formula: b * c / a<br>
	 * Example: 100 -> 25, 200 -> x = 50
	 *
	 */
	public static BigDecimal getProportionalValue(BigDecimal a, BigDecimal b, BigDecimal c){

		return a.doubleValue()==0 ? BigDecimal.valueOf(0) :
			b.multiply(c).
			//AVOIDS: Non-terminating decimal expansion; no exact representable decimal result.
			divide(a,RoundingMode.HALF_EVEN);

	}


	/**
	 * Weighted Average Price<br>
	 * Formula: (stock * price1 + entries * price2) / (stock + entries)<br>
	 * Example: 100, 10, 100, 20 = 15
	 *
	 */
	public static BigDecimal getWeightedAveragePrice(BigDecimal stock, BigDecimal price1, BigDecimal entries, BigDecimal price2) {

		return entries.doubleValue()<=0 ? price1 :
			(stock.abs().multiply(price1).add(entries.multiply(price2))).
				//AVOIDS: Non-terminating decimal expansion; no exact representable decimal result.
				divide(stock.abs().add(entries),RoundingMode.HALF_EVEN);

	}


	/**
	 * Final Percentage<br>
	 * Formula: perc1 + (100 - perc1) * (perc2 / 100)<br>
	 * Example: 50% + 25% = 62,5%
	 *
	 */
	public static BigDecimal getFinalPercentage(BigDecimal perc1, BigDecimal perc2){

		return perc1.add((BigDecimal.valueOf(100).subtract(perc1)).
				multiply(perc2.divide(BigDecimal.valueOf(100))));

	}


	/**
	 * Profit Percentage<br>
	 * Formula: (price1 - price2) / price2 * 100<br>
	 * Example: 200, 10 = 1900%
	 */
	public static BigDecimal getProfitPercentage(BigDecimal price1, BigDecimal price2){

		return price2.doubleValue()==0 ? BigDecimal.valueOf(0) :
			(price1.subtract(price2)).
			//AVOIDS: Non-terminating decimal expansion; no exact representable decimal result.
			divide(price2,RoundingMode.HALF_EVEN).multiply(BigDecimal.valueOf(100));

	}


	/**
	 * Value Percentage<br>
	 * Formula: value * 100 / total<br>
	 * Example: 200, 10 = 5%
	 *
	 */
	public static BigDecimal getValuePercentage(BigDecimal total, BigDecimal value){

		return total.doubleValue()==0 ? BigDecimal.valueOf(0) :
			value.multiply(BigDecimal.valueOf(100)).
			//AVOIDS: Non-terminating decimal expansion; no exact representable decimal result.
			divide(total,RoundingMode.HALF_EVEN);

	}


	/**
	 * Percentage Value<br>
	 * Formula: value * perc / 100<br>
	 * Example: 200, 10% = 20
	 *
	 */
	public static BigDecimal getPercentageValue(BigDecimal value, BigDecimal perc){

		return value.multiply(perc).divide(BigDecimal.valueOf(100));

	}


	/**
	 * Value reduced of the included percentage<br>
	 * Formula: value / ( perc / 100 + 1)<br>
	 * Example: 220, 10% = 200
	 *
	 */
	public static BigDecimal getReducedValue(BigDecimal value, BigDecimal perc){

		return value.
			divide(perc.divide(BigDecimal.valueOf(100)).add(BigDecimal.valueOf(1)),
				//AVOIDS: Non-terminating decimal expansion; no exact representable decimal result.
				RoundingMode.HALF_EVEN);

	}


	/**
	 * Value reduced by the percentage<br>
	 * Formula: value - (value * perc / 100)<br>
	 * Example: 200, 10% = 180
	 *
	 */
	public static BigDecimal getNetValue(BigDecimal value, BigDecimal perc){

		return value.subtract(getPercentageValue(value, perc));

	}


	/**
	 * Value added by the percentage<br>
	 * Formula: value + (value * perc / 100)<br>
	 * Example: 200, 10% = 220
	 *
	 */
	public static BigDecimal getValueAdded(BigDecimal value, BigDecimal perc){

		return value.add(getPercentageValue(value, perc));

	}


	public static void main(String[] argvs){

		System.out.println("round (122.5): "+round(new BigDecimal(123.56), new BigDecimal(2.50)));
		System.out.println("Proportional Value (50): "+getProportionalValue(new BigDecimal(100), new BigDecimal(25), new BigDecimal(200)));
		System.out.println("Weighted Average Price (15): "+getWeightedAveragePrice(new BigDecimal(100), new BigDecimal(10), new BigDecimal(100), new BigDecimal(20)));
		System.out.println("Final Percentage (62.5%): "+getFinalPercentage(new BigDecimal(50), new BigDecimal(25)));
		System.out.println("Profit Percentage (1900%): "+getProfitPercentage(new BigDecimal(200), new BigDecimal(10)));
		System.out.println("Value Percentage (5%): "+getValuePercentage(new BigDecimal(200), new BigDecimal(10)));
		System.out.println("Percentage Value (20): "+getPercentageValue(new BigDecimal(200), new BigDecimal(10)));
		System.out.println("Reduced Value (200): "+getReducedValue(new BigDecimal(220), new BigDecimal(10)));
		System.out.println("Net Value (180): "+getNetValue(new BigDecimal(200), new BigDecimal(10)));
		System.out.println("Value Added (220): "+getValueAdded(new BigDecimal(200), new BigDecimal(10)));

		//DIVISION by ZERO test
		round(new BigDecimal(0), new BigDecimal(0));
		getProportionalValue(new BigDecimal(0), new BigDecimal(0), new BigDecimal(0));
		getWeightedAveragePrice(new BigDecimal(0), new BigDecimal(0), new BigDecimal(0), new BigDecimal(0));
		getFinalPercentage(new BigDecimal(0), new BigDecimal(0));
		getProfitPercentage(new BigDecimal(0), new BigDecimal(0));
		getValuePercentage(new BigDecimal(0), new BigDecimal(0));
		getPercentageValue(new BigDecimal(0), new BigDecimal(0));
		getReducedValue(new BigDecimal(0), new BigDecimal(0));
		getNetValue(new BigDecimal(0), new BigDecimal(0));
		getValueAdded(new BigDecimal(0), new BigDecimal(0));

	}

}
