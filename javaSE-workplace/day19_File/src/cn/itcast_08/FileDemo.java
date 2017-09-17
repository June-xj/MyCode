package cn.itcast_08;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		File file=new File("e:\\");
		File[] fileArr=file.listFiles();
		for(File f:fileArr){
			if(f.isFile()){
				if(f.getName().endsWith(".jpg")){
					System.out.println(f.getName());
				}
			}
		}
		
		
	}
}
