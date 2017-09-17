package cn.itcast_05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new FileReader("a.txt"));
		
//		int ch=0;
//		while((ch=br.read())!=-1){
//			System.out.print((char)ch);
//		}
		
		char[] ch=new char[1024];
		int len=0;
		while((len=br.read(ch))!=-1){
			System.out.println(new String(ch,0,len));
		}
		
	}
}
