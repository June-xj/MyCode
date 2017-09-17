package cn.itcast_03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//进行日期和字符串的格式化(format)和解析(parse)
public class DateFormatDemo {
	public static void main(String[] args) throws ParseException {
		//Date---String
		Date d=new Date();
		//默认模式
		SimpleDateFormat s=new SimpleDateFormat();
		
		String str=s.format(d);
		System.out.println(str);
		
		//给定模式:年y,月M，日d,时H，分m,秒s
		SimpleDateFormat s2=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		
		String str2=s2.format(d);
		System.out.println(str2);
		
		//String---Date
		String str3="2008-08-08 12:12:12";
		SimpleDateFormat s3=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dd=s3.parse(str3);
		System.out.println(dd);
		
		
	}
}
