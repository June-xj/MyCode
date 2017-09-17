package cn.itcast_02;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		File file =new File("e:\\demo");
		System.out.println("mkdir():"+file.mkdirs());
		
		File file2=new File("e:\\demo\\a.txt");
		System.out.println(file2.createNewFile());
		
		//系统找不到指定的路径
		//要创建b.txt，必须先有test目录
//		File file3=new File("e:\\test\\b.txt");
//		System.out.println(file3.createNewFile());
		
//		File file4=new File("e:\\test\\aaa");
//		System.out.println(file4.mkdir());
//		
//		File file5=new File("e:\\test\\aaa");
//		System.out.println(file5.mkdirs());
		
		//mkdirs只能创建文件夹
		File file6=new File("e:\\ddd\\a.txt");
		System.out.println(file6.mkdirs());
		
	}
}
