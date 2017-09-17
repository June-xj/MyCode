package cn.itcast_05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDemo {
	public static void main(String[] args) throws IOException {
		//write();
		read();
	}
	
	public static void read() throws IOException{
		BufferedReader br=new BufferedReader(new FileReader("bw2.txt"));
		
//		String line=br.readLine();
//		System.out.println(line);
//		line=br.readLine();
//		System.out.println(line);
		
		String line=null;
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		br.close();
		
	}
	public static void write() throws IOException{
		BufferedWriter bw=new BufferedWriter(new FileWriter("bw2.txt"));
		for(int x=0;x<10;x++){
			bw.write("hello"+x);
			//bw.write("\r\n");
			bw.newLine();
			bw.flush();
		}
		
		bw.close();
	}
}
