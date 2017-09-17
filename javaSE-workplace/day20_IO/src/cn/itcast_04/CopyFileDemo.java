package cn.itcast_04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("e:\\a.txt");
		FileOutputStream fos=new FileOutputStream("d:\\b.txt");
		
		byte[] b=new byte[1024];
		int len=0;
		while((len=fis.read(b))!=-1){
			fos.write(b,0,len);
		}
		
		fos.close();
		fis.close();
	}
}
