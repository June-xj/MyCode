package cn.itcast_07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FinallyDemo {
	public static void main(String[] args) {
		String s="201-11-20";
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		Date d=null;
		try {
			d=sdf.parse(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);;
		}finally{
			System.out.println("这里的代码是可以执行的");
		}
		System.out.println(d);
	}
}
