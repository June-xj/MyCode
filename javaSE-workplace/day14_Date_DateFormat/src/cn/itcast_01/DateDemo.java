package cn.itcast_01;

import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);
		
		//long time =System.currentTimeMillis();
		long time =1000*60*60;
		Date d2=new Date(time);
		System.out.println(d2);
	}
}
