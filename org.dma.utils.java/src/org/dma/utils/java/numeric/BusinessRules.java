/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.numeric;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BusinessRules {

	public static final int SCALE = 20;

	/**
	 * Proportional value<br>
	 * Rule of three: a -> b; c -> x<br>
	 * Formula: b * c / a<br>
	 * Example: 100 -> 25, 200 -> x = 50
	 */
	public static BigDecimal getProportionalValue(BigDecimal a, BigDecimal b, BigDecimal c){

		return a.doubleValue()==0 ? BigDecimal.valueOf(0) :
			b.multiply(c).
			//AVOIDS: Non-terminating decimal expansion; no exact representable decimal result.
			divide(a,SCALE,RoundingMode.HALF_EVEN);

	}


	/**
	 * Average price (weighted)<br>
	 * Formula: (stock * price1 + entries * price2) / (stock + entries)<br>
	 * Example: 100, 10, 100, 20 = 15
	 */
	public static BigDecimal getAveragePrice(BigDecimal stock, BigDecimal price1, BigDecimal entries, BigDecimal price2) {

		return entries.doubleValue()<=0 ? price1 :
			(stock.abs().multiply(price1).add(entries.multiply(price2))).
				//AVOIDS: Non-terminating decimal expansion; no exact representable decimal result.
				divide(stock.abs().add(entries),SCALE,RoundingMode.HALF_EVEN);

	}


	/**
	 * Sale price<br>
	 * Formula: cost / (1 - (margin / 100))<br>
	 * Example: 200, 20% = 250
	 */
	public static BigDecimal getSalePrice(BigDecimal cost, BigDecimal margin){

		return cost.divide(BigDecimal.valueOf(1).subtract(margin.divide(BigDecimal.valueOf(100))),
			//AVOIDS: Non-terminating decimal expansion; no exact representable decimal result.
			SCALE,RoundingMode.HALF_EVEN);

	}


	/**
	 * Markup percentage<br>
	 * Formula: (price - cost) / cost * 100<br>
	 * Example: 200, 20 = 900%
	 */
	public static BigDecimal getMarkupPercentage(BigDecimal price, BigDecimal cost){

		return cost.doubleValue()==0 ? BigDecimal.valueOf(0) :
			(price.subtract(cost)).
			//AVOIDS: Non-terminating decimal expansion; no exact representable decimal result.
			divide(cost,SCALE,RoundingMode.HALF_EVEN).multiply(BigDecimal.valueOf(100));

	}


	/**
	 * Added percentages<br>
	 * Formula: perc1 + (100 - perc1) * (perc2 / 100)<br>
	 * Example: 60% + 50% = 80%
	 */
	public static BigDecimal getAddedPercentages(BigDecimal perc1, BigDecimal perc2){

		return perc1.add((BigDecimal.valueOf(100).subtract(perc1)).
				multiply(perc2.divide(BigDecimal.valueOf(100))));

	}


	/**
	 * Added percentages<br>
	 * Formula: <br>
	 * Example: 60% + 50% + 40% = 88%
	 */
	public static BigDecimal getAddedPercentages(BigDecimal...perc){

		BigDecimal result=BigDecimal.valueOf(0);
		BigDecimal total=BigDecimal.valueOf(100);

		for(int i=0; i<perc.length; i++){
			BigDecimal value=getPercentageValue(total, perc[i]);
			result=result.add(value);
			total=total.subtract(value);
		}

		return result;
	}


	/**
	 * Value percentage<br>
	 * Formula: value * 100 / total<br>
	 * Example: 200, 20 = 10%
	 */
	public static BigDecimal getValuePercentage(BigDecimal total, BigDecimal value){

		return total.doubleValue()==0 ? BigDecimal.valueOf(0) :
			value.multiply(BigDecimal.valueOf(100)).
			//AVOIDS: Non-terminating decimal expansion; no exact representable decimal result.
			divide(total,SCALE,RoundingMode.HALF_EVEN);

	}


	/**
	 * Percentage value<br>
	 * Formula: total * perc / 100<br>
	 * Example: 200, 20% = 40
	 */
	public static BigDecimal getPercentageValue(BigDecimal total, BigDecimal perc){

		return total.multiply(perc).divide(BigDecimal.valueOf(100));

	}


	/**
	 * Value with included percentage<br>
	 * Formula: value / (1 + (perc / 100))<br>
	 * Example: 240, 20% = 200
	 */
	public static BigDecimal getValueIncluded(BigDecimal value, BigDecimal perc){

		return perc.doubleValue()==100 ? BigDecimal.valueOf(0) :
			value.divide(BigDecimal.valueOf(1).subtract(perc.divide(BigDecimal.valueOf(100))),
			//AVOIDS: Non-terminating decimal expansion; no exact representable decimal result.
			SCALE,RoundingMode.HALF_EVEN);

	}


	/**
	 * Value without included percentage<br>
	 * Formula: value / (1 + (perc / 100))<br>
	 * Example: 240, 20% = 200
	 */
	public static BigDecimal getValueExcluded(BigDecimal value, BigDecimal perc){

		return value.divide(BigDecimal.valueOf(1).add(perc.divide(BigDecimal.valueOf(100))),
			//AVOIDS: Non-terminating decimal expansion; no exact representable decimal result.
			SCALE,RoundingMode.HALF_EVEN);

	}


	/**
	 * Value added by the percentage<br>
	 * Formula: value + (value * perc / 100)<br>
	 * Example: 200, 20% = 240
	 */
	public static BigDecimal getValueAdded(BigDecimal value, BigDecimal perc){

		return value.add(getPercentageValue(value, perc));

	}


	/**
	 * Value reduced by the percentage<br>
	 * Formula: value - (value * perc / 100)<br>
	 * Example: 200, 20% = 160
	 */
	public static BigDecimal getNetValue(BigDecimal value, BigDecimal perc){

		return value.subtract(getPercentageValue(value, perc));

	}


	/**
	 * Rounds the number to the nearest<br>
	 * Numbers can be with or without decimals<br>
	 */
	public static BigDecimal round(BigDecimal value, BigDecimal rounding, RoundingMode roundingMode){

		return rounding.doubleValue()==0 ? value :
			(value.divide(rounding,0,roundingMode)).multiply(rounding);

	}


	/**
	 * Rounds the number to the nearest<br>
	 * Numbers can be with or without decimals<br>
	 * Example: 5, 10 = 10
	 *<p>
	 * HALF_UP<br>
	 * Rounding mode to round towards "nearest neighbor" unless
	 * both neighbors are equidistant, in which case round up.
	 * Behaves as for RoundingMode.UP if the discarded fraction is >= 0.5;
	 * otherwise, behaves as for RoundingMode.DOWN.
	 * Note that this is the rounding mode commonly taught at school.
	 */
	public static BigDecimal roundUp(BigDecimal value, BigDecimal rounding){

		return round(value,rounding,RoundingMode.HALF_UP);

	}


	/**
	 * Rounds the number to the nearest<br>
	 * Numbers can be with or without decimals<br>
	 * Example: 5, 10 = 0
	 *<p>
	 * HALF_DOWN<br>
	 * Rounding mode to round towards "nearest neighbor" unless
	 * both neighbors are equidistant, in which case round down.
	 * Behaves as for RoundingMode.UP if the discarded fraction is > 0.5;
	 * otherwise, behaves as for RoundingMode.DOWN.
	 */
	public static BigDecimal roundDown(BigDecimal value, BigDecimal rounding){

		return round(value,rounding,RoundingMode.HALF_DOWN);

	}


	public static void main(String[] argvs){

		System.out.println("Proportional Value (50): "+getProportionalValue(new BigDecimal("100"), new BigDecimal("25"), new BigDecimal("200")));
		System.out.println("Average Price (15): "+getAveragePrice(new BigDecimal("100"), new BigDecimal("10"), new BigDecimal("100"), new BigDecimal("20")));
		System.out.println("Sale Price (250): "+getSalePrice(new BigDecimal("200"), new BigDecimal("20")));
		System.out.println("Markup Percentage (900%): "+getMarkupPercentage(new BigDecimal("200"), new BigDecimal("20")));
		System.out.println("Added Percentages (80%): "+getAddedPercentages(new BigDecimal("60"), new BigDecimal("50")));
		System.out.println("Added Percentages (88%): "+getAddedPercentages(new BigDecimal("60"), new BigDecimal(50), new BigDecimal("40")));
		System.out.println("Value Percentage (10%): "+getValuePercentage(new BigDecimal("200"), new BigDecimal("20")));
		System.out.println("Percentage Value (40): "+getPercentageValue(new BigDecimal("200"), new BigDecimal("20")));
		System.out.println("Value Included (250): "+getValueIncluded(new BigDecimal("200"), new BigDecimal("20")));
		System.out.println("Value Excluded (200): "+getValueExcluded(new BigDecimal("240"), new BigDecimal("20")));
		System.out.println("Value Added (240): "+getValueAdded(new BigDecimal("200"), new BigDecimal("20")));
		System.out.println("Net Value (160): "+getNetValue(new BigDecimal("200"), new BigDecimal("20")));
		System.out.println("round Up (10): "+roundUp(new BigDecimal("5.0"), new BigDecimal("10.0")));
		System.out.println("round Down (0): "+roundDown(new BigDecimal("5.0"), new BigDecimal("10.0")));

		//DIVISION by ZERO test
		getProportionalValue(new BigDecimal(0), new BigDecimal(0), new BigDecimal(0));
		getAveragePrice(new BigDecimal(0), new BigDecimal(0), new BigDecimal(0), new BigDecimal(0));
		getSalePrice(new BigDecimal(0), new BigDecimal(0));
		getMarkupPercentage(new BigDecimal(0), new BigDecimal(0));
		getAddedPercentages(new BigDecimal(0), new BigDecimal(0));
		getAddedPercentages(new BigDecimal(0));
		getValuePercentage(new BigDecimal(0), new BigDecimal(0));
		getPercentageValue(new BigDecimal(0), new BigDecimal(0));
		getValueIncluded(new BigDecimal(0), new BigDecimal(100));
		getValueExcluded(new BigDecimal(0), new BigDecimal(0));
		getValueAdded(new BigDecimal(0), new BigDecimal(0));
		getNetValue(new BigDecimal(0), new BigDecimal(0));
		roundUp(new BigDecimal(0), new BigDecimal(0));
		roundDown(new BigDecimal(0), new BigDecimal(0));

		System.out.println(new BigDecimal(1.005));
		System.out.println(new BigDecimal(0.01));
		System.out.println(new BigDecimal("1.005"));
		System.out.println(new BigDecimal("0.01"));

		BigDecimal value=new BigDecimal("1.005");
		BigDecimal rounding=new BigDecimal("0.01");
		System.out.println(value.divide(rounding,0,RoundingMode.HALF_UP).multiply(rounding));
		System.out.println(value.divide(rounding,0,RoundingMode.HALF_DOWN).multiply(rounding));
		System.out.println(new BigDecimal("1.005").setScale(2, RoundingMode.HALF_UP));
		System.out.println(new BigDecimal("1.005").setScale(2, RoundingMode.HALF_DOWN));

	}

}