package com.dateTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateFormatting {

	public static void main(String[] args) {

		Date d=new Date();
		System.out.println("default date object : "+d);
		/*
		 *  dd - date in 2 digits 
		 *  MM - month in 2 digits   MMM - short name of month    MMMM - full month name
		 *  yy - last 2 digits of year    yyyy - year in full
		 *  EEE - day in shortname,  EEEE full day name
		 *  mm - minutes
		 *  ss - seconds
		 *  HH - 24hour
		 *  hh - 12hour
		 *  z/Z - time zone
		 *  a - am/pm
		 *  
		 */


		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy EEEE  z Z    hh:mm:ss a");
		System.out.println("formatted date : "+sdf.format(d)); //format takes date and gives formatted date as String

	}

}
