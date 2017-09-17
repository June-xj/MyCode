package cn.itcast_06;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo {
	public static void main(String[] args) {
		File file=new File("a.txt");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.getName());
		System.out.println(file.length());
		System.out.println(file.lastModified());
		
		Date d=new Date(1495879034387L);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s=sdf.format(d);
		System.out.println(s);
		
	}
}
