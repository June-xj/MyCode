package cn.itcast_07;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		File file=new File("e:\\");
		
		String[] s=file.list();
		for(String str:s){
			System.out.println(str);
		}
		
		File[] f=file.listFiles();
		for(File fi:f){
			System.out.println(fi);
		}
		
		
	}
}
