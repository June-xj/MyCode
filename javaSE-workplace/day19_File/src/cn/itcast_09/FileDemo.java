package cn.itcast_09;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		File file=new File("e://");
		
		File[] fileArr=file.listFiles();
		for(File f:fileArr){
			//System.out.println(f);
			String name=f.getName();
			int sta=name.indexOf("_");
			
			
		}
		
		
	}
}
