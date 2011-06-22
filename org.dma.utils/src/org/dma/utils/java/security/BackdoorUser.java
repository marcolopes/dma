/*******************************************************************************
 * 2008-2010 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.security;

import java.util.Calendar;

public final class BackdoorUser {


	//Devolve MES + DIA actuais (4 digitos)
	public static String getBackdoorPassword() {

		Calendar cal=Calendar.getInstance();
		String month=String.valueOf(cal.get(Calendar.MONTH)+1);
		String day=String.valueOf(cal.get(Calendar.DAY_OF_MONTH));

		if(month.length()==1)
			month="0"+month;

		if(day.length()==1)
			day="0"+day;

		return month+day;

	}



}
