package cn.itcast_03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 一次读取一个字节数组
 */
public class FileInputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("fis2.txt");
//		byte[] b=new byte[5];
//		int len=fis.read(b);
//		System.out.println(len);
//		System.out.println(new String(b));
		
		byte[] b=new byte[1024];
		int len =0;
		while((len=fis.read(b))!=-1){
			System.out.println(new String(b,0,len));
		}
		
		fis.close();
	}
}
