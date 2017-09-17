package cn.itcast_03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo {
	public static void main(String[] args) {
		String s="2014-11-20";
		SimpleDateFormat ad=new SimpleDateFormat("yyyy-mm-dd");
		try {
			Date d=ad.parse(s);
			System.out.println(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
}
