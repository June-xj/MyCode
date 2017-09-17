package cn.itcast_02;

import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		Date d=new Date();
		
		//Date得到毫秒值
		long time =d.getTime();
		System.out.println(time);
		//System.out.println(System.currentTimeMillis());
		
		System.out.println(d);
		
		//毫秒值得到Date
		d.setTime(1000);
		System.out.println(d);
	}
}
