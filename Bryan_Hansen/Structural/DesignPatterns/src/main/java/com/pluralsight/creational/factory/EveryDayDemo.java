package com.pluralsight.creational.factory;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class EveryDayDemo {

	public static void main(String[] args) {
//		Calendar cal = Calendar.getInstance();
		Calendar cal = Calendar.getInstance(Locale.CANADA);
		
		System.out.println(cal);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	}

}
