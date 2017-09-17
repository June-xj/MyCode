package cn.itcast_05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFoldersDemo {
	public static void main(String[] args) throws IOException {
		File srcFolder=new File("E:\\study\\java\\javaBasicVedio\\day21\\code\\demos");
		File destFolder=new File("e:\\");
		
		copyFolder(srcFolder,destFolder);
		
	}

	private static void copyFolder(File srcFile, File destFile) throws IOException {
		if(srcFile.isDirectory()){
			File newFolder=new File(destFile,srcFile.getName());
			newFolder.mkdir();
			File[] fileArray=srcFile.listFiles();
			
			for(File file:fileArray){
				copyFolder(file,newFolder);
			}
			
		}else{
			File newFile=new File(destFile,srcFile.getName());
			copyFile(srcFile,newFile);
		}
	}
	
	private static void copyFile(File file, File newFile) throws IOException {
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(newFile));
		
		byte[] b=new byte[1024];
		int len=0;
		while((len=bis.read(b))!=-1){
			bos.write(b,0,len);
		}
		
		bis.close();
		bos.close();
	}
}
