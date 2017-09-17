package cn.itcast_03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr=new InputStreamReader(new FileInputStream("StringDemo.java"));
		
//		int ch=0;
//		while((ch=isr.read())!=-1){
//			System.out.print((char)ch);
//		}
		
		char[] ch=new char[1024];
		int len=0;
		while((len=isr.read(ch))!=-1){
			System.out.print(new String(ch));
		}
		
		isr.close();
		
	}
}
