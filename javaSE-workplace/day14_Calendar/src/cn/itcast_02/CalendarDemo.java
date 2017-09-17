package cn.itcast_02;

import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH);
		int date=c.get(Calendar.DATE);
		System.out.println(year+" "+(month+1)+" "+date);
		
		//三年前今天
//		c.add(Calendar.YEAR, -3);
//		year=c.get(Calendar.YEAR);
//		month=c.get(Calendar.MONTH);
//		date=c.get(Calendar.DATE);
//		System.out.println(year+" "+(month+1)+" "+date);
		
		//五年后十天前
		c.add(Calendar.YEAR, 5);
		c.add(Calendar.DATE, -10);
		year=c.get(Calendar.YEAR);
		month=c.get(Calendar.MONTH);
		date=c.get(Calendar.DATE);
		System.out.println(year+" "+(month+1)+" "+date);
		System.out.println("-----------------------");
		
		c.set(2011,11,11);
		year=c.get(Calendar.YEAR);
		month=c.get(Calendar.MONTH);
		date=c.get(Calendar.DATE);
		System.out.println(year+" "+(month+1)+" "+date);
		
		
	}
}
