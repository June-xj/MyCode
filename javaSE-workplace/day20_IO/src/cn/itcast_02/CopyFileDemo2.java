package cn.itcast_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo2 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("e:\\a.txt");
		FileInputStream fis=new FileInputStream("b.txt");
	
		int b=0;
		while((b=fis.read())!=-1){
			fos.write(b);
		}
		
		fos.close();
		fis.close();
	
	}
}
