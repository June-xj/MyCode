package cn.itcast_08;

import java.io.File;
import java.io.FilenameFilter;

public class FileDemo2 {
	public static void main(String[] args) {
		File file=new File("e:\\");
		String[] strArr=file.list(new FilenameFilter(){

			@Override
			public boolean accept(File dir, String name) {
				//return false;
				//return true;
//				File file=new File(dir,name);
//				boolean flag=file.isFile();
//				boolean flag2=name.endsWith(".jpg");
//				return flag&&flag2;
				
				return new File(dir,name).isFile()&&name.endsWith(".jpg");
				
			}
		});
		
		for(String s:strArr){
			System.out.println(s);
		}
		
		
		
	}
}
