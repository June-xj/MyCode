package cn.itcast_05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("今天天气好");
		try {
			method();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("不该有雾霾");
	}

	public static void method() throws ParseException {
		String s="2014-11-20";
		SimpleDateFormat ad=new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		Date d=ad.parse(s);
		
	}
}
