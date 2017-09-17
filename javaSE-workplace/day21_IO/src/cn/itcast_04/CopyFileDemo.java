package cn.itcast_04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr=new InputStreamReader(new FileInputStream("a.txt"));
		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("b.txt"));
		
//		int ch=0;
//		while((ch=isr.read())!=-1){
//			System.out.print((char)ch);
//			osw.write(ch);
//		}
		
		char[] chs=new char[1024];
		int len=0;
		while((len=isr.read(chs))!=-1){
			//System.out.println(len);
			osw.write(chs,0,len);
		}
		
		isr.close();
		osw.close();
		
	}
}
