package cn.itcast_04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

/*
 * 复制指定目录下的指定文件，并修改后缀名
 */
public class CopyFolderDemo {
	public static void main(String[] args) throws IOException {
		File srcFolder=new File("e:\\java");
		File destFolder=new File("e:\\jad");
		
		if(!destFolder.exists()){
			destFolder.mkdirs();
		}
		File[] fileArray=srcFolder.listFiles(new FilenameFilter(){

			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return new File(dir,name).isFile()&&name.endsWith(".java");
			}
		});
		
		for(File file:fileArray){
			String name=file.getName();
			File newFile=new File(destFolder,name);
			copyFile(file,newFile);
		}
		
		File[] destFileArray=destFolder.listFiles();
		for(File destFile:destFileArray){
			String name=destFile.getName();
			String newName=name.replace(".java", ".jad");
			File newFile=new File(destFolder,newName);
			destFile.renameTo(newFile);
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
