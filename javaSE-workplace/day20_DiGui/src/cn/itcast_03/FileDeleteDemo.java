package cn.itcast_03;

import java.io.File;
import java.io.IOException;

public class FileDeleteDemo {
	public static void main(String[] args) throws IOException {
		File srcFolder=new File("demo");
		
		srcFolder.mkdirs();
		File srcFolder1=new File("demo\\aaa");
		srcFolder1.mkdirs();
		File srcFolder3=new File("demo\\bbb");
		srcFolder3.mkdirs();
		File srcFolder2=new File("demo\\aaa\\java.txt");
		srcFolder2.createNewFile();
		File srcFolder4=new File("demo\\bbb\\javaB.txt");
		srcFolder4.createNewFile();
		deleteFolder(srcFolder);
		
	}

	private static void deleteFolder(File srcFolder) {
		File[] fileArray=srcFolder.listFiles();
		for(File file:fileArray){
			if(file.isDirectory()){
				deleteFolder(file);
			}else{
				System.out.println(file.getName()+"---"+file.delete());
			}
		}
		System.out.println(srcFolder.getName()+"---"+srcFolder.delete());
		
	}
}
