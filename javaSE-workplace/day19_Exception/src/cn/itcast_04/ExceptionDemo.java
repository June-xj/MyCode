package cn.itcast_04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo {
	public static void main(String[] args) {
		String s="2014-11-20";
		SimpleDateFormat ad=new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		try {
			Date d=ad.parse(s);
			System.out.println(d);
		} catch (ParseException e) {
			// ParseException
			//e.printStackTrace();
//			System.out.println(e.getMessage());//Unparseable date: "2014-11-20"
//			
//			System.out.println(e.toString());//java.text.ParseException: Unparseable date: "2014-11-20"
			e.printStackTrace();
		}
		System.out.println("over");
	}
}
