package cn.itcast_04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	private DateUtil(){
		
	}
	
	public static String dateToString(Date d,String format){
		return new SimpleDateFormat(format).format(d);
		
	}
	
	public static Date stringToDate(String s,String format) throws ParseException{
		return new SimpleDateFormat(format).parse(s);
	}
}
