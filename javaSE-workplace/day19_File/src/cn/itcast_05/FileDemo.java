package cn.itcast_05;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		File file=new File("a.txt");
		
		System.out.println(file.isDirectory());
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.isHidden());
		
		
	}
}
