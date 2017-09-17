package cn.itcast_01;

import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar rightNow=Calendar.getInstance();
		
		int year=rightNow.get(Calendar.YEAR);
		int month=rightNow.get(Calendar.MONTH);
		int date=rightNow.get(Calendar.DATE);
		
		System.out.println(year+" "+(month+1)+" "+date);
	}
}
