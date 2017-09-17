package cn.itcast_01;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		//三种方式效果一样
		File file=new File("E:\\demo\\a.txt");
		File file2=new File("E:\\demo","a.txt");
		File file3=new File("e:\\demo");
		File file4=new File(file3,"a.txt");
		
		
	}
}
