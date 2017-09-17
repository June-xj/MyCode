package cn.itcast_03;

import java.io.File;

public class FilePathDemo {
	public static void main(String[] args) {
		File srcFolder=new File("d:\\MyResource-20170413\\javaSE-workplace");
		getAllJavaFilePaths(srcFolder);
		
		
	}

	private static void getAllJavaFilePaths(File srcFolder) {
		File[] fileArray=srcFolder.listFiles();
		for(File file:fileArray){
			if(file.isDirectory()){
				getAllJavaFilePaths(file);
			}else{
				if(file.getName().endsWith(".java")){
					System.out.println(file.getName());
				}
			}
		}
		
	}
}
