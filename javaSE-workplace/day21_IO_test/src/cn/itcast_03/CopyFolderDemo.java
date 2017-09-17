package cn.itcast_03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 复制单级文件夹
 */
public class CopyFolderDemo {
	public static void main(String[] args) throws IOException {
		File srcFolder=new File("e:\\1111");
		File destFolder=new File("e:\\test1111");
		if(!destFolder.exists()){
			destFolder.mkdirs();
		}
		
		File[] fileArray=srcFolder.listFiles();
		for(File file:fileArray){
			String name=file.getName();
			File newFile=new File(destFolder,name);
			
			copyFile(file,newFile);
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
