package cn.itcast_05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MyBirthday {
	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Year,Month,Day:");
		String line=sc.nextLine();
		
		SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
		Date d=s.parse(line);
		
		long mytime=d.getTime();
		long nowtime=System.currentTimeMillis();
		long time=nowtime-mytime;
		long day=(time/1000/60/60/24);
		System.out.println(day+"day");
		
	}
}
