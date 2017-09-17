package cn.itcast_01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("a.txt");
		
//		int b=0;
//		while((b=fis.read())!=-1){
//			System.out.print((char)b);
//		}
		
		byte[] b=new byte[1024];
		int len=0;
		while((len=fis.read(b))!=-1){
			System.out.print(new String(b,0,len));
		}
		
		fis.close();
	}
}
