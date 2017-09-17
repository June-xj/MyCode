package cn.itcast_02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyMP4Demo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("a.mp4");
		FileInputStream fis=new FileInputStream("e:\\a.mp4");
	
		int b=0;
		while((b=fis.read())!=-1){
			fos.write(b);
		}
		
		fos.close();
		fis.close();
	}
}
