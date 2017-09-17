package cn.itcast_02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImageDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("happy.jpg");
		FileInputStream fis=new FileInputStream("e:\\happy.jpg");
	
		int b=0;
		while((b=fis.read())!=-1){
			fos.write(b);
		}
		
		fos.close();
		fis.close();
	}
}
